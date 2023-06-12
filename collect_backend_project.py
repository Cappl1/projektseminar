import glob
import os

# Update the pattern to the path where your Java files reside
java_files = glob.glob('**/*.java', recursive=True)  # for current directory

# Open your output file in write mode
with open('whole_project.txt', 'w') as outfile:
    for java_file in java_files:
        with open(java_file, 'r') as infile:
            outfile.write(f'\n===== Contents of file: {os.path.basename(java_file)} =====\n\n')
            outfile.write(infile.read())
            outfile.write('\n\n')  # add two newlines after each file's content
