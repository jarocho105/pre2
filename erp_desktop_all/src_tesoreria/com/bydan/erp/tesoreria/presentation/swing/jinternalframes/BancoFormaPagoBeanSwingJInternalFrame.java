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

import com.bydan.erp.tesoreria.util.BancoFormaPagoConstantesFunciones;
import com.bydan.erp.tesoreria.util.BancoFormaPagoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.BancoFormaPagoParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.BancoFormaPagoBean;
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
import com.bydan.erp.facturacion.business.logic.*;

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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class BancoFormaPagoBeanSwingJInternalFrame extends BancoFormaPagoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(BancoFormaPagoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<BancoFormaPago> bancoformapagoValidator = new ClassValidator<BancoFormaPago>(BancoFormaPago.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public BancoFormaPago bancoformapago;	
	public BancoFormaPago bancoformapagoAux;
	public BancoFormaPago bancoformapagoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public BancoFormaPago bancoformapagoTotales;
	public Long idBancoFormaPagoActual;
	public Long iIdNuevoBancoFormaPago=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
	}

	public String sFinalQueryComboFactura="";

	public List<Factura> facturasForeignKey;

	public List<Factura> getfacturasForeignKey() {
		return facturasForeignKey;
	}

	public void setfacturasForeignKey(List<Factura> facturasForeignKey) {
		this.facturasForeignKey = facturasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Factura facturaForeignKey;

	public Factura getfacturaForeignKey() {
		return facturaForeignKey;
	}

	public void setfacturaForeignKey(Factura facturaForeignKey) {
		this.facturaForeignKey = facturaForeignKey;
	}

	public String sFinalQueryComboDetaFormaPago="";

	public List<DetaFormaPago> detaformapagosForeignKey;

	public List<DetaFormaPago> getdetaformapagosForeignKey() {
		return detaformapagosForeignKey;
	}

	public void setdetaformapagosForeignKey(List<DetaFormaPago> detaformapagosForeignKey) {
		this.detaformapagosForeignKey = detaformapagosForeignKey;
	}

	//OBJETO FK ACTUAL
	public DetaFormaPago detaformapagoForeignKey;

	public DetaFormaPago getdetaformapagoForeignKey() {
		return detaformapagoForeignKey;
	}

	public void setdetaformapagoForeignKey(DetaFormaPago detaformapagoForeignKey) {
		this.detaformapagoForeignKey = detaformapagoForeignKey;
	}

	public String sFinalQueryComboTipoBancoFormaPago="";

	public List<TipoBancoFormaPago> tipobancoformapagosForeignKey;

	public List<TipoBancoFormaPago> gettipobancoformapagosForeignKey() {
		return tipobancoformapagosForeignKey;
	}

	public void settipobancoformapagosForeignKey(List<TipoBancoFormaPago> tipobancoformapagosForeignKey) {
		this.tipobancoformapagosForeignKey = tipobancoformapagosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoBancoFormaPago tipobancoformapagoForeignKey;

	public TipoBancoFormaPago gettipobancoformapagoForeignKey() {
		return tipobancoformapagoForeignKey;
	}

	public void settipobancoformapagoForeignKey(TipoBancoFormaPago tipobancoformapagoForeignKey) {
		this.tipobancoformapagoForeignKey = tipobancoformapagoForeignKey;
	}

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
	}

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idFacturaActual=0L;

	public Long getidFacturaActual() {
		return idFacturaActual;
	}

	public void setidFacturaActual(Long idFacturaActual) {
		this.idFacturaActual= idFacturaActual;
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
	
	public Boolean isPermisoTodoBancoFormaPago;
	public Boolean isPermisoNuevoBancoFormaPago;
	public Boolean isPermisoActualizarBancoFormaPago;
	public Boolean isPermisoActualizarOriginalBancoFormaPago;
	public Boolean isPermisoEliminarBancoFormaPago;
	public Boolean isPermisoGuardarCambiosBancoFormaPago;
	public Boolean isPermisoConsultaBancoFormaPago;
	public Boolean isPermisoBusquedaBancoFormaPago;
	public Boolean isPermisoReporteBancoFormaPago;
	public Boolean isPermisoPaginacionMedioBancoFormaPago;
	public Boolean isPermisoPaginacionAltoBancoFormaPago;
	public Boolean isPermisoPaginacionTodoBancoFormaPago;
	public Boolean isPermisoCopiarBancoFormaPago;
	public Boolean isPermisoVerFormBancoFormaPago;
	public Boolean isPermisoDuplicarBancoFormaPago;
	public Boolean isPermisoOrdenBancoFormaPago;
	
	
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
	
	public BancoFormaPagoParameterReturnGeneral bancoformapagoReturnGeneral;
	public BancoFormaPagoParameterReturnGeneral bancoformapagoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoBancoFormaPago=false;
	public Boolean esParaAccionDesdeFormularioBancoFormaPago=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected BancoFormaPagoSessionBeanAdditional bancoformapagoSessionBeanAdditional=null;
	
	public BancoFormaPagoSessionBeanAdditional getBancoFormaPagoSessionBeanAdditional() {
		return this.bancoformapagoSessionBeanAdditional;
	}
	
	public void setBancoFormaPagoSessionBeanAdditional(BancoFormaPagoSessionBeanAdditional bancoformapagoSessionBeanAdditional) {
		try {
			this.bancoformapagoSessionBeanAdditional=bancoformapagoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected BancoFormaPagoBeanSwingJInternalFrameAdditional bancoformapagoBeanSwingJInternalFrameAdditional=null;
	//public class BancoFormaPagoBeanSwingJInternalFrame
	
	public BancoFormaPagoBeanSwingJInternalFrameAdditional getBancoFormaPagoBeanSwingJInternalFrameAdditional() {
		return this.bancoformapagoBeanSwingJInternalFrameAdditional;
	}
	
	public void setBancoFormaPagoBeanSwingJInternalFrameAdditional(BancoFormaPagoBeanSwingJInternalFrameAdditional bancoformapagoBeanSwingJInternalFrameAdditional) {
		try {
			this.bancoformapagoBeanSwingJInternalFrameAdditional=bancoformapagoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public BancoFormaPagoLogic bancoformapagoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public BancoFormaPago bancoformapagoBean;
	public BancoFormaPagoConstantesFunciones bancoformapagoConstantesFunciones;
	//public BancoFormaPagoParameterReturnGeneral bancoformapagoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public FacturaLogic facturaLogic;
	public DetaFormaPagoLogic detaformapagoLogic;
	public TipoBancoFormaPagoLogic tipobancoformapagoLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<BancoFormaPago> bancoformapagos;	
	//public List<BancoFormaPago> bancoformapagosEliminados;
	//public List<BancoFormaPago> bancoformapagosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoBancoFormaPago=false;
	public Boolean isVisibilidadCeldaDuplicarBancoFormaPago=true;
	public Boolean isVisibilidadCeldaCopiarBancoFormaPago=true;
	public Boolean isVisibilidadCeldaVerFormBancoFormaPago=true;
	public Boolean isVisibilidadCeldaOrdenBancoFormaPago=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesBancoFormaPago=false;
	public Boolean isVisibilidadCeldaModificarBancoFormaPago=false;
	public Boolean isVisibilidadCeldaActualizarBancoFormaPago=false;
	public Boolean isVisibilidadCeldaEliminarBancoFormaPago=false;
	public Boolean isVisibilidadCeldaCancelarBancoFormaPago=false;
	public Boolean isVisibilidadCeldaGuardarBancoFormaPago=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosBancoFormaPago=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdBancoFormaPago=false;
	public Boolean isVisibilidadFK_IdDetaFormaPago=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFactura=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoBancoFormaPago() {
		return this.iIdNuevoBancoFormaPago;
	}

	public void setiIdNuevoBancoFormaPago(Long iIdNuevoBancoFormaPago) {
		this.iIdNuevoBancoFormaPago = iIdNuevoBancoFormaPago;
	}
	
	public Long getidBancoFormaPagoActual() {
		return this.idBancoFormaPagoActual;
	}

	public void setidBancoFormaPagoActual(Long idBancoFormaPagoActual) {
		this.idBancoFormaPagoActual = idBancoFormaPagoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public BancoFormaPago getbancoformapago() {
		return this.bancoformapago;
	}

	public void setbancoformapago(BancoFormaPago bancoformapago) {
		this.bancoformapago = bancoformapago;
	}
	
	public BancoFormaPago getbancoformapagoAux() {
		return this.bancoformapagoAux;
	}

	public void setbancoformapagoAux(BancoFormaPago bancoformapagoAux) {
		this.bancoformapagoAux = bancoformapagoAux;
	}				
	
	public BancoFormaPago getbancoformapagoAnterior() {
		return this.bancoformapagoAnterior;
	}

	public void setbancoformapagoAnterior(BancoFormaPago bancoformapagoAnterior) {
		this.bancoformapagoAnterior = bancoformapagoAnterior;
	}	
	
	public BancoFormaPago getbancoformapagoTotales() {
		return this.bancoformapagoTotales;
	}

	public void setbancoformapagoTotales(BancoFormaPago bancoformapagoTotales) {
		this.bancoformapagoTotales = bancoformapagoTotales;
	}	
	
	public BancoFormaPago getbancoformapagoBean() {
		return this.bancoformapagoBean;
	}

	public void setbancoformapagoBean(BancoFormaPago bancoformapagoBean) {
		this.bancoformapagoBean = bancoformapagoBean;
	}	
	
	public BancoFormaPagoParameterReturnGeneral getbancoformapagoReturnGeneral() {
		return this.bancoformapagoReturnGeneral;
	}

	public void setbancoformapagoReturnGeneral(BancoFormaPagoParameterReturnGeneral bancoformapagoReturnGeneral) {
		this.bancoformapagoReturnGeneral = bancoformapagoReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_tipo_banco_forma_pagoFK_IdBancoFormaPago=-1L;

	public Long getid_tipo_banco_forma_pagoFK_IdBancoFormaPago() {
		return this.id_tipo_banco_forma_pagoFK_IdBancoFormaPago;
	}

	public void setid_tipo_banco_forma_pagoFK_IdBancoFormaPago(Long id_tipo_banco_forma_pagoFK_IdBancoFormaPago) {
		this.id_tipo_banco_forma_pagoFK_IdBancoFormaPago = id_tipo_banco_forma_pagoFK_IdBancoFormaPago;
	}

	public Long id_deta_forma_pagoFK_IdDetaFormaPago=-1L;

	public Long getid_deta_forma_pagoFK_IdDetaFormaPago() {
		return this.id_deta_forma_pagoFK_IdDetaFormaPago;
	}

	public void setid_deta_forma_pagoFK_IdDetaFormaPago(Long id_deta_forma_pagoFK_IdDetaFormaPago) {
		this.id_deta_forma_pagoFK_IdDetaFormaPago = id_deta_forma_pagoFK_IdDetaFormaPago;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_facturaFK_IdFactura=-1L;

	public Long getid_facturaFK_IdFactura() {
		return this.id_facturaFK_IdFactura;
	}

	public void setid_facturaFK_IdFactura(Long id_facturaFK_IdFactura) {
		this.id_facturaFK_IdFactura = id_facturaFK_IdFactura;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public BancoFormaPagoLogic getBancoFormaPagoLogic()	{		
		return bancoformapagoLogic;
	}

	public void setBancoFormaPagoLogic(BancoFormaPagoLogic bancoformapagoLogic) {
		this.bancoformapagoLogic = bancoformapagoLogic;
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
	
	public Boolean getIsEsNuevoBancoFormaPago() {
		return isEsNuevoBancoFormaPago;
	}

	public void setIsEsNuevoBancoFormaPago(Boolean isEsNuevoBancoFormaPago) {
		this.isEsNuevoBancoFormaPago = isEsNuevoBancoFormaPago;
	}

	public Boolean getEsParaAccionDesdeFormularioBancoFormaPago() {
		return esParaAccionDesdeFormularioBancoFormaPago;
	}
	
	public void setEsParaAccionDesdeFormularioBancoFormaPago(Boolean esParaAccionDesdeFormularioBancoFormaPago) {
		this.esParaAccionDesdeFormularioBancoFormaPago = esParaAccionDesdeFormularioBancoFormaPago;
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

			if(this.bancoformapagoSessionBean==null) {
				this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
			}

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(bancoformapagoSessionBean.getlidEmpresaActual());
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

			if(this.bancoformapagoSessionBean==null) {
				this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
			}

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(bancoformapagoSessionBean.getlidSucursalActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.bancoformapagoSessionBean==null) {
				this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
			}

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(bancoformapagoSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.bancoformapagoSessionBean==null) {
				this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
			}

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(bancoformapagoSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

	public void cargarCombosFacturasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.facturasForeignKey=new ArrayList<Factura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FacturaLogic facturaLogic=new FacturaLogic();

			//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

			if(this.bancoformapagoSessionBean==null) {
				this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
			}

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

					facturaLogic.getTodosFacturasWithConnection(sFinalQuery,new Pagination());

					this.facturasForeignKey=facturaLogic.getFacturas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFactura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getEntityWithConnection(bancoformapagoSessionBean.getlidFacturaActual());
					this.facturasForeignKey.add(facturaLogic.getFactura());
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

	public void cargarCombosDetaFormaPagosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.detaformapagosForeignKey=new ArrayList<DetaFormaPago>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DetaFormaPagoLogic detaformapagoLogic=new DetaFormaPagoLogic();

			//detaformapagoLogic.getDetaFormaPagoDataAccess().setIsForForeingKeyData(true);

			if(this.bancoformapagoSessionBean==null) {
				this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
			}

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionDetaFormaPago()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detaformapagoLogic.getDetaFormaPagoDataAccess().setIsForForeingKeyData(true);

					detaformapagoLogic.getTodosDetaFormaPagosWithConnection(sFinalQuery,new Pagination());

					this.detaformapagosForeignKey=detaformapagoLogic.getDetaFormaPagos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDetaFormaPago(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					detaformapagoLogic.getEntityWithConnection(bancoformapagoSessionBean.getlidDetaFormaPagoActual());
					this.detaformapagosForeignKey.add(detaformapagoLogic.getDetaFormaPago());
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

	public void cargarCombosTipoBancoFormaPagosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipobancoformapagosForeignKey=new ArrayList<TipoBancoFormaPago>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoBancoFormaPagoLogic tipobancoformapagoLogic=new TipoBancoFormaPagoLogic();

			//tipobancoformapagoLogic.getTipoBancoFormaPagoDataAccess().setIsForForeingKeyData(true);

			if(this.bancoformapagoSessionBean==null) {
				this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
			}

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionTipoBancoFormaPago()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipobancoformapagoLogic.getTipoBancoFormaPagoDataAccess().setIsForForeingKeyData(true);

					tipobancoformapagoLogic.getTodosTipoBancoFormaPagosWithConnection(sFinalQuery,new Pagination());

					this.tipobancoformapagosForeignKey=tipobancoformapagoLogic.getTipoBancoFormaPagos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoBancoFormaPago(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancoformapagoLogic.getEntityWithConnection(bancoformapagoSessionBean.getlidTipoBancoFormaPagoActual());
					this.tipobancoformapagosForeignKey.add(tipobancoformapagoLogic.getTipoBancoFormaPago());
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

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.bancoformapagoSessionBean==null) {
				this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
			}

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(bancoformapagoSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.bancoformapagoSessionBean==null) {
				this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
			}

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(bancoformapagoSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

					if(this.bancoformapago!=null) {
						this.bancoformapago.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_empresaBancoFormaPago.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaBancoFormaPago.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_empresaBancoFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_empresaBancoFormaPago.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaBancoFormaPagoGenerico)throws Exception
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
				jComboBoxid_empresaBancoFormaPagoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaBancoFormaPagoGenerico!=null && jComboBoxid_empresaBancoFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_empresaBancoFormaPagoGenerico.setSelectedIndex(0);
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

					if(this.bancoformapago!=null) {
						this.bancoformapago.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_sucursalBancoFormaPago.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalBancoFormaPago.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_sucursalBancoFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_sucursalBancoFormaPago.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalBancoFormaPagoGenerico)throws Exception
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
				jComboBoxid_sucursalBancoFormaPagoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalBancoFormaPagoGenerico!=null && jComboBoxid_sucursalBancoFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalBancoFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.bancoformapago!=null) {
						this.bancoformapago.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_ejercicioBancoFormaPago.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioBancoFormaPago.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_ejercicioBancoFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_ejercicioBancoFormaPago.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioBancoFormaPagoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioBancoFormaPagoGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioBancoFormaPagoGenerico!=null && jComboBoxid_ejercicioBancoFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioBancoFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.bancoformapago!=null) {
						this.bancoformapago.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_periodoBancoFormaPago.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoBancoFormaPago.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_periodoBancoFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_periodoBancoFormaPago.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoBancoFormaPagoGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoBancoFormaPagoGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoBancoFormaPagoGenerico!=null && jComboBoxid_periodoBancoFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_periodoBancoFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFacturaForeignKey(Long idFacturaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(facturaTemp!=null) {

					if(this.bancoformapago!=null) {
						this.bancoformapago.setFactura(facturaTemp);
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_facturaBancoFormaPago.setSelectedItem(facturaTemp);
					}
				} else {
					//jComboBoxid_facturaBancoFormaPago.setSelectedItem(facturaTemp);
					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_facturaBancoFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_facturaBancoFormaPago.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){
					if(facturaTemp!=null && jComboBoxid_facturaFK_IdFacturaBancoFormaPago!=null) {
						jComboBoxid_facturaFK_IdFacturaBancoFormaPago.setSelectedItem(facturaTemp);
					} else {
						if(jComboBoxid_facturaFK_IdFacturaBancoFormaPago!=null) {
							//jComboBoxid_facturaFK_IdFacturaBancoFormaPago.setSelectedItem(facturaTemp);
							if(jComboBoxid_facturaFK_IdFacturaBancoFormaPago.getItemCount()>0) {
								jComboBoxid_facturaFK_IdFacturaBancoFormaPago.setSelectedIndex(0);
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

	public String getActualFacturaForeignKeyDescripcion(Long idFacturaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}


			sDescripcion=FacturaConstantesFunciones.getFacturaDescripcion(facturaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFacturaForeignKeyGenerico(Long idFacturaSeleccionado,JComboBox jComboBoxid_facturaBancoFormaPagoGenerico)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(facturaTemp!=null) {
				jComboBoxid_facturaBancoFormaPagoGenerico.setSelectedItem(facturaTemp);
			} else {
				if(jComboBoxid_facturaBancoFormaPagoGenerico!=null && jComboBoxid_facturaBancoFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_facturaBancoFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDetaFormaPagoForeignKey(Long idDetaFormaPagoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			DetaFormaPago  detaformapagoTemp=null;

			for(DetaFormaPago detaformapagoAux:detaformapagosForeignKey) {
				if(detaformapagoAux.getId()!=null && detaformapagoAux.getId().equals(idDetaFormaPagoSeleccionado)) {
					detaformapagoTemp=detaformapagoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(detaformapagoTemp!=null) {

					if(this.bancoformapago!=null) {
						this.bancoformapago.setDetaFormaPago(detaformapagoTemp);
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_deta_forma_pagoBancoFormaPago.setSelectedItem(detaformapagoTemp);
					}
				} else {
					//jComboBoxid_deta_forma_pagoBancoFormaPago.setSelectedItem(detaformapagoTemp);
					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_deta_forma_pagoBancoFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_deta_forma_pagoBancoFormaPago.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDetaFormaPago") || sFormularioTipoBusqueda.equals("Todos")){
					if(detaformapagoTemp!=null && jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago!=null) {
						jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.setSelectedItem(detaformapagoTemp);
					} else {
						if(jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago!=null) {
							//jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.setSelectedItem(detaformapagoTemp);
							if(jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.getItemCount()>0) {
								jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.setSelectedIndex(0);
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

	public String getActualDetaFormaPagoForeignKeyDescripcion(Long idDetaFormaPagoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			DetaFormaPago  detaformapagoTemp=null;

			for(DetaFormaPago detaformapagoAux:detaformapagosForeignKey) {
				if(detaformapagoAux.getId()!=null && detaformapagoAux.getId().equals(idDetaFormaPagoSeleccionado)) {
					detaformapagoTemp=detaformapagoAux;
					break;
				}
			}


			sDescripcion=DetaFormaPagoConstantesFunciones.getDetaFormaPagoDescripcion(detaformapagoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDetaFormaPagoForeignKeyGenerico(Long idDetaFormaPagoSeleccionado,JComboBox jComboBoxid_deta_forma_pagoBancoFormaPagoGenerico)throws Exception
	{
		try
		{
			DetaFormaPago  detaformapagoTemp=null;

			for(DetaFormaPago detaformapagoAux:detaformapagosForeignKey) {
				if(detaformapagoAux.getId()!=null && detaformapagoAux.getId().equals(idDetaFormaPagoSeleccionado)) {
					detaformapagoTemp=detaformapagoAux;
					break;
				}
			}

			if(detaformapagoTemp!=null) {
				jComboBoxid_deta_forma_pagoBancoFormaPagoGenerico.setSelectedItem(detaformapagoTemp);
			} else {
				if(jComboBoxid_deta_forma_pagoBancoFormaPagoGenerico!=null && jComboBoxid_deta_forma_pagoBancoFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_deta_forma_pagoBancoFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoBancoFormaPagoForeignKey(Long idTipoBancoFormaPagoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoBancoFormaPago  tipobancoformapagoTemp=null;

			for(TipoBancoFormaPago tipobancoformapagoAux:tipobancoformapagosForeignKey) {
				if(tipobancoformapagoAux.getId()!=null && tipobancoformapagoAux.getId().equals(idTipoBancoFormaPagoSeleccionado)) {
					tipobancoformapagoTemp=tipobancoformapagoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipobancoformapagoTemp!=null) {

					if(this.bancoformapago!=null) {
						this.bancoformapago.setTipoBancoFormaPago(tipobancoformapagoTemp);
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.setSelectedItem(tipobancoformapagoTemp);
					}
				} else {
					//jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.setSelectedItem(tipobancoformapagoTemp);
					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBancoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipobancoformapagoTemp!=null && jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago!=null) {
						jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.setSelectedItem(tipobancoformapagoTemp);
					} else {
						if(jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago!=null) {
							//jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.setSelectedItem(tipobancoformapagoTemp);
							if(jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.getItemCount()>0) {
								jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.setSelectedIndex(0);
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

	public String getActualTipoBancoFormaPagoForeignKeyDescripcion(Long idTipoBancoFormaPagoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoBancoFormaPago  tipobancoformapagoTemp=null;

			for(TipoBancoFormaPago tipobancoformapagoAux:tipobancoformapagosForeignKey) {
				if(tipobancoformapagoAux.getId()!=null && tipobancoformapagoAux.getId().equals(idTipoBancoFormaPagoSeleccionado)) {
					tipobancoformapagoTemp=tipobancoformapagoAux;
					break;
				}
			}


			sDescripcion=TipoBancoFormaPagoConstantesFunciones.getTipoBancoFormaPagoDescripcion(tipobancoformapagoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoBancoFormaPagoForeignKeyGenerico(Long idTipoBancoFormaPagoSeleccionado,JComboBox jComboBoxid_tipo_banco_forma_pagoBancoFormaPagoGenerico)throws Exception
	{
		try
		{
			TipoBancoFormaPago  tipobancoformapagoTemp=null;

			for(TipoBancoFormaPago tipobancoformapagoAux:tipobancoformapagosForeignKey) {
				if(tipobancoformapagoAux.getId()!=null && tipobancoformapagoAux.getId().equals(idTipoBancoFormaPagoSeleccionado)) {
					tipobancoformapagoTemp=tipobancoformapagoAux;
					break;
				}
			}

			if(tipobancoformapagoTemp!=null) {
				jComboBoxid_tipo_banco_forma_pagoBancoFormaPagoGenerico.setSelectedItem(tipobancoformapagoTemp);
			} else {
				if(jComboBoxid_tipo_banco_forma_pagoBancoFormaPagoGenerico!=null && jComboBoxid_tipo_banco_forma_pagoBancoFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_banco_forma_pagoBancoFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.bancoformapago!=null) {
						this.bancoformapago.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_anioBancoFormaPago.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioBancoFormaPago.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_anioBancoFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_anioBancoFormaPago.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioBancoFormaPagoGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioBancoFormaPagoGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioBancoFormaPagoGenerico!=null && jComboBoxid_anioBancoFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_anioBancoFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.bancoformapago!=null) {
						this.bancoformapago.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_mesBancoFormaPago.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesBancoFormaPago.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
						if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_mesBancoFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_mesBancoFormaPago.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesBancoFormaPagoGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesBancoFormaPagoGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesBancoFormaPagoGenerico!=null && jComboBoxid_mesBancoFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_mesBancoFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(BancoFormaPago bancoformapago,JComboBox jComboBoxid_empresaBancoFormaPagoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaBancoFormaPagoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_empresaBancoFormaPago.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaBancoFormaPagoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				bancoformapago.setid_empresa(empresaAux.getId());
				bancoformapago.setempresa_descripcion(BancoFormaPagoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				bancoformapago.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(BancoFormaPago bancoformapago,JComboBox jComboBoxid_sucursalBancoFormaPagoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalBancoFormaPagoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_sucursalBancoFormaPago.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalBancoFormaPagoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				bancoformapago.setid_sucursal(sucursalAux.getId());
				bancoformapago.setsucursal_descripcion(BancoFormaPagoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				bancoformapago.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(BancoFormaPago bancoformapago,JComboBox jComboBoxid_ejercicioBancoFormaPagoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioBancoFormaPagoGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_ejercicioBancoFormaPago.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioBancoFormaPagoGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				bancoformapago.setid_ejercicio(ejercicioAux.getId());
				bancoformapago.setejercicio_descripcion(BancoFormaPagoConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				bancoformapago.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(BancoFormaPago bancoformapago,JComboBox jComboBoxid_periodoBancoFormaPagoGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoBancoFormaPagoGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_periodoBancoFormaPago.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoBancoFormaPagoGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				bancoformapago.setid_periodo(periodoAux.getId());
				bancoformapago.setperiodo_descripcion(BancoFormaPagoConstantesFunciones.getPeriodoDescripcion(periodoAux));
				bancoformapago.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFacturaForeignKey(BancoFormaPago bancoformapago,JComboBox jComboBoxid_facturaBancoFormaPagoGenerico)throws Exception
	{
		try
		{
			Factura  facturaAux=new Factura();

			if(jComboBoxid_facturaBancoFormaPagoGenerico==null) {
				facturaAux=(Factura)this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_facturaBancoFormaPago.getSelectedItem();
			} else {
				facturaAux=(Factura)jComboBoxid_facturaBancoFormaPagoGenerico.getSelectedItem();
			}

			if(facturaAux!=null && facturaAux.getId()!=null) {
				bancoformapago.setid_factura(facturaAux.getId());
				bancoformapago.setfactura_descripcion(BancoFormaPagoConstantesFunciones.getFacturaDescripcion(facturaAux));
				bancoformapago.setFactura(facturaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDetaFormaPagoForeignKey(BancoFormaPago bancoformapago,JComboBox jComboBoxid_deta_forma_pagoBancoFormaPagoGenerico)throws Exception
	{
		try
		{
			DetaFormaPago  detaformapagoAux=new DetaFormaPago();

			if(jComboBoxid_deta_forma_pagoBancoFormaPagoGenerico==null) {
				detaformapagoAux=(DetaFormaPago)this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_deta_forma_pagoBancoFormaPago.getSelectedItem();
			} else {
				detaformapagoAux=(DetaFormaPago)jComboBoxid_deta_forma_pagoBancoFormaPagoGenerico.getSelectedItem();
			}

			if(detaformapagoAux!=null && detaformapagoAux.getId()!=null) {
				bancoformapago.setid_deta_forma_pago(detaformapagoAux.getId());
				bancoformapago.setdetaformapago_descripcion(BancoFormaPagoConstantesFunciones.getDetaFormaPagoDescripcion(detaformapagoAux));
				bancoformapago.setDetaFormaPago(detaformapagoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoBancoFormaPagoForeignKey(BancoFormaPago bancoformapago,JComboBox jComboBoxid_tipo_banco_forma_pagoBancoFormaPagoGenerico)throws Exception
	{
		try
		{
			TipoBancoFormaPago  tipobancoformapagoAux=new TipoBancoFormaPago();

			if(jComboBoxid_tipo_banco_forma_pagoBancoFormaPagoGenerico==null) {
				tipobancoformapagoAux=(TipoBancoFormaPago)this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.getSelectedItem();
			} else {
				tipobancoformapagoAux=(TipoBancoFormaPago)jComboBoxid_tipo_banco_forma_pagoBancoFormaPagoGenerico.getSelectedItem();
			}

			if(tipobancoformapagoAux!=null && tipobancoformapagoAux.getId()!=null) {
				bancoformapago.setid_tipo_banco_forma_pago(tipobancoformapagoAux.getId());
				bancoformapago.settipobancoformapago_descripcion(BancoFormaPagoConstantesFunciones.getTipoBancoFormaPagoDescripcion(tipobancoformapagoAux));
				bancoformapago.setTipoBancoFormaPago(tipobancoformapagoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(BancoFormaPago bancoformapago,JComboBox jComboBoxid_anioBancoFormaPagoGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioBancoFormaPagoGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_anioBancoFormaPago.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioBancoFormaPagoGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				bancoformapago.setid_anio(anioAux.getId());
				bancoformapago.setanio_descripcion(BancoFormaPagoConstantesFunciones.getAnioDescripcion(anioAux));
				bancoformapago.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(BancoFormaPago bancoformapago,JComboBox jComboBoxid_mesBancoFormaPagoGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesBancoFormaPagoGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_mesBancoFormaPago.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesBancoFormaPagoGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				bancoformapago.setid_mes(mesAux.getId());
				bancoformapago.setmes_descripcion(BancoFormaPagoConstantesFunciones.getMesDescripcion(mesAux));
				bancoformapago.setMes(mesAux);			}
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

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_empresaBancoFormaPago.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_empresaBancoFormaPago.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
					}

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_sucursalBancoFormaPago.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_sucursalBancoFormaPago.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
					}

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_ejercicioBancoFormaPago.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_ejercicioBancoFormaPago.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
					}

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_periodoBancoFormaPago.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_periodoBancoFormaPago.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
					}

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFacturasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFactura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_facturaBancoFormaPago.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_facturaBancoFormaPago.addItem(factura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
					}

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_facturaFK_IdFacturaBancoFormaPago.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jComboBoxid_facturaFK_IdFacturaBancoFormaPago.addItem(factura);
							}
						}

						if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDetaFormaPagosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDetaFormaPago=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_deta_forma_pagoBancoFormaPago.removeAllItems();

							for(DetaFormaPago detaformapago:this.detaformapagosForeignKey) {
								this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_deta_forma_pagoBancoFormaPago.addItem(detaformapago);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
					}

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDetaFormaPago") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.removeAllItems();

							for(DetaFormaPago detaformapago:this.detaformapagosForeignKey) {
								this.jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.addItem(detaformapago);
							}
						}

						if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoBancoFormaPagosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoBancoFormaPago=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.removeAllItems();

							for(TipoBancoFormaPago tipobancoformapago:this.tipobancoformapagosForeignKey) {
								this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.addItem(tipobancoformapago);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
					}

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBancoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.removeAllItems();

							for(TipoBancoFormaPago tipobancoformapago:this.tipobancoformapagosForeignKey) {
								this.jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.addItem(tipobancoformapago);
							}
						}

						if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_anioBancoFormaPago.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_anioBancoFormaPago.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
					}

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_mesBancoFormaPago.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_mesBancoFormaPago.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { 
					}

					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_empresaBancoFormaPago.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_empresaBancoFormaPago.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_sucursalBancoFormaPago.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_sucursalBancoFormaPago.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_ejercicioBancoFormaPago.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_ejercicioBancoFormaPago.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_periodoBancoFormaPago.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_periodoBancoFormaPago.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameFacturaForeignKey(Factura factura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_facturaBancoFormaPago.setSelectedItem(factura);
						}
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_facturaBancoFormaPago.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_facturaFK_IdFacturaBancoFormaPago.setSelectedItem(factura);
						} else {
							this.jComboBoxid_facturaFK_IdFacturaBancoFormaPago.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameDetaFormaPagoForeignKey(DetaFormaPago detaformapago,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_deta_forma_pagoBancoFormaPago.setSelectedItem(detaformapago);
						}
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_deta_forma_pagoBancoFormaPago.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.setSelectedItem(detaformapago);
						} else {
							this.jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoBancoFormaPagoForeignKey(TipoBancoFormaPago tipobancoformapago,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.setSelectedItem(tipobancoformapago);
						}
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.setSelectedItem(tipobancoformapago);
						} else {
							this.jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_anioBancoFormaPago.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_anioBancoFormaPago.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_mesBancoFormaPago.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_mesBancoFormaPago.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesBancoFormaPago() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			BancoFormaPagoConstantesFunciones.refrescarForeignKeysDescripcionesBancoFormaPago(this.bancoformapagoLogic.getBancoFormaPagos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			BancoFormaPagoConstantesFunciones.refrescarForeignKeysDescripcionesBancoFormaPago(this.bancoformapagos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Factura.class));
		classes.add(new Classe(DetaFormaPago.class));
		classes.add(new Classe(TipoBancoFormaPago.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//bancoformapagoLogic.setBancoFormaPagos(this.bancoformapagos);
			bancoformapagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public BancoFormaPagoParameterReturnGeneral getBancoFormaPagoParameterGeneral() {
		return this.bancoformapagoParameterGeneral;
	}
	
	public void setBancoFormaPagoParameterGeneral(BancoFormaPagoParameterReturnGeneral bancoformapagoParameterGeneral) {
		this.bancoformapagoParameterGeneral = bancoformapagoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoBancoFormaPago() {
		return isPermisoTodoBancoFormaPago;
	}

	public void setIsPermisoTodoBancoFormaPago(Boolean isPermisoTodoBancoFormaPago) {
		this.isPermisoTodoBancoFormaPago = isPermisoTodoBancoFormaPago;
	}

	public Boolean getIsPermisoNuevoBancoFormaPago() {
		return isPermisoNuevoBancoFormaPago;
	}

	public void setIsPermisoNuevoBancoFormaPago(Boolean isPermisoNuevoBancoFormaPago) {
		this.isPermisoNuevoBancoFormaPago = isPermisoNuevoBancoFormaPago;
	}

	public Boolean getIsPermisoActualizarBancoFormaPago() {
		return isPermisoActualizarBancoFormaPago;
	}

	public void setIsPermisoActualizarBancoFormaPago(Boolean isPermisoActualizarBancoFormaPago) {
		this.isPermisoActualizarBancoFormaPago = isPermisoActualizarBancoFormaPago;
	}

	public Boolean getIsPermisoEliminarBancoFormaPago() {
		return isPermisoEliminarBancoFormaPago;
	}

	public void setIsPermisoEliminarBancoFormaPago(Boolean isPermisoEliminarBancoFormaPago) {
		this.isPermisoEliminarBancoFormaPago = isPermisoEliminarBancoFormaPago;
	}

	public Boolean getIsPermisoGuardarCambiosBancoFormaPago() {
		return isPermisoGuardarCambiosBancoFormaPago;
	}

	public void setIsPermisoGuardarCambiosBancoFormaPago(Boolean isPermisoGuardarCambiosBancoFormaPago) {
		this.isPermisoGuardarCambiosBancoFormaPago = isPermisoGuardarCambiosBancoFormaPago;
	}
	
	public Boolean getIsPermisoConsultaBancoFormaPago() {
		return isPermisoConsultaBancoFormaPago;
	}

	public void setIsPermisoConsultaBancoFormaPago(Boolean isPermisoConsultaBancoFormaPago) {
		this.isPermisoConsultaBancoFormaPago = isPermisoConsultaBancoFormaPago;
	}

	public Boolean getIsPermisoBusquedaBancoFormaPago() {
		return isPermisoBusquedaBancoFormaPago;
	}

	public void setIsPermisoBusquedaBancoFormaPago(Boolean isPermisoBusquedaBancoFormaPago) {
		this.isPermisoBusquedaBancoFormaPago = isPermisoBusquedaBancoFormaPago;
	}

	public Boolean getIsPermisoReporteBancoFormaPago() {
		return isPermisoReporteBancoFormaPago;
	}

	public void setIsPermisoReporteBancoFormaPago(Boolean isPermisoReporteBancoFormaPago) {
		this.isPermisoReporteBancoFormaPago = isPermisoReporteBancoFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionMedioBancoFormaPago() {
		return isPermisoPaginacionMedioBancoFormaPago;
	}

	public void setIsPermisoPaginacionMedioBancoFormaPago(Boolean isPermisoPaginacionMedioBancoFormaPago) {
		this.isPermisoPaginacionMedioBancoFormaPago = isPermisoPaginacionMedioBancoFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionTodoBancoFormaPago() {
		return isPermisoPaginacionTodoBancoFormaPago;
	}

	public void setIsPermisoPaginacionTodoBancoFormaPago(Boolean isPermisoPaginacionTodoBancoFormaPago) {
		this.isPermisoPaginacionTodoBancoFormaPago = isPermisoPaginacionTodoBancoFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionAltoBancoFormaPago() {
		return isPermisoPaginacionAltoBancoFormaPago;
	}

	public void setIsPermisoPaginacionAltoBancoFormaPago(Boolean isPermisoPaginacionAltoBancoFormaPago) {
		this.isPermisoPaginacionAltoBancoFormaPago = isPermisoPaginacionAltoBancoFormaPago;
	}
	
	public Boolean getIsPermisoCopiarBancoFormaPago() {
		return isPermisoCopiarBancoFormaPago;
	}

	public void setIsPermisoCopiarBancoFormaPago(Boolean isPermisoCopiarBancoFormaPago) {
		this.isPermisoCopiarBancoFormaPago = isPermisoCopiarBancoFormaPago;
	}
	
	public Boolean getIsPermisoVerFormBancoFormaPago() {
		return isPermisoVerFormBancoFormaPago;
	}

	public void setIsPermisoVerFormBancoFormaPago(Boolean isPermisoVerFormBancoFormaPago) {
		this.isPermisoVerFormBancoFormaPago = isPermisoVerFormBancoFormaPago;
	}
	
	public Boolean getIsPermisoDuplicarBancoFormaPago() {
		return isPermisoDuplicarBancoFormaPago;
	}

	public void setIsPermisoDuplicarBancoFormaPago(Boolean isPermisoDuplicarBancoFormaPago) {
		this.isPermisoDuplicarBancoFormaPago = isPermisoDuplicarBancoFormaPago;
	}
	
	public Boolean getIsPermisoOrdenBancoFormaPago() {
		return isPermisoOrdenBancoFormaPago;
	}

	public void setIsPermisoOrdenBancoFormaPago(Boolean isPermisoOrdenBancoFormaPago) {
		this.isPermisoOrdenBancoFormaPago = isPermisoOrdenBancoFormaPago;
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
	
	public Boolean getIsVisibilidadCeldaNuevoBancoFormaPago() {
		return isVisibilidadCeldaNuevoBancoFormaPago;
	}

	public void setIsVisibilidadCeldaNuevoBancoFormaPago(Boolean isVisibilidadCeldaNuevoBancoFormaPago) {
		this.isVisibilidadCeldaNuevoBancoFormaPago = isVisibilidadCeldaNuevoBancoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarBancoFormaPago() {
		return isVisibilidadCeldaDuplicarBancoFormaPago;
	}

	public void setIsVisibilidadCeldaDuplicarBancoFormaPago(Boolean isVisibilidadCeldaDuplicarBancoFormaPago) {
		this.isVisibilidadCeldaDuplicarBancoFormaPago = isVisibilidadCeldaDuplicarBancoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarBancoFormaPago() {
		return isVisibilidadCeldaCopiarBancoFormaPago;
	}

	public void setIsVisibilidadCeldaCopiarBancoFormaPago(Boolean isVisibilidadCeldaCopiarBancoFormaPago) {
		this.isVisibilidadCeldaCopiarBancoFormaPago = isVisibilidadCeldaCopiarBancoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormBancoFormaPago() {
		return isVisibilidadCeldaVerFormBancoFormaPago;
	}

	public void setIsVisibilidadCeldaVerFormBancoFormaPago(Boolean isVisibilidadCeldaVerFormBancoFormaPago) {
		this.isVisibilidadCeldaVerFormBancoFormaPago = isVisibilidadCeldaVerFormBancoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenBancoFormaPago() {
		return isVisibilidadCeldaOrdenBancoFormaPago;
	}

	public void setIsVisibilidadCeldaOrdenBancoFormaPago(Boolean isVisibilidadCeldaOrdenBancoFormaPago) {
		this.isVisibilidadCeldaOrdenBancoFormaPago = isVisibilidadCeldaOrdenBancoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesBancoFormaPago() {
		return isVisibilidadCeldaNuevoRelacionesBancoFormaPago;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesBancoFormaPago(Boolean isVisibilidadCeldaNuevoRelacionesBancoFormaPago) {
		this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago = isVisibilidadCeldaNuevoRelacionesBancoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaModificarBancoFormaPago() {
		return isVisibilidadCeldaModificarBancoFormaPago;
	}

	public void setIsVisibilidadCeldaModificarBancoFormaPago(Boolean isVisibilidadCeldaModificarBancoFormaPago) {
		this.isVisibilidadCeldaModificarBancoFormaPago = isVisibilidadCeldaModificarBancoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarBancoFormaPago() {
		return isVisibilidadCeldaActualizarBancoFormaPago;
	}

	public void setIsVisibilidadCeldaActualizarBancoFormaPago(Boolean isVisibilidadCeldaActualizarBancoFormaPago) {
		this.isVisibilidadCeldaActualizarBancoFormaPago = isVisibilidadCeldaActualizarBancoFormaPago;
	}

	public Boolean getIsVisibilidadCeldaEliminarBancoFormaPago() {
		return isVisibilidadCeldaEliminarBancoFormaPago;
	}

	public void setIsVisibilidadCeldaEliminarBancoFormaPago(Boolean isVisibilidadCeldaEliminarBancoFormaPago) {
		this.isVisibilidadCeldaEliminarBancoFormaPago = isVisibilidadCeldaEliminarBancoFormaPago;
	}

	public Boolean getIsVisibilidadCeldaCancelarBancoFormaPago() {
		return isVisibilidadCeldaCancelarBancoFormaPago;
	}

	public void setIsVisibilidadCeldaCancelarBancoFormaPago(Boolean isVisibilidadCeldaCancelarBancoFormaPago) {
		this.isVisibilidadCeldaCancelarBancoFormaPago = isVisibilidadCeldaCancelarBancoFormaPago;
	}

	public Boolean getIsVisibilidadCeldaGuardarBancoFormaPago() {
		return isVisibilidadCeldaGuardarBancoFormaPago;
	}

	public void setIsVisibilidadCeldaGuardarBancoFormaPago(Boolean isVisibilidadCeldaGuardarBancoFormaPago) {
		this.isVisibilidadCeldaGuardarBancoFormaPago = isVisibilidadCeldaGuardarBancoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosBancoFormaPago() {
		return isVisibilidadCeldaGuardarCambiosBancoFormaPago;
	}

	public void setIsVisibilidadCeldaGuardarCambiosBancoFormaPago(Boolean isVisibilidadCeldaGuardarCambiosBancoFormaPago) {
		this.isVisibilidadCeldaGuardarCambiosBancoFormaPago = isVisibilidadCeldaGuardarCambiosBancoFormaPago;
	}
		
	public BancoFormaPagoSessionBean getbancoformapagoSessionBean() {
		return this.bancoformapagoSessionBean;
	}
	
	public void setbancoformapagoSessionBean(BancoFormaPagoSessionBean bancoformapagoSessionBean) {
		this.bancoformapagoSessionBean=bancoformapagoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdBancoFormaPago() {
		return this.isVisibilidadFK_IdBancoFormaPago;
	}

	public void setisVisibilidadFK_IdBancoFormaPago(Boolean isVisibilidadFK_IdBancoFormaPago) {
		this.isVisibilidadFK_IdBancoFormaPago=isVisibilidadFK_IdBancoFormaPago;
	}

	public Boolean getisVisibilidadFK_IdDetaFormaPago() {
		return this.isVisibilidadFK_IdDetaFormaPago;
	}

	public void setisVisibilidadFK_IdDetaFormaPago(Boolean isVisibilidadFK_IdDetaFormaPago) {
		this.isVisibilidadFK_IdDetaFormaPago=isVisibilidadFK_IdDetaFormaPago;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdFactura() {
		return this.isVisibilidadFK_IdFactura;
	}

	public void setisVisibilidadFK_IdFactura(Boolean isVisibilidadFK_IdFactura) {
		this.isVisibilidadFK_IdFactura=isVisibilidadFK_IdFactura;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(BancoFormaPago bancoformapago)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(bancoformapago,null);
				this.setActualParaGuardarSucursalForeignKey(bancoformapago,null);
				this.setActualParaGuardarEjercicioForeignKey(bancoformapago,null);
				this.setActualParaGuardarPeriodoForeignKey(bancoformapago,null);
				this.setActualParaGuardarFacturaForeignKey(bancoformapago,null);
				this.setActualParaGuardarDetaFormaPagoForeignKey(bancoformapago,null);
				this.setActualParaGuardarTipoBancoFormaPagoForeignKey(bancoformapago,null);
				this.setActualParaGuardarAnioForeignKey(bancoformapago,null);
				this.setActualParaGuardarMesForeignKey(bancoformapago,null);
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
	
	public void bugActualizarReferenciaActual(BancoFormaPago bancoformapago,BancoFormaPago bancoformapagoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalBancoFormaPago(bancoformapago);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		bancoformapagoAux.setId(bancoformapago.getId());
		bancoformapagoAux.setVersionRow(bancoformapago.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessBancoFormaPago();
		
			int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = bancoformapagoValidator.getInvalidValues(this.bancoformapago);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			bancoformapagoLogic.setDatosCliente(datosCliente);
			bancoformapagoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				bancoformapagoAux=new  BancoFormaPago();
				
				bancoformapagoAux.setIsNew(true);
				bancoformapagoAux.setIsChanged(true);
				
				bancoformapagoAux.setBancoFormaPagoOriginal(this.bancoformapago);
				
				bancoformapagoAux.setId(this.bancoformapago.getId());	
				bancoformapagoAux.setVersionRow(this.bancoformapago.getVersionRow());	
				bancoformapagoAux.setid_empresa(this.bancoformapago.getid_empresa());	
				bancoformapagoAux.setid_sucursal(this.bancoformapago.getid_sucursal());	
				bancoformapagoAux.setid_ejercicio(this.bancoformapago.getid_ejercicio());	
				bancoformapagoAux.setid_periodo(this.bancoformapago.getid_periodo());	
				bancoformapagoAux.setid_factura(this.bancoformapago.getid_factura());	
				bancoformapagoAux.setid_deta_forma_pago(this.bancoformapago.getid_deta_forma_pago());	
				bancoformapagoAux.setid_tipo_banco_forma_pago(this.bancoformapago.getid_tipo_banco_forma_pago());	
				bancoformapagoAux.setnombre_banco(this.bancoformapago.getnombre_banco());	
				bancoformapagoAux.setnombre_girador(this.bancoformapago.getnombre_girador());	
				bancoformapagoAux.setfecha_vence(this.bancoformapago.getfecha_vence());	
				bancoformapagoAux.setnumero_cuenta_banco(this.bancoformapago.getnumero_cuenta_banco());	
				bancoformapagoAux.setnumero_cheque(this.bancoformapago.getnumero_cheque());	
				bancoformapagoAux.setvalor_monto(this.bancoformapago.getvalor_monto());	
				bancoformapagoAux.setid_anio(this.bancoformapago.getid_anio());	
				bancoformapagoAux.setid_mes(this.bancoformapago.getid_mes());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.bancoformapagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.bancoformapagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(bancoformapagoAux,bancoformapagoLogic.getBancoFormaPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bancoformapagoAux,bancoformapagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.bancoformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bancoformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagoLogic.saveBancoFormaPagos();//WithConnection
						//bancoformapagoLogic.getSetVersionRowBancoFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.bancoformapago,bancoformapagoAux);
					
					this.refrescarForeignKeysDescripcionesBancoFormaPago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bancoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bancoformapagoLogic.saveBancoFormaPagoRelaciones(bancoformapagoAux);//WithConnection
								//bancoformapagoLogic.getSetVersionRowBancoFormaPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.bancoformapago,bancoformapagoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.bancoformapagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.bancoformapagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(bancoformapagoAux,bancoformapagoLogic.getBancoFormaPagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(bancoformapagoAux,bancoformapagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.bancoformapago,bancoformapagoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				bancoformapagoAux=new  BancoFormaPago();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado() 
					|| (this.bancoformapagoSessionBean.getEsGuardarRelacionado() && this.bancoformapago.getId()>=0)) {
						
					bancoformapagoAux.setIsNew(false);
				}
				
				bancoformapagoAux.setIsDeleted(false);
			
				bancoformapagoAux.setId(this.bancoformapago.getId());	
				bancoformapagoAux.setVersionRow(this.bancoformapago.getVersionRow());	
				bancoformapagoAux.setid_empresa(this.bancoformapago.getid_empresa());	
				bancoformapagoAux.setid_sucursal(this.bancoformapago.getid_sucursal());	
				bancoformapagoAux.setid_ejercicio(this.bancoformapago.getid_ejercicio());	
				bancoformapagoAux.setid_periodo(this.bancoformapago.getid_periodo());	
				bancoformapagoAux.setid_factura(this.bancoformapago.getid_factura());	
				bancoformapagoAux.setid_deta_forma_pago(this.bancoformapago.getid_deta_forma_pago());	
				bancoformapagoAux.setid_tipo_banco_forma_pago(this.bancoformapago.getid_tipo_banco_forma_pago());	
				bancoformapagoAux.setnombre_banco(this.bancoformapago.getnombre_banco());	
				bancoformapagoAux.setnombre_girador(this.bancoformapago.getnombre_girador());	
				bancoformapagoAux.setfecha_vence(this.bancoformapago.getfecha_vence());	
				bancoformapagoAux.setnumero_cuenta_banco(this.bancoformapago.getnumero_cuenta_banco());	
				bancoformapagoAux.setnumero_cheque(this.bancoformapago.getnumero_cheque());	
				bancoformapagoAux.setvalor_monto(this.bancoformapago.getvalor_monto());	
				bancoformapagoAux.setid_anio(this.bancoformapago.getid_anio());	
				bancoformapagoAux.setid_mes(this.bancoformapago.getid_mes());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(bancoformapagoAux,bancoformapagoLogic.getBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bancoformapagoAux,bancoformapagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.bancoformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bancoformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagoLogic.saveBancoFormaPagos();//WithConnection
						//bancoformapagoLogic.getSetVersionRowBancoFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.bancoformapago,bancoformapagoAux);
					
					this.refrescarForeignKeysDescripcionesBancoFormaPago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bancoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bancoformapagoLogic.saveBancoFormaPagoRelaciones(bancoformapagoAux);//WithConnection
								//bancoformapagoLogic.getSetVersionRowBancoFormaPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.bancoformapago,bancoformapagoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.bancoformapagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.bancoformapagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(bancoformapagoAux,bancoformapagoLogic.getBancoFormaPagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(bancoformapagoAux,bancoformapagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.bancoformapago,bancoformapagoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				bancoformapagoAux=new  BancoFormaPago();
				
				bancoformapagoAux.setIsNew(false);
				bancoformapagoAux.setIsChanged(false);
				
				bancoformapagoAux.setIsDeleted(true);
				
				bancoformapagoAux.setId(this.bancoformapago.getId());	
				bancoformapagoAux.setVersionRow(this.bancoformapago.getVersionRow());	
				bancoformapagoAux.setid_empresa(this.bancoformapago.getid_empresa());	
				bancoformapagoAux.setid_sucursal(this.bancoformapago.getid_sucursal());	
				bancoformapagoAux.setid_ejercicio(this.bancoformapago.getid_ejercicio());	
				bancoformapagoAux.setid_periodo(this.bancoformapago.getid_periodo());	
				bancoformapagoAux.setid_factura(this.bancoformapago.getid_factura());	
				bancoformapagoAux.setid_deta_forma_pago(this.bancoformapago.getid_deta_forma_pago());	
				bancoformapagoAux.setid_tipo_banco_forma_pago(this.bancoformapago.getid_tipo_banco_forma_pago());	
				bancoformapagoAux.setnombre_banco(this.bancoformapago.getnombre_banco());	
				bancoformapagoAux.setnombre_girador(this.bancoformapago.getnombre_girador());	
				bancoformapagoAux.setfecha_vence(this.bancoformapago.getfecha_vence());	
				bancoformapagoAux.setnumero_cuenta_banco(this.bancoformapago.getnumero_cuenta_banco());	
				bancoformapagoAux.setnumero_cheque(this.bancoformapago.getnumero_cheque());	
				bancoformapagoAux.setvalor_monto(this.bancoformapago.getvalor_monto());	
				bancoformapagoAux.setid_anio(this.bancoformapago.getid_anio());	
				bancoformapagoAux.setid_mes(this.bancoformapago.getid_mes());	
				
				if(this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.bancoformapagoAux.getId()>=0) {	
						this.bancoformapagosEliminados.add(bancoformapagoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(bancoformapagoAux,bancoformapagoLogic.getBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bancoformapagoAux,bancoformapagos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.bancoformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bancoformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagoLogic.saveBancoFormaPagos();//WithConnection
						//bancoformapagoLogic.getSetVersionRowBancoFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bancoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bancoformapagoLogic.saveBancoFormaPagoRelaciones(bancoformapagoAux);//WithConnection
								//bancoformapagoLogic.getSetVersionRowBancoFormaPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.bancoformapagoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.bancoformapagoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(bancoformapagoAux,bancoformapagoLogic.getBancoFormaPagos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(bancoformapagoAux,bancoformapagos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.getBancoFormaPagos().addAll(this.bancoformapagosEliminados);
					
					bancoformapagoLogic.saveBancoFormaPagos();//WithConnection
					//bancoformapagoLogic.getSetVersionRowBancoFormaPagos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesBancoFormaPago();
				
				this.bancoformapagosEliminados= new ArrayList<BancoFormaPago>();		
			}
			
			if(this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Banco Forma Pago GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.bancoformapago=bancoformapagoAux;
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
      		//this.finishProcessBancoFormaPago();
      	}
		
	}	
	
	public void actualizarRelaciones(BancoFormaPago bancoformapagoLocal) throws Exception {
		
		if(this.bancoformapagoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(BancoFormaPago bancoformapagoLocal) throws Exception {	
		if(this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				bancoformapagoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				bancoformapagoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				bancoformapagoLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				bancoformapagoLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FacturaDetalleFormJInternalFrame.class)) {
				FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrameLocal=(FacturaBeanSwingJInternalFrame) ((FacturaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				facturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactura(facturaBeanSwingJInternalFrameLocal.getfactura(),true);
				facturaBeanSwingJInternalFrameLocal.actualizarLista(facturaBeanSwingJInternalFrameLocal.factura,this.facturasForeignKey);

				facturaBeanSwingJInternalFrameLocal.actualizarRelaciones(facturaBeanSwingJInternalFrameLocal.factura);

				bancoformapagoLocal.setFactura(facturaBeanSwingJInternalFrameLocal.factura);

				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey("Formulario");
				this.setActualFacturaForeignKey(facturaBeanSwingJInternalFrameLocal.factura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DetaFormaPagoDetalleFormJInternalFrame.class)) {
				DetaFormaPagoBeanSwingJInternalFrame detaformapagoBeanSwingJInternalFrameLocal=(DetaFormaPagoBeanSwingJInternalFrame) ((DetaFormaPagoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				detaformapagoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDetaFormaPago(detaformapagoBeanSwingJInternalFrameLocal.getdetaformapago(),true);
				detaformapagoBeanSwingJInternalFrameLocal.actualizarLista(detaformapagoBeanSwingJInternalFrameLocal.detaformapago,this.detaformapagosForeignKey);

				detaformapagoBeanSwingJInternalFrameLocal.actualizarRelaciones(detaformapagoBeanSwingJInternalFrameLocal.detaformapago);

				bancoformapagoLocal.setDetaFormaPago(detaformapagoBeanSwingJInternalFrameLocal.detaformapago);

				this.addItemDefectoCombosForeignKeyDetaFormaPago();
				this.cargarCombosFrameDetaFormaPagosForeignKey("Formulario");
				this.setActualDetaFormaPagoForeignKey(detaformapagoBeanSwingJInternalFrameLocal.detaformapago.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoBancoFormaPagoDetalleFormJInternalFrame.class)) {
				TipoBancoFormaPagoBeanSwingJInternalFrame tipobancoformapagoBeanSwingJInternalFrameLocal=(TipoBancoFormaPagoBeanSwingJInternalFrame) ((TipoBancoFormaPagoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipobancoformapagoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoBancoFormaPago(tipobancoformapagoBeanSwingJInternalFrameLocal.gettipobancoformapago(),true);
				tipobancoformapagoBeanSwingJInternalFrameLocal.actualizarLista(tipobancoformapagoBeanSwingJInternalFrameLocal.tipobancoformapago,this.tipobancoformapagosForeignKey);

				tipobancoformapagoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipobancoformapagoBeanSwingJInternalFrameLocal.tipobancoformapago);

				bancoformapagoLocal.setTipoBancoFormaPago(tipobancoformapagoBeanSwingJInternalFrameLocal.tipobancoformapago);

				this.addItemDefectoCombosForeignKeyTipoBancoFormaPago();
				this.cargarCombosFrameTipoBancoFormaPagosForeignKey("Formulario");
				this.setActualTipoBancoFormaPagoForeignKey(tipobancoformapagoBeanSwingJInternalFrameLocal.tipobancoformapago.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				bancoformapagoLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				bancoformapagoLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarBancoFormaPagoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = bancoformapagoValidator.getInvalidValues(this.bancoformapago);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(BancoFormaPago bancoformapago,List<BancoFormaPago> bancoformapagos) throws Exception {
		try	{		
			BancoFormaPagoConstantesFunciones.actualizarLista(bancoformapago,bancoformapagos,this.bancoformapagoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(BancoFormaPago bancoformapago,List<BancoFormaPago> bancoformapagos) throws Exception {
		try	{			
			BancoFormaPagoConstantesFunciones.actualizarSelectedLista(bancoformapago,bancoformapagos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<BancoFormaPago> bancoformapagosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				bancoformapagosLocal=this.bancoformapagoLogic.getBancoFormaPagos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				bancoformapagosLocal=this.bancoformapagos;
			}
			//ARCHITECTURE
		
			for(BancoFormaPago bancoformapagoLocal:bancoformapagosLocal) {
				if(this.permiteMantenimiento(bancoformapagoLocal) && bancoformapagoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+BancoFormaPagoConstantesFunciones.getBancoFormaPagoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(BancoFormaPagoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_empresaBancoFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoFormaPagoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_sucursalBancoFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoFormaPagoConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_ejercicioBancoFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoFormaPagoConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_periodoBancoFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoFormaPagoConstantesFunciones.IDFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_facturaBancoFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoFormaPagoConstantesFunciones.IDDETAFORMAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_deta_forma_pagoBancoFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoFormaPagoConstantesFunciones.IDTIPOBANCOFORMAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_tipo_banco_forma_pagoBancoFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoFormaPagoConstantesFunciones.NOMBREBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelnombre_bancoBancoFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoFormaPagoConstantesFunciones.NOMBREGIRADOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelnombre_giradorBancoFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoFormaPagoConstantesFunciones.FECHAVENCE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelfecha_venceBancoFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoFormaPagoConstantesFunciones.NUMEROCUENTABANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelnumero_cuenta_bancoBancoFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoFormaPagoConstantesFunciones.NUMEROCHEQUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelnumero_chequeBancoFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoFormaPagoConstantesFunciones.VALORMONTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelvalor_montoBancoFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoFormaPagoConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_anioBancoFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoFormaPagoConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_mesBancoFormaPago,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_empresaBancoFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_sucursalBancoFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_ejercicioBancoFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_periodoBancoFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_facturaBancoFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_deta_forma_pagoBancoFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_tipo_banco_forma_pagoBancoFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoFormaPago.jLabelnombre_bancoBancoFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoFormaPago.jLabelnombre_giradorBancoFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoFormaPago.jLabelfecha_venceBancoFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoFormaPago.jLabelnumero_cuenta_bancoBancoFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoFormaPago.jLabelnumero_chequeBancoFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoFormaPago.jLabelvalor_montoBancoFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_anioBancoFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoFormaPago.jLabelid_mesBancoFormaPago,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoBancoFormaPago--;	
		
		
		this.bancoformapagoAux=new BancoFormaPago();
		
		this.bancoformapagoAux.setId(this.iIdNuevoBancoFormaPago);
		this.bancoformapagoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.bancoformapagoLogic.getBancoFormaPagos().add(this.bancoformapagoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.bancoformapagos.add(this.bancoformapagoAux);
		}
		//ARCHITECTURE
		
		this.bancoformapago=this.bancoformapagoAux;
		
		if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioBancoFormaPago(this.bancoformapago);
			this.setVariablesObjetoActualToFormularioForeignKeyBancoFormaPago(this.bancoformapago);
		}
				
		//this.setDefaultControlesBancoFormaPago();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyBancoFormaPago();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyBancoFormaPago();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyBancoFormaPago();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBancoFormaPago(this.bancoformapagoBean,this.bancoformapago,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(BancoFormaPagoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.bancoformapagoSessionBean.getConGuardarRelaciones()) {
			classes=BancoFormaPagoConstantesFunciones.getClassesRelationshipsOfBancoFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.bancoformapagoReturnGeneral=bancoformapagoLogic.procesarEventosBancoFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bancoformapagoLogic.getBancoFormaPagos(),this.bancoformapago,this.bancoformapagoParameterGeneral,this.isEsNuevoBancoFormaPago,classes);//this.bancoformapagoLogic.getBancoFormaPago()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanBancoFormaPago(this.bancoformapagoReturnGeneral,this.bancoformapagoBean,false);
		
		if(this.bancoformapagoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyBancoFormaPago(this.bancoformapagoReturnGeneral.getBancoFormaPago());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioBancoFormaPago(this.bancoformapagoReturnGeneral.getBancoFormaPago());
		}
		
		if(this.bancoformapagoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioBancoFormaPago(this.bancoformapagoReturnGeneral.getBancoFormaPago(),classes);//this.bancoformapagoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyBancoFormaPago();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyBancoFormaPago();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BancoFormaPagoBeanSwingJInternalFrameAdditional.RecargarFormBancoFormaPago(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingBancoFormaPago(false);
						
			if(bancoformapagoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBancoFormaPago();
			}
			
			this.actualizarVisualTableDatosBancoFormaPago();
			
			this.jTableDatosBancoFormaPago.setRowSelectionInterval(this.getIndiceNuevoBancoFormaPago(), this.getIndiceNuevoBancoFormaPago());
			
			this.seleccionarFilaTablaBancoFormaPagoActual();
						
			this.actualizarEstadoCeldasBotonesBancoFormaPago("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesBancoFormaPago(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnombre_bancoBancoFormaPago.setEnabled(isHabilitar && this.bancoformapagoConstantesFunciones.activarnombre_bancoBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jTextAreanombre_giradorBancoFormaPago.setEnabled(isHabilitar && this.bancoformapagoConstantesFunciones.activarnombre_giradorBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jDateChooserfecha_venceBancoFormaPago.setEnabled(isHabilitar && this.bancoformapagoConstantesFunciones.activarfecha_venceBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnumero_cuenta_bancoBancoFormaPago.setEnabled(isHabilitar && this.bancoformapagoConstantesFunciones.activarnumero_cuenta_bancoBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnumero_chequeBancoFormaPago.setEnabled(isHabilitar && this.bancoformapagoConstantesFunciones.activarnumero_chequeBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldvalor_montoBancoFormaPago.setEnabled(isHabilitar && this.bancoformapagoConstantesFunciones.activarvalor_montoBancoFormaPago);	
		//
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_empresaBancoFormaPago.setEnabled(isHabilitar && this.bancoformapagoConstantesFunciones.activarid_empresaBancoFormaPago);//
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_sucursalBancoFormaPago.setEnabled(isHabilitar && this.bancoformapagoConstantesFunciones.activarid_sucursalBancoFormaPago);//
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_ejercicioBancoFormaPago.setEnabled(isHabilitar && this.bancoformapagoConstantesFunciones.activarid_ejercicioBancoFormaPago);//
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_periodoBancoFormaPago.setEnabled(isHabilitar && this.bancoformapagoConstantesFunciones.activarid_periodoBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_facturaBancoFormaPago.setEnabled(isHabilitar && this.bancoformapagoConstantesFunciones.activarid_facturaBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_deta_forma_pagoBancoFormaPago.setEnabled(isHabilitar && this.bancoformapagoConstantesFunciones.activarid_deta_forma_pagoBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.setEnabled(isHabilitar && this.bancoformapagoConstantesFunciones.activarid_tipo_banco_forma_pagoBancoFormaPago);//
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_anioBancoFormaPago.setEnabled(isHabilitar && this.bancoformapagoConstantesFunciones.activarid_anioBancoFormaPago);//
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_mesBancoFormaPago.setEnabled(isHabilitar && this.bancoformapagoConstantesFunciones.activarid_mesBancoFormaPago);
	};
	
	public void setDefaultControlesBancoFormaPago() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoBancoFormaPago(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.bancoformapagoSessionBean.setConGuardarRelaciones(true);			
			this.bancoformapagoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormBancoFormaPago.jTabbedPaneRelacionesBancoFormaPago.setVisible(true);
			
					
		} else {
			//this.bancoformapagoSessionBean.setConGuardarRelaciones(false);			
			this.bancoformapagoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormBancoFormaPago.jTabbedPaneRelacionesBancoFormaPago.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoBancoFormaPago() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BancoFormaPago bancoformapagoAux:this.bancoformapagoLogic.getBancoFormaPagos()) {
				if(bancoformapagoAux.getId().equals(this.iIdNuevoBancoFormaPago)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BancoFormaPago bancoformapagoAux:this.bancoformapagos) {
				if(bancoformapagoAux.getId().equals(this.iIdNuevoBancoFormaPago)) {
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
	
	public int getIndiceActualBancoFormaPago(BancoFormaPago bancoformapago,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BancoFormaPago bancoformapagoAux:this.bancoformapagoLogic.getBancoFormaPagos()) {
				if(bancoformapagoAux.getId().equals(bancoformapago.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BancoFormaPago bancoformapagoAux:this.bancoformapagos) {
				if(bancoformapagoAux.getId().equals(bancoformapago.getId())) {
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
	
	public void setCamposBaseDesdeOriginalBancoFormaPago(BancoFormaPago bancoformapagoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BancoFormaPago bancoformapagoAux:this.bancoformapagoLogic.getBancoFormaPagos()) {
				if(bancoformapagoAux.getBancoFormaPagoOriginal().getId().equals(bancoformapagoOriginal.getId())) {
					existe=true;
					bancoformapagoOriginal.setId(bancoformapagoAux.getId());
					bancoformapagoOriginal.setVersionRow(bancoformapagoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BancoFormaPago bancoformapagoAux:this.bancoformapagos) {
				if(bancoformapagoAux.getBancoFormaPagoOriginal().getId().equals(bancoformapagoOriginal.getId())) {
					existe=true;
					bancoformapagoOriginal.setId(bancoformapagoAux.getId());
					bancoformapagoOriginal.setVersionRow(bancoformapagoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosBancoFormaPago(Boolean esParaCancelar) throws Exception {
		bancoformapagosAux=new ArrayList<BancoFormaPago>();
		bancoformapagoAux=new BancoFormaPago();
		
		if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(BancoFormaPago bancoformapagoAux:this.bancoformapagoLogic.getBancoFormaPagos()) {
					if(bancoformapagoAux.getId()<0) {
						bancoformapagosAux.add(bancoformapagoAux);
					}		
				}
				this.iIdNuevoBancoFormaPago=0L;
				this.bancoformapagoLogic.getBancoFormaPagos().removeAll(bancoformapagosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BancoFormaPago bancoformapagoAux:this.bancoformapagos) {
					if(bancoformapagoAux.getId()<0) {
						bancoformapagosAux.add(bancoformapagoAux);
					}		
				}
				this.iIdNuevoBancoFormaPago=0L;
				this.bancoformapagos.removeAll(bancoformapagosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoBancoFormaPago 
					&& this.bancoformapagoLogic.getBancoFormaPagos().size()>0
					) {
					bancoformapagoAux=this.bancoformapagoLogic.getBancoFormaPagos().get(this.bancoformapagoLogic.getBancoFormaPagos().size() - 1);
				
					if(bancoformapagoAux.getId()<0) {
						this.bancoformapagoLogic.getBancoFormaPagos().remove(bancoformapagoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoBancoFormaPago && this.bancoformapagos.size()>0) {
					bancoformapagoAux=this.bancoformapagos.get(this.bancoformapagos.size() - 1);
				
					if(bancoformapagoAux.getId()<0) {
						this.bancoformapagos.remove(bancoformapagoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoBancoFormaPago(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(bancoformapago.getId()<0) {
				this.bancoformapagoLogic.getBancoFormaPagos().remove(this.bancoformapago);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(bancoformapago.getId()<0) {
				this.bancoformapagos.remove(this.bancoformapago);
			}
		}			
	}
	
	public void setEstadosInicialesBancoFormaPago(List<BancoFormaPago> bancoformapagosAux) throws Exception {
		BancoFormaPagoConstantesFunciones.setEstadosInicialesBancoFormaPago(bancoformapagosAux);
	}
	
	public void setEstadosInicialesBancoFormaPago(BancoFormaPago bancoformapagoAux) throws Exception {
		BancoFormaPagoConstantesFunciones.setEstadosInicialesBancoFormaPago(bancoformapagoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarBancoFormaPagoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesBancoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarBancoFormaPagoActual()) {
				if(!this.isEsNuevoBancoFormaPago) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesBancoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoBancoFormaPago=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarBancoFormaPagoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Banco Forma Pago ?", "MANTENIMIENTO DE Banco Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesBancoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(BancoFormaPago bancoformapago) throws Exception {
		BancoFormaPagoConstantesFunciones.seleccionarAsignar(this.bancoformapago,bancoformapago);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarBancoFormaPago=this.isPermisoActualizarOriginalBancoFormaPago;
			
			
			this.seleccionarAsignar(bancoformapago);
			
			

			idFacturaActual=bancoformapago.getid_factura();
			this.seleccionarFacturaActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BancoFormaPagoConstantesFunciones.quitarEspaciosBancoFormaPago(this.bancoformapago,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesBancoFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.bancoformapagoSessionBean.setsFuncionBusquedaRapida(this.bancoformapagoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarFacturaActual() throws Exception {
		try	{
			Factura facturaAux=new Factura();

			if(this.idFacturaActual != null && this.idFacturaActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getEntityWithConnection(this.idFacturaActual);
					facturaAux= facturaLogic.getFactura();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				facturasForeignKey=new ArrayList<Factura>();
				facturasForeignKey.add(facturaAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoBancoFormaPago) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosBancoFormaPago(esParaCancelar);				
				this.cancelarNuevoBancoFormaPago(esParaCancelar);								
			}
			
			this.bancoformapago=new BancoFormaPago();
			
			this.inicializarBancoFormaPago();
			
			this.actualizarEstadoCeldasBotonesBancoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarBancoFormaPago() throws Exception {
		try {
			BancoFormaPagoConstantesFunciones.inicializarBancoFormaPago(this.bancoformapago);
			
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
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.bancoformapagoLogic.getBancoFormaPagos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteBancoFormaPagos(String sAccionBusqueda,List<BancoFormaPago> bancoformapagosParaReportes) throws Exception {
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
					sPathReporteFinal="BancoFormaPago"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="BancoFormaPagoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("BancoFormaPagoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="BancoFormaPago"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Banco Forma Pagos");		
		parameters.put("busquedapor", BancoFormaPagoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceBancoFormaPago=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			BancoFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			BancoFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceBancoFormaPago=new JRBeanArrayDataSource(BancoFormaPagoJInternalFrame.TraerBancoFormaPagoBeans(bancoformapagosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceBancoFormaPago);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+BancoFormaPagoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+BancoFormaPagoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(BancoFormaPagoBean.TraerBancoFormaPagoBeans(bancoformapagosParaReportes).toArray()));
							
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
				this.generarExcelReporteBancoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,bancoformapagosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalBancoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,bancoformapagosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoBancoFormaPagoActionPerformed(null);
					//this.generarExcelReporteBancoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,bancoformapagosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalBancoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,bancoformapagosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesBancoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,bancoformapagosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesBancoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,bancoformapagosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteBancoFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<BancoFormaPago> bancoformapagosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bancoformapago";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BancoFormaPagos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBancoFormaPago("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(BancoFormaPago bancoformapago : bancoformapagosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			BancoFormaPagoConstantesFunciones.generarExcelReporteDataBancoFormaPago("NORMAL",row,workbook,bancoformapago,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderBancoFormaPago(String sTipo,Row row,Workbook workbook) {
		
		BancoFormaPagoConstantesFunciones.generarExcelReporteHeaderBancoFormaPago(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalBancoFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<BancoFormaPago> bancoformapagosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bancoformapago_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BancoFormaPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(BancoFormaPago bancoformapago : bancoformapagosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(BancoFormaPagoConstantesFunciones.getBancoFormaPagoDescripcion(bancoformapago));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancoformapago.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancoformapago.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoFormaPagoConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancoformapago.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoFormaPagoConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancoformapago.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoFormaPagoConstantesFunciones.LABEL_IDFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancoformapago.getfactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancoformapago.getdetaformapago_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoFormaPagoConstantesFunciones.LABEL_IDTIPOBANCOFORMAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDTIPOBANCOFORMAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancoformapago.gettipobancoformapago_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancoformapago.getnombre_banco());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancoformapago.getnombre_girador());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancoformapago.getfecha_vence());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancoformapago.getnumero_cuenta_banco());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancoformapago.getnumero_cheque());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancoformapago.getvalor_monto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoFormaPagoConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancoformapago.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoFormaPagoConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancoformapago.getmes_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesBancoFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<BancoFormaPago> bancoformapagosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<BancoFormaPago> bancoformapagosRespaldo=null;
		
		classes=BancoFormaPagoConstantesFunciones.getClassesRelationshipsOfBancoFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.bancoformapagoLogic.setDatosCliente(this.datosCliente);
		this.bancoformapagoLogic.setDatosDeep(this.datosDeep);
		this.bancoformapagoLogic.setIsConDeep(true);
		
		bancoformapagosRespaldo=this.bancoformapagoLogic.getBancoFormaPagos();
		
		this.bancoformapagoLogic.setBancoFormaPagos(bancoformapagosParaReportes);	
		this.bancoformapagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		bancoformapagosParaReportes=this.bancoformapagoLogic.getBancoFormaPagos();
		this.bancoformapagoLogic.setBancoFormaPagos(bancoformapagosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bancoformapago_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BancoFormaPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBancoFormaPago("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(BancoFormaPago bancoformapago : bancoformapagosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderBancoFormaPago("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			BancoFormaPagoConstantesFunciones.generarExcelReporteDataBancoFormaPago("NORMAL",row,workbook,bancoformapago,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(BancoFormaPagoConstantesFunciones.getBancoFormaPagoDescripcion(bancoformapago));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoBancoFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBancoFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoBancoFormaPago.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBancoFormaPago.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessBancoFormaPago() throws Exception {		
		this.startProcessBancoFormaPago(true);
	}
	
	public void startProcessBancoFormaPago(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasBancoFormaPago ,this.jPanelParametrosReportesBancoFormaPago, this.jScrollPanelDatosBancoFormaPago,this.jPanelPaginacionBancoFormaPago, this.jScrollPanelDatosEdicionBancoFormaPago, this.jPanelAccionesBancoFormaPago,this.jPanelAccionesFormularioBancoFormaPago,this.jmenuBarBancoFormaPago,this.jmenuBarDetalleBancoFormaPago,this.jTtoolBarBancoFormaPago,this.jTtoolBarDetalleBancoFormaPago);		
		
		final JTabbedPane jTabbedPaneBusquedasBancoFormaPago=this.jTabbedPaneBusquedasBancoFormaPago; 
		
		final JPanel jPanelParametrosReportesBancoFormaPago=this.jPanelParametrosReportesBancoFormaPago;
		//final JScrollPane jScrollPanelDatosBancoFormaPago=this.jScrollPanelDatosBancoFormaPago;
		final JTable jTableDatosBancoFormaPago=this.jTableDatosBancoFormaPago;		
		final JPanel jPanelPaginacionBancoFormaPago=this.jPanelPaginacionBancoFormaPago;
		//final JScrollPane jScrollPanelDatosEdicionBancoFormaPago=this.jScrollPanelDatosEdicionBancoFormaPago;
		final JPanel jPanelAccionesBancoFormaPago=this.jPanelAccionesBancoFormaPago;
		
		JPanel jPanelCamposAuxiliarBancoFormaPago=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarBancoFormaPago=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
			jPanelCamposAuxiliarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jPanelCamposBancoFormaPago;
			jPanelAccionesFormularioAuxiliarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jPanelAccionesFormularioBancoFormaPago;
		}
		
		final JPanel jPanelCamposBancoFormaPago=jPanelCamposAuxiliarBancoFormaPago;
		final JPanel jPanelAccionesFormularioBancoFormaPago=jPanelAccionesFormularioAuxiliarBancoFormaPago;
		
		
		final JMenuBar jmenuBarBancoFormaPago=this.jmenuBarBancoFormaPago;
		final JToolBar jTtoolBarBancoFormaPago=this.jTtoolBarBancoFormaPago;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarBancoFormaPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBancoFormaPago=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
			jmenuBarDetalleAuxiliarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jmenuBarDetalleBancoFormaPago;
			jTtoolBarDetalleAuxiliarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jTtoolBarDetalleBancoFormaPago;
		}
		
		final JMenuBar jmenuBarDetalleBancoFormaPago=jmenuBarDetalleAuxiliarBancoFormaPago;
		final JToolBar jTtoolBarDetalleBancoFormaPago=jTtoolBarDetalleAuxiliarBancoFormaPago;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBancoFormaPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBancoFormaPago;
			processRunnable.jTableDatos=jTableDatosBancoFormaPago;
			processRunnable.jPanelCampos=jPanelCamposBancoFormaPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionBancoFormaPago;
			processRunnable.jPanelAcciones=jPanelAccionesBancoFormaPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBancoFormaPago;
			
			
			processRunnable.jmenuBar=jmenuBarBancoFormaPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBancoFormaPago;
			processRunnable.jTtoolBar=jTtoolBarBancoFormaPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBancoFormaPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBancoFormaPago ,jPanelParametrosReportesBancoFormaPago,jTableDatosBancoFormaPago, /*jScrollPanelDatosBancoFormaPago,*/jPanelCamposBancoFormaPago,jPanelPaginacionBancoFormaPago, /*jScrollPanelDatosEdicionBancoFormaPago,*/ jPanelAccionesBancoFormaPago,jPanelAccionesFormularioBancoFormaPago,jmenuBarBancoFormaPago,jmenuBarDetalleBancoFormaPago,jTtoolBarBancoFormaPago,jTtoolBarDetalleBancoFormaPago);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBancoFormaPago ,jPanelParametrosReportesBancoFormaPago, jScrollPanelDatosBancoFormaPago,jPanelPaginacionBancoFormaPago, jScrollPanelDatosEdicionBancoFormaPago, jPanelAccionesBancoFormaPago,jPanelAccionesFormularioBancoFormaPago,jmenuBarBancoFormaPago,jmenuBarDetalleBancoFormaPago,jTtoolBarBancoFormaPago,jTtoolBarDetalleBancoFormaPago);
						
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
	
	public void finishProcessBancoFormaPago() {// throws Exception 
		this.finishProcessBancoFormaPago(true);
	}
	
	public void finishProcessBancoFormaPago(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasBancoFormaPago ,this.jPanelParametrosReportesBancoFormaPago, this.jScrollPanelDatosBancoFormaPago,this.jPanelPaginacionBancoFormaPago, this.jScrollPanelDatosEdicionBancoFormaPago, this.jPanelAccionesBancoFormaPago,this.jPanelAccionesFormularioBancoFormaPago,this.jmenuBarBancoFormaPago,this.jmenuBarDetalleBancoFormaPago,this.jTtoolBarBancoFormaPago,this.jTtoolBarDetalleBancoFormaPago);		
		
		final JTabbedPane jTabbedPaneBusquedasBancoFormaPago=this.jTabbedPaneBusquedasBancoFormaPago; 
		
		final JPanel jPanelParametrosReportesBancoFormaPago=this.jPanelParametrosReportesBancoFormaPago;
		//final JScrollPane jScrollPanelDatosBancoFormaPago=this.jScrollPanelDatosBancoFormaPago;
		final JTable jTableDatosBancoFormaPago=this.jTableDatosBancoFormaPago;		
		final JPanel jPanelPaginacionBancoFormaPago=this.jPanelPaginacionBancoFormaPago;
		//final JScrollPane jScrollPanelDatosEdicionBancoFormaPago=this.jScrollPanelDatosEdicionBancoFormaPago;
		final JPanel jPanelAccionesBancoFormaPago=this.jPanelAccionesBancoFormaPago;
		
		JPanel jPanelCamposAuxiliarBancoFormaPago=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarBancoFormaPago=new JPanel();
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
			jPanelCamposAuxiliarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jPanelCamposBancoFormaPago;
			jPanelAccionesFormularioAuxiliarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jPanelAccionesFormularioBancoFormaPago;
		}
		
		final JPanel jPanelCamposBancoFormaPago=jPanelCamposAuxiliarBancoFormaPago;
		final JPanel jPanelAccionesFormularioBancoFormaPago=jPanelAccionesFormularioAuxiliarBancoFormaPago;
		
		
		final JMenuBar jmenuBarBancoFormaPago=this.jmenuBarBancoFormaPago;		
		final JToolBar jTtoolBarBancoFormaPago=this.jTtoolBarBancoFormaPago;
				
		JMenuBar jmenuBarDetalleAuxiliarBancoFormaPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBancoFormaPago=new JToolBar();
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
			jmenuBarDetalleAuxiliarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jmenuBarDetalleBancoFormaPago;
			jTtoolBarDetalleAuxiliarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jTtoolBarDetalleBancoFormaPago;		
		}
		
		final JMenuBar jmenuBarDetalleBancoFormaPago=jmenuBarDetalleAuxiliarBancoFormaPago;
		final JToolBar jTtoolBarDetalleBancoFormaPago=jTtoolBarDetalleAuxiliarBancoFormaPago;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBancoFormaPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBancoFormaPago;
			processRunnable.jTableDatos=jTableDatosBancoFormaPago;
			processRunnable.jPanelCampos=jPanelCamposBancoFormaPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionBancoFormaPago;
			processRunnable.jPanelAcciones=jPanelAccionesBancoFormaPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBancoFormaPago;
			
			
			processRunnable.jmenuBar=jmenuBarBancoFormaPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBancoFormaPago;
			processRunnable.jTtoolBar=jTtoolBarBancoFormaPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBancoFormaPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasBancoFormaPago ,jPanelParametrosReportesBancoFormaPago, jTableDatosBancoFormaPago,/*jScrollPanelDatosBancoFormaPago,*/jPanelCamposBancoFormaPago,jPanelPaginacionBancoFormaPago, /*jScrollPanelDatosEdicionBancoFormaPago,*/ jPanelAccionesBancoFormaPago,jPanelAccionesFormularioBancoFormaPago,jmenuBarBancoFormaPago,jmenuBarDetalleBancoFormaPago,jTtoolBarBancoFormaPago,jTtoolBarDetalleBancoFormaPago));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesBancoFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarBancoFormaPago(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuBancoFormaPago(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarBancoFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarBancoFormaPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleBancoFormaPago,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuBancoFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarBancoFormaPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleBancoFormaPago,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.bancoformapagoConstantesFunciones.getsFinalQueryBancoFormaPago();
		String  finalQueryPaginacionTodos=this.bancoformapagoConstantesFunciones.getsFinalQueryBancoFormaPago();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=BancoFormaPagoConstantesFunciones.getArrayColumnasGlobalesNoBancoFormaPago(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=BancoFormaPagoConstantesFunciones.getArrayColumnasGlobalesBancoFormaPago(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,BancoFormaPagoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.bancoformapagosEliminados= new ArrayList<BancoFormaPago>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessBancoFormaPago();
		
				///*BancoFormaPagoSessionBean*/this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
			
			if(this.bancoformapagoSessionBean==null) {
				this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
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
					this.iNumeroPaginacion=BancoFormaPagoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=BancoFormaPagoConstantesFunciones.getClassesForeignKeysOfBancoFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/bancoformapago."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			bancoformapagosAux= new ArrayList<BancoFormaPago>();
			
				
			bancoformapagoLogic.setDatosCliente(this.datosCliente);
			bancoformapagoLogic.setDatosDeep(this.datosDeep);
			bancoformapagoLogic.setIsConDeep(true);
			
			
			bancoformapagoLogic.getBancoFormaPagoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					bancoformapagoLogic.getTodosBancoFormaPagos(finalQueryGlobal,pagination);
					
					//bancoformapagoLogic.getTodosBancoFormaPagosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(bancoformapagoLogic.getBancoFormaPagos()==null|| bancoformapagoLogic.getBancoFormaPagos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bancoformapagosAux= new ArrayList<BancoFormaPago>();
							bancoformapagosAux.addAll(bancoformapagoLogic.getBancoFormaPagos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoformapagosAux= new ArrayList<BancoFormaPago>();
							bancoformapagosAux.addAll(bancoformapagos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bancoformapagoLogic.getTodosBancoFormaPagos(finalQueryGlobal+"",this.pagination);												
							
							//bancoformapagoLogic.getTodosBancoFormaPagosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteBancoFormaPagos("Todos",bancoformapagoLogic.getBancoFormaPagos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bancoformapagoLogic.setBancoFormaPagos(new ArrayList<BancoFormaPago>());					
							bancoformapagoLogic.getBancoFormaPagos().addAll(bancoformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoformapagos=new ArrayList<BancoFormaPago>();
							bancoformapagos.addAll(bancoformapagosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idBancoFormaPago=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idBancoFormaPago=this.idActual;
				
				} else if(this.idBancoFormaPagoActual!=null && this.idBancoFormaPagoActual!=0L) {
					idBancoFormaPago=idBancoFormaPagoActual;
				}
				
					
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndicePorId(idBancoFormaPago);
				
				this.bancoformapagos=new ArrayList<BancoFormaPago>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					bancoformapagoLogic.getEntity(idBancoFormaPago);
					
					//bancoformapagoLogic.getEntityWithConnection(idBancoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoformapagoLogic.setBancoFormaPagos(new ArrayList<BancoFormaPago>());
					bancoformapagoLogic.getBancoFormaPagos().add(bancoformapagoLogic.getBancoFormaPago());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bancoformapagos=new ArrayList<BancoFormaPago>();
					this.bancoformapagos.add(bancoformapago);
				}
				
				if(bancoformapagoLogic.getBancoFormaPago()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBancoFormaPago")) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdBancoFormaPago(id_tipo_banco_forma_pagoFK_IdBancoFormaPago);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bancoformapagoLogic.getBancoFormaPagosFK_IdBancoFormaPago(finalQueryGlobal,pagination,id_tipo_banco_forma_pagoFK_IdBancoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdBancoFormaPago(id_tipo_banco_forma_pagoFK_IdBancoFormaPago);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdBancoFormaPago(id_tipo_banco_forma_pagoFK_IdBancoFormaPago);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bancoformapagoLogic.getBancoFormaPagos()==null||bancoformapagoLogic.getBancoFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bancoformapagos==null|| bancoformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagosAux=new ArrayList<BancoFormaPago>();
						bancoformapagosAux.addAll(bancoformapagoLogic.getBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoformapagosAux=new ArrayList<BancoFormaPago>();
							bancoformapagosAux.addAll(bancoformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bancoformapagoLogic.getBancoFormaPagosFK_IdBancoFormaPago(finalQueryGlobal,pagination,id_tipo_banco_forma_pagoFK_IdBancoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdBancoFormaPago(id_tipo_banco_forma_pagoFK_IdBancoFormaPago);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdBancoFormaPago(id_tipo_banco_forma_pagoFK_IdBancoFormaPago);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBancoFormaPagos("FK_IdBancoFormaPago",bancoformapagoLogic.getBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBancoFormaPagos("FK_IdBancoFormaPago",bancoformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagoLogic.setBancoFormaPagos(new ArrayList<BancoFormaPago>());
						bancoformapagoLogic.getBancoFormaPagos().addAll(bancoformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoformapagos=new ArrayList<BancoFormaPago>();
							bancoformapagos.addAll(bancoformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdDetaFormaPago")) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdDetaFormaPago(id_deta_forma_pagoFK_IdDetaFormaPago);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bancoformapagoLogic.getBancoFormaPagosFK_IdDetaFormaPago(finalQueryGlobal,pagination,id_deta_forma_pagoFK_IdDetaFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdDetaFormaPago(id_deta_forma_pagoFK_IdDetaFormaPago);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdDetaFormaPago(id_deta_forma_pagoFK_IdDetaFormaPago);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bancoformapagoLogic.getBancoFormaPagos()==null||bancoformapagoLogic.getBancoFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bancoformapagos==null|| bancoformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagosAux=new ArrayList<BancoFormaPago>();
						bancoformapagosAux.addAll(bancoformapagoLogic.getBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoformapagosAux=new ArrayList<BancoFormaPago>();
							bancoformapagosAux.addAll(bancoformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bancoformapagoLogic.getBancoFormaPagosFK_IdDetaFormaPago(finalQueryGlobal,pagination,id_deta_forma_pagoFK_IdDetaFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdDetaFormaPago(id_deta_forma_pagoFK_IdDetaFormaPago);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdDetaFormaPago(id_deta_forma_pagoFK_IdDetaFormaPago);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBancoFormaPagos("FK_IdDetaFormaPago",bancoformapagoLogic.getBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBancoFormaPagos("FK_IdDetaFormaPago",bancoformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagoLogic.setBancoFormaPagos(new ArrayList<BancoFormaPago>());
						bancoformapagoLogic.getBancoFormaPagos().addAll(bancoformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoformapagos=new ArrayList<BancoFormaPago>();
							bancoformapagos.addAll(bancoformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bancoformapagoLogic.getBancoFormaPagosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bancoformapagoLogic.getBancoFormaPagos()==null||bancoformapagoLogic.getBancoFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bancoformapagos==null|| bancoformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagosAux=new ArrayList<BancoFormaPago>();
						bancoformapagosAux.addAll(bancoformapagoLogic.getBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoformapagosAux=new ArrayList<BancoFormaPago>();
							bancoformapagosAux.addAll(bancoformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bancoformapagoLogic.getBancoFormaPagosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBancoFormaPagos("FK_IdEjercicio",bancoformapagoLogic.getBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBancoFormaPagos("FK_IdEjercicio",bancoformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagoLogic.setBancoFormaPagos(new ArrayList<BancoFormaPago>());
						bancoformapagoLogic.getBancoFormaPagos().addAll(bancoformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoformapagos=new ArrayList<BancoFormaPago>();
							bancoformapagos.addAll(bancoformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bancoformapagoLogic.getBancoFormaPagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bancoformapagoLogic.getBancoFormaPagos()==null||bancoformapagoLogic.getBancoFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bancoformapagos==null|| bancoformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagosAux=new ArrayList<BancoFormaPago>();
						bancoformapagosAux.addAll(bancoformapagoLogic.getBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoformapagosAux=new ArrayList<BancoFormaPago>();
							bancoformapagosAux.addAll(bancoformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bancoformapagoLogic.getBancoFormaPagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBancoFormaPagos("FK_IdEmpresa",bancoformapagoLogic.getBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBancoFormaPagos("FK_IdEmpresa",bancoformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagoLogic.setBancoFormaPagos(new ArrayList<BancoFormaPago>());
						bancoformapagoLogic.getBancoFormaPagos().addAll(bancoformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoformapagos=new ArrayList<BancoFormaPago>();
							bancoformapagos.addAll(bancoformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFactura")) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bancoformapagoLogic.getBancoFormaPagosFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bancoformapagoLogic.getBancoFormaPagos()==null||bancoformapagoLogic.getBancoFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bancoformapagos==null|| bancoformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagosAux=new ArrayList<BancoFormaPago>();
						bancoformapagosAux.addAll(bancoformapagoLogic.getBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoformapagosAux=new ArrayList<BancoFormaPago>();
							bancoformapagosAux.addAll(bancoformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bancoformapagoLogic.getBancoFormaPagosFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBancoFormaPagos("FK_IdFactura",bancoformapagoLogic.getBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBancoFormaPagos("FK_IdFactura",bancoformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagoLogic.setBancoFormaPagos(new ArrayList<BancoFormaPago>());
						bancoformapagoLogic.getBancoFormaPagos().addAll(bancoformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoformapagos=new ArrayList<BancoFormaPago>();
							bancoformapagos.addAll(bancoformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bancoformapagoLogic.getBancoFormaPagosFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bancoformapagoLogic.getBancoFormaPagos()==null||bancoformapagoLogic.getBancoFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bancoformapagos==null|| bancoformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagosAux=new ArrayList<BancoFormaPago>();
						bancoformapagosAux.addAll(bancoformapagoLogic.getBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoformapagosAux=new ArrayList<BancoFormaPago>();
							bancoformapagosAux.addAll(bancoformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bancoformapagoLogic.getBancoFormaPagosFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBancoFormaPagos("FK_IdPeriodo",bancoformapagoLogic.getBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBancoFormaPagos("FK_IdPeriodo",bancoformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagoLogic.setBancoFormaPagos(new ArrayList<BancoFormaPago>());
						bancoformapagoLogic.getBancoFormaPagos().addAll(bancoformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoformapagos=new ArrayList<BancoFormaPago>();
							bancoformapagos.addAll(bancoformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bancoformapagoLogic.getBancoFormaPagosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bancoformapagoLogic.getBancoFormaPagos()==null||bancoformapagoLogic.getBancoFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bancoformapagos==null|| bancoformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagosAux=new ArrayList<BancoFormaPago>();
						bancoformapagosAux.addAll(bancoformapagoLogic.getBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoformapagosAux=new ArrayList<BancoFormaPago>();
							bancoformapagosAux.addAll(bancoformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bancoformapagoLogic.getBancoFormaPagosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBancoFormaPagos("FK_IdSucursal",bancoformapagoLogic.getBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBancoFormaPagos("FK_IdSucursal",bancoformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagoLogic.setBancoFormaPagos(new ArrayList<BancoFormaPago>());
						bancoformapagoLogic.getBancoFormaPagos().addAll(bancoformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoformapagos=new ArrayList<BancoFormaPago>();
							bancoformapagos.addAll(bancoformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesBancoFormaPago();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessBancoFormaPago();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=bancoformapagoLogic.getBancoFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bancoformapagos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=bancoformapagoLogic.getBancoFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bancoformapagos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(BancoFormaPago bancoformapago) {
		Boolean permite=true;
		
		if(this.bancoformapago.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=BancoFormaPagoConstantesFunciones.getOrderByListaBancoFormaPago();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=BancoFormaPagoConstantesFunciones.getOrderByListaBancoFormaPago();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BancoFormaPago bancoformapago:bancoformapagoLogic.getBancoFormaPagos()) {
				if(bancoformapago.getsType().equals(Constantes2.S_TOTALES)) {
					bancoformapagoTotales=bancoformapago;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BancoFormaPago bancoformapago:this.bancoformapagos) {
				if(bancoformapago.getsType().equals(Constantes2.S_TOTALES)) {
					bancoformapagoTotales=bancoformapago;
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
			this.bancoformapagoAux=new BancoFormaPago();
			this.bancoformapagoAux.setsType(Constantes2.S_TOTALES);
			this.bancoformapagoAux.setIsNew(false);
			this.bancoformapagoAux.setIsChanged(false);
			this.bancoformapagoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				BancoFormaPagoConstantesFunciones.TotalizarValoresFilaBancoFormaPago(this.bancoformapagoLogic.getBancoFormaPagos(),this.bancoformapagoAux);
				
				this.bancoformapagoLogic.getBancoFormaPagos().add(this.bancoformapagoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				BancoFormaPagoConstantesFunciones.TotalizarValoresFilaBancoFormaPago(this.bancoformapagos,this.bancoformapagoAux);
				
				this.bancoformapagos.add(this.bancoformapagoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		bancoformapagoTotales=new BancoFormaPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.bancoformapagoLogic.getBancoFormaPagos().remove(bancoformapagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.bancoformapagos.remove(bancoformapagoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		bancoformapagoTotales=new BancoFormaPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BancoFormaPago bancoformapago:bancoformapagoLogic.getBancoFormaPagos()) {
				if(bancoformapago.getsType().equals(Constantes2.S_TOTALES)) {
					bancoformapagoTotales=bancoformapago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BancoFormaPagoConstantesFunciones.TotalizarValoresFilaBancoFormaPago(this.bancoformapagoLogic.getBancoFormaPagos(),bancoformapagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BancoFormaPago bancoformapago:this.bancoformapagos) {
				if(bancoformapago.getsType().equals(Constantes2.S_TOTALES)) {
					bancoformapagoTotales=bancoformapago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BancoFormaPagoConstantesFunciones.TotalizarValoresFilaBancoFormaPago(this.bancoformapagos,bancoformapagoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getBancoFormaPagosFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancoFormaPagosFK_IdBancoFormaPago()throws Exception {
		try {
			sAccionBusqueda="FK_IdBancoFormaPago";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancoFormaPagosFK_IdDetaFormaPago()throws Exception {
		try {
			sAccionBusqueda="FK_IdDetaFormaPago";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancoFormaPagosFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancoFormaPagosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancoFormaPagosFK_IdFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancoFormaPagosFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancoFormaPagosFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancoFormaPagosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getBancoFormaPagosFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoformapagoLogic.getBancoFormaPagosFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancoFormaPagosFK_IdBancoFormaPago(String sFinalQuery,Long id_tipo_banco_forma_pago)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoformapagoLogic.getBancoFormaPagosFK_IdBancoFormaPago(sFinalQuery,this.pagination,id_tipo_banco_forma_pago);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancoFormaPagosFK_IdDetaFormaPago(String sFinalQuery,Long id_deta_forma_pago)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoformapagoLogic.getBancoFormaPagosFK_IdDetaFormaPago(sFinalQuery,this.pagination,id_deta_forma_pago);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancoFormaPagosFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoformapagoLogic.getBancoFormaPagosFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancoFormaPagosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoformapagoLogic.getBancoFormaPagosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancoFormaPagosFK_IdFactura(String sFinalQuery,Long id_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoformapagoLogic.getBancoFormaPagosFK_IdFactura(sFinalQuery,this.pagination,id_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancoFormaPagosFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoformapagoLogic.getBancoFormaPagosFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancoFormaPagosFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoformapagoLogic.getBancoFormaPagosFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancoFormaPagosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoformapagoLogic.getBancoFormaPagosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosBancoFormaPago() {
		this.isPermisoTodoBancoFormaPago=false;
		this.isPermisoNuevoBancoFormaPago=false;
		this.isPermisoActualizarBancoFormaPago=false;
		this.isPermisoActualizarOriginalBancoFormaPago=false;
		this.isPermisoEliminarBancoFormaPago=false;
		this.isPermisoGuardarCambiosBancoFormaPago=false;
		this.isPermisoConsultaBancoFormaPago=false;
		this.isPermisoBusquedaBancoFormaPago=false;
		this.isPermisoReporteBancoFormaPago=false;		
		this.isPermisoOrdenBancoFormaPago=false;		
		this.isPermisoPaginacionMedioBancoFormaPago=false;		
		this.isPermisoPaginacionAltoBancoFormaPago=false;
		this.isPermisoPaginacionTodoBancoFormaPago=false;
		this.isPermisoCopiarBancoFormaPago=false;		
		this.isPermisoVerFormBancoFormaPago=false;		
		this.isPermisoDuplicarBancoFormaPago=false;		
		this.isPermisoOrdenBancoFormaPago=false;		
	}
	
	public void setPermisosUsuarioBancoFormaPago(Boolean isPermiso) {
		this.isPermisoTodoBancoFormaPago=isPermiso;
		this.isPermisoNuevoBancoFormaPago=isPermiso;
		this.isPermisoActualizarBancoFormaPago=isPermiso;
		this.isPermisoActualizarOriginalBancoFormaPago=isPermiso;
		this.isPermisoEliminarBancoFormaPago=isPermiso;
		this.isPermisoGuardarCambiosBancoFormaPago=isPermiso;
		this.isPermisoConsultaBancoFormaPago=isPermiso;
		this.isPermisoBusquedaBancoFormaPago=isPermiso;
		this.isPermisoReporteBancoFormaPago=isPermiso;
		this.isPermisoOrdenBancoFormaPago=isPermiso;		
		this.isPermisoPaginacionMedioBancoFormaPago=isPermiso;		
		this.isPermisoPaginacionAltoBancoFormaPago=isPermiso;		
		this.isPermisoPaginacionTodoBancoFormaPago=isPermiso;		
		this.isPermisoCopiarBancoFormaPago=isPermiso;		
		this.isPermisoVerFormBancoFormaPago=isPermiso;		
		this.isPermisoDuplicarBancoFormaPago=isPermiso;
		this.isPermisoOrdenBancoFormaPago=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioBancoFormaPago(Boolean isPermiso) {
		//this.isPermisoTodoBancoFormaPago=isPermiso;
		this.isPermisoNuevoBancoFormaPago=isPermiso;
		this.isPermisoActualizarBancoFormaPago=isPermiso;
		this.isPermisoActualizarOriginalBancoFormaPago=isPermiso;
		this.isPermisoEliminarBancoFormaPago=isPermiso;
		this.isPermisoGuardarCambiosBancoFormaPago=isPermiso;
		//this.isPermisoConsultaBancoFormaPago=isPermiso;
		//this.isPermisoBusquedaBancoFormaPago=isPermiso;
		//this.isPermisoReporteBancoFormaPago=isPermiso;
		//this.isPermisoOrdenBancoFormaPago=isPermiso;		
		//this.isPermisoPaginacionMedioBancoFormaPago=isPermiso;		
		//this.isPermisoPaginacionAltoBancoFormaPago=isPermiso;		
		//this.isPermisoPaginacionTodoBancoFormaPago=isPermiso;		
		//this.isPermisoCopiarBancoFormaPago=isPermiso;		
		//this.isPermisoDuplicarBancoFormaPago=isPermiso;
		//this.isPermisoOrdenBancoFormaPago=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioBancoFormaPagoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(BancoFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebBancoFormaPago(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioBancoFormaPagoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioBancoFormaPagoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionBancoFormaPagoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioBancoFormaPagoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioBancoFormaPago() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(BancoFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, BancoFormaPagoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoBancoFormaPago=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarBancoFormaPago=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalBancoFormaPago=this.isPermisoActualizarBancoFormaPago;
			this.isPermisoEliminarBancoFormaPago=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosBancoFormaPago=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaBancoFormaPago=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaBancoFormaPago=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoBancoFormaPago=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteBancoFormaPago=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBancoFormaPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioBancoFormaPago=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoBancoFormaPago=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoBancoFormaPago=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarBancoFormaPago=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormBancoFormaPago=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarBancoFormaPago=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBancoFormaPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosBancoFormaPago.setToolTipText(this.jTableDatosBancoFormaPago.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioBancoFormaPago(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioBancoFormaPago(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(BancoFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(BancoFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioBancoFormaPago() throws Exception {
		Reporte reporte=null;
		
		
		
		
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
	public void inicializarCombosForeignKeyBancoFormaPagoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.facturasForeignKey=new ArrayList();
				this.detaformapagosForeignKey=new ArrayList();
				this.tipobancoformapagosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyBancoFormaPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(BancoFormaPagoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyBancoFormaPagoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDetaFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoBancoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFacturaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FacturaConstantesFunciones.SFINALQUERY;

				this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyDetaFormaPagoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.detaformapagosForeignKey==null||this.detaformapagosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DetaFormaPagoConstantesFunciones.getArrayColumnasGlobalesDetaFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetaFormaPagoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DetaFormaPagoConstantesFunciones.SFINALQUERY;

				this.cargarCombosDetaFormaPagosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoBancoFormaPagoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipobancoformapagosForeignKey==null||this.tipobancoformapagosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoBancoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoBancoFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoBancoFormaPagoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoBancoFormaPagoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoBancoFormaPagosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyBancoFormaPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			BancoFormaPagoParameterReturnGeneral bancoformapagoReturnGeneral=new BancoFormaPagoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.bancoformapagoConstantesFunciones.cargarid_empresaBancoFormaPago)
					 || (this.esRecargarFks && this.bancoformapagoConstantesFunciones.cargarid_empresaBancoFormaPago)) {

					if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+bancoformapagoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.bancoformapagoConstantesFunciones.cargarid_sucursalBancoFormaPago)
					 || (this.esRecargarFks && this.bancoformapagoConstantesFunciones.cargarid_sucursalBancoFormaPago)) {

					if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+bancoformapagoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.bancoformapagoConstantesFunciones.cargarid_ejercicioBancoFormaPago)
					 || (this.esRecargarFks && this.bancoformapagoConstantesFunciones.cargarid_ejercicioBancoFormaPago)) {

					if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+bancoformapagoSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.bancoformapagoConstantesFunciones.cargarid_periodoBancoFormaPago)
					 || (this.esRecargarFks && this.bancoformapagoConstantesFunciones.cargarid_periodoBancoFormaPago)) {

					if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+bancoformapagoSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalFactura="";

				if(((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0) && this.bancoformapagoConstantesFunciones.cargarid_facturaBancoFormaPago)
					 || (this.esRecargarFks && this.bancoformapagoConstantesFunciones.cargarid_facturaBancoFormaPago)) {

					if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFactura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

						finalQueryGlobalFactura=Funciones.GetFinalQueryAppend(finalQueryGlobalFactura, "");
						finalQueryGlobalFactura+=FacturaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFactura=" WHERE " + ConstantesSql.ID + "="+bancoformapagoSessionBean.getlidFacturaActual();
					}
				} else {
					finalQueryGlobalFactura="NONE";
				}


				String finalQueryGlobalDetaFormaPago="";

				if(((this.detaformapagosForeignKey==null||this.detaformapagosForeignKey.size()<=0) && this.bancoformapagoConstantesFunciones.cargarid_deta_forma_pagoBancoFormaPago)
					 || (this.esRecargarFks && this.bancoformapagoConstantesFunciones.cargarid_deta_forma_pagoBancoFormaPago)) {

					if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionDetaFormaPago()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DetaFormaPagoConstantesFunciones.getArrayColumnasGlobalesDetaFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDetaFormaPago=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetaFormaPagoConstantesFunciones.TABLENAME);

						finalQueryGlobalDetaFormaPago=Funciones.GetFinalQueryAppend(finalQueryGlobalDetaFormaPago, "");
						finalQueryGlobalDetaFormaPago+=DetaFormaPagoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDetaFormaPagosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDetaFormaPago=" WHERE " + ConstantesSql.ID + "="+bancoformapagoSessionBean.getlidDetaFormaPagoActual();
					}
				} else {
					finalQueryGlobalDetaFormaPago="NONE";
				}


				String finalQueryGlobalTipoBancoFormaPago="";

				if(((this.tipobancoformapagosForeignKey==null||this.tipobancoformapagosForeignKey.size()<=0) && this.bancoformapagoConstantesFunciones.cargarid_tipo_banco_forma_pagoBancoFormaPago)
					 || (this.esRecargarFks && this.bancoformapagoConstantesFunciones.cargarid_tipo_banco_forma_pagoBancoFormaPago)) {

					if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionTipoBancoFormaPago()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoBancoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoBancoFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoBancoFormaPago=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoBancoFormaPagoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoBancoFormaPago=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoBancoFormaPago, "");
						finalQueryGlobalTipoBancoFormaPago+=TipoBancoFormaPagoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoBancoFormaPagosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoBancoFormaPago=" WHERE " + ConstantesSql.ID + "="+bancoformapagoSessionBean.getlidTipoBancoFormaPagoActual();
					}
				} else {
					finalQueryGlobalTipoBancoFormaPago="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.bancoformapagoConstantesFunciones.cargarid_anioBancoFormaPago)
					 || (this.esRecargarFks && this.bancoformapagoConstantesFunciones.cargarid_anioBancoFormaPago)) {

					if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+bancoformapagoSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.bancoformapagoConstantesFunciones.cargarid_mesBancoFormaPago)
					 || (this.esRecargarFks && this.bancoformapagoConstantesFunciones.cargarid_mesBancoFormaPago)) {

					if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+bancoformapagoSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				bancoformapagoReturnGeneral=bancoformapagoLogic.cargarCombosLoteForeignKeyBancoFormaPago(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalFactura,finalQueryGlobalDetaFormaPago,finalQueryGlobalTipoBancoFormaPago,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=bancoformapagoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=bancoformapagoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=bancoformapagoReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=bancoformapagoReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalFactura.equals("NONE")) {
				this.facturasForeignKey=bancoformapagoReturnGeneral.getfacturasForeignKey();
			}

			if(!finalQueryGlobalDetaFormaPago.equals("NONE")) {
				this.detaformapagosForeignKey=bancoformapagoReturnGeneral.getdetaformapagosForeignKey();
			}

			if(!finalQueryGlobalTipoBancoFormaPago.equals("NONE")) {
				this.tipobancoformapagosForeignKey=bancoformapagoReturnGeneral.gettipobancoformapagosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=bancoformapagoReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=bancoformapagoReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyBancoFormaPago()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyFactura();
			this.addItemDefectoCombosForeignKeyDetaFormaPago();
			this.addItemDefectoCombosForeignKeyTipoBancoFormaPago();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.bancoformapagoSessionBean==null) {
				this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
			}

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFactura()throws Exception {
		try {

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				Factura factura=new Factura();
				FacturaConstantesFunciones.setFacturaDescripcion(factura,Constantes.SMENSAJE_ESCOJA_OPCION);
				factura.setId(null);

				if(!FacturaConstantesFunciones.ExisteEnLista(this.facturasForeignKey,factura,true)) {

					this.facturasForeignKey.add(0,factura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyDetaFormaPago()throws Exception {
		try {

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionDetaFormaPago()) {
				DetaFormaPago detaformapago=new DetaFormaPago();
				DetaFormaPagoConstantesFunciones.setDetaFormaPagoDescripcion(detaformapago,Constantes.SMENSAJE_ESCOJA_OPCION);
				detaformapago.setId(null);

				if(!DetaFormaPagoConstantesFunciones.ExisteEnLista(this.detaformapagosForeignKey,detaformapago,true)) {

					this.detaformapagosForeignKey.add(0,detaformapago);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoBancoFormaPago()throws Exception {
		try {

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionTipoBancoFormaPago()) {
				TipoBancoFormaPago tipobancoformapago=new TipoBancoFormaPago();
				TipoBancoFormaPagoConstantesFunciones.setTipoBancoFormaPagoDescripcion(tipobancoformapago,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipobancoformapago.setId(null);

				if(!TipoBancoFormaPagoConstantesFunciones.ExisteEnLista(this.tipobancoformapagosForeignKey,tipobancoformapago,true)) {

					this.tipobancoformapagosForeignKey.add(0,tipobancoformapago);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.bancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyBancoFormaPago()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyBancoFormaPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyBancoFormaPago()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
				this.bancoformapago.setfecha_vence(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyBancoFormaPago();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyBancoFormaPago(BancoFormaPago bancoformapago)throws Exception {	
		try {
			
			this.setActualFacturaForeignKey(bancoformapago.getid_factura(),false,"Formulario");
			this.setActualDetaFormaPagoForeignKey(bancoformapago.getid_deta_forma_pago(),false,"Formulario");
			this.setActualTipoBancoFormaPagoForeignKey(bancoformapago.getid_tipo_banco_forma_pago(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyBancoFormaPago(BancoFormaPago bancoformapago,String sTipoEvento)throws Exception {	
		try {
			
			

				if(bancoformapago.getFactura()!=null && !sTipoEvento.equals("id_facturaBancoFormaPago")) { //sTipoEvento Evita Bucle Infinito

					this.facturasForeignKey=new ArrayList<Factura>();
					this.facturasForeignKey.add(bancoformapago.getFactura());

					this.addItemDefectoCombosForeignKeyFactura();
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyBancoFormaPago()throws Exception {	
		try {
			
			this.setActualFacturaForeignKey(this.bancoformapagoConstantesFunciones.getid_factura(),false,"Formulario");
			this.setActualDetaFormaPagoForeignKey(this.bancoformapagoConstantesFunciones.getid_deta_forma_pago(),false,"Formulario");
			this.setActualTipoBancoFormaPagoForeignKey(this.bancoformapagoConstantesFunciones.getid_tipo_banco_forma_pago(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyBancoFormaPago()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_ejercicioBancoFormaPago.getSelectedItem();
					this.setActualAnioForeignKey(ejercicioActual.getid_anio(),false,"Formulario");
				}

				if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_periodoBancoFormaPago.getSelectedItem();
					this.setActualMesForeignKey(periodoActual.getid_mes(),false,"Formulario");
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyBancoFormaPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyBancoFormaPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroBancoFormaPago()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyBancoFormaPago()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameFacturasForeignKey("Todos");
			this.cargarCombosFrameDetaFormaPagosForeignKey("Todos");
			this.cargarCombosFrameTipoBancoFormaPagosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyBancoFormaPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDetaFormaPagosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoBancoFormaPagosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyBancoFormaPago()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_empresaBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_empresaBancoFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_empresaBancoFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_sucursalBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_sucursalBancoFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_sucursalBancoFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_ejercicioBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_ejercicioBancoFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_ejercicioBancoFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_periodoBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_periodoBancoFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_periodoBancoFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_facturaBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_facturaBancoFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_facturaBancoFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_deta_forma_pagoBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_deta_forma_pagoBancoFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_deta_forma_pagoBancoFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_anioBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_anioBancoFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_anioBancoFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_mesBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_mesBancoFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_mesBancoFormaPago.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


















	
	

	public BancoFormaPagoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public BancoFormaPagoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public BancoFormaPagoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean(); 
		this.bancoformapagoConstantesFunciones=new BancoFormaPagoConstantesFunciones(); 
		this.bancoformapagoBean=new BancoFormaPago();//(this.bancoformapagoConstantesFunciones); 		
		this.bancoformapagoReturnGeneral=new BancoFormaPagoParameterReturnGeneral(); 
		
		this.bancoformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bancoformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public BancoFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public BancoFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public BancoFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessBancoFormaPago(true);
			
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
			
			this.bancoformapagoConstantesFunciones=new BancoFormaPagoConstantesFunciones(); 
			this.bancoformapagoBean=new BancoFormaPago();//this.bancoformapagoConstantesFunciones); 			
			this.bancoformapagoReturnGeneral=new BancoFormaPagoParameterReturnGeneral(); 
		
			BancoFormaPagoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Banco Forma Pago Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.bancoformapago=new BancoFormaPago();
			this.bancoformapagos = new ArrayList<BancoFormaPago>();
			this.bancoformapagosAux = new ArrayList<BancoFormaPago>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic=new BancoFormaPagoLogic();
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}
			
			//this.bancoformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.bancoformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormBancoFormaPago);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoBancoFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBancoFormaPago);	
					}
					
					if(this.jInternalFrameImportacionBancoFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBancoFormaPago);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByBancoFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByBancoFormaPago);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormBancoFormaPago);
				this.jInternalFrameDetalleFormBancoFormaPago.setVisible(false);
				this.jInternalFrameDetalleFormBancoFormaPago.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoBancoFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBancoFormaPago);
					this.jInternalFrameReporteDinamicoBancoFormaPago.setVisible(false);
					this.jInternalFrameReporteDinamicoBancoFormaPago.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionBancoFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionBancoFormaPago);
					this.jInternalFrameImportacionBancoFormaPago.setVisible(false);
					this.jInternalFrameImportacionBancoFormaPago.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByBancoFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByBancoFormaPago);
					this.jInternalFrameOrderByBancoFormaPago.setVisible(false);
					this.jInternalFrameOrderByBancoFormaPago.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idBancoFormaPagoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=BancoFormaPagoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.bancoformapagoReturnGeneral=new BancoFormaPagoParameterReturnGeneral();
			
			this.bancoformapagoParameterGeneral=new BancoFormaPagoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.bancoformapagoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(BancoFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BancoFormaPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.bancoformapagoSessionBean.getEsGuardarRelacionado(),this.bancoformapagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BancoFormaPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.bancoformapagoSessionBean.getEsGuardarRelacionado(),this.bancoformapagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoBancoFormaPago=false;
			this.isVisibilidadCeldaDuplicarBancoFormaPago=true;
			this.isVisibilidadCeldaCopiarBancoFormaPago=true;
			this.isVisibilidadCeldaVerFormBancoFormaPago=true;
			this.isVisibilidadCeldaOrdenBancoFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago=false;
			this.isVisibilidadCeldaModificarBancoFormaPago=false;
			this.isVisibilidadCeldaActualizarBancoFormaPago=false;
			this.isVisibilidadCeldaEliminarBancoFormaPago=false;
			this.isVisibilidadCeldaCancelarBancoFormaPago=false;
			this.isVisibilidadCeldaGuardarBancoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosBancoFormaPago=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdBancoFormaPago=true;
			this.isVisibilidadFK_IdDetaFormaPago=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFactura=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesBancoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosBancoFormaPago();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioBancoFormaPago(false);
			
			this.setPermisosUsuarioBancoFormaPago();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado() 
				|| (this.bancoformapagoSessionBean.getEsGuardarRelacionado() && this.bancoformapagoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioBancoFormaPagoClasesRelacionadas();
			}
			
			if(this.bancoformapagoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioBancoFormaPagoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosBancoFormaPago();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualBancoFormaPago();
			}
			
			if(!this.isPermisoBusquedaBancoFormaPago) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasBancoFormaPago.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioBancoFormaPago,this.isPermisoPaginacionMedioBancoFormaPago,this.isPermisoPaginacionTodoBancoFormaPago);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(BancoFormaPagoConstantesFunciones.getTiposSeleccionarBancoFormaPago());
				
				this.tiposColumnasSelect=BancoFormaPagoConstantesFunciones.getTiposSeleccionarBancoFormaPago(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
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
			//if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioBancoFormaPago();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioBancoFormaPago(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioBancoFormaPago(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesBancoFormaPago() ;
			
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
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.facturaLogic=new FacturaLogic();
			this.detaformapagoLogic=new DetaFormaPagoLogic();
			this.tipobancoformapagoLogic=new TipoBancoFormaPagoLogic();
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				bancoformapagoImplementable= (BancoFormaPagoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BancoFormaPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				bancoformapagoImplementableHome= (BancoFormaPagoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BancoFormaPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.bancoformapagos= new ArrayList<BancoFormaPago>();
			this.bancoformapagosEliminados= new ArrayList<BancoFormaPago>();
						
			this.isEsNuevoBancoFormaPago=false;
			this.esParaAccionDesdeFormularioBancoFormaPago=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idFacturaActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.facturasForeignKey=new ArrayList<Factura>() ;
			this.detaformapagosForeignKey=new ArrayList<DetaFormaPago>() ;
			this.tipobancoformapagosForeignKey=new ArrayList<TipoBancoFormaPago>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyBancoFormaPago(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroBancoFormaPago();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			BancoFormaPagoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=BancoFormaPagoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesBancoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingBancoFormaPago(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioBancoFormaPago();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioBancoFormaPago();
			}
			
			BancoFormaPagoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasBancoFormaPago.getTabCount(); i++) {
					this.jTabbedPaneBusquedasBancoFormaPago.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasBancoFormaPago.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessBancoFormaPago(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga BancoFormaPago: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectBancoFormaPago() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesBancoFormaPago")) {
				iIndex=this.jInternalFrameDetalleFormBancoFormaPago.jTabbedPaneRelacionesBancoFormaPago.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormBancoFormaPago.jTabbedPaneRelacionesBancoFormaPago.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessBancoFormaPago();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyBancoFormaPago(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyBancoFormaPago(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyBancoFormaPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyBancoFormaPagoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyBancoFormaPago();
		
		this.cargarCombosFrameForeignKeyBancoFormaPago();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyBancoFormaPago();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyBancoFormaPago();
		}
	}
	
	

	public void cargarCombosForeignKeyFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFactura(this.facturasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyDetaFormaPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDetaFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDetaFormaPago();
				this.cargarCombosFrameDetaFormaPagosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDetaFormaPago(this.detaformapagosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoBancoFormaPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoBancoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoBancoFormaPago();
				this.cargarCombosFrameTipoBancoFormaPagosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoBancoFormaPago(this.tipobancoformapagosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoBancoFormaPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.bancoformapagoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
			
			
			if(jTableDatosBancoFormaPago.getRowCount()>=1) {
				jTableDatosBancoFormaPago.removeRowSelectionInterval(0, jTableDatosBancoFormaPago.getRowCount()-1);						
			}
			
			this.isEsNuevoBancoFormaPago=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoBancoFormaPago(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesBancoFormaPago(true);			
			//this.bancoformapago=new BancoFormaPago();
			//this.bancoformapago.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBancoFormaPago(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBancoFormaPago() ;
			
			if(BancoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBancoFormaPago(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.bancoformapago);	
			this.actualizarInformacion("INFO_PADRE",false,this.bancoformapago);				
			
			BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
			
			if(this.bancoformapagoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar BancoFormaPago: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarBancoFormaPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<BancoFormaPago> bancoformapagosSeleccionados=new ArrayList<BancoFormaPago>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosBancoFormaPago.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosBancoFormaPago.getSelectedRows().length;			
			}
			
			bancoformapagosSeleccionados=this.getBancoFormaPagosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoBancoFormaPago--;			
				//BancoFormaPago bancoformapagoAux= new BancoFormaPago();			
				//bancoformapagoAux.setId(this.iIdNuevoBancoFormaPago);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//BancoFormaPago bancoformapagoOrigen=new BancoFormaPago();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(BancoFormaPago bancoformapagoOrigen : bancoformapagosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							bancoformapagoOrigen =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancoformapagoOrigen =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaBancoFormaPago();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.bancoformapago.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosBancoFormaPago(bancoformapagoOrigen,this.bancoformapago,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.bancoformapagoLogic.getBancoFormaPagos().add(this.bancoformapagoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.bancoformapagos.add(this.bancoformapagoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaBancoFormaPago(false);
				
				this.jTableDatosBancoFormaPago.setRowSelectionInterval(this.getIndiceNuevoBancoFormaPago(), this.getIndiceNuevoBancoFormaPago());
				
				int iLastRow =  this.jTableDatosBancoFormaPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBancoFormaPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBancoFormaPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBancoFormaPago(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<BancoFormaPago> bancoformapagosSeleccionados=new ArrayList<BancoFormaPago>();									
		
			BancoFormaPago bancoformapagoOrigen=new BancoFormaPago();
			BancoFormaPago bancoformapagoDestino=new BancoFormaPago();
				
			bancoformapagosSeleccionados=this.getBancoFormaPagosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosBancoFormaPago.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || bancoformapagosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosBancoFormaPago.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagoOrigen =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						bancoformapagoOrigen =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bancoformapagoDestino =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						bancoformapagoDestino =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				bancoformapagoOrigen =bancoformapagosSeleccionados.get(0);
				bancoformapagoDestino =bancoformapagosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosBancoFormaPago(bancoformapagoOrigen,bancoformapagoDestino,true,false);
				
				bancoformapagoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(bancoformapagoDestino,bancoformapagoLogic.getBancoFormaPagos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bancoformapagoDestino,bancoformapagos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaBancoFormaPago(false);
				
				//this.jTableDatosBancoFormaPago.setRowSelectionInterval(this.getIndiceNuevoBancoFormaPago(), this.getIndiceNuevoBancoFormaPago());
				
				int iLastRow =  this.jTableDatosBancoFormaPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBancoFormaPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBancoFormaPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBancoFormaPago(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormBancoFormaPago.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesBancoFormaPago.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasBancoFormaPago.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesBancoFormaPago.setVisible(!isVisible);
			this.jPanelPaginacionBancoFormaPago.setVisible(!isVisible);
			this.jPanelAccionesBancoFormaPago.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameBancoFormaPago();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoBancoFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionBancoFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByBancoFormaPago();
			
			this.abrirFrameOrderByBancoFormaPago();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByBancoFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleBancoFormaPago(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormBancoFormaPago);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormBancoFormaPago.isMaximum()) {
					this.jInternalFrameDetalleFormBancoFormaPago.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormBancoFormaPago.setSize(this.jInternalFrameDetalleFormBancoFormaPago.iWidthFormulario,this.jInternalFrameDetalleFormBancoFormaPago.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormBancoFormaPago.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormBancoFormaPago.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormBancoFormaPago.isMaximum()) {
						this.jInternalFrameDetalleFormBancoFormaPago.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormBancoFormaPago.jContentPaneDetalleBancoFormaPago.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormBancoFormaPago.jTabbedPaneRelacionesBancoFormaPago.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormBancoFormaPago.jContentPaneDetalleBancoFormaPago.getWidth(),BancoFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBancoFormaPago.jTabbedPaneRelacionesBancoFormaPago.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormBancoFormaPago.jContentPaneDetalleBancoFormaPago.getWidth(),BancoFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBancoFormaPago.jTabbedPaneRelacionesBancoFormaPago.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormBancoFormaPago.jContentPaneDetalleBancoFormaPago.getWidth(),BancoFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormBancoFormaPago.setVisible(true);
	        this.jInternalFrameDetalleFormBancoFormaPago.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByBancoFormaPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByBancoFormaPago==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByBancoFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBancoFormaPago,false,this);
				} else {
					this.jInternalFrameOrderByBancoFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBancoFormaPago,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByBancoFormaPago);
				this.jInternalFrameOrderByBancoFormaPago.setVisible(false);
				this.jInternalFrameOrderByBancoFormaPago.setSelected(false);
				
				this.jInternalFrameOrderByBancoFormaPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBancoFormaPago"));
				
				this.inicializarActualizarBindingTablaOrderByBancoFormaPago();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionBancoFormaPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionBancoFormaPago==null) {
				
				this.jInternalFrameImportacionBancoFormaPago=new ImportacionJInternalFrame(BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBancoFormaPago);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionBancoFormaPago);
				this.jInternalFrameImportacionBancoFormaPago.setVisible(false);
				this.jInternalFrameImportacionBancoFormaPago.setSelected(false);


				this.jInternalFrameImportacionBancoFormaPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBancoFormaPago"));
				this.jInternalFrameImportacionBancoFormaPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBancoFormaPago"));
				this.jInternalFrameImportacionBancoFormaPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBancoFormaPago"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoBancoFormaPago() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoBancoFormaPago==null) {
				this.jInternalFrameReporteDinamicoBancoFormaPago=new ReporteDinamicoJInternalFrame(BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBancoFormaPago);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBancoFormaPago);
				this.jInternalFrameReporteDinamicoBancoFormaPago.setVisible(false);
				this.jInternalFrameReporteDinamicoBancoFormaPago.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoBancoFormaPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBancoFormaPago"));
				this.jInternalFrameReporteDinamicoBancoFormaPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBancoFormaPago"));
				this.jInternalFrameReporteDinamicoBancoFormaPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBancoFormaPago"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBancoFormaPago();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleBancoFormaPago() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormBancoFormaPago);
			
	       	this.jInternalFrameDetalleFormBancoFormaPago.setVisible(false);
	        this.jInternalFrameDetalleFormBancoFormaPago.setSelected(false);
			
			//this.jInternalFrameDetalleFormBancoFormaPago.dispose();
			//this.jInternalFrameDetalleFormBancoFormaPago=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoBancoFormaPago() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoBancoFormaPago.setVisible(true);
	        this.jInternalFrameReporteDinamicoBancoFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionBancoFormaPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionBancoFormaPago.setVisible(true);
	        this.jInternalFrameImportacionBancoFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByBancoFormaPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByBancoFormaPago.setVisible(true);
	        this.jInternalFrameOrderByBancoFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByBancoFormaPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByBancoFormaPago.setVisible(false);
	        this.jInternalFrameOrderByBancoFormaPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoBancoFormaPago() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoBancoFormaPago.setVisible(false);
	        this.jInternalFrameReporteDinamicoBancoFormaPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionBancoFormaPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionBancoFormaPago.setVisible(false);
	        this.jInternalFrameImportacionBancoFormaPago.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarBancoFormaPago(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarBancoFormaPago(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesBancoFormaPago(true);
			//this.isEsNuevoBancoFormaPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesBancoFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBancoFormaPago(false) ;
			
			if(bancoformapagoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(BancoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBancoFormaPago(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBancoFormaPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaBancoFormaPagoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarBancoFormaPago(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesBancoFormaPago(true);
			//this.isEsNuevoBancoFormaPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.bancoformapago.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesBancoFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesBancoFormaPago(false) ;
			
			if(BancoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBancoFormaPago(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBancoFormaPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Factura")) {
				if(!this.bancoformapagoConstantesFunciones.cargarid_facturaBancoFormaPago) {
					this.cargarCombosFacturasForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingBancoFormaPago(false,false);
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_factura (id);

				this.recargarComboTablaFactura(this.facturasForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaFactura(List<Factura> facturasForeignKey)throws Exception{
		TableColumn tableColumnFactura=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_IDFACTURA));
		TableCellEditor tableCellEditorFactura =tableColumnFactura.getCellEditor();

		FacturaTableCell facturaTableCellFk=(FacturaTableCell)tableCellEditorFactura;

		if(facturaTableCellFk!=null) {
			facturaTableCellFk.setfacturasForeignKey(facturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBancoFormaPago.getSelectedRow();

		//if(intSelectedRow<=0) {
			//facturaTableCellFk.setRowActual(intSelectedRow);
			//facturaTableCellFk.setfacturasForeignKeyActual(facturasForeignKey);
		//}


		if(facturaTableCellFk!=null) {
			facturaTableCellFk.RecargarFacturasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaDetaFormaPago(List<DetaFormaPago> detaformapagosForeignKey)throws Exception{
		TableColumn tableColumnDetaFormaPago=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGO));
		TableCellEditor tableCellEditorDetaFormaPago =tableColumnDetaFormaPago.getCellEditor();

		DetaFormaPagoTableCell detaformapagoTableCellFk=(DetaFormaPagoTableCell)tableCellEditorDetaFormaPago;

		if(detaformapagoTableCellFk!=null) {
			detaformapagoTableCellFk.setdetaformapagosForeignKey(detaformapagosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBancoFormaPago.getSelectedRow();

		//if(intSelectedRow<=0) {
			//detaformapagoTableCellFk.setRowActual(intSelectedRow);
			//detaformapagoTableCellFk.setdetaformapagosForeignKeyActual(detaformapagosForeignKey);
		//}


		if(detaformapagoTableCellFk!=null) {
			detaformapagoTableCellFk.RecargarDetaFormaPagosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoBancoFormaPago(List<TipoBancoFormaPago> tipobancoformapagosForeignKey)throws Exception{
		TableColumn tableColumnTipoBancoFormaPago=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_IDTIPOBANCOFORMAPAGO));
		TableCellEditor tableCellEditorTipoBancoFormaPago =tableColumnTipoBancoFormaPago.getCellEditor();

		TipoBancoFormaPagoTableCell tipobancoformapagoTableCellFk=(TipoBancoFormaPagoTableCell)tableCellEditorTipoBancoFormaPago;

		if(tipobancoformapagoTableCellFk!=null) {
			tipobancoformapagoTableCellFk.settipobancoformapagosForeignKey(tipobancoformapagosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBancoFormaPago.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipobancoformapagoTableCellFk.setRowActual(intSelectedRow);
			//tipobancoformapagoTableCellFk.settipobancoformapagosForeignKeyActual(tipobancoformapagosForeignKey);
		//}


		if(tipobancoformapagoTableCellFk!=null) {
			tipobancoformapagoTableCellFk.RecargarTipoBancoFormaPagosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBancoFormaPago.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBancoFormaPago.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_factura (Long id) throws Exception {
		this.setActualFacturaForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesBancoFormaPago(false);
			
			//if(!this.isEsNuevoBancoFormaPago) {								
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
				this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				
			}
			
			if(this.permiteMantenimiento(this.bancoformapago)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoBancoFormaPago=true;
					this.inicializarActualizarBindingTablaBancoFormaPago(false);
					this.isEsNuevoBancoFormaPago=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoBancoFormaPago=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoBancoFormaPago=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBancoFormaPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBancoFormaPago(false);
				
				this.habilitarDeshabilitarControlesBancoFormaPago(false);
			
												
				
				if(BancoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleBancoFormaPago();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoBancoFormaPagoActionPerformed(evt,bancoformapagoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualBancoFormaPago(this.bancoformapago,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosBancoFormaPago.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,bancoformapagoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.bancoformapago.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(BancoFormaPago.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoFormaPago.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				this.bancoformapago.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				this.bancoformapago.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.bancoformapago)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((BancoFormaPagoModel) this.jTableDatosBancoFormaPago.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoBancoFormaPago=true;
				this.inicializarActualizarBindingTablaBancoFormaPago(false);
				this.isEsNuevoBancoFormaPago=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBancoFormaPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBancoFormaPago(false);
				
				this.habilitarDeshabilitarControlesBancoFormaPago(false);
				
				
				
				if(BancoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleBancoFormaPago();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosBancoFormaPago.getRowCount()>=1) {
				jTableDatosBancoFormaPago.removeRowSelectionInterval(0, jTableDatosBancoFormaPago.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesBancoFormaPago(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaBancoFormaPago(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBancoFormaPago(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBancoFormaPago(false) ;
			
			this.isEsNuevoBancoFormaPago=false;
			
			if(BancoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleBancoFormaPago();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBancoFormaPago(false);
				
				//SI ES MANUAL
				if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualBancoFormaPago();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoBancoFormaPago--;			
			//BancoFormaPago bancoformapagoAux= new BancoFormaPago();			
			//bancoformapagoAux.setId(this.iIdNuevoBancoFormaPago);
			
			if(this.jInternalFrameDetalleFormBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaBancoFormaPago();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
			
			this.bancoformapago.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.bancoformapagoLogic.getBancoFormaPagos().add(this.bancoformapagoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.bancoformapagos.add(this.bancoformapagoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaBancoFormaPago(false);
			
			this.jTableDatosBancoFormaPago.setRowSelectionInterval(this.getIndiceNuevoBancoFormaPago(), this.getIndiceNuevoBancoFormaPago());
			
			int iLastRow =  this.jTableDatosBancoFormaPago.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosBancoFormaPago.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosBancoFormaPago.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaBancoFormaPago(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingBancoFormaPago(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBancoFormaPago(false);
			
			//SI ES MANUAL
			if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBancoFormaPago();
			}
			
			//this.abrirFrameTreeBancoFormaPago();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Banco Forma PagoS ?", "MANTENIMIENTO DE Banco Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionBancoFormaPago.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralBancoFormaPago();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.bancoformapagoReturnGeneral=bancoformapagoLogic.procesarImportacionBancoFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.bancoformapagoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarBancoFormaPagoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionBancoFormaPago.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionBancoFormaPago.setFileImportacion(this.jInternalFrameImportacionBancoFormaPago.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionBancoFormaPago.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionBancoFormaPago.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionBancoFormaPago.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionBancoFormaPago.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<BancoFormaPago> bancoformapagosSeleccionados=new ArrayList<BancoFormaPago>();		

		bancoformapagosSeleccionados=this.getBancoFormaPagosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("BancoFormaPagoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"BancoFormaPagoBaseDesign.jrxml";
			
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
			
			this.generarReporteBancoFormaPagos("Todos",bancoformapagosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoBancoFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBancoFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Factura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Factura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Factura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Factura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DetaFormaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DetaFormaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DetaFormaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DetaFormaPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDTIPOBANCOFORMAPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoBancoFormaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoBancoFormaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoBancoFormaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoBancoFormaPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBanco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBanco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBanco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBanco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreGirador_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreGirador_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreGirador_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreGirador_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVence_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVence_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVence_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVence_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCuentaBanco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCuentaBanco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCuentaBanco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCuentaBanco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCheque_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCheque_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCheque_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCheque_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorMonto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorMonto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorMonto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorMonto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoBancoFormaPago.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case BancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoria="id_factura";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGO:
					sNombreCampoCategoria="id_deta_forma_pago";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDTIPOBANCOFORMAPAGO:
					sNombreCampoCategoria="id_tipo_banco_forma_pago";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO:
					sNombreCampoCategoria="nombre_banco";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR:
					sNombreCampoCategoria="nombre_girador";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE:
					sNombreCampoCategoria="fecha_vence";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO:
					sNombreCampoCategoria="numero_cuenta_banco";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoria="numero_cheque";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO:
					sNombreCampoCategoria="valor_monto";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case BancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoriaValor="id_factura";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGO:
					sNombreCampoCategoriaValor="id_deta_forma_pago";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDTIPOBANCOFORMAPAGO:
					sNombreCampoCategoriaValor="id_tipo_banco_forma_pago";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO:
					sNombreCampoCategoriaValor="nombre_banco";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR:
					sNombreCampoCategoriaValor="nombre_girador";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE:
					sNombreCampoCategoriaValor="fecha_vence";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO:
					sNombreCampoCategoriaValor="numero_cuenta_banco";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoriaValor="numero_cheque";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO:
					sNombreCampoCategoriaValor="valor_monto";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoBancoFormaPago.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBancoFormaPago.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factura");
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Deta Forma Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_deta_forma_pago");
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDTIPOBANCOFORMAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Banco Forma Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_banco_forma_pago");
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_banco");
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Girador",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_girador");
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vence",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vence");
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cuenta Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cuenta_banco");
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cheque",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cheque");
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Monto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_monto");
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
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
	
	public void jButtonGenerarExcelReporteDinamicoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<BancoFormaPago> bancoformapagosSeleccionados=new ArrayList<BancoFormaPago>();		
		
		bancoformapagosSeleccionados=this.getBancoFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bancoformapago";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("BancoFormaPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoBancoFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoBancoFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case BancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(BancoFormaPago bancoformapago:bancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancoformapago.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(BancoFormaPago bancoformapago:bancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancoformapago.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(BancoFormaPago bancoformapago:bancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancoformapago.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(BancoFormaPago bancoformapago:bancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancoformapago.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDFACTURA);
					iRow++;

					for(BancoFormaPago bancoformapago:bancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancoformapago.getfactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGO);
					iRow++;

					for(BancoFormaPago bancoformapago:bancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancoformapago.getdetaformapago_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDTIPOBANCOFORMAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDTIPOBANCOFORMAPAGO);
					iRow++;

					for(BancoFormaPago bancoformapago:bancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancoformapago.gettipobancoformapago_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO);
					iRow++;

					for(BancoFormaPago bancoformapago:bancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancoformapago.getnombre_banco());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR);
					iRow++;

					for(BancoFormaPago bancoformapago:bancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancoformapago.getnombre_girador());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE);
					iRow++;

					for(BancoFormaPago bancoformapago:bancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancoformapago.getfecha_vence());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO);
					iRow++;

					for(BancoFormaPago bancoformapago:bancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancoformapago.getnumero_cuenta_banco());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE);
					iRow++;

					for(BancoFormaPago bancoformapago:bancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancoformapago.getnumero_cheque());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO);
					iRow++;

					for(BancoFormaPago bancoformapago:bancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancoformapago.getvalor_monto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(BancoFormaPago bancoformapago:bancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancoformapago.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoFormaPagoConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(BancoFormaPago bancoformapago:bancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancoformapago.getmes_descripcion());
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
			//	this.getFilaCabeceraExportarExcelBancoFormaPago(row);				
			//	iRow++;
			//}				
			
			//for(BancoFormaPago bancoformapagoAux:bancoformapagosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelBancoFormaPago(bancoformapagoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
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
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBancoFormaPago(false);
			
			//SI ES MANUAL
			if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBancoFormaPago();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBancoFormaPago(false);
			
			//SI ES MANUAL
			if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBancoFormaPago();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBancoFormaPago(false);
			
			//SI ES MANUAL
			if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBancoFormaPago();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaBancoFormaPago() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosBancoFormaPago.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosBancoFormaPago.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosBancoFormaPago.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosBancoFormaPago.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosBancoFormaPago.setMinimumSize(dimensionMinimum);
		this.jTableDatosBancoFormaPago.setMaximumSize(dimensionMaximum);
		this.jTableDatosBancoFormaPago.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingBancoFormaPago(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingBancoFormaPago(esInicializar,true);
	}
	
	public void inicializarActualizarBindingBancoFormaPago(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaBancoFormaPago(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesBancoFormaPago(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasBancoFormaPago(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBancoFormaPago(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesBancoFormaPago(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !BancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualBancoFormaPago() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaBancoFormaPago();
		
		this.inicializarActualizarBindingBotonesManualBancoFormaPago(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualBancoFormaPago();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBancoFormaPago() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualBancoFormaPago(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualBancoFormaPago(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosBancoFormaPago.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosBancoFormaPago.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteBancoFormaPago.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormBancoFormaPago.jCheckBoxPostAccionNuevoBancoFormaPago.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormBancoFormaPago.jCheckBoxPostAccionSinCerrarBancoFormaPago.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormBancoFormaPago.jCheckBoxPostAccionSinMensajeBancoFormaPago.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosBancoFormaPago.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosBancoFormaPago.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteBancoFormaPago.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
				this.jInternalFrameDetalleFormBancoFormaPago.jCheckBoxPostAccionNuevoBancoFormaPago.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormBancoFormaPago.jCheckBoxPostAccionSinCerrarBancoFormaPago.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormBancoFormaPago.jCheckBoxPostAccionSinMensajeBancoFormaPago.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionBancoFormaPago.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionBancoFormaPago.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxTiposAccionesFormularioBancoFormaPago.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesBancoFormaPago.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoBancoFormaPago!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesBancoFormaPago.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesBancoFormaPago.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarBancoFormaPago.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesBancoFormaPago.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoBancoFormaPago!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesBancoFormaPago.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralBancoFormaPago.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesBancoFormaPago(Boolean esInicializar) throws Exception {
		try	{	
			if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualBancoFormaPago(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesBancoFormaPago() throws Exception {
		try	{
			if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualBancoFormaPago();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBancoFormaPago() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxTiposAccionesFormularioBancoFormaPago.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxTiposAccionesFormularioBancoFormaPago.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualBancoFormaPago() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesBancoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesBancoFormaPago.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesBancoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesBancoFormaPago.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesBancoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesBancoFormaPago.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionBancoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionBancoFormaPago.addItem(reporte);
			}
			
			
			if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionBancoFormaPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionBancoFormaPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesBancoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesBancoFormaPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesBancoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesBancoFormaPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxTiposAccionesFormularioBancoFormaPago.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxTiposAccionesFormularioBancoFormaPago.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarBancoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarBancoFormaPago.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarBancoFormaPago.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBancoFormaPago();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBancoFormaPago() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBancoFormaPago!=null) {
				this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBancoFormaPago!=null) {
				this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoBancoFormaPago!=null) {
				
				if(this.jInternalFrameReporteDinamicoBancoFormaPago.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBancoFormaPago.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBancoFormaPago.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoBancoFormaPago.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBancoFormaPago.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBancoFormaPago.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=BancoFormaPagoConstantesFunciones.getTiposSeleccionarBancoFormaPago(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=BancoFormaPagoConstantesFunciones.getTiposSeleccionarBancoFormaPago(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoBancoFormaPago.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoBancoFormaPago.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=BancoFormaPagoConstantesFunciones.getTiposSeleccionarBancoFormaPago(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBancoFormaPago.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoBancoFormaPago.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualBancoFormaPago()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.getSelectedItem()!=null){this.id_tipo_banco_forma_pagoFK_IdBancoFormaPago=((TipoBancoFormaPago)this.jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.getSelectedItem()).getId();}
		if(this.jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.getSelectedItem()!=null){this.id_deta_forma_pagoFK_IdDetaFormaPago=((DetaFormaPago)this.jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.getSelectedItem()).getId();}
		if(this.jComboBoxid_facturaFK_IdFacturaBancoFormaPago.getSelectedItem()!=null){this.id_facturaFK_IdFactura=((Factura)this.jComboBoxid_facturaFK_IdFacturaBancoFormaPago.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasBancoFormaPago(Boolean esInicializar) throws Exception {				
		if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualBancoFormaPago();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaBancoFormaPago() throws Exception {
		this.inicializarActualizarBindingTablaBancoFormaPago(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByBancoFormaPago() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByBancoFormaPago.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByBancoFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBancoFormaPago.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByBancoFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBancoFormaPago.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosBancoFormaPagoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPagoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByBancoFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBancoFormaPago.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByBancoFormaPago.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaBancoFormaPago(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=bancoformapagoLogic.getBancoFormaPagos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=bancoformapagos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosBancoFormaPago.setModel(new BancoFormaPagoModel(this.bancoformapagoLogic.getBancoFormaPagos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosBancoFormaPago.setModel(new BancoFormaPagoModel(this.bancoformapagos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByBancoFormaPago!=null && this.jInternalFrameOrderByBancoFormaPago.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByBancoFormaPago();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO,bancoformapagoConstantesFunciones.resaltarSeleccionarBancoFormaPago,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO,bancoformapagoConstantesFunciones.resaltarSeleccionarBancoFormaPago,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_ID));

		if(this.bancoformapagoConstantesFunciones.mostraridBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoFormaPagoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bancoformapagoConstantesFunciones.resaltaridBancoFormaPago,this.bancoformapagoConstantesFunciones.activaridBancoFormaPago,iSizeTabla,this,true,"idBancoFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bancoformapagoConstantesFunciones.resaltaridBancoFormaPago,this.bancoformapagoConstantesFunciones.activaridBancoFormaPago,this,true,"idBancoFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.bancoformapagoConstantesFunciones.mostrarid_empresaBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_empresaBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_empresaBancoFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_empresaBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_empresaBancoFormaPago,false,"id_empresaBancoFormaPago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.bancoformapagoConstantesFunciones.mostrarid_sucursalBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_sucursalBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_sucursalBancoFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_sucursalBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_sucursalBancoFormaPago,false,"id_sucursalBancoFormaPago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.bancoformapagoConstantesFunciones.mostrarid_ejercicioBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoFormaPagoConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_ejercicioBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_ejercicioBancoFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_ejercicioBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_ejercicioBancoFormaPago,false,"id_ejercicioBancoFormaPago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_IDPERIODO));

		if(this.bancoformapagoConstantesFunciones.mostrarid_periodoBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoFormaPagoConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_periodoBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_periodoBancoFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_periodoBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_periodoBancoFormaPago,false,"id_periodoBancoFormaPago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_IDFACTURA));

		if(this.bancoformapagoConstantesFunciones.mostrarid_facturaBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoFormaPagoConstantesFunciones.LABEL_IDFACTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FacturaTableCell(this.facturasForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_facturaBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_facturaBancoFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new FacturaTableCell(this.facturasForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_facturaBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_facturaBancoFormaPago,true,"id_facturaBancoFormaPago","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGO));

		if(this.bancoformapagoConstantesFunciones.mostrarid_deta_forma_pagoBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DetaFormaPagoTableCell(this.detaformapagosForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_deta_forma_pagoBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_deta_forma_pagoBancoFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new DetaFormaPagoTableCell(this.detaformapagosForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_deta_forma_pagoBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_deta_forma_pagoBancoFormaPago,true,"id_deta_forma_pagoBancoFormaPago","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_IDTIPOBANCOFORMAPAGO));

		if(this.bancoformapagoConstantesFunciones.mostrarid_tipo_banco_forma_pagoBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoFormaPagoConstantesFunciones.LABEL_IDTIPOBANCOFORMAPAGO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoBancoFormaPagoTableCell(this.tipobancoformapagosForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_tipo_banco_forma_pagoBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_tipo_banco_forma_pagoBancoFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new TipoBancoFormaPagoTableCell(this.tipobancoformapagosForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_tipo_banco_forma_pagoBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_tipo_banco_forma_pagoBancoFormaPago,true,"id_tipo_banco_forma_pagoBancoFormaPago","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO));

		if(this.bancoformapagoConstantesFunciones.mostrarnombre_bancoBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bancoformapagoConstantesFunciones.resaltarnombre_bancoBancoFormaPago,this.bancoformapagoConstantesFunciones.activarnombre_bancoBancoFormaPago,iSizeTabla,this,true,"nombre_bancoBancoFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bancoformapagoConstantesFunciones.resaltarnombre_bancoBancoFormaPago,this.bancoformapagoConstantesFunciones.activarnombre_bancoBancoFormaPago,this,true,"nombre_bancoBancoFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR));

		if(this.bancoformapagoConstantesFunciones.mostrarnombre_giradorBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bancoformapagoConstantesFunciones.resaltarnombre_giradorBancoFormaPago,this.bancoformapagoConstantesFunciones.activarnombre_giradorBancoFormaPago,iSizeTabla,this,true,"nombre_giradorBancoFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bancoformapagoConstantesFunciones.resaltarnombre_giradorBancoFormaPago,this.bancoformapagoConstantesFunciones.activarnombre_giradorBancoFormaPago,this,true,"nombre_giradorBancoFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE));

		if(this.bancoformapagoConstantesFunciones.mostrarfecha_venceBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.bancoformapagoConstantesFunciones.resaltarfecha_venceBancoFormaPago,this.bancoformapagoConstantesFunciones.activarfecha_venceBancoFormaPago,iSizeTabla,this,true,"fecha_venceBancoFormaPago","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.bancoformapagoConstantesFunciones.resaltarfecha_venceBancoFormaPago,this.bancoformapagoConstantesFunciones.activarfecha_venceBancoFormaPago,this,true,"fecha_venceBancoFormaPago","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO));

		if(this.bancoformapagoConstantesFunciones.mostrarnumero_cuenta_bancoBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bancoformapagoConstantesFunciones.resaltarnumero_cuenta_bancoBancoFormaPago,this.bancoformapagoConstantesFunciones.activarnumero_cuenta_bancoBancoFormaPago,iSizeTabla,this,true,"numero_cuenta_bancoBancoFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bancoformapagoConstantesFunciones.resaltarnumero_cuenta_bancoBancoFormaPago,this.bancoformapagoConstantesFunciones.activarnumero_cuenta_bancoBancoFormaPago,this,true,"numero_cuenta_bancoBancoFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE));

		if(this.bancoformapagoConstantesFunciones.mostrarnumero_chequeBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bancoformapagoConstantesFunciones.resaltarnumero_chequeBancoFormaPago,this.bancoformapagoConstantesFunciones.activarnumero_chequeBancoFormaPago,iSizeTabla,this,true,"numero_chequeBancoFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bancoformapagoConstantesFunciones.resaltarnumero_chequeBancoFormaPago,this.bancoformapagoConstantesFunciones.activarnumero_chequeBancoFormaPago,this,true,"numero_chequeBancoFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO));

		if(this.bancoformapagoConstantesFunciones.mostrarvalor_montoBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bancoformapagoConstantesFunciones.resaltarvalor_montoBancoFormaPago,this.bancoformapagoConstantesFunciones.activarvalor_montoBancoFormaPago,iSizeTabla,this,true,"valor_montoBancoFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bancoformapagoConstantesFunciones.resaltarvalor_montoBancoFormaPago,this.bancoformapagoConstantesFunciones.activarvalor_montoBancoFormaPago,this,true,"valor_montoBancoFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_IDANIO));

		if(this.bancoformapagoConstantesFunciones.mostrarid_anioBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoFormaPagoConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_anioBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_anioBancoFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_anioBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_anioBancoFormaPago,true,"id_anioBancoFormaPago","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,BancoFormaPagoConstantesFunciones.LABEL_IDMES));

		if(this.bancoformapagoConstantesFunciones.mostrarid_mesBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoFormaPagoConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_mesBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_mesBancoFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.bancoformapagoConstantesFunciones.resaltarid_mesBancoFormaPago,this,this.bancoformapagoConstantesFunciones.activarid_mesBancoFormaPago,true,"id_mesBancoFormaPago","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.bancoformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.bancoformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBancoFormaPago.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.bancoformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.bancoformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBancoFormaPago.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarBancoFormaPago && this.isPermisoGuardarCambiosBancoFormaPago) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.bancoformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.bancoformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosBancoFormaPago.addColumn(tableColumn);
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
			
			this.jTableDatosBancoFormaPago.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBancoFormaPago && this.isPermisoGuardarCambiosBancoFormaPago) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBancoFormaPago && this.isPermisoGuardarCambiosBancoFormaPago) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosBancoFormaPago.moveColumn(this.jTableDatosBancoFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosBancoFormaPago.moveColumn(this.jTableDatosBancoFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosBancoFormaPago.moveColumn(this.jTableDatosBancoFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosBancoFormaPago.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosBancoFormaPago.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosBancoFormaPago,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosBancoFormaPago.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosBancoFormaPago.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!BancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosBancoFormaPago.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosBancoFormaPago.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosBancoFormaPago.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=bancoformapagoLogic.getBancoFormaPagos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=bancoformapagos.size()-1;
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
		//this.jTableDatosBancoFormaPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosBancoFormaPago();
			
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
				
				//this.isEsNuevoBancoFormaPago=false;
					
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
			
				if(this.bancoformapagoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormBancoFormaPago==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBancoFormaPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBancoFormaPago.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.bancoformapago.getsType().equals("DUPLICADO")
				   || this.bancoformapago.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoBancoFormaPago=true;
				
				} else {
					this.isEsNuevoBancoFormaPago=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
					if(this.bancoformapago.getId()>=0 && !this.bancoformapago.getIsNew()) {						
						this.isEsNuevoBancoFormaPago=false;
						
					} else {
						this.isEsNuevoBancoFormaPago=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoBancoFormaPago(esRelaciones);						
				
				this.seleccionarBancoFormaPago(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.bancoformapago.getId()<0) {
					this.isEsNuevoBancoFormaPago=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarBancoFormaPago(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarBancoFormaPago(evt,rowIndex);
				}	
				
				if(this.bancoformapagoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion BancoFormaPago: " + this.dDif); 
					}
				}								
				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarBancoFormaPago(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.bancoformapago)) {
					if(this.bancoformapago.getId()>0) {
						this.bancoformapago.setIsDeleted(true);
						
						this.bancoformapagosEliminados.add(this.bancoformapago);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.bancoformapagoLogic.getBancoFormaPagos().remove(this.bancoformapago);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.bancoformapagos.remove(this.bancoformapago);				
					}
					
					
					((BancoFormaPagoModel) this.jTableDatosBancoFormaPago.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaBancoFormaPago(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarBancoFormaPago(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoBancoFormaPago) {
			
			if(this.jInternalFrameDetalleFormBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBancoFormaPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBancoFormaPago.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioBancoFormaPago(this.bancoformapago);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.bancoformapagoConstantesFunciones.cargarid_empresaBancoFormaPago || this.bancoformapagoConstantesFunciones.event_dependid_empresaBancoFormaPago) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.bancoformapago.getid_empresa());
									//this.inicializarActualizarBindingBancoFormaPago(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(bancoformapago.getEmpresa()!=null) {
							this.empresasForeignKey.add(bancoformapago.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.bancoformapago.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.bancoformapagoConstantesFunciones.cargarid_sucursalBancoFormaPago || this.bancoformapagoConstantesFunciones.event_dependid_sucursalBancoFormaPago) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.bancoformapago.getid_sucursal());
									//this.inicializarActualizarBindingBancoFormaPago(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(bancoformapago.getSucursal()!=null) {
							this.sucursalsForeignKey.add(bancoformapago.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.bancoformapago.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.bancoformapagoConstantesFunciones.cargarid_ejercicioBancoFormaPago || this.bancoformapagoConstantesFunciones.event_dependid_ejercicioBancoFormaPago) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.bancoformapago.getid_ejercicio());
									//this.inicializarActualizarBindingBancoFormaPago(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(bancoformapago.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(bancoformapago.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.bancoformapago.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.bancoformapagoConstantesFunciones.cargarid_periodoBancoFormaPago || this.bancoformapagoConstantesFunciones.event_dependid_periodoBancoFormaPago) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.bancoformapago.getid_periodo());
									//this.inicializarActualizarBindingBancoFormaPago(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(bancoformapago.getPeriodo()!=null) {
							this.periodosForeignKey.add(bancoformapago.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.bancoformapago.getid_periodo(),false,"Formulario");

					//Factura
					if(!this.bancoformapagoConstantesFunciones.cargarid_facturaBancoFormaPago || this.bancoformapagoConstantesFunciones.event_dependid_facturaBancoFormaPago) {
						//this.cargarCombosFacturasForeignKeyLista(" where id="+this.bancoformapago.getid_factura());
									//this.inicializarActualizarBindingBancoFormaPago(false,false);
						this.facturasForeignKey=new ArrayList<Factura>();

						if(bancoformapago.getFactura()!=null) {
							this.facturasForeignKey.add(bancoformapago.getFactura());
						}

						this.addItemDefectoCombosForeignKeyFactura();
						this.cargarCombosFrameFacturasForeignKey("Todos");
					}
					this.setActualFacturaForeignKey(this.bancoformapago.getid_factura(),false,"Formulario");

					//DetaFormaPago
					if(!this.bancoformapagoConstantesFunciones.cargarid_deta_forma_pagoBancoFormaPago || this.bancoformapagoConstantesFunciones.event_dependid_deta_forma_pagoBancoFormaPago) {
						//this.cargarCombosDetaFormaPagosForeignKeyLista(" where id="+this.bancoformapago.getid_deta_forma_pago());
									//this.inicializarActualizarBindingBancoFormaPago(false,false);
						this.detaformapagosForeignKey=new ArrayList<DetaFormaPago>();

						if(bancoformapago.getDetaFormaPago()!=null) {
							this.detaformapagosForeignKey.add(bancoformapago.getDetaFormaPago());
						}

						this.addItemDefectoCombosForeignKeyDetaFormaPago();
						this.cargarCombosFrameDetaFormaPagosForeignKey("Todos");
					}
					this.setActualDetaFormaPagoForeignKey(this.bancoformapago.getid_deta_forma_pago(),false,"Formulario");

					//TipoBancoFormaPago
					if(!this.bancoformapagoConstantesFunciones.cargarid_tipo_banco_forma_pagoBancoFormaPago || this.bancoformapagoConstantesFunciones.event_dependid_tipo_banco_forma_pagoBancoFormaPago) {
						//this.cargarCombosTipoBancoFormaPagosForeignKeyLista(" where id="+this.bancoformapago.getid_tipo_banco_forma_pago());
									//this.inicializarActualizarBindingBancoFormaPago(false,false);
						this.tipobancoformapagosForeignKey=new ArrayList<TipoBancoFormaPago>();

						if(bancoformapago.getTipoBancoFormaPago()!=null) {
							this.tipobancoformapagosForeignKey.add(bancoformapago.getTipoBancoFormaPago());
						}

						this.addItemDefectoCombosForeignKeyTipoBancoFormaPago();
						this.cargarCombosFrameTipoBancoFormaPagosForeignKey("Todos");
					}
					this.setActualTipoBancoFormaPagoForeignKey(this.bancoformapago.getid_tipo_banco_forma_pago(),false,"Formulario");

					//Anio
					if(!this.bancoformapagoConstantesFunciones.cargarid_anioBancoFormaPago || this.bancoformapagoConstantesFunciones.event_dependid_anioBancoFormaPago) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.bancoformapago.getid_anio());
									//this.inicializarActualizarBindingBancoFormaPago(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(bancoformapago.getAnio()!=null) {
							this.aniosForeignKey.add(bancoformapago.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.bancoformapago.getid_anio(),false,"Formulario");

					//Mes
					if(!this.bancoformapagoConstantesFunciones.cargarid_mesBancoFormaPago || this.bancoformapagoConstantesFunciones.event_dependid_mesBancoFormaPago) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.bancoformapago.getid_mes());
									//this.inicializarActualizarBindingBancoFormaPago(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(bancoformapago.getMes()!=null) {
							this.messForeignKey.add(bancoformapago.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.bancoformapago.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesBancoFormaPago("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesBancoFormaPago(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBancoFormaPago() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoBancoFormaPago(BancoFormaPago bancoformapago) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoBancoFormaPago(bancoformapago,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoBancoFormaPago(BancoFormaPago bancoformapago,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioBancoFormaPago(bancoformapago);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyBancoFormaPago(bancoformapago,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyBancoFormaPago(bancoformapago);
	}
	
	public void setVariablesObjetoActualToFormularioBancoFormaPago(BancoFormaPago bancoformapago) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormBancoFormaPago.jLabelidBancoFormaPago.setText(bancoformapago.getId().toString());
			this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnombre_bancoBancoFormaPago.setText(bancoformapago.getnombre_banco());
			this.jInternalFrameDetalleFormBancoFormaPago.jTextAreanombre_giradorBancoFormaPago.setText(bancoformapago.getnombre_girador());
			this.jInternalFrameDetalleFormBancoFormaPago.jDateChooserfecha_venceBancoFormaPago.setDate(bancoformapago.getfecha_vence());
			this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnumero_cuenta_bancoBancoFormaPago.setText(bancoformapago.getnumero_cuenta_banco());
			this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnumero_chequeBancoFormaPago.setText(bancoformapago.getnumero_cheque());
			this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldvalor_montoBancoFormaPago.setText(bancoformapago.getvalor_monto().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,BancoFormaPago bancoformapagoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,bancoformapagoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,BancoFormaPago bancoformapagoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				bancoformapagoLocal=this.bancoformapago;
			} else {
				bancoformapagoLocal=this.bancoformapagoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(bancoformapagoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoBancoFormaPago(bancoformapagoLocal,true);
					
					if(bancoformapagoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(bancoformapagoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(bancoformapagoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoBancoFormaPago(BancoFormaPago bancoformapago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBancoFormaPago(bancoformapago,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(bancoformapago);
	}
	
	public void setVariablesFormularioToObjetoActualBancoFormaPago(BancoFormaPago bancoformapago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBancoFormaPago(bancoformapago,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualBancoFormaPago(BancoFormaPago bancoformapago,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormBancoFormaPago.jLabelidBancoFormaPago.getText()==null || this.jInternalFrameDetalleFormBancoFormaPago.jLabelidBancoFormaPago.getText()=="" || this.jInternalFrameDetalleFormBancoFormaPago.jLabelidBancoFormaPago.getText()=="Id") {
				this.jInternalFrameDetalleFormBancoFormaPago.jLabelidBancoFormaPago.setText("0");
			}

			if(conColumnasBase) {bancoformapago.setId(Long.parseLong(this.jInternalFrameDetalleFormBancoFormaPago.jLabelidBancoFormaPago.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BancoFormaPagoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelIdBancoFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bancoformapago.setnombre_banco(this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnombre_bancoBancoFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelnombre_bancoBancoFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bancoformapago.setnombre_girador(this.jInternalFrameDetalleFormBancoFormaPago.jTextAreanombre_giradorBancoFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelnombre_giradorBancoFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bancoformapago.setfecha_vence(this.jInternalFrameDetalleFormBancoFormaPago.jDateChooserfecha_venceBancoFormaPago.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelfecha_venceBancoFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bancoformapago.setnumero_cuenta_banco(this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnumero_cuenta_bancoBancoFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelnumero_cuenta_bancoBancoFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bancoformapago.setnumero_cheque(this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnumero_chequeBancoFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelnumero_chequeBancoFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bancoformapago.setvalor_monto(Double.parseDouble(this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldvalor_montoBancoFormaPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoFormaPago.jLabelvalor_montoBancoFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBancoFormaPago(BancoFormaPago bancoformapagoBean,BancoFormaPago bancoformapago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosBancoFormaPago(BancoFormaPago bancoformapagoOrigen,BancoFormaPago bancoformapago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && bancoformapagoOrigen.getId()!=null && !bancoformapagoOrigen.getId().equals(0L))) {bancoformapago.setId(bancoformapagoOrigen.getId());}}
			if(conDefault || (!conDefault && bancoformapagoOrigen.getnombre_banco()!=null && !bancoformapagoOrigen.getnombre_banco().equals(""))) {bancoformapago.setnombre_banco(bancoformapagoOrigen.getnombre_banco());}
			if(conDefault || (!conDefault && bancoformapagoOrigen.getnombre_girador()!=null && !bancoformapagoOrigen.getnombre_girador().equals(""))) {bancoformapago.setnombre_girador(bancoformapagoOrigen.getnombre_girador());}
			if(conDefault || (!conDefault && bancoformapagoOrigen.getfecha_vence()!=null && !bancoformapagoOrigen.getfecha_vence().equals(new Date()))) {bancoformapago.setfecha_vence(bancoformapagoOrigen.getfecha_vence());}
			if(conDefault || (!conDefault && bancoformapagoOrigen.getnumero_cuenta_banco()!=null && !bancoformapagoOrigen.getnumero_cuenta_banco().equals(""))) {bancoformapago.setnumero_cuenta_banco(bancoformapagoOrigen.getnumero_cuenta_banco());}
			if(conDefault || (!conDefault && bancoformapagoOrigen.getnumero_cheque()!=null && !bancoformapagoOrigen.getnumero_cheque().equals(""))) {bancoformapago.setnumero_cheque(bancoformapagoOrigen.getnumero_cheque());}
			if(conDefault || (!conDefault && bancoformapagoOrigen.getvalor_monto()!=null && !bancoformapagoOrigen.getvalor_monto().equals(0.0))) {bancoformapago.setvalor_monto(bancoformapagoOrigen.getvalor_monto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBancoFormaPago(BancoFormaPago bancoformapago) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBancoFormaPago.jLabelidBancoFormaPago.setText(bancoformapago.getId().toString());
			this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnombre_bancoBancoFormaPago.setText(bancoformapago.getnombre_banco());
			this.jInternalFrameDetalleFormBancoFormaPago.jTextAreanombre_giradorBancoFormaPago.setText(bancoformapago.getnombre_girador());
			this.jInternalFrameDetalleFormBancoFormaPago.jDateChooserfecha_venceBancoFormaPago.setDate(bancoformapago.getfecha_vence());
			this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnumero_cuenta_bancoBancoFormaPago.setText(bancoformapago.getnumero_cuenta_banco());
			this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnumero_chequeBancoFormaPago.setText(bancoformapago.getnumero_cheque());
			this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldvalor_montoBancoFormaPago.setText(bancoformapago.getvalor_monto().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBancoFormaPago(BancoFormaPagoBean bancoformapagoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBancoFormaPago.jLabelidBancoFormaPago.setText(bancoformapagoBean.getId().toString());
			this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnombre_bancoBancoFormaPago.setText(bancoformapagoBean.getnombre_banco());
			this.jInternalFrameDetalleFormBancoFormaPago.jTextAreanombre_giradorBancoFormaPago.setText(bancoformapagoBean.getnombre_girador());
			this.jInternalFrameDetalleFormBancoFormaPago.jDateChooserfecha_venceBancoFormaPago.setDate(bancoformapagoBean.getfecha_vence());
			this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnumero_cuenta_bancoBancoFormaPago.setText(bancoformapagoBean.getnumero_cuenta_banco());
			this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnumero_chequeBancoFormaPago.setText(bancoformapagoBean.getnumero_cheque());
			this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldvalor_montoBancoFormaPago.setText(bancoformapagoBean.getvalor_monto().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanBancoFormaPago(BancoFormaPagoParameterReturnGeneral bancoformapagoReturnGeneral,BancoFormaPagoBean bancoformapagoBean,Boolean conDefault) throws Exception { 
		try {
			BancoFormaPago bancoformapagoLocal=new BancoFormaPago();
			
			bancoformapagoLocal=bancoformapagoReturnGeneral.getBancoFormaPago();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && bancoformapagoLocal.getId()!=null && !bancoformapagoLocal.getId().equals(0L))) {bancoformapagoBean.setId(bancoformapagoLocal.getId());}}
			if(conDefault || (!conDefault && bancoformapagoLocal.getnombre_banco()!=null && !bancoformapagoLocal.getnombre_banco().equals(""))) {bancoformapagoBean.setnombre_banco(bancoformapagoLocal.getnombre_banco());}
			if(conDefault || (!conDefault && bancoformapagoLocal.getnombre_girador()!=null && !bancoformapagoLocal.getnombre_girador().equals(""))) {bancoformapagoBean.setnombre_girador(bancoformapagoLocal.getnombre_girador());}
			if(conDefault || (!conDefault && bancoformapagoLocal.getfecha_vence()!=null && !bancoformapagoLocal.getfecha_vence().equals(new Date()))) {bancoformapagoBean.setfecha_vence(bancoformapagoLocal.getfecha_vence());}
			if(conDefault || (!conDefault && bancoformapagoLocal.getnumero_cuenta_banco()!=null && !bancoformapagoLocal.getnumero_cuenta_banco().equals(""))) {bancoformapagoBean.setnumero_cuenta_banco(bancoformapagoLocal.getnumero_cuenta_banco());}
			if(conDefault || (!conDefault && bancoformapagoLocal.getnumero_cheque()!=null && !bancoformapagoLocal.getnumero_cheque().equals(""))) {bancoformapagoBean.setnumero_cheque(bancoformapagoLocal.getnumero_cheque());}
			if(conDefault || (!conDefault && bancoformapagoLocal.getvalor_monto()!=null && !bancoformapagoLocal.getvalor_monto().equals(0.0))) {bancoformapagoBean.setvalor_monto(bancoformapagoLocal.getvalor_monto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxBancoFormaPagoGenerico(Long idBancoFormaPagoSeleccionado,JComboBox jComboBoxBancoFormaPago,List<BancoFormaPago> bancoformapagosLocal)throws Exception {
		try {
			BancoFormaPago  bancoformapagoTemp=null;

			for(BancoFormaPago bancoformapagoAux:bancoformapagosLocal) {
				if(bancoformapagoAux.getId()!=null && bancoformapagoAux.getId().equals(idBancoFormaPagoSeleccionado)) {
					bancoformapagoTemp=bancoformapagoAux;
					break;
				}
			}

			jComboBoxBancoFormaPago.setSelectedItem(bancoformapagoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxBancoFormaPagoGenerico(JComboBox jComboBoxBancoFormaPago,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBancoFormaPago.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxBancoFormaPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBancoFormaPago.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxBancoFormaPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bancoformapago=(BancoFormaPago) bancoformapagoLogic.getBancoFormaPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			bancoformapago =(BancoFormaPago) bancoformapagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!bancoformapago.getIsNew() && !bancoformapago.getIsChanged() && !bancoformapago.getIsDeleted()) {
				sDescripcion=bancoformapago.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=bancoformapago.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!bancoformapago.getIsNew() && !bancoformapago.getIsChanged() && !bancoformapago.getIsDeleted()) {
				sDescripcion=bancoformapago.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=bancoformapago.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!bancoformapago.getIsNew() && !bancoformapago.getIsChanged() && !bancoformapago.getIsDeleted()) {
				sDescripcion=bancoformapago.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=bancoformapago.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!bancoformapago.getIsNew() && !bancoformapago.getIsChanged() && !bancoformapago.getIsDeleted()) {
				sDescripcion=bancoformapago.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=bancoformapago.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Factura")) {
			//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
			if(!bancoformapago.getIsNew() && !bancoformapago.getIsChanged() && !bancoformapago.getIsDeleted()) {
				sDescripcion=bancoformapago.getfactura_descripcion();
			} else {
				//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=bancoformapago.getfactura_descripcion();
			}
		}

		if(sTipo.equals("DetaFormaPago")) {
			//sDescripcion=this.getActualDetaFormaPagoForeignKeyDescripcion((Long)value);
			if(!bancoformapago.getIsNew() && !bancoformapago.getIsChanged() && !bancoformapago.getIsDeleted()) {
				sDescripcion=bancoformapago.getdetaformapago_descripcion();
			} else {
				//sDescripcion=this.getActualDetaFormaPagoForeignKeyDescripcion((Long)value);
				sDescripcion=bancoformapago.getdetaformapago_descripcion();
			}
		}

		if(sTipo.equals("TipoBancoFormaPago")) {
			//sDescripcion=this.getActualTipoBancoFormaPagoForeignKeyDescripcion((Long)value);
			if(!bancoformapago.getIsNew() && !bancoformapago.getIsChanged() && !bancoformapago.getIsDeleted()) {
				sDescripcion=bancoformapago.gettipobancoformapago_descripcion();
			} else {
				//sDescripcion=this.getActualTipoBancoFormaPagoForeignKeyDescripcion((Long)value);
				sDescripcion=bancoformapago.gettipobancoformapago_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!bancoformapago.getIsNew() && !bancoformapago.getIsChanged() && !bancoformapago.getIsDeleted()) {
				sDescripcion=bancoformapago.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=bancoformapago.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!bancoformapago.getIsNew() && !bancoformapago.getIsChanged() && !bancoformapago.getIsDeleted()) {
				sDescripcion=bancoformapago.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=bancoformapago.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		BancoFormaPago bancoformapagoRow=new BancoFormaPago();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bancoformapagoRow=(BancoFormaPago) bancoformapagoLogic.getBancoFormaPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			bancoformapagoRow=(BancoFormaPago) bancoformapagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualBancoFormaPago(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoBancoFormaPago && this.isPermisoNuevoBancoFormaPago));			
			this.jButtonDuplicarBancoFormaPago.setVisible((this.isVisibilidadCeldaDuplicarBancoFormaPago && this.isPermisoDuplicarBancoFormaPago));			
			this.jButtonCopiarBancoFormaPago.setVisible((this.isVisibilidadCeldaCopiarBancoFormaPago && this.isPermisoCopiarBancoFormaPago));
			this.jButtonVerFormBancoFormaPago.setVisible((this.isVisibilidadCeldaVerFormBancoFormaPago && this.isPermisoVerFormBancoFormaPago));
			
			this.jButtonAbrirOrderByBancoFormaPago.setVisible((this.isVisibilidadCeldaOrdenBancoFormaPago && this.isPermisoOrdenBancoFormaPago));			
			
			this.jButtonNuevoRelacionesBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago && this.isPermisoNuevoBancoFormaPago));			
			this.jButtonNuevoGuardarCambiosBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoBancoFormaPago && this.isPermisoNuevoBancoFormaPago && this.isPermisoGuardarCambiosBancoFormaPago));
			
			if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonModificarBancoFormaPago.setVisible((this.isVisibilidadCeldaModificarBancoFormaPago && this.isPermisoActualizarBancoFormaPago));	
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonActualizarBancoFormaPago.setVisible((this.isVisibilidadCeldaActualizarBancoFormaPago && this.isPermisoActualizarBancoFormaPago));	
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonEliminarBancoFormaPago.setVisible((this.isVisibilidadCeldaEliminarBancoFormaPago && this.isPermisoEliminarBancoFormaPago));
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonCancelarBancoFormaPago.setVisible(this.isVisibilidadCeldaCancelarBancoFormaPago);							
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonGuardarCambiosBancoFormaPago.setVisible((this.isVisibilidadCeldaGuardarBancoFormaPago && this.isPermisoGuardarCambiosBancoFormaPago));			
			
			}
						
			this.jButtonGuardarCambiosTablaBancoFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosBancoFormaPago && this.isPermisoGuardarCambiosBancoFormaPago));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoBancoFormaPago && this.isPermisoNuevoBancoFormaPago));						
			this.jButtonDuplicarToolBarBancoFormaPago.setVisible((this.isVisibilidadCeldaDuplicarBancoFormaPago && this.isPermisoDuplicarBancoFormaPago));						
			this.jButtonCopiarToolBarBancoFormaPago.setVisible((this.isVisibilidadCeldaCopiarBancoFormaPago && this.isPermisoCopiarBancoFormaPago));			
			this.jButtonVerFormToolBarBancoFormaPago.setVisible((this.isVisibilidadCeldaVerFormBancoFormaPago && this.isPermisoVerFormBancoFormaPago));			
			this.jButtonAbrirOrderByToolBarBancoFormaPago.setVisible((this.isVisibilidadCeldaOrdenBancoFormaPago && this.isPermisoOrdenBancoFormaPago));
			this.jButtonNuevoRelacionesToolBarBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago && this.isPermisoNuevoBancoFormaPago));			
			this.jButtonNuevoGuardarCambiosToolBarBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoBancoFormaPago && this.isPermisoNuevoBancoFormaPago && this.isPermisoGuardarCambiosBancoFormaPago));			
			
			if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonModificarToolBarBancoFormaPago.setVisible((this.isVisibilidadCeldaModificarBancoFormaPago && this.isPermisoActualizarBancoFormaPago));	
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonActualizarToolBarBancoFormaPago.setVisible((this.isVisibilidadCeldaActualizarBancoFormaPago  && this.isPermisoActualizarBancoFormaPago));	
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonEliminarToolBarBancoFormaPago.setVisible((this.isVisibilidadCeldaEliminarBancoFormaPago && this.isPermisoEliminarBancoFormaPago));
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonCancelarToolBarBancoFormaPago.setVisible(this.isVisibilidadCeldaCancelarBancoFormaPago);				
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonGuardarCambiosToolBarBancoFormaPago.setVisible((this.isVisibilidadCeldaGuardarBancoFormaPago && this.isPermisoGuardarCambiosBancoFormaPago));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarBancoFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosBancoFormaPago && this.isPermisoGuardarCambiosBancoFormaPago));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoBancoFormaPago && this.isPermisoNuevoBancoFormaPago));			
			this.jMenuItemDuplicarBancoFormaPago.setVisible((this.isVisibilidadCeldaDuplicarBancoFormaPago && this.isPermisoDuplicarBancoFormaPago));			
			this.jMenuItemCopiarBancoFormaPago.setVisible((this.isVisibilidadCeldaCopiarBancoFormaPago && this.isPermisoCopiarBancoFormaPago));			
			this.jMenuItemVerFormBancoFormaPago.setVisible((this.isVisibilidadCeldaVerFormBancoFormaPago && this.isPermisoVerFormBancoFormaPago));			
			this.jMenuItemAbrirOrderByBancoFormaPago.setVisible((this.isVisibilidadCeldaOrdenBancoFormaPago && this.isPermisoOrdenBancoFormaPago));			
			//this.jMenuItemMostrarOcultarBancoFormaPago.setVisible((this.isVisibilidadCeldaOrdenBancoFormaPago && this.isPermisoOrdenBancoFormaPago));
			this.jMenuItemDetalleAbrirOrderByBancoFormaPago.setVisible((this.isVisibilidadCeldaOrdenBancoFormaPago && this.isPermisoOrdenBancoFormaPago));			
			//this.jMenuItemDetalleMostrarOcultarBancoFormaPago.setVisible((this.isVisibilidadCeldaOrdenBancoFormaPago && this.isPermisoOrdenBancoFormaPago));			
			this.jMenuItemNuevoRelacionesBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago && this.isPermisoNuevoBancoFormaPago));			
			this.jMenuItemNuevoGuardarCambiosBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoBancoFormaPago && this.isPermisoNuevoBancoFormaPago && this.isPermisoGuardarCambiosBancoFormaPago));									
			
			if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
			this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemModificarBancoFormaPago.setVisible((this.isVisibilidadCeldaModificarBancoFormaPago && this.isPermisoActualizarBancoFormaPago));	
			this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemActualizarBancoFormaPago.setVisible((this.isVisibilidadCeldaActualizarBancoFormaPago && this.isPermisoActualizarBancoFormaPago));	
			this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemEliminarBancoFormaPago.setVisible((this.isVisibilidadCeldaEliminarBancoFormaPago && this.isPermisoEliminarBancoFormaPago));
			this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemCancelarBancoFormaPago.setVisible(this.isVisibilidadCeldaCancelarBancoFormaPago);				
			}
			
			this.jMenuItemGuardarCambiosBancoFormaPago.setVisible((this.isVisibilidadCeldaGuardarBancoFormaPago && this.isPermisoGuardarCambiosBancoFormaPago));						
			this.jMenuItemGuardarCambiosTablaBancoFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosBancoFormaPago && this.isPermisoGuardarCambiosBancoFormaPago));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoBancoFormaPago=this.jButtonNuevoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaDuplicarBancoFormaPago=this.jButtonDuplicarBancoFormaPago.isVisible();
			this.isVisibilidadCeldaCopiarBancoFormaPago=this.jButtonCopiarBancoFormaPago.isVisible();
			this.isVisibilidadCeldaVerFormBancoFormaPago=this.jButtonVerFormBancoFormaPago.isVisible();
			
			this.isVisibilidadCeldaOrdenBancoFormaPago=this.jButtonAbrirOrderByBancoFormaPago.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago=this.jButtonNuevoRelacionesBancoFormaPago.isVisible();
			this.isVisibilidadCeldaModificarBancoFormaPago=this.jButtonModificarBancoFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
			this.isVisibilidadCeldaActualizarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jButtonActualizarBancoFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jButtonEliminarBancoFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jButtonCancelarBancoFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jButtonGuardarCambiosBancoFormaPago.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosBancoFormaPago=this.jButtonGuardarCambiosTablaBancoFormaPago.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoBancoFormaPago=this.jButtonNuevoToolBarBancoFormaPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago=this.jButtonNuevoRelacionesToolBarBancoFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
			this.isVisibilidadCeldaModificarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jButtonModificarToolBarBancoFormaPago.isVisible();
			this.isVisibilidadCeldaActualizarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jButtonActualizarToolBarBancoFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jButtonEliminarToolBarBancoFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jButtonCancelarToolBarBancoFormaPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBancoFormaPago=this.jButtonGuardarCambiosToolBarBancoFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBancoFormaPago=this.jButtonGuardarCambiosTablaToolBarBancoFormaPago.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoBancoFormaPago=this.jMenuItemNuevoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago=this.jMenuItemNuevoRelacionesBancoFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
			this.isVisibilidadCeldaModificarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemModificarBancoFormaPago.isVisible();
			this.isVisibilidadCeldaActualizarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemActualizarBancoFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemEliminarBancoFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarBancoFormaPago=this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemCancelarBancoFormaPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBancoFormaPago=this.jMenuItemGuardarCambiosBancoFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBancoFormaPago=this.jMenuItemGuardarCambiosTablaBancoFormaPago.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesBancoFormaPago(Boolean esInicializar) {
		if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.bancoformapagoSessionBean.getConGuardarRelaciones()) {
				//if(this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesBancoFormaPago();
			}
			
			this.inicializarActualizarBindingBotonesManualBancoFormaPago(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualBancoFormaPago() {
		this.jButtonNuevoBancoFormaPago.setVisible(this.isPermisoNuevoBancoFormaPago);			
		this.jButtonDuplicarBancoFormaPago.setVisible(this.isPermisoDuplicarBancoFormaPago);			
		this.jButtonCopiarBancoFormaPago.setVisible(this.isPermisoCopiarBancoFormaPago);			
		this.jButtonVerFormBancoFormaPago.setVisible(this.isPermisoVerFormBancoFormaPago);			
		
		this.jButtonAbrirOrderByBancoFormaPago.setVisible(this.isPermisoOrdenBancoFormaPago);					
		
		this.jButtonNuevoRelacionesBancoFormaPago.setVisible(this.isPermisoNuevoBancoFormaPago);			
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonModificarBancoFormaPago.setVisible(this.isPermisoActualizarBancoFormaPago);	
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonActualizarBancoFormaPago.setVisible(this.isPermisoActualizarBancoFormaPago);	
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonEliminarBancoFormaPago.setVisible(this.isPermisoEliminarBancoFormaPago);
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonCancelarBancoFormaPago.setVisible(this.isVisibilidadCeldaCancelarBancoFormaPago);						
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonGuardarCambiosBancoFormaPago.setVisible(this.isPermisoGuardarCambiosBancoFormaPago);							
		}
		
		this.jButtonGuardarCambiosTablaBancoFormaPago.setVisible(this.isPermisoActualizarBancoFormaPago);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleBancoFormaPago() {
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonModificarBancoFormaPago.setVisible(this.isPermisoActualizarBancoFormaPago);	
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonActualizarBancoFormaPago.setVisible(this.isPermisoActualizarBancoFormaPago);	
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonEliminarBancoFormaPago.setVisible(this.isPermisoEliminarBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonCancelarBancoFormaPago.setVisible(this.isVisibilidadCeldaCancelarBancoFormaPago);							
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonGuardarCambiosBancoFormaPago.setVisible((this.isVisibilidadCeldaGuardarBancoFormaPago && this.isPermisoGuardarCambiosBancoFormaPago));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosBancoFormaPago() {
		if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualBancoFormaPago();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesBancoFormaPago() {
	}
	
	public void jTableDatosBancoFormaPagoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarBancoFormaPago(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancoformapago==null) {
						this.bancoformapago = new BancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				}

				if(this.bancoformapago.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.bancoformapago.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaBancoFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebBancoFormaPago(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBancoFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBancoFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.bancoformapagoLogic.getConnexion());

				if(this.bancoformapago.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.bancoformapago.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBancoFormaPago=(TitledBorder)this.jScrollPanelDatosBancoFormaPago.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderBancoFormaPago.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancoformapago==null) {
						this.bancoformapago = new BancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				}

				if(this.bancoformapago.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.bancoformapago.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalBancoFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebBancoFormaPago(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBancoFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBancoFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.bancoformapagoLogic.getConnexion());

				if(this.bancoformapago.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.bancoformapago.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBancoFormaPago=(TitledBorder)this.jScrollPanelDatosBancoFormaPago.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderBancoFormaPago.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancoformapago==null) {
						this.bancoformapago = new BancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				}

				if(this.bancoformapago.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.bancoformapago.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioBancoFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebBancoFormaPago(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBancoFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBancoFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.bancoformapagoLogic.getConnexion());

				if(this.bancoformapago.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.bancoformapago.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBancoFormaPago=(TitledBorder)this.jScrollPanelDatosBancoFormaPago.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderBancoFormaPago.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancoformapago==null) {
						this.bancoformapago = new BancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				}

				if(this.bancoformapago.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.bancoformapago.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoBancoFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebBancoFormaPago(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBancoFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBancoFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.bancoformapagoLogic.getConnexion());

				if(this.bancoformapago.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.bancoformapago.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBancoFormaPago=(TitledBorder)this.jScrollPanelDatosBancoFormaPago.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderBancoFormaPago.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancoformapago==null) {
						this.bancoformapago = new BancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				}

				if(this.bancoformapago.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.bancoformapago.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_facturaBancoFormaPagoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.facturaBeanSwingJInternalFrame.sTipoBusqueda="Factura";

			if(!this.sFinalQueryGeneral_factura.equals("")) {
				this.facturaBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_factura);
				this.facturaBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.facturaBeanSwingJInternalFrame.procesarBusqueda(this.facturaBeanSwingJInternalFrame.sAccionBusqueda);
				this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingFactura(false);
			}

			if(!this.sFinalQueryComboFactura.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderBancoFormaPago=null;
			TitledBorder titledBorderfactura=null;

			if(!this.jScrollPanelDatosBancoFormaPago.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderBancoFormaPago=(TitledBorder)this.jScrollPanelDatosBancoFormaPago.getBorder();
				titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderBancoFormaPago.getTitle() + " -> Factura");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_facturaBancoFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactura=true;

			idTienePermisofactura=this.tienePermisosUsuarioEnPaginaWebBancoFormaPago(FacturaConstantesFunciones.CLASSNAME);

			if(idTienePermisofactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBancoFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBancoFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.bancoformapagoLogic.getConnexion());

				if(this.bancoformapago.getid_factura()!=null) {
					this.facturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.facturaBeanSwingJInternalFrame.setIdActual(this.bancoformapago.getid_factura());
					this.facturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura();
				}

				JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBancoFormaPago=(TitledBorder)this.jScrollPanelDatosBancoFormaPago.getBorder();
				TitledBorder titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderBancoFormaPago.getTitle() + " -> Factura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_facturaBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancoformapago==null) {
						this.bancoformapago = new BancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				}

				if(this.bancoformapago.getid_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factura = "+this.bancoformapago.getid_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_deta_forma_pagoBancoFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodetaformapago=true;

			idTienePermisodetaformapago=this.tienePermisosUsuarioEnPaginaWebBancoFormaPago(DetaFormaPagoConstantesFunciones.CLASSNAME);

			if(idTienePermisodetaformapago) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBancoFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBancoFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);

				this.detaformapagoBeanSwingJInternalFrame=new DetaFormaPagoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.detaformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.detaformapagoBeanSwingJInternalFrame.getDetaFormaPagoLogic().setConnexion(this.bancoformapagoLogic.getConnexion());

				if(this.bancoformapago.getid_deta_forma_pago()!=null) {
					this.detaformapagoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.detaformapagoBeanSwingJInternalFrame.setIdActual(this.bancoformapago.getid_deta_forma_pago());
					this.detaformapagoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.detaformapagoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.detaformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetaFormaPago();
				}

				JInternalFrameBase jinternalFrame =this.detaformapagoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBancoFormaPago=(TitledBorder)this.jScrollPanelDatosBancoFormaPago.getBorder();
				TitledBorder titledBorderdetaformapago=(TitledBorder)this.detaformapagoBeanSwingJInternalFrame.jScrollPanelDatosDetaFormaPago.getBorder();

				titledBorderdetaformapago.setTitle(titledBorderBancoFormaPago.getTitle() + " -> Deta Forma Pago");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_deta_forma_pagoBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancoformapago==null) {
						this.bancoformapago = new BancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				}

				if(this.bancoformapago.getid_deta_forma_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_deta_forma_pago = "+this.bancoformapago.getid_deta_forma_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_banco_forma_pagoBancoFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipobancoformapago=true;

			idTienePermisotipobancoformapago=this.tienePermisosUsuarioEnPaginaWebBancoFormaPago(TipoBancoFormaPagoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipobancoformapago) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBancoFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBancoFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);

				this.tipobancoformapagoBeanSwingJInternalFrame=new TipoBancoFormaPagoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipobancoformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipobancoformapagoBeanSwingJInternalFrame.getTipoBancoFormaPagoLogic().setConnexion(this.bancoformapagoLogic.getConnexion());

				if(this.bancoformapago.getid_tipo_banco_forma_pago()!=null) {
					this.tipobancoformapagoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipobancoformapagoBeanSwingJInternalFrame.setIdActual(this.bancoformapago.getid_tipo_banco_forma_pago());
					this.tipobancoformapagoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipobancoformapagoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipobancoformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoBancoFormaPago();
				}

				JInternalFrameBase jinternalFrame =this.tipobancoformapagoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBancoFormaPago=(TitledBorder)this.jScrollPanelDatosBancoFormaPago.getBorder();
				TitledBorder titledBordertipobancoformapago=(TitledBorder)this.tipobancoformapagoBeanSwingJInternalFrame.jScrollPanelDatosTipoBancoFormaPago.getBorder();

				titledBordertipobancoformapago.setTitle(titledBorderBancoFormaPago.getTitle() + " -> Tipo Banco Forma Pago");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_banco_forma_pagoBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancoformapago==null) {
						this.bancoformapago = new BancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				}

				if(this.bancoformapago.getid_tipo_banco_forma_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_banco_forma_pago = "+this.bancoformapago.getid_tipo_banco_forma_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bancoBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancoformapago==null) {
						this.bancoformapago = new BancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				}

				if(this.bancoformapago.getnombre_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_banco like '%"+this.bancoformapago.getnombre_banco()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_giradorBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancoformapago==null) {
						this.bancoformapago = new BancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				}

				if(this.bancoformapago.getnombre_girador()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_girador like '%"+this.bancoformapago.getnombre_girador()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_venceBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancoformapago==null) {
						this.bancoformapago = new BancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				}

				if(this.bancoformapago.getfecha_vence()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vence = '"+Funciones2.getStringPostgresDate(this.bancoformapago.getfecha_vence())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cuenta_bancoBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancoformapago==null) {
						this.bancoformapago = new BancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				}

				if(this.bancoformapago.getnumero_cuenta_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cuenta_banco like '%"+this.bancoformapago.getnumero_cuenta_banco()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_chequeBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancoformapago==null) {
						this.bancoformapago = new BancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				}

				if(this.bancoformapago.getnumero_cheque()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cheque like '%"+this.bancoformapago.getnumero_cheque()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_montoBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancoformapago==null) {
						this.bancoformapago = new BancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				}

				if(this.bancoformapago.getvalor_monto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_monto = "+this.bancoformapago.getvalor_monto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioBancoFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebBancoFormaPago(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBancoFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBancoFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.bancoformapagoLogic.getConnexion());

				if(this.bancoformapago.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.bancoformapago.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBancoFormaPago=(TitledBorder)this.jScrollPanelDatosBancoFormaPago.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderBancoFormaPago.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancoformapago==null) {
						this.bancoformapago = new BancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				}

				if(this.bancoformapago.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.bancoformapago.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesBancoFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebBancoFormaPago(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBancoFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBancoFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.bancoformapagoLogic.getConnexion());

				if(this.bancoformapago.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.bancoformapago.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBancoFormaPago=(TitledBorder)this.jScrollPanelDatosBancoFormaPago.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderBancoFormaPago.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.getbancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancoformapago==null) {
						this.bancoformapago = new BancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);
				}

				if(this.bancoformapago.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.bancoformapago.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBancoFormaPago(false,false);

			this.getBancoFormaPagosFK_IdAnio();

			this.inicializarActualizarBindingBancoFormaPago(false);

			//if(BancoFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBancoFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBancoFormaPagoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBancoFormaPago(false,false);

			this.getBancoFormaPagosFK_IdBancoFormaPago();

			this.inicializarActualizarBindingBancoFormaPago(false);

			//if(BancoFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBancoFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDetaFormaPagoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBancoFormaPago(false,false);

			this.getBancoFormaPagosFK_IdDetaFormaPago();

			this.inicializarActualizarBindingBancoFormaPago(false);

			//if(BancoFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBancoFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBancoFormaPago(false,false);

			this.getBancoFormaPagosFK_IdEjercicio();

			this.inicializarActualizarBindingBancoFormaPago(false);

			//if(BancoFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBancoFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBancoFormaPago(false,false);

			this.getBancoFormaPagosFK_IdEmpresa();

			this.inicializarActualizarBindingBancoFormaPago(false);

			//if(BancoFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBancoFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFacturaBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBancoFormaPago(false,false);

			this.getBancoFormaPagosFK_IdFactura();

			this.inicializarActualizarBindingBancoFormaPago(false);

			//if(BancoFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBancoFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBancoFormaPago(false,false);

			this.getBancoFormaPagosFK_IdMes();

			this.inicializarActualizarBindingBancoFormaPago(false);

			//if(BancoFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBancoFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBancoFormaPago(false,false);

			this.getBancoFormaPagosFK_IdPeriodo();

			this.inicializarActualizarBindingBancoFormaPago(false);

			//if(BancoFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBancoFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBancoFormaPago(false,false);

			this.getBancoFormaPagosFK_IdSucursal();

			this.inicializarActualizarBindingBancoFormaPago(false);

			//if(BancoFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBancoFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameBancoFormaPago() {
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
			this.jInternalFrameDetalleFormBancoFormaPago.setVisible(false);	    			
			this.jInternalFrameDetalleFormBancoFormaPago.dispose();
			this.jInternalFrameDetalleFormBancoFormaPago=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoBancoFormaPago!=null) {
			this.jInternalFrameReporteDinamicoBancoFormaPago.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoBancoFormaPago.dispose();
			this.jInternalFrameReporteDinamicoBancoFormaPago=null;
		}
		
		if(this.jInternalFrameImportacionBancoFormaPago!=null) {
			this.jInternalFrameImportacionBancoFormaPago.setVisible(false);	    			
			this.jInternalFrameImportacionBancoFormaPago.dispose();
			this.jInternalFrameImportacionBancoFormaPago=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessBancoFormaPago();
			
			BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
			
			
			if(sTipo.equals("NuevoBancoFormaPago")) {
				jButtonNuevoBancoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarBancoFormaPago")) {
				jButtonDuplicarBancoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarBancoFormaPago")) {
				jButtonCopiarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormBancoFormaPago")) {
				jButtonVerFormBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarBancoFormaPago")) {
				jButtonNuevoBancoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarBancoFormaPago")) {
				jButtonDuplicarBancoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoBancoFormaPago")) {
				jButtonNuevoBancoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarBancoFormaPago")) {
				jButtonDuplicarBancoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesBancoFormaPago")) {
				jButtonNuevoBancoFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarBancoFormaPago")) {
				jButtonNuevoBancoFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesBancoFormaPago")) {
				jButtonNuevoBancoFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarBancoFormaPago")) {
				jButtonModificarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarBancoFormaPago")) {
				jButtonModificarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarBancoFormaPago")) {
				jButtonModificarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarBancoFormaPago")) {
				jButtonActualizarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarBancoFormaPago")) {
				jButtonActualizarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarBancoFormaPago")) {
				jButtonActualizarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarBancoFormaPago")) {
				jButtonEliminarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarBancoFormaPago")) {
				jButtonEliminarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarBancoFormaPago")) {
				jButtonEliminarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarBancoFormaPago")) {
				jButtonCancelarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarBancoFormaPago")) {
				jButtonCancelarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarBancoFormaPago")) {
				jButtonCancelarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarBancoFormaPago")) {
				jButtonCerrarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarBancoFormaPago")) {
				jButtonCerrarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarBancoFormaPago")) {
				jButtonCerrarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarBancoFormaPago")) {
				jButtonMostrarOcultarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarBancoFormaPago")) {
				jButtonCancelarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosBancoFormaPago")) {
				jButtonGuardarCambiosBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarBancoFormaPago")) {
				jButtonGuardarCambiosBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarBancoFormaPago")) {
				jButtonCopiarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarBancoFormaPago")) {
				jButtonVerFormBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosBancoFormaPago")) {
				jButtonGuardarCambiosBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarBancoFormaPago")) {
				jButtonCopiarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormBancoFormaPago")) {
				jButtonVerFormBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaBancoFormaPago")) {
				jButtonGuardarCambiosBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarBancoFormaPago")) {
				jButtonGuardarCambiosBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaBancoFormaPago")) {
				jButtonGuardarCambiosBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionBancoFormaPago")) {
				jButtonRecargarInformacionBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarBancoFormaPago")) {
				jButtonRecargarInformacionBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionBancoFormaPago")) {
				jButtonRecargarInformacionBancoFormaPagoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresBancoFormaPago")) {
				jButtonAnterioresBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarBancoFormaPago")) {
				jButtonAnterioresBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreBancoFormaPago")) {
				jButtonAnterioresBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesBancoFormaPago")) {
				jButtonSiguientesBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarBancoFormaPago")) {
				jButtonSiguientesBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesBancoFormaPago")) {
				jButtonSiguientesBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByBancoFormaPago") || sTipo.equals("MenuItemDetalleAbrirOrderByBancoFormaPago")) {
				jButtonAbrirOrderByBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarBancoFormaPago") || sTipo.equals("MenuItemDetalleMostrarOcultarBancoFormaPago")) {
				jButtonMostrarOcultarBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosBancoFormaPago")) {
				jButtonNuevoGuardarCambiosBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarBancoFormaPago")) {
				jButtonNuevoGuardarCambiosBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosBancoFormaPago")) {
				jButtonNuevoGuardarCambiosBancoFormaPagoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoBancoFormaPago")) {
				jButtonCerrarReporteDinamicoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoBancoFormaPago")) {
				jButtonGenerarReporteDinamicoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoBancoFormaPago")) {
				
				jButtonGenerarExcelReporteDinamicoBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionBancoFormaPago")) {
				jButtonCerrarImportacionBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionBancoFormaPago")) {
				
				jButtonGenerarImportacionBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionBancoFormaPago")) {
				
				jButtonAbrirImportacionBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesBancoFormaPago")) {
				jComboBoxTiposAccionesBancoFormaPagoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesBancoFormaPago")) {
				jComboBoxTiposRelacionesBancoFormaPagoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioBancoFormaPago")) {
				jComboBoxTiposAccionesBancoFormaPagoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarBancoFormaPago")) {
				
				jComboBoxTiposSeleccionarBancoFormaPagoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralBancoFormaPago")) {
				jTextFieldValorCampoGeneralBancoFormaPagoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByBancoFormaPago")) {
				jButtonAbrirOrderByBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarBancoFormaPago")) {
				jButtonAbrirOrderByBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByBancoFormaPago")) {
				jButtonCerrarOrderByBancoFormaPagoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBancoFormaPagoBusqueda")) {
				this.jButtonidBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBancoFormaPagoUpdate")) {
				this.jButtonid_empresaBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBancoFormaPagoBusqueda")) {
				this.jButtonid_empresaBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalBancoFormaPagoUpdate")) {
				this.jButtonid_sucursalBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalBancoFormaPagoBusqueda")) {
				this.jButtonid_sucursalBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioBancoFormaPagoUpdate")) {
				this.jButtonid_ejercicioBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioBancoFormaPagoBusqueda")) {
				this.jButtonid_ejercicioBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoBancoFormaPagoUpdate")) {
				this.jButtonid_periodoBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoBancoFormaPagoBusqueda")) {
				this.jButtonid_periodoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaBancoFormaPago")) {
				this.jButtonid_facturaBancoFormaPagoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaBancoFormaPagoUpdate")) {
				this.jButtonid_facturaBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaBancoFormaPagoBusqueda")) {
				this.jButtonid_facturaBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_deta_forma_pagoBancoFormaPagoUpdate")) {
				this.jButtonid_deta_forma_pagoBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_deta_forma_pagoBancoFormaPagoBusqueda")) {
				this.jButtonid_deta_forma_pagoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_banco_forma_pagoBancoFormaPagoUpdate")) {
				this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_banco_forma_pagoBancoFormaPagoBusqueda")) {
				this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bancoBancoFormaPagoBusqueda")) {
				this.jButtonnombre_bancoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_giradorBancoFormaPagoBusqueda")) {
				this.jButtonnombre_giradorBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_venceBancoFormaPagoBusqueda")) {
				this.jButtonfecha_venceBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuenta_bancoBancoFormaPagoBusqueda")) {
				this.jButtonnumero_cuenta_bancoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeBancoFormaPagoBusqueda")) {
				this.jButtonnumero_chequeBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_montoBancoFormaPagoBusqueda")) {
				this.jButtonvalor_montoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioBancoFormaPagoUpdate")) {
				this.jButtonid_anioBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioBancoFormaPagoBusqueda")) {
				this.jButtonid_anioBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesBancoFormaPagoUpdate")) {
				this.jButtonid_mesBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesBancoFormaPagoBusqueda")) {
				this.jButtonid_mesBancoFormaPagoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_facturaBancoFormaPago")) {
				this.jButtonid_facturaBancoFormaPagoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBancoFormaPagoBancoFormaPago")) {
				this.jButtonFK_IdBancoFormaPagoBancoFormaPagoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdDetaFormaPagoBancoFormaPago")) {
				this.jButtonFK_IdDetaFormaPagoBancoFormaPagoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFacturaBancoFormaPago")) {
				this.jButtonFK_IdFacturaBancoFormaPagoActionPerformed(evt);
			}
			
			;
			
			
			BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessBancoFormaPago();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoFormaPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancoformapago);
				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
				
				


				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			BancoFormaPago bancoformapagoLocal=null;
			
			if(!this.getEsControlTabla()) {
				bancoformapagoLocal=this.bancoformapago;
			} else {
				bancoformapagoLocal=this.bancoformapagoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancoformapago);
				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
							
				
				


				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoAnterior =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancoformapagoAnterior =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
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
			
			BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
			
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
			
			


			
			BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoFormaPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancoformapago);
				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
								
						
				


				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoFormaPago.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancoformapago);
				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
								
				
				


				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoAnterior =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancoformapagoAnterior =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancoformapago);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoAnterior =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancoformapagoAnterior =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoFormaPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bancoformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bancoformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancoformapago);
				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
							
				
				


				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoFormaPago.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoFormaPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapagoAnterior =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.bancoformapagoAnterior =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
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
			
			BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
			
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
			
			


			
			BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoFormaPagoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bancoformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bancoformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancoformapago);
				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
								
				
				


				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoAnterior =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancoformapagoAnterior =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoFormaPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bancoformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bancoformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoFormaPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancoformapago);
				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosBancoFormaPago")) {
					jCheckBoxSeleccionarTodosBancoFormaPagoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosBancoFormaPago")) {
					jCheckBoxSeleccionadosBancoFormaPagoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarBancoFormaPago")) {
					
				}
				
				


				
				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.bancoformapago);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.bancoformapago);
				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
												
				
				


				
				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoFormaPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancoformapagoAnterior =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.bancoformapagoAnterior =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoFormaPagoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancoformapago);
				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
				
				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
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
			
			BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
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
			
			


			
			BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoFormaPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancoformapago);
				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoFormaPago.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoFormaPago.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancoformapago);
				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
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
				
				


				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoFormaPago.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancoformapagoAnterior =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancoformapagoAnterior =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarBancoFormaPago")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosBancoFormaPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosBancoFormaPago.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.bancoformapago =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.bancoformapago =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.bancoformapago);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarBancoFormaPago")) {
				
				}
				
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarBancoFormaPago")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosBancoFormaPago.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarBancoFormaPago")) {
			
			}
			
			BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessBancoFormaPago();
			
			BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
			
			if(sTipo.equals("NuevoBancoFormaPago")) {
				jButtonNuevoBancoFormaPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarBancoFormaPago")) {
				jButtonDuplicarBancoFormaPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarBancoFormaPago")) {
				jButtonCopiarBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormBancoFormaPago")) {
				jButtonVerFormBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesBancoFormaPago")) {
				jButtonNuevoBancoFormaPagoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarBancoFormaPago")) {
				jButtonModificarBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarBancoFormaPago")) {
				jButtonActualizarBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarBancoFormaPago")) {
				jButtonEliminarBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaBancoFormaPago")) {
				jButtonGuardarCambiosBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarBancoFormaPago")) {
				jButtonCancelarBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarBancoFormaPago")) {
				jButtonCerrarBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosBancoFormaPago")) {
				jButtonGuardarCambiosBancoFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosBancoFormaPago")) {
				jButtonNuevoGuardarCambiosBancoFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByBancoFormaPago")) {
				jButtonAbrirOrderByBancoFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionBancoFormaPago")) {
				jButtonRecargarInformacionBancoFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresBancoFormaPago")) {
				jButtonAnterioresBancoFormaPagoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesBancoFormaPago")) {
				jButtonSiguientesBancoFormaPagoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBancoFormaPagoBusqueda")) {
				this.jButtonidBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBancoFormaPagoUpdate")) {
				this.jButtonid_empresaBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBancoFormaPagoBusqueda")) {
				this.jButtonid_empresaBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalBancoFormaPagoUpdate")) {
				this.jButtonid_sucursalBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalBancoFormaPagoBusqueda")) {
				this.jButtonid_sucursalBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioBancoFormaPagoUpdate")) {
				this.jButtonid_ejercicioBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioBancoFormaPagoBusqueda")) {
				this.jButtonid_ejercicioBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoBancoFormaPagoUpdate")) {
				this.jButtonid_periodoBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoBancoFormaPagoBusqueda")) {
				this.jButtonid_periodoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaBancoFormaPago")) {
				this.jButtonid_facturaBancoFormaPagoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaBancoFormaPagoUpdate")) {
				this.jButtonid_facturaBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaBancoFormaPagoBusqueda")) {
				this.jButtonid_facturaBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_deta_forma_pagoBancoFormaPagoUpdate")) {
				this.jButtonid_deta_forma_pagoBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_deta_forma_pagoBancoFormaPagoBusqueda")) {
				this.jButtonid_deta_forma_pagoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_banco_forma_pagoBancoFormaPagoUpdate")) {
				this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_banco_forma_pagoBancoFormaPagoBusqueda")) {
				this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bancoBancoFormaPagoBusqueda")) {
				this.jButtonnombre_bancoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_giradorBancoFormaPagoBusqueda")) {
				this.jButtonnombre_giradorBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_venceBancoFormaPagoBusqueda")) {
				this.jButtonfecha_venceBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuenta_bancoBancoFormaPagoBusqueda")) {
				this.jButtonnumero_cuenta_bancoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeBancoFormaPagoBusqueda")) {
				this.jButtonnumero_chequeBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_montoBancoFormaPagoBusqueda")) {
				this.jButtonvalor_montoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioBancoFormaPagoUpdate")) {
				this.jButtonid_anioBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioBancoFormaPagoBusqueda")) {
				this.jButtonid_anioBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesBancoFormaPagoUpdate")) {
				this.jButtonid_mesBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesBancoFormaPagoBusqueda")) {
				this.jButtonid_mesBancoFormaPagoBusquedaActionPerformed(evt);
			}
			
			BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessBancoFormaPago();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameBancoFormaPago")) {
				closingInternalFrameBancoFormaPago();
				
			} else if(sTipo.equals("jButtonCancelarBancoFormaPago")) {
				JInternalFrameBase jInternalFrameDetalleFormBancoFormaPago = (JInternalFrameBase)evt.getSource();
	            	
	            BancoFormaPagoBeanSwingJInternalFrame jInternalFrameParent=(BancoFormaPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormBancoFormaPago.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarBancoFormaPagoActionPerformed(null);
			}
			
			BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.bancoformapago,new Object(),this.bancoformapagoParameterGeneral,this.bancoformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormBancoFormaPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormBancoFormaPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormBancoFormaPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.bancoformapago)) {
			if(!esControlTabla) {
				if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);			
				}
				
				if(this.bancoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualBancoFormaPago(this.bancoformapago,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.bancoformapagoReturnGeneral=bancoformapagoLogic.procesarEventosBancoFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bancoformapagoLogic.getBancoFormaPagos(),this.bancoformapago,this.bancoformapagoParameterGeneral,this.isEsNuevoBancoFormaPago,classes);//this.bancoformapagoLogic.getBancoFormaPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanBancoFormaPago(this.bancoformapagoReturnGeneral,this.bancoformapagoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.bancoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanBancoFormaPago(classes,this.bancoformapagoReturnGeneral,this.bancoformapagoBean,false);
					}
						
					if(this.bancoformapagoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyBancoFormaPago(this.bancoformapagoReturnGeneral.getBancoFormaPago());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioBancoFormaPago(this.bancoformapagoReturnGeneral.getBancoFormaPago());	
					}
						
					if(this.bancoformapagoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioBancoFormaPago(this.bancoformapagoReturnGeneral.getBancoFormaPago(),classes);//this.bancoformapagoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioBancoFormaPago(this.bancoformapago,classes);//this.bancoformapagoBean);									
				}
			
				if(BancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualBancoFormaPago(this.bancoformapago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoFormaPago(this.bancoformapago);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.bancoformapagoAnterior!=null) {
						this.bancoformapago=this.bancoformapagoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.bancoformapagoReturnGeneral=bancoformapagoLogic.procesarEventosBancoFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bancoformapagoLogic.getBancoFormaPagos(),this.bancoformapago,this.bancoformapagoParameterGeneral,this.isEsNuevoBancoFormaPago,classes);//this.bancoformapagoLogic.getBancoFormaPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.bancoformapagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.bancoformapagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.bancoformapagoReturnGeneral.getBancoFormaPago(),bancoformapagoLogic.getBancoFormaPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.bancoformapagoReturnGeneral.getBancoFormaPago(),this.bancoformapagos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosBancoFormaPago.repaint();
				
				//((AbstractTableModel) this.jTableDatosBancoFormaPago.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosBancoFormaPago();
			}
		}
	}
	
	public void actualizarVisualTableDatosBancoFormaPago() throws Exception {
		
		BancoFormaPagoModel bancoformapagoModel=(BancoFormaPagoModel)this.jTableDatosBancoFormaPago.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bancoformapagoModel.bancoformapagos=this.bancoformapagoLogic.getBancoFormaPagos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			bancoformapagoModel.bancoformapagos=this.bancoformapagos;
		}
		
		
		((BancoFormaPagoModel) this.jTableDatosBancoFormaPago.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaBancoFormaPago() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getbancoformapagoAnterior(),this.bancoformapagoLogic.getBancoFormaPagos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getbancoformapagoAnterior(),this.bancoformapagos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosBancoFormaPago();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioBancoFormaPago(BancoFormaPago bancoformapago,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
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
										
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bancoformapago,new Object(),generalEntityParameterGeneral,this.bancoformapagoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.bancoformapagoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=BancoFormaPagoConstantesFunciones.getClassesRelationshipsOfBancoFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=BancoFormaPagoConstantesFunciones.getClassesRelationshipsFromStringsOfBancoFormaPago(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormBancoFormaPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				BancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bancoformapago,new Object(),generalEntityParameterGeneral,this.bancoformapagoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioBancoFormaPago(BancoFormaPagoBean bancoformapagoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanBancoFormaPago(ArrayList<Classe> classes,BancoFormaPagoReturnGeneral bancoformapagoReturnGeneral,BancoFormaPagoBean bancoformapagoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualBancoFormaPago(BancoFormaPago bancoformapago,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.bancoformapago)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormBancoFormaPago = new BancoFormaPagoDetalleFormJInternalFrame(jDesktopPane,this.bancoformapagoSessionBean.getConGuardarRelaciones(),this.bancoformapagoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.setVisible(false);
		this.jInternalFrameDetalleFormBancoFormaPago.setSelected(false);						
		
		this.jInternalFrameDetalleFormBancoFormaPago.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormBancoFormaPago.bancoformapagoLogic=this.bancoformapagoLogic;
		
		this.cargarCombosFrameForeignKeyBancoFormaPago("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleBancoFormaPago();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBancoFormaPago();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyBancoFormaPago("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyBancoFormaPago();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormBancoFormaPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBancoFormaPago"));
		
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonModificarBancoFormaPago.addActionListener(new ButtonActionListener(this,"ModificarBancoFormaPago"));

		
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonModificarToolBarBancoFormaPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarBancoFormaPago"));
					
		this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemModificarBancoFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarBancoFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonActualizarBancoFormaPago.addActionListener (new ButtonActionListener(this,"ActualizarBancoFormaPago"));
		
		
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonActualizarToolBarBancoFormaPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBancoFormaPago"));
						
		this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemActualizarBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBancoFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonEliminarBancoFormaPago.addActionListener (new ButtonActionListener(this,"EliminarBancoFormaPago"));
		
		
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonEliminarToolBarBancoFormaPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarBancoFormaPago"));
								
		this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemEliminarBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBancoFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonCancelarBancoFormaPago.addActionListener (new ButtonActionListener(this,"CancelarBancoFormaPago"));
		
		
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonCancelarToolBarBancoFormaPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarBancoFormaPago"));
					
		this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemCancelarBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBancoFormaPago"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemDetalleCerrarBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBancoFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonGuardarCambiosToolBarBancoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBancoFormaPago"));
		
		
		
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonGuardarCambiosToolBarBancoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBancoFormaPago"));
		
		
		
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxTiposAccionesFormularioBancoFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBancoFormaPago"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonidBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_empresaBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_empresaBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_sucursalBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_sucursalBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_ejercicioBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_ejercicioBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_periodoBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_periodoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoBancoFormaPagoBusqueda"));
		//jButtonid_facturaBancoFormaPago.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaBancoFormaPagoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_facturaBancoFormaPago.addActionListener(new ButtonActionListener(this,"id_facturaBancoFormaPago"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_facturaBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_facturaBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_facturaBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_deta_forma_pagoBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_deta_forma_pagoBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_deta_forma_pagoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_deta_forma_pagoBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_tipo_banco_forma_pagoBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_banco_forma_pagoBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_tipo_banco_forma_pagoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_banco_forma_pagoBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonnombre_bancoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonnombre_giradorBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_giradorBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonfecha_venceBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonnumero_cuenta_bancoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuenta_bancoBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonnumero_chequeBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonvalor_montoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"valor_montoBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_anioBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_anioBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_anioBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_mesBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_mesBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_mesBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesBancoFormaPagoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormBancoFormaPago.jTabbedPaneRelacionesBancoFormaPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBancoFormaPago"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameBancoFormaPago"));
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoFormaPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBancoFormaPago"));
		}
		
		this.jTableDatosBancoFormaPago.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarBancoFormaPago"));
		
		this.jTableDatosBancoFormaPago.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarBancoFormaPago"));
		
		this.jButtonNuevoBancoFormaPago.addActionListener(new ButtonActionListener(this,"NuevoBancoFormaPago"));
		
		this.jButtonDuplicarBancoFormaPago.addActionListener(new ButtonActionListener(this,"DuplicarBancoFormaPago"));
		
		this.jButtonCopiarBancoFormaPago.addActionListener(new ButtonActionListener(this,"CopiarBancoFormaPago"));
		
		this.jButtonVerFormBancoFormaPago.addActionListener(new ButtonActionListener(this,"VerFormBancoFormaPago"));
		
		
		this.jButtonNuevoToolBarBancoFormaPago.addActionListener(new ButtonActionListener(this,"NuevoToolBarBancoFormaPago"));
			
		this.jButtonDuplicarToolBarBancoFormaPago.addActionListener(new ButtonActionListener(this,"DuplicarToolBarBancoFormaPago"));
			
		this.jMenuItemNuevoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoBancoFormaPago"));
			
		this.jMenuItemDuplicarBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarBancoFormaPago"));		
		
		
		this.jButtonNuevoRelacionesBancoFormaPago.addActionListener (new ButtonActionListener(this,"NuevoRelacionesBancoFormaPago"));
		
		
		this.jButtonNuevoRelacionesToolBarBancoFormaPago.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarBancoFormaPago"));
			
		this.jMenuItemNuevoRelacionesBancoFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesBancoFormaPago"));		
		
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonModificarBancoFormaPago.addActionListener(new ButtonActionListener(this,"ModificarBancoFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonModificarToolBarBancoFormaPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarBancoFormaPago"));
			
			this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemModificarBancoFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarBancoFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonActualizarBancoFormaPago.addActionListener (new ButtonActionListener(this,"ActualizarBancoFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonActualizarToolBarBancoFormaPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBancoFormaPago"));
				
			this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemActualizarBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBancoFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonEliminarBancoFormaPago.addActionListener (new ButtonActionListener(this,"EliminarBancoFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonEliminarToolBarBancoFormaPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarBancoFormaPago"));
						
			this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemEliminarBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBancoFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonCancelarBancoFormaPago.addActionListener (new ButtonActionListener(this,"CancelarBancoFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonCancelarToolBarBancoFormaPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarBancoFormaPago"));
			
			this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemCancelarBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBancoFormaPago"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarBancoFormaPago.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarBancoFormaPago"));		
		
		
		this.jButtonCerrarBancoFormaPago.addActionListener (new ButtonActionListener(this,"CerrarBancoFormaPago"));
		
		
		this.jButtonCerrarToolBarBancoFormaPago.addActionListener (new ButtonActionListener(this,"CerrarToolBarBancoFormaPago"));
			
		this.jMenuItemCerrarBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCerrarBancoFormaPago"));
			
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoFormaPago.jMenuItemDetalleCerrarBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBancoFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonGuardarCambiosBancoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosBancoFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonGuardarCambiosToolBarBancoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBancoFormaPago"));
		}
		
		this.jButtonCopiarToolBarBancoFormaPago.addActionListener (new ButtonActionListener(this,"CopiarToolBarBancoFormaPago"));
			
		this.jButtonVerFormToolBarBancoFormaPago.addActionListener (new ButtonActionListener(this,"VerFormToolBarBancoFormaPago"));
		
		this.jMenuItemGuardarCambiosBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosBancoFormaPago"));
			
		this.jMenuItemCopiarBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCopiarBancoFormaPago"));		
		
		this.jMenuItemVerFormBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemVerFormBancoFormaPago"));		
		
		
		this.jButtonGuardarCambiosTablaBancoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBancoFormaPago"));
		
		
		this.jButtonGuardarCambiosTablaToolBarBancoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarBancoFormaPago"));
			
		this.jMenuItemGuardarCambiosTablaBancoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBancoFormaPago"));		
		
		
		
		this.jButtonRecargarInformacionBancoFormaPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionBancoFormaPago"));
					
		this.jButtonRecargarInformacionToolBarBancoFormaPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarBancoFormaPago"));
		
		this.jMenuItemRecargarInformacionBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionBancoFormaPago"));		
		
		
		
		this.jButtonAnterioresBancoFormaPago.addActionListener (new ButtonActionListener(this,"AnterioresBancoFormaPago"));
		
		
		this.jButtonAnterioresToolBarBancoFormaPago.addActionListener (new ButtonActionListener(this,"AnterioresToolBarBancoFormaPago"));
		
		this.jMenuItemAnterioresBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresBancoFormaPago"));		
		
		
		this.jButtonSiguientesBancoFormaPago.addActionListener (new ButtonActionListener(this,"SiguientesBancoFormaPago"));
		
		
		this.jButtonSiguientesToolBarBancoFormaPago.addActionListener (new ButtonActionListener(this,"SiguientesToolBarBancoFormaPago"));
			
		this.jMenuItemSiguientesBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesBancoFormaPago"));
			
		this.jMenuItemAbrirOrderByBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByBancoFormaPago"));
			
		this.jMenuItemMostrarOcultarBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarBancoFormaPago"));
			
		this.jMenuItemDetalleAbrirOrderByBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByBancoFormaPago"));
			
		this.jMenuItemDetalleMostarOcultarBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarBancoFormaPago"));		
		
		
		this.jButtonNuevoGuardarCambiosBancoFormaPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosBancoFormaPago"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarBancoFormaPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarBancoFormaPago"));
			
		this.jMenuItemNuevoGuardarCambiosBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosBancoFormaPago"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosBancoFormaPago.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosBancoFormaPago"));

		this.jCheckBoxSeleccionadosBancoFormaPago.addItemListener(new CheckBoxItemListener(this,"SeleccionadosBancoFormaPago"));
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxTiposAccionesFormularioBancoFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBancoFormaPago"));
		}
		
		
		this.jComboBoxTiposRelacionesBancoFormaPago.addActionListener (new ButtonActionListener(this,"TiposRelacionesBancoFormaPago"));
			
		this.jComboBoxTiposAccionesBancoFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesBancoFormaPago"));
					
		this.jComboBoxTiposSeleccionarBancoFormaPago.addActionListener (new ButtonActionListener(this,"TiposSeleccionarBancoFormaPago"));
			
		this.jTextFieldValorCampoGeneralBancoFormaPago.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralBancoFormaPago"));		
		
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonidBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_empresaBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_empresaBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_sucursalBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_sucursalBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_ejercicioBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_ejercicioBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_periodoBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_periodoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoBancoFormaPagoBusqueda"));
		//jButtonid_facturaBancoFormaPago.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaBancoFormaPagoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_facturaBancoFormaPago.addActionListener(new ButtonActionListener(this,"id_facturaBancoFormaPago"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_facturaBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_facturaBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_facturaBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_deta_forma_pagoBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_deta_forma_pagoBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_deta_forma_pagoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_deta_forma_pagoBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_tipo_banco_forma_pagoBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_banco_forma_pagoBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_tipo_banco_forma_pagoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_banco_forma_pagoBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonnombre_bancoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonnombre_giradorBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_giradorBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonfecha_venceBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonnumero_cuenta_bancoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuenta_bancoBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonnumero_chequeBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonvalor_montoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"valor_montoBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_anioBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_anioBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_anioBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_mesBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_mesBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_mesBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesBancoFormaPagoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBancoFormaPagoBancoFormaPago.addActionListener(new ButtonActionListener(this,"FK_IdBancoFormaPagoBancoFormaPago"));

			this.jButtonFK_IdDetaFormaPagoBancoFormaPago.addActionListener(new ButtonActionListener(this,"FK_IdDetaFormaPagoBancoFormaPago"));

			this.jButtonFK_IdFacturaBancoFormaPago.addActionListener(new ButtonActionListener(this,"FK_IdFacturaBancoFormaPago"));

			this.jButtonBuscarFK_IdFacturaid_facturaBancoFormaPago.addActionListener(new ButtonActionListener(this,"id_facturaBancoFormaPago"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoBancoFormaPago!=null) {
				this.jInternalFrameReporteDinamicoBancoFormaPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBancoFormaPago"));
				this.jInternalFrameReporteDinamicoBancoFormaPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBancoFormaPago"));
				this.jInternalFrameReporteDinamicoBancoFormaPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBancoFormaPago"));
			}
			
			//this.jButtonCerrarReporteDinamicoBancoFormaPago.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBancoFormaPago"));				
			//this.jButtonGenerarReporteDinamicoBancoFormaPago.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBancoFormaPago"));
			//this.jButtonGenerarExcelReporteDinamicoBancoFormaPago.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBancoFormaPago"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionBancoFormaPago!=null) {
				this.jInternalFrameImportacionBancoFormaPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBancoFormaPago"));
				this.jInternalFrameImportacionBancoFormaPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBancoFormaPago"));
				this.jInternalFrameImportacionBancoFormaPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBancoFormaPago"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByBancoFormaPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByBancoFormaPago"));
			
			this.jButtonAbrirOrderByToolBarBancoFormaPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarBancoFormaPago"));			
			
			if(this.jInternalFrameOrderByBancoFormaPago!=null) {
				this.jInternalFrameOrderByBancoFormaPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBancoFormaPago"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoFormaPago.jTabbedPaneRelacionesBancoFormaPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBancoFormaPago"));
		
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
            		closingInternalFrameBancoFormaPago();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormBancoFormaPago.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormBancoFormaPago = (JInternalFrameBase)event.getSource();
	            	
	            BancoFormaPagoBeanSwingJInternalFrame jInternalFrameParent=(BancoFormaPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormBancoFormaPago.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarBancoFormaPagoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosBancoFormaPago.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosBancoFormaPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosBancoFormaPago.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosBancoFormaPago.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoBancoFormaPago";
		inputMap = this.jButtonNuevoBancoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoBancoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBancoFormaPagoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesBancoFormaPago";
		inputMap = this.jButtonNuevoRelacionesBancoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesBancoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBancoFormaPagoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarBancoFormaPago";
		inputMap = this.jButtonModificarBancoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarBancoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarBancoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarBancoFormaPago";
		inputMap = this.jButtonActualizarBancoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarBancoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarBancoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarBancoFormaPago";
		inputMap = this.jButtonEliminarBancoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarBancoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarBancoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarBancoFormaPago";
		inputMap = this.jButtonCancelarBancoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarBancoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarBancoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarBancoFormaPago";
		inputMap = this.jButtonCerrarBancoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarBancoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarBancoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonGuardarCambiosBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosBancoFormaPago";
		inputMap = this.jInternalFrameDetalleFormBancoFormaPago.jButtonGuardarCambiosBancoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonGuardarCambiosBancoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosBancoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosBancoFormaPago.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosBancoFormaPagoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesBancoFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesBancoFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarBancoFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarBancoFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralBancoFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralBancoFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonidBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_empresaBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_empresaBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_sucursalBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_sucursalBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_ejercicioBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_ejercicioBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_periodoBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_periodoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoBancoFormaPagoBusqueda"));
		//jButtonid_facturaBancoFormaPago.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaBancoFormaPagoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_facturaBancoFormaPago.addActionListener(new ButtonActionListener(this,"id_facturaBancoFormaPago"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_facturaBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_facturaBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_facturaBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_deta_forma_pagoBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_deta_forma_pagoBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_deta_forma_pagoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_deta_forma_pagoBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_tipo_banco_forma_pagoBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_banco_forma_pagoBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_tipo_banco_forma_pagoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_banco_forma_pagoBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonnombre_bancoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonnombre_giradorBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_giradorBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonfecha_venceBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonnumero_cuenta_bancoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuenta_bancoBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonnumero_chequeBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonvalor_montoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"valor_montoBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_anioBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_anioBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_anioBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_mesBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_mesBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_mesBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesBancoFormaPagoBusqueda"));
		
		
		this.jButtonFK_IdBancoFormaPagoBancoFormaPago.addActionListener(new ButtonActionListener(this,"FK_IdBancoFormaPagoBancoFormaPago"));

		this.jButtonFK_IdDetaFormaPagoBancoFormaPago.addActionListener(new ButtonActionListener(this,"FK_IdDetaFormaPagoBancoFormaPago"));

		this.jButtonFK_IdFacturaBancoFormaPago.addActionListener(new ButtonActionListener(this,"FK_IdFacturaBancoFormaPago"));

		this.jButtonBuscarFK_IdFacturaid_facturaBancoFormaPago.addActionListener(new ButtonActionListener(this,"id_facturaBancoFormaPago"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarBancoFormaPagoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarBancoFormaPago.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosBancoFormaPago(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(BancoFormaPago bancoformapagoAux:this.bancoformapagoLogic.getBancoFormaPagos()) {
					bancoformapagoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BancoFormaPago bancoformapagoAux:bancoformapagos) {
					bancoformapagoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosBancoFormaPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBancoFormaPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(BancoFormaPago bancoformapagoAux:this.bancoformapagoLogic.getBancoFormaPagos()) {
						bancoformapagoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BancoFormaPago bancoformapagoAux:bancoformapagos) {
						bancoformapagoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(BancoFormaPago bancoformapagoAux:this.bancoformapagoLogic.getBancoFormaPagos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BancoFormaPago bancoformapagoAux:bancoformapagos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaBancoFormaPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBancoFormaPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBancoFormaPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosBancoFormaPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBancoFormaPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosBancoFormaPago.getSelectedRows();
			
			BancoFormaPago bancoformapagoLocal=new BancoFormaPago();
			
			//this.seleccionarTodosBancoFormaPago(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoformapagoLocal =(BancoFormaPago) this.bancoformapagoLogic.getBancoFormaPagos().toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					bancoformapagoLocal =(BancoFormaPago) this.bancoformapagos.toArray()[this.jTableDatosBancoFormaPago.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				bancoformapagoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(BancoFormaPago bancoformapagoAux:this.bancoformapagoLogic.getBancoFormaPagos()) {
						bancoformapagoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BancoFormaPago bancoformapagoAux:bancoformapagos) {
						bancoformapagoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaBancoFormaPago(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBancoFormaPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBancoFormaPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBancoFormaPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualBancoFormaPagoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarBancoFormaPagoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralBancoFormaPagoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingBancoFormaPago(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralBancoFormaPago.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(BancoFormaPago bancoformapagoAux:this.bancoformapagoLogic.getBancoFormaPagos()) {
				
						if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO)) {
							existe=true;
							bancoformapagoAux.setnombre_banco(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR)) {
							existe=true;
							bancoformapagoAux.setnombre_girador(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE)) {
							existe=true;
							bancoformapagoAux.setfecha_vence(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO)) {
							existe=true;
							bancoformapagoAux.setnumero_cuenta_banco(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							bancoformapagoAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO)) {
							existe=true;
							bancoformapagoAux.setvalor_monto(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BancoFormaPago bancoformapagoAux:bancoformapagos) {
					
						if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO)) {
							existe=true;
							bancoformapagoAux.setnombre_banco(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR)) {
							existe=true;
							bancoformapagoAux.setnombre_girador(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE)) {
							existe=true;
							bancoformapagoAux.setfecha_vence(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO)) {
							existe=true;
							bancoformapagoAux.setnumero_cuenta_banco(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							bancoformapagoAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO)) {
							existe=true;
							bancoformapagoAux.setvalor_monto(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaBancoFormaPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesBancoFormaPagoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingBancoFormaPago(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioBancoFormaPago=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesBancoFormaPago.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxTiposAccionesFormularioBancoFormaPago.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteBancoFormaPago) {				
					conSplash=true;//false;										
					
					//this.startProcessBancoFormaPago(conSplash);
				
					this.generarReporteBancoFormaPagosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBancoFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxTiposAccionesFormularioBancoFormaPago.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoBancoFormaPagosSeleccionados();
				//this.jComboBoxTiposAccionesBancoFormaPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBancoFormaPagosSeleccionados(false);
				//this.jComboBoxTiposAccionesBancoFormaPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBancoFormaPagosSeleccionados(true);
				//this.jComboBoxTiposAccionesBancoFormaPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBancoFormaPago();
				
				this.exportarBancoFormaPagosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBancoFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxTiposAccionesFormularioBancoFormaPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionBancoFormaPagos();
				//this.importarBancoFormaPagos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBancoFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxTiposAccionesFormularioBancoFormaPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBancoFormaPago();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelBancoFormaPagosSeleccionados();
				//this.jComboBoxTiposAccionesBancoFormaPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Banco Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessBancoFormaPago();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoBancoFormaPago)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyBancoFormaPago(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBancoFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxTiposAccionesFormularioBancoFormaPago.setSelectedIndex(0);					
				}	
			} 			
			else if(BancoFormaPagoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteBancoFormaPago) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessBancoFormaPago(conSplash);
					
						//this.actualizarParametrosGeneralBancoFormaPago();
						
						this.generarReporteProcesoAccionBancoFormaPagosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesBancoFormaPago.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxTiposAccionesFormularioBancoFormaPago.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(BancoFormaPagoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Banco Forma PagoS SELECCIONADOS?", "MANTENIMIENTO DE Banco Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessBancoFormaPago();
				
						this.actualizarParametrosGeneralBancoFormaPago();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.bancoformapagoReturnGeneral=bancoformapagoLogic.procesarAccionBancoFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.bancoformapagoLogic.getBancoFormaPagos(),this.bancoformapagoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarBancoFormaPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBancoFormaPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxTiposAccionesFormularioBancoFormaPago.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralBancoFormaPago();
					
					BancoFormaPagoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarBancoFormaPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBancoFormaPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxTiposAccionesFormularioBancoFormaPago.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessBancoFormaPago(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesBancoFormaPagoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessBancoFormaPago();
			
			if(this.jInternalFrameDetalleFormBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<BancoFormaPago> bancoformapagosSeleccionados=new ArrayList<BancoFormaPago>();		
			BancoFormaPago bancoformapago=new BancoFormaPago();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingBancoFormaPago(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesBancoFormaPago.getSelectedItem();
			
			
			
			
			bancoformapagosSeleccionados=this.getBancoFormaPagosSeleccionados(true);
			//this.sTipoAccion;
			
			if(bancoformapagosSeleccionados.size()==1) {
				for(BancoFormaPago bancoformapagoAux:bancoformapagosSeleccionados) {
					bancoformapago=bancoformapagoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessBancoFormaPago();
			
      		//this.finishProcessBancoFormaPago(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarBancoFormaPagoReturnGeneral() throws Exception {
		if(this.bancoformapagoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.bancoformapagoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.bancoformapagoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.bancoformapagoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.bancoformapagoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.bancoformapagoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingBancoFormaPago(false);
		}
		
		if(this.bancoformapagoReturnGeneral.getConRetornoLista() || this.bancoformapagoReturnGeneral.getConRetornoObjeto()) {
			if(this.bancoformapagoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.bancoformapagoLogic.setBancoFormaPagos(this.bancoformapagoReturnGeneral.getBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.bancoformapagoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.bancoformapagoLogic.setBancoFormaPago(this.bancoformapagoReturnGeneral.getBancoFormaPago());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingBancoFormaPago(false);
		}
	}
	
	public void actualizarParametrosGeneralBancoFormaPago() throws Exception {
		
		
	}
	
	public ArrayList<BancoFormaPago> getBancoFormaPagosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<BancoFormaPago> bancoformapagosSeleccionados=new ArrayList<BancoFormaPago>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioBancoFormaPago) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(BancoFormaPago bancoformapagoAux:bancoformapagoLogic.getBancoFormaPagos()) {
					if(bancoformapagoAux.getIsSelected()) {
						bancoformapagosSeleccionados.add(bancoformapagoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BancoFormaPago bancoformapagoAux:this.bancoformapagos) {
					if(bancoformapagoAux.getIsSelected()) {
						bancoformapagosSeleccionados.add(bancoformapagoAux);				
					}
				}
			}
			
			if(bancoformapagosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						bancoformapagosSeleccionados.addAll(this.bancoformapagoLogic.getBancoFormaPagos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						bancoformapagosSeleccionados.addAll(this.bancoformapagos);				
					}
				}
			}
		} else {
			bancoformapagosSeleccionados.add(this.bancoformapago);
		}
		
		return bancoformapagosSeleccionados;
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
	
	public void generarReporteBancoFormaPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalBancoFormaPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoBancoFormaPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBancoFormaPagosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBancoFormaPagosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Banco Forma Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesBancoFormaPagosSeleccionados() throws Exception {
		ArrayList<BancoFormaPago> bancoformapagosSeleccionados=new ArrayList<BancoFormaPago>();		
		
		bancoformapagosSeleccionados=this.getBancoFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteBancoFormaPagos("Todos",bancoformapagosSeleccionados);
		
	}	
	
	public void generarReporteNormalBancoFormaPagosSeleccionados() throws Exception {
		ArrayList<BancoFormaPago> bancoformapagosSeleccionados=new ArrayList<BancoFormaPago>();		
		
		bancoformapagosSeleccionados=this.getBancoFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteBancoFormaPagos("Todos",bancoformapagosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionBancoFormaPagosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<BancoFormaPago> bancoformapagosSeleccionados=new ArrayList<BancoFormaPago>();
		
		bancoformapagosSeleccionados=this.getBancoFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteBancoFormaPagos("Todos",bancoformapagosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoBancoFormaPagosSeleccionados() throws Exception {
		ArrayList<BancoFormaPago> bancoformapagosSeleccionados=new ArrayList<BancoFormaPago>();		
		
		
		this.abrirInicializarFrameReporteDinamicoBancoFormaPago();
		
		
		bancoformapagosSeleccionados=this.getBancoFormaPagosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoBancoFormaPago();
		
		
		//this.generarReporteBancoFormaPagos("Todos",bancoformapagosSeleccionados ,bancoformapagoImplementable,bancoformapagoImplementableHome);
	}
	
	public void mostrarImportacionBancoFormaPagos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionBancoFormaPago();
		
		this.abrirFrameImportacionBancoFormaPago();		
		
			
		//this.generarReporteBancoFormaPagos("Todos",bancoformapagosSeleccionados ,bancoformapagoImplementable,bancoformapagoImplementableHome);
	}
	
	public void importarBancoFormaPagos() throws Exception {		
	
	}
	
	public void exportarBancoFormaPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelBancoFormaPagosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoBancoFormaPagosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlBancoFormaPagosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Banco Forma Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoBancoFormaPagosSeleccionados() throws Exception {
		ArrayList<BancoFormaPago> bancoformapagosSeleccionados=new ArrayList<BancoFormaPago>();		
		
		bancoformapagosSeleccionados=this.getBancoFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bancoformapago."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarBancoFormaPago(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(BancoFormaPago bancoformapagoAux:bancoformapagosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarBancoFormaPago(bancoformapagoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//bancoformapagoAux.setsDetalleGeneralEntityReporte(bancoformapagoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarBancoFormaPago(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=BancoFormaPagoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoFormaPagoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoFormaPagoConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoFormaPagoConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoFormaPagoConstantesFunciones.LABEL_IDFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoFormaPagoConstantesFunciones.LABEL_IDTIPOBANCOFORMAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoFormaPagoConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoFormaPagoConstantesFunciones.LABEL_IDMES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarBancoFormaPago(BancoFormaPago bancoformapago,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=bancoformapago.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=bancoformapago.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancoformapago.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancoformapago.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancoformapago.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancoformapago.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancoformapago.getfactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancoformapago.getdetaformapago_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancoformapago.gettipobancoformapago_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancoformapago.getnombre_banco();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancoformapago.getnombre_girador();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancoformapago.getfecha_vence().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancoformapago.getnumero_cuenta_banco();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancoformapago.getnumero_cheque();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancoformapago.getvalor_monto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancoformapago.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancoformapago.getmes_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelBancoFormaPagosSeleccionados() throws Exception {
		ArrayList<BancoFormaPago> bancoformapagosSeleccionados=new ArrayList<BancoFormaPago>();		
		
		bancoformapagosSeleccionados=this.getBancoFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bancoformapago.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("BancoFormaPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelBancoFormaPago(row);				
				iRow++;
			}				
			
			for(BancoFormaPago bancoformapagoAux:bancoformapagosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelBancoFormaPago(bancoformapagoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlBancoFormaPagosSeleccionados() throws Exception {
		ArrayList<BancoFormaPago> bancoformapagosSeleccionados=new ArrayList<BancoFormaPago>();		
		
		bancoformapagosSeleccionados=this.getBancoFormaPagosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bancoformapago.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("bancoformapagos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("bancoformapago");
			//elementRoot.appendChild(element);
		
			for(BancoFormaPago bancoformapagoAux:bancoformapagosSeleccionados) {
				element = document.createElement("bancoformapago");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlBancoFormaPago(bancoformapagoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelBancoFormaPago(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDTIPOBANCOFORMAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoFormaPagoConstantesFunciones.LABEL_IDMES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelBancoFormaPago(BancoFormaPago bancoformapago,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(bancoformapago.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(bancoformapago.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bancoformapago.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bancoformapago.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bancoformapago.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bancoformapago.getfactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bancoformapago.getdetaformapago_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bancoformapago.gettipobancoformapago_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bancoformapago.getnombre_banco());
		cell = row.createCell(iColumn++);cell.setCellValue(bancoformapago.getnombre_girador());
		cell = row.createCell(iColumn++);cell.setCellValue(bancoformapago.getfecha_vence());
		cell = row.createCell(iColumn++);cell.setCellValue(bancoformapago.getnumero_cuenta_banco());
		cell = row.createCell(iColumn++);cell.setCellValue(bancoformapago.getnumero_cheque());
		cell = row.createCell(iColumn++);cell.setCellValue(bancoformapago.getvalor_monto());
		cell = row.createCell(iColumn++);cell.setCellValue(bancoformapago.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bancoformapago.getmes_descripcion());				
	}
	
	public void setFilaDatosExportarXmlBancoFormaPago(BancoFormaPago bancoformapago,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(BancoFormaPagoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(bancoformapago.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(BancoFormaPagoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(bancoformapago.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(BancoFormaPagoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(bancoformapago.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(BancoFormaPagoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(bancoformapago.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(BancoFormaPagoConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(bancoformapago.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(BancoFormaPagoConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(bancoformapago.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementfactura_descripcion = document.createElement(BancoFormaPagoConstantesFunciones.IDFACTURA);
		elementfactura_descripcion.appendChild(document.createTextNode(bancoformapago.getfactura_descripcion()));
		element.appendChild(elementfactura_descripcion);

		Element elementdetaformapago_descripcion = document.createElement(BancoFormaPagoConstantesFunciones.IDDETAFORMAPAGO);
		elementdetaformapago_descripcion.appendChild(document.createTextNode(bancoformapago.getdetaformapago_descripcion()));
		element.appendChild(elementdetaformapago_descripcion);

		Element elementtipobancoformapago_descripcion = document.createElement(BancoFormaPagoConstantesFunciones.IDTIPOBANCOFORMAPAGO);
		elementtipobancoformapago_descripcion.appendChild(document.createTextNode(bancoformapago.gettipobancoformapago_descripcion()));
		element.appendChild(elementtipobancoformapago_descripcion);

		Element elementnombre_banco = document.createElement(BancoFormaPagoConstantesFunciones.NOMBREBANCO);
		elementnombre_banco.appendChild(document.createTextNode(bancoformapago.getnombre_banco().trim()));
		element.appendChild(elementnombre_banco);

		Element elementnombre_girador = document.createElement(BancoFormaPagoConstantesFunciones.NOMBREGIRADOR);
		elementnombre_girador.appendChild(document.createTextNode(bancoformapago.getnombre_girador().trim()));
		element.appendChild(elementnombre_girador);

		Element elementfecha_vence = document.createElement(BancoFormaPagoConstantesFunciones.FECHAVENCE);
		elementfecha_vence.appendChild(document.createTextNode(bancoformapago.getfecha_vence().toString().trim()));
		element.appendChild(elementfecha_vence);

		Element elementnumero_cuenta_banco = document.createElement(BancoFormaPagoConstantesFunciones.NUMEROCUENTABANCO);
		elementnumero_cuenta_banco.appendChild(document.createTextNode(bancoformapago.getnumero_cuenta_banco().trim()));
		element.appendChild(elementnumero_cuenta_banco);

		Element elementnumero_cheque = document.createElement(BancoFormaPagoConstantesFunciones.NUMEROCHEQUE);
		elementnumero_cheque.appendChild(document.createTextNode(bancoformapago.getnumero_cheque().trim()));
		element.appendChild(elementnumero_cheque);

		Element elementvalor_monto = document.createElement(BancoFormaPagoConstantesFunciones.VALORMONTO);
		elementvalor_monto.appendChild(document.createTextNode(bancoformapago.getvalor_monto().toString().trim()));
		element.appendChild(elementvalor_monto);

		Element elementanio_descripcion = document.createElement(BancoFormaPagoConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(bancoformapago.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(BancoFormaPagoConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(bancoformapago.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);
	}
	
	public void generarReporteGroupGenericoBancoFormaPagosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<BancoFormaPago> bancoformapagosSeleccionados=new ArrayList<BancoFormaPago>();
		
		bancoformapagosSeleccionados=this.getBancoFormaPagosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoBancoFormaPago(bancoformapagosSeleccionados);
		
		this.generarReporteBancoFormaPagos("Todos",bancoformapagosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoBancoFormaPago(ArrayList<BancoFormaPago> bancoformapagosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(BancoFormaPago bancoformapagoAux:bancoformapagosSeleccionados) {
				bancoformapagoAux.setsDetalleGeneralEntityReporte(bancoformapagoAux.toString());
			
				if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					bancoformapagoAux.setsDescripcionGeneralEntityReporte1(bancoformapagoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					bancoformapagoAux.setsDescripcionGeneralEntityReporte1(bancoformapagoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					bancoformapagoAux.setsDescripcionGeneralEntityReporte1(bancoformapagoAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					bancoformapagoAux.setsDescripcionGeneralEntityReporte1(bancoformapagoAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_IDFACTURA)) {
					existe=true;
					bancoformapagoAux.setsDescripcionGeneralEntityReporte1(bancoformapagoAux.getfactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGO)) {
					existe=true;
					bancoformapagoAux.setsDescripcionGeneralEntityReporte1(bancoformapagoAux.getdetaformapago_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_IDTIPOBANCOFORMAPAGO)) {
					existe=true;
					bancoformapagoAux.setsDescripcionGeneralEntityReporte1(bancoformapagoAux.gettipobancoformapago_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO)) {
					existe=true;
					bancoformapagoAux.setsDescripcionGeneralEntityReporte1(bancoformapagoAux.getnombre_banco());
				}
				 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR)) {
					existe=true;
					bancoformapagoAux.setsDescripcionGeneralEntityReporte1(bancoformapagoAux.getnombre_girador());
				}
				 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE)) {
					existe=true;
					bancoformapagoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(bancoformapagoAux.getfecha_vence()));
				}
				 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO)) {
					existe=true;
					bancoformapagoAux.setsDescripcionGeneralEntityReporte1(bancoformapagoAux.getnumero_cuenta_banco());
				}
				 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
					existe=true;
					bancoformapagoAux.setsDescripcionGeneralEntityReporte1(bancoformapagoAux.getnumero_cheque());
				}
				 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					bancoformapagoAux.setsDescripcionGeneralEntityReporte1(bancoformapagoAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BancoFormaPagoConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					bancoformapagoAux.setsDescripcionGeneralEntityReporte1(bancoformapagoAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesBancoFormaPago(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoBancoFormaPago=true;
				this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago=true;
				this.isVisibilidadCeldaGuardarCambiosBancoFormaPago=true;
			}
			
			this.isVisibilidadCeldaModificarBancoFormaPago=false;
			this.isVisibilidadCeldaActualizarBancoFormaPago=false;
			this.isVisibilidadCeldaEliminarBancoFormaPago=false;
			this.isVisibilidadCeldaCancelarBancoFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBancoFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarBancoFormaPago=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoBancoFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosBancoFormaPago=false;
			this.isVisibilidadCeldaModificarBancoFormaPago=false;
			this.isVisibilidadCeldaActualizarBancoFormaPago=true;
			this.isVisibilidadCeldaEliminarBancoFormaPago=false;
			this.isVisibilidadCeldaCancelarBancoFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBancoFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarBancoFormaPago=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoBancoFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosBancoFormaPago=false;
			this.isVisibilidadCeldaModificarBancoFormaPago=false;
			this.isVisibilidadCeldaActualizarBancoFormaPago=true;
			this.isVisibilidadCeldaEliminarBancoFormaPago=true;
			this.isVisibilidadCeldaCancelarBancoFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBancoFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarBancoFormaPago=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoBancoFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosBancoFormaPago=false;
			this.isVisibilidadCeldaModificarBancoFormaPago=false;
			this.isVisibilidadCeldaActualizarBancoFormaPago=true;
			this.isVisibilidadCeldaEliminarBancoFormaPago=false;
			this.isVisibilidadCeldaCancelarBancoFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBancoFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarBancoFormaPago=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoBancoFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago=true;
			this.isVisibilidadCeldaGuardarCambiosBancoFormaPago=true;
			this.isVisibilidadCeldaModificarBancoFormaPago=false;
			this.isVisibilidadCeldaActualizarBancoFormaPago=false;
			this.isVisibilidadCeldaEliminarBancoFormaPago=false;
			this.isVisibilidadCeldaCancelarBancoFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBancoFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarBancoFormaPago=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoBancoFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosBancoFormaPago=false;
			this.isVisibilidadCeldaActualizarBancoFormaPago=false;
			this.isVisibilidadCeldaEliminarBancoFormaPago=false;
			this.isVisibilidadCeldaCancelarBancoFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBancoFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarBancoFormaPago=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoBancoFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosBancoFormaPago=false;
			this.isVisibilidadCeldaModificarBancoFormaPago=true;
			this.isVisibilidadCeldaActualizarBancoFormaPago=false;
			this.isVisibilidadCeldaEliminarBancoFormaPago=false;
			this.isVisibilidadCeldaCancelarBancoFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBancoFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarBancoFormaPago=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(BancoFormaPagoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoBancoFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago=true;
			this.isVisibilidadCeldaGuardarCambiosBancoFormaPago=true;
		} else {
			this.actualizarEstadoPanelsBancoFormaPago(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarBancoFormaPago=false;
			//this.isVisibilidadCeldaVerFormBancoFormaPago=false;
			this.isVisibilidadCeldaDuplicarBancoFormaPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!bancoformapagoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago=false;
		} else {
			this.isVisibilidadCeldaNuevoBancoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosBancoFormaPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(bancoformapagoSessionBean.getEsGuardarRelacionado()) {
			if(!bancoformapagoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago=false;												
			}
			
			this.jButtonCerrarBancoFormaPago.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesBancoFormaPago=false;
		}
		
		if(!this.permiteMantenimiento(this.bancoformapago)) {
			this.isVisibilidadCeldaActualizarBancoFormaPago=false;
			this.isVisibilidadCeldaEliminarBancoFormaPago=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesBancoFormaPago() {
	}
	
	public void actualizarEstadoPanelsBancoFormaPago(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionBancoFormaPago!=null) {
				this.jScrollPanelDatosEdicionBancoFormaPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBancoFormaPago!=null) {
				this.jTabbedPaneBusquedasBancoFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBancoFormaPago!=null) {
				this.jScrollPanelDatosBancoFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionBancoFormaPago!=null) {
				this.jPanelPaginacionBancoFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBancoFormaPago!=null) {
				this.jPanelParametrosReportesBancoFormaPago.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionBancoFormaPago!=null) {
				this.jScrollPanelDatosEdicionBancoFormaPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBancoFormaPago!=null) {
				this.jTabbedPaneBusquedasBancoFormaPago.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosBancoFormaPago!=null) {
				this.jScrollPanelDatosBancoFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionBancoFormaPago!=null) {
				this.jPanelPaginacionBancoFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBancoFormaPago!=null) {
				this.jPanelParametrosReportesBancoFormaPago.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionBancoFormaPago!=null) {
				this.jScrollPanelDatosEdicionBancoFormaPago.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBancoFormaPago!=null) {
				this.jTabbedPaneBusquedasBancoFormaPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBancoFormaPago!=null) {
				this.jScrollPanelDatosBancoFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionBancoFormaPago!=null) {
				this.jPanelPaginacionBancoFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBancoFormaPago!=null) {
				this.jPanelParametrosReportesBancoFormaPago.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionBancoFormaPago!=null) {
				this.jScrollPanelDatosEdicionBancoFormaPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBancoFormaPago!=null) {
				this.jTabbedPaneBusquedasBancoFormaPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBancoFormaPago!=null) {
				this.jScrollPanelDatosBancoFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionBancoFormaPago!=null) {
				this.jPanelPaginacionBancoFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBancoFormaPago!=null) {
				this.jPanelParametrosReportesBancoFormaPago.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionBancoFormaPago!=null) {
				this.jScrollPanelDatosEdicionBancoFormaPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBancoFormaPago!=null) {
				this.jTabbedPaneBusquedasBancoFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBancoFormaPago!=null) {
				this.jScrollPanelDatosBancoFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionBancoFormaPago!=null) {
				this.jPanelPaginacionBancoFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBancoFormaPago!=null) {
				this.jPanelParametrosReportesBancoFormaPago.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionBancoFormaPago!=null) {
				this.jScrollPanelDatosEdicionBancoFormaPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBancoFormaPago!=null) {
				this.jTabbedPaneBusquedasBancoFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBancoFormaPago!=null) {
				this.jScrollPanelDatosBancoFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionBancoFormaPago!=null) {
				this.jPanelPaginacionBancoFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBancoFormaPago!=null) {
				this.jPanelParametrosReportesBancoFormaPago.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionBancoFormaPago!=null) {
				this.jScrollPanelDatosEdicionBancoFormaPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBancoFormaPago!=null) {
				this.jTabbedPaneBusquedasBancoFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBancoFormaPago!=null) {
				this.jScrollPanelDatosBancoFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionBancoFormaPago!=null) {
				this.jPanelPaginacionBancoFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBancoFormaPago!=null) {
				this.jPanelParametrosReportesBancoFormaPago.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasBancoFormaPago!=null) {
					this.jTabbedPaneBusquedasBancoFormaPago.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesBancoFormaPago!=null) {
				this.jPanelParametrosReportesBancoFormaPago.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBancoFormaPago!=null) {
				this.jTabbedPaneBusquedasBancoFormaPago.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesBancoFormaPago!=null) {
				this.jPanelParametrosReportesBancoFormaPago.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBancoFormaPago=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBancoFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdBancoFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdDetaFormaPago=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDetaFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdDetaFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdFacturaBancoFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBancoFormaPago=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBancoFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdBancoFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdDetaFormaPago=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdDetaFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdDetaFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdFacturaBancoFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdBancoFormaPago=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdBancoFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdBancoFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdDetaFormaPago=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdDetaFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdDetaFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdFacturaBancoFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdBancoFormaPago=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdBancoFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdBancoFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdDetaFormaPago=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdDetaFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdDetaFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdFacturaBancoFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaFactura(Boolean isParaFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFacturaNegation=!isParaFactura;

			this.isVisibilidadFK_IdBancoFormaPago=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdBancoFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdBancoFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdDetaFormaPago=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdDetaFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdDetaFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaFactura;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdFacturaBancoFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaDetaFormaPago(Boolean isParaDetaFormaPago){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDetaFormaPagoNegation=!isParaDetaFormaPago;

			this.isVisibilidadFK_IdBancoFormaPago=isParaDetaFormaPagoNegation;
			if(!this.isVisibilidadFK_IdBancoFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdBancoFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdDetaFormaPago=isParaDetaFormaPago;
			if(!this.isVisibilidadFK_IdDetaFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdDetaFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaDetaFormaPagoNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdFacturaBancoFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoBancoFormaPago(Boolean isParaTipoBancoFormaPago){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoBancoFormaPagoNegation=!isParaTipoBancoFormaPago;

			this.isVisibilidadFK_IdBancoFormaPago=isParaTipoBancoFormaPago;
			if(!this.isVisibilidadFK_IdBancoFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdBancoFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdDetaFormaPago=isParaTipoBancoFormaPagoNegation;
			if(!this.isVisibilidadFK_IdDetaFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdDetaFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaTipoBancoFormaPagoNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdFacturaBancoFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdBancoFormaPago=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdBancoFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdBancoFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdDetaFormaPago=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdDetaFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdDetaFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdFacturaBancoFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdBancoFormaPago=isParaMesNegation;
			if(!this.isVisibilidadFK_IdBancoFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdBancoFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdDetaFormaPago=isParaMesNegation;
			if(!this.isVisibilidadFK_IdDetaFormaPago) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdDetaFormaPagoBancoFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaMesNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasBancoFormaPago.remove(jPanelFK_IdFacturaBancoFormaPago);}
		}
		
	}
	
	
	
	

	public String registrarSesionBancoFormaPagoParaBusquedaFacturas() throws Exception {
		Boolean isPaginaPopupFactura=false;

		try {

			if(bancoformapagoSessionBean==null) {
				bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
			}

			if(facturaSessionBean==null) {
				facturaSessionBean=new FacturaSessionBean();
			}

			facturaSessionBean.setsPathNavegacionActual(bancoformapagoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaConstantesFunciones.SCLASSWEBTITULO);
			facturaSessionBean.setisPermiteRecargarInformacion(false);
			facturaSessionBean.setisPaginaPopup(true);
			isPaginaPopupFactura=facturaSessionBean.getisPaginaPopup();
			facturaSessionBean.setisPaginaPopup(false);
			facturaSessionBean.setEstaModoBusqueda(true);
			facturaSessionBean.setsFuncionBusquedaRapida("window.opener.bancoformapagoFuncionGeneral.setCombosCodigoDesdeBusquedaid_factura(TO_REPLACE);");
			facturaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFactura(true);
			facturaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFactura(BancoFormaPagoConstantesFunciones.SNOMBREOPCION);
			//facturaSessionBean.setisBusquedaDesdeForeignKeySesionBancoFormaPago(true);
			//facturaSessionBean.setlidBancoFormaPagoActual(this.idBancoFormaPagoActual);

			bancoformapagoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyBancoFormaPago(true);
			bancoformapagoSessionBean.setlIdBancoFormaPagoActualForeignKey(this.idBancoFormaPagoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//BancoFormaPagoSessionBean bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
		
		if(this.bancoformapagoSessionBean==null) {
			this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
		}
		
		this.bancoformapagoSessionBean.setsUltimaBusquedaBancoFormaPago(this.getsAccionBusqueda());
		this.bancoformapagoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.bancoformapagoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBancoFormaPago")) {
			bancoformapagoSessionBean.setid_tipo_banco_forma_pago(this.getid_tipo_banco_forma_pagoFK_IdBancoFormaPago());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdDetaFormaPago")) {
			bancoformapagoSessionBean.setid_deta_forma_pago(this.getid_deta_forma_pagoFK_IdDetaFormaPago());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			bancoformapagoSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			bancoformapagoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
			bancoformapagoSessionBean.setid_factura(this.getid_facturaFK_IdFactura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			bancoformapagoSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			bancoformapagoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//BancoFormaPagoSessionBean bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
		
		if(this.bancoformapagoSessionBean==null) {
			this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
		}
		
		if(this.bancoformapagoSessionBean.getsUltimaBusquedaBancoFormaPago()!=null&&!this.bancoformapagoSessionBean.getsUltimaBusquedaBancoFormaPago().equals("")) {
			this.setsAccionBusqueda(bancoformapagoSessionBean.getsUltimaBusquedaBancoFormaPago());
			this.setiNumeroPaginacion(bancoformapagoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(bancoformapagoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBancoFormaPago")) {
				this.setid_tipo_banco_forma_pagoFK_IdBancoFormaPago(bancoformapagoSessionBean.getid_tipo_banco_forma_pago());
				bancoformapagoSessionBean.setid_tipo_banco_forma_pago(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdDetaFormaPago")) {
				this.setid_deta_forma_pagoFK_IdDetaFormaPago(bancoformapagoSessionBean.getid_deta_forma_pago());
				bancoformapagoSessionBean.setid_deta_forma_pago(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(bancoformapagoSessionBean.getid_ejercicio());
				bancoformapagoSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(bancoformapagoSessionBean.getid_empresa());
				bancoformapagoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
				this.setid_facturaFK_IdFactura(bancoformapagoSessionBean.getid_factura());
				bancoformapagoSessionBean.setid_factura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(bancoformapagoSessionBean.getid_periodo());
				bancoformapagoSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(bancoformapagoSessionBean.getid_sucursal());
				bancoformapagoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.bancoformapagoSessionBean.setsUltimaBusquedaBancoFormaPago("");
		this.bancoformapagoSessionBean.setiNumeroPaginacion(BancoFormaPagoConstantesFunciones.INUMEROPAGINACION);
		this.bancoformapagoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaBancoFormaPago(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioBancoFormaPago() {
		this.updateBorderResaltarBusquedasFormularioBancoFormaPago();
		this.updateVisibilidadBusquedasFormularioBancoFormaPago();
		this.updateHabilitarBusquedasFormularioBancoFormaPago();
	}
	
	public void updateBorderResaltarBusquedasFormularioBancoFormaPago() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasBancoFormaPago.getComponents().length>0) {
	

		if(this.bancoformapagoConstantesFunciones.resaltarFK_IdBancoFormaPagoBancoFormaPago!=null) {
			index= this.jTabbedPaneBusquedasBancoFormaPago.indexOfComponent(this.jPanelFK_IdBancoFormaPagoBancoFormaPago);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBancoFormaPago.getComponent(index);
				jPanel.setBorder(this.bancoformapagoConstantesFunciones.resaltarFK_IdBancoFormaPagoBancoFormaPago);
			}
		}

		if(this.bancoformapagoConstantesFunciones.resaltarFK_IdDetaFormaPagoBancoFormaPago!=null) {
			index= this.jTabbedPaneBusquedasBancoFormaPago.indexOfComponent(this.jPanelFK_IdDetaFormaPagoBancoFormaPago);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBancoFormaPago.getComponent(index);
				jPanel.setBorder(this.bancoformapagoConstantesFunciones.resaltarFK_IdDetaFormaPagoBancoFormaPago);
			}
		}

		if(this.bancoformapagoConstantesFunciones.resaltarFK_IdFacturaBancoFormaPago!=null) {
			index= this.jTabbedPaneBusquedasBancoFormaPago.indexOfComponent(this.jPanelFK_IdFacturaBancoFormaPago);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBancoFormaPago.getComponent(index);
				jPanel.setBorder(this.bancoformapagoConstantesFunciones.resaltarFK_IdFacturaBancoFormaPago);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioBancoFormaPago() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasBancoFormaPago.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBancoFormaPago.indexOfComponent(this.jPanelFK_IdBancoFormaPagoBancoFormaPago);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBancoFormaPago.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.bancoformapagoConstantesFunciones.mostrarFK_IdBancoFormaPagoBancoFormaPago);
			if(!this.bancoformapagoConstantesFunciones.mostrarFK_IdBancoFormaPagoBancoFormaPago && index>-1) {
				this.jTabbedPaneBusquedasBancoFormaPago.remove(index);
			}

			index= this.jTabbedPaneBusquedasBancoFormaPago.indexOfComponent(this.jPanelFK_IdDetaFormaPagoBancoFormaPago);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBancoFormaPago.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.bancoformapagoConstantesFunciones.mostrarFK_IdDetaFormaPagoBancoFormaPago);
			if(!this.bancoformapagoConstantesFunciones.mostrarFK_IdDetaFormaPagoBancoFormaPago && index>-1) {
				this.jTabbedPaneBusquedasBancoFormaPago.remove(index);
			}

			index= this.jTabbedPaneBusquedasBancoFormaPago.indexOfComponent(this.jPanelFK_IdFacturaBancoFormaPago);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBancoFormaPago.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.bancoformapagoConstantesFunciones.mostrarFK_IdFacturaBancoFormaPago);
			if(!this.bancoformapagoConstantesFunciones.mostrarFK_IdFacturaBancoFormaPago && index>-1) {
				this.jTabbedPaneBusquedasBancoFormaPago.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioBancoFormaPago() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasBancoFormaPago.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBancoFormaPago.indexOfComponent(this.jPanelFK_IdBancoFormaPagoBancoFormaPago);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBancoFormaPago.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.bancoformapagoConstantesFunciones.activarFK_IdBancoFormaPagoBancoFormaPago);
				this.jTabbedPaneBusquedasBancoFormaPago.setEnabledAt(index,this.bancoformapagoConstantesFunciones.activarFK_IdBancoFormaPagoBancoFormaPago);
			}

			index= this.jTabbedPaneBusquedasBancoFormaPago.indexOfComponent(this.jPanelFK_IdDetaFormaPagoBancoFormaPago);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBancoFormaPago.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.bancoformapagoConstantesFunciones.activarFK_IdDetaFormaPagoBancoFormaPago);
				this.jTabbedPaneBusquedasBancoFormaPago.setEnabledAt(index,this.bancoformapagoConstantesFunciones.activarFK_IdDetaFormaPagoBancoFormaPago);
			}

			index= this.jTabbedPaneBusquedasBancoFormaPago.indexOfComponent(this.jPanelFK_IdFacturaBancoFormaPago);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBancoFormaPago.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.bancoformapagoConstantesFunciones.activarFK_IdFacturaBancoFormaPago);
				this.jTabbedPaneBusquedasBancoFormaPago.setEnabledAt(index,this.bancoformapagoConstantesFunciones.activarFK_IdFacturaBancoFormaPago);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaBancoFormaPago(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBancoFormaPago")) {
			index= this.jTabbedPaneBusquedasBancoFormaPago.indexOfComponent(this.jPanelFK_IdBancoFormaPagoBancoFormaPago);

			this.jTabbedPaneBusquedasBancoFormaPago.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBancoFormaPago.getComponent(index);

			this.bancoformapagoConstantesFunciones.setResaltarFK_IdBancoFormaPagoBancoFormaPago(resaltar);

			jPanel.setBorder(this.bancoformapagoConstantesFunciones.resaltarFK_IdBancoFormaPagoBancoFormaPago);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdDetaFormaPago")) {
			index= this.jTabbedPaneBusquedasBancoFormaPago.indexOfComponent(this.jPanelFK_IdDetaFormaPagoBancoFormaPago);

			this.jTabbedPaneBusquedasBancoFormaPago.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBancoFormaPago.getComponent(index);

			this.bancoformapagoConstantesFunciones.setResaltarFK_IdDetaFormaPagoBancoFormaPago(resaltar);

			jPanel.setBorder(this.bancoformapagoConstantesFunciones.resaltarFK_IdDetaFormaPagoBancoFormaPago);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFactura")) {
			index= this.jTabbedPaneBusquedasBancoFormaPago.indexOfComponent(this.jPanelFK_IdFacturaBancoFormaPago);

			this.jTabbedPaneBusquedasBancoFormaPago.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBancoFormaPago.getComponent(index);

			this.bancoformapagoConstantesFunciones.setResaltarFK_IdFacturaBancoFormaPago(resaltar);

			jPanel.setBorder(this.bancoformapagoConstantesFunciones.resaltarFK_IdFacturaBancoFormaPago);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarBancoFormaPago.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioBancoFormaPago() throws Exception {

		if(this.jInternalFrameDetalleFormBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioBancoFormaPago();
		this.updateVisibilidadResaltarControlesFormularioBancoFormaPago();
		this.updateHabilitarResaltarControlesFormularioBancoFormaPago();
		
	}
	
	public void updateBorderResaltarControlesFormularioBancoFormaPago() throws Exception {
		if(this.jInternalFrameDetalleFormBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.bancoformapagoConstantesFunciones.resaltaridBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago!=null) {this.jInternalFrameDetalleFormBancoFormaPago.jLabelidBancoFormaPago.setBorder(this.bancoformapagoConstantesFunciones.resaltaridBancoFormaPago);}
		if(this.bancoformapagoConstantesFunciones.resaltarid_empresaBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago!=null) {this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_empresaBancoFormaPago.setBorder(this.bancoformapagoConstantesFunciones.resaltarid_empresaBancoFormaPago);}
		if(this.bancoformapagoConstantesFunciones.resaltarid_sucursalBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago!=null) {this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_sucursalBancoFormaPago.setBorder(this.bancoformapagoConstantesFunciones.resaltarid_sucursalBancoFormaPago);}
		if(this.bancoformapagoConstantesFunciones.resaltarid_ejercicioBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago!=null) {this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_ejercicioBancoFormaPago.setBorder(this.bancoformapagoConstantesFunciones.resaltarid_ejercicioBancoFormaPago);}
		if(this.bancoformapagoConstantesFunciones.resaltarid_periodoBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago!=null) {this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_periodoBancoFormaPago.setBorder(this.bancoformapagoConstantesFunciones.resaltarid_periodoBancoFormaPago);}
		if(this.bancoformapagoConstantesFunciones.resaltarid_facturaBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago!=null) {this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_facturaBancoFormaPago.setBorder(this.bancoformapagoConstantesFunciones.resaltarid_facturaBancoFormaPago);}
		if(this.bancoformapagoConstantesFunciones.resaltarid_deta_forma_pagoBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago!=null) {this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_deta_forma_pagoBancoFormaPago.setBorder(this.bancoformapagoConstantesFunciones.resaltarid_deta_forma_pagoBancoFormaPago);}
		if(this.bancoformapagoConstantesFunciones.resaltarid_tipo_banco_forma_pagoBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago!=null) {this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.setBorder(this.bancoformapagoConstantesFunciones.resaltarid_tipo_banco_forma_pagoBancoFormaPago);}
		if(this.bancoformapagoConstantesFunciones.resaltarnombre_bancoBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago!=null) {this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnombre_bancoBancoFormaPago.setBorder(this.bancoformapagoConstantesFunciones.resaltarnombre_bancoBancoFormaPago);}
		if(this.bancoformapagoConstantesFunciones.resaltarnombre_giradorBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago!=null) {this.jInternalFrameDetalleFormBancoFormaPago.jTextAreanombre_giradorBancoFormaPago.setBorder(this.bancoformapagoConstantesFunciones.resaltarnombre_giradorBancoFormaPago);}
		if(this.bancoformapagoConstantesFunciones.resaltarfecha_venceBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago!=null) {this.jInternalFrameDetalleFormBancoFormaPago.jDateChooserfecha_venceBancoFormaPago.setBorder(this.bancoformapagoConstantesFunciones.resaltarfecha_venceBancoFormaPago);}
		if(this.bancoformapagoConstantesFunciones.resaltarnumero_cuenta_bancoBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago!=null) {this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnumero_cuenta_bancoBancoFormaPago.setBorder(this.bancoformapagoConstantesFunciones.resaltarnumero_cuenta_bancoBancoFormaPago);}
		if(this.bancoformapagoConstantesFunciones.resaltarnumero_chequeBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago!=null) {this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnumero_chequeBancoFormaPago.setBorder(this.bancoformapagoConstantesFunciones.resaltarnumero_chequeBancoFormaPago);}
		if(this.bancoformapagoConstantesFunciones.resaltarvalor_montoBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago!=null) {this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldvalor_montoBancoFormaPago.setBorder(this.bancoformapagoConstantesFunciones.resaltarvalor_montoBancoFormaPago);}
		if(this.bancoformapagoConstantesFunciones.resaltarid_anioBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago!=null) {this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_anioBancoFormaPago.setBorder(this.bancoformapagoConstantesFunciones.resaltarid_anioBancoFormaPago);}
		if(this.bancoformapagoConstantesFunciones.resaltarid_mesBancoFormaPago!=null && this.jInternalFrameDetalleFormBancoFormaPago!=null) {this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_mesBancoFormaPago.setBorder(this.bancoformapagoConstantesFunciones.resaltarid_mesBancoFormaPago);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioBancoFormaPago() throws Exception {		
		if(this.jInternalFrameDetalleFormBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
	
		//this.jInternalFrameDetalleFormBancoFormaPago.jLabelidBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostraridBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jPanelidBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostraridBancoFormaPago);
		//this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_empresaBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_empresaBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jPanelid_empresaBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_empresaBancoFormaPago);
		//this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_sucursalBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_sucursalBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jPanelid_sucursalBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_sucursalBancoFormaPago);
		//this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_ejercicioBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_ejercicioBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jPanelid_ejercicioBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_ejercicioBancoFormaPago);
		//this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_periodoBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_periodoBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jPanelid_periodoBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_periodoBancoFormaPago);
		//this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_facturaBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_facturaBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jPanelid_facturaBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_facturaBancoFormaPago);
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_facturaBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_facturaBancoFormaPago);
		//this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_deta_forma_pagoBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_deta_forma_pagoBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jPanelid_deta_forma_pagoBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_deta_forma_pagoBancoFormaPago);
		//this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_tipo_banco_forma_pagoBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jPanelid_tipo_banco_forma_pagoBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_tipo_banco_forma_pagoBancoFormaPago);
		//this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnombre_bancoBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarnombre_bancoBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jPanelnombre_bancoBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarnombre_bancoBancoFormaPago);
		//this.jInternalFrameDetalleFormBancoFormaPago.jTextAreanombre_giradorBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarnombre_giradorBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jPanelnombre_giradorBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarnombre_giradorBancoFormaPago);
		//this.jInternalFrameDetalleFormBancoFormaPago.jDateChooserfecha_venceBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarfecha_venceBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jPanelfecha_venceBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarfecha_venceBancoFormaPago);
		//this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnumero_cuenta_bancoBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarnumero_cuenta_bancoBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jPanelnumero_cuenta_bancoBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarnumero_cuenta_bancoBancoFormaPago);
		//this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnumero_chequeBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarnumero_chequeBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jPanelnumero_chequeBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarnumero_chequeBancoFormaPago);
		//this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldvalor_montoBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarvalor_montoBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jPanelvalor_montoBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarvalor_montoBancoFormaPago);
		//this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_anioBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_anioBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jPanelid_anioBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_anioBancoFormaPago);
		//this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_mesBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_mesBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jPanelid_mesBancoFormaPago.setVisible(this.bancoformapagoConstantesFunciones.mostrarid_mesBancoFormaPago);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioBancoFormaPago() throws Exception {
		if(this.jInternalFrameDetalleFormBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBancoFormaPago!=null) {
	
		this.jInternalFrameDetalleFormBancoFormaPago.jLabelidBancoFormaPago.setEnabled(this.bancoformapagoConstantesFunciones.activaridBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_empresaBancoFormaPago.setEnabled(this.bancoformapagoConstantesFunciones.activarid_empresaBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_sucursalBancoFormaPago.setEnabled(this.bancoformapagoConstantesFunciones.activarid_sucursalBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_ejercicioBancoFormaPago.setEnabled(this.bancoformapagoConstantesFunciones.activarid_ejercicioBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_periodoBancoFormaPago.setEnabled(this.bancoformapagoConstantesFunciones.activarid_periodoBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_facturaBancoFormaPago.setEnabled(this.bancoformapagoConstantesFunciones.activarid_facturaBancoFormaPago);
			this.jInternalFrameDetalleFormBancoFormaPago.jButtonid_facturaBancoFormaPago.setEnabled(this.bancoformapagoConstantesFunciones.activarid_facturaBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_deta_forma_pagoBancoFormaPago.setEnabled(this.bancoformapagoConstantesFunciones.activarid_deta_forma_pagoBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.setEnabled(this.bancoformapagoConstantesFunciones.activarid_tipo_banco_forma_pagoBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnombre_bancoBancoFormaPago.setEnabled(this.bancoformapagoConstantesFunciones.activarnombre_bancoBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jTextAreanombre_giradorBancoFormaPago.setEnabled(this.bancoformapagoConstantesFunciones.activarnombre_giradorBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jDateChooserfecha_venceBancoFormaPago.setEnabled(this.bancoformapagoConstantesFunciones.activarfecha_venceBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnumero_cuenta_bancoBancoFormaPago.setEnabled(this.bancoformapagoConstantesFunciones.activarnumero_cuenta_bancoBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldnumero_chequeBancoFormaPago.setEnabled(this.bancoformapagoConstantesFunciones.activarnumero_chequeBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jTextFieldvalor_montoBancoFormaPago.setEnabled(this.bancoformapagoConstantesFunciones.activarvalor_montoBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_anioBancoFormaPago.setEnabled(this.bancoformapagoConstantesFunciones.activarid_anioBancoFormaPago);
		this.jInternalFrameDetalleFormBancoFormaPago.jComboBoxid_mesBancoFormaPago.setEnabled(this.bancoformapagoConstantesFunciones.activarid_mesBancoFormaPago);
		}
	}
	
		
}