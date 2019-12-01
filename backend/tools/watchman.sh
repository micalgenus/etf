#!/usr/bin/env sh

./gradlew build

echo 'Watching file in src/**/*'

(
while :;
do
  if [ ! -z $(find ./src -mtime -0.00004) ]; then
    ./gradlew build -x test -x checkstyleMain ;
  fi;
  sleep 1;
done
) & ./tools/dev.sh