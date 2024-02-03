# Rehearsal Room Reservation Manager

## Description

This project aims to facilitate the organization of reservations for available time slots in a rehearsal studio. Clients can book a time slot after making a payment through a virtual wallet. The simple interface displays available time slots and the reservation price based on the selected number of hours.

## Project Status

In the initial development phase, this project is taking its first steps.

### Key Features

- Reservation of time slots with payment through a virtual wallet.
- Simple interface for selecting time slots and calculating prices.
- Mandatory data for the first reservation: band name, contact number, and responsible person's name.
- Option to create an account to avoid data re-entry for future reservations.

## Technologies Used

- **Backend:** Java, Spring Boot
- **Database:** MariaDB
- **Frontend:** React

## Installation

Not applicable at the moment, in its early stages.

## Usage

The Rehearsal Room Reservation Manager application is designed to provide bands and artists with a simple and efficient way to book rehearsal time slots in your studio. Below is a guide on how to use the application from the user's perspective:

### 1. Reservation of Time Slots

1.1 **Select Time Slot:**
   - Explore the interface to view available time slots.
   - Select the desired time slot and the reservation duration.

1.2 **Provide Data and Make Payment:**
   - Provide the following mandatory data:
      - Band name.
      - Contact number.
      - Name of the person in charge of the reservation.
   - Proceed to the payment process through the integrated virtual wallet (using a payment gateway API like Mercado Pago or a similar one).

### 2. Band Registration (First Reservation)

2.1 **Option to Create an Account:**
   - To facilitate future reservations, consider creating an account to avoid data re-entry for each reservation.

### 3. Reservation Management

3.1 **View History:**
   - Access your reservation history for a detailed record of all rehearsal sessions.

3.2 **Make Changes:**
   - Modify or cancel reservations as needed.

### 4. Administrator (Restricted Access)

4.1 **Cash Management:**
   - Automatically record income and expenses with each reservation and payment.
   - Keep track of expenses such as electricity, internet, and possible repairs.

4.2 **CRUD of Reservations and Clients:**
   - Add, update, or delete reservations and clients as needed.
   - Useful for situations where the band prefers to record information in person or makes reservations through other means.

### 5. WhatsApp Notifications

5.1 **Notification Settings:**
   - Configure the option to receive notifications via WhatsApp.
   - Receive reservation reminders and updates directly on your mobile device.


## Author

The project is self-authored.

## License

This project is self-authored and is currently not under any specific license.
