#!/usr/bin/env bash

# 项目根目录
basepath=$(cd `dirname $0`; pwd)/..

# 进入manual目录
cd ${basepath}/manual
mysql -uroot -p < ./initial_db.sql
