require(ltm)
require(tidyverse)

talk <- read_csv("data.csv")

talk <- talk %>% select(-1)

talk <- replace(talk, talk =="Disagree", 0)
talk <- replace(talk, talk =="Agree", 1)

names(talk) <- c("large crowd", "cautious","drained_after_out", "enjoy_large_gather", "risk_careful_research", "quiet_child", "space_myself", "every_moment_alone", "few_moments_alone", "work_alone")

# rasch
mod.rasch <- rasch(talk, constraint = cbind(ncol(talk) + 1, 1))
mod.rasch
summary(mod.rasch)
coef(mod.rasch, prob=TRUE, order=TRUE)
plot(mod.rasch)
# GoF.rasch(pre.rasch, B=199)

# 1pl
mod.1pl <- rasch(talk)
summary(mod.1pl)
anova(mod.rasch, mod.1pl)
plot(mod.1pl)

factor.scores(mod.1pl)

# 2pl
mod.2pl <- ltm(talk ~ z1)
mod.2pl
summary(mod.2pl)
coef(mod.2pl, prob=TRUE, order=TRUE)
anova(mod.1pl, mod.2pl)
plot(mod.2pl)

# 3pl
mod.3pl <- tpm(talk, max.guessing = .2)
plot(mod.3pl)
mod.3pl <- tpm(talk)
summary(mod.3pl)
plot(mod.3pl)
anova(mod.2pl, mod.3pl)

factor.scores(mod.3pl)

plot(pre.rasch, lengend=TRUE, cx="bottomright", lwd=3, cex.main=1.5, cex.lab=1.3, cex=1.1)
plot(pre.1pl, lengend=TRUE, cx="bottomright", lwd=3, cex.main=1.5, cex.lab=1.3, cex=1.1)
plot(pre.2pl, lengend=TRUE, cx="bottomright", lwd=3, cex.main=1.5, cex.lab=1.3, cex=1.1)
plot(pre.3pl, lengend=TRUE, cx="bottomright", lwd=3, cex.main=1.5, cex.lab=1.3, cex=1.1)
