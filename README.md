# Contact-Manager

This project is a simple **Contacts Manager** built using **Java** and demonstrates key concepts of **Object-Oriented Programming (OOP)**, such as encapsulation, classes, objects, and methods.

## Features

- **Add Contacts**: Users can input and store contact details, including name, phone number, and email address.
- **Search Contacts**: Users can search for contacts by name and retrieve their phone number.
- **Dynamic Input**: The system allows users to input multiple contacts (up to 500) and provides an easy way to manage and search for stored information.

## OOP Concepts Used:

1. **Classes and Objects**:
   - The project is structured around two core classes:
     - `Contact`: Represents individual contact information.
     - `ContactsManager`: Manages a collection of `Contact` objects, allowing adding and searching of contacts.

2. **Encapsulation**:
   - Contact information (name, phone number, and email) is stored in fields within the `Contact` class.
   - The fields are accessed and modified using methods, providing control over data handling.

3. **Modularity**:
   - Each class has clearly defined responsibilities:
     - `Contact` stores contact details.
     - `ContactsManager` is responsible for managing multiple contacts and providing search functionality.

4. **Data Management**:
   - Contacts are stored in an array (`myFriends[]`) within the `ContactsManager` class, which can hold up to 500 contacts.
   - The number of contacts is dynamically managed using a `friendsCount` variable.

