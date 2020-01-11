#!/usr/bin/env bash

CHECK="do while"

while [[ ! -z $CHECK ]]; do
    PORT=$(( ( RANDOM % 30000 )  + 30000 ))
    CHECK=$(netstat -ant | sed -e '/^tcp/ !d' -e 's/^[^ ]* *[^ ]* *[^ ]* *.*[\.:]\([0-9]*\) .*$/\1/' | sort -g | uniq | grep $PORT)
done

echo $PORT