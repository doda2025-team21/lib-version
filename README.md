# lib-version

## How to set version number
To change version number, in pom.xml version. And git tag version number.

```bash
git tag v1.0.0 # tag the latest commit
git push origin main v1.0.0
# Then github workflow will work and generate specific version packages
```

## How to depend in Maven project
Add this to pom.xml
```
<dependency>
  <groupId>tudelft.doda2025.team21</groupId>
  <artifactId>lib-version</artifactId>
  <version>1.0.0</version>
</dependency>
```
If you can't download from github package and meet 401 unauthorized problme. [This link](https://gist.github.com/Timongcraft/69ddbe39b894b819e93296339141b844) might help.

