import pandas as pd
#create the dataset
data ={
    "usernames": ["admin", "Charles","Deku"],
    "passwords": ["passeord","Charl113", "Allmight"],

}
#convert dataset to dataframe
df = pd.DataFrame(data)

#write the dataframe to a CSV file
df.to_csv("samples.csv", index=False)

#read data from the CSV file
input_data = pd.read_csv("sample.csv")

#print the value only in  username column
print (input_data["username"]) #-->["admin", "Charles", "Deku"]
#print the username and password of the second row
print (input_data["username"][1]) #-->"Charles"
print (input_data["passwords"][1]) #-->"Charl113"

#Sort the username column data in ascending order and print data
print (input_data.sort_values("usernames"))

#Sort the passwords column data in ascending order and print data
print (input_data.sort_values("usernames", ascending=False))




