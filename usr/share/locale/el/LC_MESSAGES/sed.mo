��    K      t  e   �      `  �   a  ,   \  5   �  N   �  7     _   F  `   �  u   	  b   }	  V   �	  �   7
  %   �
     �
       5     B   T     �     �     �     �       $        A     S     n          �  #   �     �     �     �               %  H   2     {     �  !   �     �     �  #   	     -     G  $   g     �     �  #   �  2   �           0     Q     o  *   �  *   �     �            #   "  #   F  &   j     �     �  ,   �     �       -        H     W     f     |     �     �     �     �  �  �  �  �  j   |  u   �  �   ]  �   �  �   r  �     �   �  �   }  �   2  �   �  9   �  6   �  )   ,  ~   V  �   �  6   u  *   �  >   �  ?     8   V  H   �  )   �  1     4   4     i  L   �  I   �  5          V   C   g      �      �      �   �   �   5   �!  ;   �!  V   �!  7   P"  K   �"  @   �"  5   #  R   K#  d   �#  ]   $  3   a$  B   �$  n   �$  .   G%  E   v%  ;   �%  B   �%  Y   ;&  ^   �&  E   �&     :'     W'  A   l'  A   �'  T   �'  3   E(  L   y(  o   �(  7   6)  -   n)  s   �)     *     )*  !   B*  -   d*     �*  .   �*  .   �*  T   	+     @      *   <   -   1   G   5   !   $                           )                             2   4          =      H          (   .   D   ;       3   &   I          F       #       K             /   +   ,   B          A              0   '                   
              >   J              E          "   8                 %   	                :      6   7   9   C   ?    
If no -e, --expression, -f, or --file option is given, then the first
non-option argument is taken as the sed script to interpret.  All
remaining arguments are names of input files; if no input files are
specified, then the standard input is read.

       --help     display this help and exit
       --version  output version information and exit
   --follow-symlinks
                 follow symlinks when processing in place
   --posix
                 disable all GNU extensions.
   -b, --binary
                 open files in binary mode (CR+LFs are not processed specially)
   -e script, --expression=script
                 add the script to the commands to be executed
   -f script-file, --file=script-file
                 add the contents of script-file to the commands to be executed
   -l N, --line-length=N
                 specify the desired line-wrap length for the `l' command
   -n, --quiet, --silent
                 suppress automatic printing of pattern space
   -u, --unbuffered
                 load minimal amounts of data from the input files and flush
                 the output buffers more often
 %s: -e expression #%lu, char %lu: %s
 %s: can't read %s: %s
 %s: file %s line %lu: %s
 %s: warning: failed to get security context of %s: %s %s: warning: failed to set default file creation context to %s: %s : doesn't want any addresses Invalid back reference Invalid character class name Invalid collation character Invalid content of \{\} Invalid preceding regular expression Invalid range end Invalid regular expression Memory exhausted No match No previous regular expression Premature end of regular expression Regular expression too big Success Trailing backslash Unmatched ( or \( Unmatched ) or \) Unmatched \{ Usage: %s [OPTION]... {script-only-if-no-other-script} [input-file]...

 `e' command not supported `}' doesn't want any addresses can't find label for jump to `%s' cannot rename %s: %s command only uses one address comments don't accept any addresses couldn't attach to %s: %s couldn't edit %s: is a terminal couldn't edit %s: not a regular file couldn't follow symlink %s: %s couldn't open file %s: %s couldn't open temporary file %s: %s delimiter character is not a single-byte character error in subprocess expected \ after `a', `c' or `i' expected newer version of sed extra characters after command invalid reference \%d on `s' command's RHS invalid usage of +N or ~N as first address invalid usage of line address 0 missing command multiple `!'s multiple `g' options to `s' command multiple `p' options to `s' command multiple number options to `s' command no input files no previous regular expression number option to `s' command may not be zero option `e' not supported read error on %s: %s strings for `y' command are different lengths unexpected `,' unexpected `}' unknown command: `%c' unknown option to `s' unmatched `{' unterminated `s' command unterminated `y' command unterminated address regex Project-Id-Version: GNU sed 4.2.1
Report-Msgid-Bugs-To: bug-gnu-utils@gnu.org
PO-Revision-Date: 2012-03-17 16:30+0100
Last-Translator: Savvas Radevic <vicedar@gmail.com>
Language-Team: Greek <team@lists.gnome.gr>
Language: el
MIME-Version: 1.0
Content-Type: text/plain; charset=UTF-8
Content-Transfer-Encoding: 8bit
X-Bugs: Report translation errors to the Language-Team address.
Plural-Forms: nplurals=2; plural=(n != 1);
 
Αν δεν υπάρχουν επιλογές -e, --expression, -f ή --file, τότε το πρώτο
όρισμα που δεν είναι επιλογή αποτελεί το όνομα του προγρ. εντολών.
Όλα τα υπόλοιπα ορίσματα είναι ονόματα αρχείων εισόδου· αν δεν έχουν
καθοριστεί αρχεία εισόδου, τότε γίνεται ανάγνωση της κανονικής εισόδου.

       --help     εμφάνιση αυτού του κειμένου βοηθείας και έξοδος
       --version  εμφάνιση πληροφοριών έκδοσης προγράμματος και έξοδος
   --follow-symlinks
                 ακολούθηση συμβολικών συνδέσμων στην επιτόπια επεξεργασία
   --posix
                 απενεργοποίηση όλων των επεκτάσεων GNU στο πρωτότυπο sed.
   -b, --binary
                 άνοιγμα αρχείων ως δυαδικά (οι χαρακτήρες CR και LF δεν έχουν ειδική σημασία)
   -e σενάριο --expression=σενάριο
                 προσθήκη του σεναρίου στις εντολές προς εκτέλεση
   -f αρχείο-σεναρίου --file=αρχείο-σεναρίου
                 προσθήκη του αρχείου-σεναρίου στις εντολές προς εκτέλεση
   -l N, --line-length=N
                 καθορισμός επιθυμητού μήκους γραμμής για αναδίπλωση γραμμών στην εντολή `l'
   -n, --quiet, --silent
                 δεν γίνεται αυτόματη εκτύπωση του χώρου υποδείγματος
   -u, --unbuffered
                 φόρτωση ελαχίστων ποσοτήτων δεδομένων από τα αρχεία εισόδου
                 και άδειασμα των ενταμιευτών εξόδου συχνότερα
 %s: -e έκφραση #%lu, χαρακτήρας %lu: %s
 %s: αδυναμία ανάγνωσης του %s: %s
 %s: αρχείο %s γραμμή %lu: %s
 %s: προειδοποίηση: αποτυχία πάρσης πλαίσιου ασφαλείας του αρχείου %s: %s %s: προειδοποίηση: αποτυχία ορισμού προεπιλεγμένου πλαισίου δημιουργίας αρχείου ως %s: %s : δεν χρειάζονται διευθύνσεις Μη έγκυρη οπισθαναφορά Μη έγκυρο όνομα κλάσης χαρακτήρων Μη έγκυρος χαρακτήρας ταξινόμησης Μη έγκυρο περιεχόμενο εντός \{\} Μη έγκυρη προηγούμενη κανονική έκφραση Μη έγκυρο τέλος εύρους Μη έγκυρη κανονική έκφραση Εξάντληση διαθέσιμης μνήμης Κανένα ταίριασμα Δεν βρέθηκε προηγούμενη κανονική έκφραση Πρόωρος τερματισμός κανονικής έκφρασης Πολύ μεγάλη κανονική έκφραση Επιτυχία Τελευταίος χαρακτήρας η πισωκάθετος Αταίριαστο ( ή \( Αταίριαστο ) ή \) Αταίριαστο \{ Χρήση: %s [ΕΠΙΛΟΓΗ]... {σενάριο-αν-δεν-υπάρχει-άλλο-σενάριο} [αρχείο-εισόδου]...

 η εντολή `e' δεν υποστηρίζεται το `}' δεν χρειάζεται διευθύνσεις αδυναμία εύρεσης ετικέττας για μετάβαση στο `%s' αδυναμία μετονομασίας του %s: %s η εντολή χρησιμοποιεί μόνο μια διεύθυνση τα σχόλια δεν δέχονται διευθύνσεις αδυναμία προσάρτησης στο %s: %s αδυναμία επεξεργασίας του %s: είναι τερματικό αδυναμία επεξεργασίας του %s: δεν είναι κανονικό αρχείο αδυναμία ακολούθησης του συμβολικού συνδέσμου %s: %s αδυναμία ανοίγματος του %s: %s αδυναμία ανοίγματος του αρχείου %s: %s ο χαρακτήρας διαχωριστής έχει μέγεθος μεγαλύτερο από ένα byte σφάλμα στη υποδιαδικασία απαιτείται \ μετά τις εντολές `a', `c' ή `i' αναμενόταν νεώτερη έκδοση του sed επιπλέον χαρακτήρες μετά την εντολή μη έγκυρη αναφορά \%d στο δεξί τμήμα της εντολής `s' δεν επιτρέπεται η χρήση των +N ή ~N ως πρώτη διεύθυνση ακατάλληλη χρήση διεύθυνσης γραμμής 0 λείπει η εντολή πολλαπλά `!' πολλαπλές επιλογές `g' στην εντολή `s' πολλαπλές επιλογές `p' στην εντολή `s' πολλαπλός αριθμητικές επιλογές στην εντολή `s' δεν υπάρχουν αρχεία εισόδου δεν βρέθηκε προηγούμενη κανονική έκφραση η αριθμητική επιλογή στην εντολή `s' δεν μπορεί να είναι μηδέν η επιλογή `e' δεν υποστηρίζεται σφάλμα ανάγνωσης στο %s: %s τα αλφαριθμητικά για την εντολή `y' είναι διαφορετικού μεγέθους αναπάντεχο `,' αναπάντεχο `}' άγνωστη εντολή: `%c' άγνωστη επιλογή για το `s' αταίριαστο `{' μη τερματισμένη εντολή `s' μη τερματισμένη εντολή `y' μη τερματισμένη κανονικής έκφραση διεύθυνσης 