# ECSE 439 Assignment 2 Report
### Connor Fowlie : 260687955
### Grégoire Moreau : 

#### Friday November 2nd 2018
#### Group A2 6

## How to Run
- Using eclipse IDE
- Setup Acceleo Run configuration with settings
    Project: A2
    Main Class: A2.main.Generate
    Model: /A2/src/A2/main/jucm/~model~.jucm
    Target: /A2/generated

## Output Files
All output files will be set to /A2/Generated. The name of the output file can be configured in generate.mtl in the "fileName" query.

## What Went Well
Using multiple templates allowed for us to easily create the necessary components and lay them out correctly. The addition of many small querys allowed for cleaner and more understandable code.

## What Didnt Go Well
The largest challenge in this for us was correctly adding beliefs. This was a problem as beliefs are only listed below the main part of graphs within the specDiagrams. We accessed this by looping over the spec diagrams and checking to see if the belief node pointed at the current element, allowing us to insert it in the correct place. 

Another small struggle is with trimming whitespace correctly. There are a few places that dont appear to trim correctly even when using the post (trim()) within a template.
