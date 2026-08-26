# Open the file in read mode
with open('/content/p2p-Gnutella04.txt.gz', 'r') as file:
    # Read the entire content of the file
    content = file.read()
    file_content=content[3422:]
    print(file_content)
    # print(content)
    # acc = []