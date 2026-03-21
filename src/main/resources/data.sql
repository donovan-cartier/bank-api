INSERT INTO client (first_name, last_name, email) VALUES
                                                      ('Jean', 'Dupont', 'jean.dupont@example.com'),
                                                      ('Marie', 'Martin', 'marie.martin@example.com'),
                                                      ('Pierre', 'Bernard', 'pierre.bernard@example.com');

INSERT INTO account (iban, type, balance, client_id) VALUES
                                                         ('FR00 0000 0000 0000 0000 0000 001', 'CHECKING', 2450.00, 1),
                                                         ('FR00 0000 0000 0000 0000 0000 002', 'SAVINGS',  8900.00, 1),
                                                         ('FR00 0000 0000 0000 0000 0000 003', 'CHECKING', 540.75,  2),
                                                         ('FR00 0000 0000 0000 0000 0000 004', 'SAVINGS',  15200.00,2),
                                                         ('FR00 0000 0000 0000 0000 0000 005', 'CHECKING', 3100.00, 3),
                                                         ('FR00 0000 0000 0000 0000 0000 006', 'SAVINGS',  4750.50, 3);

INSERT INTO transaction (amount, type, description, date, account_id) VALUES
                                                                          (1800.00, 'CREDIT', 'Virement salaire',           '2026-03-01', 1),
                                                                          (650.00,  'DEBIT',  'Paiement loyer',             '2026-03-02', 1),
                                                                          (80.00,   'DEBIT',  'Facture électricité',        '2026-03-05', 1),
                                                                          (45.00,   'DEBIT',  'Abonnement internet',        '2026-03-06', 1),
                                                                          (200.00,  'DEBIT',  'Courses alimentaires',       '2026-03-10', 1),
                                                                          (120.00,  'DEBIT',  'Station carburant',          '2026-03-12', 1),
                                                                          (500.00,  'CREDIT', 'Virement depuis épargne',    '2026-03-14', 1),
                                                                          (35.00,   'DEBIT',  'Abonnement streaming',       '2026-03-15', 1),

                                                                          (500.00,  'CREDIT', 'Dépôt épargne mensuel',      '2026-03-01', 2),
                                                                          (200.00,  'DEBIT',  'Virement vers courant',      '2026-03-14', 2),
                                                                          (1000.00, 'CREDIT', 'Remboursement impôts',       '2026-03-18', 2),
                                                                          (150.00,  'CREDIT', 'Cadeau reçu',                '2026-03-19', 2),

                                                                          (1750.00, 'CREDIT', 'Virement salaire',           '2026-03-01', 3),
                                                                          (630.00,  'DEBIT',  'Paiement loyer',             '2026-03-03', 3),
                                                                          (60.00,   'DEBIT',  'Facture eau',                '2026-03-07', 3),
                                                                          (90.00,   'DEBIT',  'Facture téléphone',          '2026-03-08', 3),
                                                                          (180.00,  'DEBIT',  'Courses alimentaires',       '2026-03-11', 3),
                                                                          (250.00,  'CREDIT', 'Paiement prestation',        '2026-03-16', 3),

                                                                          (800.00,  'CREDIT', 'Dépôt épargne mensuel',      '2026-03-01', 4),
                                                                          (300.00,  'CREDIT', 'Retour sur investissement',  '2026-03-10', 4),
                                                                          (500.00,  'DEBIT',  'Assurance habitation',       '2026-03-15', 4),

                                                                          (2100.00, 'CREDIT', 'Virement salaire',           '2026-03-01', 5),
                                                                          (700.00,  'DEBIT',  'Paiement loyer',             '2026-03-02', 5),
                                                                          (95.00,   'DEBIT',  'Facture électricité',        '2026-03-04', 5),
                                                                          (55.00,   'DEBIT',  'Abonnement internet',        '2026-03-06', 5),
                                                                          (320.00,  'DEBIT',  'Courses alimentaires',       '2026-03-09', 5),
                                                                          (400.00,  'CREDIT', 'Prime exceptionnelle',       '2026-03-17', 5),

                                                                          (600.00,  'CREDIT', 'Dépôt épargne mensuel',      '2026-03-01', 6),
                                                                          (200.00,  'CREDIT', 'Intérêts versés',            '2026-03-10', 6),
                                                                          (1000.00, 'DEBIT',  'Réparation véhicule',        '2026-03-13', 6);