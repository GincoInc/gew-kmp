#!/bin/bash

if [ -d "./gen/python/gincoinc/adamant/global" ]; then
    mv ./gen/python/gincoinc/adamant/global ./gen/python/gincoinc/adamant/global_
    echo "Directory renamed from 'global' to 'global_'"
else
    echo "Directory './gen/python/gincoinc/adamant/global' does not exist"
fi
find ./gen/python/gincoinc/adamant/ -type f -name "*.py" | while read -r file; do
    sed -i '' 's/gincoinc\.adamant\.global\.v1/gincoinc\.adamant\.global_\.v1/g' "$file"
done
echo "Replacement of 'gincoinc.adamant.global.v1' with 'gincoinc.adamant.global_.v1' completed"
