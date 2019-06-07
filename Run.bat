@echo off

:: check javac present
javac -version 2>nul
if errorlevel 1 (
    echo build: javac not found!
    echo.
    pause
    exit %errorlevel%
)

set OLD_PATH=%cd%

set CURRENT_DIR_PATH=%~dp0
set CURRENT_DIR_PATH=%CURRENT_DIR_PATH:~0,-1%
for %%a in ("%CURRENT_DIR_PATH%") do set PROJECT_NAME=%%~na

set OUT_DIR_NAME=out
set OUT_PROJECT_PATH=%OUT_DIR_NAME%\%PROJECT_NAME%
set OUT_BIN_PATH=%OUT_PROJECT_PATH%\bin
set OUT_JRE_PATH=%OUT_PROJECT_PATH%\jre
set OUT_LIB_PATH=%OUT_PROJECT_PATH%\lib

set PACKAGE_NAME=sample
set MAIN_JAVA_NAME=Main
set MAIN_JAVA_PATH=src\%PACKAGE_NAME%\%MAIN_JAVA_NAME%.java


:: compile
javac -Xlint:unchecked -sourcepath src -encoding UTF-8 "%MAIN_JAVA_PATH%" -d Doc
cd doc
java sample.Main
@echo off