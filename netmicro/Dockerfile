FROM mcr.microsoft.com/dotnet/aspnet:7.0 AS base
WORKDIR /app
EXPOSE 80
EXPOSE 443

FROM mcr.microsoft.com/dotnet/sdk:7.0 AS build
WORKDIR /src
COPY ["netmicro.csproj", "./"]
RUN dotnet restore "netmicro.csproj"
COPY . .
WORKDIR "/src"
RUN dotnet build "netmicro.csproj" -c Release -o /app/build

FROM build AS publish
RUN dotnet publish "netmicro.csproj" -c Release -o /app/publish

FROM base AS final
WORKDIR /app
COPY --from=publish /app/publish .
ENTRYPOINT ["dotnet", "netmicro.dll", "--urls", "http://+:80"]