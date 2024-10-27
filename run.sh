#!/bin/bash
cd "$(
  cd "$(dirname "$0")" >/dev/null 2>&1
  pwd -P
)/" || exit
set -e

export DUMP_PATH=/d/dump/

if [ -d $DUMP_PATH ]; then
  rm -rf $DUMP_PATH
fi

mkdir $DUMP_PATH

java -Xms10m -Xmx10m \
  -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=$DUMP_PATH \
  -jar target/hello-mat.jar