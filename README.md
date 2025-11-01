# Final-Project

# Description
    This program keeps inventory on crochet plushies. It accepts new items and stores them into an arry. It saves those items into a file named "inventoryFile". This program also stores sold out items into an arry ans file named "soldOutFile".

# Instructions
    To use this program you have to choose an option from the menu. The menu has 4 options. 
    Option 1 shows you the inventory. 
    Option 2 lets you add a plushie into the inventory.
    Option 3 lets you move sold out plushies into the sold out arry and file. It does this by using the array index instead of the plushie name. The index starts at 0. 
    Option 4 saves both files (inventoy and soldOut file) and exits the program.

# Example
    Welcome to the Crochet Plush Inventory System!
    Main Menu:
    1. View inventory
    2. Add a new crochet plushie
    3. Sell a crochet plushie
    4. Exit
    Enter your choice (1-4): 2
    You selected option: 2
    Enter crochet plushie to add: Sakura dragon
    Enter your choice (1-4): 2
    You selected option: 2
    Enter crochet plushie to add: Frog
    Enter your choice (1-4): 2
    You selected option: 2
    Enter crochet plushie to add: Strawberry cow
    Enter your choice (1-4): 2
    You selected option: 2
    Enter crochet plushie to add: Axolotl
    Enter your choice (1-4): 3
    You selected option: 3
    Available Crochet Plushies: [Sakura dragon, Frog, Strawberry cow, Axolotl]
    Sold Out Crochet Plushies: 
    Enter the index of the plushie to sell: 1
    Frog plushie sold successfully.
    Enter your choice (1-4): 4
    You selected option: 4
    Data Saved. Exiting Program.
# Known limitations or future improvements 
    Loading files needs improvement.
    This program can save new files but does not load "old" files. It also emptys the saved files (inventory and soldOut files) when the program is run anew and no new input is entered. 
