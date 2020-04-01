# GEN-L-03
Applying UML and Patterns - School work on Travis CI and Maven

## Enable git hook

To enable git hook in your repo (local) you need to copy or create
a link in `.git/hooks`

### To enable successful maven tests before accepting any commit : 

```bash
ln -sr hook-maven.sh .git/hooks/pre-commit
```

### To enable successful maven tests before accepting any push : 

```bash
ln -sr hook-maven.sh .git/hooks/pre-push
```

`git commit/push` will now check if your maven tests are successful before allowing
you to continue.

**Attention**: Tests are executed in your working dir, if you don't 
validate all files or push another branch, this hooks won't work.
