     Think-> Red -> Green -> Refactor
    
     Guideline 1: Always start with outputs when doing an analysis
    
     Tic Tac Toe Game:
        3x3 board
        X plays first
        0 plays second
        Results:
            X won
            0 won
            Draw
        Win conditions:
            On column
            On line
            On diagonal
    
     Guideline 2: Behavior Slicing
     Inputs                Outputs
     X finished line       X won
     X finished column     X won
     X finished diagonal   X won
    
    
     Guideline 3: SIMPLIFY!
    
     Guideline 4: Introduce only one notion (domain concept) at a time, one per test
    
     Guideline 5: The rule of three "only extract duplication when spotted at least three times"
    
     Guideline 6: Triangulation
    


     Design Experiments
    
     Hypothesis: "two by two", "one by one" should be a class "boardStructure"
    
     Plus:
     No more primitives about Board Structure in the tests
     All the structure will be in one place. Structural coherence.
     Some coupling is expected from the tests, but only one other class will use
     boardStructure
     Duplication will be removed in-between tests
     Clarity will be better because a cohesive design structure is extracted
    
     Minus:
     Increased code complexity, because of a new design element




     Intotroduced the notion of column
     X 0
     X

     Introduced no new notions
     0  X
        X


    Hint: Move a method and it has the parameter an instance of the class you
    extracted it to, it means you are creating more cohesion in the design.

     Naming Hint: An extracted class name will result from the noun duplicated
     in all the extracted methods -> "tictactoe.Direction"

     Hint: When duplication comes into the same class, we increase the cohesion
     of the code.


