def line_prepender_append(“file.txt”, “Hello World”):
         with open(“file.txt”, “r+”') as f: 
              content = f.read() 
              f.seek(0, 0) 
              f.write(“Hello World”.rstrip(“\r\n”) + “\n” + content)

         with open(“file.txt”, “a+”') as file_object
	            file_object.seek(0)
	            data = file_object.read(100)
            	If len(data) > 0 :
		          file_object.write(“\n”)
		          file_object.write(“Goodbye”)
