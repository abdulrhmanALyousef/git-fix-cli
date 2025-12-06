# git-fix-cli
## introduction

QuickFix is a  Java command-line helper that automates the common Git workflow for fast "fix bug" commits.

Instead of running three commands:

```bash
git add .
git commit -m "fix bug X"
git push
```
You can simply run:
```
java QuickFix X
```
## Installation


* Compile using:
```
 javac QuickFix.java
 ```

This will generate:
 QuickFix.class

 * Go to the directory where QuickFix.class exists

      Add that directory to your CLASSPATH :
    
        export CLASSPATH="$PWD"

        
## Usage
Now you can run QuickFix from any directory:
```
java QuickFix <message>
```
This will execute:
```
git add .
```
```
git commit -m "message"
```
```
git push
```

## Example
```
java QuickFix 3
```

Commit message produced:
```
fix bug 3
```

## Notes

* This tool works only inside valid Git repositories.

 * You must run export CLASSPATH="$PWD" inside the directory containing QuickFix.class before using it globally.

* This setup lasts only for the current terminal session.


---

# 
