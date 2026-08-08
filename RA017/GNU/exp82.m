% Fermi distribution function calculation

kB = 8.617e-5; % eV/K
Ef = 0.56;     % Fermi level in eV
E = -0.2:0.0005:1.4; % Energy levels

% -------- T = 0 K --------
fT0 = zeros(size(E));

for k = 1:length(E)
    if E(k) < Ef
        fT0(k) = 1;
    elseif E(k) == Ef
        fT0(k) = 0.5;
    else
        fT0(k) = 0;
    end
end

% -------- Finite Temperatures --------
T1 = 100;
T2 = 200;
T3 = 300;

fT1 = 1 ./ (1 + exp((E - Ef) ./ (kB * T1)));
fT2 = 1 ./ (1 + exp((E - Ef) ./ (kB * T2)));
fT3 = 1 ./ (1 + exp((E - Ef) ./ (kB * T3)));

% -------- Plot --------
figure(1); clf;

plot(E, fT0, 'k', 'LineWidth', 3);
grid on; hold on;

plot(E, fT1, 'b--', 'LineWidth', 2);
plot(E, fT2, 'r-.', 'LineWidth', 2);
plot(E, fT3, 'm:', 'LineWidth', 2);

axis([-0.2 1.3 -0.1 1.1]);

set(gcf, 'Position', [34 88 634 538]);

xlabel('E (eV)');
ylabel('f(E)');
title('Fermi-Dirac distribution functions at different temperatures');

legend('T=0 K','T=100 K','T=200 K','T=300 K','Location','SouthWest');

plot(Ef, 0.5, 'k.', 'MarkerSize', 36);
