# lib-version

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

## Automatic Versioning
The version is maintained in **pom.xml** \<version\> tag.

### main branch
Best approach is to manually release stable version. Then the workflow will automatically increment the version by one, so there will not be duplicate release.

### other branch
The other branch workflow prerelease.yml will be triggered on push. Automatically release a prerelease package. The version will be in format version-branchname-date-timestamp, and the version is in pom.xml. The version in other branch will not be changed in this branch.

