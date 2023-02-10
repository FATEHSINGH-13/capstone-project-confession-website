// Check if the confessions file exists, if not create it
if (!file.exists()) {
  file.createNewFile();
}

// Prompt user for confession
System.out.print("Enter your confession: ");
String confession = input.nextLine();
confessions.add(confession);

// Write confessions to file
FileWriter writer = new FileWriter(file, true);
for (String conf : confessions) {
  writer.write(conf + "\n");
}
writer.close();

System.out.println("Confession added successfully!");
