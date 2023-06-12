import os
import glob

def gather_files(root_dir, extensions):
    files = []
    for ext in extensions:
        files.extend(glob.glob(root_dir + f'/**/*.{ext}', recursive=True))
    return files

def collect_code(files, output_file):
    with open(output_file, 'w') as outfile:
        for file in files:
            outfile.write(f'\n===== Contents of file: {os.path.basename(file)} =====\n\n')
            with open(file, 'r') as infile:
                for line in infile:
                    outfile.write(line)
            outfile.write('\n\n')  # add some space between file contents

def main():
    root_dir = '.'  # this means "current directory"
    extensions = ['css', 'ts', 'html']  # file extensions to look for
    output_file = 'collected_frontend_code.txt'  # output file

    files = gather_files(root_dir, extensions)
    collect_code(files, output_file)

if __name__ == '__main__':
    main()
