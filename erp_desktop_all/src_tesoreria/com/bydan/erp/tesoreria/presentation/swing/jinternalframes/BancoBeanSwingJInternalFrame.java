/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.tesoreria.util.BancoConstantesFunciones;
import com.bydan.erp.tesoreria.util.BancoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.BancoParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.BancoBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class BancoBeanSwingJInternalFrame extends BancoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(BancoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Banco> bancoValidator = new ClassValidator<Banco>(Banco.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Banco banco;	
	public Banco bancoAux;
	public Banco bancoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Banco bancoTotales;
	public Long idBancoActual;
	public Long iIdNuevoBanco=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboTipoBanco="";

	public List<TipoBanco> tipobancosForeignKey;

	public List<TipoBanco> gettipobancosForeignKey() {
		return tipobancosForeignKey;
	}

	public void settipobancosForeignKey(List<TipoBanco> tipobancosForeignKey) {
		this.tipobancosForeignKey = tipobancosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoBanco tipobancoForeignKey;

	public TipoBanco gettipobancoForeignKey() {
		return tipobancoForeignKey;
	}

	public void settipobancoForeignKey(TipoBanco tipobancoForeignKey) {
		this.tipobancoForeignKey = tipobancoForeignKey;
	}

	public String sFinalQueryComboCuentaContableDebito="";

	public List<CuentaContable> cuentacontabledebitosForeignKey;

	public List<CuentaContable> getcuentacontabledebitosForeignKey() {
		return cuentacontabledebitosForeignKey;
	}

	public void setcuentacontabledebitosForeignKey(List<CuentaContable> cuentacontabledebitosForeignKey) {
		this.cuentacontabledebitosForeignKey = cuentacontabledebitosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontabledebitoForeignKey;

	public CuentaContable getcuentacontabledebitoForeignKey() {
		return cuentacontabledebitoForeignKey;
	}

	public void setcuentacontabledebitoForeignKey(CuentaContable cuentacontabledebitoForeignKey) {
		this.cuentacontabledebitoForeignKey = cuentacontabledebitoForeignKey;
	}

	public String sFinalQueryComboCuentaContableCredito="";

	public List<CuentaContable> cuentacontablecreditosForeignKey;

	public List<CuentaContable> getcuentacontablecreditosForeignKey() {
		return cuentacontablecreditosForeignKey;
	}

	public void setcuentacontablecreditosForeignKey(List<CuentaContable> cuentacontablecreditosForeignKey) {
		this.cuentacontablecreditosForeignKey = cuentacontablecreditosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontablecreditoForeignKey;

	public CuentaContable getcuentacontablecreditoForeignKey() {
		return cuentacontablecreditoForeignKey;
	}

	public void setcuentacontablecreditoForeignKey(CuentaContable cuentacontablecreditoForeignKey) {
		this.cuentacontablecreditoForeignKey = cuentacontablecreditoForeignKey;
	}

	public String sFinalQueryComboFormato1="";

	public List<Formato> formato1sForeignKey;

	public List<Formato> getformato1sForeignKey() {
		return formato1sForeignKey;
	}

	public void setformato1sForeignKey(List<Formato> formato1sForeignKey) {
		this.formato1sForeignKey = formato1sForeignKey;
	}

	//OBJETO FK ACTUAL
	public Formato formato1ForeignKey;

	public Formato getformato1ForeignKey() {
		return formato1ForeignKey;
	}

	public void setformato1ForeignKey(Formato formato1ForeignKey) {
		this.formato1ForeignKey = formato1ForeignKey;
	}

	public String sFinalQueryComboFormato2="";

	public List<Formato> formato2sForeignKey;

	public List<Formato> getformato2sForeignKey() {
		return formato2sForeignKey;
	}

	public void setformato2sForeignKey(List<Formato> formato2sForeignKey) {
		this.formato2sForeignKey = formato2sForeignKey;
	}

	//OBJETO FK ACTUAL
	public Formato formato2ForeignKey;

	public Formato getformato2ForeignKey() {
		return formato2ForeignKey;
	}

	public void setformato2ForeignKey(Formato formato2ForeignKey) {
		this.formato2ForeignKey = formato2ForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosCuentaBancoPunVen=false;

	public Boolean getIsTienePermisosCuentaBancoPunVen() {
		return isTienePermisosCuentaBancoPunVen;
	}

	public void setIsTienePermisosCuentaBancoPunVen(Boolean isTienePermisosCuentaBancoPunVen) {
		this.isTienePermisosCuentaBancoPunVen= isTienePermisosCuentaBancoPunVen;
	}


	public Boolean isTienePermisosPoliticasCliente=false;

	public Boolean getIsTienePermisosPoliticasCliente() {
		return isTienePermisosPoliticasCliente;
	}

	public void setIsTienePermisosPoliticasCliente(Boolean isTienePermisosPoliticasCliente) {
		this.isTienePermisosPoliticasCliente= isTienePermisosPoliticasCliente;
	}


	public Boolean isTienePermisosFormaPagoPuntoVenta=false;

	public Boolean getIsTienePermisosFormaPagoPuntoVenta() {
		return isTienePermisosFormaPagoPuntoVenta;
	}

	public void setIsTienePermisosFormaPagoPuntoVenta(Boolean isTienePermisosFormaPagoPuntoVenta) {
		this.isTienePermisosFormaPagoPuntoVenta= isTienePermisosFormaPagoPuntoVenta;
	}


	public Boolean isTienePermisosTarjetaCredito=false;

	public Boolean getIsTienePermisosTarjetaCredito() {
		return isTienePermisosTarjetaCredito;
	}

	public void setIsTienePermisosTarjetaCredito(Boolean isTienePermisosTarjetaCredito) {
		this.isTienePermisosTarjetaCredito= isTienePermisosTarjetaCredito;
	}


	public Boolean isTienePermisosAutoriPago=false;

	public Boolean getIsTienePermisosAutoriPago() {
		return isTienePermisosAutoriPago;
	}

	public void setIsTienePermisosAutoriPago(Boolean isTienePermisosAutoriPago) {
		this.isTienePermisosAutoriPago= isTienePermisosAutoriPago;
	}


	public Boolean isTienePermisosTipoCuentaBancoGeneral=false;

	public Boolean getIsTienePermisosTipoCuentaBancoGeneral() {
		return isTienePermisosTipoCuentaBancoGeneral;
	}

	public void setIsTienePermisosTipoCuentaBancoGeneral(Boolean isTienePermisosTipoCuentaBancoGeneral) {
		this.isTienePermisosTipoCuentaBancoGeneral= isTienePermisosTipoCuentaBancoGeneral;
	}


	public Boolean isTienePermisosCuentaBanco=false;

	public Boolean getIsTienePermisosCuentaBanco() {
		return isTienePermisosCuentaBanco;
	}

	public void setIsTienePermisosCuentaBanco(Boolean isTienePermisosCuentaBanco) {
		this.isTienePermisosCuentaBanco= isTienePermisosCuentaBanco;
	}

	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoBanco;
	public Boolean isPermisoNuevoBanco;
	public Boolean isPermisoActualizarBanco;
	public Boolean isPermisoActualizarOriginalBanco;
	public Boolean isPermisoEliminarBanco;
	public Boolean isPermisoGuardarCambiosBanco;
	public Boolean isPermisoConsultaBanco;
	public Boolean isPermisoBusquedaBanco;
	public Boolean isPermisoReporteBanco;
	public Boolean isPermisoPaginacionMedioBanco;
	public Boolean isPermisoPaginacionAltoBanco;
	public Boolean isPermisoPaginacionTodoBanco;
	public Boolean isPermisoCopiarBanco;
	public Boolean isPermisoVerFormBanco;
	public Boolean isPermisoDuplicarBanco;
	public Boolean isPermisoOrdenBanco;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public BancoParameterReturnGeneral bancoReturnGeneral;
	public BancoParameterReturnGeneral bancoParameterGeneral;
	
	

	public AutoriPagoLogic autoripagoLogic=null;

	public AutoriPagoLogic getAutoriPagoLogic() {
		return autoripagoLogic;
	}

	public void setAutoriPagoLogic(AutoriPagoLogic autoripagoLogic) {
		this.autoripagoLogic = autoripagoLogic;
	}


	public TarjetaCreditoLogic tarjetacreditoLogic=null;

	public TarjetaCreditoLogic getTarjetaCreditoLogic() {
		return tarjetacreditoLogic;
	}

	public void setTarjetaCreditoLogic(TarjetaCreditoLogic tarjetacreditoLogic) {
		this.tarjetacreditoLogic = tarjetacreditoLogic;
	}


	public CuentaBancoPunVenLogic cuentabancopunvenLogic=null;

	public CuentaBancoPunVenLogic getCuentaBancoPunVenLogic() {
		return cuentabancopunvenLogic;
	}

	public void setCuentaBancoPunVenLogic(CuentaBancoPunVenLogic cuentabancopunvenLogic) {
		this.cuentabancopunvenLogic = cuentabancopunvenLogic;
	}


	public PoliticasClienteLogic politicasclienteLogic=null;

	public PoliticasClienteLogic getPoliticasClienteLogic() {
		return politicasclienteLogic;
	}

	public void setPoliticasClienteLogic(PoliticasClienteLogic politicasclienteLogic) {
		this.politicasclienteLogic = politicasclienteLogic;
	}


	public FormaPagoPuntoVentaLogic formapagopuntoventaLogic=null;

	public FormaPagoPuntoVentaLogic getFormaPagoPuntoVentaLogic() {
		return formapagopuntoventaLogic;
	}

	public void setFormaPagoPuntoVentaLogic(FormaPagoPuntoVentaLogic formapagopuntoventaLogic) {
		this.formapagopuntoventaLogic = formapagopuntoventaLogic;
	}


	public CuentaBancoLogic cuentabancoLogic=null;

	public CuentaBancoLogic getCuentaBancoLogic() {
		return cuentabancoLogic;
	}

	public void setCuentaBancoLogic(CuentaBancoLogic cuentabancoLogic) {
		this.cuentabancoLogic = cuentabancoLogic;
	}


	public TipoCuentaBancoGeneralLogic tipocuentabancogeneralLogic=null;

	public TipoCuentaBancoGeneralLogic getTipoCuentaBancoGeneralLogic() {
		return tipocuentabancogeneralLogic;
	}

	public void setTipoCuentaBancoGeneralLogic(TipoCuentaBancoGeneralLogic tipocuentabancogeneralLogic) {
		this.tipocuentabancogeneralLogic = tipocuentabancogeneralLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoBanco=false;
	public Boolean esParaAccionDesdeFormularioBanco=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected BancoSessionBeanAdditional bancoSessionBeanAdditional=null;
	
	public BancoSessionBeanAdditional getBancoSessionBeanAdditional() {
		return this.bancoSessionBeanAdditional;
	}
	
	public void setBancoSessionBeanAdditional(BancoSessionBeanAdditional bancoSessionBeanAdditional) {
		try {
			this.bancoSessionBeanAdditional=bancoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected BancoBeanSwingJInternalFrameAdditional bancoBeanSwingJInternalFrameAdditional=null;
	//public class BancoBeanSwingJInternalFrame
	
	public BancoBeanSwingJInternalFrameAdditional getBancoBeanSwingJInternalFrameAdditional() {
		return this.bancoBeanSwingJInternalFrameAdditional;
	}
	
	public void setBancoBeanSwingJInternalFrameAdditional(BancoBeanSwingJInternalFrameAdditional bancoBeanSwingJInternalFrameAdditional) {
		try {
			this.bancoBeanSwingJInternalFrameAdditional=bancoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public BancoLogic bancoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Banco bancoBean;
	public BancoConstantesFunciones bancoConstantesFunciones;
	//public BancoParameterReturnGeneral bancoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public TipoBancoLogic tipobancoLogic;
	public CuentaContableLogic cuentacontabledebitoLogic;
	public CuentaContableLogic cuentacontablecreditoLogic;
	public FormatoLogic formato1Logic;
	public FormatoLogic formato2Logic;
	
	//PARAMETROS
	
	
	//public List<Banco> bancos;	
	//public List<Banco> bancosEliminados;
	//public List<Banco> bancosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoBanco=false;
	public Boolean isVisibilidadCeldaDuplicarBanco=true;
	public Boolean isVisibilidadCeldaCopiarBanco=true;
	public Boolean isVisibilidadCeldaVerFormBanco=true;
	public Boolean isVisibilidadCeldaOrdenBanco=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesBanco=false;
	public Boolean isVisibilidadCeldaModificarBanco=false;
	public Boolean isVisibilidadCeldaActualizarBanco=false;
	public Boolean isVisibilidadCeldaEliminarBanco=false;
	public Boolean isVisibilidadCeldaCancelarBanco=false;
	public Boolean isVisibilidadCeldaGuardarBanco=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosBanco=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorCodigoInstitucion=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdCuentaContableCredito=false;
	public Boolean isVisibilidadFK_IdCuentaContableDebito=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFormato1=false;
	public Boolean isVisibilidadFK_IdFormato2=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoBanco=false;
	
	public Long getiIdNuevoBanco() {
		return this.iIdNuevoBanco;
	}

	public void setiIdNuevoBanco(Long iIdNuevoBanco) {
		this.iIdNuevoBanco = iIdNuevoBanco;
	}
	
	public Long getidBancoActual() {
		return this.idBancoActual;
	}

	public void setidBancoActual(Long idBancoActual) {
		this.idBancoActual = idBancoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Banco getbanco() {
		return this.banco;
	}

	public void setbanco(Banco banco) {
		this.banco = banco;
	}
	
	public Banco getbancoAux() {
		return this.bancoAux;
	}

	public void setbancoAux(Banco bancoAux) {
		this.bancoAux = bancoAux;
	}				
	
	public Banco getbancoAnterior() {
		return this.bancoAnterior;
	}

	public void setbancoAnterior(Banco bancoAnterior) {
		this.bancoAnterior = bancoAnterior;
	}	
	
	public Banco getbancoTotales() {
		return this.bancoTotales;
	}

	public void setbancoTotales(Banco bancoTotales) {
		this.bancoTotales = bancoTotales;
	}	
	
	public Banco getbancoBean() {
		return this.bancoBean;
	}

	public void setbancoBean(Banco bancoBean) {
		this.bancoBean = bancoBean;
	}	
	
	public BancoParameterReturnGeneral getbancoReturnGeneral() {
		return this.bancoReturnGeneral;
	}

	public void setbancoReturnGeneral(BancoParameterReturnGeneral bancoReturnGeneral) {
		this.bancoReturnGeneral = bancoReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String codigo_institucionBusquedaPorCodigoInstitucion="";

	public String getcodigo_institucionBusquedaPorCodigoInstitucion() {
		return this.codigo_institucionBusquedaPorCodigoInstitucion;
	}

	public void setcodigo_institucionBusquedaPorCodigoInstitucion(String codigo_institucionBusquedaPorCodigoInstitucion) {
		this.codigo_institucionBusquedaPorCodigoInstitucion = codigo_institucionBusquedaPorCodigoInstitucion;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_cuenta_contable_creditoFK_IdCuentaContableCredito=null;

	public Long getid_cuenta_contable_creditoFK_IdCuentaContableCredito() {
		return this.id_cuenta_contable_creditoFK_IdCuentaContableCredito;
	}

	public void setid_cuenta_contable_creditoFK_IdCuentaContableCredito(Long id_cuenta_contable_creditoFK_IdCuentaContableCredito) {
		this.id_cuenta_contable_creditoFK_IdCuentaContableCredito = id_cuenta_contable_creditoFK_IdCuentaContableCredito;
	}

	public Long id_cuenta_contable_debitoFK_IdCuentaContableDebito=null;

	public Long getid_cuenta_contable_debitoFK_IdCuentaContableDebito() {
		return this.id_cuenta_contable_debitoFK_IdCuentaContableDebito;
	}

	public void setid_cuenta_contable_debitoFK_IdCuentaContableDebito(Long id_cuenta_contable_debitoFK_IdCuentaContableDebito) {
		this.id_cuenta_contable_debitoFK_IdCuentaContableDebito = id_cuenta_contable_debitoFK_IdCuentaContableDebito;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_formato1FK_IdFormato1=null;

	public Long getid_formato1FK_IdFormato1() {
		return this.id_formato1FK_IdFormato1;
	}

	public void setid_formato1FK_IdFormato1(Long id_formato1FK_IdFormato1) {
		this.id_formato1FK_IdFormato1 = id_formato1FK_IdFormato1;
	}

	public Long id_formato2FK_IdFormato2=null;

	public Long getid_formato2FK_IdFormato2() {
		return this.id_formato2FK_IdFormato2;
	}

	public void setid_formato2FK_IdFormato2(Long id_formato2FK_IdFormato2) {
		this.id_formato2FK_IdFormato2 = id_formato2FK_IdFormato2;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_bancoFK_IdTipoBanco=-1L;

	public Long getid_tipo_bancoFK_IdTipoBanco() {
		return this.id_tipo_bancoFK_IdTipoBanco;
	}

	public void setid_tipo_bancoFK_IdTipoBanco(Long id_tipo_bancoFK_IdTipoBanco) {
		this.id_tipo_bancoFK_IdTipoBanco = id_tipo_bancoFK_IdTipoBanco;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public BancoLogic getBancoLogic()	{		
		return bancoLogic;
	}

	public void setBancoLogic(BancoLogic bancoLogic) {
		this.bancoLogic = bancoLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoBanco() {
		return isEsNuevoBanco;
	}

	public void setIsEsNuevoBanco(Boolean isEsNuevoBanco) {
		this.isEsNuevoBanco = isEsNuevoBanco;
	}

	public Boolean getEsParaAccionDesdeFormularioBanco() {
		return esParaAccionDesdeFormularioBanco;
	}
	
	public void setEsParaAccionDesdeFormularioBanco(Boolean esParaAccionDesdeFormularioBanco) {
		this.esParaAccionDesdeFormularioBanco = esParaAccionDesdeFormularioBanco;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.bancoSessionBean==null) {
				this.bancoSessionBean=new BancoSessionBean();
			}

			if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(bancoSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.bancoSessionBean==null) {
				this.bancoSessionBean=new BancoSessionBean();
			}

			if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(bancoSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTipoBancosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipobancosForeignKey=new ArrayList<TipoBanco>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoBancoLogic tipobancoLogic=new TipoBancoLogic();

			//tipobancoLogic.getTipoBancoDataAccess().setIsForForeingKeyData(true);

			if(this.bancoSessionBean==null) {
				this.bancoSessionBean=new BancoSessionBean();
			}

			if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionTipoBanco()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipobancoLogic.getTipoBancoDataAccess().setIsForForeingKeyData(true);

					tipobancoLogic.getTodosTipoBancosWithConnection(sFinalQuery,new Pagination());

					this.tipobancosForeignKey=tipobancoLogic.getTipoBancos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoBanco(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancoLogic.getEntityWithConnection(bancoSessionBean.getlidTipoBancoActual());
					this.tipobancosForeignKey.add(tipobancoLogic.getTipoBanco());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosCuentaContableDebitosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContable cuentacontabledebitoNulo = new CuentaContable();

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.bancoSessionBean==null) {
				this.bancoSessionBean=new BancoSessionBean();
			}

			if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontabledebitoLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontabledebitosForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.cuentacontabledebitosForeignKey.add(0, cuentacontabledebitoNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableDebito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(bancoSessionBean.getlidCuentaContableDebitoActual());
					this.cuentacontabledebitosForeignKey.add(cuentacontableLogic.getCuentaContable());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosCuentaContableCreditosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContable cuentacontablecreditoNulo = new CuentaContable();

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.bancoSessionBean==null) {
				this.bancoSessionBean=new BancoSessionBean();
			}

			if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontablecreditoLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablecreditosForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.cuentacontablecreditosForeignKey.add(0, cuentacontablecreditoNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableCredito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(bancoSessionBean.getlidCuentaContableCreditoActual());
					this.cuentacontablecreditosForeignKey.add(cuentacontableLogic.getCuentaContable());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosFormato1sForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formato1sForeignKey=new ArrayList<Formato>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Formato formato1Nulo = new Formato();

			FormatoLogic formatoLogic=new FormatoLogic();

			//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

			if(this.bancoSessionBean==null) {
				this.bancoSessionBean=new BancoSessionBean();
			}

			if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionFormato1()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formato1Logic.getFormatoDataAccess().setIsForForeingKeyData(true);

					formatoLogic.getTodosFormatosWithConnection(sFinalQuery,new Pagination());

					this.formato1sForeignKey=formatoLogic.getFormatos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.formato1sForeignKey.add(0, formato1Nulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormato1(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getEntityWithConnection(bancoSessionBean.getlidFormato1Actual());
					this.formato1sForeignKey.add(formatoLogic.getFormato());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosFormato2sForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formato2sForeignKey=new ArrayList<Formato>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Formato formato2Nulo = new Formato();

			FormatoLogic formatoLogic=new FormatoLogic();

			//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

			if(this.bancoSessionBean==null) {
				this.bancoSessionBean=new BancoSessionBean();
			}

			if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionFormato2()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formato2Logic.getFormatoDataAccess().setIsForForeingKeyData(true);

					formatoLogic.getTodosFormatosWithConnection(sFinalQuery,new Pagination());

					this.formato2sForeignKey=formatoLogic.getFormatos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.formato2sForeignKey.add(0, formato2Nulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormato2(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getEntityWithConnection(bancoSessionBean.getlidFormato2Actual());
					this.formato2sForeignKey.add(formatoLogic.getFormato());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.banco!=null) {
						this.banco.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormBanco!=null) {
						this.jInternalFrameDetalleFormBanco.jComboBoxid_empresaBanco.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaBanco.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormBanco!=null) {
						if(this.jInternalFrameDetalleFormBanco.jComboBoxid_empresaBanco.getItemCount()>0) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_empresaBanco.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaBancoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaBancoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaBancoGenerico!=null && jComboBoxid_empresaBancoGenerico.getItemCount()>0) {
					jComboBoxid_empresaBancoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.banco!=null) {
						this.banco.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormBanco!=null) {
						this.jInternalFrameDetalleFormBanco.jComboBoxid_sucursalBanco.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalBanco.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormBanco!=null) {
						if(this.jInternalFrameDetalleFormBanco.jComboBoxid_sucursalBanco.getItemCount()>0) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_sucursalBanco.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalBancoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalBancoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalBancoGenerico!=null && jComboBoxid_sucursalBancoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalBancoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoBancoForeignKey(Long idTipoBancoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoBanco  tipobancoTemp=null;

			for(TipoBanco tipobancoAux:tipobancosForeignKey) {
				if(tipobancoAux.getId()!=null && tipobancoAux.getId().equals(idTipoBancoSeleccionado)) {
					tipobancoTemp=tipobancoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipobancoTemp!=null) {

					if(this.banco!=null) {
						this.banco.setTipoBanco(tipobancoTemp);
					}

					if(this.jInternalFrameDetalleFormBanco!=null) {
						this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.setSelectedItem(tipobancoTemp);
					}
				} else {
					//jComboBoxid_tipo_bancoBanco.setSelectedItem(tipobancoTemp);
					if(this.jInternalFrameDetalleFormBanco!=null) {
						if(this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.getItemCount()>0) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoBanco") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipobancoTemp!=null && jComboBoxid_tipo_bancoFK_IdTipoBancoBanco!=null) {
						jComboBoxid_tipo_bancoFK_IdTipoBancoBanco.setSelectedItem(tipobancoTemp);
					} else {
						if(jComboBoxid_tipo_bancoFK_IdTipoBancoBanco!=null) {
							//jComboBoxid_tipo_bancoFK_IdTipoBancoBanco.setSelectedItem(tipobancoTemp);
							if(jComboBoxid_tipo_bancoFK_IdTipoBancoBanco.getItemCount()>0) {
								jComboBoxid_tipo_bancoFK_IdTipoBancoBanco.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoBancoForeignKeyDescripcion(Long idTipoBancoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoBanco  tipobancoTemp=null;

			for(TipoBanco tipobancoAux:tipobancosForeignKey) {
				if(tipobancoAux.getId()!=null && tipobancoAux.getId().equals(idTipoBancoSeleccionado)) {
					tipobancoTemp=tipobancoAux;
					break;
				}
			}


			sDescripcion=TipoBancoConstantesFunciones.getTipoBancoDescripcion(tipobancoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoBancoForeignKeyGenerico(Long idTipoBancoSeleccionado,JComboBox jComboBoxid_tipo_bancoBancoGenerico)throws Exception
	{
		try
		{
			TipoBanco  tipobancoTemp=null;

			for(TipoBanco tipobancoAux:tipobancosForeignKey) {
				if(tipobancoAux.getId()!=null && tipobancoAux.getId().equals(idTipoBancoSeleccionado)) {
					tipobancoTemp=tipobancoAux;
					break;
				}
			}

			if(tipobancoTemp!=null) {
				jComboBoxid_tipo_bancoBancoGenerico.setSelectedItem(tipobancoTemp);
			} else {
				if(jComboBoxid_tipo_bancoBancoGenerico!=null && jComboBoxid_tipo_bancoBancoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_bancoBancoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableDebitoForeignKey(Long idCuentaContableDebitoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledebitoTemp=null;

			for(CuentaContable cuentacontabledebitoAux:cuentacontabledebitosForeignKey) {
				if(cuentacontabledebitoAux.getId()!=null && cuentacontabledebitoAux.getId().equals(idCuentaContableDebitoSeleccionado)) {
					cuentacontabledebitoTemp=cuentacontabledebitoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontabledebitoTemp!=null) {

					if(this.banco!=null) {
						this.banco.setCuentaContableDebito(cuentacontabledebitoTemp);
					}

					if(this.jInternalFrameDetalleFormBanco!=null) {
						this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_debitoBanco.setSelectedItem(cuentacontabledebitoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_debitoBanco.setSelectedItem(cuentacontabledebitoTemp);
					if(this.jInternalFrameDetalleFormBanco!=null) {
						if(this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_debitoBanco.getItemCount()>0) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_debitoBanco.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualCuentaContableDebitoForeignKeyDescripcion(Long idCuentaContableDebitoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontabledebitoTemp=null;

			for(CuentaContable cuentacontabledebitoAux:cuentacontabledebitosForeignKey) {
				if(cuentacontabledebitoAux.getId()!=null && cuentacontabledebitoAux.getId().equals(idCuentaContableDebitoSeleccionado)) {
					cuentacontabledebitoTemp=cuentacontabledebitoAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontabledebitoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableDebitoForeignKeyGenerico(Long idCuentaContableDebitoSeleccionado,JComboBox jComboBoxid_cuenta_contable_debitoBancoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledebitoTemp=null;

			for(CuentaContable cuentacontabledebitoAux:cuentacontabledebitosForeignKey) {
				if(cuentacontabledebitoAux.getId()!=null && cuentacontabledebitoAux.getId().equals(idCuentaContableDebitoSeleccionado)) {
					cuentacontabledebitoTemp=cuentacontabledebitoAux;
					break;
				}
			}

			if(cuentacontabledebitoTemp!=null) {
				jComboBoxid_cuenta_contable_debitoBancoGenerico.setSelectedItem(cuentacontabledebitoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_debitoBancoGenerico!=null && jComboBoxid_cuenta_contable_debitoBancoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_debitoBancoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableCreditoForeignKey(Long idCuentaContableCreditoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontablecreditoTemp!=null) {

					if(this.banco!=null) {
						this.banco.setCuentaContableCredito(cuentacontablecreditoTemp);
					}

					if(this.jInternalFrameDetalleFormBanco!=null) {
						this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_creditoBanco.setSelectedItem(cuentacontablecreditoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_creditoBanco.setSelectedItem(cuentacontablecreditoTemp);
					if(this.jInternalFrameDetalleFormBanco!=null) {
						if(this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_creditoBanco.getItemCount()>0) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_creditoBanco.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualCuentaContableCreditoForeignKeyDescripcion(Long idCuentaContableCreditoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontablecreditoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableCreditoForeignKeyGenerico(Long idCuentaContableCreditoSeleccionado,JComboBox jComboBoxid_cuenta_contable_creditoBancoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}

			if(cuentacontablecreditoTemp!=null) {
				jComboBoxid_cuenta_contable_creditoBancoGenerico.setSelectedItem(cuentacontablecreditoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_creditoBancoGenerico!=null && jComboBoxid_cuenta_contable_creditoBancoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_creditoBancoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormato1ForeignKey(Long idFormato1Seleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Formato  formato1Temp=null;

			for(Formato formato1Aux:formato1sForeignKey) {
				if(formato1Aux.getId()!=null && formato1Aux.getId().equals(idFormato1Seleccionado)) {
					formato1Temp=formato1Aux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formato1Temp!=null) {

					if(this.banco!=null) {
						this.banco.setFormato1(formato1Temp);
					}

					if(this.jInternalFrameDetalleFormBanco!=null) {
						this.jInternalFrameDetalleFormBanco.jComboBoxid_formato1Banco.setSelectedItem(formato1Temp);
					}
				} else {
					//jComboBoxid_formato1Banco.setSelectedItem(formato1Temp);
					if(this.jInternalFrameDetalleFormBanco!=null) {
						if(this.jInternalFrameDetalleFormBanco.jComboBoxid_formato1Banco.getItemCount()>0) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_formato1Banco.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualFormato1ForeignKeyDescripcion(Long idFormato1Seleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Formato  formato1Temp=null;

			for(Formato formato1Aux:formato1sForeignKey) {
				if(formato1Aux.getId()!=null && formato1Aux.getId().equals(idFormato1Seleccionado)) {
					formato1Temp=formato1Aux;
					break;
				}
			}


			sDescripcion=FormatoConstantesFunciones.getFormatoDescripcion(formato1Temp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormato1ForeignKeyGenerico(Long idFormato1Seleccionado,JComboBox jComboBoxid_formato1BancoGenerico)throws Exception
	{
		try
		{
			Formato  formato1Temp=null;

			for(Formato formato1Aux:formato1sForeignKey) {
				if(formato1Aux.getId()!=null && formato1Aux.getId().equals(idFormato1Seleccionado)) {
					formato1Temp=formato1Aux;
					break;
				}
			}

			if(formato1Temp!=null) {
				jComboBoxid_formato1BancoGenerico.setSelectedItem(formato1Temp);
			} else {
				if(jComboBoxid_formato1BancoGenerico!=null && jComboBoxid_formato1BancoGenerico.getItemCount()>0) {
					jComboBoxid_formato1BancoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormato2ForeignKey(Long idFormato2Seleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Formato  formato2Temp=null;

			for(Formato formato2Aux:formato2sForeignKey) {
				if(formato2Aux.getId()!=null && formato2Aux.getId().equals(idFormato2Seleccionado)) {
					formato2Temp=formato2Aux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formato2Temp!=null) {

					if(this.banco!=null) {
						this.banco.setFormato2(formato2Temp);
					}

					if(this.jInternalFrameDetalleFormBanco!=null) {
						this.jInternalFrameDetalleFormBanco.jComboBoxid_formato2Banco.setSelectedItem(formato2Temp);
					}
				} else {
					//jComboBoxid_formato2Banco.setSelectedItem(formato2Temp);
					if(this.jInternalFrameDetalleFormBanco!=null) {
						if(this.jInternalFrameDetalleFormBanco.jComboBoxid_formato2Banco.getItemCount()>0) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_formato2Banco.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualFormato2ForeignKeyDescripcion(Long idFormato2Seleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Formato  formato2Temp=null;

			for(Formato formato2Aux:formato2sForeignKey) {
				if(formato2Aux.getId()!=null && formato2Aux.getId().equals(idFormato2Seleccionado)) {
					formato2Temp=formato2Aux;
					break;
				}
			}


			sDescripcion=FormatoConstantesFunciones.getFormatoDescripcion(formato2Temp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormato2ForeignKeyGenerico(Long idFormato2Seleccionado,JComboBox jComboBoxid_formato2BancoGenerico)throws Exception
	{
		try
		{
			Formato  formato2Temp=null;

			for(Formato formato2Aux:formato2sForeignKey) {
				if(formato2Aux.getId()!=null && formato2Aux.getId().equals(idFormato2Seleccionado)) {
					formato2Temp=formato2Aux;
					break;
				}
			}

			if(formato2Temp!=null) {
				jComboBoxid_formato2BancoGenerico.setSelectedItem(formato2Temp);
			} else {
				if(jComboBoxid_formato2BancoGenerico!=null && jComboBoxid_formato2BancoGenerico.getItemCount()>0) {
					jComboBoxid_formato2BancoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Banco banco,JComboBox jComboBoxid_empresaBancoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaBancoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormBanco.jComboBoxid_empresaBanco.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaBancoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				banco.setid_empresa(empresaAux.getId());
				banco.setempresa_descripcion(BancoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				banco.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Banco banco,JComboBox jComboBoxid_sucursalBancoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalBancoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormBanco.jComboBoxid_sucursalBanco.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalBancoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				banco.setid_sucursal(sucursalAux.getId());
				banco.setsucursal_descripcion(BancoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				banco.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoBancoForeignKey(Banco banco,JComboBox jComboBoxid_tipo_bancoBancoGenerico)throws Exception
	{
		try
		{
			TipoBanco  tipobancoAux=new TipoBanco();

			if(jComboBoxid_tipo_bancoBancoGenerico==null) {
				tipobancoAux=(TipoBanco)this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.getSelectedItem();
			} else {
				tipobancoAux=(TipoBanco)jComboBoxid_tipo_bancoBancoGenerico.getSelectedItem();
			}

			if(tipobancoAux!=null && tipobancoAux.getId()!=null) {
				banco.setid_tipo_banco(tipobancoAux.getId());
				banco.settipobanco_descripcion(BancoConstantesFunciones.getTipoBancoDescripcion(tipobancoAux));
				banco.setTipoBanco(tipobancoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableDebitoForeignKey(Banco banco,JComboBox jComboBoxid_cuenta_contable_debitoBancoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_debitoBancoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_debitoBanco.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_debitoBancoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				banco.setid_cuenta_contable_debito(cuentacontableAux.getId());
				banco.setcuentacontabledebito_descripcion(BancoConstantesFunciones.getCuentaContableDebitoDescripcion(cuentacontableAux));
				banco.setCuentaContableDebito(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableCreditoForeignKey(Banco banco,JComboBox jComboBoxid_cuenta_contable_creditoBancoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_creditoBancoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_creditoBanco.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_creditoBancoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				banco.setid_cuenta_contable_credito(cuentacontableAux.getId());
				banco.setcuentacontablecredito_descripcion(BancoConstantesFunciones.getCuentaContableCreditoDescripcion(cuentacontableAux));
				banco.setCuentaContableCredito(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormato1ForeignKey(Banco banco,JComboBox jComboBoxid_formato1BancoGenerico)throws Exception
	{
		try
		{
			Formato  formatoAux=new Formato();

			if(jComboBoxid_formato1BancoGenerico==null) {
				formatoAux=(Formato)this.jInternalFrameDetalleFormBanco.jComboBoxid_formato1Banco.getSelectedItem();
			} else {
				formatoAux=(Formato)jComboBoxid_formato1BancoGenerico.getSelectedItem();
			}

			if(formatoAux!=null) {
				banco.setid_formato1(formatoAux.getId());
				banco.setformato1_descripcion(BancoConstantesFunciones.getFormato1Descripcion(formatoAux));
				banco.setFormato1(formatoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormato2ForeignKey(Banco banco,JComboBox jComboBoxid_formato2BancoGenerico)throws Exception
	{
		try
		{
			Formato  formatoAux=new Formato();

			if(jComboBoxid_formato2BancoGenerico==null) {
				formatoAux=(Formato)this.jInternalFrameDetalleFormBanco.jComboBoxid_formato2Banco.getSelectedItem();
			} else {
				formatoAux=(Formato)jComboBoxid_formato2BancoGenerico.getSelectedItem();
			}

			if(formatoAux!=null) {
				banco.setid_formato2(formatoAux.getId());
				banco.setformato2_descripcion(BancoConstantesFunciones.getFormato2Descripcion(formatoAux));
				banco.setFormato2(formatoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BancoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBanco!=null) { 
							this.jInternalFrameDetalleFormBanco.jComboBoxid_empresaBanco.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormBanco.jComboBoxid_empresaBanco.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBanco!=null) { 
					}

					if(!BancoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BancoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBanco!=null) { 
							this.jInternalFrameDetalleFormBanco.jComboBoxid_sucursalBanco.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormBanco.jComboBoxid_sucursalBanco.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBanco!=null) { 
					}

					if(!BancoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoBancosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoBanco=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BancoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBanco!=null) { 
							this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.removeAllItems();

							for(TipoBanco tipobanco:this.tipobancosForeignKey) {
								if(tipobanco.getes_defecto()) {
									this.bancoBean.setid_tipo_banco(tipobanco.getId());
								}

								this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.addItem(tipobanco);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBanco!=null) { 
					}

					if(!BancoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoBanco") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!BancoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_bancoFK_IdTipoBancoBanco.removeAllItems();

							for(TipoBanco tipobanco:this.tipobancosForeignKey) {
								this.jComboBoxid_tipo_bancoFK_IdTipoBancoBanco.addItem(tipobanco);
							}
						}

						if(!BancoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableDebitosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BancoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBanco!=null) { 
							this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_debitoBanco.removeAllItems();

							for(CuentaContable cuentacontabledebito:this.cuentacontabledebitosForeignKey) {
								this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_debitoBanco.addItem(cuentacontabledebito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBanco!=null) { 
					}

					if(!BancoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableCreditosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BancoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBanco!=null) { 
							this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_creditoBanco.removeAllItems();

							for(CuentaContable cuentacontablecredito:this.cuentacontablecreditosForeignKey) {
								this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_creditoBanco.addItem(cuentacontablecredito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBanco!=null) { 
					}

					if(!BancoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormato1sForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BancoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBanco!=null) { 
							this.jInternalFrameDetalleFormBanco.jComboBoxid_formato1Banco.removeAllItems();

							for(Formato formato1:this.formato1sForeignKey) {
								this.jInternalFrameDetalleFormBanco.jComboBoxid_formato1Banco.addItem(formato1);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBanco!=null) { 
					}

					if(!BancoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormato2sForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BancoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBanco!=null) { 
							this.jInternalFrameDetalleFormBanco.jComboBoxid_formato2Banco.removeAllItems();

							for(Formato formato2:this.formato2sForeignKey) {
								this.jInternalFrameDetalleFormBanco.jComboBoxid_formato2Banco.addItem(formato2);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBanco!=null) { 
					}

					if(!BancoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBanco!=null) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_empresaBanco.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormBanco!=null) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_empresaBanco.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBanco!=null) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_sucursalBanco.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormBanco!=null) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_sucursalBanco.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoBancoForeignKey(TipoBanco tipobanco,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBanco!=null) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.setSelectedItem(tipobanco);
						}
					} else {
						if(this.jInternalFrameDetalleFormBanco!=null) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_bancoFK_IdTipoBancoBanco.setSelectedItem(tipobanco);
						} else {
							this.jComboBoxid_tipo_bancoFK_IdTipoBancoBanco.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableDebitoForeignKey(CuentaContable cuentacontabledebito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBanco!=null) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_debitoBanco.setSelectedItem(cuentacontabledebito);
						}
					} else {
						if(this.jInternalFrameDetalleFormBanco!=null) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_debitoBanco.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableCreditoForeignKey(CuentaContable cuentacontablecredito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBanco!=null) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_creditoBanco.setSelectedItem(cuentacontablecredito);
						}
					} else {
						if(this.jInternalFrameDetalleFormBanco!=null) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_creditoBanco.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameFormato1ForeignKey(Formato formato1,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBanco!=null) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_formato1Banco.setSelectedItem(formato1);
						}
					} else {
						if(this.jInternalFrameDetalleFormBanco!=null) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_formato1Banco.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameFormato2ForeignKey(Formato formato2,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBanco!=null) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_formato2Banco.setSelectedItem(formato2);
						}
					} else {
						if(this.jInternalFrameDetalleFormBanco!=null) {
							this.jInternalFrameDetalleFormBanco.jComboBoxid_formato2Banco.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesBanco() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			BancoConstantesFunciones.refrescarForeignKeysDescripcionesBanco(this.bancoLogic.getBancos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			BancoConstantesFunciones.refrescarForeignKeysDescripcionesBanco(this.bancos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(TipoBanco.class));
		classes.add(new Classe(CuentaContable.class));
		classes.add(new Classe(Formato.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//bancoLogic.setBancos(this.bancos);
			bancoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public BancoParameterReturnGeneral getBancoParameterGeneral() {
		return this.bancoParameterGeneral;
	}
	
	public void setBancoParameterGeneral(BancoParameterReturnGeneral bancoParameterGeneral) {
		this.bancoParameterGeneral = bancoParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoBanco() {
		return isPermisoTodoBanco;
	}

	public void setIsPermisoTodoBanco(Boolean isPermisoTodoBanco) {
		this.isPermisoTodoBanco = isPermisoTodoBanco;
	}

	public Boolean getIsPermisoNuevoBanco() {
		return isPermisoNuevoBanco;
	}

	public void setIsPermisoNuevoBanco(Boolean isPermisoNuevoBanco) {
		this.isPermisoNuevoBanco = isPermisoNuevoBanco;
	}

	public Boolean getIsPermisoActualizarBanco() {
		return isPermisoActualizarBanco;
	}

	public void setIsPermisoActualizarBanco(Boolean isPermisoActualizarBanco) {
		this.isPermisoActualizarBanco = isPermisoActualizarBanco;
	}

	public Boolean getIsPermisoEliminarBanco() {
		return isPermisoEliminarBanco;
	}

	public void setIsPermisoEliminarBanco(Boolean isPermisoEliminarBanco) {
		this.isPermisoEliminarBanco = isPermisoEliminarBanco;
	}

	public Boolean getIsPermisoGuardarCambiosBanco() {
		return isPermisoGuardarCambiosBanco;
	}

	public void setIsPermisoGuardarCambiosBanco(Boolean isPermisoGuardarCambiosBanco) {
		this.isPermisoGuardarCambiosBanco = isPermisoGuardarCambiosBanco;
	}
	
	public Boolean getIsPermisoConsultaBanco() {
		return isPermisoConsultaBanco;
	}

	public void setIsPermisoConsultaBanco(Boolean isPermisoConsultaBanco) {
		this.isPermisoConsultaBanco = isPermisoConsultaBanco;
	}

	public Boolean getIsPermisoBusquedaBanco() {
		return isPermisoBusquedaBanco;
	}

	public void setIsPermisoBusquedaBanco(Boolean isPermisoBusquedaBanco) {
		this.isPermisoBusquedaBanco = isPermisoBusquedaBanco;
	}

	public Boolean getIsPermisoReporteBanco() {
		return isPermisoReporteBanco;
	}

	public void setIsPermisoReporteBanco(Boolean isPermisoReporteBanco) {
		this.isPermisoReporteBanco = isPermisoReporteBanco;
	}
	
	public Boolean getIsPermisoPaginacionMedioBanco() {
		return isPermisoPaginacionMedioBanco;
	}

	public void setIsPermisoPaginacionMedioBanco(Boolean isPermisoPaginacionMedioBanco) {
		this.isPermisoPaginacionMedioBanco = isPermisoPaginacionMedioBanco;
	}
	
	public Boolean getIsPermisoPaginacionTodoBanco() {
		return isPermisoPaginacionTodoBanco;
	}

	public void setIsPermisoPaginacionTodoBanco(Boolean isPermisoPaginacionTodoBanco) {
		this.isPermisoPaginacionTodoBanco = isPermisoPaginacionTodoBanco;
	}
	
	public Boolean getIsPermisoPaginacionAltoBanco() {
		return isPermisoPaginacionAltoBanco;
	}

	public void setIsPermisoPaginacionAltoBanco(Boolean isPermisoPaginacionAltoBanco) {
		this.isPermisoPaginacionAltoBanco = isPermisoPaginacionAltoBanco;
	}
	
	public Boolean getIsPermisoCopiarBanco() {
		return isPermisoCopiarBanco;
	}

	public void setIsPermisoCopiarBanco(Boolean isPermisoCopiarBanco) {
		this.isPermisoCopiarBanco = isPermisoCopiarBanco;
	}
	
	public Boolean getIsPermisoVerFormBanco() {
		return isPermisoVerFormBanco;
	}

	public void setIsPermisoVerFormBanco(Boolean isPermisoVerFormBanco) {
		this.isPermisoVerFormBanco = isPermisoVerFormBanco;
	}
	
	public Boolean getIsPermisoDuplicarBanco() {
		return isPermisoDuplicarBanco;
	}

	public void setIsPermisoDuplicarBanco(Boolean isPermisoDuplicarBanco) {
		this.isPermisoDuplicarBanco = isPermisoDuplicarBanco;
	}
	
	public Boolean getIsPermisoOrdenBanco() {
		return isPermisoOrdenBanco;
	}

	public void setIsPermisoOrdenBanco(Boolean isPermisoOrdenBanco) {
		this.isPermisoOrdenBanco = isPermisoOrdenBanco;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoBanco() {
		return isVisibilidadCeldaNuevoBanco;
	}

	public void setIsVisibilidadCeldaNuevoBanco(Boolean isVisibilidadCeldaNuevoBanco) {
		this.isVisibilidadCeldaNuevoBanco = isVisibilidadCeldaNuevoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarBanco() {
		return isVisibilidadCeldaDuplicarBanco;
	}

	public void setIsVisibilidadCeldaDuplicarBanco(Boolean isVisibilidadCeldaDuplicarBanco) {
		this.isVisibilidadCeldaDuplicarBanco = isVisibilidadCeldaDuplicarBanco;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarBanco() {
		return isVisibilidadCeldaCopiarBanco;
	}

	public void setIsVisibilidadCeldaCopiarBanco(Boolean isVisibilidadCeldaCopiarBanco) {
		this.isVisibilidadCeldaCopiarBanco = isVisibilidadCeldaCopiarBanco;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormBanco() {
		return isVisibilidadCeldaVerFormBanco;
	}

	public void setIsVisibilidadCeldaVerFormBanco(Boolean isVisibilidadCeldaVerFormBanco) {
		this.isVisibilidadCeldaVerFormBanco = isVisibilidadCeldaVerFormBanco;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenBanco() {
		return isVisibilidadCeldaOrdenBanco;
	}

	public void setIsVisibilidadCeldaOrdenBanco(Boolean isVisibilidadCeldaOrdenBanco) {
		this.isVisibilidadCeldaOrdenBanco = isVisibilidadCeldaOrdenBanco;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesBanco() {
		return isVisibilidadCeldaNuevoRelacionesBanco;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesBanco(Boolean isVisibilidadCeldaNuevoRelacionesBanco) {
		this.isVisibilidadCeldaNuevoRelacionesBanco = isVisibilidadCeldaNuevoRelacionesBanco;
	}
	
	public Boolean getIsVisibilidadCeldaModificarBanco() {
		return isVisibilidadCeldaModificarBanco;
	}

	public void setIsVisibilidadCeldaModificarBanco(Boolean isVisibilidadCeldaModificarBanco) {
		this.isVisibilidadCeldaModificarBanco = isVisibilidadCeldaModificarBanco;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarBanco() {
		return isVisibilidadCeldaActualizarBanco;
	}

	public void setIsVisibilidadCeldaActualizarBanco(Boolean isVisibilidadCeldaActualizarBanco) {
		this.isVisibilidadCeldaActualizarBanco = isVisibilidadCeldaActualizarBanco;
	}

	public Boolean getIsVisibilidadCeldaEliminarBanco() {
		return isVisibilidadCeldaEliminarBanco;
	}

	public void setIsVisibilidadCeldaEliminarBanco(Boolean isVisibilidadCeldaEliminarBanco) {
		this.isVisibilidadCeldaEliminarBanco = isVisibilidadCeldaEliminarBanco;
	}

	public Boolean getIsVisibilidadCeldaCancelarBanco() {
		return isVisibilidadCeldaCancelarBanco;
	}

	public void setIsVisibilidadCeldaCancelarBanco(Boolean isVisibilidadCeldaCancelarBanco) {
		this.isVisibilidadCeldaCancelarBanco = isVisibilidadCeldaCancelarBanco;
	}

	public Boolean getIsVisibilidadCeldaGuardarBanco() {
		return isVisibilidadCeldaGuardarBanco;
	}

	public void setIsVisibilidadCeldaGuardarBanco(Boolean isVisibilidadCeldaGuardarBanco) {
		this.isVisibilidadCeldaGuardarBanco = isVisibilidadCeldaGuardarBanco;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosBanco() {
		return isVisibilidadCeldaGuardarCambiosBanco;
	}

	public void setIsVisibilidadCeldaGuardarCambiosBanco(Boolean isVisibilidadCeldaGuardarCambiosBanco) {
		this.isVisibilidadCeldaGuardarCambiosBanco = isVisibilidadCeldaGuardarCambiosBanco;
	}
		
	public BancoSessionBean getbancoSessionBean() {
		return this.bancoSessionBean;
	}
	
	public void setbancoSessionBean(BancoSessionBean bancoSessionBean) {
		this.bancoSessionBean=bancoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorCodigoInstitucion() {
		return this.isVisibilidadBusquedaPorCodigoInstitucion;
	}

	public void setisVisibilidadBusquedaPorCodigoInstitucion(Boolean isVisibilidadBusquedaPorCodigoInstitucion) {
		this.isVisibilidadBusquedaPorCodigoInstitucion=isVisibilidadBusquedaPorCodigoInstitucion;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableCredito() {
		return this.isVisibilidadFK_IdCuentaContableCredito;
	}

	public void setisVisibilidadFK_IdCuentaContableCredito(Boolean isVisibilidadFK_IdCuentaContableCredito) {
		this.isVisibilidadFK_IdCuentaContableCredito=isVisibilidadFK_IdCuentaContableCredito;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableDebito() {
		return this.isVisibilidadFK_IdCuentaContableDebito;
	}

	public void setisVisibilidadFK_IdCuentaContableDebito(Boolean isVisibilidadFK_IdCuentaContableDebito) {
		this.isVisibilidadFK_IdCuentaContableDebito=isVisibilidadFK_IdCuentaContableDebito;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdFormato1() {
		return this.isVisibilidadFK_IdFormato1;
	}

	public void setisVisibilidadFK_IdFormato1(Boolean isVisibilidadFK_IdFormato1) {
		this.isVisibilidadFK_IdFormato1=isVisibilidadFK_IdFormato1;
	}

	public Boolean getisVisibilidadFK_IdFormato2() {
		return this.isVisibilidadFK_IdFormato2;
	}

	public void setisVisibilidadFK_IdFormato2(Boolean isVisibilidadFK_IdFormato2) {
		this.isVisibilidadFK_IdFormato2=isVisibilidadFK_IdFormato2;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoBanco() {
		return this.isVisibilidadFK_IdTipoBanco;
	}

	public void setisVisibilidadFK_IdTipoBanco(Boolean isVisibilidadFK_IdTipoBanco) {
		this.isVisibilidadFK_IdTipoBanco=isVisibilidadFK_IdTipoBanco;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysBanco(Banco banco)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(banco,null);
				this.setActualParaGuardarSucursalForeignKey(banco,null);
				this.setActualParaGuardarTipoBancoForeignKey(banco,null);
				this.setActualParaGuardarCuentaContableDebitoForeignKey(banco,null);
				this.setActualParaGuardarCuentaContableCreditoForeignKey(banco,null);
				this.setActualParaGuardarFormato1ForeignKey(banco,null);
				this.setActualParaGuardarFormato2ForeignKey(banco,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(Banco banco,Banco bancoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalBanco(banco);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		bancoAux.setId(banco.getId());
		bancoAux.setVersionRow(banco.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessBanco();
		
			int intSelectedRow = this.jTableDatosBanco.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(BancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualBanco(this.banco,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = bancoValidator.getInvalidValues(this.banco);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			bancoLogic.setDatosCliente(datosCliente);
			bancoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				bancoAux=new  Banco();
				
				bancoAux.setIsNew(true);
				bancoAux.setIsChanged(true);
				
				bancoAux.setBancoOriginal(this.banco);
				
				bancoAux.setId(this.banco.getId());	
				bancoAux.setVersionRow(this.banco.getVersionRow());	
				bancoAux.setid_empresa(this.banco.getid_empresa());	
				bancoAux.setid_sucursal(this.banco.getid_sucursal());	
				bancoAux.setcodigo(this.banco.getcodigo());	
				bancoAux.setcodigo_institucion(this.banco.getcodigo_institucion());	
				bancoAux.setnombre(this.banco.getnombre());	
				bancoAux.setid_tipo_banco(this.banco.getid_tipo_banco());	
				bancoAux.setdias_efectivo_local(this.banco.getdias_efectivo_local());	
				bancoAux.setdias_efectivo_extranjero(this.banco.getdias_efectivo_extranjero());	
				
				if(this.banco.getid_cuenta_contable_debito()!=null && this.banco.getid_cuenta_contable_debito()>0L) {
					bancoAux.setid_cuenta_contable_debito(this.banco.getid_cuenta_contable_debito());
				} else {
					bancoAux.setid_cuenta_contable_debito(null);
				}	
				
				if(this.banco.getid_cuenta_contable_credito()!=null && this.banco.getid_cuenta_contable_credito()>0L) {
					bancoAux.setid_cuenta_contable_credito(this.banco.getid_cuenta_contable_credito());
				} else {
					bancoAux.setid_cuenta_contable_credito(null);
				}	
				bancoAux.setdelimitador(this.banco.getdelimitador());	
				
				if(this.banco.getid_formato1()!=null && this.banco.getid_formato1()>0L) {
					bancoAux.setid_formato1(this.banco.getid_formato1());
				} else {
					bancoAux.setid_formato1(null);
				}	
				
				if(this.banco.getid_formato2()!=null && this.banco.getid_formato2()>0L) {
					bancoAux.setid_formato2(this.banco.getid_formato2());
				} else {
					bancoAux.setid_formato2(null);
				}	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.bancoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.bancoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(bancoAux,bancoLogic.getBancos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bancoAux,bancos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.bancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoLogic.saveBancos();//WithConnection
						//bancoLogic.getSetVersionRowBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.banco,bancoAux);
					
					this.refrescarForeignKeysDescripcionesBanco();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenLogic.getCuentaBancoPunVens().addAll(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvensEliminados);
							this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes().addAll(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclientesEliminados);
							this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas().addAll(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
							this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos().addAll(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
							this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos().addAll(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagosEliminados);
							this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().addAll(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralsEliminados);
							this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoLogic.getCuentaBancos().addAll(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvens.addAll(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvensEliminados);
							this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclientes.addAll(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclientesEliminados);
							this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas.addAll(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
							this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos.addAll(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
							this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagos.addAll(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagosEliminados);
							this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogenerals.addAll(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralsEliminados);
							this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancos.addAll(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bancoLogic.saveBancoRelaciones(bancoAux,this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos(),this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos(),this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenLogic.getCuentaBancoPunVens(),this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes(),this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas(),this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoLogic.getCuentaBancos(),this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());//WithConnection
								//bancoLogic.getSetVersionRowBancos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.banco,bancoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenLogic.setCuentaBancoPunVens(new ArrayList<CuentaBancoPunVen>());
							this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.setPoliticasClientes(new ArrayList<PoliticasCliente>());
							this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(new ArrayList<FormaPagoPuntoVenta>());
							this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.setTarjetaCreditos(new ArrayList<TarjetaCredito>());
							this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoLogic.setAutoriPagos(new ArrayList<AutoriPago>());
							this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(new ArrayList<TipoCuentaBancoGeneral>());
							this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoLogic.setCuentaBancos(new ArrayList<CuentaBanco>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvens= new ArrayList<CuentaBancoPunVen>();
							this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclientes= new ArrayList<PoliticasCliente>();
							this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas= new ArrayList<FormaPagoPuntoVenta>();
							this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos= new ArrayList<TarjetaCredito>();
							this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagos= new ArrayList<AutoriPago>();
							this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogenerals= new ArrayList<TipoCuentaBancoGeneral>();
							this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancos= new ArrayList<CuentaBanco>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setAutoriPagos(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos());

							if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setTarjetaCreditos(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());

							if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setCuentaBancoPunVens(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenLogic.getCuentaBancoPunVens());

							if(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setPoliticasClientes(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());

							if(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());

							if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setCuentaBancos(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoLogic.getCuentaBancos());

							if(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setTipoCuentaBancoGenerals(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.bancoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.bancoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(bancoAux,bancoLogic.getBancos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(bancoAux,bancos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.banco,bancoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				bancoAux=new  Banco();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.bancoSessionBean.getEsGuardarRelacionado() 
					|| (this.bancoSessionBean.getEsGuardarRelacionado() && this.banco.getId()>=0)) {
						
					bancoAux.setIsNew(false);
				}
				
				bancoAux.setIsDeleted(false);
			
				bancoAux.setId(this.banco.getId());	
				bancoAux.setVersionRow(this.banco.getVersionRow());	
				bancoAux.setid_empresa(this.banco.getid_empresa());	
				bancoAux.setid_sucursal(this.banco.getid_sucursal());	
				bancoAux.setcodigo(this.banco.getcodigo());	
				bancoAux.setcodigo_institucion(this.banco.getcodigo_institucion());	
				bancoAux.setnombre(this.banco.getnombre());	
				bancoAux.setid_tipo_banco(this.banco.getid_tipo_banco());	
				bancoAux.setdias_efectivo_local(this.banco.getdias_efectivo_local());	
				bancoAux.setdias_efectivo_extranjero(this.banco.getdias_efectivo_extranjero());	
				
				if(this.banco.getid_cuenta_contable_debito()!=null && this.banco.getid_cuenta_contable_debito()>0L) {
					bancoAux.setid_cuenta_contable_debito(this.banco.getid_cuenta_contable_debito());
				} else {
					bancoAux.setid_cuenta_contable_debito(null);
				}	
				
				if(this.banco.getid_cuenta_contable_credito()!=null && this.banco.getid_cuenta_contable_credito()>0L) {
					bancoAux.setid_cuenta_contable_credito(this.banco.getid_cuenta_contable_credito());
				} else {
					bancoAux.setid_cuenta_contable_credito(null);
				}	
				bancoAux.setdelimitador(this.banco.getdelimitador());	
				
				if(this.banco.getid_formato1()!=null && this.banco.getid_formato1()>0L) {
					bancoAux.setid_formato1(this.banco.getid_formato1());
				} else {
					bancoAux.setid_formato1(null);
				}	
				
				if(this.banco.getid_formato2()!=null && this.banco.getid_formato2()>0L) {
					bancoAux.setid_formato2(this.banco.getid_formato2());
				} else {
					bancoAux.setid_formato2(null);
				}	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(bancoAux,bancoLogic.getBancos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bancoAux,bancos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.bancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoLogic.saveBancos();//WithConnection
						//bancoLogic.getSetVersionRowBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.banco,bancoAux);
					
					this.refrescarForeignKeysDescripcionesBanco();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenLogic.getCuentaBancoPunVens().addAll(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvensEliminados);
							this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes().addAll(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclientesEliminados);
							this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas().addAll(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
							this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos().addAll(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
							this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos().addAll(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagosEliminados);
							this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().addAll(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralsEliminados);
							this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoLogic.getCuentaBancos().addAll(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvens.addAll(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvensEliminados);
							this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclientes.addAll(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclientesEliminados);
							this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas.addAll(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
							this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos.addAll(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
							this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagos.addAll(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagosEliminados);
							this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogenerals.addAll(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralsEliminados);
							this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancos.addAll(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bancoLogic.saveBancoRelaciones(bancoAux,this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos(),this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos(),this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenLogic.getCuentaBancoPunVens(),this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes(),this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas(),this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoLogic.getCuentaBancos(),this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());//WithConnection
								//bancoLogic.getSetVersionRowBancos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.banco,bancoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenLogic.setCuentaBancoPunVens(new ArrayList<CuentaBancoPunVen>());
							this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.setPoliticasClientes(new ArrayList<PoliticasCliente>());
							this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(new ArrayList<FormaPagoPuntoVenta>());
							this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.setTarjetaCreditos(new ArrayList<TarjetaCredito>());
							this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoLogic.setAutoriPagos(new ArrayList<AutoriPago>());
							this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(new ArrayList<TipoCuentaBancoGeneral>());
							this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoLogic.setCuentaBancos(new ArrayList<CuentaBanco>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvens= new ArrayList<CuentaBancoPunVen>();
							this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclientes= new ArrayList<PoliticasCliente>();
							this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas= new ArrayList<FormaPagoPuntoVenta>();
							this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos= new ArrayList<TarjetaCredito>();
							this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagos= new ArrayList<AutoriPago>();
							this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogenerals= new ArrayList<TipoCuentaBancoGeneral>();
							this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancos= new ArrayList<CuentaBanco>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setAutoriPagos(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos());

							if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setTarjetaCreditos(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());

							if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setCuentaBancoPunVens(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenLogic.getCuentaBancoPunVens());

							if(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setPoliticasClientes(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());

							if(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());

							if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setCuentaBancos(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoLogic.getCuentaBancos());

							if(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setTipoCuentaBancoGenerals(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.bancoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.bancoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(bancoAux,bancoLogic.getBancos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(bancoAux,bancos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.banco,bancoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				bancoAux=new  Banco();
				
				bancoAux.setIsNew(false);
				bancoAux.setIsChanged(false);
				
				bancoAux.setIsDeleted(true);
				
				bancoAux.setId(this.banco.getId());	
				bancoAux.setVersionRow(this.banco.getVersionRow());	
				bancoAux.setid_empresa(this.banco.getid_empresa());	
				bancoAux.setid_sucursal(this.banco.getid_sucursal());	
				bancoAux.setcodigo(this.banco.getcodigo());	
				bancoAux.setcodigo_institucion(this.banco.getcodigo_institucion());	
				bancoAux.setnombre(this.banco.getnombre());	
				bancoAux.setid_tipo_banco(this.banco.getid_tipo_banco());	
				bancoAux.setdias_efectivo_local(this.banco.getdias_efectivo_local());	
				bancoAux.setdias_efectivo_extranjero(this.banco.getdias_efectivo_extranjero());	
				
				if(this.banco.getid_cuenta_contable_debito()!=null && this.banco.getid_cuenta_contable_debito()>0L) {
					bancoAux.setid_cuenta_contable_debito(this.banco.getid_cuenta_contable_debito());
				} else {
					bancoAux.setid_cuenta_contable_debito(null);
				}	
				
				if(this.banco.getid_cuenta_contable_credito()!=null && this.banco.getid_cuenta_contable_credito()>0L) {
					bancoAux.setid_cuenta_contable_credito(this.banco.getid_cuenta_contable_credito());
				} else {
					bancoAux.setid_cuenta_contable_credito(null);
				}	
				bancoAux.setdelimitador(this.banco.getdelimitador());	
				
				if(this.banco.getid_formato1()!=null && this.banco.getid_formato1()>0L) {
					bancoAux.setid_formato1(this.banco.getid_formato1());
				} else {
					bancoAux.setid_formato1(null);
				}	
				
				if(this.banco.getid_formato2()!=null && this.banco.getid_formato2()>0L) {
					bancoAux.setid_formato2(this.banco.getid_formato2());
				} else {
					bancoAux.setid_formato2(null);
				}	
				
				if(this.bancoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.bancoAux.getId()>=0) {	
						this.bancosEliminados.add(bancoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(bancoAux,bancoLogic.getBancos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bancoAux,bancos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.bancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoLogic.saveBancos();//WithConnection
						//bancoLogic.getSetVersionRowBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenLogic.getCuentaBancoPunVens().addAll(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvensEliminados);
							this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes().addAll(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclientesEliminados);
							this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas().addAll(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
							this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos().addAll(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
							this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos().addAll(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagosEliminados);
							this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().addAll(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralsEliminados);
							this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoLogic.getCuentaBancos().addAll(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvens.addAll(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvensEliminados);
							this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclientes.addAll(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclientesEliminados);
							this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas.addAll(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
							this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos.addAll(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
							this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagos.addAll(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagosEliminados);
							this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogenerals.addAll(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralsEliminados);
							this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancos.addAll(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.detallechequegiradoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jInternalFrameDetalleFormCuentaBanco.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bancoLogic.saveBancoRelaciones(bancoAux,this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos(),this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos(),this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenLogic.getCuentaBancoPunVens(),this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes(),this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas(),this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoLogic.getCuentaBancos(),this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());//WithConnection
								//bancoLogic.getSetVersionRowBancos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenLogic.setCuentaBancoPunVens(new ArrayList<CuentaBancoPunVen>());
							this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.setPoliticasClientes(new ArrayList<PoliticasCliente>());
							this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(new ArrayList<FormaPagoPuntoVenta>());
							this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.setTarjetaCreditos(new ArrayList<TarjetaCredito>());
							this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoLogic.setAutoriPagos(new ArrayList<AutoriPago>());
							this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(new ArrayList<TipoCuentaBancoGeneral>());
							this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoLogic.setCuentaBancos(new ArrayList<CuentaBanco>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvens= new ArrayList<CuentaBancoPunVen>();
							this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclientes= new ArrayList<PoliticasCliente>();
							this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas= new ArrayList<FormaPagoPuntoVenta>();
							this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos= new ArrayList<TarjetaCredito>();
							this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagos= new ArrayList<AutoriPago>();
							this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogenerals= new ArrayList<TipoCuentaBancoGeneral>();
							this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancos= new ArrayList<CuentaBanco>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setAutoriPagos(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos());

							if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setTarjetaCreditos(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());

							if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setCuentaBancoPunVens(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenLogic.getCuentaBancoPunVens());

							if(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setPoliticasClientes(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());

							if(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());

							if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setCuentaBancos(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoLogic.getCuentaBancos());

							if(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();}
							bancoAux.setTipoCuentaBancoGenerals(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.bancoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.bancoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(bancoAux,bancoLogic.getBancos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(bancoAux,bancos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getBancos().addAll(this.bancosEliminados);
					
					bancoLogic.saveBancos();//WithConnection
					//bancoLogic.getSetVersionRowBancos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesBanco();
				
				this.bancosEliminados= new ArrayList<Banco>();		
			}
			
			if(this.bancoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Banco GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Banco",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.banco=bancoAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessBanco();
      	}
		
	}	
	
	public void actualizarRelaciones(Banco bancoLocal) throws Exception {
		
		if(this.bancoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				bancoLocal.setAutoriPagos(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos());
				bancoLocal.setTarjetaCreditos(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());
				bancoLocal.setCuentaBancoPunVens(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenLogic.getCuentaBancoPunVens());
				bancoLocal.setPoliticasClientes(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());
				bancoLocal.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
				bancoLocal.setCuentaBancos(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoLogic.getCuentaBancos());
				bancoLocal.setTipoCuentaBancoGenerals(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
			
			} else {
			
				bancoLocal.setAutoriPagos(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagos);
				bancoLocal.setTarjetaCreditos(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos);
				bancoLocal.setCuentaBancoPunVens(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvens);
				bancoLocal.setPoliticasClientes(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclientes);
				bancoLocal.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas);
				bancoLocal.setCuentaBancos(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancos);
				bancoLocal.setTipoCuentaBancoGenerals(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogenerals);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Banco bancoLocal) throws Exception {	
		if(this.bancoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				bancoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				bancoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoBancoDetalleFormJInternalFrame.class)) {
				TipoBancoBeanSwingJInternalFrame tipobancoBeanSwingJInternalFrameLocal=(TipoBancoBeanSwingJInternalFrame) ((TipoBancoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipobancoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoBanco(tipobancoBeanSwingJInternalFrameLocal.gettipobanco(),true);
				tipobancoBeanSwingJInternalFrameLocal.actualizarLista(tipobancoBeanSwingJInternalFrameLocal.tipobanco,this.tipobancosForeignKey);

				tipobancoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipobancoBeanSwingJInternalFrameLocal.tipobanco);

				bancoLocal.setTipoBanco(tipobancoBeanSwingJInternalFrameLocal.tipobanco);

				this.addItemDefectoCombosForeignKeyTipoBanco();
				this.cargarCombosFrameTipoBancosForeignKey("Formulario");
				this.setActualTipoBancoForeignKey(tipobancoBeanSwingJInternalFrameLocal.tipobanco.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontabledebitoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontabledebitoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontabledebitoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontabledebitosForeignKey);

				cuentacontabledebitoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable);

				bancoLocal.setCuentaContableDebito(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableDebito();
				this.cargarCombosFrameCuentaContableDebitosForeignKey("Formulario");
				this.setActualCuentaContableDebitoForeignKey(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontablecreditoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontablecreditoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablecreditosForeignKey);

				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				bancoLocal.setCuentaContableCredito(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableCredito();
				this.cargarCombosFrameCuentaContableCreditosForeignKey("Formulario");
				this.setActualCuentaContableCreditoForeignKey(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoDetalleFormJInternalFrame.class)) {
				FormatoBeanSwingJInternalFrame formato1BeanSwingJInternalFrameLocal=(FormatoBeanSwingJInternalFrame) ((FormatoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formato1BeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormato(formato1BeanSwingJInternalFrameLocal.getformato(),true);
				formato1BeanSwingJInternalFrameLocal.actualizarLista(formato1BeanSwingJInternalFrameLocal.formato,this.formato1sForeignKey);

				formato1BeanSwingJInternalFrameLocal.actualizarRelaciones(formato1BeanSwingJInternalFrameLocal.formato);

				bancoLocal.setFormato1(formato1BeanSwingJInternalFrameLocal.formato);

				this.addItemDefectoCombosForeignKeyFormato1();
				this.cargarCombosFrameFormato1sForeignKey("Formulario");
				this.setActualFormato1ForeignKey(formato1BeanSwingJInternalFrameLocal.formato.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoDetalleFormJInternalFrame.class)) {
				FormatoBeanSwingJInternalFrame formato2BeanSwingJInternalFrameLocal=(FormatoBeanSwingJInternalFrame) ((FormatoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formato2BeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormato(formato2BeanSwingJInternalFrameLocal.getformato(),true);
				formato2BeanSwingJInternalFrameLocal.actualizarLista(formato2BeanSwingJInternalFrameLocal.formato,this.formato2sForeignKey);

				formato2BeanSwingJInternalFrameLocal.actualizarRelaciones(formato2BeanSwingJInternalFrameLocal.formato);

				bancoLocal.setFormato2(formato2BeanSwingJInternalFrameLocal.formato);

				this.addItemDefectoCombosForeignKeyFormato2();
				this.cargarCombosFrameFormato2sForeignKey("Formulario");
				this.setActualFormato2ForeignKey(formato2BeanSwingJInternalFrameLocal.formato.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarBancoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosBanco.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = bancoValidator.getInvalidValues(this.banco);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Banco banco,List<Banco> bancos) throws Exception {
		try	{		
			BancoConstantesFunciones.actualizarLista(banco,bancos,this.bancoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Banco banco,List<Banco> bancos) throws Exception {
		try	{			
			BancoConstantesFunciones.actualizarSelectedLista(banco,bancos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Banco> bancosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				bancosLocal=this.bancoLogic.getBancos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				bancosLocal=this.bancos;
			}
			//ARCHITECTURE
		
			for(Banco bancoLocal:bancosLocal) {
				if(this.permiteMantenimiento(bancoLocal) && bancoLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+BancoConstantesFunciones.getBancoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(BancoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabelid_empresaBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabelid_sucursalBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabelcodigoBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoConstantesFunciones.CODIGOINSTITUCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabelcodigo_institucionBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabelnombreBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoConstantesFunciones.IDTIPOBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabelid_tipo_bancoBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoConstantesFunciones.DIASEFECTIVOLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabeldias_efectivo_localBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoConstantesFunciones.DIASEFECTIVOEXTRANJERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabeldias_efectivo_extranjeroBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoConstantesFunciones.IDCUENTACONTABLEDEBITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabelid_cuenta_contable_debitoBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoConstantesFunciones.IDCUENTACONTABLECREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabelid_cuenta_contable_creditoBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoConstantesFunciones.DELIMITADOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabeldelimitadorBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoConstantesFunciones.IDFORMATO1)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabelid_formato1Banco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoConstantesFunciones.IDFORMATO2)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabelid_formato2Banco,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormBanco!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBanco.jLabelid_empresaBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBanco.jLabelid_sucursalBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBanco.jLabelcodigoBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBanco.jLabelcodigo_institucionBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBanco.jLabelnombreBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBanco.jLabelid_tipo_bancoBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBanco.jLabeldias_efectivo_localBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBanco.jLabeldias_efectivo_extranjeroBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBanco.jLabelid_cuenta_contable_debitoBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBanco.jLabelid_cuenta_contable_creditoBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBanco.jLabeldelimitadorBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBanco.jLabelid_formato1Banco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBanco.jLabelid_formato2Banco,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("AutoriPago")) {
			if(this.banco==null) {
				this.banco= new Banco();
			}

			if(this.bancoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoBanco
				this.setVariablesFormularioToObjetoActualBanco(this.banco,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);

				this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.getautoripago().setBanco(this.banco);
			}

			return;
		}
		 else  if(sTipo.equals("TarjetaCredito")) {
			if(this.banco==null) {
				this.banco= new Banco();
			}

			if(this.bancoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoBanco
				this.setVariablesFormularioToObjetoActualBanco(this.banco,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);

				this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.gettarjetacredito().setBanco(this.banco);
			}

			return;
		}
		 else  if(sTipo.equals("CuentaBancoPunVen")) {
			if(this.banco==null) {
				this.banco= new Banco();
			}

			if(this.bancoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoBanco
				this.setVariablesFormularioToObjetoActualBanco(this.banco,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);

				this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.getcuentabancopunven().setBanco(this.banco);
			}

			return;
		}
		 else  if(sTipo.equals("PoliticasCliente")) {
			if(this.banco==null) {
				this.banco= new Banco();
			}

			if(this.bancoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoBanco
				this.setVariablesFormularioToObjetoActualBanco(this.banco,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);

				this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.getpoliticascliente().setBanco(this.banco);
			}

			return;
		}
		 else  if(sTipo.equals("FormaPagoPuntoVenta")) {
			if(this.banco==null) {
				this.banco= new Banco();
			}

			if(this.bancoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoBanco
				this.setVariablesFormularioToObjetoActualBanco(this.banco,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);

				this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.getformapagopuntoventa().setBanco(this.banco);
			}

			return;
		}
		 else  if(sTipo.equals("CuentaBanco")) {
			if(this.banco==null) {
				this.banco= new Banco();
			}

			if(this.bancoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoBanco
				this.setVariablesFormularioToObjetoActualBanco(this.banco,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);

				this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.getcuentabanco().setBanco(this.banco);
			}

			return;
		}
		 else  if(sTipo.equals("TipoCuentaBancoGeneral")) {
			if(this.banco==null) {
				this.banco= new Banco();
			}

			if(this.bancoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoBanco
				this.setVariablesFormularioToObjetoActualBanco(this.banco,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);

				this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.gettipocuentabancogeneral().setBanco(this.banco);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoBanco--;	
		
		
		this.bancoAux=new Banco();
		
		this.bancoAux.setId(this.iIdNuevoBanco);
		this.bancoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.bancoLogic.getBancos().add(this.bancoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.bancos.add(this.bancoAux);
		}
		//ARCHITECTURE
		
		this.banco=this.bancoAux;
		
		if(BancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioBanco(this.banco);
			this.setVariablesObjetoActualToFormularioForeignKeyBanco(this.banco);
		}
				
		//this.setDefaultControlesBanco();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyBanco();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyBanco();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyBanco();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBanco(this.bancoBean,this.banco,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(BancoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.bancoSessionBean.getConGuardarRelaciones()) {
			classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.bancoReturnGeneral=bancoLogic.procesarEventosBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bancoLogic.getBancos(),this.banco,this.bancoParameterGeneral,this.isEsNuevoBanco,classes);//this.bancoLogic.getBanco()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanBanco(this.bancoReturnGeneral,this.bancoBean,false);
		
		if(this.bancoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyBanco(this.bancoReturnGeneral.getBanco());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioBanco(this.bancoReturnGeneral.getBanco());
		}
		
		if(this.bancoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioBanco(this.bancoReturnGeneral.getBanco(),classes);//this.bancoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualBanco(this.banco,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyBanco();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyBanco();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BancoBeanSwingJInternalFrameAdditional.RecargarFormBanco(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingBanco(false);
						
			if(bancoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenSessionBean.getEsGuardarRelacionado() && CuentaBancoPunVenJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentaBancoPunVenActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.getEsGuardarRelacionado() && PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPoliticasClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado() && FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormaPagoPuntoVentaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.getEsGuardarRelacionado() && TarjetaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTarjetaCreditoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.getEsGuardarRelacionado() && AutoriPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAutoriPagoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado() && TipoCuentaBancoGeneralJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTipoCuentaBancoGeneralActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoSessionBean.getEsGuardarRelacionado() && CuentaBancoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentaBancoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(BancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBanco();
			}
			
			this.actualizarVisualTableDatosBanco();
			
			this.jTableDatosBanco.setRowSelectionInterval(this.getIndiceNuevoBanco(), this.getIndiceNuevoBanco());
			
			this.seleccionarFilaTablaBancoActual();
						
			this.actualizarEstadoCeldasBotonesBanco("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesBanco(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormBanco.jTextAreacodigoBanco.setEnabled(isHabilitar && this.bancoConstantesFunciones.activarcodigoBanco);
		this.jInternalFrameDetalleFormBanco.jTextFieldcodigo_institucionBanco.setEnabled(isHabilitar && this.bancoConstantesFunciones.activarcodigo_institucionBanco);
		this.jInternalFrameDetalleFormBanco.jTextAreanombreBanco.setEnabled(isHabilitar && this.bancoConstantesFunciones.activarnombreBanco);
		this.jInternalFrameDetalleFormBanco.jTextFielddias_efectivo_localBanco.setEnabled(isHabilitar && this.bancoConstantesFunciones.activardias_efectivo_localBanco);
		this.jInternalFrameDetalleFormBanco.jTextFielddias_efectivo_extranjeroBanco.setEnabled(isHabilitar && this.bancoConstantesFunciones.activardias_efectivo_extranjeroBanco);
		this.jInternalFrameDetalleFormBanco.jTextFielddelimitadorBanco.setEnabled(isHabilitar && this.bancoConstantesFunciones.activardelimitadorBanco);	
		//
		this.jInternalFrameDetalleFormBanco.jComboBoxid_empresaBanco.setEnabled(isHabilitar && this.bancoConstantesFunciones.activarid_empresaBanco);//
		this.jInternalFrameDetalleFormBanco.jComboBoxid_sucursalBanco.setEnabled(isHabilitar && this.bancoConstantesFunciones.activarid_sucursalBanco);
		this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.setEnabled(isHabilitar && this.bancoConstantesFunciones.activarid_tipo_bancoBanco);
		this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_debitoBanco.setEnabled(isHabilitar && this.bancoConstantesFunciones.activarid_cuenta_contable_debitoBanco);
		this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_creditoBanco.setEnabled(isHabilitar && this.bancoConstantesFunciones.activarid_cuenta_contable_creditoBanco);
		this.jInternalFrameDetalleFormBanco.jComboBoxid_formato1Banco.setEnabled(isHabilitar && this.bancoConstantesFunciones.activarid_formato1Banco);
		this.jInternalFrameDetalleFormBanco.jComboBoxid_formato2Banco.setEnabled(isHabilitar && this.bancoConstantesFunciones.activarid_formato2Banco);
	};
	
	public void setDefaultControlesBanco() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoBanco(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.bancoSessionBean.setConGuardarRelaciones(true);			
			this.bancoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormBanco.jTabbedPaneRelacionesBanco.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.bancoSessionBean.setConGuardarRelaciones(false);			
			this.bancoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormBanco.jTabbedPaneRelacionesBanco.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoBanco() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Banco bancoAux:this.bancoLogic.getBancos()) {
				if(bancoAux.getId().equals(this.iIdNuevoBanco)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Banco bancoAux:this.bancos) {
				if(bancoAux.getId().equals(this.iIdNuevoBanco)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualBanco(Banco banco,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Banco bancoAux:this.bancoLogic.getBancos()) {
				if(bancoAux.getId().equals(banco.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Banco bancoAux:this.bancos) {
				if(bancoAux.getId().equals(banco.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalBanco(Banco bancoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Banco bancoAux:this.bancoLogic.getBancos()) {
				if(bancoAux.getBancoOriginal().getId().equals(bancoOriginal.getId())) {
					existe=true;
					bancoOriginal.setId(bancoAux.getId());
					bancoOriginal.setVersionRow(bancoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Banco bancoAux:this.bancos) {
				if(bancoAux.getBancoOriginal().getId().equals(bancoOriginal.getId())) {
					existe=true;
					bancoOriginal.setId(bancoAux.getId());
					bancoOriginal.setVersionRow(bancoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosBanco(Boolean esParaCancelar) throws Exception {
		bancosAux=new ArrayList<Banco>();
		bancoAux=new Banco();
		
		if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Banco bancoAux:this.bancoLogic.getBancos()) {
					if(bancoAux.getId()<0) {
						bancosAux.add(bancoAux);
					}		
				}
				this.iIdNuevoBanco=0L;
				this.bancoLogic.getBancos().removeAll(bancosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Banco bancoAux:this.bancos) {
					if(bancoAux.getId()<0) {
						bancosAux.add(bancoAux);
					}		
				}
				this.iIdNuevoBanco=0L;
				this.bancos.removeAll(bancosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoBanco 
					&& this.bancoLogic.getBancos().size()>0
					) {
					bancoAux=this.bancoLogic.getBancos().get(this.bancoLogic.getBancos().size() - 1);
				
					if(bancoAux.getId()<0) {
						this.bancoLogic.getBancos().remove(bancoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoBanco && this.bancos.size()>0) {
					bancoAux=this.bancos.get(this.bancos.size() - 1);
				
					if(bancoAux.getId()<0) {
						this.bancos.remove(bancoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoBanco(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(banco.getId()<0) {
				this.bancoLogic.getBancos().remove(this.banco);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(banco.getId()<0) {
				this.bancos.remove(this.banco);
			}
		}			
	}
	
	public void setEstadosInicialesBanco(List<Banco> bancosAux) throws Exception {
		BancoConstantesFunciones.setEstadosInicialesBanco(bancosAux);
	}
	
	public void setEstadosInicialesBanco(Banco bancoAux) throws Exception {
		BancoConstantesFunciones.setEstadosInicialesBanco(bancoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarBancoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarBancoActual()) {
				if(!this.isEsNuevoBanco) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoBanco=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarBancoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Banco ?", "MANTENIMIENTO DE Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Banco banco) throws Exception {
		BancoConstantesFunciones.seleccionarAsignar(this.banco,banco);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarBanco=this.isPermisoActualizarOriginalBanco;
			
			
			this.seleccionarAsignar(banco);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BancoConstantesFunciones.quitarEspaciosBanco(this.banco,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.bancoSessionBean.setsFuncionBusquedaRapida(this.bancoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoBanco) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosBanco(esParaCancelar);				
				this.cancelarNuevoBanco(esParaCancelar);								
			}
			
			this.banco=new Banco();
			
			this.inicializarBanco();
			
			this.actualizarEstadoCeldasBotonesBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarBanco() throws Exception {
		try {
			BancoConstantesFunciones.inicializarBanco(this.banco);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.bancoLogic.getBancos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteBancos(String sAccionBusqueda,List<Banco> bancosParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="Banco"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="BancoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("BancoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Banco"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Bancos");		
		parameters.put("busquedapor", BancoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(CuentaBancoPunVen.class));
			classes.add(new Classe(PoliticasCliente.class));
			classes.add(new Classe(FormaPagoPuntoVenta.class));
			classes.add(new Classe(TarjetaCredito.class));
			classes.add(new Classe(AutoriPago.class));
			classes.add(new Classe(TipoCuentaBancoGeneral.class));
			classes.add(new Classe(CuentaBanco.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					BancoLogic bancoLogicAuxiliar=new BancoLogic();
					bancoLogicAuxiliar.setDatosCliente(bancoLogic.getDatosCliente());				
					bancoLogicAuxiliar.setBancos(bancosParaReportes);
					
					bancoLogicAuxiliar.cargarRelacionesLoteForeignKeyBancoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					bancosParaReportes=bancoLogicAuxiliar.getBancos();
					
					//bancoLogic.getNewConnexionToDeep();
					
					//for (Banco banco:bancosParaReportes) {
					//	bancoLogic.deepLoad(banco, false, DeepLoadType.INCLUDE, classes);
					//}						
					//bancoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//bancoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCuentaBancoPunVen = AuxiliarReportes.class.getResourceAsStream("CuentaBancoPunVenDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cuentabancopunven", reportFileCuentaBancoPunVen);

			InputStream reportFilePoliticasCliente = AuxiliarReportes.class.getResourceAsStream("PoliticasClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_politicascliente", reportFilePoliticasCliente);

			InputStream reportFileFormaPagoPuntoVenta = AuxiliarReportes.class.getResourceAsStream("FormaPagoPuntoVentaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_formapagopuntoventa", reportFileFormaPagoPuntoVenta);

			InputStream reportFileTarjetaCredito = AuxiliarReportes.class.getResourceAsStream("TarjetaCreditoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_tarjetacredito", reportFileTarjetaCredito);

			InputStream reportFileAutoriPago = AuxiliarReportes.class.getResourceAsStream("AutoriPagoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_autoripago", reportFileAutoriPago);

			InputStream reportFileTipoCuentaBancoGeneral = AuxiliarReportes.class.getResourceAsStream("TipoCuentaBancoGeneralDetalleRelacionesDesign.jasper");
			parameters.put("subreport_tipocuentabancogeneral", reportFileTipoCuentaBancoGeneral);

			InputStream reportFileCuentaBanco = AuxiliarReportes.class.getResourceAsStream("CuentaBancoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cuentabanco", reportFileCuentaBanco);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceBanco=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			BancoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			BancoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceBanco=new JRBeanArrayDataSource(BancoJInternalFrame.TraerBancoBeans(bancosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceBanco);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+BancoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+BancoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(BancoBean.TraerBancoBeans(bancosParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteBancos(sAccionBusqueda,sTipoArchivoReporte,bancosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalBancos(sAccionBusqueda,sTipoArchivoReporte,bancosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoBancoActionPerformed(null);
					//this.generarExcelReporteBancos(sAccionBusqueda,sTipoArchivoReporte,bancosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalBancos(sAccionBusqueda,sTipoArchivoReporte,bancosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesBancos(sAccionBusqueda,sTipoArchivoReporte,bancosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesBancos(sAccionBusqueda,sTipoArchivoReporte,bancosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<Banco> bancosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"banco";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Bancos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBanco("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Banco banco : bancosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			BancoConstantesFunciones.generarExcelReporteDataBanco("NORMAL",row,workbook,banco,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderBanco(String sTipo,Row row,Workbook workbook) {
		
		BancoConstantesFunciones.generarExcelReporteHeaderBanco(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<Banco> bancosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"banco_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Bancos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Banco banco : bancosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(BancoConstantesFunciones.getBancoDescripcion(banco));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(banco.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(banco.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(banco.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoConstantesFunciones.LABEL_CODIGOINSTITUCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoConstantesFunciones.LABEL_CODIGOINSTITUCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(banco.getcodigo_institucion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(banco.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoConstantesFunciones.LABEL_IDTIPOBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoConstantesFunciones.LABEL_IDTIPOBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(banco.gettipobanco_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(banco.getdias_efectivo_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(banco.getdias_efectivo_extranjero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(banco.getcuentacontabledebito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(banco.getcuentacontablecredito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoConstantesFunciones.LABEL_DELIMITADOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoConstantesFunciones.LABEL_DELIMITADOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(banco.getdelimitador());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoConstantesFunciones.LABEL_IDFORMATO1))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoConstantesFunciones.LABEL_IDFORMATO1);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(banco.getformato1_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoConstantesFunciones.LABEL_IDFORMATO2))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoConstantesFunciones.LABEL_IDFORMATO2);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(banco.getformato2_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<Banco> bancosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Banco> bancosRespaldo=null;
		
		classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.bancoLogic.setDatosCliente(this.datosCliente);
		this.bancoLogic.setDatosDeep(this.datosDeep);
		this.bancoLogic.setIsConDeep(true);
		
		bancosRespaldo=this.bancoLogic.getBancos();
		
		this.bancoLogic.setBancos(bancosParaReportes);	
		this.bancoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		bancosParaReportes=this.bancoLogic.getBancos();
		this.bancoLogic.setBancos(bancosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"banco_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Bancos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBanco("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Banco banco : bancosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderBanco("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			BancoConstantesFunciones.generarExcelReporteDataBanco("NORMAL",row,workbook,banco,cellStyleDataAux);
		
			
			


				//AutoriPago
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(AutoriPagoConstantesFunciones.SCLASSWEBTITULO))) {

				if(banco.getAutoriPagos()!=null && banco.getAutoriPagos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(AutoriPagoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					AutoriPagoConstantesFunciones.generarExcelReporteHeaderAutoriPago("RELACIONADO",row,workbook);
				}

				if(banco.getAutoriPagos()!=null) {
					i2=0;
					for(AutoriPago autoripago : banco.getAutoriPagos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						AutoriPagoConstantesFunciones.generarExcelReporteDataAutoriPago("RELACIONADO",row,workbook,autoripago,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//TarjetaCredito
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO))) {

				if(banco.getTarjetaCreditos()!=null && banco.getTarjetaCreditos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TarjetaCreditoConstantesFunciones.generarExcelReporteHeaderTarjetaCredito("RELACIONADO",row,workbook);
				}

				if(banco.getTarjetaCreditos()!=null) {
					i2=0;
					for(TarjetaCredito tarjetacredito : banco.getTarjetaCreditos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TarjetaCreditoConstantesFunciones.generarExcelReporteDataTarjetaCredito("RELACIONADO",row,workbook,tarjetacredito,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//CuentaBancoPunVen
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO))) {

				if(banco.getCuentaBancoPunVens()!=null && banco.getCuentaBancoPunVens().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CuentaBancoPunVenConstantesFunciones.generarExcelReporteHeaderCuentaBancoPunVen("RELACIONADO",row,workbook);
				}

				if(banco.getCuentaBancoPunVens()!=null) {
					i2=0;
					for(CuentaBancoPunVen cuentabancopunven : banco.getCuentaBancoPunVens()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CuentaBancoPunVenConstantesFunciones.generarExcelReporteDataCuentaBancoPunVen("RELACIONADO",row,workbook,cuentabancopunven,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//PoliticasCliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(banco.getPoliticasClientes()!=null && banco.getPoliticasClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PoliticasClienteConstantesFunciones.generarExcelReporteHeaderPoliticasCliente("RELACIONADO",row,workbook);
				}

				if(banco.getPoliticasClientes()!=null) {
					i2=0;
					for(PoliticasCliente politicascliente : banco.getPoliticasClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PoliticasClienteConstantesFunciones.generarExcelReporteDataPoliticasCliente("RELACIONADO",row,workbook,politicascliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//FormaPagoPuntoVenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(banco.getFormaPagoPuntoVentas()!=null && banco.getFormaPagoPuntoVentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormaPagoPuntoVentaConstantesFunciones.generarExcelReporteHeaderFormaPagoPuntoVenta("RELACIONADO",row,workbook);
				}

				if(banco.getFormaPagoPuntoVentas()!=null) {
					i2=0;
					for(FormaPagoPuntoVenta formapagopuntoventa : banco.getFormaPagoPuntoVentas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FormaPagoPuntoVentaConstantesFunciones.generarExcelReporteDataFormaPagoPuntoVenta("RELACIONADO",row,workbook,formapagopuntoventa,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//CuentaBanco
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CuentaBancoConstantesFunciones.SCLASSWEBTITULO))) {

				if(banco.getCuentaBancos()!=null && banco.getCuentaBancos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CuentaBancoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CuentaBancoConstantesFunciones.generarExcelReporteHeaderCuentaBanco("RELACIONADO",row,workbook);
				}

				if(banco.getCuentaBancos()!=null) {
					i2=0;
					for(CuentaBanco cuentabanco : banco.getCuentaBancos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CuentaBancoConstantesFunciones.generarExcelReporteDataCuentaBanco("RELACIONADO",row,workbook,cuentabanco,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//TipoCuentaBancoGeneral
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO))) {

				if(banco.getTipoCuentaBancoGenerals()!=null && banco.getTipoCuentaBancoGenerals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TipoCuentaBancoGeneralConstantesFunciones.generarExcelReporteHeaderTipoCuentaBancoGeneral("RELACIONADO",row,workbook);
				}

				if(banco.getTipoCuentaBancoGenerals()!=null) {
					i2=0;
					for(TipoCuentaBancoGeneral tipocuentabancogeneral : banco.getTipoCuentaBancoGenerals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TipoCuentaBancoGeneralConstantesFunciones.generarExcelReporteDataTipoCuentaBancoGeneral("RELACIONADO",row,workbook,tipocuentabancogeneral,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(BancoConstantesFunciones.getBancoDescripcion(banco));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoBanco.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBanco.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessBanco() throws Exception {		
		this.startProcessBanco(true);
	}
	
	public void startProcessBanco(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasBanco ,this.jPanelParametrosReportesBanco, this.jScrollPanelDatosBanco,this.jPanelPaginacionBanco, this.jScrollPanelDatosEdicionBanco, this.jPanelAccionesBanco,this.jPanelAccionesFormularioBanco,this.jmenuBarBanco,this.jmenuBarDetalleBanco,this.jTtoolBarBanco,this.jTtoolBarDetalleBanco);		
		
		final JTabbedPane jTabbedPaneBusquedasBanco=this.jTabbedPaneBusquedasBanco; 
		
		final JPanel jPanelParametrosReportesBanco=this.jPanelParametrosReportesBanco;
		//final JScrollPane jScrollPanelDatosBanco=this.jScrollPanelDatosBanco;
		final JTable jTableDatosBanco=this.jTableDatosBanco;		
		final JPanel jPanelPaginacionBanco=this.jPanelPaginacionBanco;
		//final JScrollPane jScrollPanelDatosEdicionBanco=this.jScrollPanelDatosEdicionBanco;
		final JPanel jPanelAccionesBanco=this.jPanelAccionesBanco;
		
		JPanel jPanelCamposAuxiliarBanco=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarBanco=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormBanco!=null) {
			jPanelCamposAuxiliarBanco=this.jInternalFrameDetalleFormBanco.jPanelCamposBanco;
			jPanelAccionesFormularioAuxiliarBanco=this.jInternalFrameDetalleFormBanco.jPanelAccionesFormularioBanco;
		}
		
		final JPanel jPanelCamposBanco=jPanelCamposAuxiliarBanco;
		final JPanel jPanelAccionesFormularioBanco=jPanelAccionesFormularioAuxiliarBanco;
		
		
		final JMenuBar jmenuBarBanco=this.jmenuBarBanco;
		final JToolBar jTtoolBarBanco=this.jTtoolBarBanco;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarBanco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBanco=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormBanco!=null) {
			jmenuBarDetalleAuxiliarBanco=this.jInternalFrameDetalleFormBanco.jmenuBarDetalleBanco;
			jTtoolBarDetalleAuxiliarBanco=this.jInternalFrameDetalleFormBanco.jTtoolBarDetalleBanco;
		}
		
		final JMenuBar jmenuBarDetalleBanco=jmenuBarDetalleAuxiliarBanco;
		final JToolBar jTtoolBarDetalleBanco=jTtoolBarDetalleAuxiliarBanco;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBanco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBanco;
			processRunnable.jTableDatos=jTableDatosBanco;
			processRunnable.jPanelCampos=jPanelCamposBanco;
			processRunnable.jPanelPaginacion=jPanelPaginacionBanco;
			processRunnable.jPanelAcciones=jPanelAccionesBanco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBanco;
			
			
			processRunnable.jmenuBar=jmenuBarBanco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBanco;
			processRunnable.jTtoolBar=jTtoolBarBanco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBanco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBanco ,jPanelParametrosReportesBanco,jTableDatosBanco, /*jScrollPanelDatosBanco,*/jPanelCamposBanco,jPanelPaginacionBanco, /*jScrollPanelDatosEdicionBanco,*/ jPanelAccionesBanco,jPanelAccionesFormularioBanco,jmenuBarBanco,jmenuBarDetalleBanco,jTtoolBarBanco,jTtoolBarDetalleBanco);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBanco ,jPanelParametrosReportesBanco, jScrollPanelDatosBanco,jPanelPaginacionBanco, jScrollPanelDatosEdicionBanco, jPanelAccionesBanco,jPanelAccionesFormularioBanco,jmenuBarBanco,jmenuBarDetalleBanco,jTtoolBarBanco,jTtoolBarDetalleBanco);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessBanco() {// throws Exception 
		this.finishProcessBanco(true);
	}
	
	public void finishProcessBanco(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasBanco ,this.jPanelParametrosReportesBanco, this.jScrollPanelDatosBanco,this.jPanelPaginacionBanco, this.jScrollPanelDatosEdicionBanco, this.jPanelAccionesBanco,this.jPanelAccionesFormularioBanco,this.jmenuBarBanco,this.jmenuBarDetalleBanco,this.jTtoolBarBanco,this.jTtoolBarDetalleBanco);		
		
		final JTabbedPane jTabbedPaneBusquedasBanco=this.jTabbedPaneBusquedasBanco; 
		
		final JPanel jPanelParametrosReportesBanco=this.jPanelParametrosReportesBanco;
		//final JScrollPane jScrollPanelDatosBanco=this.jScrollPanelDatosBanco;
		final JTable jTableDatosBanco=this.jTableDatosBanco;		
		final JPanel jPanelPaginacionBanco=this.jPanelPaginacionBanco;
		//final JScrollPane jScrollPanelDatosEdicionBanco=this.jScrollPanelDatosEdicionBanco;
		final JPanel jPanelAccionesBanco=this.jPanelAccionesBanco;
		
		JPanel jPanelCamposAuxiliarBanco=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarBanco=new JPanel();
		
		if(this.jInternalFrameDetalleFormBanco!=null) {
			jPanelCamposAuxiliarBanco=this.jInternalFrameDetalleFormBanco.jPanelCamposBanco;
			jPanelAccionesFormularioAuxiliarBanco=this.jInternalFrameDetalleFormBanco.jPanelAccionesFormularioBanco;
		}
		
		final JPanel jPanelCamposBanco=jPanelCamposAuxiliarBanco;
		final JPanel jPanelAccionesFormularioBanco=jPanelAccionesFormularioAuxiliarBanco;
		
		
		final JMenuBar jmenuBarBanco=this.jmenuBarBanco;		
		final JToolBar jTtoolBarBanco=this.jTtoolBarBanco;
				
		JMenuBar jmenuBarDetalleAuxiliarBanco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBanco=new JToolBar();
		
		if(this.jInternalFrameDetalleFormBanco!=null) {
			jmenuBarDetalleAuxiliarBanco=this.jInternalFrameDetalleFormBanco.jmenuBarDetalleBanco;
			jTtoolBarDetalleAuxiliarBanco=this.jInternalFrameDetalleFormBanco.jTtoolBarDetalleBanco;		
		}
		
		final JMenuBar jmenuBarDetalleBanco=jmenuBarDetalleAuxiliarBanco;
		final JToolBar jTtoolBarDetalleBanco=jTtoolBarDetalleAuxiliarBanco;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBanco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBanco;
			processRunnable.jTableDatos=jTableDatosBanco;
			processRunnable.jPanelCampos=jPanelCamposBanco;
			processRunnable.jPanelPaginacion=jPanelPaginacionBanco;
			processRunnable.jPanelAcciones=jPanelAccionesBanco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBanco;
			
			
			processRunnable.jmenuBar=jmenuBarBanco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBanco;
			processRunnable.jTtoolBar=jTtoolBarBanco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBanco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasBanco ,jPanelParametrosReportesBanco, jTableDatosBanco,/*jScrollPanelDatosBanco,*/jPanelCamposBanco,jPanelPaginacionBanco, /*jScrollPanelDatosEdicionBanco,*/ jPanelAccionesBanco,jPanelAccionesFormularioBanco,jmenuBarBanco,jmenuBarDetalleBanco,jTtoolBarBanco,jTtoolBarDetalleBanco));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesBanco(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarBanco(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuBanco(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarBanco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarBanco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleBanco,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuBanco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarBanco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleBanco,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.bancoConstantesFunciones.getsFinalQueryBanco();
		String  finalQueryPaginacionTodos=this.bancoConstantesFunciones.getsFinalQueryBanco();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=BancoConstantesFunciones.getArrayColumnasGlobalesNoBanco(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=BancoConstantesFunciones.getArrayColumnasGlobalesBanco(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,BancoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.bancosEliminados= new ArrayList<Banco>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessBanco();
		
				///*BancoSessionBean*/this.bancoSessionBean=new BancoSessionBean();
			
			if(this.bancoSessionBean==null) {
				this.bancoSessionBean=new BancoSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=BancoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=BancoConstantesFunciones.getClassesForeignKeysOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/banco."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			bancosAux= new ArrayList<Banco>();
			
				
			bancoLogic.setDatosCliente(this.datosCliente);
			bancoLogic.setDatosDeep(this.datosDeep);
			bancoLogic.setIsConDeep(true);
			
			
			bancoLogic.getBancoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					bancoLogic.getTodosBancos(finalQueryGlobal,pagination);
					
					//bancoLogic.getTodosBancosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(bancoLogic.getBancos()==null|| bancoLogic.getBancos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bancosAux= new ArrayList<Banco>();
							bancosAux.addAll(bancoLogic.getBancos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancosAux= new ArrayList<Banco>();
							bancosAux.addAll(bancos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bancoLogic.getTodosBancos(finalQueryGlobal+"",this.pagination);												
							
							//bancoLogic.getTodosBancosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteBancos("Todos",bancoLogic.getBancos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bancoLogic.setBancos(new ArrayList<Banco>());					
							bancoLogic.getBancos().addAll(bancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancos=new ArrayList<Banco>();
							bancos.addAll(bancosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idBanco=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idBanco=this.idActual;
				
				} else if(this.idBancoActual!=null && this.idBancoActual!=0L) {
					idBanco=idBancoActual;
				}
				
					
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndicePorId(idBanco);
				
				this.bancos=new ArrayList<Banco>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					bancoLogic.getEntity(idBanco);
					
					//bancoLogic.getEntityWithConnection(idBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.setBancos(new ArrayList<Banco>());
					bancoLogic.getBancos().add(bancoLogic.getBanco());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bancos=new ArrayList<Banco>();
					this.bancos.add(banco);
				}
				
				if(bancoLogic.getBanco()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bancoLogic.getBancosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bancoLogic.getBancos()==null||bancoLogic.getBancos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bancos==null|| bancos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bancosAux=new ArrayList<Banco>();
						bancosAux.addAll(bancoLogic.getBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancosAux=new ArrayList<Banco>();
							bancosAux.addAll(bancos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bancoLogic.getBancosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBancos("BusquedaPorCodigo",bancoLogic.getBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBancos("BusquedaPorCodigo",bancos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoLogic.setBancos(new ArrayList<Banco>());
						bancoLogic.getBancos().addAll(bancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancos=new ArrayList<Banco>();
							bancos.addAll(bancosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorCodigoInstitucion")) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceBusquedaPorCodigoInstitucion(codigo_institucionBusquedaPorCodigoInstitucion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bancoLogic.getBancosBusquedaPorCodigoInstitucion(finalQueryGlobal,pagination,codigo_institucionBusquedaPorCodigoInstitucion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceBusquedaPorCodigoInstitucion(codigo_institucionBusquedaPorCodigoInstitucion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceBusquedaPorCodigoInstitucion(codigo_institucionBusquedaPorCodigoInstitucion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bancoLogic.getBancos()==null||bancoLogic.getBancos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bancos==null|| bancos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bancosAux=new ArrayList<Banco>();
						bancosAux.addAll(bancoLogic.getBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancosAux=new ArrayList<Banco>();
							bancosAux.addAll(bancos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bancoLogic.getBancosBusquedaPorCodigoInstitucion(finalQueryGlobal,pagination,codigo_institucionBusquedaPorCodigoInstitucion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceBusquedaPorCodigoInstitucion(codigo_institucionBusquedaPorCodigoInstitucion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceBusquedaPorCodigoInstitucion(codigo_institucionBusquedaPorCodigoInstitucion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBancos("BusquedaPorCodigoInstitucion",bancoLogic.getBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBancos("BusquedaPorCodigoInstitucion",bancos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoLogic.setBancos(new ArrayList<Banco>());
						bancoLogic.getBancos().addAll(bancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancos=new ArrayList<Banco>();
							bancos.addAll(bancosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bancoLogic.getBancosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bancoLogic.getBancos()==null||bancoLogic.getBancos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bancos==null|| bancos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bancosAux=new ArrayList<Banco>();
						bancosAux.addAll(bancoLogic.getBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancosAux=new ArrayList<Banco>();
							bancosAux.addAll(bancos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bancoLogic.getBancosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBancos("BusquedaPorNombre",bancoLogic.getBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBancos("BusquedaPorNombre",bancos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoLogic.setBancos(new ArrayList<Banco>());
						bancoLogic.getBancos().addAll(bancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancos=new ArrayList<Banco>();
							bancos.addAll(bancosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bancoLogic.getBancosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bancoLogic.getBancos()==null||bancoLogic.getBancos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bancos==null|| bancos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bancosAux=new ArrayList<Banco>();
						bancosAux.addAll(bancoLogic.getBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancosAux=new ArrayList<Banco>();
							bancosAux.addAll(bancos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bancoLogic.getBancosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBancos("FK_IdEmpresa",bancoLogic.getBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBancos("FK_IdEmpresa",bancos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoLogic.setBancos(new ArrayList<Banco>());
						bancoLogic.getBancos().addAll(bancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancos=new ArrayList<Banco>();
							bancos.addAll(bancosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bancoLogic.getBancosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bancoLogic.getBancos()==null||bancoLogic.getBancos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bancos==null|| bancos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bancosAux=new ArrayList<Banco>();
						bancosAux.addAll(bancoLogic.getBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancosAux=new ArrayList<Banco>();
							bancosAux.addAll(bancos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bancoLogic.getBancosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBancos("FK_IdSucursal",bancoLogic.getBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBancos("FK_IdSucursal",bancos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoLogic.setBancos(new ArrayList<Banco>());
						bancoLogic.getBancos().addAll(bancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancos=new ArrayList<Banco>();
							bancos.addAll(bancosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoBanco")) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceFK_IdTipoBanco(id_tipo_bancoFK_IdTipoBanco);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bancoLogic.getBancosFK_IdTipoBanco(finalQueryGlobal,pagination,id_tipo_bancoFK_IdTipoBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceFK_IdTipoBanco(id_tipo_bancoFK_IdTipoBanco);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceFK_IdTipoBanco(id_tipo_bancoFK_IdTipoBanco);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bancoLogic.getBancos()==null||bancoLogic.getBancos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bancos==null|| bancos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bancosAux=new ArrayList<Banco>();
						bancosAux.addAll(bancoLogic.getBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancosAux=new ArrayList<Banco>();
							bancosAux.addAll(bancos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bancoLogic.getBancosFK_IdTipoBanco(finalQueryGlobal,pagination,id_tipo_bancoFK_IdTipoBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceFK_IdTipoBanco(id_tipo_bancoFK_IdTipoBanco);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoConstantesFunciones.getDetalleIndiceFK_IdTipoBanco(id_tipo_bancoFK_IdTipoBanco);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBancos("FK_IdTipoBanco",bancoLogic.getBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBancos("FK_IdTipoBanco",bancos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoLogic.setBancos(new ArrayList<Banco>());
						bancoLogic.getBancos().addAll(bancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancos=new ArrayList<Banco>();
							bancos.addAll(bancosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesBanco();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessBanco();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=bancoLogic.getBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bancos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=bancoLogic.getBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bancos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Banco banco) {
		Boolean permite=true;
		
		if(this.banco.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=BancoConstantesFunciones.getOrderByListaBanco();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=BancoConstantesFunciones.getOrderByListaBanco();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Banco banco:bancoLogic.getBancos()) {
				if(banco.getsType().equals(Constantes2.S_TOTALES)) {
					bancoTotales=banco;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Banco banco:this.bancos) {
				if(banco.getsType().equals(Constantes2.S_TOTALES)) {
					bancoTotales=banco;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.bancoAux=new Banco();
			this.bancoAux.setsType(Constantes2.S_TOTALES);
			this.bancoAux.setIsNew(false);
			this.bancoAux.setIsChanged(false);
			this.bancoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				BancoConstantesFunciones.TotalizarValoresFilaBanco(this.bancoLogic.getBancos(),this.bancoAux);
				
				this.bancoLogic.getBancos().add(this.bancoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				BancoConstantesFunciones.TotalizarValoresFilaBanco(this.bancos,this.bancoAux);
				
				this.bancos.add(this.bancoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		bancoTotales=new Banco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.bancoLogic.getBancos().remove(bancoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.bancos.remove(bancoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		bancoTotales=new Banco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Banco banco:bancoLogic.getBancos()) {
				if(banco.getsType().equals(Constantes2.S_TOTALES)) {
					bancoTotales=banco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BancoConstantesFunciones.TotalizarValoresFilaBanco(this.bancoLogic.getBancos(),bancoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Banco banco:this.bancos) {
				if(banco.getsType().equals(Constantes2.S_TOTALES)) {
					bancoTotales=banco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BancoConstantesFunciones.TotalizarValoresFilaBanco(this.bancos,bancoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getBancosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancosBusquedaPorCodigoInstitucion()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigoInstitucion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancosFK_IdCuentaContableCredito()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableCredito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancosFK_IdCuentaContableDebito()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableDebito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancosFK_IdFormato1()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormato1";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancosFK_IdFormato2()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormato2";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancosFK_IdTipoBanco()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoBanco";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getBancosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.getBancosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancosBusquedaPorCodigoInstitucion(String sFinalQuery,String codigo_institucion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.getBancosBusquedaPorCodigoInstitucion(sFinalQuery,this.pagination,codigo_institucion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.getBancosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancosFK_IdCuentaContableCredito(String sFinalQuery,Long id_cuenta_contable_credito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.getBancosFK_IdCuentaContableCredito(sFinalQuery,this.pagination,id_cuenta_contable_credito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancosFK_IdCuentaContableDebito(String sFinalQuery,Long id_cuenta_contable_debito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.getBancosFK_IdCuentaContableDebito(sFinalQuery,this.pagination,id_cuenta_contable_debito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.getBancosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancosFK_IdFormato1(String sFinalQuery,Long id_formato1)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.getBancosFK_IdFormato1(sFinalQuery,this.pagination,id_formato1);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancosFK_IdFormato2(String sFinalQuery,Long id_formato2)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.getBancosFK_IdFormato2(sFinalQuery,this.pagination,id_formato2);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.getBancosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancosFK_IdTipoBanco(String sFinalQuery,Long id_tipo_banco)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.getBancosFK_IdTipoBanco(sFinalQuery,this.pagination,id_tipo_banco);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosBanco() {
		this.isPermisoTodoBanco=false;
		this.isPermisoNuevoBanco=false;
		this.isPermisoActualizarBanco=false;
		this.isPermisoActualizarOriginalBanco=false;
		this.isPermisoEliminarBanco=false;
		this.isPermisoGuardarCambiosBanco=false;
		this.isPermisoConsultaBanco=false;
		this.isPermisoBusquedaBanco=false;
		this.isPermisoReporteBanco=false;		
		this.isPermisoOrdenBanco=false;		
		this.isPermisoPaginacionMedioBanco=false;		
		this.isPermisoPaginacionAltoBanco=false;
		this.isPermisoPaginacionTodoBanco=false;
		this.isPermisoCopiarBanco=false;		
		this.isPermisoVerFormBanco=false;		
		this.isPermisoDuplicarBanco=false;		
		this.isPermisoOrdenBanco=false;		
	}
	
	public void setPermisosUsuarioBanco(Boolean isPermiso) {
		this.isPermisoTodoBanco=isPermiso;
		this.isPermisoNuevoBanco=isPermiso;
		this.isPermisoActualizarBanco=isPermiso;
		this.isPermisoActualizarOriginalBanco=isPermiso;
		this.isPermisoEliminarBanco=isPermiso;
		this.isPermisoGuardarCambiosBanco=isPermiso;
		this.isPermisoConsultaBanco=isPermiso;
		this.isPermisoBusquedaBanco=isPermiso;
		this.isPermisoReporteBanco=isPermiso;
		this.isPermisoOrdenBanco=isPermiso;		
		this.isPermisoPaginacionMedioBanco=isPermiso;		
		this.isPermisoPaginacionAltoBanco=isPermiso;		
		this.isPermisoPaginacionTodoBanco=isPermiso;		
		this.isPermisoCopiarBanco=isPermiso;		
		this.isPermisoVerFormBanco=isPermiso;		
		this.isPermisoDuplicarBanco=isPermiso;
		this.isPermisoOrdenBanco=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioBanco(Boolean isPermiso) {
		//this.isPermisoTodoBanco=isPermiso;
		this.isPermisoNuevoBanco=isPermiso;
		this.isPermisoActualizarBanco=isPermiso;
		this.isPermisoActualizarOriginalBanco=isPermiso;
		this.isPermisoEliminarBanco=isPermiso;
		this.isPermisoGuardarCambiosBanco=isPermiso;
		//this.isPermisoConsultaBanco=isPermiso;
		//this.isPermisoBusquedaBanco=isPermiso;
		//this.isPermisoReporteBanco=isPermiso;
		//this.isPermisoOrdenBanco=isPermiso;		
		//this.isPermisoPaginacionMedioBanco=isPermiso;		
		//this.isPermisoPaginacionAltoBanco=isPermiso;		
		//this.isPermisoPaginacionTodoBanco=isPermiso;		
		//this.isPermisoCopiarBanco=isPermiso;		
		//this.isPermisoDuplicarBanco=isPermiso;
		//this.isPermisoOrdenBanco=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioBancoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CuentaBancoPunVenConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PoliticasClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(TarjetaCreditoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(AutoriPagoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(TipoCuentaBancoGeneralConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CuentaBancoConstantesFunciones.SNOMBREOPCION);
		
		if(BancoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCuentaBancoPunVen=false;
		this.isTienePermisosCuentaBancoPunVen=this.verificarGetPermisosUsuarioOpcionBancoClaseRelacionada(this.opcionsRelacionadas,CuentaBancoPunVenConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPoliticasCliente=false;
		this.isTienePermisosPoliticasCliente=this.verificarGetPermisosUsuarioOpcionBancoClaseRelacionada(this.opcionsRelacionadas,PoliticasClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosFormaPagoPuntoVenta=false;
		this.isTienePermisosFormaPagoPuntoVenta=this.verificarGetPermisosUsuarioOpcionBancoClaseRelacionada(this.opcionsRelacionadas,FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosTarjetaCredito=false;
		this.isTienePermisosTarjetaCredito=this.verificarGetPermisosUsuarioOpcionBancoClaseRelacionada(this.opcionsRelacionadas,TarjetaCreditoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosAutoriPago=false;
		this.isTienePermisosAutoriPago=this.verificarGetPermisosUsuarioOpcionBancoClaseRelacionada(this.opcionsRelacionadas,AutoriPagoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosTipoCuentaBancoGeneral=false;
		this.isTienePermisosTipoCuentaBancoGeneral=this.verificarGetPermisosUsuarioOpcionBancoClaseRelacionada(this.opcionsRelacionadas,TipoCuentaBancoGeneralConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCuentaBanco=false;
		this.isTienePermisosCuentaBanco=this.verificarGetPermisosUsuarioOpcionBancoClaseRelacionada(this.opcionsRelacionadas,CuentaBancoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebBanco(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioBancoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCuentaBancoPunVen=conPermiso;
		this.isTienePermisosPoliticasCliente=conPermiso;
		this.isTienePermisosFormaPagoPuntoVenta=conPermiso;
		this.isTienePermisosTarjetaCredito=conPermiso;
		this.isTienePermisosAutoriPago=conPermiso;
		this.isTienePermisosTipoCuentaBancoGeneral=conPermiso;
		this.isTienePermisosCuentaBanco=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioBancoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionBancoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioBancoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCuentaBancoPunVen && this.jInternalFrameDetalleFormBanco!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormBanco.jTabbedPaneRelacionesBanco.remove(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPoliticasCliente && this.jInternalFrameDetalleFormBanco!=null && this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormBanco.jTabbedPaneRelacionesBanco.remove(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosFormaPagoPuntoVenta && this.jInternalFrameDetalleFormBanco!=null && this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormBanco.jTabbedPaneRelacionesBanco.remove(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosTarjetaCredito && this.jInternalFrameDetalleFormBanco!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormBanco.jTabbedPaneRelacionesBanco.remove(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosAutoriPago && this.jInternalFrameDetalleFormBanco!=null && this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormBanco.jTabbedPaneRelacionesBanco.remove(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosTipoCuentaBancoGeneral && this.jInternalFrameDetalleFormBanco!=null && this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormBanco.jTabbedPaneRelacionesBanco.remove(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCuentaBanco && this.jInternalFrameDetalleFormBanco!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormBanco.jTabbedPaneRelacionesBanco.remove(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioBanco() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(BancoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.bancoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, BancoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoBanco=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarBanco=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalBanco=this.isPermisoActualizarBanco;
			this.isPermisoEliminarBanco=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosBanco=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaBanco=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaBanco=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoBanco=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteBanco=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBanco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioBanco=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoBanco=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoBanco=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarBanco=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormBanco=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarBanco=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBanco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.bancoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosBanco.setToolTipText(this.jTableDatosBanco.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioBanco(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioBanco(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(BancoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(BancoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioBanco() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosAutoriPago && this.bancoConstantesFunciones.mostrarAutoriPagoBanco && !BancoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Autori Pago");
			reporte.setsDescripcion("Autori Pago");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosTarjetaCredito && this.bancoConstantesFunciones.mostrarTarjetaCreditoBanco && !BancoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Tarjeta Credito");
			reporte.setsDescripcion("Tarjeta Credito");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCuentaBancoPunVen && this.bancoConstantesFunciones.mostrarCuentaBancoPunVenBanco && !BancoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cuenta Banco");
			reporte.setsDescripcion("Cuenta Banco");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPoliticasCliente && this.bancoConstantesFunciones.mostrarPoliticasClienteBanco && !BancoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Politicas Cliente");
			reporte.setsDescripcion("Politicas Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosFormaPagoPuntoVenta && this.bancoConstantesFunciones.mostrarFormaPagoPuntoVentaBanco && !BancoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Forma Pago");
			reporte.setsDescripcion("Forma Pago");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCuentaBanco && this.bancoConstantesFunciones.mostrarCuentaBancoBanco && !BancoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cuenta Banco");
			reporte.setsDescripcion("Cuenta Banco");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosTipoCuentaBancoGeneral && this.bancoConstantesFunciones.mostrarTipoCuentaBancoGeneralBanco && !BancoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Tipo Cuenta Banco General");
			reporte.setsDescripcion("Tipo Cuenta Banco General");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyBancoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.tipobancosForeignKey=new ArrayList();
				this.cuentacontabledebitosForeignKey=new ArrayList();
				this.cuentacontablecreditosForeignKey=new ArrayList();
				this.formato1sForeignKey=new ArrayList();
				this.formato2sForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyBancoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(BancoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyBancoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableDebitoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormato1Listas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormato2Listas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoBancoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipobancosForeignKey==null||this.tipobancosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoBancoConstantesFunciones.getArrayColumnasGlobalesTipoBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoBancoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoBancoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoBancosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableDebitoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontabledebitosForeignKey==null||this.cuentacontabledebitosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();
				this.arrDatoGeneralNo.add("modulo");

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableDebitosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableCreditoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablecreditosForeignKey==null||this.cuentacontablecreditosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();
				this.arrDatoGeneralNo.add("modulo");

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableCreditosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormato1Listas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formato1sForeignKey==null||this.formato1sForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormato1sForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormato2Listas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formato2sForeignKey==null||this.formato2sForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormato2sForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyBancoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			BancoParameterReturnGeneral bancoReturnGeneral=new BancoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.bancoConstantesFunciones.cargarid_empresaBanco)
					 || (this.esRecargarFks && this.bancoConstantesFunciones.cargarid_empresaBanco)) {

					if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+bancoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.bancoConstantesFunciones.cargarid_sucursalBanco)
					 || (this.esRecargarFks && this.bancoConstantesFunciones.cargarid_sucursalBanco)) {

					if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+bancoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalTipoBanco="";

				if(((this.tipobancosForeignKey==null||this.tipobancosForeignKey.size()<=0) && this.bancoConstantesFunciones.cargarid_tipo_bancoBanco)
					 || (this.esRecargarFks && this.bancoConstantesFunciones.cargarid_tipo_bancoBanco)) {

					if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionTipoBanco()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoBancoConstantesFunciones.getArrayColumnasGlobalesTipoBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoBanco=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoBancoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoBanco=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoBanco, "");
						finalQueryGlobalTipoBanco+=TipoBancoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoBancosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoBanco=" WHERE " + ConstantesSql.ID + "="+bancoSessionBean.getlidTipoBancoActual();
					}
				} else {
					finalQueryGlobalTipoBanco="NONE";
				}


				String finalQueryGlobalCuentaContableDebito="";

				if(((this.cuentacontabledebitosForeignKey==null||this.cuentacontabledebitosForeignKey.size()<=0) && this.bancoConstantesFunciones.cargarid_cuenta_contable_debitoBanco)
					 || (this.esRecargarFks && this.bancoConstantesFunciones.cargarid_cuenta_contable_debitoBanco)) {

					if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");
						this.arrDatoGeneralNo.add("modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableDebito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableDebito=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableDebito, "");
						finalQueryGlobalCuentaContableDebito+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableDebitosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableDebito=" WHERE " + ConstantesSql.ID + "="+bancoSessionBean.getlidCuentaContableDebitoActual();
					}
				} else {
					finalQueryGlobalCuentaContableDebito="NONE";
				}


				String finalQueryGlobalCuentaContableCredito="";

				if(((this.cuentacontablecreditosForeignKey==null||this.cuentacontablecreditosForeignKey.size()<=0) && this.bancoConstantesFunciones.cargarid_cuenta_contable_creditoBanco)
					 || (this.esRecargarFks && this.bancoConstantesFunciones.cargarid_cuenta_contable_creditoBanco)) {

					if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");
						this.arrDatoGeneralNo.add("modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableCredito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableCredito=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableCredito, "");
						finalQueryGlobalCuentaContableCredito+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableCreditosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableCredito=" WHERE " + ConstantesSql.ID + "="+bancoSessionBean.getlidCuentaContableCreditoActual();
					}
				} else {
					finalQueryGlobalCuentaContableCredito="NONE";
				}


				String finalQueryGlobalFormato1="";

				if(((this.formato1sForeignKey==null||this.formato1sForeignKey.size()<=0) && this.bancoConstantesFunciones.cargarid_formato1Banco)
					 || (this.esRecargarFks && this.bancoConstantesFunciones.cargarid_formato1Banco)) {

					if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionFormato1()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormato1=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

						finalQueryGlobalFormato1=Funciones.GetFinalQueryAppend(finalQueryGlobalFormato1, "");
						finalQueryGlobalFormato1+=FormatoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormato1sForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormato1=" WHERE " + ConstantesSql.ID + "="+bancoSessionBean.getlidFormato1Actual();
					}
				} else {
					finalQueryGlobalFormato1="NONE";
				}


				String finalQueryGlobalFormato2="";

				if(((this.formato2sForeignKey==null||this.formato2sForeignKey.size()<=0) && this.bancoConstantesFunciones.cargarid_formato2Banco)
					 || (this.esRecargarFks && this.bancoConstantesFunciones.cargarid_formato2Banco)) {

					if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionFormato2()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormato2=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

						finalQueryGlobalFormato2=Funciones.GetFinalQueryAppend(finalQueryGlobalFormato2, "");
						finalQueryGlobalFormato2+=FormatoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormato2sForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormato2=" WHERE " + ConstantesSql.ID + "="+bancoSessionBean.getlidFormato2Actual();
					}
				} else {
					finalQueryGlobalFormato2="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				bancoReturnGeneral=bancoLogic.cargarCombosLoteForeignKeyBanco(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalTipoBanco,finalQueryGlobalCuentaContableDebito,finalQueryGlobalCuentaContableCredito,finalQueryGlobalFormato1,finalQueryGlobalFormato2);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=bancoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=bancoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalTipoBanco.equals("NONE")) {
				this.tipobancosForeignKey=bancoReturnGeneral.gettipobancosForeignKey();
			}

			if(!finalQueryGlobalCuentaContableDebito.equals("NONE")) {
				this.cuentacontabledebitosForeignKey=bancoReturnGeneral.getcuentacontabledebitosForeignKey();
			}

			if(!finalQueryGlobalCuentaContableCredito.equals("NONE")) {
				this.cuentacontablecreditosForeignKey=bancoReturnGeneral.getcuentacontablecreditosForeignKey();
			}

			if(!finalQueryGlobalFormato1.equals("NONE")) {
				this.formato1sForeignKey=bancoReturnGeneral.getformato1sForeignKey();
			}

			if(!finalQueryGlobalFormato2.equals("NONE")) {
				this.formato2sForeignKey=bancoReturnGeneral.getformato2sForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyBanco()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyTipoBanco();
			this.addItemDefectoCombosForeignKeyCuentaContableDebito();
			this.addItemDefectoCombosForeignKeyCuentaContableCredito();
			this.addItemDefectoCombosForeignKeyFormato1();
			this.addItemDefectoCombosForeignKeyFormato2();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.bancoSessionBean==null) {
				this.bancoSessionBean=new BancoSessionBean();
			}

			if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoBanco()throws Exception {
		try {

			if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionTipoBanco()) {
				TipoBanco tipobanco=new TipoBanco();
				TipoBancoConstantesFunciones.setTipoBancoDescripcion(tipobanco,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipobanco.setId(null);

				if(!TipoBancoConstantesFunciones.ExisteEnLista(this.tipobancosForeignKey,tipobanco,true)) {

					this.tipobancosForeignKey.add(0,tipobanco);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContableDebito()throws Exception {
		try {

			if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {
				CuentaContable cuentacontabledebito=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontabledebito,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontabledebito.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontabledebitosForeignKey,cuentacontabledebito,true)) {

					this.cuentacontabledebitosForeignKey.add(0,cuentacontabledebito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContableCredito()throws Exception {
		try {

			if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
				CuentaContable cuentacontablecredito=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontablecredito,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontablecredito.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablecreditosForeignKey,cuentacontablecredito,true)) {

					this.cuentacontablecreditosForeignKey.add(0,cuentacontablecredito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFormato1()throws Exception {
		try {

			if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionFormato1()) {
				Formato formato1=new Formato();
				FormatoConstantesFunciones.setFormatoDescripcion(formato1,Constantes.SMENSAJE_ESCOJA_OPCION);
				formato1.setId(null);

				if(!FormatoConstantesFunciones.ExisteEnLista(this.formato1sForeignKey,formato1,true)) {

					this.formato1sForeignKey.add(0,formato1);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFormato2()throws Exception {
		try {

			if(!this.bancoSessionBean.getisBusquedaDesdeForeignKeySesionFormato2()) {
				Formato formato2=new Formato();
				FormatoConstantesFunciones.setFormatoDescripcion(formato2,Constantes.SMENSAJE_ESCOJA_OPCION);
				formato2.setId(null);

				if(!FormatoConstantesFunciones.ExisteEnLista(this.formato2sForeignKey,formato2,true)) {

					this.formato2sForeignKey.add(0,formato2);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyBanco()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyTipoBanco("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyBanco(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyTipoBanco(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyTipoBanco(JComboBox jComboBoxTipoBancoGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			TipoBanco tipobancoLocal=(TipoBanco)jComboBoxTipoBancoGenerico.getSelectedItem();

			if(tipobancoLocal!=null  && tipobancoLocal.getId()!=null  && tipobancoLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_tipo_banco="+tipobancoLocal.getId();
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyTipoBanco(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormBanco!=null) {
						this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.addItemListener(new ComboBoxItemListener(this,"id_tipo_bancoBanco"));
						this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.addFocusListener(new ComboBoxFocusListener(this,"id_tipo_bancoBanco"));
					}
				} else {
					if(this.jInternalFrameDetalleFormBanco!=null) {
						this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.addActionListener(new ComboBoxActionListener(this,"id_tipo_bancoBanco"));
						this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.addFocusListener(new ComboBoxFocusListener(this,"id_tipo_bancoBanco"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_tipo_bancoFK_IdTipoBancoBanco.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_tipo_bancoFK_IdTipoBancoBanco"));

						this.jComboBoxid_tipo_bancoFK_IdTipoBancoBanco.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_tipo_bancoFK_IdTipoBancoBanco"));

					} else {
						this.jComboBoxid_tipo_bancoFK_IdTipoBancoBanco.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_tipo_bancoFK_IdTipoBancoBanco"));

						this.jComboBoxid_tipo_bancoFK_IdTipoBancoBanco.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_tipo_bancoFK_IdTipoBancoBanco"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyBanco()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyBanco();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyBanco(Banco banco)throws Exception {	
		try {
			
			this.setActualTipoBancoForeignKey(banco.getid_tipo_banco(),false,"Formulario");
			this.setActualCuentaContableDebitoForeignKey(banco.getid_cuenta_contable_debito(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(banco.getid_cuenta_contable_credito(),false,"Formulario");
			this.setActualFormato1ForeignKey(banco.getid_formato1(),false,"Formulario");
			this.setActualFormato2ForeignKey(banco.getid_formato2(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyBanco(Banco banco,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyBanco()throws Exception {	
		try {
			
			this.setActualTipoBancoForeignKey(this.bancoConstantesFunciones.getid_tipo_banco(),false,"Formulario");
			this.setActualCuentaContableDebitoForeignKey(this.bancoConstantesFunciones.getid_cuenta_contable_debito(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(this.bancoConstantesFunciones.getid_cuenta_contable_credito(),false,"Formulario");
			this.setActualFormato1ForeignKey(this.bancoConstantesFunciones.getid_formato1(),false,"Formulario");
			this.setActualFormato2ForeignKey(this.bancoConstantesFunciones.getid_formato2(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyBanco()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyBanco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyBanco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroBanco()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyBanco()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameTipoBancosForeignKey("Todos");
			this.cargarCombosFrameCuentaContableDebitosForeignKey("Todos");
			this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
			this.cargarCombosFrameFormato1sForeignKey("Todos");
			this.cargarCombosFrameFormato2sForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyBanco(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoBancosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableDebitosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableCreditosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormato1sForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormato2sForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyBanco()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormBanco.jComboBoxid_empresaBanco!=null && this.jInternalFrameDetalleFormBanco.jComboBoxid_empresaBanco.getItemCount()>0) {
				this.jInternalFrameDetalleFormBanco.jComboBoxid_empresaBanco.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBanco.jComboBoxid_sucursalBanco!=null && this.jInternalFrameDetalleFormBanco.jComboBoxid_sucursalBanco.getItemCount()>0) {
				this.jInternalFrameDetalleFormBanco.jComboBoxid_sucursalBanco.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco!=null && this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.getItemCount()>0) {
				this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_debitoBanco!=null && this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_debitoBanco.getItemCount()>0) {
				this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_debitoBanco.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_creditoBanco!=null && this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_creditoBanco.getItemCount()>0) {
				this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_creditoBanco.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBanco.jComboBoxid_formato1Banco!=null && this.jInternalFrameDetalleFormBanco.jComboBoxid_formato1Banco.getItemCount()>0) {
				this.jInternalFrameDetalleFormBanco.jComboBoxid_formato1Banco.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBanco.jComboBoxid_formato2Banco!=null && this.jInternalFrameDetalleFormBanco.jComboBoxid_formato2Banco.getItemCount()>0) {
				this.jInternalFrameDetalleFormBanco.jComboBoxid_formato2Banco.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	





	public void recargarFormBancoTipoBanco(JComboBox<?> jComboBoxGenericoTipoBanco,String sFormularioTipoBusqueda) throws Exception {

	}








	
	

	public BancoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public BancoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public BancoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.bancoSessionBean=new BancoSessionBean(); 
		this.bancoConstantesFunciones=new BancoConstantesFunciones(); 
		this.bancoBean=new Banco();//(this.bancoConstantesFunciones); 		
		this.bancoReturnGeneral=new BancoParameterReturnGeneral(); 
		
		this.bancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public BancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public BancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public BancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessBanco(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.bancoConstantesFunciones=new BancoConstantesFunciones(); 
			this.bancoBean=new Banco();//this.bancoConstantesFunciones); 			
			this.bancoReturnGeneral=new BancoParameterReturnGeneral(); 
		
			BancoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Banco Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.banco=new Banco();
			this.bancos = new ArrayList<Banco>();
			this.bancosAux = new ArrayList<Banco>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic=new BancoLogic();
				this.bancoLogic.getNewConnexionToDeep("");
			}
			
			//this.bancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.bancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormBanco);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBanco);	
					}
					
					if(this.jInternalFrameImportacionBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBanco);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByBanco);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormBanco!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormBanco);
				this.jInternalFrameDetalleFormBanco.setVisible(false);
				this.jInternalFrameDetalleFormBanco.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBanco);
					this.jInternalFrameReporteDinamicoBanco.setVisible(false);
					this.jInternalFrameReporteDinamicoBanco.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionBanco);
					this.jInternalFrameImportacionBanco.setVisible(false);
					this.jInternalFrameImportacionBanco.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByBanco);
					this.jInternalFrameOrderByBanco.setVisible(false);
					this.jInternalFrameOrderByBanco.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idBancoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=BancoConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.bancoReturnGeneral=new BancoParameterReturnGeneral();
			
			this.bancoParameterGeneral=new BancoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.bancoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(BancoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.bancoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CuentaBancoPunVenConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PoliticasClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(TarjetaCreditoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(AutoriPagoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(TipoCuentaBancoGeneralConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CuentaBancoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BancoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.bancoSessionBean.getEsGuardarRelacionado(),this.bancoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BancoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.bancoSessionBean.getEsGuardarRelacionado(),this.bancoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoBanco=false;
			this.isVisibilidadCeldaDuplicarBanco=true;
			this.isVisibilidadCeldaCopiarBanco=true;
			this.isVisibilidadCeldaVerFormBanco=true;
			this.isVisibilidadCeldaOrdenBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesBanco=false;
			this.isVisibilidadCeldaModificarBanco=false;
			this.isVisibilidadCeldaActualizarBanco=false;
			this.isVisibilidadCeldaEliminarBanco=false;
			this.isVisibilidadCeldaCancelarBanco=false;
			this.isVisibilidadCeldaGuardarBanco=false;
			this.isVisibilidadCeldaGuardarCambiosBanco=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorCodigoInstitucion=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdCuentaContableCredito=true;
			this.isVisibilidadFK_IdCuentaContableDebito=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFormato1=true;
			this.isVisibilidadFK_IdFormato2=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoBanco=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosBanco();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioBanco(false);
			
			this.setPermisosUsuarioBanco();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bancoSessionBean.getEsGuardarRelacionado() 
				|| (this.bancoSessionBean.getEsGuardarRelacionado() && this.bancoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioBancoClasesRelacionadas();
			}
			
			if(this.bancoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioBancoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!BancoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosBanco();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualBanco();
			}
			
			if(!this.isPermisoBusquedaBanco) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasBanco.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bancoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioBanco,this.isPermisoPaginacionMedioBanco,this.isPermisoPaginacionTodoBanco);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(BancoConstantesFunciones.getTiposSeleccionarBanco());
				
				this.tiposColumnasSelect=BancoConstantesFunciones.getTiposSeleccionarBanco(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectBanco();				
				//this.tiposRelacionesSelect=BancoConstantesFunciones.getTiposRelacionesBanco(true);
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioBanco();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioBanco(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioBanco(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesBanco() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			
			this.autoripagoLogic=new AutoriPagoLogic();
			this.tarjetacreditoLogic=new TarjetaCreditoLogic();
			this.cuentabancopunvenLogic=new CuentaBancoPunVenLogic();
			this.politicasclienteLogic=new PoliticasClienteLogic();
			this.formapagopuntoventaLogic=new FormaPagoPuntoVentaLogic();
			this.cuentabancoLogic=new CuentaBancoLogic();
			this.tipocuentabancogeneralLogic=new TipoCuentaBancoGeneralLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.tipobancoLogic=new TipoBancoLogic();
			this.cuentacontabledebitoLogic=new CuentaContableLogic();
			this.cuentacontablecreditoLogic=new CuentaContableLogic();
			this.formato1Logic=new FormatoLogic();
			this.formato2Logic=new FormatoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				bancoImplementable= (BancoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BancoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				bancoImplementableHome= (BancoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BancoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.bancos= new ArrayList<Banco>();
			this.bancosEliminados= new ArrayList<Banco>();
						
			this.isEsNuevoBanco=false;
			this.esParaAccionDesdeFormularioBanco=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.tipobancosForeignKey=new ArrayList<TipoBanco>() ;
			this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>() ;
			this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>() ;
			this.formato1sForeignKey=new ArrayList<Formato>() ;
			this.formato2sForeignKey=new ArrayList<Formato>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyBanco(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroBanco();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			BancoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=BancoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingBanco(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormBanco!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioBanco();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioBanco();
			}
			
			BancoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasBanco.getTabCount(); i++) {
					this.jTabbedPaneBusquedasBanco.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasBanco.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessBanco(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Banco: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectBanco() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(AutoriPagoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(AutoriPagoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesBanco")) {
				iIndex=this.jInternalFrameDetalleFormBanco.jTabbedPaneRelacionesBanco.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormBanco.jTabbedPaneRelacionesBanco.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosBanco.getSelectedRow();	
				
				

				if(sTitle.equals("Autori Pagos")) {
					if(!AutoriPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessBanco();

						this.cargarParteTabPanelRelacionadaAutoriPago(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Cuenta Bancos")) {
					if(!CuentaBancoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessBanco();

						this.cargarParteTabPanelRelacionadaCuentaBanco(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Cuenta Bancoes")) {
					if(!CuentaBancoPunVenJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessBanco();

						this.cargarParteTabPanelRelacionadaCuentaBancoPunVen(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Forma Pagoes")) {
					if(!FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessBanco();

						this.cargarParteTabPanelRelacionadaFormaPagoPuntoVenta(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Politicas Clientes")) {
					if(!PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessBanco();

						this.cargarParteTabPanelRelacionadaPoliticasCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Tarjeta Creditos")) {
					if(!TarjetaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessBanco();

						this.cargarParteTabPanelRelacionadaTarjetaCredito(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Tipo Cuenta Banco Generales")) {
					if(!TipoCuentaBancoGeneralJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessBanco();

						this.cargarParteTabPanelRelacionadaTipoCuentaBancoGeneral(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessBanco();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaAutoriPago(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormBanco.cargarSessionConBeanSwingJInternalFrameAutoriPago(false,true,iIndex);
		this.jButtonAutoriPagoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaAutoriPago();

		//this.jTabbedPaneRelacionesBanco.updateUI();
		//this.jTabbedPaneRelacionesBanco.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesBanco.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCuentaBanco(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormBanco.cargarSessionConBeanSwingJInternalFrameCuentaBanco(false,true,iIndex);
		this.jButtonCuentaBancoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCuentaBanco();

		//this.jTabbedPaneRelacionesBanco.updateUI();
		//this.jTabbedPaneRelacionesBanco.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesBanco.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCuentaBancoPunVen(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormBanco.cargarSessionConBeanSwingJInternalFrameCuentaBancoPunVen(false,true,iIndex);
		this.jButtonCuentaBancoPunVenActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCuentaBancoPunVen();

		//this.jTabbedPaneRelacionesBanco.updateUI();
		//this.jTabbedPaneRelacionesBanco.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesBanco.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaFormaPagoPuntoVenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormBanco.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(false,true,iIndex);
		this.jButtonFormaPagoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta();

		//this.jTabbedPaneRelacionesBanco.updateUI();
		//this.jTabbedPaneRelacionesBanco.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesBanco.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPoliticasCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormBanco.cargarSessionConBeanSwingJInternalFramePoliticasCliente(false,true,iIndex);
		this.jButtonPoliticasClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPoliticasCliente();

		//this.jTabbedPaneRelacionesBanco.updateUI();
		//this.jTabbedPaneRelacionesBanco.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesBanco.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaTarjetaCredito(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormBanco.cargarSessionConBeanSwingJInternalFrameTarjetaCredito(false,true,iIndex);
		this.jButtonTarjetaCreditoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTarjetaCredito();

		//this.jTabbedPaneRelacionesBanco.updateUI();
		//this.jTabbedPaneRelacionesBanco.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesBanco.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaTipoCuentaBancoGeneral(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormBanco.cargarSessionConBeanSwingJInternalFrameTipoCuentaBancoGeneral(false,true,iIndex);
		this.jButtonTipoCuentaBancoGeneralActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTipoCuentaBancoGeneral();

		//this.jTabbedPaneRelacionesBanco.updateUI();
		//this.jTabbedPaneRelacionesBanco.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesBanco.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("AutoriPago")) {
				int row=this.jTableDatosBanco.getSelectedRow();
				jButtonAutoriPagoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("TarjetaCredito")) {
				int row=this.jTableDatosBanco.getSelectedRow();
				jButtonTarjetaCreditoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("CuentaBancoPunVen")) {
				int row=this.jTableDatosBanco.getSelectedRow();
				jButtonCuentaBancoPunVenActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("PoliticasCliente")) {
				int row=this.jTableDatosBanco.getSelectedRow();
				jButtonPoliticasClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("FormaPagoPuntoVenta")) {
				int row=this.jTableDatosBanco.getSelectedRow();
				jButtonFormaPagoPuntoVentaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("CuentaBanco")) {
				int row=this.jTableDatosBanco.getSelectedRow();
				jButtonCuentaBancoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("TipoCuentaBancoGeneral")) {
				int row=this.jTableDatosBanco.getSelectedRow();
				jButtonTipoCuentaBancoGeneralActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Autori Pago")) {

					if(this.isTienePermisosAutoriPago && this.bancoConstantesFunciones.mostrarAutoriPagoBanco && !BancoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Autori Pagos"+"("+AutoriPagoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Autori Pagos");

						if(bancoConstantesFunciones.resaltarAutoriPagoBanco!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(bancoConstantesFunciones.resaltarAutoriPagoBanco);
						}

						jmenuItem.setEnabled(this.bancoConstantesFunciones.activarAutoriPagoBanco);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"AutoriPago"));

						

						this.jInternalFrameDetalleFormBanco.jmenuDetalleBanco.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Tarjeta Credito")) {

					if(this.isTienePermisosTarjetaCredito && this.bancoConstantesFunciones.mostrarTarjetaCreditoBanco && !BancoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Tarjeta Creditos"+"("+TarjetaCreditoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Tarjeta Creditos");

						if(bancoConstantesFunciones.resaltarTarjetaCreditoBanco!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(bancoConstantesFunciones.resaltarTarjetaCreditoBanco);
						}

						jmenuItem.setEnabled(this.bancoConstantesFunciones.activarTarjetaCreditoBanco);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TarjetaCredito"));

						

						this.jInternalFrameDetalleFormBanco.jmenuDetalleBanco.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cuenta Banco")) {

					if(this.isTienePermisosCuentaBancoPunVen && this.bancoConstantesFunciones.mostrarCuentaBancoPunVenBanco && !BancoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cuenta Bancoes"+"("+CuentaBancoPunVenConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cuenta Bancoes");

						if(bancoConstantesFunciones.resaltarCuentaBancoPunVenBanco!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(bancoConstantesFunciones.resaltarCuentaBancoPunVenBanco);
						}

						jmenuItem.setEnabled(this.bancoConstantesFunciones.activarCuentaBancoPunVenBanco);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CuentaBancoPunVen"));

						

						this.jInternalFrameDetalleFormBanco.jmenuDetalleBanco.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Politicas Cliente")) {

					if(this.isTienePermisosPoliticasCliente && this.bancoConstantesFunciones.mostrarPoliticasClienteBanco && !BancoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Politicas Clientes"+"("+PoliticasClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Politicas Clientes");

						if(bancoConstantesFunciones.resaltarPoliticasClienteBanco!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(bancoConstantesFunciones.resaltarPoliticasClienteBanco);
						}

						jmenuItem.setEnabled(this.bancoConstantesFunciones.activarPoliticasClienteBanco);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PoliticasCliente"));

						

						this.jInternalFrameDetalleFormBanco.jmenuDetalleBanco.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Forma Pago")) {

					if(this.isTienePermisosFormaPagoPuntoVenta && this.bancoConstantesFunciones.mostrarFormaPagoPuntoVentaBanco && !BancoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Forma Pagoes"+"("+FormaPagoPuntoVentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Forma Pagoes");

						if(bancoConstantesFunciones.resaltarFormaPagoPuntoVentaBanco!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(bancoConstantesFunciones.resaltarFormaPagoPuntoVentaBanco);
						}

						jmenuItem.setEnabled(this.bancoConstantesFunciones.activarFormaPagoPuntoVentaBanco);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FormaPagoPuntoVenta"));

						

						this.jInternalFrameDetalleFormBanco.jmenuDetalleBanco.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cuenta Banco")) {

					if(this.isTienePermisosCuentaBanco && this.bancoConstantesFunciones.mostrarCuentaBancoBanco && !BancoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cuenta Bancos"+"("+CuentaBancoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cuenta Bancos");

						if(bancoConstantesFunciones.resaltarCuentaBancoBanco!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(bancoConstantesFunciones.resaltarCuentaBancoBanco);
						}

						jmenuItem.setEnabled(this.bancoConstantesFunciones.activarCuentaBancoBanco);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CuentaBanco"));

						

						this.jInternalFrameDetalleFormBanco.jmenuDetalleBanco.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Tipo Cuenta Banco General")) {

					if(this.isTienePermisosTipoCuentaBancoGeneral && this.bancoConstantesFunciones.mostrarTipoCuentaBancoGeneralBanco && !BancoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Tipo Cuenta Banco Generales"+"("+TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Tipo Cuenta Banco Generales");

						if(bancoConstantesFunciones.resaltarTipoCuentaBancoGeneralBanco!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(bancoConstantesFunciones.resaltarTipoCuentaBancoGeneralBanco);
						}

						jmenuItem.setEnabled(this.bancoConstantesFunciones.activarTipoCuentaBancoGeneralBanco);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TipoCuentaBancoGeneral"));

						

						this.jInternalFrameDetalleFormBanco.jmenuDetalleBanco.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyBanco(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyBanco(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyBancoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyBanco();
		
		this.cargarCombosFrameForeignKeyBanco();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyBanco();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyBanco();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoBanco();
				this.cargarCombosFrameTipoBancosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyTipoBanco("Todos");
				}

			this.recargarComboTablaTipoBanco(this.tipobancosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableDebito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableDebitoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableDebito();
				this.cargarCombosFrameCuentaContableDebitosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyTipoBanco("Todos");
				}

			this.recargarComboTablaCuentaContableDebito(this.cuentacontabledebitosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableCredito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableCredito();
				this.cargarCombosFrameCuentaContableCreditosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyTipoBanco("Todos");
				}

			this.recargarComboTablaCuentaContableCredito(this.cuentacontablecreditosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormato1(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormato1Listas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormato1();
				this.cargarCombosFrameFormato1sForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyTipoBanco("Todos");
				}

			this.recargarComboTablaFormato1(this.formato1sForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormato2(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormato2Listas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormato2();
				this.cargarCombosFrameFormato2sForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyTipoBanco("Todos");
				}

			this.recargarComboTablaFormato2(this.formato2sForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoBancoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.bancoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
			
			
			if(jTableDatosBanco.getRowCount()>=1) {
				jTableDatosBanco.removeRowSelectionInterval(0, jTableDatosBanco.getRowCount()-1);						
			}
			
			this.isEsNuevoBanco=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoBanco(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesBanco(true);			
			//this.banco=new Banco();
			//this.banco.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBanco(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBanco() ;
			
			if(BancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBanco(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.banco);	
			this.actualizarInformacion("INFO_PADRE",false,this.banco);				
			
			BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
			
			if(this.bancoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Banco: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarBancoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Banco> bancosSeleccionados=new ArrayList<Banco>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosBanco.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosBanco.getSelectedRows().length;			
			}
			
			bancosSeleccionados=this.getBancosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoBanco--;			
				//Banco bancoAux= new Banco();			
				//bancoAux.setId(this.iIdNuevoBanco);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Banco bancoOrigen=new Banco();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Banco bancoOrigen : bancosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosBanco.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							bancoOrigen =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoOrigen =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaBanco();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.banco.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosBanco(bancoOrigen,this.banco,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.bancoLogic.getBancos().add(this.bancoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.bancos.add(this.bancoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaBanco(false);
				
				this.jTableDatosBanco.setRowSelectionInterval(this.getIndiceNuevoBanco(), this.getIndiceNuevoBanco());
				
				int iLastRow =  this.jTableDatosBanco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBanco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBanco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBanco(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Banco> bancosSeleccionados=new ArrayList<Banco>();									
		
			Banco bancoOrigen=new Banco();
			Banco bancoDestino=new Banco();
				
			bancosSeleccionados=this.getBancosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosBanco.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || bancosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosBanco.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoOrigen =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						bancoOrigen =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoDestino =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						bancoDestino =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				bancoOrigen =bancosSeleccionados.get(0);
				bancoDestino =bancosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosBanco(bancoOrigen,bancoDestino,true,false);
				
				bancoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(bancoDestino,bancoLogic.getBancos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bancoDestino,bancos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaBanco(false);
				
				//this.jTableDatosBanco.setRowSelectionInterval(this.getIndiceNuevoBanco(), this.getIndiceNuevoBanco());
				
				int iLastRow =  this.jTableDatosBanco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBanco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBanco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBanco(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormBanco.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesBanco.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasBanco.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesBanco.setVisible(!isVisible);
			this.jPanelPaginacionBanco.setVisible(!isVisible);
			this.jPanelAccionesBanco.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameBanco();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByBanco();
			
			this.abrirFrameOrderByBanco();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleBanco(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormBanco);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormBanco.isMaximum()) {
					this.jInternalFrameDetalleFormBanco.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormBanco.setSize(this.jInternalFrameDetalleFormBanco.iWidthFormulario,this.jInternalFrameDetalleFormBanco.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormBanco.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormBanco.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormBanco.isMaximum()) {
						this.jInternalFrameDetalleFormBanco.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormBanco.jContentPaneDetalleBanco.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormBanco.jTabbedPaneRelacionesBanco.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormBanco.jContentPaneDetalleBanco.getWidth(),BancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBanco.jTabbedPaneRelacionesBanco.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormBanco.jContentPaneDetalleBanco.getWidth(),BancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBanco.jTabbedPaneRelacionesBanco.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormBanco.jContentPaneDetalleBanco.getWidth(),BancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(AutoriPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaAutoriPago();
					}

					if(CuentaBancoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCuentaBanco();
					}

					if(CuentaBancoPunVenJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCuentaBancoPunVen();
					}

					if(FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta();
					}

					if(PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPoliticasCliente();
					}

					if(TarjetaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTarjetaCredito();
					}

					if(TipoCuentaBancoGeneralJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTipoCuentaBancoGeneral();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormBanco.setVisible(true);
	        this.jInternalFrameDetalleFormBanco.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByBanco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByBanco==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBanco,false,this);
				} else {
					this.jInternalFrameOrderByBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBanco,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByBanco);
				this.jInternalFrameOrderByBanco.setVisible(false);
				this.jInternalFrameOrderByBanco.setSelected(false);
				
				this.jInternalFrameOrderByBanco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBanco"));
				
				this.inicializarActualizarBindingTablaOrderByBanco();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionBanco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionBanco==null) {
				
				this.jInternalFrameImportacionBanco=new ImportacionJInternalFrame(BancoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBanco);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionBanco);
				this.jInternalFrameImportacionBanco.setVisible(false);
				this.jInternalFrameImportacionBanco.setSelected(false);


				this.jInternalFrameImportacionBanco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBanco"));
				this.jInternalFrameImportacionBanco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBanco"));
				this.jInternalFrameImportacionBanco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBanco"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoBanco() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoBanco==null) {
				this.jInternalFrameReporteDinamicoBanco=new ReporteDinamicoJInternalFrame(BancoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBanco);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBanco);
				this.jInternalFrameReporteDinamicoBanco.setVisible(false);
				this.jInternalFrameReporteDinamicoBanco.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoBanco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBanco"));
				this.jInternalFrameReporteDinamicoBanco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBanco"));
				this.jInternalFrameReporteDinamicoBanco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBanco"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBanco();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaAutoriPago() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.jScrollPanelDatosAutoriPago.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormBanco.jContentPaneDetalleBanco.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.jScrollPanelDatosAutoriPago.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.jScrollPanelDatosAutoriPago.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.jScrollPanelDatosAutoriPago.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCuentaBanco() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jScrollPanelDatosCuentaBanco.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormBanco.jContentPaneDetalleBanco.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jScrollPanelDatosCuentaBanco.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jScrollPanelDatosCuentaBanco.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.jScrollPanelDatosCuentaBanco.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCuentaBancoPunVen() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jScrollPanelDatosCuentaBancoPunVen.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormBanco.jContentPaneDetalleBanco.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jScrollPanelDatosCuentaBancoPunVen.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jScrollPanelDatosCuentaBancoPunVen.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.jScrollPanelDatosCuentaBancoPunVen.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormBanco.jContentPaneDetalleBanco.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPoliticasCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormBanco.jContentPaneDetalleBanco.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaTarjetaCredito() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormBanco.jContentPaneDetalleBanco.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaTipoCuentaBancoGeneral() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.jScrollPanelDatosTipoCuentaBancoGeneral.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormBanco.jContentPaneDetalleBanco.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.jScrollPanelDatosTipoCuentaBancoGeneral.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.jScrollPanelDatosTipoCuentaBancoGeneral.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.jScrollPanelDatosTipoCuentaBancoGeneral.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleBanco() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormBanco);
			
	       	this.jInternalFrameDetalleFormBanco.setVisible(false);
	        this.jInternalFrameDetalleFormBanco.setSelected(false);
			
			//this.jInternalFrameDetalleFormBanco.dispose();
			//this.jInternalFrameDetalleFormBanco=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoBanco() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoBanco.setVisible(true);
	        this.jInternalFrameReporteDinamicoBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionBanco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionBanco.setVisible(true);
	        this.jInternalFrameImportacionBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByBanco() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByBanco.setVisible(true);
	        this.jInternalFrameOrderByBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByBanco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByBanco.setVisible(false);
	        this.jInternalFrameOrderByBanco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoBanco() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoBanco.setVisible(false);
	        this.jInternalFrameReporteDinamicoBanco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionBanco() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionBanco.setVisible(false);
	        this.jInternalFrameImportacionBanco.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCuentaContableDebito(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableDebito";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderBanco=(TitledBorder)this.jScrollPanelDatosBanco.getBorder();
						TitledBorder titledBorderCuentaContableDebito=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableDebito.setTitle(titledBorderBanco.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableDebito(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCuentaContable);
						jInternalFrameTreeCuentaContable.setVisible(false);
						jInternalFrameTreeCuentaContable.setSelected(false);
						//jInternalFrameTreeCuentaContable.dispose();
						//jInternalFrameTreeCuentaContable=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeCuentaContableCredito(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableCredito";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderBanco=(TitledBorder)this.jScrollPanelDatosBanco.getBorder();
						TitledBorder titledBorderCuentaContableCredito=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableCredito.setTitle(titledBorderBanco.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableCredito(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCuentaContable);
						jInternalFrameTreeCuentaContable.setVisible(false);
						jInternalFrameTreeCuentaContable.setSelected(false);
						//jInternalFrameTreeCuentaContable.dispose();
						//jInternalFrameTreeCuentaContable=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarBanco(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarBanco(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBanco.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesBanco(true);
			//this.isEsNuevoBanco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBanco(false) ;
			
			if(bancoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenSessionBean.getEsGuardarRelacionado() && CuentaBancoPunVenJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentaBancoPunVenActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.getEsGuardarRelacionado() && PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPoliticasClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado() && FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormaPagoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.getEsGuardarRelacionado() && TarjetaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTarjetaCreditoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.getEsGuardarRelacionado() && AutoriPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAutoriPagoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado() && TipoCuentaBancoGeneralJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTipoCuentaBancoGeneralActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoSessionBean.getEsGuardarRelacionado() && CuentaBancoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentaBancoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(BancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBanco(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBanco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaBancoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarBanco(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBanco.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesBanco(true);
			//this.isEsNuevoBanco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.banco.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesBanco(false) ;
			
			if(BancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBanco(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBanco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTipoBanco(List<TipoBanco> tipobancosForeignKey)throws Exception{
		TableColumn tableColumnTipoBanco=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_IDTIPOBANCO));
		TableCellEditor tableCellEditorTipoBanco =tableColumnTipoBanco.getCellEditor();

		TipoBancoTableCell tipobancoTableCellFk=(TipoBancoTableCell)tableCellEditorTipoBanco;

		if(tipobancoTableCellFk!=null) {
			tipobancoTableCellFk.settipobancosForeignKey(tipobancosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBanco.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipobancoTableCellFk.setRowActual(intSelectedRow);
			//tipobancoTableCellFk.settipobancosForeignKeyActual(tipobancosForeignKey);
		//}


		if(tipobancoTableCellFk!=null) {
			tipobancoTableCellFk.RecargarTipoBancosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableDebito(List<CuentaContable> cuentacontabledebitosForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableDebito=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO));
		TableCellEditor tableCellEditorCuentaContableDebito =tableColumnCuentaContableDebito.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableDebito;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontabledebitosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBanco.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontabledebitosForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableCredito(List<CuentaContable> cuentacontablecreditosForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableCredito=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));
		TableCellEditor tableCellEditorCuentaContableCredito =tableColumnCuentaContableCredito.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableCredito;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablecreditosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBanco.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablecreditosForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFormato1(List<Formato> formato1sForeignKey)throws Exception{
		TableColumn tableColumnFormato1=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_IDFORMATO1));
		TableCellEditor tableCellEditorFormato1 =tableColumnFormato1.getCellEditor();

		FormatoTableCell formatoTableCellFk=(FormatoTableCell)tableCellEditorFormato1;

		if(formatoTableCellFk!=null) {
			formatoTableCellFk.setformatosForeignKey(formato1sForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBanco.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatoTableCellFk.setRowActual(intSelectedRow);
			//formatoTableCellFk.setformatosForeignKeyActual(formato1sForeignKey);
		//}


		if(formatoTableCellFk!=null) {
			formatoTableCellFk.RecargarFormatosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFormato2(List<Formato> formato2sForeignKey)throws Exception{
		TableColumn tableColumnFormato2=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_IDFORMATO2));
		TableCellEditor tableCellEditorFormato2 =tableColumnFormato2.getCellEditor();

		FormatoTableCell formatoTableCellFk=(FormatoTableCell)tableCellEditorFormato2;

		if(formatoTableCellFk!=null) {
			formatoTableCellFk.setformatosForeignKey(formato2sForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBanco.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatoTableCellFk.setRowActual(intSelectedRow);
			//formatoTableCellFk.setformatosForeignKeyActual(formato2sForeignKey);
		//}


		if(formatoTableCellFk!=null) {
			formatoTableCellFk.RecargarFormatosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarBancoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesBanco(false);
			
			//if(!this.isEsNuevoBanco) {								
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(BancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualBanco(this.banco,true);
				this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
				
			}
			
			if(this.permiteMantenimiento(this.banco)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.bancoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoBanco=true;
					this.inicializarActualizarBindingTablaBanco(false);
					this.isEsNuevoBanco=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoBanco=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoBanco=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBanco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBanco(false);
				
				this.habilitarDeshabilitarControlesBanco(false);
			
												
				
				if(BancoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleBanco();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoBancoActionPerformed(evt,bancoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualBanco(this.banco,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosBanco.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,bancoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.banco.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Banco.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Banco.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarBancoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosBanco.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				this.banco.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				this.banco.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.banco)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.bancoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((BancoModel) this.jTableDatosBanco.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoBanco=true;
				this.inicializarActualizarBindingTablaBanco(false);
				this.isEsNuevoBanco=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBanco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBanco(false);
				
				this.habilitarDeshabilitarControlesBanco(false);
				
				
				
				if(BancoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleBanco();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarBancoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosBanco.getRowCount()>=1) {
				jTableDatosBanco.removeRowSelectionInterval(0, jTableDatosBanco.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesBanco(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaBanco(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBanco(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBanco(false) ;
			
			this.isEsNuevoBanco=false;
			
			if(BancoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleBanco();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBanco(false);
				
				//SI ES MANUAL
				if(BancoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualBanco();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoBanco--;			
			//Banco bancoAux= new Banco();			
			//bancoAux.setId(this.iIdNuevoBanco);
			
			if(this.jInternalFrameDetalleFormBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaBanco();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
			
			this.banco.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.bancoLogic.getBancos().add(this.bancoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.bancos.add(this.bancoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaBanco(false);
			
			this.jTableDatosBanco.setRowSelectionInterval(this.getIndiceNuevoBanco(), this.getIndiceNuevoBanco());
			
			int iLastRow =  this.jTableDatosBanco.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosBanco.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosBanco.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaBanco(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingBanco(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBanco(false);
			
			//SI ES MANUAL
			if(BancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBanco();
			}
			
			//this.abrirFrameTreeBanco();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionBancoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE BancoS ?", "MANTENIMIENTO DE Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionBanco.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralBanco();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.bancoReturnGeneral=bancoLogic.procesarImportacionBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.bancoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarBancoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionBancoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionBanco.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionBanco.setFileImportacion(this.jInternalFrameImportacionBanco.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionBanco.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionBanco.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionBanco.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionBanco.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Banco> bancosSeleccionados=new ArrayList<Banco>();		

		bancosSeleccionados=this.getBancosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBanco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBanco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("BancoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"BancoBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteBancos("Todos",bancosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BancoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoConstantesFunciones.LABEL_CODIGOINSTITUCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoInstitucion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoInstitucion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoInstitucion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoInstitucion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoConstantesFunciones.LABEL_IDTIPOBANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoBanco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoBanco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoBanco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoBanco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_asEfectivoLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_asEfectivoLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_asEfectivoLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_asEfectivoLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_asEfectivoExtranjero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_asEfectivoExtranjero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_asEfectivoExtranjero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_asEfectivoExtranjero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableDebito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableDebito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableDebito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableDebito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoConstantesFunciones.LABEL_DELIMITADOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_limitador_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_limitador_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_limitador_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_limitador_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoConstantesFunciones.LABEL_IDFORMATO1:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Formato1_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Formato1_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Formato1_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Formato1_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoConstantesFunciones.LABEL_IDFORMATO2:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Formato2_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Formato2_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Formato2_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Formato2_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoBanco.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoBanco.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoBanco.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case BancoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case BancoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case BancoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case BancoConstantesFunciones.LABEL_CODIGOINSTITUCION:
					sNombreCampoCategoria="codigo_institucion";
					break;

				case BancoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case BancoConstantesFunciones.LABEL_IDTIPOBANCO:
					sNombreCampoCategoria="id_tipo_banco";
					break;

				case BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL:
					sNombreCampoCategoria="dias_efectivo_local";
					break;

				case BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO:
					sNombreCampoCategoria="dias_efectivo_extranjero";
					break;

				case BancoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					sNombreCampoCategoria="id_cuenta_contable_debito";
					break;

				case BancoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoria="id_cuenta_contable_credito";
					break;

				case BancoConstantesFunciones.LABEL_DELIMITADOR:
					sNombreCampoCategoria="delimitador";
					break;

				case BancoConstantesFunciones.LABEL_IDFORMATO1:
					sNombreCampoCategoria="id_formato1";
					break;

				case BancoConstantesFunciones.LABEL_IDFORMATO2:
					sNombreCampoCategoria="id_formato2";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoBanco.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case BancoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case BancoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case BancoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case BancoConstantesFunciones.LABEL_CODIGOINSTITUCION:
					sNombreCampoCategoriaValor="codigo_institucion";
					break;

				case BancoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case BancoConstantesFunciones.LABEL_IDTIPOBANCO:
					sNombreCampoCategoriaValor="id_tipo_banco";
					break;

				case BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL:
					sNombreCampoCategoriaValor="dias_efectivo_local";
					break;

				case BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO:
					sNombreCampoCategoriaValor="dias_efectivo_extranjero";
					break;

				case BancoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					sNombreCampoCategoriaValor="id_cuenta_contable_debito";
					break;

				case BancoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoriaValor="id_cuenta_contable_credito";
					break;

				case BancoConstantesFunciones.LABEL_DELIMITADOR:
					sNombreCampoCategoriaValor="delimitador";
					break;

				case BancoConstantesFunciones.LABEL_IDFORMATO1:
					sNombreCampoCategoriaValor="id_formato1";
					break;

				case BancoConstantesFunciones.LABEL_IDFORMATO2:
					sNombreCampoCategoriaValor="id_formato2";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoBanco.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBanco.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BancoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case BancoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case BancoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case BancoConstantesFunciones.LABEL_CODIGOINSTITUCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Institucion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_institucion");
					break;

				case BancoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case BancoConstantesFunciones.LABEL_IDTIPOBANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Banco Sri",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_banco");
					break;

				case BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dias Efectivo Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dias_efectivo_local");
					break;

				case BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dias Efectivo Extranjero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dias_efectivo_extranjero");
					break;

				case BancoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Debito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_debito");
					break;

				case BancoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_credito");
					break;

				case BancoConstantesFunciones.LABEL_DELIMITADOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Delimitador",sNombreCampoCategoria,sNombreCampoCategoriaValor,"delimitador");
					break;

				case BancoConstantesFunciones.LABEL_IDFORMATO1:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato1",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato1");
					break;

				case BancoConstantesFunciones.LABEL_IDFORMATO2:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato2",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato2");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoBancoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Banco> bancosSeleccionados=new ArrayList<Banco>();		
		
		bancosSeleccionados=this.getBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"banco";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("Bancos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case BancoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Banco banco:bancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(banco.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Banco banco:bancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(banco.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Banco banco:bancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(banco.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoConstantesFunciones.LABEL_CODIGOINSTITUCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoConstantesFunciones.LABEL_CODIGOINSTITUCION);
					iRow++;

					for(Banco banco:bancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(banco.getcodigo_institucion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Banco banco:bancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(banco.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoConstantesFunciones.LABEL_IDTIPOBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoConstantesFunciones.LABEL_IDTIPOBANCO);
					iRow++;

					for(Banco banco:bancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(banco.gettipobanco_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL);
					iRow++;

					for(Banco banco:bancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(banco.getdias_efectivo_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO);
					iRow++;

					for(Banco banco:bancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(banco.getdias_efectivo_extranjero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
					iRow++;

					for(Banco banco:bancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(banco.getcuentacontabledebito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
					iRow++;

					for(Banco banco:bancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(banco.getcuentacontablecredito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoConstantesFunciones.LABEL_DELIMITADOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoConstantesFunciones.LABEL_DELIMITADOR);
					iRow++;

					for(Banco banco:bancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(banco.getdelimitador());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoConstantesFunciones.LABEL_IDFORMATO1:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoConstantesFunciones.LABEL_IDFORMATO1);
					iRow++;

					for(Banco banco:bancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(banco.getformato1_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoConstantesFunciones.LABEL_IDFORMATO2:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoConstantesFunciones.LABEL_IDFORMATO2);
					iRow++;

					for(Banco banco:bancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(banco.getformato2_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelBanco(row);				
			//	iRow++;
			//}				
			
			//for(Banco bancoAux:bancosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelBanco(bancoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBanco(false);
			
			//SI ES MANUAL
			if(BancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBanco();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBanco(false);
			
			//SI ES MANUAL
			if(BancoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBanco();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBanco(false);
			
			//SI ES MANUAL
			if(BancoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBanco();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaBanco() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosBanco.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosBanco.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosBanco.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosBanco.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosBanco.setMinimumSize(dimensionMinimum);
		this.jTableDatosBanco.setMaximumSize(dimensionMaximum);
		this.jTableDatosBanco.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingBanco(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingBanco(esInicializar,true);
	}
	
	public void inicializarActualizarBindingBanco(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaBanco(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesBanco(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasBanco(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBanco(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesBanco(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !BancoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!BancoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualBanco() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaBanco();
		
		this.inicializarActualizarBindingBotonesManualBanco(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualBanco();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBanco() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualBanco(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualBanco(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosBanco.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosBanco.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteBanco.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormBanco!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormBanco.jCheckBoxPostAccionNuevoBanco.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormBanco.jCheckBoxPostAccionSinCerrarBanco.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormBanco.jCheckBoxPostAccionSinMensajeBanco.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosBanco.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosBanco.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteBanco.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormBanco!=null) {
				this.jInternalFrameDetalleFormBanco.jCheckBoxPostAccionNuevoBanco.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormBanco.jCheckBoxPostAccionSinCerrarBanco.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormBanco.jCheckBoxPostAccionSinMensajeBanco.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionBanco.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionBanco.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormBanco!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormBanco.jComboBoxTiposAccionesFormularioBanco.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesBanco.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoBanco!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBanco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesBanco.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesBanco.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarBanco.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesBanco.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoBanco!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBanco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesBanco.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralBanco.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesBanco(Boolean esInicializar) throws Exception {
		try	{	
			if(BancoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualBanco(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesBanco() throws Exception {
		try	{
			if(BancoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualBanco();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBanco() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormBanco.jComboBoxTiposAccionesFormularioBanco.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormBanco.jComboBoxTiposAccionesFormularioBanco.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualBanco() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesBanco.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesBanco.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesBanco.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionBanco.addItem(reporte);
			}
			
			
			if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionBanco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionBanco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesBanco.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesBanco.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormBanco.jComboBoxTiposAccionesFormularioBanco.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormBanco.jComboBoxTiposAccionesFormularioBanco.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarBanco.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarBanco.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBanco();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBanco() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBanco!=null) {
				this.jInternalFrameReporteDinamicoBanco.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoBanco.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBanco!=null) {
				this.jInternalFrameReporteDinamicoBanco.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoBanco.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoBanco!=null) {
				
				if(this.jInternalFrameReporteDinamicoBanco.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBanco.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBanco.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoBanco.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBanco.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBanco.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualBanco()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextAreacodigoBusquedaPorCodigoBanco.getText();
		this.codigo_institucionBusquedaPorCodigoInstitucion=this.jTextFieldcodigo_institucionBusquedaPorCodigoInstitucionBanco.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreBanco.getText();
		if(this.jComboBoxid_tipo_bancoFK_IdTipoBancoBanco.getSelectedItem()!=null){this.id_tipo_bancoFK_IdTipoBanco=((TipoBanco)this.jComboBoxid_tipo_bancoFK_IdTipoBancoBanco.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasBanco(Boolean esInicializar) throws Exception {				
		if(BancoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualBanco();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaBanco() throws Exception {
		this.inicializarActualizarBindingTablaBanco(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByBanco() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByBanco.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBanco.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBanco.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosBancoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBanco.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByBanco.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaBanco(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=bancoLogic.getBancos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=bancos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(BancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosBanco.setModel(new BancoModel(this.bancoLogic.getBancos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosBanco.setModel(new BancoModel(this.bancos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByBanco!=null && this.jInternalFrameOrderByBanco.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByBanco();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+BancoConstantesFunciones.SCLASSWEBTITULO,bancoConstantesFunciones.resaltarSeleccionarBanco,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+BancoConstantesFunciones.SCLASSWEBTITULO,bancoConstantesFunciones.resaltarSeleccionarBanco,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_ID));

		if(this.bancoConstantesFunciones.mostraridBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bancoConstantesFunciones.resaltaridBanco,this.bancoConstantesFunciones.activaridBanco,this,true,"idBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bancoConstantesFunciones.resaltaridBanco,this.bancoConstantesFunciones.activaridBanco,this,true,"idBanco","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.bancoConstantesFunciones.mostrarid_empresaBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.bancoConstantesFunciones.resaltarid_empresaBanco,this,this.bancoConstantesFunciones.activarid_empresaBanco));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.bancoConstantesFunciones.resaltarid_empresaBanco,this,this.bancoConstantesFunciones.activarid_empresaBanco,false,"id_empresaBanco","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.bancoConstantesFunciones.mostrarid_sucursalBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.bancoConstantesFunciones.resaltarid_sucursalBanco,this,this.bancoConstantesFunciones.activarid_sucursalBanco));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.bancoConstantesFunciones.resaltarid_sucursalBanco,this,this.bancoConstantesFunciones.activarid_sucursalBanco,false,"id_sucursalBanco","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_CODIGO));

		if(this.bancoConstantesFunciones.mostrarcodigoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bancoConstantesFunciones.resaltarcodigoBanco,this.bancoConstantesFunciones.activarcodigoBanco,this,true,"codigoBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bancoConstantesFunciones.resaltarcodigoBanco,this.bancoConstantesFunciones.activarcodigoBanco,this,true,"codigoBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_CODIGOINSTITUCION));

		if(this.bancoConstantesFunciones.mostrarcodigo_institucionBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoConstantesFunciones.LABEL_CODIGOINSTITUCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bancoConstantesFunciones.resaltarcodigo_institucionBanco,this.bancoConstantesFunciones.activarcodigo_institucionBanco,this,true,"codigo_institucionBanco","BASICO-CON_EVENT_CHANGE"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bancoConstantesFunciones.resaltarcodigo_institucionBanco,this.bancoConstantesFunciones.activarcodigo_institucionBanco,this,true,"codigo_institucionBanco","BASICO-CON_EVENT_CHANGE",true));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_NOMBRE));

		if(this.bancoConstantesFunciones.mostrarnombreBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bancoConstantesFunciones.resaltarnombreBanco,this.bancoConstantesFunciones.activarnombreBanco,this,true,"nombreBanco","BASICO-CON_EVENT_CHANGE"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bancoConstantesFunciones.resaltarnombreBanco,this.bancoConstantesFunciones.activarnombreBanco,this,true,"nombreBanco","BASICO-CON_EVENT_CHANGE",true));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_IDTIPOBANCO));

		if(this.bancoConstantesFunciones.mostrarid_tipo_bancoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoConstantesFunciones.LABEL_IDTIPOBANCO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoBancoTableCell(this.tipobancosForeignKey,this.bancoConstantesFunciones.resaltarid_tipo_bancoBanco,this,this.bancoConstantesFunciones.activarid_tipo_bancoBanco));
			tableColumn.setCellEditor(new TipoBancoTableCell(this.tipobancosForeignKey,this.bancoConstantesFunciones.resaltarid_tipo_bancoBanco,this,this.bancoConstantesFunciones.activarid_tipo_bancoBanco,true,"id_tipo_bancoBanco","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL));

		if(this.bancoConstantesFunciones.mostrardias_efectivo_localBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bancoConstantesFunciones.resaltardias_efectivo_localBanco,this.bancoConstantesFunciones.activardias_efectivo_localBanco,this,true,"dias_efectivo_localBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bancoConstantesFunciones.resaltardias_efectivo_localBanco,this.bancoConstantesFunciones.activardias_efectivo_localBanco,this,true,"dias_efectivo_localBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO));

		if(this.bancoConstantesFunciones.mostrardias_efectivo_extranjeroBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bancoConstantesFunciones.resaltardias_efectivo_extranjeroBanco,this.bancoConstantesFunciones.activardias_efectivo_extranjeroBanco,this,true,"dias_efectivo_extranjeroBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bancoConstantesFunciones.resaltardias_efectivo_extranjeroBanco,this.bancoConstantesFunciones.activardias_efectivo_extranjeroBanco,this,true,"dias_efectivo_extranjeroBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO));

		if(this.bancoConstantesFunciones.mostrarid_cuenta_contable_debitoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontabledebitosForeignKey,this.bancoConstantesFunciones.resaltarid_cuenta_contable_debitoBanco,this,this.bancoConstantesFunciones.activarid_cuenta_contable_debitoBanco));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontabledebitosForeignKey,this.bancoConstantesFunciones.resaltarid_cuenta_contable_debitoBanco,this,this.bancoConstantesFunciones.activarid_cuenta_contable_debitoBanco,true,"id_cuenta_contable_debitoBanco","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));

		if(this.bancoConstantesFunciones.mostrarid_cuenta_contable_creditoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.bancoConstantesFunciones.resaltarid_cuenta_contable_creditoBanco,this,this.bancoConstantesFunciones.activarid_cuenta_contable_creditoBanco));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.bancoConstantesFunciones.resaltarid_cuenta_contable_creditoBanco,this,this.bancoConstantesFunciones.activarid_cuenta_contable_creditoBanco,true,"id_cuenta_contable_creditoBanco","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_DELIMITADOR));

		if(this.bancoConstantesFunciones.mostrardelimitadorBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoConstantesFunciones.LABEL_DELIMITADOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bancoConstantesFunciones.resaltardelimitadorBanco,this.bancoConstantesFunciones.activardelimitadorBanco,this,true,"delimitadorBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bancoConstantesFunciones.resaltardelimitadorBanco,this.bancoConstantesFunciones.activardelimitadorBanco,this,true,"delimitadorBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_IDFORMATO1));

		if(this.bancoConstantesFunciones.mostrarid_formato1Banco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoConstantesFunciones.LABEL_IDFORMATO1,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoTableCell(this.formato1sForeignKey,this.bancoConstantesFunciones.resaltarid_formato1Banco,this,this.bancoConstantesFunciones.activarid_formato1Banco));
			tableColumn.setCellEditor(new FormatoTableCell(this.formato1sForeignKey,this.bancoConstantesFunciones.resaltarid_formato1Banco,this,this.bancoConstantesFunciones.activarid_formato1Banco,true,"id_formato1Banco","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBanco,BancoConstantesFunciones.LABEL_IDFORMATO2));

		if(this.bancoConstantesFunciones.mostrarid_formato2Banco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoConstantesFunciones.LABEL_IDFORMATO2,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoTableCell(this.formato2sForeignKey,this.bancoConstantesFunciones.resaltarid_formato2Banco,this,this.bancoConstantesFunciones.activarid_formato2Banco));
			tableColumn.setCellEditor(new FormatoTableCell(this.formato2sForeignKey,this.bancoConstantesFunciones.resaltarid_formato2Banco,this,this.bancoConstantesFunciones.activarid_formato2Banco,true,"id_formato2Banco","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.bancoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosAutoriPago && this.bancoConstantesFunciones.mostrarAutoriPagoBanco && !BancoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Autori Pagos");
				tableColumn.setHeaderValue("Autori Pagos");
				tableColumn.setCellRenderer(new AutoriPagoTableCell(bancoConstantesFunciones.resaltarAutoriPagoBanco,this,this.bancoConstantesFunciones.activarAutoriPagoBanco));
				tableColumn.setCellEditor(new AutoriPagoTableCell(bancoConstantesFunciones.resaltarAutoriPagoBanco,this,this.bancoConstantesFunciones.activarAutoriPagoBanco));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosBanco.addColumn(tableColumn);
			}

			if(this.isTienePermisosTarjetaCredito && this.bancoConstantesFunciones.mostrarTarjetaCreditoBanco && !BancoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Tarjeta Creditos");
				tableColumn.setHeaderValue("Tarjeta Creditos");
				tableColumn.setCellRenderer(new TarjetaCreditoTableCell(bancoConstantesFunciones.resaltarTarjetaCreditoBanco,this,this.bancoConstantesFunciones.activarTarjetaCreditoBanco));
				tableColumn.setCellEditor(new TarjetaCreditoTableCell(bancoConstantesFunciones.resaltarTarjetaCreditoBanco,this,this.bancoConstantesFunciones.activarTarjetaCreditoBanco));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosBanco.addColumn(tableColumn);
			}

			if(this.isTienePermisosCuentaBancoPunVen && this.bancoConstantesFunciones.mostrarCuentaBancoPunVenBanco && !BancoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cuenta Bancoes");
				tableColumn.setHeaderValue("Cuenta Bancoes");
				tableColumn.setCellRenderer(new CuentaBancoPunVenTableCell(bancoConstantesFunciones.resaltarCuentaBancoPunVenBanco,this,this.bancoConstantesFunciones.activarCuentaBancoPunVenBanco));
				tableColumn.setCellEditor(new CuentaBancoPunVenTableCell(bancoConstantesFunciones.resaltarCuentaBancoPunVenBanco,this,this.bancoConstantesFunciones.activarCuentaBancoPunVenBanco));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosBanco.addColumn(tableColumn);
			}

			if(this.isTienePermisosPoliticasCliente && this.bancoConstantesFunciones.mostrarPoliticasClienteBanco && !BancoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Politicas Clientes");
				tableColumn.setHeaderValue("Politicas Clientes");
				tableColumn.setCellRenderer(new PoliticasClienteTableCell(bancoConstantesFunciones.resaltarPoliticasClienteBanco,this,this.bancoConstantesFunciones.activarPoliticasClienteBanco));
				tableColumn.setCellEditor(new PoliticasClienteTableCell(bancoConstantesFunciones.resaltarPoliticasClienteBanco,this,this.bancoConstantesFunciones.activarPoliticasClienteBanco));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosBanco.addColumn(tableColumn);
			}

			if(this.isTienePermisosFormaPagoPuntoVenta && this.bancoConstantesFunciones.mostrarFormaPagoPuntoVentaBanco && !BancoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Forma Pagoes");
				tableColumn.setHeaderValue("Forma Pagoes");
				tableColumn.setCellRenderer(new FormaPagoPuntoVentaTableCell(bancoConstantesFunciones.resaltarFormaPagoPuntoVentaBanco,this,this.bancoConstantesFunciones.activarFormaPagoPuntoVentaBanco));
				tableColumn.setCellEditor(new FormaPagoPuntoVentaTableCell(bancoConstantesFunciones.resaltarFormaPagoPuntoVentaBanco,this,this.bancoConstantesFunciones.activarFormaPagoPuntoVentaBanco));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosBanco.addColumn(tableColumn);
			}

			if(this.isTienePermisosCuentaBanco && this.bancoConstantesFunciones.mostrarCuentaBancoBanco && !BancoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cuenta Bancos");
				tableColumn.setHeaderValue("Cuenta Bancos");
				tableColumn.setCellRenderer(new CuentaBancoTableCell(bancoConstantesFunciones.resaltarCuentaBancoBanco,this,this.bancoConstantesFunciones.activarCuentaBancoBanco));
				tableColumn.setCellEditor(new CuentaBancoTableCell(bancoConstantesFunciones.resaltarCuentaBancoBanco,this,this.bancoConstantesFunciones.activarCuentaBancoBanco));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosBanco.addColumn(tableColumn);
			}

			if(this.isTienePermisosTipoCuentaBancoGeneral && this.bancoConstantesFunciones.mostrarTipoCuentaBancoGeneralBanco && !BancoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Tipo Cuenta Banco Generales");
				tableColumn.setHeaderValue("Tipo Cuenta Banco Generales");
				tableColumn.setCellRenderer(new TipoCuentaBancoGeneralTableCell(bancoConstantesFunciones.resaltarTipoCuentaBancoGeneralBanco,this,this.bancoConstantesFunciones.activarTipoCuentaBancoGeneralBanco));
				tableColumn.setCellEditor(new TipoCuentaBancoGeneralTableCell(bancoConstantesFunciones.resaltarTipoCuentaBancoGeneralBanco,this,this.bancoConstantesFunciones.activarTipoCuentaBancoGeneralBanco));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosBanco.addColumn(tableColumn);
			}
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.bancoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.bancoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBanco.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.bancoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.bancoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBanco.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarBanco && this.isPermisoGuardarCambiosBanco) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.bancoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.bancoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosBanco.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.bancoSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosBanco.addColumn(tableColumn);
				}
			}
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosBanco.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBanco && this.isPermisoGuardarCambiosBanco) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.bancoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBanco && this.isPermisoGuardarCambiosBanco) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosBanco.moveColumn(this.jTableDatosBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosBanco.moveColumn(this.jTableDatosBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.bancoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosBanco.moveColumn(this.jTableDatosBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosBanco.moveColumn(this.jTableDatosBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosBanco.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosBanco.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosBanco,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!BancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosBanco.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosBanco.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!BancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!BancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosBanco.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosBanco.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosBanco.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=bancoLogic.getBancos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=bancos.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosBanco();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoBanco=false;
					
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
			
				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormBanco==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBanco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBanco.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.banco.getsType().equals("DUPLICADO")
				   || this.banco.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoBanco=true;
				
				} else {
					this.isEsNuevoBanco=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
					if(this.banco.getId()>=0 && !this.banco.getIsNew()) {						
						this.isEsNuevoBanco=false;
						
					} else {
						this.isEsNuevoBanco=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoBanco(esRelaciones);						
				
				this.seleccionarBanco(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.banco.getId()<0) {
					this.isEsNuevoBanco=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarBanco(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarBanco(evt,rowIndex);
				}	
				
				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Banco: " + this.dDif); 
					}
				}								
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarBanco(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.banco)) {
					if(this.banco.getId()>0) {
						this.banco.setIsDeleted(true);
						
						this.bancosEliminados.add(this.banco);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.bancoLogic.getBancos().remove(this.banco);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.bancos.remove(this.banco);				
					}
					
					
					((BancoModel) this.jTableDatosBanco.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaBanco(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarBanco(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoBanco) {
			
			if(this.jInternalFrameDetalleFormBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBanco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBanco.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(BancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioBanco(this.banco);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.bancoConstantesFunciones.cargarid_empresaBanco || this.bancoConstantesFunciones.event_dependid_empresaBanco) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.banco.getid_empresa());
									//this.inicializarActualizarBindingBanco(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(banco.getEmpresa()!=null) {
							this.empresasForeignKey.add(banco.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.banco.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.bancoConstantesFunciones.cargarid_sucursalBanco || this.bancoConstantesFunciones.event_dependid_sucursalBanco) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.banco.getid_sucursal());
									//this.inicializarActualizarBindingBanco(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(banco.getSucursal()!=null) {
							this.sucursalsForeignKey.add(banco.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.banco.getid_sucursal(),false,"Formulario");

					//TipoBanco
					if(!this.bancoConstantesFunciones.cargarid_tipo_bancoBanco || this.bancoConstantesFunciones.event_dependid_tipo_bancoBanco) {
						//this.cargarCombosTipoBancosForeignKeyLista(" where id="+this.banco.getid_tipo_banco());
									//this.inicializarActualizarBindingBanco(false,false);
						this.tipobancosForeignKey=new ArrayList<TipoBanco>();

						if(banco.getTipoBanco()!=null) {
							this.tipobancosForeignKey.add(banco.getTipoBanco());
						}

						this.addItemDefectoCombosForeignKeyTipoBanco();
						this.cargarCombosFrameTipoBancosForeignKey("Todos");
					}
					this.setActualTipoBancoForeignKey(this.banco.getid_tipo_banco(),false,"Formulario");

					//CuentaContableDebito
					if(!this.bancoConstantesFunciones.cargarid_cuenta_contable_debitoBanco || this.bancoConstantesFunciones.event_dependid_cuenta_contable_debitoBanco) {
						//this.cargarCombosCuentaContableDebitosForeignKeyLista(" where id="+this.banco.getid_cuenta_contable_debito());
									//this.inicializarActualizarBindingBanco(false,false);
						this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>();

						if(banco.getCuentaContableDebito()!=null) {
							this.cuentacontabledebitosForeignKey.add(banco.getCuentaContableDebito());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableDebito();
						this.cargarCombosFrameCuentaContableDebitosForeignKey("Todos");
					}
					this.setActualCuentaContableDebitoForeignKey(this.banco.getid_cuenta_contable_debito(),false,"Formulario");

					//CuentaContableCredito
					if(!this.bancoConstantesFunciones.cargarid_cuenta_contable_creditoBanco || this.bancoConstantesFunciones.event_dependid_cuenta_contable_creditoBanco) {
						//this.cargarCombosCuentaContableCreditosForeignKeyLista(" where id="+this.banco.getid_cuenta_contable_credito());
									//this.inicializarActualizarBindingBanco(false,false);
						this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();

						if(banco.getCuentaContableCredito()!=null) {
							this.cuentacontablecreditosForeignKey.add(banco.getCuentaContableCredito());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableCredito();
						this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
					}
					this.setActualCuentaContableCreditoForeignKey(this.banco.getid_cuenta_contable_credito(),false,"Formulario");

					//Formato1
					if(!this.bancoConstantesFunciones.cargarid_formato1Banco || this.bancoConstantesFunciones.event_dependid_formato1Banco) {
						//this.cargarCombosFormato1sForeignKeyLista(" where id="+this.banco.getid_formato1());
									//this.inicializarActualizarBindingBanco(false,false);
						this.formato1sForeignKey=new ArrayList<Formato>();

						if(banco.getFormato1()!=null) {
							this.formato1sForeignKey.add(banco.getFormato1());
						}

						this.addItemDefectoCombosForeignKeyFormato1();
						this.cargarCombosFrameFormato1sForeignKey("Todos");
					}
					this.setActualFormato1ForeignKey(this.banco.getid_formato1(),false,"Formulario");

					//Formato2
					if(!this.bancoConstantesFunciones.cargarid_formato2Banco || this.bancoConstantesFunciones.event_dependid_formato2Banco) {
						//this.cargarCombosFormato2sForeignKeyLista(" where id="+this.banco.getid_formato2());
									//this.inicializarActualizarBindingBanco(false,false);
						this.formato2sForeignKey=new ArrayList<Formato>();

						if(banco.getFormato2()!=null) {
							this.formato2sForeignKey.add(banco.getFormato2());
						}

						this.addItemDefectoCombosForeignKeyFormato2();
						this.cargarCombosFrameFormato2sForeignKey("Todos");
					}
					this.setActualFormato2ForeignKey(this.banco.getid_formato2(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesBanco("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesBanco(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBanco() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoBanco(Banco banco) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoBanco(banco,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoBanco(Banco banco,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioBanco(banco);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyBanco(banco,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyBanco(banco);
	}
	
	public void setVariablesObjetoActualToFormularioBanco(Banco banco) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormBanco.jLabelidBanco.setText(banco.getId().toString());
			this.jInternalFrameDetalleFormBanco.jTextAreacodigoBanco.setText(banco.getcodigo());
			this.jInternalFrameDetalleFormBanco.jTextFieldcodigo_institucionBanco.setText(banco.getcodigo_institucion());
			this.jInternalFrameDetalleFormBanco.jTextAreanombreBanco.setText(banco.getnombre());
			this.jInternalFrameDetalleFormBanco.jTextFielddias_efectivo_localBanco.setText(banco.getdias_efectivo_local().toString());
			this.jInternalFrameDetalleFormBanco.jTextFielddias_efectivo_extranjeroBanco.setText(banco.getdias_efectivo_extranjero().toString());
			this.jInternalFrameDetalleFormBanco.jTextFielddelimitadorBanco.setText(banco.getdelimitador());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Banco bancoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,bancoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Banco bancoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				bancoLocal=this.banco;
			} else {
				bancoLocal=this.bancoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(bancoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoBanco(bancoLocal,true);
					
					if(bancoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(bancoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.bancoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(bancoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoBanco(Banco banco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBanco(banco,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysBanco(banco);
	}
	
	public void setVariablesFormularioToObjetoActualBanco(Banco banco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBanco(banco,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualBanco(Banco banco,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormBanco.jLabelidBanco.getText()==null || this.jInternalFrameDetalleFormBanco.jLabelidBanco.getText()=="" || this.jInternalFrameDetalleFormBanco.jLabelidBanco.getText()=="Id") {
				this.jInternalFrameDetalleFormBanco.jLabelidBanco.setText("0");
			}

			if(conColumnasBase) {banco.setId(Long.parseLong(this.jInternalFrameDetalleFormBanco.jLabelidBanco.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BancoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabelIdBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			banco.setcodigo(this.jInternalFrameDetalleFormBanco.jTextAreacodigoBanco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BancoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabelcodigoBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			banco.setcodigo_institucion(this.jInternalFrameDetalleFormBanco.jTextFieldcodigo_institucionBanco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BancoConstantesFunciones.LABEL_CODIGOINSTITUCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabelcodigo_institucionBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			banco.setnombre(this.jInternalFrameDetalleFormBanco.jTextAreanombreBanco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BancoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabelnombreBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			banco.setdias_efectivo_local(Integer.parseInt(this.jInternalFrameDetalleFormBanco.jTextFielddias_efectivo_localBanco.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabeldias_efectivo_localBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			banco.setdias_efectivo_extranjero(Integer.parseInt(this.jInternalFrameDetalleFormBanco.jTextFielddias_efectivo_extranjeroBanco.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabeldias_efectivo_extranjeroBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			banco.setdelimitador(this.jInternalFrameDetalleFormBanco.jTextFielddelimitadorBanco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BancoConstantesFunciones.LABEL_DELIMITADOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBanco.jLabeldelimitadorBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBanco(Banco bancoBean,Banco banco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && bancoBean.getid_tipo_banco()!=null && !bancoBean.getid_tipo_banco().equals(-1L))) {banco.setid_tipo_banco(bancoBean.getid_tipo_banco());}
			if(conDefault || (!conDefault && bancoBean.getid_cuenta_contable_debito()!=null && !bancoBean.getid_cuenta_contable_debito().equals(null))) {banco.setid_cuenta_contable_debito(bancoBean.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && bancoBean.getid_cuenta_contable_credito()!=null && !bancoBean.getid_cuenta_contable_credito().equals(null))) {banco.setid_cuenta_contable_credito(bancoBean.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && bancoBean.getid_formato1()!=null && !bancoBean.getid_formato1().equals(null))) {banco.setid_formato1(bancoBean.getid_formato1());}
			if(conDefault || (!conDefault && bancoBean.getid_formato2()!=null && !bancoBean.getid_formato2().equals(null))) {banco.setid_formato2(bancoBean.getid_formato2());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosBanco(Banco bancoOrigen,Banco banco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && bancoOrigen.getId()!=null && !bancoOrigen.getId().equals(0L))) {banco.setId(bancoOrigen.getId());}}
			if(conDefault || (!conDefault && bancoOrigen.getcodigo()!=null && !bancoOrigen.getcodigo().equals(""))) {banco.setcodigo(bancoOrigen.getcodigo());}
			if(conDefault || (!conDefault && bancoOrigen.getcodigo_institucion()!=null && !bancoOrigen.getcodigo_institucion().equals(""))) {banco.setcodigo_institucion(bancoOrigen.getcodigo_institucion());}
			if(conDefault || (!conDefault && bancoOrigen.getnombre()!=null && !bancoOrigen.getnombre().equals(""))) {banco.setnombre(bancoOrigen.getnombre());}
			if(conDefault || (!conDefault && bancoOrigen.getid_tipo_banco()!=null && !bancoOrigen.getid_tipo_banco().equals(-1L))) {banco.setid_tipo_banco(bancoOrigen.getid_tipo_banco());}
			if(conDefault || (!conDefault && bancoOrigen.getdias_efectivo_local()!=null && !bancoOrigen.getdias_efectivo_local().equals(0))) {banco.setdias_efectivo_local(bancoOrigen.getdias_efectivo_local());}
			if(conDefault || (!conDefault && bancoOrigen.getdias_efectivo_extranjero()!=null && !bancoOrigen.getdias_efectivo_extranjero().equals(0))) {banco.setdias_efectivo_extranjero(bancoOrigen.getdias_efectivo_extranjero());}
			if(conDefault || (!conDefault && bancoOrigen.getid_cuenta_contable_debito()!=null && !bancoOrigen.getid_cuenta_contable_debito().equals(null))) {banco.setid_cuenta_contable_debito(bancoOrigen.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && bancoOrigen.getid_cuenta_contable_credito()!=null && !bancoOrigen.getid_cuenta_contable_credito().equals(null))) {banco.setid_cuenta_contable_credito(bancoOrigen.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && bancoOrigen.getdelimitador()!=null && !bancoOrigen.getdelimitador().equals(""))) {banco.setdelimitador(bancoOrigen.getdelimitador());}
			if(conDefault || (!conDefault && bancoOrigen.getid_formato1()!=null && !bancoOrigen.getid_formato1().equals(null))) {banco.setid_formato1(bancoOrigen.getid_formato1());}
			if(conDefault || (!conDefault && bancoOrigen.getid_formato2()!=null && !bancoOrigen.getid_formato2().equals(null))) {banco.setid_formato2(bancoOrigen.getid_formato2());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBanco(Banco banco) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBanco.jLabelidBanco.setText(banco.getId().toString());
			this.jInternalFrameDetalleFormBanco.jTextAreacodigoBanco.setText(banco.getcodigo());
			this.jInternalFrameDetalleFormBanco.jTextFieldcodigo_institucionBanco.setText(banco.getcodigo_institucion());
			this.jInternalFrameDetalleFormBanco.jTextAreanombreBanco.setText(banco.getnombre());
			this.jInternalFrameDetalleFormBanco.jTextFielddias_efectivo_localBanco.setText(banco.getdias_efectivo_local().toString());
			this.jInternalFrameDetalleFormBanco.jTextFielddias_efectivo_extranjeroBanco.setText(banco.getdias_efectivo_extranjero().toString());
			this.jInternalFrameDetalleFormBanco.jTextFielddelimitadorBanco.setText(banco.getdelimitador());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBanco(BancoBean bancoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBanco.jLabelidBanco.setText(bancoBean.getId().toString());
			this.jInternalFrameDetalleFormBanco.jTextAreacodigoBanco.setText(bancoBean.getcodigo());
			this.jInternalFrameDetalleFormBanco.jTextFieldcodigo_institucionBanco.setText(bancoBean.getcodigo_institucion());
			this.jInternalFrameDetalleFormBanco.jTextAreanombreBanco.setText(bancoBean.getnombre());
			this.jInternalFrameDetalleFormBanco.jTextFielddias_efectivo_localBanco.setText(bancoBean.getdias_efectivo_local().toString());
			this.jInternalFrameDetalleFormBanco.jTextFielddias_efectivo_extranjeroBanco.setText(bancoBean.getdias_efectivo_extranjero().toString());
			this.jInternalFrameDetalleFormBanco.jTextFielddelimitadorBanco.setText(bancoBean.getdelimitador());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanBanco(BancoParameterReturnGeneral bancoReturnGeneral,BancoBean bancoBean,Boolean conDefault) throws Exception { 
		try {
			Banco bancoLocal=new Banco();
			
			bancoLocal=bancoReturnGeneral.getBanco();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && bancoLocal.getId()!=null && !bancoLocal.getId().equals(0L))) {bancoBean.setId(bancoLocal.getId());}}
			if(conDefault || (!conDefault && bancoLocal.getcodigo()!=null && !bancoLocal.getcodigo().equals(""))) {bancoBean.setcodigo(bancoLocal.getcodigo());}
			if(conDefault || (!conDefault && bancoLocal.getcodigo_institucion()!=null && !bancoLocal.getcodigo_institucion().equals(""))) {bancoBean.setcodigo_institucion(bancoLocal.getcodigo_institucion());}
			if(conDefault || (!conDefault && bancoLocal.getnombre()!=null && !bancoLocal.getnombre().equals(""))) {bancoBean.setnombre(bancoLocal.getnombre());}
			if(conDefault || (!conDefault && bancoLocal.getid_tipo_banco()!=null && !bancoLocal.getid_tipo_banco().equals(-1L))) {bancoBean.setid_tipo_banco(bancoLocal.getid_tipo_banco());}
			if(conDefault || (!conDefault && bancoLocal.getdias_efectivo_local()!=null && !bancoLocal.getdias_efectivo_local().equals(0))) {bancoBean.setdias_efectivo_local(bancoLocal.getdias_efectivo_local());}
			if(conDefault || (!conDefault && bancoLocal.getdias_efectivo_extranjero()!=null && !bancoLocal.getdias_efectivo_extranjero().equals(0))) {bancoBean.setdias_efectivo_extranjero(bancoLocal.getdias_efectivo_extranjero());}
			if(conDefault || (!conDefault && bancoLocal.getid_cuenta_contable_debito()!=null && !bancoLocal.getid_cuenta_contable_debito().equals(null))) {bancoBean.setid_cuenta_contable_debito(bancoLocal.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && bancoLocal.getid_cuenta_contable_credito()!=null && !bancoLocal.getid_cuenta_contable_credito().equals(null))) {bancoBean.setid_cuenta_contable_credito(bancoLocal.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && bancoLocal.getdelimitador()!=null && !bancoLocal.getdelimitador().equals(""))) {bancoBean.setdelimitador(bancoLocal.getdelimitador());}
			if(conDefault || (!conDefault && bancoLocal.getid_formato1()!=null && !bancoLocal.getid_formato1().equals(null))) {bancoBean.setid_formato1(bancoLocal.getid_formato1());}
			if(conDefault || (!conDefault && bancoLocal.getid_formato2()!=null && !bancoLocal.getid_formato2().equals(null))) {bancoBean.setid_formato2(bancoLocal.getid_formato2());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxBancoGenerico(Long idBancoSeleccionado,JComboBox jComboBoxBanco,List<Banco> bancosLocal)throws Exception {
		try {
			Banco  bancoTemp=null;

			for(Banco bancoAux:bancosLocal) {
				if(bancoAux.getId()!=null && bancoAux.getId().equals(idBancoSeleccionado)) {
					bancoTemp=bancoAux;
					break;
				}
			}

			jComboBoxBanco.setSelectedItem(bancoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxBancoGenerico(JComboBox jComboBoxBanco,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBanco.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxBanco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBanco.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxBanco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		if(sTipo.equals("CuentaBancoPunVen")) {
			jButtonCuentaBancoPunVenActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("PoliticasCliente")) {
			jButtonPoliticasClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("FormaPagoPuntoVenta")) {
			jButtonFormaPagoPuntoVentaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("TarjetaCredito")) {
			jButtonTarjetaCreditoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("AutoriPago")) {
			jButtonAutoriPagoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("TipoCuentaBancoGeneral")) {
			jButtonTipoCuentaBancoGeneralActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("CuentaBanco")) {
			jButtonCuentaBancoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			banco=(Banco) bancoLogic.getBancos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			banco =(Banco) bancos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!banco.getIsNew() && !banco.getIsChanged() && !banco.getIsDeleted()) {
				sDescripcion=banco.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=banco.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!banco.getIsNew() && !banco.getIsChanged() && !banco.getIsDeleted()) {
				sDescripcion=banco.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=banco.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("TipoBanco")) {
			//sDescripcion=this.getActualTipoBancoForeignKeyDescripcion((Long)value);
			if(!banco.getIsNew() && !banco.getIsChanged() && !banco.getIsDeleted()) {
				sDescripcion=banco.gettipobanco_descripcion();
			} else {
				//sDescripcion=this.getActualTipoBancoForeignKeyDescripcion((Long)value);
				sDescripcion=banco.gettipobanco_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableDebito")) {
			//sDescripcion=this.getActualCuentaContableDebitoForeignKeyDescripcion((Long)value);
			if(!banco.getIsNew() && !banco.getIsChanged() && !banco.getIsDeleted()) {
				sDescripcion=banco.getcuentacontabledebito_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableDebitoForeignKeyDescripcion((Long)value);
				sDescripcion=banco.getcuentacontabledebito_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableCredito")) {
			//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
			if(!banco.getIsNew() && !banco.getIsChanged() && !banco.getIsDeleted()) {
				sDescripcion=banco.getcuentacontablecredito_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
				sDescripcion=banco.getcuentacontablecredito_descripcion();
			}
		}

		if(sTipo.equals("Formato1")) {
			//sDescripcion=this.getActualFormato1ForeignKeyDescripcion((Long)value);
			if(!banco.getIsNew() && !banco.getIsChanged() && !banco.getIsDeleted()) {
				sDescripcion=banco.getformato1_descripcion();
			} else {
				//sDescripcion=this.getActualFormato1ForeignKeyDescripcion((Long)value);
				sDescripcion=banco.getformato1_descripcion();
			}
		}

		if(sTipo.equals("Formato2")) {
			//sDescripcion=this.getActualFormato2ForeignKeyDescripcion((Long)value);
			if(!banco.getIsNew() && !banco.getIsChanged() && !banco.getIsDeleted()) {
				sDescripcion=banco.getformato2_descripcion();
			} else {
				//sDescripcion=this.getActualFormato2ForeignKeyDescripcion((Long)value);
				sDescripcion=banco.getformato2_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Banco bancoRow=new Banco();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bancoRow=(Banco) bancoLogic.getBancos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			bancoRow=(Banco) bancos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCuentaBancoPunVenActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Banco banco) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormBanco==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco = (Banco)this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.banco = (Banco)this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(banco!=null) {
						this.banco = banco;
					} else {
						this.banco = new Banco();
					}
				}

				if(this.isTienePermisosCuentaBancoPunVen && this.permiteMantenimiento(this.banco)) {
					CuentaBancoPunVenBeanSwingJInternalFrame cuentabancopunvenBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFramePopup=new CuentaBancoPunVenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cuentabancopunvenBeanSwingJInternalFrame=this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFramePopup;
					} else {
						cuentabancopunvenBeanSwingJInternalFrame=this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame;
					}

					List<Banco> bancos=new ArrayList<Banco>();
					bancos.add(this.banco);
					if(!esRelacionado) {
						//cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenSessionBean.setConGuardarRelaciones(false);
						//cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cuentabancopunvenBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormBanco.cargarCuentaBancoPunVenBeanSwingJInternalFrame(bancos,this.banco,cuentabancopunvenBeanSwingJInternalFrame,/*conInicializar,*/cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenSessionBean.getConGuardarRelaciones(),cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenSessionBean.getEsGuardarRelacionado());
					cuentabancopunvenBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cuentabancopunvenBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaBancoPunVen("no_relacionado");

						cuentabancopunvenBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CuentaBancoPunVenConstantesFunciones.ITAMANIOFILATABLA + (CuentaBancoPunVenConstantesFunciones.ITAMANIOFILATABLA/2));

						cuentabancopunvenBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderBanco=(TitledBorder)this.jScrollPanelDatosBanco.getBorder();
						TitledBorder titledBorderCuentaBancoPunVen=(TitledBorder)cuentabancopunvenBeanSwingJInternalFrame.jScrollPanelDatosCuentaBancoPunVen.getBorder();

						titledBorderCuentaBancoPunVen.setTitle(titledBorderBanco.getTitle() + " -> Cuenta Banco");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentabancopunvenBeanSwingJInternalFrame);
						}

						cuentabancopunvenBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cuentabancopunvenBeanSwingJInternalFrame);

						cuentabancopunvenBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.bancoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cuenta Banco",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPoliticasClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Banco banco) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormBanco==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco = (Banco)this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.banco = (Banco)this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(banco!=null) {
						this.banco = banco;
					} else {
						this.banco = new Banco();
					}
				}

				if(this.isTienePermisosPoliticasCliente && this.permiteMantenimiento(this.banco)) {
					PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFramePopup=new PoliticasClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						politicasclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFramePopup;
					} else {
						politicasclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame;
					}

					List<Banco> bancos=new ArrayList<Banco>();
					bancos.add(this.banco);
					if(!esRelacionado) {
						//politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setConGuardarRelaciones(false);
						//politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					politicasclienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormBanco.cargarPoliticasClienteBeanSwingJInternalFrame(bancos,this.banco,politicasclienteBeanSwingJInternalFrame,/*conInicializar,*/politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.getConGuardarRelaciones(),politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.getEsGuardarRelacionado());
					politicasclienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						politicasclienteBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticasCliente("no_relacionado");

						politicasclienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PoliticasClienteConstantesFunciones.ITAMANIOFILATABLA + (PoliticasClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						politicasclienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderBanco=(TitledBorder)this.jScrollPanelDatosBanco.getBorder();
						TitledBorder titledBorderPoliticasCliente=(TitledBorder)politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.getBorder();

						titledBorderPoliticasCliente.setTitle(titledBorderBanco.getTitle() + " -> Politicas Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,politicasclienteBeanSwingJInternalFrame);
						}

						politicasclienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(politicasclienteBeanSwingJInternalFrame);

						politicasclienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.bancoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Politicas Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonFormaPagoPuntoVentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Banco banco) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormBanco==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco = (Banco)this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.banco = (Banco)this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(banco!=null) {
						this.banco = banco;
					} else {
						this.banco = new Banco();
					}
				}

				if(this.isTienePermisosFormaPagoPuntoVenta && this.permiteMantenimiento(this.banco)) {
					FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFramePopup=new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formapagopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFramePopup;
					} else {
						formapagopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame;
					}

					List<Banco> bancos=new ArrayList<Banco>();
					bancos.add(this.banco);
					if(!esRelacionado) {
						//formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setConGuardarRelaciones(false);
						//formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formapagopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormBanco.cargarFormaPagoPuntoVentaBeanSwingJInternalFrame(bancos,this.banco,formapagopuntoventaBeanSwingJInternalFrame,/*conInicializar,*/formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getConGuardarRelaciones(),formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
					formapagopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("no_relacionado");

						formapagopuntoventaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormaPagoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA + (FormaPagoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA/2));

						formapagopuntoventaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderBanco=(TitledBorder)this.jScrollPanelDatosBanco.getBorder();
						TitledBorder titledBorderFormaPagoPuntoVenta=(TitledBorder)formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.getBorder();

						titledBorderFormaPagoPuntoVenta.setTitle(titledBorderBanco.getTitle() + " -> Forma Pago");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formapagopuntoventaBeanSwingJInternalFrame);
						}

						formapagopuntoventaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formapagopuntoventaBeanSwingJInternalFrame);

						formapagopuntoventaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.bancoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Forma Pago",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonTarjetaCreditoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Banco banco) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormBanco==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco = (Banco)this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.banco = (Banco)this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(banco!=null) {
						this.banco = banco;
					} else {
						this.banco = new Banco();
					}
				}

				if(this.isTienePermisosTarjetaCredito && this.permiteMantenimiento(this.banco)) {
					TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFramePopup=new TarjetaCreditoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						tarjetacreditoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFramePopup;
					} else {
						tarjetacreditoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame;
					}

					List<Banco> bancos=new ArrayList<Banco>();
					bancos.add(this.banco);
					if(!esRelacionado) {
						//tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setConGuardarRelaciones(false);
						//tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					tarjetacreditoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormBanco.cargarTarjetaCreditoBeanSwingJInternalFrame(bancos,this.banco,tarjetacreditoBeanSwingJInternalFrame,/*conInicializar,*/tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.getConGuardarRelaciones(),tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.getEsGuardarRelacionado());
					tarjetacreditoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						tarjetacreditoBeanSwingJInternalFrame.actualizarEstadoPanelsTarjetaCredito("no_relacionado");

						tarjetacreditoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TarjetaCreditoConstantesFunciones.ITAMANIOFILATABLA + (TarjetaCreditoConstantesFunciones.ITAMANIOFILATABLA/2));

						tarjetacreditoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderBanco=(TitledBorder)this.jScrollPanelDatosBanco.getBorder();
						TitledBorder titledBorderTarjetaCredito=(TitledBorder)tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.getBorder();

						titledBorderTarjetaCredito.setTitle(titledBorderBanco.getTitle() + " -> Tarjeta Credito");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,tarjetacreditoBeanSwingJInternalFrame);
						}

						tarjetacreditoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(tarjetacreditoBeanSwingJInternalFrame);

						tarjetacreditoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.bancoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Tarjeta Credito",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonAutoriPagoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Banco banco) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormBanco==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco = (Banco)this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.banco = (Banco)this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(banco!=null) {
						this.banco = banco;
					} else {
						this.banco = new Banco();
					}
				}

				if(this.isTienePermisosAutoriPago && this.permiteMantenimiento(this.banco)) {
					AutoriPagoBeanSwingJInternalFrame autoripagoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFramePopup=new AutoriPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						autoripagoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFramePopup;
					} else {
						autoripagoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame;
					}

					List<Banco> bancos=new ArrayList<Banco>();
					bancos.add(this.banco);
					if(!esRelacionado) {
						//autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.setConGuardarRelaciones(false);
						//autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					autoripagoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormBanco.cargarAutoriPagoBeanSwingJInternalFrame(bancos,this.banco,autoripagoBeanSwingJInternalFrame,/*conInicializar,*/autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.getConGuardarRelaciones(),autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.getEsGuardarRelacionado());
					autoripagoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						autoripagoBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriPago("no_relacionado");

						autoripagoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(AutoriPagoConstantesFunciones.ITAMANIOFILATABLA + (AutoriPagoConstantesFunciones.ITAMANIOFILATABLA/2));

						autoripagoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderBanco=(TitledBorder)this.jScrollPanelDatosBanco.getBorder();
						TitledBorder titledBorderAutoriPago=(TitledBorder)autoripagoBeanSwingJInternalFrame.jScrollPanelDatosAutoriPago.getBorder();

						titledBorderAutoriPago.setTitle(titledBorderBanco.getTitle() + " -> Autori Pago");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,autoripagoBeanSwingJInternalFrame);
						}

						autoripagoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(autoripagoBeanSwingJInternalFrame);

						autoripagoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.bancoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Autori Pago",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonTipoCuentaBancoGeneralActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Banco banco) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormBanco==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco = (Banco)this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.banco = (Banco)this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(banco!=null) {
						this.banco = banco;
					} else {
						this.banco = new Banco();
					}
				}

				if(this.isTienePermisosTipoCuentaBancoGeneral && this.permiteMantenimiento(this.banco)) {
					TipoCuentaBancoGeneralBeanSwingJInternalFrame tipocuentabancogeneralBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFramePopup=new TipoCuentaBancoGeneralBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						tipocuentabancogeneralBeanSwingJInternalFrame=this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFramePopup;
					} else {
						tipocuentabancogeneralBeanSwingJInternalFrame=this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame;
					}

					List<Banco> bancos=new ArrayList<Banco>();
					bancos.add(this.banco);
					if(!esRelacionado) {
						//tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.setConGuardarRelaciones(false);
						//tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					tipocuentabancogeneralBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormBanco.cargarTipoCuentaBancoGeneralBeanSwingJInternalFrame(bancos,this.banco,tipocuentabancogeneralBeanSwingJInternalFrame,/*conInicializar,*/tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.getConGuardarRelaciones(),tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
					tipocuentabancogeneralBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						tipocuentabancogeneralBeanSwingJInternalFrame.actualizarEstadoPanelsTipoCuentaBancoGeneral("no_relacionado");

						tipocuentabancogeneralBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TipoCuentaBancoGeneralConstantesFunciones.ITAMANIOFILATABLA + (TipoCuentaBancoGeneralConstantesFunciones.ITAMANIOFILATABLA/2));

						tipocuentabancogeneralBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderBanco=(TitledBorder)this.jScrollPanelDatosBanco.getBorder();
						TitledBorder titledBorderTipoCuentaBancoGeneral=(TitledBorder)tipocuentabancogeneralBeanSwingJInternalFrame.jScrollPanelDatosTipoCuentaBancoGeneral.getBorder();

						titledBorderTipoCuentaBancoGeneral.setTitle(titledBorderBanco.getTitle() + " -> Tipo Cuenta Banco General");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,tipocuentabancogeneralBeanSwingJInternalFrame);
						}

						tipocuentabancogeneralBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(tipocuentabancogeneralBeanSwingJInternalFrame);

						tipocuentabancogeneralBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.bancoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Tipo Cuenta Banco General",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCuentaBancoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Banco banco) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormBanco==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco = (Banco)this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.banco = (Banco)this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(banco!=null) {
						this.banco = banco;
					} else {
						this.banco = new Banco();
					}
				}

				if(this.isTienePermisosCuentaBanco && this.permiteMantenimiento(this.banco)) {
					CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFramePopup=new CuentaBancoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cuentabancoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFramePopup;
					} else {
						cuentabancoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame;
					}

					List<Banco> bancos=new ArrayList<Banco>();
					bancos.add(this.banco);
					if(!esRelacionado) {
						//cuentabancoBeanSwingJInternalFrame.cuentabancoSessionBean.setConGuardarRelaciones(false);
						//cuentabancoBeanSwingJInternalFrame.cuentabancoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cuentabancoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormBanco.cargarCuentaBancoBeanSwingJInternalFrame(bancos,this.banco,cuentabancoBeanSwingJInternalFrame,/*conInicializar,*/cuentabancoBeanSwingJInternalFrame.cuentabancoSessionBean.getConGuardarRelaciones(),cuentabancoBeanSwingJInternalFrame.cuentabancoSessionBean.getEsGuardarRelacionado());
					cuentabancoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cuentabancoBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaBanco("no_relacionado");

						cuentabancoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CuentaBancoConstantesFunciones.ITAMANIOFILATABLA + (CuentaBancoConstantesFunciones.ITAMANIOFILATABLA/2));

						cuentabancoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderBanco=(TitledBorder)this.jScrollPanelDatosBanco.getBorder();
						TitledBorder titledBorderCuentaBanco=(TitledBorder)cuentabancoBeanSwingJInternalFrame.jScrollPanelDatosCuentaBanco.getBorder();

						titledBorderCuentaBanco.setTitle(titledBorderBanco.getTitle() + " -> Cuenta Banco");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentabancoBeanSwingJInternalFrame);
						}

						cuentabancoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cuentabancoBeanSwingJInternalFrame);

						cuentabancoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.bancoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cuenta Banco",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualBanco(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoBanco.setVisible((this.isVisibilidadCeldaNuevoBanco && this.isPermisoNuevoBanco));			
			this.jButtonDuplicarBanco.setVisible((this.isVisibilidadCeldaDuplicarBanco && this.isPermisoDuplicarBanco));			
			this.jButtonCopiarBanco.setVisible((this.isVisibilidadCeldaCopiarBanco && this.isPermisoCopiarBanco));
			this.jButtonVerFormBanco.setVisible((this.isVisibilidadCeldaVerFormBanco && this.isPermisoVerFormBanco));
			
			this.jButtonAbrirOrderByBanco.setVisible((this.isVisibilidadCeldaOrdenBanco && this.isPermisoOrdenBanco));			
			
			this.jButtonNuevoRelacionesBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesBanco && this.isPermisoNuevoBanco));			
			this.jButtonNuevoGuardarCambiosBanco.setVisible((this.isVisibilidadCeldaNuevoBanco && this.isPermisoNuevoBanco && this.isPermisoGuardarCambiosBanco));
			
			if(this.jInternalFrameDetalleFormBanco!=null) {
			this.jInternalFrameDetalleFormBanco.jButtonModificarBanco.setVisible((this.isVisibilidadCeldaModificarBanco && this.isPermisoActualizarBanco));	
			this.jInternalFrameDetalleFormBanco.jButtonActualizarBanco.setVisible((this.isVisibilidadCeldaActualizarBanco && this.isPermisoActualizarBanco));	
			this.jInternalFrameDetalleFormBanco.jButtonEliminarBanco.setVisible((this.isVisibilidadCeldaEliminarBanco && this.isPermisoEliminarBanco));
			this.jInternalFrameDetalleFormBanco.jButtonCancelarBanco.setVisible(this.isVisibilidadCeldaCancelarBanco);							
			this.jInternalFrameDetalleFormBanco.jButtonGuardarCambiosBanco.setVisible((this.isVisibilidadCeldaGuardarBanco && this.isPermisoGuardarCambiosBanco));			
			
			}
						
			this.jButtonGuardarCambiosTablaBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosBanco && this.isPermisoGuardarCambiosBanco));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarBanco.setVisible((this.isVisibilidadCeldaNuevoBanco && this.isPermisoNuevoBanco));						
			this.jButtonDuplicarToolBarBanco.setVisible((this.isVisibilidadCeldaDuplicarBanco && this.isPermisoDuplicarBanco));						
			this.jButtonCopiarToolBarBanco.setVisible((this.isVisibilidadCeldaCopiarBanco && this.isPermisoCopiarBanco));			
			this.jButtonVerFormToolBarBanco.setVisible((this.isVisibilidadCeldaVerFormBanco && this.isPermisoVerFormBanco));			
			this.jButtonAbrirOrderByToolBarBanco.setVisible((this.isVisibilidadCeldaOrdenBanco && this.isPermisoOrdenBanco));
			this.jButtonNuevoRelacionesToolBarBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesBanco && this.isPermisoNuevoBanco));			
			this.jButtonNuevoGuardarCambiosToolBarBanco.setVisible((this.isVisibilidadCeldaNuevoBanco && this.isPermisoNuevoBanco && this.isPermisoGuardarCambiosBanco));			
			
			if(this.jInternalFrameDetalleFormBanco!=null) {
			this.jInternalFrameDetalleFormBanco.jButtonModificarToolBarBanco.setVisible((this.isVisibilidadCeldaModificarBanco && this.isPermisoActualizarBanco));	
			this.jInternalFrameDetalleFormBanco.jButtonActualizarToolBarBanco.setVisible((this.isVisibilidadCeldaActualizarBanco  && this.isPermisoActualizarBanco));	
			this.jInternalFrameDetalleFormBanco.jButtonEliminarToolBarBanco.setVisible((this.isVisibilidadCeldaEliminarBanco && this.isPermisoEliminarBanco));
			this.jInternalFrameDetalleFormBanco.jButtonCancelarToolBarBanco.setVisible(this.isVisibilidadCeldaCancelarBanco);				
			this.jInternalFrameDetalleFormBanco.jButtonGuardarCambiosToolBarBanco.setVisible((this.isVisibilidadCeldaGuardarBanco && this.isPermisoGuardarCambiosBanco));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosBanco && this.isPermisoGuardarCambiosBanco));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoBanco.setVisible((this.isVisibilidadCeldaNuevoBanco && this.isPermisoNuevoBanco));			
			this.jMenuItemDuplicarBanco.setVisible((this.isVisibilidadCeldaDuplicarBanco && this.isPermisoDuplicarBanco));			
			this.jMenuItemCopiarBanco.setVisible((this.isVisibilidadCeldaCopiarBanco && this.isPermisoCopiarBanco));			
			this.jMenuItemVerFormBanco.setVisible((this.isVisibilidadCeldaVerFormBanco && this.isPermisoVerFormBanco));			
			this.jMenuItemAbrirOrderByBanco.setVisible((this.isVisibilidadCeldaOrdenBanco && this.isPermisoOrdenBanco));			
			//this.jMenuItemMostrarOcultarBanco.setVisible((this.isVisibilidadCeldaOrdenBanco && this.isPermisoOrdenBanco));
			this.jMenuItemDetalleAbrirOrderByBanco.setVisible((this.isVisibilidadCeldaOrdenBanco && this.isPermisoOrdenBanco));			
			//this.jMenuItemDetalleMostrarOcultarBanco.setVisible((this.isVisibilidadCeldaOrdenBanco && this.isPermisoOrdenBanco));			
			this.jMenuItemNuevoRelacionesBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesBanco && this.isPermisoNuevoBanco));			
			this.jMenuItemNuevoGuardarCambiosBanco.setVisible((this.isVisibilidadCeldaNuevoBanco && this.isPermisoNuevoBanco && this.isPermisoGuardarCambiosBanco));									
			
			if(this.jInternalFrameDetalleFormBanco!=null) {
			this.jInternalFrameDetalleFormBanco.jMenuItemModificarBanco.setVisible((this.isVisibilidadCeldaModificarBanco && this.isPermisoActualizarBanco));	
			this.jInternalFrameDetalleFormBanco.jMenuItemActualizarBanco.setVisible((this.isVisibilidadCeldaActualizarBanco && this.isPermisoActualizarBanco));	
			this.jInternalFrameDetalleFormBanco.jMenuItemEliminarBanco.setVisible((this.isVisibilidadCeldaEliminarBanco && this.isPermisoEliminarBanco));
			this.jInternalFrameDetalleFormBanco.jMenuItemCancelarBanco.setVisible(this.isVisibilidadCeldaCancelarBanco);				
			}
			
			this.jMenuItemGuardarCambiosBanco.setVisible((this.isVisibilidadCeldaGuardarBanco && this.isPermisoGuardarCambiosBanco));						
			this.jMenuItemGuardarCambiosTablaBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosBanco && this.isPermisoGuardarCambiosBanco));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoBanco=this.jButtonNuevoBanco.isVisible();
			this.isVisibilidadCeldaDuplicarBanco=this.jButtonDuplicarBanco.isVisible();
			this.isVisibilidadCeldaCopiarBanco=this.jButtonCopiarBanco.isVisible();
			this.isVisibilidadCeldaVerFormBanco=this.jButtonVerFormBanco.isVisible();
			
			this.isVisibilidadCeldaOrdenBanco=this.jButtonAbrirOrderByBanco.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesBanco=this.jButtonNuevoRelacionesBanco.isVisible();
			this.isVisibilidadCeldaModificarBanco=this.jButtonModificarBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormBanco!=null) {
			this.isVisibilidadCeldaActualizarBanco=this.jInternalFrameDetalleFormBanco.jButtonActualizarBanco.isVisible();
			this.isVisibilidadCeldaEliminarBanco=this.jInternalFrameDetalleFormBanco.jButtonEliminarBanco.isVisible();
			this.isVisibilidadCeldaCancelarBanco=this.jInternalFrameDetalleFormBanco.jButtonCancelarBanco.isVisible();
			this.isVisibilidadCeldaGuardarBanco=this.jInternalFrameDetalleFormBanco.jButtonGuardarCambiosBanco.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosBanco=this.jButtonGuardarCambiosTablaBanco.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoBanco=this.jButtonNuevoToolBarBanco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBanco=this.jButtonNuevoRelacionesToolBarBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormBanco!=null) {
			this.isVisibilidadCeldaModificarBanco=this.jInternalFrameDetalleFormBanco.jButtonModificarToolBarBanco.isVisible();
			this.isVisibilidadCeldaActualizarBanco=this.jInternalFrameDetalleFormBanco.jButtonActualizarToolBarBanco.isVisible();
			this.isVisibilidadCeldaEliminarBanco=this.jInternalFrameDetalleFormBanco.jButtonEliminarToolBarBanco.isVisible();
			this.isVisibilidadCeldaCancelarBanco=this.jInternalFrameDetalleFormBanco.jButtonCancelarToolBarBanco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBanco=this.jButtonGuardarCambiosToolBarBanco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBanco=this.jButtonGuardarCambiosTablaToolBarBanco.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoBanco=this.jMenuItemNuevoBanco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBanco=this.jMenuItemNuevoRelacionesBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormBanco!=null) {
			this.isVisibilidadCeldaModificarBanco=this.jInternalFrameDetalleFormBanco.jMenuItemModificarBanco.isVisible();
			this.isVisibilidadCeldaActualizarBanco=this.jInternalFrameDetalleFormBanco.jMenuItemActualizarBanco.isVisible();
			this.isVisibilidadCeldaEliminarBanco=this.jInternalFrameDetalleFormBanco.jMenuItemEliminarBanco.isVisible();
			this.isVisibilidadCeldaCancelarBanco=this.jInternalFrameDetalleFormBanco.jMenuItemCancelarBanco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBanco=this.jMenuItemGuardarCambiosBanco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBanco=this.jMenuItemGuardarCambiosTablaBanco.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesBanco(Boolean esInicializar) {
		if(BancoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.bancoSessionBean.getConGuardarRelaciones()) {
				//if(this.bancoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesBanco();
			}
			
			this.inicializarActualizarBindingBotonesManualBanco(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualBanco() {
		this.jButtonNuevoBanco.setVisible(this.isPermisoNuevoBanco);			
		this.jButtonDuplicarBanco.setVisible(this.isPermisoDuplicarBanco);			
		this.jButtonCopiarBanco.setVisible(this.isPermisoCopiarBanco);			
		this.jButtonVerFormBanco.setVisible(this.isPermisoVerFormBanco);			
		
		this.jButtonAbrirOrderByBanco.setVisible(this.isPermisoOrdenBanco);					
		
		this.jButtonNuevoRelacionesBanco.setVisible(this.isPermisoNuevoBanco);			
		
		if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBanco.jButtonModificarBanco.setVisible(this.isPermisoActualizarBanco);	
			this.jInternalFrameDetalleFormBanco.jButtonActualizarBanco.setVisible(this.isPermisoActualizarBanco);	
			this.jInternalFrameDetalleFormBanco.jButtonEliminarBanco.setVisible(this.isPermisoEliminarBanco);
			this.jInternalFrameDetalleFormBanco.jButtonCancelarBanco.setVisible(this.isVisibilidadCeldaCancelarBanco);						
			this.jInternalFrameDetalleFormBanco.jButtonGuardarCambiosBanco.setVisible(this.isPermisoGuardarCambiosBanco);							
		}
		
		this.jButtonGuardarCambiosTablaBanco.setVisible(this.isPermisoActualizarBanco);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleBanco() {
		this.jInternalFrameDetalleFormBanco.jButtonModificarBanco.setVisible(this.isPermisoActualizarBanco);	
		this.jInternalFrameDetalleFormBanco.jButtonActualizarBanco.setVisible(this.isPermisoActualizarBanco);	
		this.jInternalFrameDetalleFormBanco.jButtonEliminarBanco.setVisible(this.isPermisoEliminarBanco);
		this.jInternalFrameDetalleFormBanco.jButtonCancelarBanco.setVisible(this.isVisibilidadCeldaCancelarBanco);							
		this.jInternalFrameDetalleFormBanco.jButtonGuardarCambiosBanco.setVisible((this.isVisibilidadCeldaGuardarBanco && this.isPermisoGuardarCambiosBanco));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosBanco() {
		if(BancoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualBanco();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesBanco() {
	}
	
	public void jTableDatosBancoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarBanco(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.banco==null) {
						this.banco = new Banco();
					}

					this.setVariablesFormularioToObjetoActualBanco(this.banco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
				}

				if(this.banco.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.banco.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaBancoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebBanco(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBanco.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBanco.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.bancoLogic.getConnexion());

				if(this.banco.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.banco.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBanco=(TitledBorder)this.jScrollPanelDatosBanco.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderBanco.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.banco==null) {
						this.banco = new Banco();
					}

					this.setVariablesFormularioToObjetoActualBanco(this.banco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
				}

				if(this.banco.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.banco.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalBancoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebBanco(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBanco.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBanco.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.bancoLogic.getConnexion());

				if(this.banco.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.banco.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBanco=(TitledBorder)this.jScrollPanelDatosBanco.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderBanco.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.banco==null) {
						this.banco = new Banco();
					}

					this.setVariablesFormularioToObjetoActualBanco(this.banco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
				}

				if(this.banco.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.banco.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.banco==null) {
						this.banco = new Banco();
					}

					this.setVariablesFormularioToObjetoActualBanco(this.banco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
				}

				if(this.banco.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.banco.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_institucionBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.banco==null) {
						this.banco = new Banco();
					}

					this.setVariablesFormularioToObjetoActualBanco(this.banco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
				}

				if(this.banco.getcodigo_institucion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_institucion like '%"+this.banco.getcodigo_institucion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.banco==null) {
						this.banco = new Banco();
					}

					this.setVariablesFormularioToObjetoActualBanco(this.banco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
				}

				if(this.banco.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.banco.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_bancoBancoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipobanco=true;

			idTienePermisotipobanco=this.tienePermisosUsuarioEnPaginaWebBanco(TipoBancoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipobanco) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBanco.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBanco.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);

				this.tipobancoBeanSwingJInternalFrame=new TipoBancoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipobancoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipobancoBeanSwingJInternalFrame.getTipoBancoLogic().setConnexion(this.bancoLogic.getConnexion());

				if(this.banco.getid_tipo_banco()!=null) {
					this.tipobancoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipobancoBeanSwingJInternalFrame.setIdActual(this.banco.getid_tipo_banco());
					this.tipobancoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipobancoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipobancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoBanco();
				}

				JInternalFrameBase jinternalFrame =this.tipobancoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBanco=(TitledBorder)this.jScrollPanelDatosBanco.getBorder();
				TitledBorder titledBordertipobanco=(TitledBorder)this.tipobancoBeanSwingJInternalFrame.jScrollPanelDatosTipoBanco.getBorder();

				titledBordertipobanco.setTitle(titledBorderBanco.getTitle() + " -> Tipo Banco");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_bancoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.banco==null) {
						this.banco = new Banco();
					}

					this.setVariablesFormularioToObjetoActualBanco(this.banco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
				}

				if(this.banco.getid_tipo_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_banco = "+this.banco.getid_tipo_banco().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondias_efectivo_localBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.banco==null) {
						this.banco = new Banco();
					}

					this.setVariablesFormularioToObjetoActualBanco(this.banco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
				}

				if(this.banco.getdias_efectivo_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dias_efectivo_local = "+this.banco.getdias_efectivo_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondias_efectivo_extranjeroBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.banco==null) {
						this.banco = new Banco();
					}

					this.setVariablesFormularioToObjetoActualBanco(this.banco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
				}

				if(this.banco.getdias_efectivo_extranjero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dias_efectivo_extranjero = "+this.banco.getdias_efectivo_extranjero().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_debitoBancoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontabledebito=true;

			idTienePermisocuentacontabledebito=this.tienePermisosUsuarioEnPaginaWebBanco(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontabledebito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBanco.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBanco.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);

				this.cuentacontabledebitoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontabledebitoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontabledebitoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.bancoLogic.getConnexion());

				if(this.banco.getid_cuenta_contable_debito()!=null) {
					this.cuentacontabledebitoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontabledebitoBeanSwingJInternalFrame.setIdActual(this.banco.getid_cuenta_contable_debito());
					this.cuentacontabledebitoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontabledebitoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontabledebitoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontabledebitoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBanco=(TitledBorder)this.jScrollPanelDatosBanco.getBorder();
				TitledBorder titledBordercuentacontabledebito=(TitledBorder)this.cuentacontabledebitoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledebito.setTitle(titledBorderBanco.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_debitoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.banco==null) {
						this.banco = new Banco();
					}

					this.setVariablesFormularioToObjetoActualBanco(this.banco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
				}

				if(this.banco.getid_cuenta_contable_debito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_debito = "+this.banco.getid_cuenta_contable_debito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_creditoBancoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontablecredito=true;

			idTienePermisocuentacontablecredito=this.tienePermisosUsuarioEnPaginaWebBanco(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontablecredito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBanco.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBanco.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);

				this.cuentacontablecreditoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontablecreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontablecreditoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.bancoLogic.getConnexion());

				if(this.banco.getid_cuenta_contable_credito()!=null) {
					this.cuentacontablecreditoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontablecreditoBeanSwingJInternalFrame.setIdActual(this.banco.getid_cuenta_contable_credito());
					this.cuentacontablecreditoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontablecreditoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBanco=(TitledBorder)this.jScrollPanelDatosBanco.getBorder();
				TitledBorder titledBordercuentacontablecredito=(TitledBorder)this.cuentacontablecreditoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecredito.setTitle(titledBorderBanco.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_creditoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.banco==null) {
						this.banco = new Banco();
					}

					this.setVariablesFormularioToObjetoActualBanco(this.banco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
				}

				if(this.banco.getid_cuenta_contable_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_credito = "+this.banco.getid_cuenta_contable_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondelimitadorBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.banco==null) {
						this.banco = new Banco();
					}

					this.setVariablesFormularioToObjetoActualBanco(this.banco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
				}

				if(this.banco.getdelimitador()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where delimitador like '%"+this.banco.getdelimitador()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formato1BancoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformato1=true;

			idTienePermisoformato1=this.tienePermisosUsuarioEnPaginaWebBanco(FormatoConstantesFunciones.CLASSNAME);

			if(idTienePermisoformato1) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBanco.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBanco.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);

				this.formato1BeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formato1BeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formato1BeanSwingJInternalFrame.getFormatoLogic().setConnexion(this.bancoLogic.getConnexion());

				if(this.banco.getid_formato1()!=null) {
					this.formato1BeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formato1BeanSwingJInternalFrame.setIdActual(this.banco.getid_formato1());
					this.formato1BeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formato1BeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formato1BeanSwingJInternalFrame.inicializarActualizarBindingTablaFormato();
				}

				JInternalFrameBase jinternalFrame =this.formato1BeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBanco=(TitledBorder)this.jScrollPanelDatosBanco.getBorder();
				TitledBorder titledBorderformato1=(TitledBorder)this.formato1BeanSwingJInternalFrame.jScrollPanelDatosFormato.getBorder();

				titledBorderformato1.setTitle(titledBorderBanco.getTitle() + " -> Formato");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formato1BancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.banco==null) {
						this.banco = new Banco();
					}

					this.setVariablesFormularioToObjetoActualBanco(this.banco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
				}

				if(this.banco.getid_formato1()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato1 = "+this.banco.getid_formato1().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formato2BancoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformato2=true;

			idTienePermisoformato2=this.tienePermisosUsuarioEnPaginaWebBanco(FormatoConstantesFunciones.CLASSNAME);

			if(idTienePermisoformato2) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBanco.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBanco.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);

				this.formato2BeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formato2BeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formato2BeanSwingJInternalFrame.getFormatoLogic().setConnexion(this.bancoLogic.getConnexion());

				if(this.banco.getid_formato2()!=null) {
					this.formato2BeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formato2BeanSwingJInternalFrame.setIdActual(this.banco.getid_formato2());
					this.formato2BeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formato2BeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formato2BeanSwingJInternalFrame.inicializarActualizarBindingTablaFormato();
				}

				JInternalFrameBase jinternalFrame =this.formato2BeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBanco=(TitledBorder)this.jScrollPanelDatosBanco.getBorder();
				TitledBorder titledBorderformato2=(TitledBorder)this.formato2BeanSwingJInternalFrame.jScrollPanelDatosFormato.getBorder();

				titledBorderformato2.setTitle(titledBorderBanco.getTitle() + " -> Formato");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formato2BancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBanco(this.getbanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.banco==null) {
						this.banco = new Banco();
					}

					this.setVariablesFormularioToObjetoActualBanco(this.banco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);
				}

				if(this.banco.getid_formato2()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato2 = "+this.banco.getid_formato2().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoBancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBanco(false,false);

			this.getBancosBusquedaPorCodigo();

			this.inicializarActualizarBindingBanco(false);

			//if(BancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorCodigoInstitucionBancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBanco(false,false);

			this.getBancosBusquedaPorCodigoInstitucion();

			this.inicializarActualizarBindingBanco(false);

			//if(BancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreBancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBanco(false,false);

			this.getBancosBusquedaPorNombre();

			this.inicializarActualizarBindingBanco(false);

			//if(BancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableCreditoBancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBanco(false,false);

			this.getBancosFK_IdCuentaContableCredito();

			this.inicializarActualizarBindingBanco(false);

			//if(BancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableDebitoBancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBanco(false,false);

			this.getBancosFK_IdCuentaContableDebito();

			this.inicializarActualizarBindingBanco(false);

			//if(BancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaBancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBanco(false,false);

			this.getBancosFK_IdEmpresa();

			this.inicializarActualizarBindingBanco(false);

			//if(BancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormato1BancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBanco(false,false);

			this.getBancosFK_IdFormato1();

			this.inicializarActualizarBindingBanco(false);

			//if(BancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormato2BancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBanco(false,false);

			this.getBancosFK_IdFormato2();

			this.inicializarActualizarBindingBanco(false);

			//if(BancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalBancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBanco(false,false);

			this.getBancosFK_IdSucursal();

			this.inicializarActualizarBindingBanco(false);

			//if(BancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoBancoBancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBanco(false,false);

			this.getBancosFK_IdTipoBanco();

			this.inicializarActualizarBindingBanco(false);

			//if(BancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameBanco() {
		if(this.jInternalFrameDetalleFormBanco!=null) {
		

		if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormBanco!=null) {
			this.jInternalFrameDetalleFormBanco.setVisible(false);	    			
			this.jInternalFrameDetalleFormBanco.dispose();
			this.jInternalFrameDetalleFormBanco=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoBanco!=null) {
			this.jInternalFrameReporteDinamicoBanco.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoBanco.dispose();
			this.jInternalFrameReporteDinamicoBanco=null;
		}
		
		if(this.jInternalFrameImportacionBanco!=null) {
			this.jInternalFrameImportacionBanco.setVisible(false);	    			
			this.jInternalFrameImportacionBanco.dispose();
			this.jInternalFrameImportacionBanco=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessBanco();
			
			BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
			
			
			if(sTipo.equals("NuevoBanco")) {
				jButtonNuevoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarBanco")) {
				jButtonDuplicarBancoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarBanco")) {
				jButtonCopiarBancoActionPerformed(evt);
			} else if(sTipo.equals("VerFormBanco")) {
				jButtonVerFormBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarBanco")) {
				jButtonNuevoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarBanco")) {
				jButtonDuplicarBancoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoBanco")) {
				jButtonNuevoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarBanco")) {
				jButtonDuplicarBancoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesBanco")) {
				jButtonNuevoBancoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarBanco")) {
				jButtonNuevoBancoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesBanco")) {
				jButtonNuevoBancoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarBanco")) {
				jButtonModificarBancoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarBanco")) {
				jButtonModificarBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarBanco")) {
				jButtonModificarBancoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarBanco")) {
				jButtonActualizarBancoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarBanco")) {
				jButtonActualizarBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarBanco")) {
				jButtonActualizarBancoActionPerformed(evt);
			} else if(sTipo.equals("EliminarBanco")) {
				jButtonEliminarBancoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarBanco")) {
				jButtonEliminarBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarBanco")) {
				jButtonEliminarBancoActionPerformed(evt);
			} else if(sTipo.equals("CancelarBanco")) {
				jButtonCancelarBancoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarBanco")) {
				jButtonCancelarBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarBanco")) {
				jButtonCancelarBancoActionPerformed(evt);
			} else if(sTipo.equals("CerrarBanco")) {
				jButtonCerrarBancoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarBanco")) {
				jButtonCerrarBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarBanco")) {
				jButtonCerrarBancoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarBanco")) {
				jButtonMostrarOcultarBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarBanco")) {
				jButtonCancelarBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosBanco")) {
				jButtonGuardarCambiosBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarBanco")) {
				jButtonGuardarCambiosBancoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarBanco")) {
				jButtonCopiarBancoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarBanco")) {
				jButtonVerFormBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosBanco")) {
				jButtonGuardarCambiosBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarBanco")) {
				jButtonCopiarBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormBanco")) {
				jButtonVerFormBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaBanco")) {
				jButtonGuardarCambiosBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarBanco")) {
				jButtonGuardarCambiosBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaBanco")) {
				jButtonGuardarCambiosBancoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionBanco")) {
				jButtonRecargarInformacionBancoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarBanco")) {
				jButtonRecargarInformacionBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionBanco")) {
				jButtonRecargarInformacionBancoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresBanco")) {
				jButtonAnterioresBancoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarBanco")) {
				jButtonAnterioresBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreBanco")) {
				jButtonAnterioresBancoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesBanco")) {
				jButtonSiguientesBancoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarBanco")) {
				jButtonSiguientesBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesBanco")) {
				jButtonSiguientesBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByBanco") || sTipo.equals("MenuItemDetalleAbrirOrderByBanco")) {
				jButtonAbrirOrderByBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarBanco") || sTipo.equals("MenuItemDetalleMostrarOcultarBanco")) {
				jButtonMostrarOcultarBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosBanco")) {
				jButtonNuevoGuardarCambiosBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarBanco")) {
				jButtonNuevoGuardarCambiosBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosBanco")) {
				jButtonNuevoGuardarCambiosBancoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoBanco")) {
				jButtonCerrarReporteDinamicoBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoBanco")) {
				jButtonGenerarReporteDinamicoBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoBanco")) {
				
				jButtonGenerarExcelReporteDinamicoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionBanco")) {
				jButtonCerrarImportacionBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionBanco")) {
				
				jButtonGenerarImportacionBancoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionBanco")) {
				
				jButtonAbrirImportacionBancoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesBanco")) {
				jComboBoxTiposAccionesBancoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesBanco")) {
				jComboBoxTiposRelacionesBancoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioBanco")) {
				jComboBoxTiposAccionesBancoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarBanco")) {
				
				jComboBoxTiposSeleccionarBancoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralBanco")) {
				jTextFieldValorCampoGeneralBancoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByBanco")) {
				jButtonAbrirOrderByBancoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarBanco")) {
				jButtonAbrirOrderByBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByBanco")) {
				jButtonCerrarOrderByBancoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBancoBusqueda")) {
				this.jButtonidBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBancoUpdate")) {
				this.jButtonid_empresaBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBancoBusqueda")) {
				this.jButtonid_empresaBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalBancoUpdate")) {
				this.jButtonid_sucursalBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalBancoBusqueda")) {
				this.jButtonid_sucursalBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoBancoBusqueda")) {
				this.jButtoncodigoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_institucionBancoBusqueda")) {
				this.jButtoncodigo_institucionBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreBancoBusqueda")) {
				this.jButtonnombreBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_bancoBancoUpdate")) {
				this.jButtonid_tipo_bancoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_bancoBancoBusqueda")) {
				this.jButtonid_tipo_bancoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dias_efectivo_localBancoBusqueda")) {
				this.jButtondias_efectivo_localBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dias_efectivo_extranjeroBancoBusqueda")) {
				this.jButtondias_efectivo_extranjeroBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoBancoUpdate")) {
				this.jButtonid_cuenta_contable_debitoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoBancoBusqueda")) {
				this.jButtonid_cuenta_contable_debitoBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoBancoUpdate")) {
				this.jButtonid_cuenta_contable_creditoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoBancoBusqueda")) {
				this.jButtonid_cuenta_contable_creditoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("delimitadorBancoBusqueda")) {
				this.jButtondelimitadorBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato1BancoUpdate")) {
				this.jButtonid_formato1BancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato1BancoBusqueda")) {
				this.jButtonid_formato1BancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato2BancoUpdate")) {
				this.jButtonid_formato2BancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato2BancoBusqueda")) {
				this.jButtonid_formato2BancoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoBanco")) {
				this.jButtonBusquedaPorCodigoBancoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorCodigoInstitucionBanco")) {
				this.jButtonBusquedaPorCodigoInstitucionBancoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreBanco")) {
				this.jButtonBusquedaPorNombreBancoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoBancoBanco")) {
				this.jButtonFK_IdTipoBancoBancoActionPerformed(evt);
			}
			
			;
			
			
			BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessBanco();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.banco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.banco);
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
				
				


			if(sTipo.equals("codigo_institucionBanco")) {
				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					//classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormBanco(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,true,esControlTabla);
			}
			 else if(sTipo.equals("nombreBanco")) {
				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					//classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormBanco(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Banco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Banco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Banco bancoLocal=null;
			
			if(!this.getEsControlTabla()) {
				bancoLocal=this.banco;
			} else {
				bancoLocal=this.bancoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


				if(sTipo.equals("codigo_institucionBanco")) {
					if(bancoLocal.getcodigo_institucion()==this.jInternalFrameDetalleFormBanco.jTextFieldcodigo_institucionBanco.getText()){existeCambio=false;}
				}
				 else if(sTipo.equals("nombreBanco")) {
					if(bancoLocal.getnombre()==this.jInternalFrameDetalleFormBanco.jTextAreanombreBanco.getText()){existeCambio=false;}
				}
			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.banco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.banco);
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
							
				
				


			if(sTipo.equals("codigo_institucionBanco")) {
				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					//classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormBanco(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,true,esControlTabla);
			}
			 else if(sTipo.equals("nombreBanco")) {
				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					//classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormBanco(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Banco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Banco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoAnterior =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancoAnterior =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			if(sTipo.equals("codigo_institucionBanco")) {
				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					//classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormBanco(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,true,esControlTabla);
			}
			 else if(sTipo.equals("nombreBanco")) {
				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					//classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormBanco(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			
			BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.banco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.banco);
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
								
						
				


				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Banco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Banco.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.banco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.banco);
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
								
				
				


				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Banco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Banco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoAnterior =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancoAnterior =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.banco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.banco);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoAnterior =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancoAnterior =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.banco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.banco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.banco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.banco);
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
							
				
				


			if(sTipo.equals("codigo_institucionBanco")) {
				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					//classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormBanco(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTAREA",classes,true,esControlTabla);
			}
			 else if(sTipo.equals("nombreBanco")) {
				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					//classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormBanco(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTAREA",classes,false,esControlTabla);
			}
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Banco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Banco.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBanco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoAnterior =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.bancoAnterior =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			if(sTipo.equals("codigo_institucionBanco")) {
				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					//classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormBanco(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTAREA",classes,true,esControlTabla);
			}
			 else if(sTipo.equals("nombreBanco")) {
				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					//classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormBanco(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTAREA",classes,false,esControlTabla);
			}
			
			BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.banco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.banco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.banco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.banco);
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
								
				
				


			if(sTipo.equals("codigo_institucionBanco")) {
				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					//classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormBanco(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.LABEL,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"LABEL",classes,true,esControlTabla);
			}
			 else if(sTipo.equals("nombreBanco")) {
				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					//classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormBanco(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.LABEL,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"LABEL",classes,false,esControlTabla);
			}
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Banco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Banco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoAnterior =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancoAnterior =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.banco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.banco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.banco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.banco);
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosBanco")) {
					jCheckBoxSeleccionarTodosBancoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosBanco")) {
					jCheckBoxSeleccionadosBancoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarBanco")) {
					
				}
				
				


				
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Banco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Banco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.banco);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.banco);
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
												
				
				


				
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Banco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Banco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBanco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoAnterior =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.bancoAnterior =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.banco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.banco);
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
				
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			if(sTipo.equals("id_tipo_bancoBanco")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco;
				}

				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					//classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyTipoBanco(jComboBoxGenerico,"Formulario");

				this.recargarFormBanco(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,true,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_tipo_bancoFK_IdTipoBancoBanco")) {
				this.procesarActionsCombosForeignKeyTipoBanco(jComboBoxid_tipo_bancoFK_IdTipoBancoBanco,"FK_IdTipoBanco");
				//recargarFormBancoTipoBanco(jComboBoxid_tipo_bancoFK_IdTipoBancoBanco,"FK_IdTipoBanco");
			}
			
			BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.banco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.banco);
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_tipo_bancoBanco")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco;
				}

				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					//classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyTipoBanco(jComboBoxGenerico,"Formulario");

				this.recargarFormBanco(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,true,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_tipo_bancoFK_IdTipoBancoBanco")) {
				this.procesarActionsCombosForeignKeyTipoBanco(jComboBoxid_tipo_bancoFK_IdTipoBancoBanco,"FK_IdTipoBanco");
				//recargarFormBancoTipoBanco(jComboBoxid_tipo_bancoFK_IdTipoBancoBanco,"FK_IdTipoBanco");
			}
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Banco.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Banco.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.banco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.banco);
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_tipo_bancoBanco")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco;
				}

				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					//classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyTipoBanco(jComboBoxGenerico,"Formulario");

				this.recargarFormBanco(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,true,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_tipo_bancoFK_IdTipoBancoBanco")) {
				this.procesarActionsCombosForeignKeyTipoBanco(jComboBoxid_tipo_bancoFK_IdTipoBancoBanco,"FK_IdTipoBanco");
				//recargarFormBancoTipoBanco(jComboBoxid_tipo_bancoFK_IdTipoBancoBanco,"FK_IdTipoBanco");
			}
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Banco.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Banco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoAnterior =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancoAnterior =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarBanco")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosBancoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosBanco.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.banco =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.banco =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.banco);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarBanco")) {
				
				}
				
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarBanco")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosBanco.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarBanco")) {
			
			}
			
			BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessBanco();
			
			BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
			
			if(sTipo.equals("NuevoBanco")) {
				jButtonNuevoBancoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarBanco")) {
				jButtonDuplicarBancoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarBanco")) {
				jButtonCopiarBancoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormBanco")) {
				jButtonVerFormBancoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesBanco")) {
				jButtonNuevoBancoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarBanco")) {
				jButtonModificarBancoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarBanco")) {
				jButtonActualizarBancoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarBanco")) {
				jButtonEliminarBancoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaBanco")) {
				jButtonGuardarCambiosBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarBanco")) {
				jButtonCancelarBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarBanco")) {
				jButtonCerrarBancoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosBanco")) {
				jButtonGuardarCambiosBancoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosBanco")) {
				jButtonNuevoGuardarCambiosBancoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByBanco")) {
				jButtonAbrirOrderByBancoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionBanco")) {
				jButtonRecargarInformacionBancoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresBanco")) {
				jButtonAnterioresBancoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesBanco")) {
				jButtonSiguientesBancoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBancoBusqueda")) {
				this.jButtonidBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBancoUpdate")) {
				this.jButtonid_empresaBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBancoBusqueda")) {
				this.jButtonid_empresaBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalBancoUpdate")) {
				this.jButtonid_sucursalBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalBancoBusqueda")) {
				this.jButtonid_sucursalBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoBancoBusqueda")) {
				this.jButtoncodigoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_institucionBancoBusqueda")) {
				this.jButtoncodigo_institucionBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreBancoBusqueda")) {
				this.jButtonnombreBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_bancoBancoUpdate")) {
				this.jButtonid_tipo_bancoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_bancoBancoBusqueda")) {
				this.jButtonid_tipo_bancoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dias_efectivo_localBancoBusqueda")) {
				this.jButtondias_efectivo_localBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dias_efectivo_extranjeroBancoBusqueda")) {
				this.jButtondias_efectivo_extranjeroBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoBancoUpdate")) {
				this.jButtonid_cuenta_contable_debitoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoBancoBusqueda")) {
				this.jButtonid_cuenta_contable_debitoBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoBancoUpdate")) {
				this.jButtonid_cuenta_contable_creditoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoBancoBusqueda")) {
				this.jButtonid_cuenta_contable_creditoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("delimitadorBancoBusqueda")) {
				this.jButtondelimitadorBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato1BancoUpdate")) {
				this.jButtonid_formato1BancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato1BancoBusqueda")) {
				this.jButtonid_formato1BancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato2BancoUpdate")) {
				this.jButtonid_formato2BancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato2BancoBusqueda")) {
				this.jButtonid_formato2BancoBusquedaActionPerformed(evt);
			}
			
			BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessBanco();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameBanco")) {
				closingInternalFrameBanco();
				
			} else if(sTipo.equals("jButtonCancelarBanco")) {
				JInternalFrameBase jInternalFrameDetalleFormBanco = (JInternalFrameBase)evt.getSource();
	            	
	            BancoBeanSwingJInternalFrame jInternalFrameParent=(BancoBeanSwingJInternalFrame)jInternalFrameDetalleFormBanco.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarBancoActionPerformed(null);
			}
			
			BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.banco,new Object(),this.bancoParameterGeneral,this.bancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormBanco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormBanco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormBanco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.banco)) {
			if(!esControlTabla) {
				if(BancoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualBanco(this.banco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);			
				}
				
				if(this.bancoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualBanco(this.banco,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.bancoReturnGeneral=bancoLogic.procesarEventosBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bancoLogic.getBancos(),this.banco,this.bancoParameterGeneral,this.isEsNuevoBanco,classes);//this.bancoLogic.getBanco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanBanco(this.bancoReturnGeneral,this.bancoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.bancoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanBanco(classes,this.bancoReturnGeneral,this.bancoBean,false);
					}
						
					if(this.bancoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyBanco(this.bancoReturnGeneral.getBanco());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioBanco(this.bancoReturnGeneral.getBanco());	
					}
						
					if(this.bancoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioBanco(this.bancoReturnGeneral.getBanco(),classes);//this.bancoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioBanco(this.banco,classes);//this.bancoBean);									
				}
			
				if(BancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualBanco(this.banco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBanco(this.banco);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.bancoAnterior!=null) {
						this.banco=this.bancoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.bancoReturnGeneral=bancoLogic.procesarEventosBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bancoLogic.getBancos(),this.banco,this.bancoParameterGeneral,this.isEsNuevoBanco,classes);//this.bancoLogic.getBanco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.bancoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.bancoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.bancoReturnGeneral.getBanco(),bancoLogic.getBancos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.bancoReturnGeneral.getBanco(),this.bancos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosBanco.repaint();
				
				//((AbstractTableModel) this.jTableDatosBanco.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosBanco();
			}
		}
	}
	
	public void actualizarVisualTableDatosBanco() throws Exception {
		
		BancoModel bancoModel=(BancoModel)this.jTableDatosBanco.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bancoModel.bancos=this.bancoLogic.getBancos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			bancoModel.bancos=this.bancos;
		}
		
		
		((BancoModel) this.jTableDatosBanco.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaBanco() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getbancoAnterior(),this.bancoLogic.getBancos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getbancoAnterior(),this.bancos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosBanco();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioBanco(Banco banco,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(AutoriPago.class)) {
					this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoLogic.setAutoriPagos(banco.getAutoriPagos());
					this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaAutoriPago(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TarjetaCredito.class)) {
					this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.setTarjetaCreditos(banco.getTarjetaCreditos());
					this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTarjetaCredito(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaBancoPunVen.class)) {
					this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenLogic.setCuentaBancoPunVens(banco.getCuentaBancoPunVens());
					this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaBancoPunVen(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PoliticasCliente.class)) {
					this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.setPoliticasClientes(banco.getPoliticasClientes());
					this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPoliticasCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(banco.getFormaPagoPuntoVentas());
					this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaBanco.class)) {
					this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoLogic.setCuentaBancos(banco.getCuentaBancos());
					this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaBanco(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TipoCuentaBancoGeneral.class)) {
					this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(banco.getTipoCuentaBancoGenerals());
					this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.banco,new Object(),generalEntityParameterGeneral,this.bancoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.bancoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=BancoConstantesFunciones.getClassesRelationshipsOfBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=BancoConstantesFunciones.getClassesRelationshipsFromStringsOfBanco(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormBanco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				BancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.banco,new Object(),generalEntityParameterGeneral,this.bancoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioBanco(BancoBean bancoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(AutoriPago.class)) {
					this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoLogic.setAutoriPagos(banco.getAutoriPagos());
					this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaAutoriPago(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TarjetaCredito.class)) {
					this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.setTarjetaCreditos(banco.getTarjetaCreditos());
					this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTarjetaCredito(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaBancoPunVen.class)) {
					this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenLogic.setCuentaBancoPunVens(banco.getCuentaBancoPunVens());
					this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaBancoPunVen(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PoliticasCliente.class)) {
					this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.setPoliticasClientes(banco.getPoliticasClientes());
					this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPoliticasCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(banco.getFormaPagoPuntoVentas());
					this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaBanco.class)) {
					this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoLogic.setCuentaBancos(banco.getCuentaBancos());
					this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaBanco(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TipoCuentaBancoGeneral.class)) {
					this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(banco.getTipoCuentaBancoGenerals());
					this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanBanco(ArrayList<Classe> classes,BancoReturnGeneral bancoReturnGeneral,BancoBean bancoBean,Boolean conDefault) throws Exception {
		
			this.bancoBean.setAutoriPagos(bancoReturnGeneral.getBanco().getAutoriPagos());
			this.bancoBean.setTarjetaCreditos(bancoReturnGeneral.getBanco().getTarjetaCreditos());
			this.bancoBean.setCuentaBancoPunVens(bancoReturnGeneral.getBanco().getCuentaBancoPunVens());
			this.bancoBean.setPoliticasClientes(bancoReturnGeneral.getBanco().getPoliticasClientes());
			this.bancoBean.setFormaPagoPuntoVentas(bancoReturnGeneral.getBanco().getFormaPagoPuntoVentas());
			this.bancoBean.setCuentaBancos(bancoReturnGeneral.getBanco().getCuentaBancos());
			this.bancoBean.setTipoCuentaBancoGenerals(bancoReturnGeneral.getBanco().getTipoCuentaBancoGenerals());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualBanco(Banco banco,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(AutoriPago.class)) {
					banco.setAutoriPagos(this.jInternalFrameDetalleFormBanco.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TarjetaCredito.class)) {
					banco.setTarjetaCreditos(this.jInternalFrameDetalleFormBanco.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaBancoPunVen.class)) {
					banco.setCuentaBancoPunVens(this.jInternalFrameDetalleFormBanco.cuentabancopunvenBeanSwingJInternalFrame.cuentabancopunvenLogic.getCuentaBancoPunVens());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PoliticasCliente.class)) {
					banco.setPoliticasClientes(this.jInternalFrameDetalleFormBanco.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					banco.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormBanco.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaBanco.class)) {
					banco.setCuentaBancos(this.jInternalFrameDetalleFormBanco.cuentabancoBeanSwingJInternalFrame.cuentabancoLogic.getCuentaBancos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TipoCuentaBancoGeneral.class)) {
					banco.setTipoCuentaBancoGenerals(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.banco)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormBanco = new BancoDetalleFormJInternalFrame(jDesktopPane,this.bancoSessionBean.getConGuardarRelaciones(),this.bancoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormBanco);
		this.jInternalFrameDetalleFormBanco.setVisible(false);
		this.jInternalFrameDetalleFormBanco.setSelected(false);						
		
		this.jInternalFrameDetalleFormBanco.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormBanco.bancoLogic=this.bancoLogic;
		
		this.cargarCombosFrameForeignKeyBanco("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleBanco();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBanco();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyBanco("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyBanco();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormBanco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBanco"));
		
		this.jInternalFrameDetalleFormBanco.jButtonModificarBanco.addActionListener(new ButtonActionListener(this,"ModificarBanco"));

		
		this.jInternalFrameDetalleFormBanco.jButtonModificarToolBarBanco.addActionListener(new ButtonActionListener(this,"ModificarToolBarBanco"));
					
		this.jInternalFrameDetalleFormBanco.jMenuItemModificarBanco.addActionListener(new ButtonActionListener(this,"MenuItemModificarBanco"));		
		
		
		
		this.jInternalFrameDetalleFormBanco.jButtonActualizarBanco.addActionListener (new ButtonActionListener(this,"ActualizarBanco"));
		
		
		this.jInternalFrameDetalleFormBanco.jButtonActualizarToolBarBanco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBanco"));
						
		this.jInternalFrameDetalleFormBanco.jMenuItemActualizarBanco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBanco"));		
		
		
		
		this.jInternalFrameDetalleFormBanco.jButtonEliminarBanco.addActionListener (new ButtonActionListener(this,"EliminarBanco"));
		
		
		this.jInternalFrameDetalleFormBanco.jButtonEliminarToolBarBanco.addActionListener (new ButtonActionListener(this,"EliminarToolBarBanco"));
								
		this.jInternalFrameDetalleFormBanco.jMenuItemEliminarBanco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBanco"));		
		
		
		
		this.jInternalFrameDetalleFormBanco.jButtonCancelarBanco.addActionListener (new ButtonActionListener(this,"CancelarBanco"));
		
		
		this.jInternalFrameDetalleFormBanco.jButtonCancelarToolBarBanco.addActionListener (new ButtonActionListener(this,"CancelarToolBarBanco"));
					
		this.jInternalFrameDetalleFormBanco.jMenuItemCancelarBanco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBanco"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormBanco.jMenuItemDetalleCerrarBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBanco"));		
		
		
		
		this.jInternalFrameDetalleFormBanco.jButtonGuardarCambiosToolBarBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBanco"));
		
		
		
		this.jInternalFrameDetalleFormBanco.jButtonGuardarCambiosToolBarBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBanco"));
		
		
		
		this.jInternalFrameDetalleFormBanco.jComboBoxTiposAccionesFormularioBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBanco"));
		
		
		//CAMPO EVENTO
		this.jInternalFrameDetalleFormBanco.jTextFieldcodigo_institucionBanco.addFocusListener(new TextFieldFocusListener(this,"codigo_institucionBanco"));
		this.jInternalFrameDetalleFormBanco.jTextFieldcodigo_institucionBanco.addActionListener(new TextFieldActionListener(this,"codigo_institucionBanco"));
		//this.jInternalFrameDetalleFormBanco.jTextFieldcodigo_institucionBanco.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldcodigo_institucionBanco,"codigo_institucionBanco"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormBanco.jTextAreanombreBanco.addFocusListener(new TextAreaFocusListener(this,"nombreBanco"));
		//this.jInternalFrameDetalleFormBanco.jTextAreanombreBanco.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextAreanombreBanco,"nombreBanco"));


				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonidBancoBusqueda.addActionListener(new ButtonActionListener(this,"idBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_empresaBancoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_empresaBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_sucursalBancoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_sucursalBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtoncodigoBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtoncodigo_institucionBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_institucionBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonnombreBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_tipo_bancoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_bancoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_tipo_bancoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_bancoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtondias_efectivo_localBancoBusqueda.addActionListener(new ButtonActionListener(this,"dias_efectivo_localBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtondias_efectivo_extranjeroBancoBusqueda.addActionListener(new ButtonActionListener(this,"dias_efectivo_extranjeroBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_cuenta_contable_debitoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_cuenta_contable_debitoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_cuenta_contable_creditoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_cuenta_contable_creditoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtondelimitadorBancoBusqueda.addActionListener(new ButtonActionListener(this,"delimitadorBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_formato1BancoUpdate.addActionListener(new ButtonActionListener(this,"id_formato1BancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_formato1BancoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato1BancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_formato2BancoUpdate.addActionListener(new ButtonActionListener(this,"id_formato2BancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_formato2BancoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato2BancoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormBanco.jTabbedPaneRelacionesBanco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBanco"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameBanco"));
		
		if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBanco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBanco"));
		}
		
		this.jTableDatosBanco.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarBanco"));
		
		this.jTableDatosBanco.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarBanco"));
		
		this.jButtonNuevoBanco.addActionListener(new ButtonActionListener(this,"NuevoBanco"));
		
		this.jButtonDuplicarBanco.addActionListener(new ButtonActionListener(this,"DuplicarBanco"));
		
		this.jButtonCopiarBanco.addActionListener(new ButtonActionListener(this,"CopiarBanco"));
		
		this.jButtonVerFormBanco.addActionListener(new ButtonActionListener(this,"VerFormBanco"));
		
		
		this.jButtonNuevoToolBarBanco.addActionListener(new ButtonActionListener(this,"NuevoToolBarBanco"));
			
		this.jButtonDuplicarToolBarBanco.addActionListener(new ButtonActionListener(this,"DuplicarToolBarBanco"));
			
		this.jMenuItemNuevoBanco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoBanco"));
			
		this.jMenuItemDuplicarBanco.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarBanco"));		
		
		
		this.jButtonNuevoRelacionesBanco.addActionListener (new ButtonActionListener(this,"NuevoRelacionesBanco"));
		
		
		this.jButtonNuevoRelacionesToolBarBanco.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarBanco"));
			
		this.jMenuItemNuevoRelacionesBanco.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesBanco"));		
		
		
		if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBanco.jButtonModificarBanco.addActionListener(new ButtonActionListener(this,"ModificarBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBanco.jButtonModificarToolBarBanco.addActionListener(new ButtonActionListener(this,"ModificarToolBarBanco"));
			
			this.jInternalFrameDetalleFormBanco.jMenuItemModificarBanco.addActionListener(new ButtonActionListener(this,"MenuItemModificarBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormBanco.jButtonActualizarBanco.addActionListener (new ButtonActionListener(this,"ActualizarBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBanco.jButtonActualizarToolBarBanco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBanco"));
				
			this.jInternalFrameDetalleFormBanco.jMenuItemActualizarBanco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBanco.jButtonEliminarBanco.addActionListener (new ButtonActionListener(this,"EliminarBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBanco.jButtonEliminarToolBarBanco.addActionListener (new ButtonActionListener(this,"EliminarToolBarBanco"));
						
			this.jInternalFrameDetalleFormBanco.jMenuItemEliminarBanco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBanco.jButtonCancelarBanco.addActionListener (new ButtonActionListener(this,"CancelarBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBanco.jButtonCancelarToolBarBanco.addActionListener (new ButtonActionListener(this,"CancelarToolBarBanco"));
			
			this.jInternalFrameDetalleFormBanco.jMenuItemCancelarBanco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBanco"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarBanco.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarBanco"));		
		
		
		this.jButtonCerrarBanco.addActionListener (new ButtonActionListener(this,"CerrarBanco"));
		
		
		this.jButtonCerrarToolBarBanco.addActionListener (new ButtonActionListener(this,"CerrarToolBarBanco"));
			
		this.jMenuItemCerrarBanco.addActionListener (new ButtonActionListener(this,"MenuItemCerrarBanco"));
			
		if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBanco.jMenuItemDetalleCerrarBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBanco.jButtonGuardarCambiosBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBanco.jButtonGuardarCambiosToolBarBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBanco"));
		}
		
		this.jButtonCopiarToolBarBanco.addActionListener (new ButtonActionListener(this,"CopiarToolBarBanco"));
			
		this.jButtonVerFormToolBarBanco.addActionListener (new ButtonActionListener(this,"VerFormToolBarBanco"));
		
		this.jMenuItemGuardarCambiosBanco.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosBanco"));
			
		this.jMenuItemCopiarBanco.addActionListener (new ButtonActionListener(this,"MenuItemCopiarBanco"));		
		
		this.jMenuItemVerFormBanco.addActionListener (new ButtonActionListener(this,"MenuItemVerFormBanco"));		
		
		
		this.jButtonGuardarCambiosTablaBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBanco"));
		
		
		this.jButtonGuardarCambiosTablaToolBarBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarBanco"));
			
		this.jMenuItemGuardarCambiosTablaBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBanco"));		
		
		
		
		this.jButtonRecargarInformacionBanco.addActionListener (new ButtonActionListener(this,"RecargarInformacionBanco"));
					
		this.jButtonRecargarInformacionToolBarBanco.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarBanco"));
		
		this.jMenuItemRecargarInformacionBanco.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionBanco"));		
		
		
		
		this.jButtonAnterioresBanco.addActionListener (new ButtonActionListener(this,"AnterioresBanco"));
		
		
		this.jButtonAnterioresToolBarBanco.addActionListener (new ButtonActionListener(this,"AnterioresToolBarBanco"));
		
		this.jMenuItemAnterioresBanco.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresBanco"));		
		
		
		this.jButtonSiguientesBanco.addActionListener (new ButtonActionListener(this,"SiguientesBanco"));
		
		
		this.jButtonSiguientesToolBarBanco.addActionListener (new ButtonActionListener(this,"SiguientesToolBarBanco"));
			
		this.jMenuItemSiguientesBanco.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesBanco"));
			
		this.jMenuItemAbrirOrderByBanco.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByBanco"));
			
		this.jMenuItemMostrarOcultarBanco.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarBanco"));
			
		this.jMenuItemDetalleAbrirOrderByBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByBanco"));
			
		this.jMenuItemDetalleMostarOcultarBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarBanco"));		
		
		
		this.jButtonNuevoGuardarCambiosBanco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosBanco"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarBanco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarBanco"));
			
		this.jMenuItemNuevoGuardarCambiosBanco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosBanco"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosBanco.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosBanco"));

		this.jCheckBoxSeleccionadosBanco.addItemListener(new CheckBoxItemListener(this,"SeleccionadosBanco"));
		
		if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBanco.jComboBoxTiposAccionesFormularioBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBanco"));
		}
		
		
		this.jComboBoxTiposRelacionesBanco.addActionListener (new ButtonActionListener(this,"TiposRelacionesBanco"));
			
		this.jComboBoxTiposAccionesBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesBanco"));
					
		this.jComboBoxTiposSeleccionarBanco.addActionListener (new ButtonActionListener(this,"TiposSeleccionarBanco"));
			
		this.jTextFieldValorCampoGeneralBanco.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralBanco"));		
		
		
		if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {
		
		//CAMPO EVENTO
		this.jInternalFrameDetalleFormBanco.jTextFieldcodigo_institucionBanco.addFocusListener(new TextFieldFocusListener(this,"codigo_institucionBanco"));
		this.jInternalFrameDetalleFormBanco.jTextFieldcodigo_institucionBanco.addActionListener(new TextFieldActionListener(this,"codigo_institucionBanco"));
		//this.jInternalFrameDetalleFormBanco.jTextFieldcodigo_institucionBanco.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldcodigo_institucionBanco,"codigo_institucionBanco"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormBanco.jTextAreanombreBanco.addFocusListener(new TextAreaFocusListener(this,"nombreBanco"));
		//this.jInternalFrameDetalleFormBanco.jTextAreanombreBanco.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextAreanombreBanco,"nombreBanco"));


		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonidBancoBusqueda.addActionListener(new ButtonActionListener(this,"idBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_empresaBancoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_empresaBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_sucursalBancoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_sucursalBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtoncodigoBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtoncodigo_institucionBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_institucionBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonnombreBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_tipo_bancoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_bancoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_tipo_bancoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_bancoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtondias_efectivo_localBancoBusqueda.addActionListener(new ButtonActionListener(this,"dias_efectivo_localBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtondias_efectivo_extranjeroBancoBusqueda.addActionListener(new ButtonActionListener(this,"dias_efectivo_extranjeroBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_cuenta_contable_debitoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_cuenta_contable_debitoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_cuenta_contable_creditoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_cuenta_contable_creditoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtondelimitadorBancoBusqueda.addActionListener(new ButtonActionListener(this,"delimitadorBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_formato1BancoUpdate.addActionListener(new ButtonActionListener(this,"id_formato1BancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_formato1BancoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato1BancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_formato2BancoUpdate.addActionListener(new ButtonActionListener(this,"id_formato2BancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_formato2BancoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato2BancoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoBanco.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoBanco"));

			this.jButtonBusquedaPorCodigoInstitucionBanco.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoInstitucionBanco"));

			this.jButtonBusquedaPorNombreBanco.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreBanco"));

			this.jButtonFK_IdTipoBancoBanco.addActionListener(new ButtonActionListener(this,"FK_IdTipoBancoBanco"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoBanco!=null) {
				this.jInternalFrameReporteDinamicoBanco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBanco"));
				this.jInternalFrameReporteDinamicoBanco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBanco"));
				this.jInternalFrameReporteDinamicoBanco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBanco"));
			}
			
			//this.jButtonCerrarReporteDinamicoBanco.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBanco"));				
			//this.jButtonGenerarReporteDinamicoBanco.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBanco"));
			//this.jButtonGenerarExcelReporteDinamicoBanco.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBanco"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionBanco!=null) {
				this.jInternalFrameImportacionBanco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBanco"));
				this.jInternalFrameImportacionBanco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBanco"));
				this.jInternalFrameImportacionBanco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBanco"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByBanco.addActionListener (new ButtonActionListener(this,"AbrirOrderByBanco"));
			
			this.jButtonAbrirOrderByToolBarBanco.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarBanco"));			
			
			if(this.jInternalFrameOrderByBanco!=null) {
				this.jInternalFrameOrderByBanco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBanco"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBanco.jTabbedPaneRelacionesBanco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBanco"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameBanco();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormBanco.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormBanco = (JInternalFrameBase)event.getSource();
	            	
	            BancoBeanSwingJInternalFrame jInternalFrameParent=(BancoBeanSwingJInternalFrame)jInternalFrameDetalleFormBanco.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarBancoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosBanco.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosBancoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosBanco.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosBanco.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoBanco";
		inputMap = this.jButtonNuevoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBancoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesBanco";
		inputMap = this.jButtonNuevoRelacionesBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBancoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarBanco";
		inputMap = this.jButtonModificarBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarBanco";
		inputMap = this.jButtonActualizarBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarBanco";
		inputMap = this.jButtonEliminarBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarBanco";
		inputMap = this.jButtonCancelarBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarBanco";
		inputMap = this.jButtonCerrarBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormBanco.jButtonGuardarCambiosBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosBanco";
		inputMap = this.jInternalFrameDetalleFormBanco.jButtonGuardarCambiosBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormBanco.jButtonGuardarCambiosBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosBanco.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosBancoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonidBancoBusqueda.addActionListener(new ButtonActionListener(this,"idBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_empresaBancoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_empresaBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_sucursalBancoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_sucursalBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtoncodigoBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtoncodigo_institucionBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_institucionBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonnombreBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_tipo_bancoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_bancoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_tipo_bancoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_bancoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtondias_efectivo_localBancoBusqueda.addActionListener(new ButtonActionListener(this,"dias_efectivo_localBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtondias_efectivo_extranjeroBancoBusqueda.addActionListener(new ButtonActionListener(this,"dias_efectivo_extranjeroBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_cuenta_contable_debitoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_cuenta_contable_debitoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_cuenta_contable_creditoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_cuenta_contable_creditoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtondelimitadorBancoBusqueda.addActionListener(new ButtonActionListener(this,"delimitadorBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_formato1BancoUpdate.addActionListener(new ButtonActionListener(this,"id_formato1BancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_formato1BancoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato1BancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBanco.jButtonid_formato2BancoUpdate.addActionListener(new ButtonActionListener(this,"id_formato2BancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBanco.jButtonid_formato2BancoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato2BancoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoBanco.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoBanco"));

		this.jButtonBusquedaPorCodigoInstitucionBanco.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoInstitucionBanco"));

		this.jButtonBusquedaPorNombreBanco.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreBanco"));

		this.jButtonFK_IdTipoBancoBanco.addActionListener(new ButtonActionListener(this,"FK_IdTipoBancoBanco"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarBancoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarBanco.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosBanco(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Banco bancoAux:this.bancoLogic.getBancos()) {
					bancoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Banco bancoAux:bancos) {
					bancoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosBancoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBanco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Banco bancoAux:this.bancoLogic.getBancos()) {
						bancoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Banco bancoAux:bancos) {
						bancoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Banco bancoAux:this.bancoLogic.getBancos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Banco bancoAux:bancos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaBanco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBanco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBanco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBanco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosBancoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBanco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosBanco.getSelectedRows();
			
			Banco bancoLocal=new Banco();
			
			//this.seleccionarTodosBanco(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLocal =(Banco) this.bancoLogic.getBancos().toArray()[this.jTableDatosBanco.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					bancoLocal =(Banco) this.bancos.toArray()[this.jTableDatosBanco.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				bancoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Banco bancoAux:this.bancoLogic.getBancos()) {
						bancoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Banco bancoAux:bancos) {
						bancoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaBanco(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBanco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBanco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBanco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualBancoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarBancoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralBancoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingBanco(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralBanco.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Banco bancoAux:this.bancoLogic.getBancos()) {
				
						if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							bancoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_CODIGOINSTITUCION)) {
							existe=true;
							bancoAux.setcodigo_institucion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							bancoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL)) {
							existe=true;
							bancoAux.setdias_efectivo_local(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO)) {
							existe=true;
							bancoAux.setdias_efectivo_extranjero(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_DELIMITADOR)) {
							existe=true;
							bancoAux.setdelimitador(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Banco bancoAux:bancos) {
					
						if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							bancoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_CODIGOINSTITUCION)) {
							existe=true;
							bancoAux.setcodigo_institucion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							bancoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL)) {
							existe=true;
							bancoAux.setdias_efectivo_local(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO)) {
							existe=true;
							bancoAux.setdias_efectivo_extranjero(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_DELIMITADOR)) {
							existe=true;
							bancoAux.setdelimitador(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaBanco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesBancoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingBanco(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioBanco=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesBanco.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormBanco.jComboBoxTiposAccionesFormularioBanco.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteBanco) {				
					conSplash=true;//false;										
					
					//this.startProcessBanco(conSplash);
				
					this.generarReporteBancosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBanco.jComboBoxTiposAccionesFormularioBanco.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoBancosSeleccionados();
				//this.jComboBoxTiposAccionesBanco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBancosSeleccionados(false);
				//this.jComboBoxTiposAccionesBanco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBancosSeleccionados(true);
				//this.jComboBoxTiposAccionesBanco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBanco();
				
				this.exportarBancosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBanco.jComboBoxTiposAccionesFormularioBanco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionBancos();
				//this.importarBancos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBanco.jComboBoxTiposAccionesFormularioBanco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBanco();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelBancosSeleccionados();
				//this.jComboBoxTiposAccionesBanco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessBanco();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoBanco)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyBanco(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Banco",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBanco.jComboBoxTiposAccionesFormularioBanco.setSelectedIndex(0);					
				}	
			} 			
			else if(BancoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteBanco) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessBanco(conSplash);
					
						//this.actualizarParametrosGeneralBanco();
						
						this.generarReporteProcesoAccionBancosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesBanco.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormBanco.jComboBoxTiposAccionesFormularioBanco.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(BancoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO BancoS SELECCIONADOS?", "MANTENIMIENTO DE Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessBanco();
				
						this.actualizarParametrosGeneralBanco();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.bancoReturnGeneral=bancoLogic.procesarAccionBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.bancoLogic.getBancos(),this.bancoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarBancoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBanco.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBanco.jComboBoxTiposAccionesFormularioBanco.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralBanco();
					
					BancoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarBancoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBanco.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBanco.jComboBoxTiposAccionesFormularioBanco.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessBanco(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesBancoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessBanco();
			
			if(this.jInternalFrameDetalleFormBanco==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Banco> bancosSeleccionados=new ArrayList<Banco>();		
			Banco banco=new Banco();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingBanco(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesBanco.getSelectedItem();
			
			
			
			
			bancosSeleccionados=this.getBancosSeleccionados(true);
			//this.sTipoAccion;
			
			if(bancosSeleccionados.size()==1) {
				for(Banco bancoAux:bancosSeleccionados) {
					banco=bancoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Autori Pago")) {
					jButtonAutoriPagoActionPerformed(null,rowIndex,true,false,banco);
				}
				else if(this.sTipoRelacion.equals("Tarjeta Credito")) {
					jButtonTarjetaCreditoActionPerformed(null,rowIndex,true,false,banco);
				}
				else if(this.sTipoRelacion.equals("Cuenta Banco")) {
					jButtonCuentaBancoPunVenActionPerformed(null,rowIndex,true,false,banco);
				}
				else if(this.sTipoRelacion.equals("Politicas Cliente")) {
					jButtonPoliticasClienteActionPerformed(null,rowIndex,true,false,banco);
				}
				else if(this.sTipoRelacion.equals("Forma Pago")) {
					jButtonFormaPagoPuntoVentaActionPerformed(null,rowIndex,true,false,banco);
				}
				else if(this.sTipoRelacion.equals("Cuenta Banco")) {
					jButtonCuentaBancoActionPerformed(null,rowIndex,true,false,banco);
				}
				else if(this.sTipoRelacion.equals("Tipo Cuenta Banco General")) {
					jButtonTipoCuentaBancoGeneralActionPerformed(null,rowIndex,true,false,banco);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessBanco();
			
      		//this.finishProcessBanco(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarBancoReturnGeneral() throws Exception {
		if(this.bancoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.bancoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.bancoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.bancoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.bancoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.bancoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingBanco(false);
		}
		
		if(this.bancoReturnGeneral.getConRetornoLista() || this.bancoReturnGeneral.getConRetornoObjeto()) {
			if(this.bancoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.bancoLogic.setBancos(this.bancoReturnGeneral.getBancos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.bancoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.bancoLogic.setBanco(this.bancoReturnGeneral.getBanco());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingBanco(false);
		}
	}
	
	public void actualizarParametrosGeneralBanco() throws Exception {
		
		
	}
	
	public ArrayList<Banco> getBancosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Banco> bancosSeleccionados=new ArrayList<Banco>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioBanco) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Banco bancoAux:bancoLogic.getBancos()) {
					if(bancoAux.getIsSelected()) {
						bancosSeleccionados.add(bancoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Banco bancoAux:this.bancos) {
					if(bancoAux.getIsSelected()) {
						bancosSeleccionados.add(bancoAux);				
					}
				}
			}
			
			if(bancosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						bancosSeleccionados.addAll(this.bancoLogic.getBancos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						bancosSeleccionados.addAll(this.bancos);				
					}
				}
			}
		} else {
			bancosSeleccionados.add(this.banco);
		}
		
		return bancosSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteBancosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalBancosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoBancosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBancosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBancosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesBancosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Banco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesBancosSeleccionados() throws Exception {
		ArrayList<Banco> bancosSeleccionados=new ArrayList<Banco>();		
		
		bancosSeleccionados=this.getBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteBancos("Todos",bancosSeleccionados);
		
	}	
	
	public void generarReporteNormalBancosSeleccionados() throws Exception {
		ArrayList<Banco> bancosSeleccionados=new ArrayList<Banco>();		
		
		bancosSeleccionados=this.getBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteBancos("Todos",bancosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionBancosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Banco> bancosSeleccionados=new ArrayList<Banco>();
		
		bancosSeleccionados=this.getBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteBancos("Todos",bancosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoBancosSeleccionados() throws Exception {
		ArrayList<Banco> bancosSeleccionados=new ArrayList<Banco>();		
		
		
		this.abrirInicializarFrameReporteDinamicoBanco();
		
		
		bancosSeleccionados=this.getBancosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoBanco();
		
		
		//this.generarReporteBancos("Todos",bancosSeleccionados ,bancoImplementable,bancoImplementableHome);
	}
	
	public void mostrarImportacionBancos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionBanco();
		
		this.abrirFrameImportacionBanco();		
		
			
		//this.generarReporteBancos("Todos",bancosSeleccionados ,bancoImplementable,bancoImplementableHome);
	}
	
	public void importarBancos() throws Exception {		
	
	}
	
	public void exportarBancosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelBancosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoBancosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlBancosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Banco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoBancosSeleccionados() throws Exception {
		ArrayList<Banco> bancosSeleccionados=new ArrayList<Banco>();		
		
		bancosSeleccionados=this.getBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"banco."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarBanco(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Banco bancoAux:bancosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarBanco(bancoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//bancoAux.setsDetalleGeneralEntityReporte(bancoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarBanco(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=BancoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoConstantesFunciones.LABEL_CODIGOINSTITUCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoConstantesFunciones.LABEL_IDTIPOBANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoConstantesFunciones.LABEL_DELIMITADOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoConstantesFunciones.LABEL_IDFORMATO1;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoConstantesFunciones.LABEL_IDFORMATO2;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarBanco(Banco banco,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=banco.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=banco.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=banco.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=banco.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=banco.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=banco.getcodigo_institucion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=banco.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=banco.gettipobanco_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=banco.getdias_efectivo_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=banco.getdias_efectivo_extranjero().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=banco.getcuentacontabledebito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=banco.getcuentacontablecredito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=banco.getdelimitador();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=banco.getformato1_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=banco.getformato2_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelBancosSeleccionados() throws Exception {
		ArrayList<Banco> bancosSeleccionados=new ArrayList<Banco>();		
		
		bancosSeleccionados=this.getBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"banco.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Bancos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelBanco(row);				
				iRow++;
			}				
			
			for(Banco bancoAux:bancosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelBanco(bancoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlBancosSeleccionados() throws Exception {
		ArrayList<Banco> bancosSeleccionados=new ArrayList<Banco>();		
		
		bancosSeleccionados=this.getBancosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"banco.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("bancos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("banco");
			//elementRoot.appendChild(element);
		
			for(Banco bancoAux:bancosSeleccionados) {
				element = document.createElement("banco");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlBanco(bancoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelBanco(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(BancoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(BancoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(BancoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoConstantesFunciones.LABEL_CODIGOINSTITUCION);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoConstantesFunciones.LABEL_IDTIPOBANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoConstantesFunciones.LABEL_DELIMITADOR);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoConstantesFunciones.LABEL_IDFORMATO1);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoConstantesFunciones.LABEL_IDFORMATO2);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelBanco(Banco banco,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(banco.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(banco.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(banco.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(banco.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(banco.getcodigo_institucion());
		cell = row.createCell(iColumn++);cell.setCellValue(banco.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(banco.gettipobanco_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(banco.getdias_efectivo_local());
		cell = row.createCell(iColumn++);cell.setCellValue(banco.getdias_efectivo_extranjero());
		cell = row.createCell(iColumn++);cell.setCellValue(banco.getcuentacontabledebito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(banco.getcuentacontablecredito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(banco.getdelimitador());
		cell = row.createCell(iColumn++);cell.setCellValue(banco.getformato1_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(banco.getformato2_descripcion());				
	}
	
	public void setFilaDatosExportarXmlBanco(Banco banco,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(BancoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(banco.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(BancoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(banco.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(BancoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(banco.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(BancoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(banco.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcodigo = document.createElement(BancoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(banco.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementcodigo_institucion = document.createElement(BancoConstantesFunciones.CODIGOINSTITUCION);
		elementcodigo_institucion.appendChild(document.createTextNode(banco.getcodigo_institucion().trim()));
		element.appendChild(elementcodigo_institucion);

		Element elementnombre = document.createElement(BancoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(banco.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementtipobanco_descripcion = document.createElement(BancoConstantesFunciones.IDTIPOBANCO);
		elementtipobanco_descripcion.appendChild(document.createTextNode(banco.gettipobanco_descripcion()));
		element.appendChild(elementtipobanco_descripcion);

		Element elementdias_efectivo_local = document.createElement(BancoConstantesFunciones.DIASEFECTIVOLOCAL);
		elementdias_efectivo_local.appendChild(document.createTextNode(banco.getdias_efectivo_local().toString().trim()));
		element.appendChild(elementdias_efectivo_local);

		Element elementdias_efectivo_extranjero = document.createElement(BancoConstantesFunciones.DIASEFECTIVOEXTRANJERO);
		elementdias_efectivo_extranjero.appendChild(document.createTextNode(banco.getdias_efectivo_extranjero().toString().trim()));
		element.appendChild(elementdias_efectivo_extranjero);

		Element elementcuentacontabledebito_descripcion = document.createElement(BancoConstantesFunciones.IDCUENTACONTABLEDEBITO);
		elementcuentacontabledebito_descripcion.appendChild(document.createTextNode(banco.getcuentacontabledebito_descripcion()));
		element.appendChild(elementcuentacontabledebito_descripcion);

		Element elementcuentacontablecredito_descripcion = document.createElement(BancoConstantesFunciones.IDCUENTACONTABLECREDITO);
		elementcuentacontablecredito_descripcion.appendChild(document.createTextNode(banco.getcuentacontablecredito_descripcion()));
		element.appendChild(elementcuentacontablecredito_descripcion);

		Element elementdelimitador = document.createElement(BancoConstantesFunciones.DELIMITADOR);
		elementdelimitador.appendChild(document.createTextNode(banco.getdelimitador().trim()));
		element.appendChild(elementdelimitador);

		Element elementformato1_descripcion = document.createElement(BancoConstantesFunciones.IDFORMATO1);
		elementformato1_descripcion.appendChild(document.createTextNode(banco.getformato1_descripcion()));
		element.appendChild(elementformato1_descripcion);

		Element elementformato2_descripcion = document.createElement(BancoConstantesFunciones.IDFORMATO2);
		elementformato2_descripcion.appendChild(document.createTextNode(banco.getformato2_descripcion()));
		element.appendChild(elementformato2_descripcion);
	}
	
	public void generarReporteGroupGenericoBancosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Banco> bancosSeleccionados=new ArrayList<Banco>();
		
		bancosSeleccionados=this.getBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoBanco(bancosSeleccionados);
		
		this.generarReporteBancos("Todos",bancosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoBanco(ArrayList<Banco> bancosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Banco bancoAux:bancosSeleccionados) {
				bancoAux.setsDetalleGeneralEntityReporte(bancoAux.toString());
			
				if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					bancoAux.setsDescripcionGeneralEntityReporte1(bancoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					bancoAux.setsDescripcionGeneralEntityReporte1(bancoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					bancoAux.setsDescripcionGeneralEntityReporte1(bancoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_CODIGOINSTITUCION)) {
					existe=true;
					bancoAux.setsDescripcionGeneralEntityReporte1(bancoAux.getcodigo_institucion());
				}
				 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					bancoAux.setsDescripcionGeneralEntityReporte1(bancoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_IDTIPOBANCO)) {
					existe=true;
					bancoAux.setsDescripcionGeneralEntityReporte1(bancoAux.gettipobanco_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_DIASEFECTIVOLOCAL)) {
					existe=true;
					bancoAux.setsDescripcionGeneralEntityReporte1(bancoAux.getdias_efectivo_local().toString());
				}
				 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_DIASEFECTIVOEXTRANJERO)) {
					existe=true;
					bancoAux.setsDescripcionGeneralEntityReporte1(bancoAux.getdias_efectivo_extranjero().toString());
				}
				 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO)) {
					existe=true;
					bancoAux.setsDescripcionGeneralEntityReporte1(bancoAux.getcuentacontabledebito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO)) {
					existe=true;
					bancoAux.setsDescripcionGeneralEntityReporte1(bancoAux.getcuentacontablecredito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_DELIMITADOR)) {
					existe=true;
					bancoAux.setsDescripcionGeneralEntityReporte1(bancoAux.getdelimitador());
				}
				 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_IDFORMATO1)) {
					existe=true;
					bancoAux.setsDescripcionGeneralEntityReporte1(bancoAux.getformato1_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BancoConstantesFunciones.LABEL_IDFORMATO2)) {
					existe=true;
					bancoAux.setsDescripcionGeneralEntityReporte1(bancoAux.getformato2_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesBanco(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoBanco=true;
				this.isVisibilidadCeldaNuevoRelacionesBanco=true;
				this.isVisibilidadCeldaGuardarCambiosBanco=true;
			}
			
			this.isVisibilidadCeldaModificarBanco=false;
			this.isVisibilidadCeldaActualizarBanco=false;
			this.isVisibilidadCeldaEliminarBanco=false;
			this.isVisibilidadCeldaCancelarBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarBanco=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesBanco=false;
			this.isVisibilidadCeldaGuardarCambiosBanco=false;
			this.isVisibilidadCeldaModificarBanco=false;
			this.isVisibilidadCeldaActualizarBanco=true;
			this.isVisibilidadCeldaEliminarBanco=false;
			this.isVisibilidadCeldaCancelarBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarBanco=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesBanco=false;
			this.isVisibilidadCeldaGuardarCambiosBanco=false;
			this.isVisibilidadCeldaModificarBanco=false;
			this.isVisibilidadCeldaActualizarBanco=true;
			this.isVisibilidadCeldaEliminarBanco=true;
			this.isVisibilidadCeldaCancelarBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarBanco=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesBanco=false;
			this.isVisibilidadCeldaGuardarCambiosBanco=false;
			this.isVisibilidadCeldaModificarBanco=false;
			this.isVisibilidadCeldaActualizarBanco=true;
			this.isVisibilidadCeldaEliminarBanco=false;
			this.isVisibilidadCeldaCancelarBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarBanco=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesBanco=true;
			this.isVisibilidadCeldaGuardarCambiosBanco=true;
			this.isVisibilidadCeldaModificarBanco=false;
			this.isVisibilidadCeldaActualizarBanco=false;
			this.isVisibilidadCeldaEliminarBanco=false;
			this.isVisibilidadCeldaCancelarBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarBanco=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesBanco=false;
			this.isVisibilidadCeldaGuardarCambiosBanco=false;
			this.isVisibilidadCeldaActualizarBanco=false;
			this.isVisibilidadCeldaEliminarBanco=false;
			this.isVisibilidadCeldaCancelarBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarBanco=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesBanco=false;
			this.isVisibilidadCeldaGuardarCambiosBanco=false;
			this.isVisibilidadCeldaModificarBanco=true;
			this.isVisibilidadCeldaActualizarBanco=false;
			this.isVisibilidadCeldaEliminarBanco=false;
			this.isVisibilidadCeldaCancelarBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarBanco=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(BancoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesBanco=true;
			this.isVisibilidadCeldaGuardarCambiosBanco=true;
		} else {
			this.actualizarEstadoPanelsBanco(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarBanco=false;
			//this.isVisibilidadCeldaVerFormBanco=false;
			this.isVisibilidadCeldaDuplicarBanco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!bancoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesBanco=false;
		} else {
			this.isVisibilidadCeldaNuevoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosBanco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(bancoSessionBean.getEsGuardarRelacionado()) {
			if(!bancoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesBanco=false;												
			}
			
			this.jButtonCerrarBanco.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesBanco=false;
		}
		
		if(!this.permiteMantenimiento(this.banco)) {
			this.isVisibilidadCeldaActualizarBanco=false;
			this.isVisibilidadCeldaEliminarBanco=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesBanco() {
		this.isVisibilidadCeldaNuevoBanco=false;
		this.isVisibilidadCeldaGuardarCambiosBanco=false;
	}
	
	public void actualizarEstadoPanelsBanco(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionBanco!=null) {
				this.jScrollPanelDatosEdicionBanco.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBanco!=null) {
				this.jTabbedPaneBusquedasBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBanco!=null) {
				this.jScrollPanelDatosBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionBanco!=null) {
				this.jPanelPaginacionBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBanco!=null) {
				this.jPanelParametrosReportesBanco.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionBanco!=null) {
				this.jScrollPanelDatosEdicionBanco.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBanco!=null) {
				this.jTabbedPaneBusquedasBanco.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosBanco!=null) {
				this.jScrollPanelDatosBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionBanco!=null) {
				this.jPanelPaginacionBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBanco!=null) {
				this.jPanelParametrosReportesBanco.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionBanco!=null) {
				this.jScrollPanelDatosEdicionBanco.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBanco!=null) {
				this.jTabbedPaneBusquedasBanco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBanco!=null) {
				this.jScrollPanelDatosBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionBanco!=null) {
				this.jPanelPaginacionBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBanco!=null) {
				this.jPanelParametrosReportesBanco.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionBanco!=null) {
				this.jScrollPanelDatosEdicionBanco.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBanco!=null) {
				this.jTabbedPaneBusquedasBanco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBanco!=null) {
				this.jScrollPanelDatosBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionBanco!=null) {
				this.jPanelPaginacionBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBanco!=null) {
				this.jPanelParametrosReportesBanco.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionBanco!=null) {
				this.jScrollPanelDatosEdicionBanco.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBanco!=null) {
				this.jTabbedPaneBusquedasBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBanco!=null) {
				this.jScrollPanelDatosBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionBanco!=null) {
				this.jPanelPaginacionBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBanco!=null) {
				this.jPanelParametrosReportesBanco.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionBanco!=null) {
				this.jScrollPanelDatosEdicionBanco.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBanco!=null) {
				this.jTabbedPaneBusquedasBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBanco!=null) {
				this.jScrollPanelDatosBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionBanco!=null) {
				this.jPanelPaginacionBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBanco!=null) {
				this.jPanelParametrosReportesBanco.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionBanco!=null) {
				this.jScrollPanelDatosEdicionBanco.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBanco!=null) {
				this.jTabbedPaneBusquedasBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBanco!=null) {
				this.jScrollPanelDatosBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionBanco!=null) {
				this.jPanelPaginacionBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBanco!=null) {
				this.jPanelParametrosReportesBanco.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.bancoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasBanco!=null) {
					this.jTabbedPaneBusquedasBanco.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesBanco!=null) {
				this.jPanelParametrosReportesBanco.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.bancoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBanco!=null) {
				this.jTabbedPaneBusquedasBanco.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesBanco!=null) {
				this.jPanelParametrosReportesBanco.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorCodigoBanco);}

			this.isVisibilidadBusquedaPorCodigoInstitucion=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigoInstitucion) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorCodigoInstitucionBanco);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorNombreBanco);}

			this.isVisibilidadFK_IdTipoBanco=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoBanco) {this.jTabbedPaneBusquedasBanco.remove(jPanelFK_IdTipoBancoBanco);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorCodigo=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorCodigoBanco);}

			this.isVisibilidadBusquedaPorCodigoInstitucion=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorCodigoInstitucion) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorCodigoInstitucionBanco);}

			this.isVisibilidadBusquedaPorNombre=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorNombreBanco);}

			this.isVisibilidadFK_IdTipoBanco=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoBanco) {this.jTabbedPaneBusquedasBanco.remove(jPanelFK_IdTipoBancoBanco);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoBanco(Boolean isParaTipoBanco){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoBancoNegation=!isParaTipoBanco;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoBancoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorCodigoBanco);}

			this.isVisibilidadBusquedaPorCodigoInstitucion=isParaTipoBancoNegation;
			if(!this.isVisibilidadBusquedaPorCodigoInstitucion) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorCodigoInstitucionBanco);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoBancoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorNombreBanco);}

			this.isVisibilidadFK_IdTipoBanco=isParaTipoBanco;
			if(!this.isVisibilidadFK_IdTipoBanco) {this.jTabbedPaneBusquedasBanco.remove(jPanelFK_IdTipoBancoBanco);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableDebito(Boolean isParaCuentaContableDebito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableDebitoNegation=!isParaCuentaContableDebito;

			this.isVisibilidadBusquedaPorCodigo=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorCodigoBanco);}

			this.isVisibilidadBusquedaPorCodigoInstitucion=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadBusquedaPorCodigoInstitucion) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorCodigoInstitucionBanco);}

			this.isVisibilidadBusquedaPorNombre=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorNombreBanco);}

			this.isVisibilidadFK_IdTipoBanco=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadFK_IdTipoBanco) {this.jTabbedPaneBusquedasBanco.remove(jPanelFK_IdTipoBancoBanco);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableCredito(Boolean isParaCuentaContableCredito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableCreditoNegation=!isParaCuentaContableCredito;

			this.isVisibilidadBusquedaPorCodigo=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorCodigoBanco);}

			this.isVisibilidadBusquedaPorCodigoInstitucion=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadBusquedaPorCodigoInstitucion) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorCodigoInstitucionBanco);}

			this.isVisibilidadBusquedaPorNombre=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorNombreBanco);}

			this.isVisibilidadFK_IdTipoBanco=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdTipoBanco) {this.jTabbedPaneBusquedasBanco.remove(jPanelFK_IdTipoBancoBanco);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormato1(Boolean isParaFormato1){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormato1Negation=!isParaFormato1;

			this.isVisibilidadBusquedaPorCodigo=isParaFormato1Negation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorCodigoBanco);}

			this.isVisibilidadBusquedaPorCodigoInstitucion=isParaFormato1Negation;
			if(!this.isVisibilidadBusquedaPorCodigoInstitucion) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorCodigoInstitucionBanco);}

			this.isVisibilidadBusquedaPorNombre=isParaFormato1Negation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorNombreBanco);}

			this.isVisibilidadFK_IdTipoBanco=isParaFormato1Negation;
			if(!this.isVisibilidadFK_IdTipoBanco) {this.jTabbedPaneBusquedasBanco.remove(jPanelFK_IdTipoBancoBanco);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormato2(Boolean isParaFormato2){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormato2Negation=!isParaFormato2;

			this.isVisibilidadBusquedaPorCodigo=isParaFormato2Negation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorCodigoBanco);}

			this.isVisibilidadBusquedaPorCodigoInstitucion=isParaFormato2Negation;
			if(!this.isVisibilidadBusquedaPorCodigoInstitucion) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorCodigoInstitucionBanco);}

			this.isVisibilidadBusquedaPorNombre=isParaFormato2Negation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasBanco.remove(jPanelBusquedaPorNombreBanco);}

			this.isVisibilidadFK_IdTipoBanco=isParaFormato2Negation;
			if(!this.isVisibilidadFK_IdTipoBanco) {this.jTabbedPaneBusquedasBanco.remove(jPanelFK_IdTipoBancoBanco);}
		}
		
	}
	
	

	public String registrarSesionBancoParaCuentaBancoPunVenes() throws Exception {
		Boolean isPaginaPopupCuentaBancoPunVen=false;

		try {

			if(this.bancoSessionBean==null) {
				this.bancoSessionBean=new BancoSessionBean();
			}

			if(this.jInternalFrameDetalleFormBanco.cuentabancopunvenSessionBean==null) {
				this.jInternalFrameDetalleFormBanco.cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
			}

			this.jInternalFrameDetalleFormBanco.cuentabancopunvenSessionBean.setsPathNavegacionActual(bancoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormBanco.cuentabancopunvenSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCuentaBancoPunVen=this.jInternalFrameDetalleFormBanco.cuentabancopunvenSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormBanco.cuentabancopunvenSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaBancoPunVen(true);
			this.jInternalFrameDetalleFormBanco.cuentabancopunvenSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaBancoPunVen(BancoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormBanco.cuentabancopunvenSessionBean.setisBusquedaDesdeForeignKeySesionBanco(true);
			this.jInternalFrameDetalleFormBanco.cuentabancopunvenSessionBean.setlidBancoActual(this.idBancoActual);

			bancoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyBanco(true);
			bancoSessionBean.setlIdBancoActualForeignKey(this.idBancoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionBancoParaPoliticasClientes() throws Exception {
		Boolean isPaginaPopupPoliticasCliente=false;

		try {

			if(this.bancoSessionBean==null) {
				this.bancoSessionBean=new BancoSessionBean();
			}

			if(this.jInternalFrameDetalleFormBanco.politicasclienteSessionBean==null) {
				this.jInternalFrameDetalleFormBanco.politicasclienteSessionBean=new PoliticasClienteSessionBean();
			}

			this.jInternalFrameDetalleFormBanco.politicasclienteSessionBean.setsPathNavegacionActual(bancoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormBanco.politicasclienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPoliticasCliente=this.jInternalFrameDetalleFormBanco.politicasclienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormBanco.politicasclienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePoliticasCliente(true);
			this.jInternalFrameDetalleFormBanco.politicasclienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePoliticasCliente(BancoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormBanco.politicasclienteSessionBean.setisBusquedaDesdeForeignKeySesionBanco(true);
			this.jInternalFrameDetalleFormBanco.politicasclienteSessionBean.setlidBancoActual(this.idBancoActual);

			bancoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyBanco(true);
			bancoSessionBean.setlIdBancoActualForeignKey(this.idBancoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionBancoParaFormaPagoPuntoVentaes() throws Exception {
		Boolean isPaginaPopupFormaPagoPuntoVenta=false;

		try {

			if(this.bancoSessionBean==null) {
				this.bancoSessionBean=new BancoSessionBean();
			}

			if(this.jInternalFrameDetalleFormBanco.formapagopuntoventaSessionBean==null) {
				this.jInternalFrameDetalleFormBanco.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
			}

			this.jInternalFrameDetalleFormBanco.formapagopuntoventaSessionBean.setsPathNavegacionActual(bancoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormBanco.formapagopuntoventaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormaPagoPuntoVenta=this.jInternalFrameDetalleFormBanco.formapagopuntoventaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormBanco.formapagopuntoventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta(true);
			this.jInternalFrameDetalleFormBanco.formapagopuntoventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta(BancoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormBanco.formapagopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionBanco(true);
			this.jInternalFrameDetalleFormBanco.formapagopuntoventaSessionBean.setlidBancoActual(this.idBancoActual);

			bancoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyBanco(true);
			bancoSessionBean.setlIdBancoActualForeignKey(this.idBancoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionBancoParaTarjetaCreditos() throws Exception {
		Boolean isPaginaPopupTarjetaCredito=false;

		try {

			if(this.bancoSessionBean==null) {
				this.bancoSessionBean=new BancoSessionBean();
			}

			if(this.jInternalFrameDetalleFormBanco.tarjetacreditoSessionBean==null) {
				this.jInternalFrameDetalleFormBanco.tarjetacreditoSessionBean=new TarjetaCreditoSessionBean();
			}

			this.jInternalFrameDetalleFormBanco.tarjetacreditoSessionBean.setsPathNavegacionActual(bancoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormBanco.tarjetacreditoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTarjetaCredito=this.jInternalFrameDetalleFormBanco.tarjetacreditoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormBanco.tarjetacreditoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTarjetaCredito(true);
			this.jInternalFrameDetalleFormBanco.tarjetacreditoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetaCredito(BancoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormBanco.tarjetacreditoSessionBean.setisBusquedaDesdeForeignKeySesionBanco(true);
			this.jInternalFrameDetalleFormBanco.tarjetacreditoSessionBean.setlidBancoActual(this.idBancoActual);

			bancoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyBanco(true);
			bancoSessionBean.setlIdBancoActualForeignKey(this.idBancoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionBancoParaAutoriPagos() throws Exception {
		Boolean isPaginaPopupAutoriPago=false;

		try {

			if(this.bancoSessionBean==null) {
				this.bancoSessionBean=new BancoSessionBean();
			}

			if(this.jInternalFrameDetalleFormBanco.autoripagoSessionBean==null) {
				this.jInternalFrameDetalleFormBanco.autoripagoSessionBean=new AutoriPagoSessionBean();
			}

			this.jInternalFrameDetalleFormBanco.autoripagoSessionBean.setsPathNavegacionActual(bancoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AutoriPagoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormBanco.autoripagoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupAutoriPago=this.jInternalFrameDetalleFormBanco.autoripagoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormBanco.autoripagoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAutoriPago(true);
			this.jInternalFrameDetalleFormBanco.autoripagoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriPago(BancoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormBanco.autoripagoSessionBean.setisBusquedaDesdeForeignKeySesionBanco(true);
			this.jInternalFrameDetalleFormBanco.autoripagoSessionBean.setlidBancoActual(this.idBancoActual);

			bancoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyBanco(true);
			bancoSessionBean.setlIdBancoActualForeignKey(this.idBancoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionBancoParaTipoCuentaBancoGenerales() throws Exception {
		Boolean isPaginaPopupTipoCuentaBancoGeneral=false;

		try {

			if(this.bancoSessionBean==null) {
				this.bancoSessionBean=new BancoSessionBean();
			}

			if(this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralSessionBean==null) {
				this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
			}

			this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralSessionBean.setsPathNavegacionActual(bancoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral(true);
			this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral(BancoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralSessionBean.setisBusquedaDesdeForeignKeySesionBanco(true);
			this.jInternalFrameDetalleFormBanco.tipocuentabancogeneralSessionBean.setlidBancoActual(this.idBancoActual);

			bancoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyBanco(true);
			bancoSessionBean.setlIdBancoActualForeignKey(this.idBancoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionBancoParaCuentaBancos() throws Exception {
		Boolean isPaginaPopupCuentaBanco=false;

		try {

			if(this.bancoSessionBean==null) {
				this.bancoSessionBean=new BancoSessionBean();
			}

			if(this.jInternalFrameDetalleFormBanco.cuentabancoSessionBean==null) {
				this.jInternalFrameDetalleFormBanco.cuentabancoSessionBean=new CuentaBancoSessionBean();
			}

			this.jInternalFrameDetalleFormBanco.cuentabancoSessionBean.setsPathNavegacionActual(bancoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaBancoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormBanco.cuentabancoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCuentaBanco=this.jInternalFrameDetalleFormBanco.cuentabancoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormBanco.cuentabancoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaBanco(true);
			this.jInternalFrameDetalleFormBanco.cuentabancoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaBanco(BancoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormBanco.cuentabancoSessionBean.setisBusquedaDesdeForeignKeySesionBanco(true);
			this.jInternalFrameDetalleFormBanco.cuentabancoSessionBean.setlidBancoActual(this.idBancoActual);

			bancoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyBanco(true);
			bancoSessionBean.setlIdBancoActualForeignKey(this.idBancoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//BancoSessionBean bancoSessionBean=new BancoSessionBean();
		
		if(this.bancoSessionBean==null) {
			this.bancoSessionBean=new BancoSessionBean();
		}
		
		this.bancoSessionBean.setsUltimaBusquedaBanco(this.getsAccionBusqueda());
		this.bancoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.bancoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			bancoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigoInstitucion")) {
			bancoSessionBean.setcodigo_institucion(this.getcodigo_institucionBusquedaPorCodigoInstitucion());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			bancoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			bancoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			bancoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoBanco")) {
			bancoSessionBean.setid_tipo_banco(this.getid_tipo_bancoFK_IdTipoBanco());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//BancoSessionBean bancoSessionBean=new BancoSessionBean();
		
		if(this.bancoSessionBean==null) {
			this.bancoSessionBean=new BancoSessionBean();
		}
		
		if(this.bancoSessionBean.getsUltimaBusquedaBanco()!=null&&!this.bancoSessionBean.getsUltimaBusquedaBanco().equals("")) {
			this.setsAccionBusqueda(bancoSessionBean.getsUltimaBusquedaBanco());
			this.setiNumeroPaginacion(bancoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(bancoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(bancoSessionBean.getcodigo());
				bancoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigoInstitucion")) {
				this.setcodigo_institucionBusquedaPorCodigoInstitucion(bancoSessionBean.getcodigo_institucion());
				bancoSessionBean.setcodigo_institucion("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(bancoSessionBean.getnombre());
				bancoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(bancoSessionBean.getid_empresa());
				bancoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(bancoSessionBean.getid_sucursal());
				bancoSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoBanco")) {
				this.setid_tipo_bancoFK_IdTipoBanco(bancoSessionBean.getid_tipo_banco());
				bancoSessionBean.setid_tipo_banco(-1L);
			}
		}
		
		this.bancoSessionBean.setsUltimaBusquedaBanco("");
		this.bancoSessionBean.setiNumeroPaginacion(BancoConstantesFunciones.INUMEROPAGINACION);
		this.bancoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaBanco(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioBanco() {
		this.updateBorderResaltarBusquedasFormularioBanco();
		this.updateVisibilidadBusquedasFormularioBanco();
		this.updateHabilitarBusquedasFormularioBanco();
	}
	
	public void updateBorderResaltarBusquedasFormularioBanco() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasBanco.getComponents().length>0) {
	

		if(this.bancoConstantesFunciones.resaltarBusquedaPorCodigoBanco!=null) {
			index= this.jTabbedPaneBusquedasBanco.indexOfComponent(this.jPanelBusquedaPorCodigoBanco);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBanco.getComponent(index);
				jPanel.setBorder(this.bancoConstantesFunciones.resaltarBusquedaPorCodigoBanco);
			}
		}

		if(this.bancoConstantesFunciones.resaltarBusquedaPorCodigoInstitucionBanco!=null) {
			index= this.jTabbedPaneBusquedasBanco.indexOfComponent(this.jPanelBusquedaPorCodigoInstitucionBanco);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBanco.getComponent(index);
				jPanel.setBorder(this.bancoConstantesFunciones.resaltarBusquedaPorCodigoInstitucionBanco);
			}
		}

		if(this.bancoConstantesFunciones.resaltarBusquedaPorNombreBanco!=null) {
			index= this.jTabbedPaneBusquedasBanco.indexOfComponent(this.jPanelBusquedaPorNombreBanco);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBanco.getComponent(index);
				jPanel.setBorder(this.bancoConstantesFunciones.resaltarBusquedaPorNombreBanco);
			}
		}

		if(this.bancoConstantesFunciones.resaltarFK_IdTipoBancoBanco!=null) {
			index= this.jTabbedPaneBusquedasBanco.indexOfComponent(this.jPanelFK_IdTipoBancoBanco);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBanco.getComponent(index);
				jPanel.setBorder(this.bancoConstantesFunciones.resaltarFK_IdTipoBancoBanco);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioBanco() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasBanco.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBanco.indexOfComponent(this.jPanelBusquedaPorCodigoBanco);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBanco.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.bancoConstantesFunciones.mostrarBusquedaPorCodigoBanco);
			if(!this.bancoConstantesFunciones.mostrarBusquedaPorCodigoBanco && index>-1) {
				this.jTabbedPaneBusquedasBanco.remove(index);
			}

			index= this.jTabbedPaneBusquedasBanco.indexOfComponent(this.jPanelBusquedaPorCodigoInstitucionBanco);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBanco.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.bancoConstantesFunciones.mostrarBusquedaPorCodigoInstitucionBanco);
			if(!this.bancoConstantesFunciones.mostrarBusquedaPorCodigoInstitucionBanco && index>-1) {
				this.jTabbedPaneBusquedasBanco.remove(index);
			}

			index= this.jTabbedPaneBusquedasBanco.indexOfComponent(this.jPanelBusquedaPorNombreBanco);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBanco.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.bancoConstantesFunciones.mostrarBusquedaPorNombreBanco);
			if(!this.bancoConstantesFunciones.mostrarBusquedaPorNombreBanco && index>-1) {
				this.jTabbedPaneBusquedasBanco.remove(index);
			}

			index= this.jTabbedPaneBusquedasBanco.indexOfComponent(this.jPanelFK_IdTipoBancoBanco);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBanco.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.bancoConstantesFunciones.mostrarFK_IdTipoBancoBanco);
			if(!this.bancoConstantesFunciones.mostrarFK_IdTipoBancoBanco && index>-1) {
				this.jTabbedPaneBusquedasBanco.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioBanco() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasBanco.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBanco.indexOfComponent(this.jPanelBusquedaPorCodigoBanco);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBanco.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.bancoConstantesFunciones.activarBusquedaPorCodigoBanco);
				this.jTabbedPaneBusquedasBanco.setEnabledAt(index,this.bancoConstantesFunciones.activarBusquedaPorCodigoBanco);
			}

			index= this.jTabbedPaneBusquedasBanco.indexOfComponent(this.jPanelBusquedaPorCodigoInstitucionBanco);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBanco.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.bancoConstantesFunciones.activarBusquedaPorCodigoInstitucionBanco);
				this.jTabbedPaneBusquedasBanco.setEnabledAt(index,this.bancoConstantesFunciones.activarBusquedaPorCodigoInstitucionBanco);
			}

			index= this.jTabbedPaneBusquedasBanco.indexOfComponent(this.jPanelBusquedaPorNombreBanco);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBanco.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.bancoConstantesFunciones.activarBusquedaPorNombreBanco);
				this.jTabbedPaneBusquedasBanco.setEnabledAt(index,this.bancoConstantesFunciones.activarBusquedaPorNombreBanco);
			}

			index= this.jTabbedPaneBusquedasBanco.indexOfComponent(this.jPanelFK_IdTipoBancoBanco);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBanco.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.bancoConstantesFunciones.activarFK_IdTipoBancoBanco);
				this.jTabbedPaneBusquedasBanco.setEnabledAt(index,this.bancoConstantesFunciones.activarFK_IdTipoBancoBanco);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaBanco(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasBanco.indexOfComponent(this.jPanelBusquedaPorCodigoBanco);

			this.jTabbedPaneBusquedasBanco.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBanco.getComponent(index);

			this.bancoConstantesFunciones.setResaltarBusquedaPorCodigoBanco(resaltar);

			jPanel.setBorder(this.bancoConstantesFunciones.resaltarBusquedaPorCodigoBanco);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorCodigoInstitucion")) {
			index= this.jTabbedPaneBusquedasBanco.indexOfComponent(this.jPanelBusquedaPorCodigoInstitucionBanco);

			this.jTabbedPaneBusquedasBanco.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBanco.getComponent(index);

			this.bancoConstantesFunciones.setResaltarBusquedaPorCodigoInstitucionBanco(resaltar);

			jPanel.setBorder(this.bancoConstantesFunciones.resaltarBusquedaPorCodigoInstitucionBanco);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasBanco.indexOfComponent(this.jPanelBusquedaPorNombreBanco);

			this.jTabbedPaneBusquedasBanco.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBanco.getComponent(index);

			this.bancoConstantesFunciones.setResaltarBusquedaPorNombreBanco(resaltar);

			jPanel.setBorder(this.bancoConstantesFunciones.resaltarBusquedaPorNombreBanco);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoBanco")) {
			index= this.jTabbedPaneBusquedasBanco.indexOfComponent(this.jPanelFK_IdTipoBancoBanco);

			this.jTabbedPaneBusquedasBanco.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBanco.getComponent(index);

			this.bancoConstantesFunciones.setResaltarFK_IdTipoBancoBanco(resaltar);

			jPanel.setBorder(this.bancoConstantesFunciones.resaltarFK_IdTipoBancoBanco);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarBanco.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioBanco() throws Exception {

		if(this.jInternalFrameDetalleFormBanco==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioBanco();
		this.updateVisibilidadResaltarControlesFormularioBanco();
		this.updateHabilitarResaltarControlesFormularioBanco();
		
	}
	
	public void updateBorderResaltarControlesFormularioBanco() throws Exception {
		if(this.jInternalFrameDetalleFormBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.bancoConstantesFunciones.resaltaridBanco!=null && this.jInternalFrameDetalleFormBanco!=null) {this.jInternalFrameDetalleFormBanco.jLabelidBanco.setBorder(this.bancoConstantesFunciones.resaltaridBanco);}
		if(this.bancoConstantesFunciones.resaltarid_empresaBanco!=null && this.jInternalFrameDetalleFormBanco!=null) {this.jInternalFrameDetalleFormBanco.jComboBoxid_empresaBanco.setBorder(this.bancoConstantesFunciones.resaltarid_empresaBanco);}
		if(this.bancoConstantesFunciones.resaltarid_sucursalBanco!=null && this.jInternalFrameDetalleFormBanco!=null) {this.jInternalFrameDetalleFormBanco.jComboBoxid_sucursalBanco.setBorder(this.bancoConstantesFunciones.resaltarid_sucursalBanco);}
		if(this.bancoConstantesFunciones.resaltarcodigoBanco!=null && this.jInternalFrameDetalleFormBanco!=null) {this.jInternalFrameDetalleFormBanco.jTextAreacodigoBanco.setBorder(this.bancoConstantesFunciones.resaltarcodigoBanco);}
		if(this.bancoConstantesFunciones.resaltarcodigo_institucionBanco!=null && this.jInternalFrameDetalleFormBanco!=null) {this.jInternalFrameDetalleFormBanco.jTextFieldcodigo_institucionBanco.setBorder(this.bancoConstantesFunciones.resaltarcodigo_institucionBanco);}
		if(this.bancoConstantesFunciones.resaltarnombreBanco!=null && this.jInternalFrameDetalleFormBanco!=null) {this.jInternalFrameDetalleFormBanco.jTextAreanombreBanco.setBorder(this.bancoConstantesFunciones.resaltarnombreBanco);}
		if(this.bancoConstantesFunciones.resaltarid_tipo_bancoBanco!=null && this.jInternalFrameDetalleFormBanco!=null) {this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.setBorder(this.bancoConstantesFunciones.resaltarid_tipo_bancoBanco);}
		if(this.bancoConstantesFunciones.resaltardias_efectivo_localBanco!=null && this.jInternalFrameDetalleFormBanco!=null) {this.jInternalFrameDetalleFormBanco.jTextFielddias_efectivo_localBanco.setBorder(this.bancoConstantesFunciones.resaltardias_efectivo_localBanco);}
		if(this.bancoConstantesFunciones.resaltardias_efectivo_extranjeroBanco!=null && this.jInternalFrameDetalleFormBanco!=null) {this.jInternalFrameDetalleFormBanco.jTextFielddias_efectivo_extranjeroBanco.setBorder(this.bancoConstantesFunciones.resaltardias_efectivo_extranjeroBanco);}
		if(this.bancoConstantesFunciones.resaltarid_cuenta_contable_debitoBanco!=null && this.jInternalFrameDetalleFormBanco!=null) {this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_debitoBanco.setBorder(this.bancoConstantesFunciones.resaltarid_cuenta_contable_debitoBanco);}
		if(this.bancoConstantesFunciones.resaltarid_cuenta_contable_creditoBanco!=null && this.jInternalFrameDetalleFormBanco!=null) {this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_creditoBanco.setBorder(this.bancoConstantesFunciones.resaltarid_cuenta_contable_creditoBanco);}
		if(this.bancoConstantesFunciones.resaltardelimitadorBanco!=null && this.jInternalFrameDetalleFormBanco!=null) {this.jInternalFrameDetalleFormBanco.jTextFielddelimitadorBanco.setBorder(this.bancoConstantesFunciones.resaltardelimitadorBanco);}
		if(this.bancoConstantesFunciones.resaltarid_formato1Banco!=null && this.jInternalFrameDetalleFormBanco!=null) {this.jInternalFrameDetalleFormBanco.jComboBoxid_formato1Banco.setBorder(this.bancoConstantesFunciones.resaltarid_formato1Banco);}
		if(this.bancoConstantesFunciones.resaltarid_formato2Banco!=null && this.jInternalFrameDetalleFormBanco!=null) {this.jInternalFrameDetalleFormBanco.jComboBoxid_formato2Banco.setBorder(this.bancoConstantesFunciones.resaltarid_formato2Banco);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioBanco() throws Exception {		
		if(this.jInternalFrameDetalleFormBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBanco!=null) {
	
		//this.jInternalFrameDetalleFormBanco.jLabelidBanco.setVisible(this.bancoConstantesFunciones.mostraridBanco);
		this.jInternalFrameDetalleFormBanco.jPanelidBanco.setVisible(this.bancoConstantesFunciones.mostraridBanco);
		//this.jInternalFrameDetalleFormBanco.jComboBoxid_empresaBanco.setVisible(this.bancoConstantesFunciones.mostrarid_empresaBanco);
		this.jInternalFrameDetalleFormBanco.jPanelid_empresaBanco.setVisible(this.bancoConstantesFunciones.mostrarid_empresaBanco);
		//this.jInternalFrameDetalleFormBanco.jComboBoxid_sucursalBanco.setVisible(this.bancoConstantesFunciones.mostrarid_sucursalBanco);
		this.jInternalFrameDetalleFormBanco.jPanelid_sucursalBanco.setVisible(this.bancoConstantesFunciones.mostrarid_sucursalBanco);
		//this.jInternalFrameDetalleFormBanco.jTextAreacodigoBanco.setVisible(this.bancoConstantesFunciones.mostrarcodigoBanco);
		this.jInternalFrameDetalleFormBanco.jPanelcodigoBanco.setVisible(this.bancoConstantesFunciones.mostrarcodigoBanco);
		//this.jInternalFrameDetalleFormBanco.jTextFieldcodigo_institucionBanco.setVisible(this.bancoConstantesFunciones.mostrarcodigo_institucionBanco);
		this.jInternalFrameDetalleFormBanco.jPanelcodigo_institucionBanco.setVisible(this.bancoConstantesFunciones.mostrarcodigo_institucionBanco);
		//this.jInternalFrameDetalleFormBanco.jTextAreanombreBanco.setVisible(this.bancoConstantesFunciones.mostrarnombreBanco);
		this.jInternalFrameDetalleFormBanco.jPanelnombreBanco.setVisible(this.bancoConstantesFunciones.mostrarnombreBanco);
		//this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.setVisible(this.bancoConstantesFunciones.mostrarid_tipo_bancoBanco);
		this.jInternalFrameDetalleFormBanco.jPanelid_tipo_bancoBanco.setVisible(this.bancoConstantesFunciones.mostrarid_tipo_bancoBanco);
		//this.jInternalFrameDetalleFormBanco.jTextFielddias_efectivo_localBanco.setVisible(this.bancoConstantesFunciones.mostrardias_efectivo_localBanco);
		this.jInternalFrameDetalleFormBanco.jPaneldias_efectivo_localBanco.setVisible(this.bancoConstantesFunciones.mostrardias_efectivo_localBanco);
		//this.jInternalFrameDetalleFormBanco.jTextFielddias_efectivo_extranjeroBanco.setVisible(this.bancoConstantesFunciones.mostrardias_efectivo_extranjeroBanco);
		this.jInternalFrameDetalleFormBanco.jPaneldias_efectivo_extranjeroBanco.setVisible(this.bancoConstantesFunciones.mostrardias_efectivo_extranjeroBanco);
		//this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_debitoBanco.setVisible(this.bancoConstantesFunciones.mostrarid_cuenta_contable_debitoBanco);
		this.jInternalFrameDetalleFormBanco.jPanelid_cuenta_contable_debitoBanco.setVisible(this.bancoConstantesFunciones.mostrarid_cuenta_contable_debitoBanco);
		//this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_creditoBanco.setVisible(this.bancoConstantesFunciones.mostrarid_cuenta_contable_creditoBanco);
		this.jInternalFrameDetalleFormBanco.jPanelid_cuenta_contable_creditoBanco.setVisible(this.bancoConstantesFunciones.mostrarid_cuenta_contable_creditoBanco);
		//this.jInternalFrameDetalleFormBanco.jTextFielddelimitadorBanco.setVisible(this.bancoConstantesFunciones.mostrardelimitadorBanco);
		this.jInternalFrameDetalleFormBanco.jPaneldelimitadorBanco.setVisible(this.bancoConstantesFunciones.mostrardelimitadorBanco);
		//this.jInternalFrameDetalleFormBanco.jComboBoxid_formato1Banco.setVisible(this.bancoConstantesFunciones.mostrarid_formato1Banco);
		this.jInternalFrameDetalleFormBanco.jPanelid_formato1Banco.setVisible(this.bancoConstantesFunciones.mostrarid_formato1Banco);
		//this.jInternalFrameDetalleFormBanco.jComboBoxid_formato2Banco.setVisible(this.bancoConstantesFunciones.mostrarid_formato2Banco);
		this.jInternalFrameDetalleFormBanco.jPanelid_formato2Banco.setVisible(this.bancoConstantesFunciones.mostrarid_formato2Banco);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioBanco() throws Exception {
		if(this.jInternalFrameDetalleFormBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBanco!=null) {
	
		this.jInternalFrameDetalleFormBanco.jLabelidBanco.setEnabled(this.bancoConstantesFunciones.activaridBanco);
		this.jInternalFrameDetalleFormBanco.jComboBoxid_empresaBanco.setEnabled(this.bancoConstantesFunciones.activarid_empresaBanco);
		this.jInternalFrameDetalleFormBanco.jComboBoxid_sucursalBanco.setEnabled(this.bancoConstantesFunciones.activarid_sucursalBanco);
		this.jInternalFrameDetalleFormBanco.jTextAreacodigoBanco.setEnabled(this.bancoConstantesFunciones.activarcodigoBanco);
		this.jInternalFrameDetalleFormBanco.jTextFieldcodigo_institucionBanco.setEnabled(this.bancoConstantesFunciones.activarcodigo_institucionBanco);
		this.jInternalFrameDetalleFormBanco.jTextAreanombreBanco.setEnabled(this.bancoConstantesFunciones.activarnombreBanco);
		this.jInternalFrameDetalleFormBanco.jComboBoxid_tipo_bancoBanco.setEnabled(this.bancoConstantesFunciones.activarid_tipo_bancoBanco);
		this.jInternalFrameDetalleFormBanco.jTextFielddias_efectivo_localBanco.setEnabled(this.bancoConstantesFunciones.activardias_efectivo_localBanco);
		this.jInternalFrameDetalleFormBanco.jTextFielddias_efectivo_extranjeroBanco.setEnabled(this.bancoConstantesFunciones.activardias_efectivo_extranjeroBanco);
		this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_debitoBanco.setEnabled(this.bancoConstantesFunciones.activarid_cuenta_contable_debitoBanco);
		this.jInternalFrameDetalleFormBanco.jComboBoxid_cuenta_contable_creditoBanco.setEnabled(this.bancoConstantesFunciones.activarid_cuenta_contable_creditoBanco);
		this.jInternalFrameDetalleFormBanco.jTextFielddelimitadorBanco.setEnabled(this.bancoConstantesFunciones.activardelimitadorBanco);
		this.jInternalFrameDetalleFormBanco.jComboBoxid_formato1Banco.setEnabled(this.bancoConstantesFunciones.activarid_formato1Banco);
		this.jInternalFrameDetalleFormBanco.jComboBoxid_formato2Banco.setEnabled(this.bancoConstantesFunciones.activarid_formato2Banco);
		}
	}
	
		
}