# recipes

Recipes for different github actions

The status badges can be creadted from the repo's Actions page under the kebab menu

## Caching
[![Cache Example](https://github.com/PisanA/recipes/actions/workflows/cache.yml/badge.svg)](https://github.com/PisanA/recipes/actions/workflows/cache.yml)

Cache the installation of programs to reducte running time. First run to install all take 9m. Subsequent runs take under 1m.

- cache.yml
- cache-insall.sh


## Artifact
[![Upload Example](https://github.com/PisanA/recipes/actions/workflows/upload-artifact.yml/badge.svg)](https://github.com/PisanA/recipes/actions/workflows/upload-artifact.yml)

Create an artifact that can be downloaded from repository via website or using `gh run download`

- upload-artifact.yml

## Checkstyle
[![Checkstyle Example](https://github.com/PisanA/recipes/actions/workflows/checkstyle.yml/badge.svg)](https://github.com/PisanA/recipes/actions/workflows/checkstyle.yml)

Checkstyle action

- checkstyle.yml
- Adder.java
- App.java

## Checkstyle
[![Checkstyle Manual Example](https://github.com/PisanA/recipes/actions/workflows/checkstyle-manual.yml/badge.svg)](https://github.com/PisanA/recipes/actions/workflows/checkstyle-manual.yml)

Checkstyle manual, downloading teh jar file and running it from teh command line

- checkstyle.yml
- Adder.java
- App.java
