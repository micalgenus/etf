#!/usr/bin/env bash

if [ ! -f "./keystore.p12" ]; then 
echo "changeit
changeit




yes
" | keytool -genkey -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore keystore.p12 -validity 36504 1>/dev/null
fi

./gradlew bootRun -Pdev -t -x test -x checkstyleMain
