% Doping concentration range
nc = logspace(16, 22);

% Electron mobility
un = (5.1e18 + 92 * nc .^ 0.91) ./ (3.75e15 + nc .^ 0.91);

% Hole mobility
up = (2.90e15 + 47.7 * nc .^ 0.76) ./ (5.86e12 + nc .^ 0.76);

% Plot
figure(1); clf;

semilogx(nc, un, 'r', 'LineWidth', 2); % Electron
hold on;
semilogx(nc, up, 'b', 'LineWidth', 2); % Hole

grid on;

% Labels & title
title('Mobility versus Doping');
xlabel('Doping Concentration (cm^{-3})');
ylabel('Mobility (cm^2/V·s)');

% Text annotations
text(8.0e16, 1200, 'Electron Mobility');
text(5.0e14, 660, 'Hole Mobility');
