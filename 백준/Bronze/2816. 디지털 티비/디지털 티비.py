def move_channel_to_position(channels, target, position):
    index = channels.index(target)
    moves = ""
    
    # Move the cursor to the target channel
    for _ in range(index):
        moves += "1"
    
    # Move the target channel to the desired position
    for _ in range(index - position):
        moves += "4"
    
    return moves

def main():
    import sys
    input = sys.stdin.readline
    
    N = int(input().strip())
    channels = [input().strip() for _ in range(N)]
    
    # Move KBS1 to the first position
    moves = move_channel_to_position(channels, "KBS1", 0)
    
    # Apply the moves to the channels list
    index = channels.index("KBS1")
    channels.pop(index)
    channels.insert(0, "KBS1")
    
    # Move KBS2 to the second position
    moves += move_channel_to_position(channels, "KBS2", 1)
    
    print(moves)

if __name__ == "__main__":
    main()