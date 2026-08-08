T1=100; % in K
T2=200;
T3=300;
kB = 8.617e-5; % in eV/K;
fT1 = 1./(1 + exp((E-Ef*ones(size(E)))/(kB*T1)));
fT2 = 1./(1 + exp( (E-Ef*ones(size(E)))/(kB*T2)));
fT3 = 1./(1 + exp( (E-Ef*ones(size(E)))/(kB*T3)));
figure(1); clf

plot(E,fTo,&#39;k&#39;,&#39;LineWidth&#39;,3);
grid on; hold on
plot(E,fT1,&#39;b--&#39;,&#39;LineWidth&#39;,2)
plot(E,fT2,&#39;r-.&#39;,&#39;LineWidth&#39;,2)
plot(E,fT3,&#39;m:&#39;,&#39;LineWidth&#39;,2)
axis([-0.2 1.3 -0.1 1.1])
set{1,&#39;Position&#39;,[34 88 634 538]};
xlabel(&#39;E (eV)&#39;); ylabel(&#39;f(E)&#39;);
title(&#39;Fermi-Dirac distribution functions at different temperatures&#39;)
legend(&#39;T=0 K&#39;,&#39;T=100 K&#39;,&#39;T=200 K&#39;,&#39;T=300 K&#39;,&#39;Location&#39;,&#39;SouthWest&#39;)
plot(Ef,0.5,&#39;k.&#39;,&#39;MarkerSize&#39;,36)
