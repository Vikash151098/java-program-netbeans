-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 07, 2018 at 11:01 AM
-- Server version: 10.1.33-MariaDB
-- PHP Version: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `questionname`
--

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

CREATE TABLE `question` (
  `quesid` int(11) NOT NULL,
  `questext` varchar(200) DEFAULT NULL,
  `option1` varchar(200) DEFAULT NULL,
  `option2` varchar(200) DEFAULT NULL,
  `option3` varchar(200) DEFAULT NULL,
  `option4` varchar(200) DEFAULT NULL,
  `ans` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `question`
--

INSERT INTO `question` (`quesid`, `questext`, `option1`, `option2`, `option3`, `option4`, `ans`) VALUES
(1, 'Which of the following was the theme of the World Red Cross & Red Crescent Day?', '\'Dignity for all-focus on women\'', '\'Dignity for all-focus on Children\'', '\"Focus on health for all\"', 'Nourishment for all-focus on children\"', 'b'),
(2, 'The International Literacy day is observed on? ', 'Sep 8', 'Nov 28', 'May 2', 'Sep 22', 'a'),
(3, 'Bahubali festival is related to?', 'Islam', 'Hinduism', 'Buddhism', 'Jainism', 'd'),
(4, 'The language of Lakshadweep a Union Territory of India,is', 'Tamil', 'Hindi', 'Malayalam', 'Telugu', 'c'),
(5, 'The deth anniversary of which of the following leaders is observed as Martyrs Day?', 'Smt.Indira Gandhi', 'Pl.Jawaharlal Nehru', 'Mahatma Gandhi', 'Lal Bahadur Shastri', 'c'),
(6, '\'Good Friday\' is observed to commemorate the event of?', 'Birth of Jesus Christ', 'Birth of St.Peter', 'Crucification of Jesus Christ', 'Rebirth of Jesus Christ', 'c'),
(7, 'Who is the author of the book \'Amrit ki Ore\'?', 'Mukesh Kumar', 'Narendra Mohan', 'Upendra Nath', 'Nirad C.Choudary', 'b'),
(8, 'Which of the following is observed as Sports Day every year?', '22nd April', '26th July', '29th August', '2nd October', 'c'),
(9, 'World Health Day is observed on?', 'Apr 7', 'Mar 6', 'Mar 15', 'Apr 28', 'a'),
(10, 'Van Mahostav was started by?', 'Maharshi Karve', 'Bal Gangadhar Tiiak', 'K.M.Munshi', 'Sanjay Gandhi', 'c'),
(11, 'The first month of the Indian national calender is?', 'Magha', 'Chaitra', 'Ashadha ', 'Vaishakha', 'b'),
(12, 'Which of the following is not a dance from Kerala?', 'Kathakali', 'Mohiniattam', 'Ottan Thullal', 'Yaksha Gana', 'd'),
(13, 'Rath Yatra is famous festival at?', 'Ayodhya', 'Mathura', 'Dwaraka', 'Puri', 'd'),
(14, 'Which one of the following is essential a solo dance?', 'Kuchipudi', 'Kathak', 'Manipuri', 'Mohiniattam', 'd'),
(15, 'Which of the following is a folk dance of India?', 'Kathakali', 'Mohiniattam', 'Garba', 'Manipuri', 'c'),
(16, 'Central Salt and Marine Chemicals Research Institute is located at? ', 'Ahmedabad', 'Bhavnagar', 'Gandhi Nagar', 'Panaji', 'd'),
(17, 'Nandyal is stuated in?', 'Karnataka', 'Andhra Pradesh', 'Maharashtra', 'Madhya Pradesh', 'a'),
(18, 'Whicg city of India was first of all affected by plague?', 'Jaipur', 'Bombay', 'Surat', 'Kanpur', 'c'),
(19, 'Dogri is spoken in which of the following states?', 'Bihar', 'Orissa', 'Assam', 'Jammu & Kashmir', 'd'),
(20, 'Industrial Toxicoly-Research Centre,is situated in which of following states?', 'U.P', 'Gujarat', 'M.P', 'Bihar', 'a'),
(21, 'The festival celebrated to commemorate teh ordeal of Islamics is?', 'Id-ul-Zuha', 'Moharram', 'Id-i-Milad', 'Id-ul-Fitr', 'a'),
(22, 'Writers Building is the headquaters of?', 'The times of India group', 'All India Writers Association', 'West Bangal Government', 'Press Trust of India', 'd'),
(23, 'The Komark Temple is dedicated to?', 'Vishnu', 'Shiva', 'Krishna', 'Sun God', 'd'),
(24, 'Meenakshi Temple is in?', 'Puri', 'Trivandrum', 'Chennai', 'Madurai', 'd'),
(25, 'The dates of National Calender Permanently correspond with the?', 'Vikrami Calender', 'Mohammadan Calender', 'Georgian Calender', 'None of these', 'c'),
(26, 'Which of the following is wrongly matched?', 'Qutab Minar-Delhi', 'Taj Mahal-Agra', 'Ajanta Caves-Maharashtra', 'Charminar-Lucknow', 'd'),
(27, 'The 227 year old \'Nawab Saheb Ki Haveli\' is located at?', 'Hyderabad', 'Jaipur', 'New Delhi', 'Agra', 'b'),
(28, 'Which of the following years was celebrated as the Woeld Communication Year?', '1981', '1983', '1985', '1987', 'b'),
(29, 'The abbreviation \'fob\' stands for?\r\n', 'Free on Board', 'Free of Bargain', 'Fellow of Britain', 'None of these', 'a'),
(30, 'The Lifeline Express is?', 'A de-addiction program to save drug addicts', 'The world\'s first hospital on rails operating in India', 'a popular health magazine founded by Ramoath Goenka', 'an instrument used for watching the fluctuations in the blood pressure of a patient under general anaeshthesia', 'b'),
(31, 'Which of the following was the first Indian State to issue photo identity cards to its voters?', 'Tamil Nadu', 'Rajasthan', 'West Bangal', 'Haryana', 'd'),
(32, 'The value of (Pai) was first given by?', 'Bhaskara', 'Varahamihira', 'Aryabhatta', 'None of these', 'c'),
(33, 'The first month of Saka year is?', 'Vaisakh', 'Chaitra', 'Jyeshtha', 'Paush', 'b'),
(34, 'The conspiracy angle,of Rajiv Gandhi murder is being probed by?', 'Mirdha Commission', 'Chelliah Commission', 'Jain Commission', 'Rangarajan Commission', 'c'),
(35, 'Which of the following bodies certifies the circulation figures of newspapers?', 'ISI', 'PTI', 'AINEC', 'ABC', 'd'),
(36, '\'The Bhopal Disaster\' was result of which of the following?', 'Collasping of a dam', 'Great fire', 'Plague epidemic', 'None of these', 'd'),
(37, 'The Eendu newspapers is published from?', 'Orissa', 'Kerala', 'Karnataka', 'Andhra Pradesh', 'd'),
(38, 'When was the Indian Peace Keeping Force Sent to Sri Lanka?', 'May,1986', 'July,1987', 'May,1988', 'March,1990', 'b'),
(39, 'YMCA means?', 'Young Members of Christian Association', 'Young Men\'s Cricket Association', 'Young Men\'s Christian Association', 'Young Member\'s Cricket Association', 'c'),
(40, 'The Thakkar Commission was appointed to investigate into the?', 'Bofors deal', 'Centre State relations', 'Operation Blue Star', 'Indira Gandhi Assassination case', 'd'),
(41, 'The abbreviation MPLA stands for? ', 'Maharashtra Pradesh Legislative Assembly', 'Member of Parliament & Legislative Assembly', 'People\'s Movement for Liberation of Angola', 'None of these', 'c'),
(42, 'Which of the following newspapers is ISO years old?', 'The Stateman', 'The Times of India', 'The Hindu', 'Malayala Manorama', 'b'),
(43, 'The \'Earth Summit\' was held in June 1992 at?', 'New Delhi', 'Paris', 'Rio de Janerio', 'Washington', 'c'),
(44, 'ISI stands for', 'International Standards Institute', 'Indian Statistical Institute', 'Indian Standards Institute', 'Indian Service Insitute', 'c'),
(45, 'Newspapers are not published from which of the following Indian States?', 'Assam', 'Manipur', 'Mizoram', 'Arunchal Pradesh', 'd'),
(46, 'The National Open University is run by?', 'CBSE', 'UGC', 'IGNOU', 'NCERT', 'b'),
(47, 'India has consistently opposed?', 'Racialism & colonialism', 'Racialism & Capatialism', 'Racialism,Colonialism & Fascism', 'Racialism,Fascism & Capatialism', 'd'),
(48, 'What does IFA stands for?', 'International Flood Assocciation', 'Indian Airforce ', 'Indian Fertilizer Association', 'Indian Football Association', 'd'),
(50, 'Field Marshal is the highest rank in?', 'Army', 'Navy', 'Airforce', 'Territorial Army', 'a'),
(51, 'Delhi become Capital of India in?', '1910', '1911', '1916', '1923', 'b'),
(52, 'Lunar Month is equal to?', 'One Earth Day', '14 Earth Days', '28 Earth Days', '365 Days', 'c'),
(53, 'Which of the following is the publisher of \'Employment News\'?', 'Indian Express Group', 'Times of India Group', 'Professional Management Group', 'Ministry of Information & Broadcasting', 'd'),
(54, 'Which of the following is one of the seven wonders of Medieval World?', 'Hanging Gardens of Babylon', 'Taj Mahal', 'Leaning Tower of Pisa', 'Pyramids of Egypt', 'c'),
(55, 'Homeopathy originated in?', 'U.S.', 'U.S.S.R', 'India', 'Germany', 'd'),
(56, 'Which of the following is not a News Agency in India?', 'Press Trust of India', 'Press Council of India', 'United News of India', 'Hindustan Smachar', 'b'),
(57, 'Who was awarded the Padma Vibhushan on the 50th Republic Day in 2000', 'Shabana Azmi', 'Amitabh Bachchan', 'Dev Anand', 'Lata Mangeshkar', 'd'),
(58, 'Thillana is a format of?', 'Kuchipudi', 'Odissi', 'Bharatnatyam', 'Kathak', 'c'),
(59, 'Most \'Ancient Musical\' instrument among the following is?', 'Sarod', 'Tabla', 'Sitar', 'Veena', 'd'),
(60, 'Of which of the following States is Nautanki, a Folk dance?', 'Uttar Pradesh', 'Arunachal Pradesh', 'Meghalaya', 'Orissa', 'a'),
(61, 'The Headquaters of the Sahitya Academy is at?', 'Mumbai', 'Chennai', 'New Delhi', 'Kolkata', 'c'),
(62, 'Kalchakra Ceremony is associated with which of the following ceremony?', 'Hinduism', 'Islam', 'Jainism', 'Buddhism', 'd'),
(63, 'Kathak is a Classical dance of', 'Manipur', 'North India', 'Tamil Nadu', 'Kerala', 'b'),
(64, 'The book of Parsis is?', 'Torah', 'Bible', 'Geeta', 'Zend Avesta', 'd'),
(65, 'Kathakali is a folk dance prevalent in which state?', 'Orrisa', 'Manipur', 'Karnatka', 'Kerala', 'd'),
(66, 'In which of the following Contries has India not organised \'India Festival\'?', 'Russia', 'Japan', 'France', 'West Germany', 'd'),
(67, 'People from which states celebrate their hrvest festival arround Makar Sakranti?', 'Kerala', 'Punjab', 'Karnataka', 'Tamil Nadu', 'c'),
(68, 'Which of the following is a dance drama?', 'Odissi', 'Manipuri', 'Bharatnatyam', 'Kathakali', 'd'),
(69, 'Which of the following is a famous Assamese Festival?', 'Baishakhi', 'Yugadi', 'Rangali Bihu', 'Onam', 'c'),
(70, 'Boat Race is a popular Sport in?', 'Orissa', 'Karnataka', 'Tamil Nadu', 'Kerala', 'd'),
(71, 'The Folk theatre of Karnataka is?  ', 'Bhagawat Mela', 'Yakshagana', 'Bhavai', 'Koodiattam', 'b'),
(72, 'The song of India was composed by?', 'Iqbal', 'Rabindra Nath Tagore', 'Jai Shankar Prasad', 'Bankim Chandra Chatterji', 'd'),
(73, 'The ratio of width of our National Flag to its length is?', '2:4', '3:4', '2:3', '3:5', 'c'),
(74, 'The national Anthem was first sung in the year?', '1911', '1913', '1935', '1936', 'a'),
(75, 'Rajasthani and Pahari schools were famous for', 'Music', 'Dancing', 'Sculture', 'Painting', 'd'),
(76, 'Sangeet Natak Academy was set up by the government of India in', '1952', '1953', '1955', '1957', 'b'),
(77, 'The Rath Yatra at Puri is celebrated in honour of which Hindu diety?', 'Ram', 'Shiva', 'Vishnu', 'Jaggannath', 'd'),
(78, 'The last Mahakumbh of the 20th century was held at', 'Haridwar', 'Nasik', 'Ujjain', 'Allahabad', 'a'),
(79, 'Who composed the famous song \'Sare jhan se Achha?', 'Bankim Chandra Chatterji', 'Jaidev', 'Mohammad Iqbal', 'Rabindra Nath Tagore', 'c'),
(80, 'Matriarchal System is common in', 'Tamil Nadu', 'Punjab', 'Meghalaya', 'Rajasthan', 'c'),
(81, 'The Indian National Calendar is based on?', 'Christian Era', 'Saka Era', 'Vikram Era', 'Hiji Era', 'b'),
(82, 'In Orissa, certain tribes worship hills. this is an example of', 'Animatisim', 'Animism', 'Theriomorphism', 'Anthropomorphism', 'b'),
(83, 'Which of the following musical instruments is also reffered to as a \'Earth body\'?', 'Tabla', 'Santoor', 'Mridangam', 'Dholak', 'c'),
(84, 'The dance encouraged and performed from the temple of Tanjore was?', 'Bharatnatyam', 'Kathakali', 'Odissi', 'Mohiniattam', 'a'),
(85, 'which dance was revived by Rabindra Nath Tagore?', 'Bharatnatyam', 'Kathakali', 'Manipuri', 'Odissi', 'b'),
(86, 'The word \'Satyameva Jayate\' inscribed below the base plate of the emblem of India are taken from?', 'Ramayana', 'Mundak Upanishad', 'Rigveda', 'Satpath Brahmana', 'b'),
(87, '\'Nature never, did betray the health that loved her\' is a quotation from', 'J. Byron', 'w. Wordsworth', 'j. Keats', 'P.B. Shelly', 'b'),
(88, 'The slogan \'one nation\',\'one tax\', \'one market\' was used for the promotion of which tax scheme by the central government ', 'GST', 'DDT', 'STT', 'CST', 'a'),
(89, 'In which lnguages did Jean Paul Sartie writes his books?', 'Russian', 'Greek', 'French', 'Spanish', 'd'),
(90, '\'Years of Pilgrimage\' is the autobiography of which of the following Indians?', 'Naresh Mehta', 'K.K. Nair', 'Dr. Raja Ramana ', 'Dr. Sitakant Mohapatra', 'd'),
(91, 'Who is the author of the famous book \"Crossing the Threshold of hope\"?', 'Nelson Mandela', 'Mother Teresa', 'Pope John Paul II', 'Alwin Toffler', 'c'),
(92, 'According to the beliefs, who among the following is identified as \"Chechak ki Devi\"?', 'Sheetala Devi', 'Annapurna devi', 'Anusuya Devi', 'Anjana Devi', 'a'),
(93, 'Which of the following tools is a part of the name of a Olympic Sporting Event?', 'Screwdriver', 'Hammer', 'Axe', 'Jack', 'b'),
(94, 'The calf of which animal can grow at a rate of 90kg per day?', 'African Elephant', 'Hippopotamus', 'Blue Whale', 'Octopus', 'c'),
(95, 'Which one of the following personalities is a grandson of Chakravarti Rajagopalachari,independent India\'s second Governor General?', 'Shashi Tharoor', 'Venkaiah Naidu', 'Gopalkrishna Gandhi', 'Raghuram Rajan', 'c'),
(96, 'How many pouches of 50 milliliters can be made out of 5 litres of mustard oil?', '150', '100', '300', '75', 'b'),
(97, 'Whixh of these is not one of the older cities of Delhi?', 'Jahanpanah', 'Shahjahanabad', 'Tughlaqabad', 'Akbarabad', 'd'),
(98, 'Which of these can be estimated from the colour of the nose of the lion?', 'Age', 'Speed', 'Intelligence', 'Strength', 'a'),
(99, 'ICGS Arnvesh has been commissioned by the Indian Coast Guard in which state?', 'Tamil Nadu', 'Kerala', 'West Bengal', 'Andhra Pradesh', 'd'),
(100, 'Who of the following acted as a Constitutional Advisor to the Constituent Asssembly?', 'VP Menon', 'Dr.Rajendra Prashad', 'BN Rau', 'Dr. Sachhidanand Sinha', 'c');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`quesid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
