#!/bin/bash

if [ -d "./gen/python/gincoinc/adamant/global" ]; then
    mv ./gen/python/gincoinc/adamant/global ./gen/python/gincoinc/adamant/global_
    mv ./gen/python/gincoinc/global ./gen/python/gincoinc/global_
    echo "Directory renamed from 'global' to 'global_'"
else
    echo "Directory './gen/python/gincoinc/adamant/global' does not exist"
fi

if [[ "$OSTYPE" == "darwin"* ]]; then
    # macOS
    find ./gen/python/gincoinc/ -type f -name "*.py" | while read -r file; do
        sed -i '' 's/gincoinc\.adamant\.global\.v1/gincoinc\.adamant\.global_\.v1/g' "$file"
        sed -i '' 's/import_module(\x27gincoinc\.global\.v1/import_module(\x27gincoinc\.global_\.v1/g' "$file"
    done
else
    # Linux and other Unix-like systems
    find ./gen/python/gincoinc/ -type f -name "*.py" | while read -r file; do
        sed -i 's/gincoinc\.adamant\.global\.v1/gincoinc\.adamant\.global_\.v1/g' "$file"
        sed -i 's/import_module(\x27gincoinc\.global\.v1/import_module(\x27gincoinc\.global_\.v1/g' "$file"
    done
fi

echo "Replacement of 'gincoinc.adamant.global.v1' with 'gincoinc.adamant.global_.v1' completed"
