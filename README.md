# GEN-L-03
Applying UML and Patterns - School work on Travis CI and Maven

## Enable git hook

For enable git hook in your repo (local) you need copy or create
a link in `.git/hooks`

For check maven test before any commit : 

```bash
ln -sr hook-maven.sh .git/hooks/pre-commit
```

For check maven test before any push : 

```bash
ln -sr hook-maven.sh .git/hooks/pre-push
```

And now when your commit/push git check maven test before allow
you your action.

**Attention**: Tests are executed in your working dir, if you don't 
valid all file or push an other branch, this hooks don't work.
