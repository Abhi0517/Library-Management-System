## College Library Management System (Java Swing & JDBC)

This project implements a College Library Management System designed to streamline library operations for librarians and students.

* **Features:**

* **User Management:**
    * Separate login for librarians and students with role-based access control.
    * Registration for new students and librarians.
* **Book Management (Librarians):**
    * Add, edit, and delete book entries with details like title, author, category, etc.
    * Search for books by title, author, or category.
    * Track overdue fines(rs.10 per day).
* **Student Management:**
    * Browse and search the library catalog for books.
    * Borrow books (atmost three per student).

* **Tech Stack:**

* **Front-end:** Java Swing
* **Back-end:** Java Database Connectivity (JDBC)
* **Database:** Designed to work with MySQL

* **Getting Started:**

1. **Get Repository URL**:
   Copy the URL to **Library-Management-System** repository.
2. **Open NetBeans**:
   Choose **Team > Git > Clone** or **Team > Remote > Clone** from the main menu. This opens the Clone Repository wizard.
3. **Enter Repository URL**:
   Paste the repository URL into the appropriate field and click **Next**.
4. **Select Branch**:
   Choose the branch(es) you want to download to your local repository and click **Next**.
5. **Choose Directory**:
   Enter or browse to the directory where you want to clone the repository on your hard drive.
6. **Set Clone Name**:
   The default name for the local folder will be the name of the Git repository.
7. **Choose Branch**:
   Select the branch you want to check out into your working tree.
8. **Set Remote Name**:
   Typically, the default remote name "origin" is recommended for the original repository being cloned.
9. **Finish**:
   Click **Finish** to clone this repository into the specified directory.

* **WorkFlow and Execution:**

1. **Copying URL of the repository:**

![1](https://github.com/user-attachments/assets/9d7c2d3f-9bb9-44bb-a253-a4550b8f5c31)

2. **Cloning the repository in NetBeans IDE:**

![3](https://github.com/user-attachments/assets/246b3f01-cbbc-4331-aa4d-823b07bbd8f0)

3. **Executing the project in NetBeans IDE:**

![2](https://github.com/user-attachments/assets/5dcd3b7c-4f12-46a0-b00e-22c20fbd9337)

4. **HomePage provides login facilities to both Student and Librarian:**

![1](https://github.com/user-attachments/assets/8cb13436-24a6-4204-8015-7ffe38edd83d)
* *Librarian Phone Number is the Librarian Login Password*

5. **New Librarians and Students can register themselves easily:**
![2](https://github.com/user-attachments/assets/ba118309-04d2-4ae3-b72f-a439825d14c1)

6. **DataBase Used : Library.**
![Untitled design](https://github.com/user-attachments/assets/ed62f1f0-3b25-472f-bde5-093a7a0d3301)

7. **Once logged in, a Librarian can efficiently access Librarian Dashboard with all of its features.**
![3](https://github.com/user-attachments/assets/3aa758c6-c3c5-4b96-9c37-688f3cc8de22)

8. **Once logged in, a Student can efficiently access Student Dashboard with all of its features.**

![4](https://github.com/user-attachments/assets/a8a170a9-5e63-4000-a538-0e5d86fa23ea)

9. * Student and Librarian data is stored in *Student* and *Librarian* tables respectively.
   * Books when searched, added, edited or deleted, are done from *Books* table in the *Library Database*.
   * A book when issued, its entry is logged in *issuebookrecord* table.
   * When the specified book is returned, its record is removed from *issuebookrecord* and finnaly logged in *borrowing_history* table.
   * Any Librarian can issue book to any student.
   * Atmost three books can be issue to one student.
   * If a borrowed book is not returned within fifteen days, a fine of rs.10/day is imposed on the student.
