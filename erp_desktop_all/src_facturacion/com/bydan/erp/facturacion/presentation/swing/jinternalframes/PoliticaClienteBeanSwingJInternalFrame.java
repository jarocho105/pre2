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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.PoliticaClienteConstantesFunciones;
import com.bydan.erp.facturacion.util.PoliticaClienteParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.PoliticaClienteParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.PoliticaClienteBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PoliticaClienteBeanSwingJInternalFrame extends PoliticaClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PoliticaClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PoliticaCliente> politicaclienteValidator = new ClassValidator<PoliticaCliente>(PoliticaCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PoliticaCliente politicacliente;	
	public PoliticaCliente politicaclienteAux;
	public PoliticaCliente politicaclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PoliticaCliente politicaclienteTotales;
	public Long idPoliticaClienteActual;
	public Long iIdNuevoPoliticaCliente=0L;
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

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
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
	
	public Boolean isPermisoTodoPoliticaCliente;
	public Boolean isPermisoNuevoPoliticaCliente;
	public Boolean isPermisoActualizarPoliticaCliente;
	public Boolean isPermisoActualizarOriginalPoliticaCliente;
	public Boolean isPermisoEliminarPoliticaCliente;
	public Boolean isPermisoGuardarCambiosPoliticaCliente;
	public Boolean isPermisoConsultaPoliticaCliente;
	public Boolean isPermisoBusquedaPoliticaCliente;
	public Boolean isPermisoReportePoliticaCliente;
	public Boolean isPermisoPaginacionMedioPoliticaCliente;
	public Boolean isPermisoPaginacionAltoPoliticaCliente;
	public Boolean isPermisoPaginacionTodoPoliticaCliente;
	public Boolean isPermisoCopiarPoliticaCliente;
	public Boolean isPermisoVerFormPoliticaCliente;
	public Boolean isPermisoDuplicarPoliticaCliente;
	public Boolean isPermisoOrdenPoliticaCliente;
	
	
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
	
	public PoliticaClienteParameterReturnGeneral politicaclienteReturnGeneral;
	public PoliticaClienteParameterReturnGeneral politicaclienteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPoliticaCliente=false;
	public Boolean esParaAccionDesdeFormularioPoliticaCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PoliticaClienteSessionBeanAdditional politicaclienteSessionBeanAdditional=null;
	
	public PoliticaClienteSessionBeanAdditional getPoliticaClienteSessionBeanAdditional() {
		return this.politicaclienteSessionBeanAdditional;
	}
	
	public void setPoliticaClienteSessionBeanAdditional(PoliticaClienteSessionBeanAdditional politicaclienteSessionBeanAdditional) {
		try {
			this.politicaclienteSessionBeanAdditional=politicaclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PoliticaClienteBeanSwingJInternalFrameAdditional politicaclienteBeanSwingJInternalFrameAdditional=null;
	//public class PoliticaClienteBeanSwingJInternalFrame
	
	public PoliticaClienteBeanSwingJInternalFrameAdditional getPoliticaClienteBeanSwingJInternalFrameAdditional() {
		return this.politicaclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setPoliticaClienteBeanSwingJInternalFrameAdditional(PoliticaClienteBeanSwingJInternalFrameAdditional politicaclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.politicaclienteBeanSwingJInternalFrameAdditional=politicaclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PoliticaClienteLogic politicaclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PoliticaCliente politicaclienteBean;
	public PoliticaClienteConstantesFunciones politicaclienteConstantesFunciones;
	//public PoliticaClienteParameterReturnGeneral politicaclienteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<PoliticaCliente> politicaclientes;	
	//public List<PoliticaCliente> politicaclientesEliminados;
	//public List<PoliticaCliente> politicaclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPoliticaCliente=false;
	public Boolean isVisibilidadCeldaDuplicarPoliticaCliente=true;
	public Boolean isVisibilidadCeldaCopiarPoliticaCliente=true;
	public Boolean isVisibilidadCeldaVerFormPoliticaCliente=true;
	public Boolean isVisibilidadCeldaOrdenPoliticaCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPoliticaCliente=false;
	public Boolean isVisibilidadCeldaModificarPoliticaCliente=false;
	public Boolean isVisibilidadCeldaActualizarPoliticaCliente=false;
	public Boolean isVisibilidadCeldaEliminarPoliticaCliente=false;
	public Boolean isVisibilidadCeldaCancelarPoliticaCliente=false;
	public Boolean isVisibilidadCeldaGuardarPoliticaCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPoliticaCliente=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoPoliticaCliente() {
		return this.iIdNuevoPoliticaCliente;
	}

	public void setiIdNuevoPoliticaCliente(Long iIdNuevoPoliticaCliente) {
		this.iIdNuevoPoliticaCliente = iIdNuevoPoliticaCliente;
	}
	
	public Long getidPoliticaClienteActual() {
		return this.idPoliticaClienteActual;
	}

	public void setidPoliticaClienteActual(Long idPoliticaClienteActual) {
		this.idPoliticaClienteActual = idPoliticaClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PoliticaCliente getpoliticacliente() {
		return this.politicacliente;
	}

	public void setpoliticacliente(PoliticaCliente politicacliente) {
		this.politicacliente = politicacliente;
	}
	
	public PoliticaCliente getpoliticaclienteAux() {
		return this.politicaclienteAux;
	}

	public void setpoliticaclienteAux(PoliticaCliente politicaclienteAux) {
		this.politicaclienteAux = politicaclienteAux;
	}				
	
	public PoliticaCliente getpoliticaclienteAnterior() {
		return this.politicaclienteAnterior;
	}

	public void setpoliticaclienteAnterior(PoliticaCliente politicaclienteAnterior) {
		this.politicaclienteAnterior = politicaclienteAnterior;
	}	
	
	public PoliticaCliente getpoliticaclienteTotales() {
		return this.politicaclienteTotales;
	}

	public void setpoliticaclienteTotales(PoliticaCliente politicaclienteTotales) {
		this.politicaclienteTotales = politicaclienteTotales;
	}	
	
	public PoliticaCliente getpoliticaclienteBean() {
		return this.politicaclienteBean;
	}

	public void setpoliticaclienteBean(PoliticaCliente politicaclienteBean) {
		this.politicaclienteBean = politicaclienteBean;
	}	
	
	public PoliticaClienteParameterReturnGeneral getpoliticaclienteReturnGeneral() {
		return this.politicaclienteReturnGeneral;
	}

	public void setpoliticaclienteReturnGeneral(PoliticaClienteParameterReturnGeneral politicaclienteReturnGeneral) {
		this.politicaclienteReturnGeneral = politicaclienteReturnGeneral;
	}	
	
	
	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
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
	
	
	public PoliticaClienteLogic getPoliticaClienteLogic()	{		
		return politicaclienteLogic;
	}

	public void setPoliticaClienteLogic(PoliticaClienteLogic politicaclienteLogic) {
		this.politicaclienteLogic = politicaclienteLogic;
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
	
	public Boolean getIsEsNuevoPoliticaCliente() {
		return isEsNuevoPoliticaCliente;
	}

	public void setIsEsNuevoPoliticaCliente(Boolean isEsNuevoPoliticaCliente) {
		this.isEsNuevoPoliticaCliente = isEsNuevoPoliticaCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioPoliticaCliente() {
		return esParaAccionDesdeFormularioPoliticaCliente;
	}
	
	public void setEsParaAccionDesdeFormularioPoliticaCliente(Boolean esParaAccionDesdeFormularioPoliticaCliente) {
		this.esParaAccionDesdeFormularioPoliticaCliente = esParaAccionDesdeFormularioPoliticaCliente;
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

			if(this.politicaclienteSessionBean==null) {
				this.politicaclienteSessionBean=new PoliticaClienteSessionBean();
			}

			if(!this.politicaclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(politicaclienteSessionBean.getlidEmpresaActual());
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

			if(this.politicaclienteSessionBean==null) {
				this.politicaclienteSessionBean=new PoliticaClienteSessionBean();
			}

			if(!this.politicaclienteSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(politicaclienteSessionBean.getlidSucursalActual());
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

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.politicaclienteSessionBean==null) {
				this.politicaclienteSessionBean=new PoliticaClienteSessionBean();
			}

			if(!this.politicaclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(politicaclienteSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
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

					if(this.politicacliente!=null) {
						this.politicacliente.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
						this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_empresaPoliticaCliente.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPoliticaCliente.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
						if(this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_empresaPoliticaCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_empresaPoliticaCliente.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPoliticaClienteGenerico)throws Exception
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
				jComboBoxid_empresaPoliticaClienteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPoliticaClienteGenerico!=null && jComboBoxid_empresaPoliticaClienteGenerico.getItemCount()>0) {
					jComboBoxid_empresaPoliticaClienteGenerico.setSelectedIndex(0);
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

					if(this.politicacliente!=null) {
						this.politicacliente.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
						this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_sucursalPoliticaCliente.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalPoliticaCliente.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
						if(this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_sucursalPoliticaCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_sucursalPoliticaCliente.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalPoliticaClienteGenerico)throws Exception
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
				jComboBoxid_sucursalPoliticaClienteGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalPoliticaClienteGenerico!=null && jComboBoxid_sucursalPoliticaClienteGenerico.getItemCount()>0) {
					jComboBoxid_sucursalPoliticaClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.politicacliente!=null) {
						this.politicacliente.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
						this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_clientePoliticaCliente.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clientePoliticaCliente.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
						if(this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_clientePoliticaCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_clientePoliticaCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClientePoliticaCliente!=null) {
						jComboBoxid_clienteFK_IdClientePoliticaCliente.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClientePoliticaCliente!=null) {
							//jComboBoxid_clienteFK_IdClientePoliticaCliente.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClientePoliticaCliente.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClientePoliticaCliente.setSelectedIndex(0);
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

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clientePoliticaClienteGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clientePoliticaClienteGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clientePoliticaClienteGenerico!=null && jComboBoxid_clientePoliticaClienteGenerico.getItemCount()>0) {
					jComboBoxid_clientePoliticaClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PoliticaCliente politicacliente,JComboBox jComboBoxid_empresaPoliticaClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPoliticaClienteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_empresaPoliticaCliente.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPoliticaClienteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				politicacliente.setid_empresa(empresaAux.getId());
				politicacliente.setempresa_descripcion(PoliticaClienteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				politicacliente.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(PoliticaCliente politicacliente,JComboBox jComboBoxid_sucursalPoliticaClienteGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalPoliticaClienteGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_sucursalPoliticaCliente.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalPoliticaClienteGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				politicacliente.setid_sucursal(sucursalAux.getId());
				politicacliente.setsucursal_descripcion(PoliticaClienteConstantesFunciones.getSucursalDescripcion(sucursalAux));
				politicacliente.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(PoliticaCliente politicacliente,JComboBox jComboBoxid_clientePoliticaClienteGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clientePoliticaClienteGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_clientePoliticaCliente.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clientePoliticaClienteGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				politicacliente.setid_cliente(clienteAux.getId());
				politicacliente.setcliente_descripcion(PoliticaClienteConstantesFunciones.getClienteDescripcion(clienteAux));
				politicacliente.setCliente(clienteAux);			}
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

					if(!PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { 
							this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_empresaPoliticaCliente.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_empresaPoliticaCliente.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { 
					}

					if(!PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { 
							this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_sucursalPoliticaCliente.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_sucursalPoliticaCliente.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { 
					}

					if(!PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { 
							this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_clientePoliticaCliente.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_clientePoliticaCliente.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { 
					}

					if(!PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClientePoliticaCliente.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClientePoliticaCliente.addItem(cliente);
							}
						}

						if(!PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
							this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_empresaPoliticaCliente.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
							this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_empresaPoliticaCliente.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
							this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_sucursalPoliticaCliente.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
							this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_sucursalPoliticaCliente.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
							this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_clientePoliticaCliente.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
							this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_clientePoliticaCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClientePoliticaCliente.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClientePoliticaCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPoliticaCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PoliticaClienteConstantesFunciones.refrescarForeignKeysDescripcionesPoliticaCliente(this.politicaclienteLogic.getPoliticaClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PoliticaClienteConstantesFunciones.refrescarForeignKeysDescripcionesPoliticaCliente(this.politicaclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Cliente.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//politicaclienteLogic.setPoliticaClientes(this.politicaclientes);
			politicaclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PoliticaClienteParameterReturnGeneral getPoliticaClienteParameterGeneral() {
		return this.politicaclienteParameterGeneral;
	}
	
	public void setPoliticaClienteParameterGeneral(PoliticaClienteParameterReturnGeneral politicaclienteParameterGeneral) {
		this.politicaclienteParameterGeneral = politicaclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPoliticaCliente() {
		return isPermisoTodoPoliticaCliente;
	}

	public void setIsPermisoTodoPoliticaCliente(Boolean isPermisoTodoPoliticaCliente) {
		this.isPermisoTodoPoliticaCliente = isPermisoTodoPoliticaCliente;
	}

	public Boolean getIsPermisoNuevoPoliticaCliente() {
		return isPermisoNuevoPoliticaCliente;
	}

	public void setIsPermisoNuevoPoliticaCliente(Boolean isPermisoNuevoPoliticaCliente) {
		this.isPermisoNuevoPoliticaCliente = isPermisoNuevoPoliticaCliente;
	}

	public Boolean getIsPermisoActualizarPoliticaCliente() {
		return isPermisoActualizarPoliticaCliente;
	}

	public void setIsPermisoActualizarPoliticaCliente(Boolean isPermisoActualizarPoliticaCliente) {
		this.isPermisoActualizarPoliticaCliente = isPermisoActualizarPoliticaCliente;
	}

	public Boolean getIsPermisoEliminarPoliticaCliente() {
		return isPermisoEliminarPoliticaCliente;
	}

	public void setIsPermisoEliminarPoliticaCliente(Boolean isPermisoEliminarPoliticaCliente) {
		this.isPermisoEliminarPoliticaCliente = isPermisoEliminarPoliticaCliente;
	}

	public Boolean getIsPermisoGuardarCambiosPoliticaCliente() {
		return isPermisoGuardarCambiosPoliticaCliente;
	}

	public void setIsPermisoGuardarCambiosPoliticaCliente(Boolean isPermisoGuardarCambiosPoliticaCliente) {
		this.isPermisoGuardarCambiosPoliticaCliente = isPermisoGuardarCambiosPoliticaCliente;
	}
	
	public Boolean getIsPermisoConsultaPoliticaCliente() {
		return isPermisoConsultaPoliticaCliente;
	}

	public void setIsPermisoConsultaPoliticaCliente(Boolean isPermisoConsultaPoliticaCliente) {
		this.isPermisoConsultaPoliticaCliente = isPermisoConsultaPoliticaCliente;
	}

	public Boolean getIsPermisoBusquedaPoliticaCliente() {
		return isPermisoBusquedaPoliticaCliente;
	}

	public void setIsPermisoBusquedaPoliticaCliente(Boolean isPermisoBusquedaPoliticaCliente) {
		this.isPermisoBusquedaPoliticaCliente = isPermisoBusquedaPoliticaCliente;
	}

	public Boolean getIsPermisoReportePoliticaCliente() {
		return isPermisoReportePoliticaCliente;
	}

	public void setIsPermisoReportePoliticaCliente(Boolean isPermisoReportePoliticaCliente) {
		this.isPermisoReportePoliticaCliente = isPermisoReportePoliticaCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioPoliticaCliente() {
		return isPermisoPaginacionMedioPoliticaCliente;
	}

	public void setIsPermisoPaginacionMedioPoliticaCliente(Boolean isPermisoPaginacionMedioPoliticaCliente) {
		this.isPermisoPaginacionMedioPoliticaCliente = isPermisoPaginacionMedioPoliticaCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoPoliticaCliente() {
		return isPermisoPaginacionTodoPoliticaCliente;
	}

	public void setIsPermisoPaginacionTodoPoliticaCliente(Boolean isPermisoPaginacionTodoPoliticaCliente) {
		this.isPermisoPaginacionTodoPoliticaCliente = isPermisoPaginacionTodoPoliticaCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoPoliticaCliente() {
		return isPermisoPaginacionAltoPoliticaCliente;
	}

	public void setIsPermisoPaginacionAltoPoliticaCliente(Boolean isPermisoPaginacionAltoPoliticaCliente) {
		this.isPermisoPaginacionAltoPoliticaCliente = isPermisoPaginacionAltoPoliticaCliente;
	}
	
	public Boolean getIsPermisoCopiarPoliticaCliente() {
		return isPermisoCopiarPoliticaCliente;
	}

	public void setIsPermisoCopiarPoliticaCliente(Boolean isPermisoCopiarPoliticaCliente) {
		this.isPermisoCopiarPoliticaCliente = isPermisoCopiarPoliticaCliente;
	}
	
	public Boolean getIsPermisoVerFormPoliticaCliente() {
		return isPermisoVerFormPoliticaCliente;
	}

	public void setIsPermisoVerFormPoliticaCliente(Boolean isPermisoVerFormPoliticaCliente) {
		this.isPermisoVerFormPoliticaCliente = isPermisoVerFormPoliticaCliente;
	}
	
	public Boolean getIsPermisoDuplicarPoliticaCliente() {
		return isPermisoDuplicarPoliticaCliente;
	}

	public void setIsPermisoDuplicarPoliticaCliente(Boolean isPermisoDuplicarPoliticaCliente) {
		this.isPermisoDuplicarPoliticaCliente = isPermisoDuplicarPoliticaCliente;
	}
	
	public Boolean getIsPermisoOrdenPoliticaCliente() {
		return isPermisoOrdenPoliticaCliente;
	}

	public void setIsPermisoOrdenPoliticaCliente(Boolean isPermisoOrdenPoliticaCliente) {
		this.isPermisoOrdenPoliticaCliente = isPermisoOrdenPoliticaCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPoliticaCliente() {
		return isVisibilidadCeldaNuevoPoliticaCliente;
	}

	public void setIsVisibilidadCeldaNuevoPoliticaCliente(Boolean isVisibilidadCeldaNuevoPoliticaCliente) {
		this.isVisibilidadCeldaNuevoPoliticaCliente = isVisibilidadCeldaNuevoPoliticaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPoliticaCliente() {
		return isVisibilidadCeldaDuplicarPoliticaCliente;
	}

	public void setIsVisibilidadCeldaDuplicarPoliticaCliente(Boolean isVisibilidadCeldaDuplicarPoliticaCliente) {
		this.isVisibilidadCeldaDuplicarPoliticaCliente = isVisibilidadCeldaDuplicarPoliticaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPoliticaCliente() {
		return isVisibilidadCeldaCopiarPoliticaCliente;
	}

	public void setIsVisibilidadCeldaCopiarPoliticaCliente(Boolean isVisibilidadCeldaCopiarPoliticaCliente) {
		this.isVisibilidadCeldaCopiarPoliticaCliente = isVisibilidadCeldaCopiarPoliticaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPoliticaCliente() {
		return isVisibilidadCeldaVerFormPoliticaCliente;
	}

	public void setIsVisibilidadCeldaVerFormPoliticaCliente(Boolean isVisibilidadCeldaVerFormPoliticaCliente) {
		this.isVisibilidadCeldaVerFormPoliticaCliente = isVisibilidadCeldaVerFormPoliticaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPoliticaCliente() {
		return isVisibilidadCeldaOrdenPoliticaCliente;
	}

	public void setIsVisibilidadCeldaOrdenPoliticaCliente(Boolean isVisibilidadCeldaOrdenPoliticaCliente) {
		this.isVisibilidadCeldaOrdenPoliticaCliente = isVisibilidadCeldaOrdenPoliticaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPoliticaCliente() {
		return isVisibilidadCeldaNuevoRelacionesPoliticaCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPoliticaCliente(Boolean isVisibilidadCeldaNuevoRelacionesPoliticaCliente) {
		this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente = isVisibilidadCeldaNuevoRelacionesPoliticaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPoliticaCliente() {
		return isVisibilidadCeldaModificarPoliticaCliente;
	}

	public void setIsVisibilidadCeldaModificarPoliticaCliente(Boolean isVisibilidadCeldaModificarPoliticaCliente) {
		this.isVisibilidadCeldaModificarPoliticaCliente = isVisibilidadCeldaModificarPoliticaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPoliticaCliente() {
		return isVisibilidadCeldaActualizarPoliticaCliente;
	}

	public void setIsVisibilidadCeldaActualizarPoliticaCliente(Boolean isVisibilidadCeldaActualizarPoliticaCliente) {
		this.isVisibilidadCeldaActualizarPoliticaCliente = isVisibilidadCeldaActualizarPoliticaCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarPoliticaCliente() {
		return isVisibilidadCeldaEliminarPoliticaCliente;
	}

	public void setIsVisibilidadCeldaEliminarPoliticaCliente(Boolean isVisibilidadCeldaEliminarPoliticaCliente) {
		this.isVisibilidadCeldaEliminarPoliticaCliente = isVisibilidadCeldaEliminarPoliticaCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarPoliticaCliente() {
		return isVisibilidadCeldaCancelarPoliticaCliente;
	}

	public void setIsVisibilidadCeldaCancelarPoliticaCliente(Boolean isVisibilidadCeldaCancelarPoliticaCliente) {
		this.isVisibilidadCeldaCancelarPoliticaCliente = isVisibilidadCeldaCancelarPoliticaCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarPoliticaCliente() {
		return isVisibilidadCeldaGuardarPoliticaCliente;
	}

	public void setIsVisibilidadCeldaGuardarPoliticaCliente(Boolean isVisibilidadCeldaGuardarPoliticaCliente) {
		this.isVisibilidadCeldaGuardarPoliticaCliente = isVisibilidadCeldaGuardarPoliticaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPoliticaCliente() {
		return isVisibilidadCeldaGuardarCambiosPoliticaCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPoliticaCliente(Boolean isVisibilidadCeldaGuardarCambiosPoliticaCliente) {
		this.isVisibilidadCeldaGuardarCambiosPoliticaCliente = isVisibilidadCeldaGuardarCambiosPoliticaCliente;
	}
		
	public PoliticaClienteSessionBean getpoliticaclienteSessionBean() {
		return this.politicaclienteSessionBean;
	}
	
	public void setpoliticaclienteSessionBean(PoliticaClienteSessionBean politicaclienteSessionBean) {
		this.politicaclienteSessionBean=politicaclienteSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(PoliticaCliente politicacliente)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(politicacliente,null);
				this.setActualParaGuardarSucursalForeignKey(politicacliente,null);
				this.setActualParaGuardarClienteForeignKey(politicacliente,null);
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
	
	public void bugActualizarReferenciaActual(PoliticaCliente politicacliente,PoliticaCliente politicaclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPoliticaCliente(politicacliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		politicaclienteAux.setId(politicacliente.getId());
		politicaclienteAux.setVersionRow(politicacliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPoliticaCliente();
		
			int intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicacliente =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.politicacliente =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPoliticaCliente(this.politicacliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = politicaclienteValidator.getInvalidValues(this.politicacliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			politicaclienteLogic.setDatosCliente(datosCliente);
			politicaclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				politicaclienteAux=new  PoliticaCliente();
				
				politicaclienteAux.setIsNew(true);
				politicaclienteAux.setIsChanged(true);
				
				politicaclienteAux.setPoliticaClienteOriginal(this.politicacliente);
				
				politicaclienteAux.setId(this.politicacliente.getId());	
				politicaclienteAux.setVersionRow(this.politicacliente.getVersionRow());	
				politicaclienteAux.setid_empresa(this.politicacliente.getid_empresa());	
				politicaclienteAux.setid_sucursal(this.politicacliente.getid_sucursal());	
				politicaclienteAux.setid_cliente(this.politicacliente.getid_cliente());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.politicaclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.politicaclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(politicaclienteAux,politicaclienteLogic.getPoliticaClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(politicaclienteAux,politicaclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.politicaclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.politicaclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaclienteLogic.savePoliticaClientes();//WithConnection
						//politicaclienteLogic.getSetVersionRowPoliticaClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.politicacliente,politicaclienteAux);
					
					this.refrescarForeignKeysDescripcionesPoliticaCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.politicaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								politicaclienteLogic.savePoliticaClienteRelaciones(politicaclienteAux);//WithConnection
								//politicaclienteLogic.getSetVersionRowPoliticaClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.politicacliente,politicaclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.politicaclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.politicaclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(politicaclienteAux,politicaclienteLogic.getPoliticaClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(politicaclienteAux,politicaclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.politicacliente,politicaclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				politicaclienteAux=new  PoliticaCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.politicaclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.politicaclienteSessionBean.getEsGuardarRelacionado() && this.politicacliente.getId()>=0)) {
						
					politicaclienteAux.setIsNew(false);
				}
				
				politicaclienteAux.setIsDeleted(false);
			
				politicaclienteAux.setId(this.politicacliente.getId());	
				politicaclienteAux.setVersionRow(this.politicacliente.getVersionRow());	
				politicaclienteAux.setid_empresa(this.politicacliente.getid_empresa());	
				politicaclienteAux.setid_sucursal(this.politicacliente.getid_sucursal());	
				politicaclienteAux.setid_cliente(this.politicacliente.getid_cliente());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(politicaclienteAux,politicaclienteLogic.getPoliticaClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(politicaclienteAux,politicaclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.politicaclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.politicaclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaclienteLogic.savePoliticaClientes();//WithConnection
						//politicaclienteLogic.getSetVersionRowPoliticaClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.politicacliente,politicaclienteAux);
					
					this.refrescarForeignKeysDescripcionesPoliticaCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.politicaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								politicaclienteLogic.savePoliticaClienteRelaciones(politicaclienteAux);//WithConnection
								//politicaclienteLogic.getSetVersionRowPoliticaClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.politicacliente,politicaclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.politicaclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.politicaclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(politicaclienteAux,politicaclienteLogic.getPoliticaClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(politicaclienteAux,politicaclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.politicacliente,politicaclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				politicaclienteAux=new  PoliticaCliente();
				
				politicaclienteAux.setIsNew(false);
				politicaclienteAux.setIsChanged(false);
				
				politicaclienteAux.setIsDeleted(true);
				
				politicaclienteAux.setId(this.politicacliente.getId());	
				politicaclienteAux.setVersionRow(this.politicacliente.getVersionRow());	
				politicaclienteAux.setid_empresa(this.politicacliente.getid_empresa());	
				politicaclienteAux.setid_sucursal(this.politicacliente.getid_sucursal());	
				politicaclienteAux.setid_cliente(this.politicacliente.getid_cliente());	
				
				if(this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.politicaclienteAux.getId()>=0) {	
						this.politicaclientesEliminados.add(politicaclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(politicaclienteAux,politicaclienteLogic.getPoliticaClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(politicaclienteAux,politicaclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.politicaclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.politicaclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaclienteLogic.savePoliticaClientes();//WithConnection
						//politicaclienteLogic.getSetVersionRowPoliticaClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.politicaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								politicaclienteLogic.savePoliticaClienteRelaciones(politicaclienteAux);//WithConnection
								//politicaclienteLogic.getSetVersionRowPoliticaClientes();//WithConnection
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
							if(this.politicaclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.politicaclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(politicaclienteAux,politicaclienteLogic.getPoliticaClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(politicaclienteAux,politicaclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteLogic.getPoliticaClientes().addAll(this.politicaclientesEliminados);
					
					politicaclienteLogic.savePoliticaClientes();//WithConnection
					//politicaclienteLogic.getSetVersionRowPoliticaClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPoliticaCliente();
				
				this.politicaclientesEliminados= new ArrayList<PoliticaCliente>();		
			}
			
			if(this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Politica Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Politica Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.politicacliente=politicaclienteAux;
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
      		//this.finishProcessPoliticaCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(PoliticaCliente politicaclienteLocal) throws Exception {
		
		if(this.politicaclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PoliticaCliente politicaclienteLocal) throws Exception {	
		if(this.politicaclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				politicaclienteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				politicaclienteLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				politicaclienteLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPoliticaClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.politicacliente =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.politicacliente =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = politicaclienteValidator.getInvalidValues(this.politicacliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PoliticaCliente politicacliente,List<PoliticaCliente> politicaclientes) throws Exception {
		try	{		
			PoliticaClienteConstantesFunciones.actualizarLista(politicacliente,politicaclientes,this.politicaclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PoliticaCliente politicacliente,List<PoliticaCliente> politicaclientes) throws Exception {
		try	{			
			PoliticaClienteConstantesFunciones.actualizarSelectedLista(politicacliente,politicaclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PoliticaCliente> politicaclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				politicaclientesLocal=this.politicaclienteLogic.getPoliticaClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				politicaclientesLocal=this.politicaclientes;
			}
			//ARCHITECTURE
		
			for(PoliticaCliente politicaclienteLocal:politicaclientesLocal) {
				if(this.permiteMantenimiento(politicaclienteLocal) && politicaclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PoliticaClienteConstantesFunciones.getPoliticaClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PoliticaClienteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaCliente.jLabelid_empresaPoliticaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PoliticaClienteConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaCliente.jLabelid_sucursalPoliticaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PoliticaClienteConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaCliente.jLabelid_clientePoliticaCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaCliente.jLabelid_empresaPoliticaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaCliente.jLabelid_sucursalPoliticaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaCliente.jLabelid_clientePoliticaCliente,"");
		
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
		this.iIdNuevoPoliticaCliente--;	
		
		
		this.politicaclienteAux=new PoliticaCliente();
		
		this.politicaclienteAux.setId(this.iIdNuevoPoliticaCliente);
		this.politicaclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.politicaclienteLogic.getPoliticaClientes().add(this.politicaclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.politicaclientes.add(this.politicaclienteAux);
		}
		//ARCHITECTURE
		
		this.politicacliente=this.politicaclienteAux;
		
		if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPoliticaCliente(this.politicacliente);
			this.setVariablesObjetoActualToFormularioForeignKeyPoliticaCliente(this.politicacliente);
		}
				
		//this.setDefaultControlesPoliticaCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPoliticaCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPoliticaCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPoliticaCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPoliticaCliente(this.politicaclienteBean,this.politicacliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PoliticaClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.politicaclienteSessionBean.getConGuardarRelaciones()) {
			classes=PoliticaClienteConstantesFunciones.getClassesRelationshipsOfPoliticaCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.politicaclienteReturnGeneral=politicaclienteLogic.procesarEventosPoliticaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.politicaclienteLogic.getPoliticaClientes(),this.politicacliente,this.politicaclienteParameterGeneral,this.isEsNuevoPoliticaCliente,classes);//this.politicaclienteLogic.getPoliticaCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPoliticaCliente(this.politicaclienteReturnGeneral,this.politicaclienteBean,false);
		
		if(this.politicaclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPoliticaCliente(this.politicaclienteReturnGeneral.getPoliticaCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPoliticaCliente(this.politicaclienteReturnGeneral.getPoliticaCliente());
		}
		
		if(this.politicaclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPoliticaCliente(this.politicaclienteReturnGeneral.getPoliticaCliente(),classes);//this.politicaclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPoliticaCliente(this.politicacliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPoliticaCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPoliticaCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PoliticaClienteBeanSwingJInternalFrameAdditional.RecargarFormPoliticaCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPoliticaCliente(false);
						
			if(politicaclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPoliticaCliente();
			}
			
			this.actualizarVisualTableDatosPoliticaCliente();
			
			this.jTableDatosPoliticaCliente.setRowSelectionInterval(this.getIndiceNuevoPoliticaCliente(), this.getIndiceNuevoPoliticaCliente());
			
			this.seleccionarFilaTablaPoliticaClienteActual();
						
			this.actualizarEstadoCeldasBotonesPoliticaCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPoliticaCliente(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_empresaPoliticaCliente.setEnabled(isHabilitar && this.politicaclienteConstantesFunciones.activarid_empresaPoliticaCliente);//
		this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_sucursalPoliticaCliente.setEnabled(isHabilitar && this.politicaclienteConstantesFunciones.activarid_sucursalPoliticaCliente);
		this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_clientePoliticaCliente.setEnabled(isHabilitar && this.politicaclienteConstantesFunciones.activarid_clientePoliticaCliente);
	};
	
	public void setDefaultControlesPoliticaCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPoliticaCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.politicaclienteSessionBean.setConGuardarRelaciones(true);			
			this.politicaclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPoliticaCliente.jTabbedPaneRelacionesPoliticaCliente.setVisible(true);
			
					
		} else {
			//this.politicaclienteSessionBean.setConGuardarRelaciones(false);			
			this.politicaclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPoliticaCliente.jTabbedPaneRelacionesPoliticaCliente.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPoliticaCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PoliticaCliente politicaclienteAux:this.politicaclienteLogic.getPoliticaClientes()) {
				if(politicaclienteAux.getId().equals(this.iIdNuevoPoliticaCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PoliticaCliente politicaclienteAux:this.politicaclientes) {
				if(politicaclienteAux.getId().equals(this.iIdNuevoPoliticaCliente)) {
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
	
	public int getIndiceActualPoliticaCliente(PoliticaCliente politicacliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PoliticaCliente politicaclienteAux:this.politicaclienteLogic.getPoliticaClientes()) {
				if(politicaclienteAux.getId().equals(politicacliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PoliticaCliente politicaclienteAux:this.politicaclientes) {
				if(politicaclienteAux.getId().equals(politicacliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPoliticaCliente(PoliticaCliente politicaclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PoliticaCliente politicaclienteAux:this.politicaclienteLogic.getPoliticaClientes()) {
				if(politicaclienteAux.getPoliticaClienteOriginal().getId().equals(politicaclienteOriginal.getId())) {
					existe=true;
					politicaclienteOriginal.setId(politicaclienteAux.getId());
					politicaclienteOriginal.setVersionRow(politicaclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PoliticaCliente politicaclienteAux:this.politicaclientes) {
				if(politicaclienteAux.getPoliticaClienteOriginal().getId().equals(politicaclienteOriginal.getId())) {
					existe=true;
					politicaclienteOriginal.setId(politicaclienteAux.getId());
					politicaclienteOriginal.setVersionRow(politicaclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPoliticaCliente(Boolean esParaCancelar) throws Exception {
		politicaclientesAux=new ArrayList<PoliticaCliente>();
		politicaclienteAux=new PoliticaCliente();
		
		if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PoliticaCliente politicaclienteAux:this.politicaclienteLogic.getPoliticaClientes()) {
					if(politicaclienteAux.getId()<0) {
						politicaclientesAux.add(politicaclienteAux);
					}		
				}
				this.iIdNuevoPoliticaCliente=0L;
				this.politicaclienteLogic.getPoliticaClientes().removeAll(politicaclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PoliticaCliente politicaclienteAux:this.politicaclientes) {
					if(politicaclienteAux.getId()<0) {
						politicaclientesAux.add(politicaclienteAux);
					}		
				}
				this.iIdNuevoPoliticaCliente=0L;
				this.politicaclientes.removeAll(politicaclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPoliticaCliente 
					&& this.politicaclienteLogic.getPoliticaClientes().size()>0
					) {
					politicaclienteAux=this.politicaclienteLogic.getPoliticaClientes().get(this.politicaclienteLogic.getPoliticaClientes().size() - 1);
				
					if(politicaclienteAux.getId()<0) {
						this.politicaclienteLogic.getPoliticaClientes().remove(politicaclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPoliticaCliente && this.politicaclientes.size()>0) {
					politicaclienteAux=this.politicaclientes.get(this.politicaclientes.size() - 1);
				
					if(politicaclienteAux.getId()<0) {
						this.politicaclientes.remove(politicaclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPoliticaCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(politicacliente.getId()<0) {
				this.politicaclienteLogic.getPoliticaClientes().remove(this.politicacliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(politicacliente.getId()<0) {
				this.politicaclientes.remove(this.politicacliente);
			}
		}			
	}
	
	public void setEstadosInicialesPoliticaCliente(List<PoliticaCliente> politicaclientesAux) throws Exception {
		PoliticaClienteConstantesFunciones.setEstadosInicialesPoliticaCliente(politicaclientesAux);
	}
	
	public void setEstadosInicialesPoliticaCliente(PoliticaCliente politicaclienteAux) throws Exception {
		PoliticaClienteConstantesFunciones.setEstadosInicialesPoliticaCliente(politicaclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPoliticaClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPoliticaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPoliticaClienteActual()) {
				if(!this.isEsNuevoPoliticaCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPoliticaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPoliticaCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPoliticaClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Politica Cliente ?", "MANTENIMIENTO DE Politica Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPoliticaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PoliticaCliente politicacliente) throws Exception {
		PoliticaClienteConstantesFunciones.seleccionarAsignar(this.politicacliente,politicacliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPoliticaCliente=this.isPermisoActualizarOriginalPoliticaCliente;
			
			
			this.seleccionarAsignar(politicacliente);
			
			

			idClienteActual=politicacliente.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PoliticaClienteConstantesFunciones.quitarEspaciosPoliticaCliente(this.politicacliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPoliticaCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.politicaclienteSessionBean.setsFuncionBusquedaRapida(this.politicaclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
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
			if(this.isEsNuevoPoliticaCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPoliticaCliente(esParaCancelar);				
				this.cancelarNuevoPoliticaCliente(esParaCancelar);								
			}
			
			this.politicacliente=new PoliticaCliente();
			
			this.inicializarPoliticaCliente();
			
			this.actualizarEstadoCeldasBotonesPoliticaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPoliticaCliente() throws Exception {
		try {
			PoliticaClienteConstantesFunciones.inicializarPoliticaCliente(this.politicacliente);
			
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
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.politicaclienteLogic.getPoliticaClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePoliticaClientes(String sAccionBusqueda,List<PoliticaCliente> politicaclientesParaReportes) throws Exception {
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
					sPathReporteFinal="PoliticaCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PoliticaClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PoliticaClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PoliticaCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Politica Clientes");		
		parameters.put("busquedapor", PoliticaClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePoliticaCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PoliticaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PoliticaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePoliticaCliente=new JRBeanArrayDataSource(PoliticaClienteJInternalFrame.TraerPoliticaClienteBeans(politicaclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePoliticaCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PoliticaClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PoliticaClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PoliticaClienteBean.TraerPoliticaClienteBeans(politicaclientesParaReportes).toArray()));
							
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
				this.generarExcelReportePoliticaClientes(sAccionBusqueda,sTipoArchivoReporte,politicaclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPoliticaClientes(sAccionBusqueda,sTipoArchivoReporte,politicaclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPoliticaClienteActionPerformed(null);
					//this.generarExcelReportePoliticaClientes(sAccionBusqueda,sTipoArchivoReporte,politicaclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPoliticaClientes(sAccionBusqueda,sTipoArchivoReporte,politicaclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPoliticaClientes(sAccionBusqueda,sTipoArchivoReporte,politicaclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPoliticaClientes(sAccionBusqueda,sTipoArchivoReporte,politicaclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePoliticaClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<PoliticaCliente> politicaclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicacliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PoliticaClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPoliticaCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PoliticaCliente politicacliente : politicaclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PoliticaClienteConstantesFunciones.generarExcelReporteDataPoliticaCliente("NORMAL",row,workbook,politicacliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPoliticaCliente(String sTipo,Row row,Workbook workbook) {
		
		PoliticaClienteConstantesFunciones.generarExcelReporteHeaderPoliticaCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPoliticaClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<PoliticaCliente> politicaclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicacliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PoliticaClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PoliticaCliente politicacliente : politicaclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PoliticaClienteConstantesFunciones.getPoliticaClienteDescripcion(politicacliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaClienteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaClienteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(politicacliente.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaClienteConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaClienteConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(politicacliente.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaClienteConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaClienteConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(politicacliente.getcliente_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPoliticaClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<PoliticaCliente> politicaclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PoliticaCliente> politicaclientesRespaldo=null;
		
		classes=PoliticaClienteConstantesFunciones.getClassesRelationshipsOfPoliticaCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.politicaclienteLogic.setDatosCliente(this.datosCliente);
		this.politicaclienteLogic.setDatosDeep(this.datosDeep);
		this.politicaclienteLogic.setIsConDeep(true);
		
		politicaclientesRespaldo=this.politicaclienteLogic.getPoliticaClientes();
		
		this.politicaclienteLogic.setPoliticaClientes(politicaclientesParaReportes);	
		this.politicaclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		politicaclientesParaReportes=this.politicaclienteLogic.getPoliticaClientes();
		this.politicaclienteLogic.setPoliticaClientes(politicaclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicacliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PoliticaClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPoliticaCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PoliticaCliente politicacliente : politicaclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPoliticaCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PoliticaClienteConstantesFunciones.generarExcelReporteDataPoliticaCliente("NORMAL",row,workbook,politicacliente,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PoliticaClienteConstantesFunciones.getPoliticaClienteDescripcion(politicacliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPoliticaCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPoliticaCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPoliticaCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPoliticaCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPoliticaCliente() throws Exception {		
		this.startProcessPoliticaCliente(true);
	}
	
	public void startProcessPoliticaCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPoliticaCliente ,this.jPanelParametrosReportesPoliticaCliente, this.jScrollPanelDatosPoliticaCliente,this.jPanelPaginacionPoliticaCliente, this.jScrollPanelDatosEdicionPoliticaCliente, this.jPanelAccionesPoliticaCliente,this.jPanelAccionesFormularioPoliticaCliente,this.jmenuBarPoliticaCliente,this.jmenuBarDetallePoliticaCliente,this.jTtoolBarPoliticaCliente,this.jTtoolBarDetallePoliticaCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasPoliticaCliente=this.jTabbedPaneBusquedasPoliticaCliente; 
		
		final JPanel jPanelParametrosReportesPoliticaCliente=this.jPanelParametrosReportesPoliticaCliente;
		//final JScrollPane jScrollPanelDatosPoliticaCliente=this.jScrollPanelDatosPoliticaCliente;
		final JTable jTableDatosPoliticaCliente=this.jTableDatosPoliticaCliente;		
		final JPanel jPanelPaginacionPoliticaCliente=this.jPanelPaginacionPoliticaCliente;
		//final JScrollPane jScrollPanelDatosEdicionPoliticaCliente=this.jScrollPanelDatosEdicionPoliticaCliente;
		final JPanel jPanelAccionesPoliticaCliente=this.jPanelAccionesPoliticaCliente;
		
		JPanel jPanelCamposAuxiliarPoliticaCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPoliticaCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
			jPanelCamposAuxiliarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jPanelCamposPoliticaCliente;
			jPanelAccionesFormularioAuxiliarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jPanelAccionesFormularioPoliticaCliente;
		}
		
		final JPanel jPanelCamposPoliticaCliente=jPanelCamposAuxiliarPoliticaCliente;
		final JPanel jPanelAccionesFormularioPoliticaCliente=jPanelAccionesFormularioAuxiliarPoliticaCliente;
		
		
		final JMenuBar jmenuBarPoliticaCliente=this.jmenuBarPoliticaCliente;
		final JToolBar jTtoolBarPoliticaCliente=this.jTtoolBarPoliticaCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPoliticaCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPoliticaCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
			jmenuBarDetalleAuxiliarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jmenuBarDetallePoliticaCliente;
			jTtoolBarDetalleAuxiliarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jTtoolBarDetallePoliticaCliente;
		}
		
		final JMenuBar jmenuBarDetallePoliticaCliente=jmenuBarDetalleAuxiliarPoliticaCliente;
		final JToolBar jTtoolBarDetallePoliticaCliente=jTtoolBarDetalleAuxiliarPoliticaCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPoliticaCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPoliticaCliente;
			processRunnable.jTableDatos=jTableDatosPoliticaCliente;
			processRunnable.jPanelCampos=jPanelCamposPoliticaCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionPoliticaCliente;
			processRunnable.jPanelAcciones=jPanelAccionesPoliticaCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPoliticaCliente;
			
			
			processRunnable.jmenuBar=jmenuBarPoliticaCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePoliticaCliente;
			processRunnable.jTtoolBar=jTtoolBarPoliticaCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePoliticaCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPoliticaCliente ,jPanelParametrosReportesPoliticaCliente,jTableDatosPoliticaCliente, /*jScrollPanelDatosPoliticaCliente,*/jPanelCamposPoliticaCliente,jPanelPaginacionPoliticaCliente, /*jScrollPanelDatosEdicionPoliticaCliente,*/ jPanelAccionesPoliticaCliente,jPanelAccionesFormularioPoliticaCliente,jmenuBarPoliticaCliente,jmenuBarDetallePoliticaCliente,jTtoolBarPoliticaCliente,jTtoolBarDetallePoliticaCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPoliticaCliente ,jPanelParametrosReportesPoliticaCliente, jScrollPanelDatosPoliticaCliente,jPanelPaginacionPoliticaCliente, jScrollPanelDatosEdicionPoliticaCliente, jPanelAccionesPoliticaCliente,jPanelAccionesFormularioPoliticaCliente,jmenuBarPoliticaCliente,jmenuBarDetallePoliticaCliente,jTtoolBarPoliticaCliente,jTtoolBarDetallePoliticaCliente);
						
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
	
	public void finishProcessPoliticaCliente() {// throws Exception 
		this.finishProcessPoliticaCliente(true);
	}
	
	public void finishProcessPoliticaCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPoliticaCliente ,this.jPanelParametrosReportesPoliticaCliente, this.jScrollPanelDatosPoliticaCliente,this.jPanelPaginacionPoliticaCliente, this.jScrollPanelDatosEdicionPoliticaCliente, this.jPanelAccionesPoliticaCliente,this.jPanelAccionesFormularioPoliticaCliente,this.jmenuBarPoliticaCliente,this.jmenuBarDetallePoliticaCliente,this.jTtoolBarPoliticaCliente,this.jTtoolBarDetallePoliticaCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasPoliticaCliente=this.jTabbedPaneBusquedasPoliticaCliente; 
		
		final JPanel jPanelParametrosReportesPoliticaCliente=this.jPanelParametrosReportesPoliticaCliente;
		//final JScrollPane jScrollPanelDatosPoliticaCliente=this.jScrollPanelDatosPoliticaCliente;
		final JTable jTableDatosPoliticaCliente=this.jTableDatosPoliticaCliente;		
		final JPanel jPanelPaginacionPoliticaCliente=this.jPanelPaginacionPoliticaCliente;
		//final JScrollPane jScrollPanelDatosEdicionPoliticaCliente=this.jScrollPanelDatosEdicionPoliticaCliente;
		final JPanel jPanelAccionesPoliticaCliente=this.jPanelAccionesPoliticaCliente;
		
		JPanel jPanelCamposAuxiliarPoliticaCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPoliticaCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
			jPanelCamposAuxiliarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jPanelCamposPoliticaCliente;
			jPanelAccionesFormularioAuxiliarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jPanelAccionesFormularioPoliticaCliente;
		}
		
		final JPanel jPanelCamposPoliticaCliente=jPanelCamposAuxiliarPoliticaCliente;
		final JPanel jPanelAccionesFormularioPoliticaCliente=jPanelAccionesFormularioAuxiliarPoliticaCliente;
		
		
		final JMenuBar jmenuBarPoliticaCliente=this.jmenuBarPoliticaCliente;		
		final JToolBar jTtoolBarPoliticaCliente=this.jTtoolBarPoliticaCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarPoliticaCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPoliticaCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
			jmenuBarDetalleAuxiliarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jmenuBarDetallePoliticaCliente;
			jTtoolBarDetalleAuxiliarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jTtoolBarDetallePoliticaCliente;		
		}
		
		final JMenuBar jmenuBarDetallePoliticaCliente=jmenuBarDetalleAuxiliarPoliticaCliente;
		final JToolBar jTtoolBarDetallePoliticaCliente=jTtoolBarDetalleAuxiliarPoliticaCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPoliticaCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPoliticaCliente;
			processRunnable.jTableDatos=jTableDatosPoliticaCliente;
			processRunnable.jPanelCampos=jPanelCamposPoliticaCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionPoliticaCliente;
			processRunnable.jPanelAcciones=jPanelAccionesPoliticaCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPoliticaCliente;
			
			
			processRunnable.jmenuBar=jmenuBarPoliticaCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePoliticaCliente;
			processRunnable.jTtoolBar=jTtoolBarPoliticaCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePoliticaCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPoliticaCliente ,jPanelParametrosReportesPoliticaCliente, jTableDatosPoliticaCliente,/*jScrollPanelDatosPoliticaCliente,*/jPanelCamposPoliticaCliente,jPanelPaginacionPoliticaCliente, /*jScrollPanelDatosEdicionPoliticaCliente,*/ jPanelAccionesPoliticaCliente,jPanelAccionesFormularioPoliticaCliente,jmenuBarPoliticaCliente,jmenuBarDetallePoliticaCliente,jTtoolBarPoliticaCliente,jTtoolBarDetallePoliticaCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPoliticaCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPoliticaCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPoliticaCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPoliticaCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPoliticaCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePoliticaCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPoliticaCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPoliticaCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePoliticaCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.politicaclienteConstantesFunciones.getsFinalQueryPoliticaCliente();
		String  finalQueryPaginacionTodos=this.politicaclienteConstantesFunciones.getsFinalQueryPoliticaCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PoliticaClienteConstantesFunciones.getArrayColumnasGlobalesNoPoliticaCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PoliticaClienteConstantesFunciones.getArrayColumnasGlobalesPoliticaCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PoliticaClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.politicaclientesEliminados= new ArrayList<PoliticaCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPoliticaCliente();
		
				///*PoliticaClienteSessionBean*/this.politicaclienteSessionBean=new PoliticaClienteSessionBean();
			
			if(this.politicaclienteSessionBean==null) {
				this.politicaclienteSessionBean=new PoliticaClienteSessionBean();
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
					this.iNumeroPaginacion=PoliticaClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PoliticaClienteConstantesFunciones.getClassesForeignKeysOfPoliticaCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/politicacliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			politicaclientesAux= new ArrayList<PoliticaCliente>();
			
				
			politicaclienteLogic.setDatosCliente(this.datosCliente);
			politicaclienteLogic.setDatosDeep(this.datosDeep);
			politicaclienteLogic.setIsConDeep(true);
			
			
			politicaclienteLogic.getPoliticaClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					politicaclienteLogic.getTodosPoliticaClientes(finalQueryGlobal,pagination);
					
					//politicaclienteLogic.getTodosPoliticaClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(politicaclienteLogic.getPoliticaClientes()==null|| politicaclienteLogic.getPoliticaClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							politicaclientesAux= new ArrayList<PoliticaCliente>();
							politicaclientesAux.addAll(politicaclienteLogic.getPoliticaClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaclientesAux= new ArrayList<PoliticaCliente>();
							politicaclientesAux.addAll(politicaclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							politicaclienteLogic.getTodosPoliticaClientes(finalQueryGlobal+"",this.pagination);												
							
							//politicaclienteLogic.getTodosPoliticaClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePoliticaClientes("Todos",politicaclienteLogic.getPoliticaClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							politicaclienteLogic.setPoliticaClientes(new ArrayList<PoliticaCliente>());					
							politicaclienteLogic.getPoliticaClientes().addAll(politicaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaclientes=new ArrayList<PoliticaCliente>();
							politicaclientes.addAll(politicaclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPoliticaCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPoliticaCliente=this.idActual;
				
				} else if(this.idPoliticaClienteActual!=null && this.idPoliticaClienteActual!=0L) {
					idPoliticaCliente=idPoliticaClienteActual;
				}
				
					
				this.sDetalleReporte=PoliticaClienteConstantesFunciones.getDetalleIndicePorId(idPoliticaCliente);
				
				this.politicaclientes=new ArrayList<PoliticaCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					politicaclienteLogic.getEntity(idPoliticaCliente);
					
					//politicaclienteLogic.getEntityWithConnection(idPoliticaCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					politicaclienteLogic.setPoliticaClientes(new ArrayList<PoliticaCliente>());
					politicaclienteLogic.getPoliticaClientes().add(politicaclienteLogic.getPoliticaCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.politicaclientes=new ArrayList<PoliticaCliente>();
					this.politicaclientes.add(politicacliente);
				}
				
				if(politicaclienteLogic.getPoliticaCliente()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=PoliticaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					politicaclienteLogic.getPoliticaClientesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=politicaclienteLogic.getPoliticaClientes()==null||politicaclienteLogic.getPoliticaClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=politicaclientes==null|| politicaclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaclientesAux=new ArrayList<PoliticaCliente>();
						politicaclientesAux.addAll(politicaclienteLogic.getPoliticaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaclientesAux=new ArrayList<PoliticaCliente>();
							politicaclientesAux.addAll(politicaclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							politicaclienteLogic.getPoliticaClientesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePoliticaClientes("FK_IdCliente",politicaclienteLogic.getPoliticaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePoliticaClientes("FK_IdCliente",politicaclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaclienteLogic.setPoliticaClientes(new ArrayList<PoliticaCliente>());
						politicaclienteLogic.getPoliticaClientes().addAll(politicaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaclientes=new ArrayList<PoliticaCliente>();
							politicaclientes.addAll(politicaclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PoliticaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					politicaclienteLogic.getPoliticaClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=politicaclienteLogic.getPoliticaClientes()==null||politicaclienteLogic.getPoliticaClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=politicaclientes==null|| politicaclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaclientesAux=new ArrayList<PoliticaCliente>();
						politicaclientesAux.addAll(politicaclienteLogic.getPoliticaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaclientesAux=new ArrayList<PoliticaCliente>();
							politicaclientesAux.addAll(politicaclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							politicaclienteLogic.getPoliticaClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePoliticaClientes("FK_IdEmpresa",politicaclienteLogic.getPoliticaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePoliticaClientes("FK_IdEmpresa",politicaclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaclienteLogic.setPoliticaClientes(new ArrayList<PoliticaCliente>());
						politicaclienteLogic.getPoliticaClientes().addAll(politicaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaclientes=new ArrayList<PoliticaCliente>();
							politicaclientes.addAll(politicaclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=PoliticaClienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					politicaclienteLogic.getPoliticaClientesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaClienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaClienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=politicaclienteLogic.getPoliticaClientes()==null||politicaclienteLogic.getPoliticaClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=politicaclientes==null|| politicaclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaclientesAux=new ArrayList<PoliticaCliente>();
						politicaclientesAux.addAll(politicaclienteLogic.getPoliticaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaclientesAux=new ArrayList<PoliticaCliente>();
							politicaclientesAux.addAll(politicaclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							politicaclienteLogic.getPoliticaClientesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaClienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaClienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePoliticaClientes("FK_IdSucursal",politicaclienteLogic.getPoliticaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePoliticaClientes("FK_IdSucursal",politicaclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaclienteLogic.setPoliticaClientes(new ArrayList<PoliticaCliente>());
						politicaclienteLogic.getPoliticaClientes().addAll(politicaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaclientes=new ArrayList<PoliticaCliente>();
							politicaclientes.addAll(politicaclientesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPoliticaCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPoliticaCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=politicaclienteLogic.getPoliticaClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=politicaclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=politicaclienteLogic.getPoliticaClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=politicaclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PoliticaCliente politicacliente) {
		Boolean permite=true;
		
		if(this.politicacliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PoliticaClienteConstantesFunciones.getOrderByListaPoliticaCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PoliticaClienteConstantesFunciones.getOrderByListaPoliticaCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PoliticaCliente politicacliente:politicaclienteLogic.getPoliticaClientes()) {
				if(politicacliente.getsType().equals(Constantes2.S_TOTALES)) {
					politicaclienteTotales=politicacliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PoliticaCliente politicacliente:this.politicaclientes) {
				if(politicacliente.getsType().equals(Constantes2.S_TOTALES)) {
					politicaclienteTotales=politicacliente;
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
			this.politicaclienteAux=new PoliticaCliente();
			this.politicaclienteAux.setsType(Constantes2.S_TOTALES);
			this.politicaclienteAux.setIsNew(false);
			this.politicaclienteAux.setIsChanged(false);
			this.politicaclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PoliticaClienteConstantesFunciones.TotalizarValoresFilaPoliticaCliente(this.politicaclienteLogic.getPoliticaClientes(),this.politicaclienteAux);
				
				this.politicaclienteLogic.getPoliticaClientes().add(this.politicaclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PoliticaClienteConstantesFunciones.TotalizarValoresFilaPoliticaCliente(this.politicaclientes,this.politicaclienteAux);
				
				this.politicaclientes.add(this.politicaclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		politicaclienteTotales=new PoliticaCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.politicaclienteLogic.getPoliticaClientes().remove(politicaclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.politicaclientes.remove(politicaclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		politicaclienteTotales=new PoliticaCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PoliticaCliente politicacliente:politicaclienteLogic.getPoliticaClientes()) {
				if(politicacliente.getsType().equals(Constantes2.S_TOTALES)) {
					politicaclienteTotales=politicacliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PoliticaClienteConstantesFunciones.TotalizarValoresFilaPoliticaCliente(this.politicaclienteLogic.getPoliticaClientes(),politicaclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PoliticaCliente politicacliente:this.politicaclientes) {
				if(politicacliente.getsType().equals(Constantes2.S_TOTALES)) {
					politicaclienteTotales=politicacliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PoliticaClienteConstantesFunciones.TotalizarValoresFilaPoliticaCliente(this.politicaclientes,politicaclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPoliticaClientesFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPoliticaClientesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPoliticaClientesFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPoliticaClientesFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					politicaclienteLogic.getPoliticaClientesFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPoliticaClientesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					politicaclienteLogic.getPoliticaClientesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPoliticaClientesFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					politicaclienteLogic.getPoliticaClientesFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosPoliticaCliente() {
		this.isPermisoTodoPoliticaCliente=false;
		this.isPermisoNuevoPoliticaCliente=false;
		this.isPermisoActualizarPoliticaCliente=false;
		this.isPermisoActualizarOriginalPoliticaCliente=false;
		this.isPermisoEliminarPoliticaCliente=false;
		this.isPermisoGuardarCambiosPoliticaCliente=false;
		this.isPermisoConsultaPoliticaCliente=false;
		this.isPermisoBusquedaPoliticaCliente=false;
		this.isPermisoReportePoliticaCliente=false;		
		this.isPermisoOrdenPoliticaCliente=false;		
		this.isPermisoPaginacionMedioPoliticaCliente=false;		
		this.isPermisoPaginacionAltoPoliticaCliente=false;
		this.isPermisoPaginacionTodoPoliticaCliente=false;
		this.isPermisoCopiarPoliticaCliente=false;		
		this.isPermisoVerFormPoliticaCliente=false;		
		this.isPermisoDuplicarPoliticaCliente=false;		
		this.isPermisoOrdenPoliticaCliente=false;		
	}
	
	public void setPermisosUsuarioPoliticaCliente(Boolean isPermiso) {
		this.isPermisoTodoPoliticaCliente=isPermiso;
		this.isPermisoNuevoPoliticaCliente=isPermiso;
		this.isPermisoActualizarPoliticaCliente=isPermiso;
		this.isPermisoActualizarOriginalPoliticaCliente=isPermiso;
		this.isPermisoEliminarPoliticaCliente=isPermiso;
		this.isPermisoGuardarCambiosPoliticaCliente=isPermiso;
		this.isPermisoConsultaPoliticaCliente=isPermiso;
		this.isPermisoBusquedaPoliticaCliente=isPermiso;
		this.isPermisoReportePoliticaCliente=isPermiso;
		this.isPermisoOrdenPoliticaCliente=isPermiso;		
		this.isPermisoPaginacionMedioPoliticaCliente=isPermiso;		
		this.isPermisoPaginacionAltoPoliticaCliente=isPermiso;		
		this.isPermisoPaginacionTodoPoliticaCliente=isPermiso;		
		this.isPermisoCopiarPoliticaCliente=isPermiso;		
		this.isPermisoVerFormPoliticaCliente=isPermiso;		
		this.isPermisoDuplicarPoliticaCliente=isPermiso;
		this.isPermisoOrdenPoliticaCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPoliticaCliente(Boolean isPermiso) {
		//this.isPermisoTodoPoliticaCliente=isPermiso;
		this.isPermisoNuevoPoliticaCliente=isPermiso;
		this.isPermisoActualizarPoliticaCliente=isPermiso;
		this.isPermisoActualizarOriginalPoliticaCliente=isPermiso;
		this.isPermisoEliminarPoliticaCliente=isPermiso;
		this.isPermisoGuardarCambiosPoliticaCliente=isPermiso;
		//this.isPermisoConsultaPoliticaCliente=isPermiso;
		//this.isPermisoBusquedaPoliticaCliente=isPermiso;
		//this.isPermisoReportePoliticaCliente=isPermiso;
		//this.isPermisoOrdenPoliticaCliente=isPermiso;		
		//this.isPermisoPaginacionMedioPoliticaCliente=isPermiso;		
		//this.isPermisoPaginacionAltoPoliticaCliente=isPermiso;		
		//this.isPermisoPaginacionTodoPoliticaCliente=isPermiso;		
		//this.isPermisoCopiarPoliticaCliente=isPermiso;		
		//this.isPermisoDuplicarPoliticaCliente=isPermiso;
		//this.isPermisoOrdenPoliticaCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPoliticaClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PoliticaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPoliticaCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPoliticaClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPoliticaClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPoliticaClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPoliticaClienteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPoliticaCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PoliticaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PoliticaClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPoliticaCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPoliticaCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPoliticaCliente=this.isPermisoActualizarPoliticaCliente;
			this.isPermisoEliminarPoliticaCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPoliticaCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPoliticaCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPoliticaCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPoliticaCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePoliticaCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPoliticaCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPoliticaCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPoliticaCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPoliticaCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPoliticaCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPoliticaCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPoliticaCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPoliticaCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPoliticaCliente.setToolTipText(this.jTableDatosPoliticaCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPoliticaCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPoliticaCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PoliticaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PoliticaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPoliticaCliente() throws Exception {
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
	public void inicializarCombosForeignKeyPoliticaClienteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPoliticaClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PoliticaClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPoliticaClienteListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPoliticaClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PoliticaClienteParameterReturnGeneral politicaclienteReturnGeneral=new PoliticaClienteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.politicaclienteConstantesFunciones.cargarid_empresaPoliticaCliente)
					 || (this.esRecargarFks && this.politicaclienteConstantesFunciones.cargarid_empresaPoliticaCliente)) {

					if(!this.politicaclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+politicaclienteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.politicaclienteConstantesFunciones.cargarid_sucursalPoliticaCliente)
					 || (this.esRecargarFks && this.politicaclienteConstantesFunciones.cargarid_sucursalPoliticaCliente)) {

					if(!this.politicaclienteSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+politicaclienteSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.politicaclienteConstantesFunciones.cargarid_clientePoliticaCliente)
					 || (this.esRecargarFks && this.politicaclienteConstantesFunciones.cargarid_clientePoliticaCliente)) {

					if(!this.politicaclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+politicaclienteSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				politicaclienteReturnGeneral=politicaclienteLogic.cargarCombosLoteForeignKeyPoliticaCliente(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalCliente);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=politicaclienteReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=politicaclienteReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=politicaclienteReturnGeneral.getclientesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPoliticaCliente()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.politicaclienteSessionBean==null) {
				this.politicaclienteSessionBean=new PoliticaClienteSessionBean();
			}

			if(!this.politicaclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.politicaclienteSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.politicaclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPoliticaCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPoliticaCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPoliticaCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPoliticaCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPoliticaCliente(PoliticaCliente politicacliente)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(politicacliente.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPoliticaCliente(PoliticaCliente politicacliente,String sTipoEvento)throws Exception {	
		try {
			
			

				if(politicacliente.getCliente()!=null && !sTipoEvento.equals("id_clientePoliticaCliente")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(politicacliente.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPoliticaCliente()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.politicaclienteConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPoliticaCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPoliticaCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPoliticaCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPoliticaCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPoliticaCliente()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPoliticaCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPoliticaCliente()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_empresaPoliticaCliente!=null && this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_empresaPoliticaCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_empresaPoliticaCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_sucursalPoliticaCliente!=null && this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_sucursalPoliticaCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_sucursalPoliticaCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_clientePoliticaCliente!=null && this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_clientePoliticaCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_clientePoliticaCliente.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public PoliticaClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PoliticaClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PoliticaClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.politicaclienteSessionBean=new PoliticaClienteSessionBean(); 
		this.politicaclienteConstantesFunciones=new PoliticaClienteConstantesFunciones(); 
		this.politicaclienteBean=new PoliticaCliente();//(this.politicaclienteConstantesFunciones); 		
		this.politicaclienteReturnGeneral=new PoliticaClienteParameterReturnGeneral(); 
		
		this.politicaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.politicaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PoliticaClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PoliticaClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PoliticaClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPoliticaCliente(true);
			
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
			
			this.politicaclienteConstantesFunciones=new PoliticaClienteConstantesFunciones(); 
			this.politicaclienteBean=new PoliticaCliente();//this.politicaclienteConstantesFunciones); 			
			this.politicaclienteReturnGeneral=new PoliticaClienteParameterReturnGeneral(); 
		
			PoliticaClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Politica Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.politicacliente=new PoliticaCliente();
			this.politicaclientes = new ArrayList<PoliticaCliente>();
			this.politicaclientesAux = new ArrayList<PoliticaCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic=new PoliticaClienteLogic();
				this.politicaclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.politicaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.politicaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPoliticaCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPoliticaCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPoliticaCliente);	
					}
					
					if(this.jInternalFrameImportacionPoliticaCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPoliticaCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPoliticaCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPoliticaCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPoliticaCliente);
				this.jInternalFrameDetalleFormPoliticaCliente.setVisible(false);
				this.jInternalFrameDetalleFormPoliticaCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPoliticaCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPoliticaCliente);
					this.jInternalFrameReporteDinamicoPoliticaCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoPoliticaCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPoliticaCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPoliticaCliente);
					this.jInternalFrameImportacionPoliticaCliente.setVisible(false);
					this.jInternalFrameImportacionPoliticaCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPoliticaCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPoliticaCliente);
					this.jInternalFrameOrderByPoliticaCliente.setVisible(false);
					this.jInternalFrameOrderByPoliticaCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPoliticaClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PoliticaClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.politicaclienteReturnGeneral=new PoliticaClienteParameterReturnGeneral();
			
			this.politicaclienteParameterGeneral=new PoliticaClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.politicaclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PoliticaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PoliticaClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.politicaclienteSessionBean.getEsGuardarRelacionado(),this.politicaclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PoliticaClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.politicaclienteSessionBean.getEsGuardarRelacionado(),this.politicaclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPoliticaCliente=false;
			this.isVisibilidadCeldaDuplicarPoliticaCliente=true;
			this.isVisibilidadCeldaCopiarPoliticaCliente=true;
			this.isVisibilidadCeldaVerFormPoliticaCliente=true;
			this.isVisibilidadCeldaOrdenPoliticaCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente=false;
			this.isVisibilidadCeldaModificarPoliticaCliente=false;
			this.isVisibilidadCeldaActualizarPoliticaCliente=false;
			this.isVisibilidadCeldaEliminarPoliticaCliente=false;
			this.isVisibilidadCeldaCancelarPoliticaCliente=false;
			this.isVisibilidadCeldaGuardarPoliticaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaCliente=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPoliticaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPoliticaCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPoliticaCliente(false);
			
			this.setPermisosUsuarioPoliticaCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.politicaclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.politicaclienteSessionBean.getEsGuardarRelacionado() && this.politicaclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPoliticaClienteClasesRelacionadas();
			}
			
			if(this.politicaclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPoliticaClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPoliticaCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPoliticaCliente();
			}
			
			if(!this.isPermisoBusquedaPoliticaCliente) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPoliticaCliente.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPoliticaCliente,this.isPermisoPaginacionMedioPoliticaCliente,this.isPermisoPaginacionTodoPoliticaCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PoliticaClienteConstantesFunciones.getTiposSeleccionarPoliticaCliente());
				
				this.tiposColumnasSelect=PoliticaClienteConstantesFunciones.getTiposSeleccionarPoliticaCliente(true);
				
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
			//if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPoliticaCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPoliticaCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPoliticaCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPoliticaCliente() ;
			
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
			this.clienteLogic=new ClienteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				politicaclienteImplementable= (PoliticaClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PoliticaClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				politicaclienteImplementableHome= (PoliticaClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PoliticaClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.politicaclientes= new ArrayList<PoliticaCliente>();
			this.politicaclientesEliminados= new ArrayList<PoliticaCliente>();
						
			this.isEsNuevoPoliticaCliente=false;
			this.esParaAccionDesdeFormularioPoliticaCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPoliticaCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPoliticaCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PoliticaClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PoliticaClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPoliticaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPoliticaCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPoliticaCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPoliticaCliente();
			}
			
			PoliticaClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPoliticaCliente.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPoliticaCliente.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPoliticaCliente.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPoliticaCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PoliticaCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPoliticaCliente() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPoliticaCliente")) {
				iIndex=this.jInternalFrameDetalleFormPoliticaCliente.jTabbedPaneRelacionesPoliticaCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPoliticaCliente.jTabbedPaneRelacionesPoliticaCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPoliticaCliente();	
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
	
	public void cargarCombosForeignKeyPoliticaCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPoliticaCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPoliticaCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPoliticaClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPoliticaCliente();
		
		this.cargarCombosFrameForeignKeyPoliticaCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPoliticaCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPoliticaCliente();
		}
	}
	
	

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPoliticaClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.politicaclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPoliticaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
			
			
			if(jTableDatosPoliticaCliente.getRowCount()>=1) {
				jTableDatosPoliticaCliente.removeRowSelectionInterval(0, jTableDatosPoliticaCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoPoliticaCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPoliticaCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPoliticaCliente(true);			
			//this.politicacliente=new PoliticaCliente();
			//this.politicacliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPoliticaCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPoliticaCliente() ;
			
			if(PoliticaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePoliticaCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.politicacliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.politicacliente);				
			
			PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
			
			if(this.politicaclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PoliticaCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPoliticaClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PoliticaCliente> politicaclientesSeleccionados=new ArrayList<PoliticaCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPoliticaCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPoliticaCliente.getSelectedRows().length;			
			}
			
			politicaclientesSeleccionados=this.getPoliticaClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPoliticaCliente--;			
				//PoliticaCliente politicaclienteAux= new PoliticaCliente();			
				//politicaclienteAux.setId(this.iIdNuevoPoliticaCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PoliticaCliente politicaclienteOrigen=new PoliticaCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PoliticaCliente politicaclienteOrigen : politicaclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							politicaclienteOrigen =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaclienteOrigen =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPoliticaCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.politicacliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPoliticaCliente(politicaclienteOrigen,this.politicacliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.politicaclienteLogic.getPoliticaClientes().add(this.politicaclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.politicaclientes.add(this.politicaclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPoliticaCliente(false);
				
				this.jTableDatosPoliticaCliente.setRowSelectionInterval(this.getIndiceNuevoPoliticaCliente(), this.getIndiceNuevoPoliticaCliente());
				
				int iLastRow =  this.jTableDatosPoliticaCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPoliticaCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPoliticaCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPoliticaCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PoliticaCliente> politicaclientesSeleccionados=new ArrayList<PoliticaCliente>();									
		
			PoliticaCliente politicaclienteOrigen=new PoliticaCliente();
			PoliticaCliente politicaclienteDestino=new PoliticaCliente();
				
			politicaclientesSeleccionados=this.getPoliticaClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPoliticaCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || politicaclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPoliticaCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaclienteOrigen =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						politicaclienteOrigen =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaclienteDestino =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						politicaclienteDestino =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				politicaclienteOrigen =politicaclientesSeleccionados.get(0);
				politicaclienteDestino =politicaclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPoliticaCliente(politicaclienteOrigen,politicaclienteDestino,true,false);
				
				politicaclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(politicaclienteDestino,politicaclienteLogic.getPoliticaClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(politicaclienteDestino,politicaclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPoliticaCliente(false);
				
				//this.jTableDatosPoliticaCliente.setRowSelectionInterval(this.getIndiceNuevoPoliticaCliente(), this.getIndiceNuevoPoliticaCliente());
				
				int iLastRow =  this.jTableDatosPoliticaCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPoliticaCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPoliticaCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPoliticaCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPoliticaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPoliticaCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPoliticaCliente.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPoliticaCliente.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPoliticaCliente.setVisible(!isVisible);
			this.jPanelPaginacionPoliticaCliente.setVisible(!isVisible);
			this.jPanelAccionesPoliticaCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePoliticaCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPoliticaCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPoliticaCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPoliticaCliente();
			
			this.abrirFrameOrderByPoliticaCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPoliticaCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePoliticaCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPoliticaCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPoliticaCliente.isMaximum()) {
					this.jInternalFrameDetalleFormPoliticaCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPoliticaCliente.setSize(this.jInternalFrameDetalleFormPoliticaCliente.iWidthFormulario,this.jInternalFrameDetalleFormPoliticaCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPoliticaCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPoliticaCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPoliticaCliente.isMaximum()) {
						this.jInternalFrameDetalleFormPoliticaCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPoliticaCliente.jContentPaneDetallePoliticaCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPoliticaCliente.jTabbedPaneRelacionesPoliticaCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPoliticaCliente.jContentPaneDetallePoliticaCliente.getWidth(),PoliticaClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPoliticaCliente.jTabbedPaneRelacionesPoliticaCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPoliticaCliente.jContentPaneDetallePoliticaCliente.getWidth(),PoliticaClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPoliticaCliente.jTabbedPaneRelacionesPoliticaCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPoliticaCliente.jContentPaneDetallePoliticaCliente.getWidth(),PoliticaClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPoliticaCliente.setVisible(true);
	        this.jInternalFrameDetalleFormPoliticaCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPoliticaCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPoliticaCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPoliticaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPoliticaCliente,false,this);
				} else {
					this.jInternalFrameOrderByPoliticaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPoliticaCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPoliticaCliente);
				this.jInternalFrameOrderByPoliticaCliente.setVisible(false);
				this.jInternalFrameOrderByPoliticaCliente.setSelected(false);
				
				this.jInternalFrameOrderByPoliticaCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPoliticaCliente"));
				
				this.inicializarActualizarBindingTablaOrderByPoliticaCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPoliticaCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPoliticaCliente==null) {
				
				this.jInternalFrameImportacionPoliticaCliente=new ImportacionJInternalFrame(PoliticaClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPoliticaCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPoliticaCliente);
				this.jInternalFrameImportacionPoliticaCliente.setVisible(false);
				this.jInternalFrameImportacionPoliticaCliente.setSelected(false);


				this.jInternalFrameImportacionPoliticaCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPoliticaCliente"));
				this.jInternalFrameImportacionPoliticaCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPoliticaCliente"));
				this.jInternalFrameImportacionPoliticaCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPoliticaCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPoliticaCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPoliticaCliente==null) {
				this.jInternalFrameReporteDinamicoPoliticaCliente=new ReporteDinamicoJInternalFrame(PoliticaClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPoliticaCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPoliticaCliente);
				this.jInternalFrameReporteDinamicoPoliticaCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoPoliticaCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPoliticaCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPoliticaCliente"));
				this.jInternalFrameReporteDinamicoPoliticaCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPoliticaCliente"));
				this.jInternalFrameReporteDinamicoPoliticaCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPoliticaCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPoliticaCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePoliticaCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPoliticaCliente);
			
	       	this.jInternalFrameDetalleFormPoliticaCliente.setVisible(false);
	        this.jInternalFrameDetalleFormPoliticaCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormPoliticaCliente.dispose();
			//this.jInternalFrameDetalleFormPoliticaCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPoliticaCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPoliticaCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoPoliticaCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPoliticaCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPoliticaCliente.setVisible(true);
	        this.jInternalFrameImportacionPoliticaCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPoliticaCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPoliticaCliente.setVisible(true);
	        this.jInternalFrameOrderByPoliticaCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPoliticaCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPoliticaCliente.setVisible(false);
	        this.jInternalFrameOrderByPoliticaCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPoliticaCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPoliticaCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoPoliticaCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPoliticaCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPoliticaCliente.setVisible(false);
	        this.jInternalFrameImportacionPoliticaCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPoliticaCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPoliticaCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPoliticaCliente(true);
			//this.isEsNuevoPoliticaCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicacliente =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.politicacliente =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPoliticaCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPoliticaCliente(false) ;
			
			if(politicaclienteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PoliticaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePoliticaCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPoliticaCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPoliticaClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicacliente =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicacliente =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPoliticaCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPoliticaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPoliticaCliente(true);
			//this.isEsNuevoPoliticaCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicacliente =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.politicacliente =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.politicacliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPoliticaCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPoliticaCliente(false) ;
			
			if(PoliticaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePoliticaCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPoliticaCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.politicaclienteConstantesFunciones.cargarid_clientePoliticaCliente) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPoliticaCliente(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosPoliticaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaCliente,PoliticaClienteConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPoliticaCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPoliticaCliente(false);
			
			//if(!this.isEsNuevoPoliticaCliente) {								
				int intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicacliente =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.politicacliente =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPoliticaCliente(this.politicacliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);
				
			}
			
			if(this.permiteMantenimiento(this.politicacliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPoliticaCliente=true;
					this.inicializarActualizarBindingTablaPoliticaCliente(false);
					this.isEsNuevoPoliticaCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPoliticaCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPoliticaCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPoliticaCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPoliticaCliente(false);
				
				this.habilitarDeshabilitarControlesPoliticaCliente(false);
			
												
				
				if(PoliticaClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePoliticaCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPoliticaClienteActionPerformed(evt,politicaclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPoliticaCliente(this.politicacliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPoliticaCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,politicaclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.politicacliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PoliticaCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicacliente =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				this.politicacliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.politicacliente =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				this.politicacliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.politicacliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PoliticaClienteModel) this.jTableDatosPoliticaCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPoliticaCliente=true;
				this.inicializarActualizarBindingTablaPoliticaCliente(false);
				this.isEsNuevoPoliticaCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPoliticaCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPoliticaCliente(false);
				
				this.habilitarDeshabilitarControlesPoliticaCliente(false);
				
				
				
				if(PoliticaClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePoliticaCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPoliticaCliente.getRowCount()>=1) {
				jTableDatosPoliticaCliente.removeRowSelectionInterval(0, jTableDatosPoliticaCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPoliticaCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPoliticaCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPoliticaCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPoliticaCliente(false) ;
			
			this.isEsNuevoPoliticaCliente=false;
			
			if(PoliticaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePoliticaCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPoliticaCliente(false);
				
				//SI ES MANUAL
				if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPoliticaCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPoliticaCliente--;			
			//PoliticaCliente politicaclienteAux= new PoliticaCliente();			
			//politicaclienteAux.setId(this.iIdNuevoPoliticaCliente);
			
			if(this.jInternalFrameDetalleFormPoliticaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPoliticaCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);
			
			this.politicacliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.politicaclienteLogic.getPoliticaClientes().add(this.politicaclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.politicaclientes.add(this.politicaclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPoliticaCliente(false);
			
			this.jTableDatosPoliticaCliente.setRowSelectionInterval(this.getIndiceNuevoPoliticaCliente(), this.getIndiceNuevoPoliticaCliente());
			
			int iLastRow =  this.jTableDatosPoliticaCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPoliticaCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPoliticaCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPoliticaCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPoliticaCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPoliticaCliente(false);
			
			//SI ES MANUAL
			if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPoliticaCliente();
			}
			
			//this.abrirFrameTreePoliticaCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Politica ClienteS ?", "MANTENIMIENTO DE Politica Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPoliticaCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPoliticaCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.politicaclienteReturnGeneral=politicaclienteLogic.procesarImportacionPoliticaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.politicaclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPoliticaClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPoliticaCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPoliticaCliente.setFileImportacion(this.jInternalFrameImportacionPoliticaCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPoliticaCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPoliticaCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPoliticaCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPoliticaCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PoliticaCliente> politicaclientesSeleccionados=new ArrayList<PoliticaCliente>();		

		politicaclientesSeleccionados=this.getPoliticaClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPoliticaCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPoliticaCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PoliticaClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PoliticaClienteBaseDesign.jrxml";
			
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
			
			this.generarReportePoliticaClientes("Todos",politicaclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPoliticaCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPoliticaCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PoliticaClienteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PoliticaClienteConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PoliticaClienteConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPoliticaCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPoliticaCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPoliticaCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PoliticaClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PoliticaClienteConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case PoliticaClienteConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPoliticaCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PoliticaClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PoliticaClienteConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case PoliticaClienteConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPoliticaCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPoliticaCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PoliticaClienteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PoliticaClienteConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case PoliticaClienteConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
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
	
	public void jButtonGenerarExcelReporteDinamicoPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PoliticaCliente> politicaclientesSeleccionados=new ArrayList<PoliticaCliente>();		
		
		politicaclientesSeleccionados=this.getPoliticaClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicacliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PoliticaClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPoliticaCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPoliticaCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PoliticaClienteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaClienteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PoliticaCliente politicacliente:politicaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicacliente.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PoliticaClienteConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaClienteConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(PoliticaCliente politicacliente:politicaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicacliente.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PoliticaClienteConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaClienteConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(PoliticaCliente politicacliente:politicaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicacliente.getcliente_descripcion());
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
			//	this.getFilaCabeceraExportarExcelPoliticaCliente(row);				
			//	iRow++;
			//}				
			
			//for(PoliticaCliente politicaclienteAux:politicaclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPoliticaCliente(politicaclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.politicaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPoliticaCliente(false);
			
			//SI ES MANUAL
			if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPoliticaCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPoliticaCliente(false);
			
			//SI ES MANUAL
			if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPoliticaCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPoliticaCliente(false);
			
			//SI ES MANUAL
			if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPoliticaCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPoliticaCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPoliticaCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPoliticaCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPoliticaCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPoliticaCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPoliticaCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosPoliticaCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosPoliticaCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPoliticaCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPoliticaCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPoliticaCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPoliticaCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPoliticaCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPoliticaCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPoliticaCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPoliticaCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PoliticaClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPoliticaCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPoliticaCliente();
		
		this.inicializarActualizarBindingBotonesManualPoliticaCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPoliticaCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPoliticaCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPoliticaCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPoliticaCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPoliticaCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPoliticaCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePoliticaCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPoliticaCliente.jCheckBoxPostAccionNuevoPoliticaCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPoliticaCliente.jCheckBoxPostAccionSinCerrarPoliticaCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPoliticaCliente.jCheckBoxPostAccionSinMensajePoliticaCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPoliticaCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPoliticaCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePoliticaCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
				this.jInternalFrameDetalleFormPoliticaCliente.jCheckBoxPostAccionNuevoPoliticaCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPoliticaCliente.jCheckBoxPostAccionSinCerrarPoliticaCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPoliticaCliente.jCheckBoxPostAccionSinMensajePoliticaCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPoliticaCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPoliticaCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxTiposAccionesFormularioPoliticaCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPoliticaCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPoliticaCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPoliticaCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPoliticaCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPoliticaCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPoliticaCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPoliticaCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPoliticaCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPoliticaCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPoliticaCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPoliticaCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPoliticaCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPoliticaCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPoliticaCliente() throws Exception {
		try	{
			if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPoliticaCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePoliticaCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxTiposAccionesFormularioPoliticaCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxTiposAccionesFormularioPoliticaCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPoliticaCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPoliticaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPoliticaCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPoliticaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPoliticaCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPoliticaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPoliticaCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPoliticaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPoliticaCliente.addItem(reporte);
			}
			
			
			if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPoliticaCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPoliticaCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPoliticaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPoliticaCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPoliticaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPoliticaCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxTiposAccionesFormularioPoliticaCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxTiposAccionesFormularioPoliticaCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPoliticaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPoliticaCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPoliticaCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPoliticaCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPoliticaCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPoliticaCliente!=null) {
				this.jInternalFrameReporteDinamicoPoliticaCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPoliticaCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPoliticaCliente!=null) {
				this.jInternalFrameReporteDinamicoPoliticaCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPoliticaCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPoliticaCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoPoliticaCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPoliticaCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPoliticaCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPoliticaCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPoliticaCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPoliticaCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPoliticaCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClientePoliticaCliente.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClientePoliticaCliente.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPoliticaCliente(Boolean esInicializar) throws Exception {				
		if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPoliticaCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPoliticaCliente() throws Exception {
		this.inicializarActualizarBindingTablaPoliticaCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPoliticaCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPoliticaCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPoliticaCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPoliticaCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PoliticaClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPoliticaCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPoliticaCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PoliticaClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPoliticaClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PoliticaClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPoliticaCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPoliticaCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PoliticaClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPoliticaCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPoliticaCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=politicaclienteLogic.getPoliticaClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=politicaclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPoliticaCliente.setModel(new PoliticaClienteModel(this.politicaclienteLogic.getPoliticaClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPoliticaCliente.setModel(new PoliticaClienteModel(this.politicaclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPoliticaCliente!=null && this.jInternalFrameOrderByPoliticaCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPoliticaCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPoliticaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PoliticaClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO,politicaclienteConstantesFunciones.resaltarSeleccionarPoliticaCliente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO,politicaclienteConstantesFunciones.resaltarSeleccionarPoliticaCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPoliticaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaCliente,PoliticaClienteConstantesFunciones.LABEL_ID));

		if(this.politicaclienteConstantesFunciones.mostraridPoliticaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.politicaclienteConstantesFunciones.resaltaridPoliticaCliente,this.politicaclienteConstantesFunciones.activaridPoliticaCliente,this,true,"idPoliticaCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.politicaclienteConstantesFunciones.resaltaridPoliticaCliente,this.politicaclienteConstantesFunciones.activaridPoliticaCliente,this,true,"idPoliticaCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaCliente,PoliticaClienteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.politicaclienteConstantesFunciones.mostrarid_empresaPoliticaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaClienteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.politicaclienteConstantesFunciones.resaltarid_empresaPoliticaCliente,this,this.politicaclienteConstantesFunciones.activarid_empresaPoliticaCliente));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.politicaclienteConstantesFunciones.resaltarid_empresaPoliticaCliente,this,this.politicaclienteConstantesFunciones.activarid_empresaPoliticaCliente,false,"id_empresaPoliticaCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PoliticaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaCliente,PoliticaClienteConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.politicaclienteConstantesFunciones.mostrarid_sucursalPoliticaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaClienteConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.politicaclienteConstantesFunciones.resaltarid_sucursalPoliticaCliente,this,this.politicaclienteConstantesFunciones.activarid_sucursalPoliticaCliente));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.politicaclienteConstantesFunciones.resaltarid_sucursalPoliticaCliente,this,this.politicaclienteConstantesFunciones.activarid_sucursalPoliticaCliente,false,"id_sucursalPoliticaCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PoliticaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaCliente,PoliticaClienteConstantesFunciones.LABEL_IDCLIENTE));

		if(this.politicaclienteConstantesFunciones.mostrarid_clientePoliticaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaClienteConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.politicaclienteConstantesFunciones.resaltarid_clientePoliticaCliente,this,this.politicaclienteConstantesFunciones.activarid_clientePoliticaCliente));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.politicaclienteConstantesFunciones.resaltarid_clientePoliticaCliente,this,this.politicaclienteConstantesFunciones.activarid_clientePoliticaCliente,true,"id_clientePoliticaCliente","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new PoliticaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.politicaclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.politicaclienteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPoliticaCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.politicaclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.politicaclienteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPoliticaCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPoliticaCliente && this.isPermisoGuardarCambiosPoliticaCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.politicaclienteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.politicaclienteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPoliticaCliente.addColumn(tableColumn);
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
			
			this.jTableDatosPoliticaCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPoliticaCliente && this.isPermisoGuardarCambiosPoliticaCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPoliticaCliente && this.isPermisoGuardarCambiosPoliticaCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPoliticaCliente.moveColumn(this.jTableDatosPoliticaCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPoliticaCliente.moveColumn(this.jTableDatosPoliticaCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPoliticaCliente.moveColumn(this.jTableDatosPoliticaCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPoliticaCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPoliticaCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPoliticaCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PoliticaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPoliticaCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPoliticaCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PoliticaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PoliticaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPoliticaCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPoliticaCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPoliticaCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=politicaclienteLogic.getPoliticaClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=politicaclientes.size()-1;
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
		//this.jTableDatosPoliticaCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPoliticaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPoliticaCliente();
			
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
				
				//this.isEsNuevoPoliticaCliente=false;
					
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
			
				if(this.politicaclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPoliticaCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPoliticaCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPoliticaCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicacliente =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicacliente =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.politicacliente.getsType().equals("DUPLICADO")
				   || this.politicacliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPoliticaCliente=true;
				
				} else {
					this.isEsNuevoPoliticaCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.politicacliente.getId()>=0 && !this.politicacliente.getIsNew()) {						
						this.isEsNuevoPoliticaCliente=false;
						
					} else {
						this.isEsNuevoPoliticaCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPoliticaCliente(esRelaciones);						
				
				this.seleccionarPoliticaCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.politicacliente.getId()<0) {
					this.isEsNuevoPoliticaCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPoliticaCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPoliticaCliente(evt,rowIndex);
				}	
				
				if(this.politicaclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PoliticaCliente: " + this.dDif); 
					}
				}								
				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPoliticaCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.politicacliente)) {
					if(this.politicacliente.getId()>0) {
						this.politicacliente.setIsDeleted(true);
						
						this.politicaclientesEliminados.add(this.politicacliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.politicaclienteLogic.getPoliticaClientes().remove(this.politicacliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.politicaclientes.remove(this.politicacliente);				
					}
					
					
					((PoliticaClienteModel) this.jTableDatosPoliticaCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPoliticaCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPoliticaCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPoliticaCliente) {
			
			if(this.jInternalFrameDetalleFormPoliticaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPoliticaCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPoliticaCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicacliente =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicacliente =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPoliticaCliente(this.politicacliente);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.politicaclienteConstantesFunciones.cargarid_empresaPoliticaCliente || this.politicaclienteConstantesFunciones.event_dependid_empresaPoliticaCliente) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.politicacliente.getid_empresa());
									//this.inicializarActualizarBindingPoliticaCliente(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(politicacliente.getEmpresa()!=null) {
							this.empresasForeignKey.add(politicacliente.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.politicacliente.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.politicaclienteConstantesFunciones.cargarid_sucursalPoliticaCliente || this.politicaclienteConstantesFunciones.event_dependid_sucursalPoliticaCliente) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.politicacliente.getid_sucursal());
									//this.inicializarActualizarBindingPoliticaCliente(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(politicacliente.getSucursal()!=null) {
							this.sucursalsForeignKey.add(politicacliente.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.politicacliente.getid_sucursal(),false,"Formulario");

					//Cliente
					if(!this.politicaclienteConstantesFunciones.cargarid_clientePoliticaCliente || this.politicaclienteConstantesFunciones.event_dependid_clientePoliticaCliente) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.politicacliente.getid_cliente());
									//this.inicializarActualizarBindingPoliticaCliente(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(politicacliente.getCliente()!=null) {
							this.clientesForeignKey.add(politicacliente.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.politicacliente.getid_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPoliticaCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPoliticaCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPoliticaCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPoliticaCliente(PoliticaCliente politicacliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPoliticaCliente(politicacliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPoliticaCliente(PoliticaCliente politicacliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPoliticaCliente(politicacliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPoliticaCliente(politicacliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPoliticaCliente(politicacliente);
	}
	
	public void setVariablesObjetoActualToFormularioPoliticaCliente(PoliticaCliente politicacliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPoliticaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPoliticaCliente.jLabelidPoliticaCliente.setText(politicacliente.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PoliticaCliente politicaclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,politicaclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PoliticaCliente politicaclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				politicaclienteLocal=this.politicacliente;
			} else {
				politicaclienteLocal=this.politicaclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(politicaclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPoliticaCliente(politicaclienteLocal,true);
					
					if(politicaclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(politicaclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(politicaclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPoliticaCliente(PoliticaCliente politicacliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPoliticaCliente(politicacliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(politicacliente);
	}
	
	public void setVariablesFormularioToObjetoActualPoliticaCliente(PoliticaCliente politicacliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPoliticaCliente(politicacliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPoliticaCliente(PoliticaCliente politicacliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPoliticaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPoliticaCliente.jLabelidPoliticaCliente.getText()==null || this.jInternalFrameDetalleFormPoliticaCliente.jLabelidPoliticaCliente.getText()=="" || this.jInternalFrameDetalleFormPoliticaCliente.jLabelidPoliticaCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormPoliticaCliente.jLabelidPoliticaCliente.setText("0");
			}

			if(conColumnasBase) {politicacliente.setId(Long.parseLong(this.jInternalFrameDetalleFormPoliticaCliente.jLabelidPoliticaCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PoliticaClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaCliente.jLabelIdPoliticaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPoliticaCliente(PoliticaCliente politicaclienteBean,PoliticaCliente politicacliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && politicaclienteBean.getid_cliente()!=null && !politicaclienteBean.getid_cliente().equals(-1L))) {politicacliente.setid_cliente(politicaclienteBean.getid_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPoliticaCliente(PoliticaCliente politicaclienteOrigen,PoliticaCliente politicacliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && politicaclienteOrigen.getId()!=null && !politicaclienteOrigen.getId().equals(0L))) {politicacliente.setId(politicaclienteOrigen.getId());}}
			if(conDefault || (!conDefault && politicaclienteOrigen.getid_cliente()!=null && !politicaclienteOrigen.getid_cliente().equals(-1L))) {politicacliente.setid_cliente(politicaclienteOrigen.getid_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPoliticaCliente(PoliticaCliente politicacliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPoliticaCliente.jLabelidPoliticaCliente.setText(politicacliente.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPoliticaCliente(PoliticaClienteBean politicaclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPoliticaCliente.jLabelidPoliticaCliente.setText(politicaclienteBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPoliticaCliente(PoliticaClienteParameterReturnGeneral politicaclienteReturnGeneral,PoliticaClienteBean politicaclienteBean,Boolean conDefault) throws Exception { 
		try {
			PoliticaCliente politicaclienteLocal=new PoliticaCliente();
			
			politicaclienteLocal=politicaclienteReturnGeneral.getPoliticaCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && politicaclienteLocal.getId()!=null && !politicaclienteLocal.getId().equals(0L))) {politicaclienteBean.setId(politicaclienteLocal.getId());}}
			if(conDefault || (!conDefault && politicaclienteLocal.getid_cliente()!=null && !politicaclienteLocal.getid_cliente().equals(-1L))) {politicaclienteBean.setid_cliente(politicaclienteLocal.getid_cliente());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPoliticaClienteGenerico(Long idPoliticaClienteSeleccionado,JComboBox jComboBoxPoliticaCliente,List<PoliticaCliente> politicaclientesLocal)throws Exception {
		try {
			PoliticaCliente  politicaclienteTemp=null;

			for(PoliticaCliente politicaclienteAux:politicaclientesLocal) {
				if(politicaclienteAux.getId()!=null && politicaclienteAux.getId().equals(idPoliticaClienteSeleccionado)) {
					politicaclienteTemp=politicaclienteAux;
					break;
				}
			}

			jComboBoxPoliticaCliente.setSelectedItem(politicaclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPoliticaClienteGenerico(JComboBox jComboBoxPoliticaCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPoliticaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPoliticaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPoliticaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPoliticaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPoliticaCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPoliticaCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPoliticaCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPoliticaCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPoliticaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPoliticaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			politicacliente=(PoliticaCliente) politicaclienteLogic.getPoliticaClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			politicacliente =(PoliticaCliente) politicaclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!politicacliente.getIsNew() && !politicacliente.getIsChanged() && !politicacliente.getIsDeleted()) {
				sDescripcion=politicacliente.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=politicacliente.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!politicacliente.getIsNew() && !politicacliente.getIsChanged() && !politicacliente.getIsDeleted()) {
				sDescripcion=politicacliente.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=politicacliente.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!politicacliente.getIsNew() && !politicacliente.getIsChanged() && !politicacliente.getIsDeleted()) {
				sDescripcion=politicacliente.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=politicacliente.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PoliticaCliente politicaclienteRow=new PoliticaCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			politicaclienteRow=(PoliticaCliente) politicaclienteLogic.getPoliticaClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			politicaclienteRow=(PoliticaCliente) politicaclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPoliticaCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPoliticaCliente.setVisible((this.isVisibilidadCeldaNuevoPoliticaCliente && this.isPermisoNuevoPoliticaCliente));			
			this.jButtonDuplicarPoliticaCliente.setVisible((this.isVisibilidadCeldaDuplicarPoliticaCliente && this.isPermisoDuplicarPoliticaCliente));			
			this.jButtonCopiarPoliticaCliente.setVisible((this.isVisibilidadCeldaCopiarPoliticaCliente && this.isPermisoCopiarPoliticaCliente));
			this.jButtonVerFormPoliticaCliente.setVisible((this.isVisibilidadCeldaVerFormPoliticaCliente && this.isPermisoVerFormPoliticaCliente));
			
			this.jButtonAbrirOrderByPoliticaCliente.setVisible((this.isVisibilidadCeldaOrdenPoliticaCliente && this.isPermisoOrdenPoliticaCliente));			
			
			this.jButtonNuevoRelacionesPoliticaCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente && this.isPermisoNuevoPoliticaCliente));			
			this.jButtonNuevoGuardarCambiosPoliticaCliente.setVisible((this.isVisibilidadCeldaNuevoPoliticaCliente && this.isPermisoNuevoPoliticaCliente && this.isPermisoGuardarCambiosPoliticaCliente));
			
			if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonModificarPoliticaCliente.setVisible((this.isVisibilidadCeldaModificarPoliticaCliente && this.isPermisoActualizarPoliticaCliente));	
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonActualizarPoliticaCliente.setVisible((this.isVisibilidadCeldaActualizarPoliticaCliente && this.isPermisoActualizarPoliticaCliente));	
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonEliminarPoliticaCliente.setVisible((this.isVisibilidadCeldaEliminarPoliticaCliente && this.isPermisoEliminarPoliticaCliente));
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonCancelarPoliticaCliente.setVisible(this.isVisibilidadCeldaCancelarPoliticaCliente);							
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonGuardarCambiosPoliticaCliente.setVisible((this.isVisibilidadCeldaGuardarPoliticaCliente && this.isPermisoGuardarCambiosPoliticaCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaPoliticaCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosPoliticaCliente && this.isPermisoGuardarCambiosPoliticaCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPoliticaCliente.setVisible((this.isVisibilidadCeldaNuevoPoliticaCliente && this.isPermisoNuevoPoliticaCliente));						
			this.jButtonDuplicarToolBarPoliticaCliente.setVisible((this.isVisibilidadCeldaDuplicarPoliticaCliente && this.isPermisoDuplicarPoliticaCliente));						
			this.jButtonCopiarToolBarPoliticaCliente.setVisible((this.isVisibilidadCeldaCopiarPoliticaCliente && this.isPermisoCopiarPoliticaCliente));			
			this.jButtonVerFormToolBarPoliticaCliente.setVisible((this.isVisibilidadCeldaVerFormPoliticaCliente && this.isPermisoVerFormPoliticaCliente));			
			this.jButtonAbrirOrderByToolBarPoliticaCliente.setVisible((this.isVisibilidadCeldaOrdenPoliticaCliente && this.isPermisoOrdenPoliticaCliente));
			this.jButtonNuevoRelacionesToolBarPoliticaCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente && this.isPermisoNuevoPoliticaCliente));			
			this.jButtonNuevoGuardarCambiosToolBarPoliticaCliente.setVisible((this.isVisibilidadCeldaNuevoPoliticaCliente && this.isPermisoNuevoPoliticaCliente && this.isPermisoGuardarCambiosPoliticaCliente));			
			
			if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonModificarToolBarPoliticaCliente.setVisible((this.isVisibilidadCeldaModificarPoliticaCliente && this.isPermisoActualizarPoliticaCliente));	
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonActualizarToolBarPoliticaCliente.setVisible((this.isVisibilidadCeldaActualizarPoliticaCliente  && this.isPermisoActualizarPoliticaCliente));	
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonEliminarToolBarPoliticaCliente.setVisible((this.isVisibilidadCeldaEliminarPoliticaCliente && this.isPermisoEliminarPoliticaCliente));
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonCancelarToolBarPoliticaCliente.setVisible(this.isVisibilidadCeldaCancelarPoliticaCliente);				
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonGuardarCambiosToolBarPoliticaCliente.setVisible((this.isVisibilidadCeldaGuardarPoliticaCliente && this.isPermisoGuardarCambiosPoliticaCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPoliticaCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosPoliticaCliente && this.isPermisoGuardarCambiosPoliticaCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPoliticaCliente.setVisible((this.isVisibilidadCeldaNuevoPoliticaCliente && this.isPermisoNuevoPoliticaCliente));			
			this.jMenuItemDuplicarPoliticaCliente.setVisible((this.isVisibilidadCeldaDuplicarPoliticaCliente && this.isPermisoDuplicarPoliticaCliente));			
			this.jMenuItemCopiarPoliticaCliente.setVisible((this.isVisibilidadCeldaCopiarPoliticaCliente && this.isPermisoCopiarPoliticaCliente));			
			this.jMenuItemVerFormPoliticaCliente.setVisible((this.isVisibilidadCeldaVerFormPoliticaCliente && this.isPermisoVerFormPoliticaCliente));			
			this.jMenuItemAbrirOrderByPoliticaCliente.setVisible((this.isVisibilidadCeldaOrdenPoliticaCliente && this.isPermisoOrdenPoliticaCliente));			
			//this.jMenuItemMostrarOcultarPoliticaCliente.setVisible((this.isVisibilidadCeldaOrdenPoliticaCliente && this.isPermisoOrdenPoliticaCliente));
			this.jMenuItemDetalleAbrirOrderByPoliticaCliente.setVisible((this.isVisibilidadCeldaOrdenPoliticaCliente && this.isPermisoOrdenPoliticaCliente));			
			//this.jMenuItemDetalleMostrarOcultarPoliticaCliente.setVisible((this.isVisibilidadCeldaOrdenPoliticaCliente && this.isPermisoOrdenPoliticaCliente));			
			this.jMenuItemNuevoRelacionesPoliticaCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente && this.isPermisoNuevoPoliticaCliente));			
			this.jMenuItemNuevoGuardarCambiosPoliticaCliente.setVisible((this.isVisibilidadCeldaNuevoPoliticaCliente && this.isPermisoNuevoPoliticaCliente && this.isPermisoGuardarCambiosPoliticaCliente));									
			
			if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
			this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemModificarPoliticaCliente.setVisible((this.isVisibilidadCeldaModificarPoliticaCliente && this.isPermisoActualizarPoliticaCliente));	
			this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemActualizarPoliticaCliente.setVisible((this.isVisibilidadCeldaActualizarPoliticaCliente && this.isPermisoActualizarPoliticaCliente));	
			this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemEliminarPoliticaCliente.setVisible((this.isVisibilidadCeldaEliminarPoliticaCliente && this.isPermisoEliminarPoliticaCliente));
			this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemCancelarPoliticaCliente.setVisible(this.isVisibilidadCeldaCancelarPoliticaCliente);				
			}
			
			this.jMenuItemGuardarCambiosPoliticaCliente.setVisible((this.isVisibilidadCeldaGuardarPoliticaCliente && this.isPermisoGuardarCambiosPoliticaCliente));						
			this.jMenuItemGuardarCambiosTablaPoliticaCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosPoliticaCliente && this.isPermisoGuardarCambiosPoliticaCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPoliticaCliente=this.jButtonNuevoPoliticaCliente.isVisible();
			this.isVisibilidadCeldaDuplicarPoliticaCliente=this.jButtonDuplicarPoliticaCliente.isVisible();
			this.isVisibilidadCeldaCopiarPoliticaCliente=this.jButtonCopiarPoliticaCliente.isVisible();
			this.isVisibilidadCeldaVerFormPoliticaCliente=this.jButtonVerFormPoliticaCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenPoliticaCliente=this.jButtonAbrirOrderByPoliticaCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente=this.jButtonNuevoRelacionesPoliticaCliente.isVisible();
			this.isVisibilidadCeldaModificarPoliticaCliente=this.jButtonModificarPoliticaCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
			this.isVisibilidadCeldaActualizarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jButtonActualizarPoliticaCliente.isVisible();
			this.isVisibilidadCeldaEliminarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jButtonEliminarPoliticaCliente.isVisible();
			this.isVisibilidadCeldaCancelarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jButtonCancelarPoliticaCliente.isVisible();
			this.isVisibilidadCeldaGuardarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jButtonGuardarCambiosPoliticaCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPoliticaCliente=this.jButtonGuardarCambiosTablaPoliticaCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPoliticaCliente=this.jButtonNuevoToolBarPoliticaCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente=this.jButtonNuevoRelacionesToolBarPoliticaCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
			this.isVisibilidadCeldaModificarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jButtonModificarToolBarPoliticaCliente.isVisible();
			this.isVisibilidadCeldaActualizarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jButtonActualizarToolBarPoliticaCliente.isVisible();
			this.isVisibilidadCeldaEliminarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jButtonEliminarToolBarPoliticaCliente.isVisible();
			this.isVisibilidadCeldaCancelarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jButtonCancelarToolBarPoliticaCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPoliticaCliente=this.jButtonGuardarCambiosToolBarPoliticaCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPoliticaCliente=this.jButtonGuardarCambiosTablaToolBarPoliticaCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPoliticaCliente=this.jMenuItemNuevoPoliticaCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente=this.jMenuItemNuevoRelacionesPoliticaCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
			this.isVisibilidadCeldaModificarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemModificarPoliticaCliente.isVisible();
			this.isVisibilidadCeldaActualizarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemActualizarPoliticaCliente.isVisible();
			this.isVisibilidadCeldaEliminarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemEliminarPoliticaCliente.isVisible();
			this.isVisibilidadCeldaCancelarPoliticaCliente=this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemCancelarPoliticaCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPoliticaCliente=this.jMenuItemGuardarCambiosPoliticaCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPoliticaCliente=this.jMenuItemGuardarCambiosTablaPoliticaCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPoliticaCliente(Boolean esInicializar) {
		if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.politicaclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPoliticaCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualPoliticaCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPoliticaCliente() {
		this.jButtonNuevoPoliticaCliente.setVisible(this.isPermisoNuevoPoliticaCliente);			
		this.jButtonDuplicarPoliticaCliente.setVisible(this.isPermisoDuplicarPoliticaCliente);			
		this.jButtonCopiarPoliticaCliente.setVisible(this.isPermisoCopiarPoliticaCliente);			
		this.jButtonVerFormPoliticaCliente.setVisible(this.isPermisoVerFormPoliticaCliente);			
		
		this.jButtonAbrirOrderByPoliticaCliente.setVisible(this.isPermisoOrdenPoliticaCliente);					
		
		this.jButtonNuevoRelacionesPoliticaCliente.setVisible(this.isPermisoNuevoPoliticaCliente);			
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonModificarPoliticaCliente.setVisible(this.isPermisoActualizarPoliticaCliente);	
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonActualizarPoliticaCliente.setVisible(this.isPermisoActualizarPoliticaCliente);	
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonEliminarPoliticaCliente.setVisible(this.isPermisoEliminarPoliticaCliente);
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonCancelarPoliticaCliente.setVisible(this.isVisibilidadCeldaCancelarPoliticaCliente);						
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonGuardarCambiosPoliticaCliente.setVisible(this.isPermisoGuardarCambiosPoliticaCliente);							
		}
		
		this.jButtonGuardarCambiosTablaPoliticaCliente.setVisible(this.isPermisoActualizarPoliticaCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePoliticaCliente() {
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonModificarPoliticaCliente.setVisible(this.isPermisoActualizarPoliticaCliente);	
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonActualizarPoliticaCliente.setVisible(this.isPermisoActualizarPoliticaCliente);	
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonEliminarPoliticaCliente.setVisible(this.isPermisoEliminarPoliticaCliente);
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonCancelarPoliticaCliente.setVisible(this.isVisibilidadCeldaCancelarPoliticaCliente);							
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonGuardarCambiosPoliticaCliente.setVisible((this.isVisibilidadCeldaGuardarPoliticaCliente && this.isPermisoGuardarCambiosPoliticaCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPoliticaCliente() {
		if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPoliticaCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPoliticaCliente() {
	}
	
	public void jTableDatosPoliticaClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPoliticaCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPoliticaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaCliente(this.getpoliticacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicacliente =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicacliente =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicacliente==null) {
						this.politicacliente = new PoliticaCliente();
					}

					this.setVariablesFormularioToObjetoActualPoliticaCliente(this.politicacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);
				}

				if(this.politicacliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.politicacliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPoliticaClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPoliticaCliente(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPoliticaCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPoliticaCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicacliente =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.politicacliente =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPoliticaCliente(this.getpoliticacliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.politicaclienteLogic.getConnexion());

				if(this.politicacliente.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.politicacliente.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPoliticaCliente=(TitledBorder)this.jScrollPanelDatosPoliticaCliente.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPoliticaCliente.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPoliticaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaCliente(this.getpoliticacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicacliente =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicacliente =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicacliente==null) {
						this.politicacliente = new PoliticaCliente();
					}

					this.setVariablesFormularioToObjetoActualPoliticaCliente(this.politicacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);
				}

				if(this.politicacliente.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.politicacliente.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalPoliticaClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebPoliticaCliente(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPoliticaCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPoliticaCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicacliente =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.politicacliente =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPoliticaCliente(this.getpoliticacliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.politicaclienteLogic.getConnexion());

				if(this.politicacliente.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.politicacliente.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPoliticaCliente=(TitledBorder)this.jScrollPanelDatosPoliticaCliente.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderPoliticaCliente.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalPoliticaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaCliente(this.getpoliticacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicacliente =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicacliente =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicacliente==null) {
						this.politicacliente = new PoliticaCliente();
					}

					this.setVariablesFormularioToObjetoActualPoliticaCliente(this.politicacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);
				}

				if(this.politicacliente.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.politicacliente.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clientePoliticaClienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderPoliticaCliente=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosPoliticaCliente.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPoliticaCliente=(TitledBorder)this.jScrollPanelDatosPoliticaCliente.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderPoliticaCliente.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clientePoliticaClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebPoliticaCliente(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPoliticaCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPoliticaCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicacliente =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.politicacliente =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPoliticaCliente(this.getpoliticacliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.politicaclienteLogic.getConnexion());

				if(this.politicacliente.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.politicacliente.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPoliticaCliente=(TitledBorder)this.jScrollPanelDatosPoliticaCliente.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderPoliticaCliente.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clientePoliticaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaCliente(this.getpoliticacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicacliente =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicacliente =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicacliente==null) {
						this.politicacliente = new PoliticaCliente();
					}

					this.setVariablesFormularioToObjetoActualPoliticaCliente(this.politicacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);
				}

				if(this.politicacliente.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.politicacliente.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClientePoliticaClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPoliticaCliente(false,false);

			this.getPoliticaClientesFK_IdCliente();

			this.inicializarActualizarBindingPoliticaCliente(false);

			//if(PoliticaClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPoliticaCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPoliticaCliente(false,false);

			this.getPoliticaClientesFK_IdEmpresa();

			this.inicializarActualizarBindingPoliticaCliente(false);

			//if(PoliticaClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPoliticaCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalPoliticaClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPoliticaCliente(false,false);

			this.getPoliticaClientesFK_IdSucursal();

			this.inicializarActualizarBindingPoliticaCliente(false);

			//if(PoliticaClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPoliticaCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePoliticaCliente() {
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
			this.jInternalFrameDetalleFormPoliticaCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormPoliticaCliente.dispose();
			this.jInternalFrameDetalleFormPoliticaCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPoliticaCliente!=null) {
			this.jInternalFrameReporteDinamicoPoliticaCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPoliticaCliente.dispose();
			this.jInternalFrameReporteDinamicoPoliticaCliente=null;
		}
		
		if(this.jInternalFrameImportacionPoliticaCliente!=null) {
			this.jInternalFrameImportacionPoliticaCliente.setVisible(false);	    			
			this.jInternalFrameImportacionPoliticaCliente.dispose();
			this.jInternalFrameImportacionPoliticaCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPoliticaCliente();
			
			PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoPoliticaCliente")) {
				jButtonNuevoPoliticaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPoliticaCliente")) {
				jButtonDuplicarPoliticaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPoliticaCliente")) {
				jButtonCopiarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormPoliticaCliente")) {
				jButtonVerFormPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPoliticaCliente")) {
				jButtonNuevoPoliticaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPoliticaCliente")) {
				jButtonDuplicarPoliticaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPoliticaCliente")) {
				jButtonNuevoPoliticaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPoliticaCliente")) {
				jButtonDuplicarPoliticaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPoliticaCliente")) {
				jButtonNuevoPoliticaClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPoliticaCliente")) {
				jButtonNuevoPoliticaClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPoliticaCliente")) {
				jButtonNuevoPoliticaClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPoliticaCliente")) {
				jButtonModificarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPoliticaCliente")) {
				jButtonModificarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPoliticaCliente")) {
				jButtonModificarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPoliticaCliente")) {
				jButtonActualizarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPoliticaCliente")) {
				jButtonActualizarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPoliticaCliente")) {
				jButtonActualizarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarPoliticaCliente")) {
				jButtonEliminarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPoliticaCliente")) {
				jButtonEliminarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPoliticaCliente")) {
				jButtonEliminarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarPoliticaCliente")) {
				jButtonCancelarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPoliticaCliente")) {
				jButtonCancelarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPoliticaCliente")) {
				jButtonCancelarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarPoliticaCliente")) {
				jButtonCerrarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPoliticaCliente")) {
				jButtonCerrarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPoliticaCliente")) {
				jButtonCerrarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPoliticaCliente")) {
				jButtonMostrarOcultarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPoliticaCliente")) {
				jButtonCancelarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPoliticaCliente")) {
				jButtonGuardarCambiosPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPoliticaCliente")) {
				jButtonGuardarCambiosPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPoliticaCliente")) {
				jButtonCopiarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPoliticaCliente")) {
				jButtonVerFormPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPoliticaCliente")) {
				jButtonGuardarCambiosPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPoliticaCliente")) {
				jButtonCopiarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPoliticaCliente")) {
				jButtonVerFormPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPoliticaCliente")) {
				jButtonGuardarCambiosPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPoliticaCliente")) {
				jButtonGuardarCambiosPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPoliticaCliente")) {
				jButtonGuardarCambiosPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPoliticaCliente")) {
				jButtonRecargarInformacionPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPoliticaCliente")) {
				jButtonRecargarInformacionPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPoliticaCliente")) {
				jButtonRecargarInformacionPoliticaClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPoliticaCliente")) {
				jButtonAnterioresPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPoliticaCliente")) {
				jButtonAnterioresPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePoliticaCliente")) {
				jButtonAnterioresPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPoliticaCliente")) {
				jButtonSiguientesPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPoliticaCliente")) {
				jButtonSiguientesPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPoliticaCliente")) {
				jButtonSiguientesPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPoliticaCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByPoliticaCliente")) {
				jButtonAbrirOrderByPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPoliticaCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarPoliticaCliente")) {
				jButtonMostrarOcultarPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPoliticaCliente")) {
				jButtonNuevoGuardarCambiosPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPoliticaCliente")) {
				jButtonNuevoGuardarCambiosPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPoliticaCliente")) {
				jButtonNuevoGuardarCambiosPoliticaClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPoliticaCliente")) {
				jButtonCerrarReporteDinamicoPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPoliticaCliente")) {
				jButtonGenerarReporteDinamicoPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPoliticaCliente")) {
				
				jButtonGenerarExcelReporteDinamicoPoliticaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPoliticaCliente")) {
				jButtonCerrarImportacionPoliticaClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPoliticaCliente")) {
				
				jButtonGenerarImportacionPoliticaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPoliticaCliente")) {
				
				jButtonAbrirImportacionPoliticaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPoliticaCliente")) {
				jComboBoxTiposAccionesPoliticaClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPoliticaCliente")) {
				jComboBoxTiposRelacionesPoliticaClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPoliticaCliente")) {
				jComboBoxTiposAccionesPoliticaClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPoliticaCliente")) {
				
				jComboBoxTiposSeleccionarPoliticaClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPoliticaCliente")) {
				jTextFieldValorCampoGeneralPoliticaClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPoliticaCliente")) {
				jButtonAbrirOrderByPoliticaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPoliticaCliente")) {
				jButtonAbrirOrderByPoliticaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPoliticaCliente")) {
				jButtonCerrarOrderByPoliticaClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPoliticaClienteBusqueda")) {
				this.jButtonidPoliticaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPoliticaClienteUpdate")) {
				this.jButtonid_empresaPoliticaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPoliticaClienteBusqueda")) {
				this.jButtonid_empresaPoliticaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPoliticaClienteUpdate")) {
				this.jButtonid_sucursalPoliticaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPoliticaClienteBusqueda")) {
				this.jButtonid_sucursalPoliticaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clientePoliticaCliente")) {
				this.jButtonid_clientePoliticaClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clientePoliticaClienteUpdate")) {
				this.jButtonid_clientePoliticaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clientePoliticaClienteBusqueda")) {
				this.jButtonid_clientePoliticaClienteBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clientePoliticaCliente")) {
				this.jButtonid_clientePoliticaClienteActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClientePoliticaCliente")) {
				this.jButtonFK_IdClientePoliticaClienteActionPerformed(evt);
			}
			
			;
			
			
			PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPoliticaCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicacliente);
				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
				
				


				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PoliticaCliente politicaclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				politicaclienteLocal=this.politicacliente;
			} else {
				politicaclienteLocal=this.politicaclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicacliente);
				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
							
				
				


				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteAnterior =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicaclienteAnterior =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
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
			
			PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
			
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
			
			


			
			PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicacliente);
				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
								
						
				


				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicacliente);
				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
								
				
				


				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteAnterior =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicaclienteAnterior =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicacliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteAnterior =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicaclienteAnterior =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.politicacliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.politicacliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicacliente);
				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
							
				
				


				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicaclienteAnterior =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.politicaclienteAnterior =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
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
			
			PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
			
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
			
			


			
			PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.politicacliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.politicacliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicacliente);
				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
								
				
				


				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteAnterior =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicaclienteAnterior =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.politicacliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.politicacliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicacliente);
				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPoliticaCliente")) {
					jCheckBoxSeleccionarTodosPoliticaClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPoliticaCliente")) {
					jCheckBoxSeleccionadosPoliticaClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPoliticaCliente")) {
					
				}
				
				


				
				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.politicacliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.politicacliente);
				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
												
				
				


				
				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicaclienteAnterior =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.politicaclienteAnterior =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicacliente);
				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
				
				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
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
			
			PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
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
			
			


			
			PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicacliente);
				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicacliente);
				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
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
				
				


				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaclienteAnterior =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicaclienteAnterior =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPoliticaCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPoliticaClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPoliticaCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.politicacliente =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.politicacliente =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.politicacliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPoliticaCliente")) {
				
				}
				
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPoliticaCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPoliticaCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPoliticaCliente")) {
			
			}
			
			PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPoliticaCliente();
			
			PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
			
			if(sTipo.equals("NuevoPoliticaCliente")) {
				jButtonNuevoPoliticaClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPoliticaCliente")) {
				jButtonDuplicarPoliticaClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPoliticaCliente")) {
				jButtonCopiarPoliticaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPoliticaCliente")) {
				jButtonVerFormPoliticaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPoliticaCliente")) {
				jButtonNuevoPoliticaClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPoliticaCliente")) {
				jButtonModificarPoliticaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPoliticaCliente")) {
				jButtonActualizarPoliticaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPoliticaCliente")) {
				jButtonEliminarPoliticaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPoliticaCliente")) {
				jButtonGuardarCambiosPoliticaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPoliticaCliente")) {
				jButtonCancelarPoliticaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPoliticaCliente")) {
				jButtonCerrarPoliticaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPoliticaCliente")) {
				jButtonGuardarCambiosPoliticaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPoliticaCliente")) {
				jButtonNuevoGuardarCambiosPoliticaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPoliticaCliente")) {
				jButtonAbrirOrderByPoliticaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPoliticaCliente")) {
				jButtonRecargarInformacionPoliticaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPoliticaCliente")) {
				jButtonAnterioresPoliticaClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPoliticaCliente")) {
				jButtonSiguientesPoliticaClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPoliticaClienteBusqueda")) {
				this.jButtonidPoliticaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPoliticaClienteUpdate")) {
				this.jButtonid_empresaPoliticaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPoliticaClienteBusqueda")) {
				this.jButtonid_empresaPoliticaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPoliticaClienteUpdate")) {
				this.jButtonid_sucursalPoliticaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPoliticaClienteBusqueda")) {
				this.jButtonid_sucursalPoliticaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clientePoliticaCliente")) {
				this.jButtonid_clientePoliticaClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clientePoliticaClienteUpdate")) {
				this.jButtonid_clientePoliticaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clientePoliticaClienteBusqueda")) {
				this.jButtonid_clientePoliticaClienteBusquedaActionPerformed(evt);
			}
			
			PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPoliticaCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePoliticaCliente")) {
				closingInternalFramePoliticaCliente();
				
			} else if(sTipo.equals("jButtonCancelarPoliticaCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormPoliticaCliente = (JInternalFrameBase)evt.getSource();
	            	
	            PoliticaClienteBeanSwingJInternalFrame jInternalFrameParent=(PoliticaClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormPoliticaCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPoliticaClienteActionPerformed(null);
			}
			
			PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.politicacliente,new Object(),this.politicaclienteParameterGeneral,this.politicaclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPoliticaCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPoliticaCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPoliticaCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.politicacliente)) {
			if(!esControlTabla) {
				if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPoliticaCliente(this.politicacliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);			
				}
				
				if(this.politicaclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPoliticaCliente(this.politicacliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.politicaclienteReturnGeneral=politicaclienteLogic.procesarEventosPoliticaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.politicaclienteLogic.getPoliticaClientes(),this.politicacliente,this.politicaclienteParameterGeneral,this.isEsNuevoPoliticaCliente,classes);//this.politicaclienteLogic.getPoliticaCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPoliticaCliente(this.politicaclienteReturnGeneral,this.politicaclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.politicaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPoliticaCliente(classes,this.politicaclienteReturnGeneral,this.politicaclienteBean,false);
					}
						
					if(this.politicaclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPoliticaCliente(this.politicaclienteReturnGeneral.getPoliticaCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPoliticaCliente(this.politicaclienteReturnGeneral.getPoliticaCliente());	
					}
						
					if(this.politicaclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPoliticaCliente(this.politicaclienteReturnGeneral.getPoliticaCliente(),classes);//this.politicaclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPoliticaCliente(this.politicacliente,classes);//this.politicaclienteBean);									
				}
			
				if(PoliticaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPoliticaCliente(this.politicacliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaCliente(this.politicacliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.politicaclienteAnterior!=null) {
						this.politicacliente=this.politicaclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.politicaclienteReturnGeneral=politicaclienteLogic.procesarEventosPoliticaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.politicaclienteLogic.getPoliticaClientes(),this.politicacliente,this.politicaclienteParameterGeneral,this.isEsNuevoPoliticaCliente,classes);//this.politicaclienteLogic.getPoliticaCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.politicaclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.politicaclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.politicaclienteReturnGeneral.getPoliticaCliente(),politicaclienteLogic.getPoliticaClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.politicaclienteReturnGeneral.getPoliticaCliente(),this.politicaclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPoliticaCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosPoliticaCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPoliticaCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosPoliticaCliente() throws Exception {
		
		PoliticaClienteModel politicaclienteModel=(PoliticaClienteModel)this.jTableDatosPoliticaCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			politicaclienteModel.politicaclientes=this.politicaclienteLogic.getPoliticaClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			politicaclienteModel.politicaclientes=this.politicaclientes;
		}
		
		
		((PoliticaClienteModel) this.jTableDatosPoliticaCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPoliticaCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpoliticaclienteAnterior(),this.politicaclienteLogic.getPoliticaClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpoliticaclienteAnterior(),this.politicaclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPoliticaCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPoliticaCliente(PoliticaCliente politicacliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
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
										
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.politicacliente,new Object(),generalEntityParameterGeneral,this.politicaclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.politicaclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PoliticaClienteConstantesFunciones.getClassesRelationshipsOfPoliticaCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PoliticaClienteConstantesFunciones.getClassesRelationshipsFromStringsOfPoliticaCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPoliticaCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PoliticaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.politicacliente,new Object(),generalEntityParameterGeneral,this.politicaclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPoliticaCliente(PoliticaClienteBean politicaclienteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPoliticaCliente(ArrayList<Classe> classes,PoliticaClienteReturnGeneral politicaclienteReturnGeneral,PoliticaClienteBean politicaclienteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPoliticaCliente(PoliticaCliente politicacliente,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.politicacliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPoliticaCliente = new PoliticaClienteDetalleFormJInternalFrame(jDesktopPane,this.politicaclienteSessionBean.getConGuardarRelaciones(),this.politicaclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPoliticaCliente);
		this.jInternalFrameDetalleFormPoliticaCliente.setVisible(false);
		this.jInternalFrameDetalleFormPoliticaCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormPoliticaCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPoliticaCliente.politicaclienteLogic=this.politicaclienteLogic;
		
		this.cargarCombosFrameForeignKeyPoliticaCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePoliticaCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePoliticaCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPoliticaCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPoliticaCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPoliticaCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPoliticaCliente"));
		
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonModificarPoliticaCliente.addActionListener(new ButtonActionListener(this,"ModificarPoliticaCliente"));

		
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonModificarToolBarPoliticaCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarPoliticaCliente"));
					
		this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemModificarPoliticaCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarPoliticaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonActualizarPoliticaCliente.addActionListener (new ButtonActionListener(this,"ActualizarPoliticaCliente"));
		
		
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonActualizarToolBarPoliticaCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPoliticaCliente"));
						
		this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemActualizarPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPoliticaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonEliminarPoliticaCliente.addActionListener (new ButtonActionListener(this,"EliminarPoliticaCliente"));
		
		
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonEliminarToolBarPoliticaCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarPoliticaCliente"));
								
		this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemEliminarPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPoliticaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonCancelarPoliticaCliente.addActionListener (new ButtonActionListener(this,"CancelarPoliticaCliente"));
		
		
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonCancelarToolBarPoliticaCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarPoliticaCliente"));
					
		this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemCancelarPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPoliticaCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemDetalleCerrarPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPoliticaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonGuardarCambiosToolBarPoliticaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPoliticaCliente"));
		
		
		
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonGuardarCambiosToolBarPoliticaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPoliticaCliente"));
		
		
		
		this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxTiposAccionesFormularioPoliticaCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPoliticaCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonidPoliticaClienteBusqueda.addActionListener(new ButtonActionListener(this,"idPoliticaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_empresaPoliticaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_empresaPoliticaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_sucursalPoliticaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_sucursalPoliticaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaClienteBusqueda"));
		//jButtonid_clientePoliticaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clientePoliticaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_clientePoliticaCliente.addActionListener(new ButtonActionListener(this,"id_clientePoliticaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_clientePoliticaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clientePoliticaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_clientePoliticaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clientePoliticaClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPoliticaCliente.jTabbedPaneRelacionesPoliticaCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPoliticaCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePoliticaCliente"));
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPoliticaCliente"));
		}
		
		this.jTableDatosPoliticaCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPoliticaCliente"));
		
		this.jTableDatosPoliticaCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPoliticaCliente"));
		
		this.jButtonNuevoPoliticaCliente.addActionListener(new ButtonActionListener(this,"NuevoPoliticaCliente"));
		
		this.jButtonDuplicarPoliticaCliente.addActionListener(new ButtonActionListener(this,"DuplicarPoliticaCliente"));
		
		this.jButtonCopiarPoliticaCliente.addActionListener(new ButtonActionListener(this,"CopiarPoliticaCliente"));
		
		this.jButtonVerFormPoliticaCliente.addActionListener(new ButtonActionListener(this,"VerFormPoliticaCliente"));
		
		
		this.jButtonNuevoToolBarPoliticaCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarPoliticaCliente"));
			
		this.jButtonDuplicarToolBarPoliticaCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPoliticaCliente"));
			
		this.jMenuItemNuevoPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPoliticaCliente"));
			
		this.jMenuItemDuplicarPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPoliticaCliente"));		
		
		
		this.jButtonNuevoRelacionesPoliticaCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPoliticaCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarPoliticaCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPoliticaCliente"));
			
		this.jMenuItemNuevoRelacionesPoliticaCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPoliticaCliente"));		
		
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonModificarPoliticaCliente.addActionListener(new ButtonActionListener(this,"ModificarPoliticaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonModificarToolBarPoliticaCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarPoliticaCliente"));
			
			this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemModificarPoliticaCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarPoliticaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonActualizarPoliticaCliente.addActionListener (new ButtonActionListener(this,"ActualizarPoliticaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonActualizarToolBarPoliticaCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPoliticaCliente"));
				
			this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemActualizarPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPoliticaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonEliminarPoliticaCliente.addActionListener (new ButtonActionListener(this,"EliminarPoliticaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonEliminarToolBarPoliticaCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarPoliticaCliente"));
						
			this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemEliminarPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPoliticaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonCancelarPoliticaCliente.addActionListener (new ButtonActionListener(this,"CancelarPoliticaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonCancelarToolBarPoliticaCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarPoliticaCliente"));
			
			this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemCancelarPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPoliticaCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPoliticaCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPoliticaCliente"));		
		
		
		this.jButtonCerrarPoliticaCliente.addActionListener (new ButtonActionListener(this,"CerrarPoliticaCliente"));
		
		
		this.jButtonCerrarToolBarPoliticaCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarPoliticaCliente"));
			
		this.jMenuItemCerrarPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPoliticaCliente"));
			
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaCliente.jMenuItemDetalleCerrarPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPoliticaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonGuardarCambiosPoliticaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosPoliticaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonGuardarCambiosToolBarPoliticaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPoliticaCliente"));
		}
		
		this.jButtonCopiarToolBarPoliticaCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarPoliticaCliente"));
			
		this.jButtonVerFormToolBarPoliticaCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarPoliticaCliente"));
		
		this.jMenuItemGuardarCambiosPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPoliticaCliente"));
			
		this.jMenuItemCopiarPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPoliticaCliente"));		
		
		this.jMenuItemVerFormPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPoliticaCliente"));		
		
		
		this.jButtonGuardarCambiosTablaPoliticaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPoliticaCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPoliticaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPoliticaCliente"));
			
		this.jMenuItemGuardarCambiosTablaPoliticaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPoliticaCliente"));		
		
		
		
		this.jButtonRecargarInformacionPoliticaCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionPoliticaCliente"));
					
		this.jButtonRecargarInformacionToolBarPoliticaCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPoliticaCliente"));
		
		this.jMenuItemRecargarInformacionPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPoliticaCliente"));		
		
		
		
		this.jButtonAnterioresPoliticaCliente.addActionListener (new ButtonActionListener(this,"AnterioresPoliticaCliente"));
		
		
		this.jButtonAnterioresToolBarPoliticaCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPoliticaCliente"));
		
		this.jMenuItemAnterioresPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPoliticaCliente"));		
		
		
		this.jButtonSiguientesPoliticaCliente.addActionListener (new ButtonActionListener(this,"SiguientesPoliticaCliente"));
		
		
		this.jButtonSiguientesToolBarPoliticaCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPoliticaCliente"));
			
		this.jMenuItemSiguientesPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPoliticaCliente"));
			
		this.jMenuItemAbrirOrderByPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPoliticaCliente"));
			
		this.jMenuItemMostrarOcultarPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPoliticaCliente"));
			
		this.jMenuItemDetalleAbrirOrderByPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPoliticaCliente"));
			
		this.jMenuItemDetalleMostarOcultarPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPoliticaCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosPoliticaCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPoliticaCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPoliticaCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPoliticaCliente"));
			
		this.jMenuItemNuevoGuardarCambiosPoliticaCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPoliticaCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPoliticaCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPoliticaCliente"));

		this.jCheckBoxSeleccionadosPoliticaCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPoliticaCliente"));
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxTiposAccionesFormularioPoliticaCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPoliticaCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesPoliticaCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesPoliticaCliente"));
			
		this.jComboBoxTiposAccionesPoliticaCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesPoliticaCliente"));
					
		this.jComboBoxTiposSeleccionarPoliticaCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPoliticaCliente"));
			
		this.jTextFieldValorCampoGeneralPoliticaCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPoliticaCliente"));		
		
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonidPoliticaClienteBusqueda.addActionListener(new ButtonActionListener(this,"idPoliticaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_empresaPoliticaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_empresaPoliticaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_sucursalPoliticaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_sucursalPoliticaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaClienteBusqueda"));
		//jButtonid_clientePoliticaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clientePoliticaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_clientePoliticaCliente.addActionListener(new ButtonActionListener(this,"id_clientePoliticaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_clientePoliticaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clientePoliticaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_clientePoliticaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clientePoliticaClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClientePoliticaCliente.addActionListener(new ButtonActionListener(this,"FK_IdClientePoliticaCliente"));

			this.jButtonBuscarFK_IdClienteid_clientePoliticaCliente.addActionListener(new ButtonActionListener(this,"id_clientePoliticaCliente"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPoliticaCliente!=null) {
				this.jInternalFrameReporteDinamicoPoliticaCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPoliticaCliente"));
				this.jInternalFrameReporteDinamicoPoliticaCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPoliticaCliente"));
				this.jInternalFrameReporteDinamicoPoliticaCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPoliticaCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoPoliticaCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPoliticaCliente"));				
			//this.jButtonGenerarReporteDinamicoPoliticaCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPoliticaCliente"));
			//this.jButtonGenerarExcelReporteDinamicoPoliticaCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPoliticaCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPoliticaCliente!=null) {
				this.jInternalFrameImportacionPoliticaCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPoliticaCliente"));
				this.jInternalFrameImportacionPoliticaCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPoliticaCliente"));
				this.jInternalFrameImportacionPoliticaCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPoliticaCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPoliticaCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByPoliticaCliente"));
			
			this.jButtonAbrirOrderByToolBarPoliticaCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPoliticaCliente"));			
			
			if(this.jInternalFrameOrderByPoliticaCliente!=null) {
				this.jInternalFrameOrderByPoliticaCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPoliticaCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaCliente.jTabbedPaneRelacionesPoliticaCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPoliticaCliente"));
		
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
            		closingInternalFramePoliticaCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPoliticaCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPoliticaCliente = (JInternalFrameBase)event.getSource();
	            	
	            PoliticaClienteBeanSwingJInternalFrame jInternalFrameParent=(PoliticaClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormPoliticaCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPoliticaClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPoliticaCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPoliticaClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPoliticaCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPoliticaCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPoliticaCliente";
		inputMap = this.jButtonNuevoPoliticaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPoliticaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPoliticaClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPoliticaCliente";
		inputMap = this.jButtonNuevoRelacionesPoliticaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPoliticaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPoliticaClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPoliticaCliente";
		inputMap = this.jButtonModificarPoliticaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPoliticaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPoliticaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPoliticaCliente";
		inputMap = this.jButtonActualizarPoliticaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPoliticaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPoliticaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPoliticaCliente";
		inputMap = this.jButtonEliminarPoliticaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPoliticaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPoliticaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPoliticaCliente";
		inputMap = this.jButtonCancelarPoliticaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPoliticaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPoliticaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPoliticaCliente";
		inputMap = this.jButtonCerrarPoliticaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPoliticaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPoliticaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonGuardarCambiosPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPoliticaCliente";
		inputMap = this.jInternalFrameDetalleFormPoliticaCliente.jButtonGuardarCambiosPoliticaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonGuardarCambiosPoliticaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPoliticaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPoliticaCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPoliticaClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPoliticaCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPoliticaClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPoliticaCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPoliticaClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPoliticaCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPoliticaClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonidPoliticaClienteBusqueda.addActionListener(new ButtonActionListener(this,"idPoliticaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_empresaPoliticaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_empresaPoliticaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_sucursalPoliticaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_sucursalPoliticaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaClienteBusqueda"));
		//jButtonid_clientePoliticaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clientePoliticaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_clientePoliticaCliente.addActionListener(new ButtonActionListener(this,"id_clientePoliticaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_clientePoliticaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clientePoliticaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_clientePoliticaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clientePoliticaClienteBusqueda"));
		
		
		this.jButtonFK_IdClientePoliticaCliente.addActionListener(new ButtonActionListener(this,"FK_IdClientePoliticaCliente"));

		this.jButtonBuscarFK_IdClienteid_clientePoliticaCliente.addActionListener(new ButtonActionListener(this,"id_clientePoliticaCliente"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPoliticaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPoliticaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPoliticaClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPoliticaCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPoliticaCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PoliticaCliente politicaclienteAux:this.politicaclienteLogic.getPoliticaClientes()) {
					politicaclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PoliticaCliente politicaclienteAux:politicaclientes) {
					politicaclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPoliticaClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPoliticaCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PoliticaCliente politicaclienteAux:this.politicaclienteLogic.getPoliticaClientes()) {
						politicaclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PoliticaCliente politicaclienteAux:politicaclientes) {
						politicaclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PoliticaCliente politicaclienteAux:this.politicaclienteLogic.getPoliticaClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PoliticaCliente politicaclienteAux:politicaclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPoliticaCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPoliticaCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPoliticaCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPoliticaCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPoliticaClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPoliticaCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPoliticaCliente.getSelectedRows();
			
			PoliticaCliente politicaclienteLocal=new PoliticaCliente();
			
			//this.seleccionarTodosPoliticaCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					politicaclienteLocal =(PoliticaCliente) this.politicaclienteLogic.getPoliticaClientes().toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					politicaclienteLocal =(PoliticaCliente) this.politicaclientes.toArray()[this.jTableDatosPoliticaCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				politicaclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PoliticaCliente politicaclienteAux:this.politicaclienteLogic.getPoliticaClientes()) {
						politicaclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PoliticaCliente politicaclienteAux:politicaclientes) {
						politicaclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPoliticaCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPoliticaCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPoliticaCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPoliticaCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPoliticaClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPoliticaClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPoliticaClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPoliticaCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPoliticaCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PoliticaCliente politicaclienteAux:this.politicaclienteLogic.getPoliticaClientes()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PoliticaCliente politicaclienteAux:politicaclientes) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPoliticaCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPoliticaClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPoliticaCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPoliticaCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPoliticaCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxTiposAccionesFormularioPoliticaCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePoliticaCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessPoliticaCliente(conSplash);
				
					this.generarReportePoliticaClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPoliticaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxTiposAccionesFormularioPoliticaCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPoliticaClientesSeleccionados();
				//this.jComboBoxTiposAccionesPoliticaCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPoliticaClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesPoliticaCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPoliticaClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesPoliticaCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPoliticaCliente();
				
				this.exportarPoliticaClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPoliticaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxTiposAccionesFormularioPoliticaCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPoliticaClientes();
				//this.importarPoliticaClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPoliticaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxTiposAccionesFormularioPoliticaCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPoliticaCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPoliticaClientesSeleccionados();
				//this.jComboBoxTiposAccionesPoliticaCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Politica Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPoliticaCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPoliticaCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPoliticaCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Politica Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPoliticaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxTiposAccionesFormularioPoliticaCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(PoliticaClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePoliticaCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPoliticaCliente(conSplash);
					
						//this.actualizarParametrosGeneralPoliticaCliente();
						
						this.generarReporteProcesoAccionPoliticaClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPoliticaCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxTiposAccionesFormularioPoliticaCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PoliticaClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Politica ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Politica Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPoliticaCliente();
				
						this.actualizarParametrosGeneralPoliticaCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.politicaclienteReturnGeneral=politicaclienteLogic.procesarAccionPoliticaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.politicaclienteLogic.getPoliticaClientes(),this.politicaclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPoliticaClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPoliticaCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxTiposAccionesFormularioPoliticaCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPoliticaCliente();
					
					PoliticaClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPoliticaClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPoliticaCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxTiposAccionesFormularioPoliticaCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPoliticaCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPoliticaClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPoliticaCliente();
			
			if(this.jInternalFrameDetalleFormPoliticaCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PoliticaCliente> politicaclientesSeleccionados=new ArrayList<PoliticaCliente>();		
			PoliticaCliente politicacliente=new PoliticaCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPoliticaCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPoliticaCliente.getSelectedItem();
			
			
			
			
			politicaclientesSeleccionados=this.getPoliticaClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(politicaclientesSeleccionados.size()==1) {
				for(PoliticaCliente politicaclienteAux:politicaclientesSeleccionados) {
					politicacliente=politicaclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPoliticaCliente();
			
      		//this.finishProcessPoliticaCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPoliticaClienteReturnGeneral() throws Exception {
		if(this.politicaclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.politicaclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.politicaclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.politicaclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.politicaclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.politicaclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPoliticaCliente(false);
		}
		
		if(this.politicaclienteReturnGeneral.getConRetornoLista() || this.politicaclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.politicaclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.politicaclienteLogic.setPoliticaClientes(this.politicaclienteReturnGeneral.getPoliticaClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.politicaclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.politicaclienteLogic.setPoliticaCliente(this.politicaclienteReturnGeneral.getPoliticaCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPoliticaCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralPoliticaCliente() throws Exception {
		
		
	}
	
	public ArrayList<PoliticaCliente> getPoliticaClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PoliticaCliente> politicaclientesSeleccionados=new ArrayList<PoliticaCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPoliticaCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PoliticaCliente politicaclienteAux:politicaclienteLogic.getPoliticaClientes()) {
					if(politicaclienteAux.getIsSelected()) {
						politicaclientesSeleccionados.add(politicaclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PoliticaCliente politicaclienteAux:this.politicaclientes) {
					if(politicaclienteAux.getIsSelected()) {
						politicaclientesSeleccionados.add(politicaclienteAux);				
					}
				}
			}
			
			if(politicaclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						politicaclientesSeleccionados.addAll(this.politicaclienteLogic.getPoliticaClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						politicaclientesSeleccionados.addAll(this.politicaclientes);				
					}
				}
			}
		} else {
			politicaclientesSeleccionados.add(this.politicacliente);
		}
		
		return politicaclientesSeleccionados;
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
	
	public void generarReportePoliticaClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPoliticaClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPoliticaClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPoliticaClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPoliticaClientesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Politica Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPoliticaClientesSeleccionados() throws Exception {
		ArrayList<PoliticaCliente> politicaclientesSeleccionados=new ArrayList<PoliticaCliente>();		
		
		politicaclientesSeleccionados=this.getPoliticaClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePoliticaClientes("Todos",politicaclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalPoliticaClientesSeleccionados() throws Exception {
		ArrayList<PoliticaCliente> politicaclientesSeleccionados=new ArrayList<PoliticaCliente>();		
		
		politicaclientesSeleccionados=this.getPoliticaClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePoliticaClientes("Todos",politicaclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPoliticaClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PoliticaCliente> politicaclientesSeleccionados=new ArrayList<PoliticaCliente>();
		
		politicaclientesSeleccionados=this.getPoliticaClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePoliticaClientes("Todos",politicaclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPoliticaClientesSeleccionados() throws Exception {
		ArrayList<PoliticaCliente> politicaclientesSeleccionados=new ArrayList<PoliticaCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPoliticaCliente();
		
		
		politicaclientesSeleccionados=this.getPoliticaClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPoliticaCliente();
		
		
		//this.generarReportePoliticaClientes("Todos",politicaclientesSeleccionados ,politicaclienteImplementable,politicaclienteImplementableHome);
	}
	
	public void mostrarImportacionPoliticaClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPoliticaCliente();
		
		this.abrirFrameImportacionPoliticaCliente();		
		
			
		//this.generarReportePoliticaClientes("Todos",politicaclientesSeleccionados ,politicaclienteImplementable,politicaclienteImplementableHome);
	}
	
	public void importarPoliticaClientes() throws Exception {		
	
	}
	
	public void exportarPoliticaClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPoliticaClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPoliticaClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPoliticaClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Politica Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPoliticaClientesSeleccionados() throws Exception {
		ArrayList<PoliticaCliente> politicaclientesSeleccionados=new ArrayList<PoliticaCliente>();		
		
		politicaclientesSeleccionados=this.getPoliticaClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicacliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPoliticaCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PoliticaCliente politicaclienteAux:politicaclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPoliticaCliente(politicaclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//politicaclienteAux.setsDetalleGeneralEntityReporte(politicaclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPoliticaCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PoliticaClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaClienteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaClienteConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaClienteConstantesFunciones.LABEL_IDCLIENTE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPoliticaCliente(PoliticaCliente politicacliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=politicacliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=politicacliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicacliente.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicacliente.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicacliente.getcliente_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPoliticaClientesSeleccionados() throws Exception {
		ArrayList<PoliticaCliente> politicaclientesSeleccionados=new ArrayList<PoliticaCliente>();		
		
		politicaclientesSeleccionados=this.getPoliticaClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicacliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PoliticaClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPoliticaCliente(row);				
				iRow++;
			}				
			
			for(PoliticaCliente politicaclienteAux:politicaclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPoliticaCliente(politicaclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPoliticaClientesSeleccionados() throws Exception {
		ArrayList<PoliticaCliente> politicaclientesSeleccionados=new ArrayList<PoliticaCliente>();		
		
		politicaclientesSeleccionados=this.getPoliticaClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicacliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("politicaclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("politicacliente");
			//elementRoot.appendChild(element);
		
			for(PoliticaCliente politicaclienteAux:politicaclientesSeleccionados) {
				element = document.createElement("politicacliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPoliticaCliente(politicaclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPoliticaCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaClienteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaClienteConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaClienteConstantesFunciones.LABEL_IDCLIENTE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPoliticaCliente(PoliticaCliente politicacliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(politicacliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(politicacliente.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(politicacliente.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(politicacliente.getcliente_descripcion());				
	}
	
	public void setFilaDatosExportarXmlPoliticaCliente(PoliticaCliente politicacliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PoliticaClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(politicacliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PoliticaClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(politicacliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PoliticaClienteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(politicacliente.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(PoliticaClienteConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(politicacliente.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(PoliticaClienteConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(politicacliente.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);
	}
	
	public void generarReporteGroupGenericoPoliticaClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PoliticaCliente> politicaclientesSeleccionados=new ArrayList<PoliticaCliente>();
		
		politicaclientesSeleccionados=this.getPoliticaClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPoliticaCliente(politicaclientesSeleccionados);
		
		this.generarReportePoliticaClientes("Todos",politicaclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPoliticaCliente(ArrayList<PoliticaCliente> politicaclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PoliticaCliente politicaclienteAux:politicaclientesSeleccionados) {
				politicaclienteAux.setsDetalleGeneralEntityReporte(politicaclienteAux.toString());
			
				if(sTipoSeleccionar.equals(PoliticaClienteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					politicaclienteAux.setsDescripcionGeneralEntityReporte1(politicaclienteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PoliticaClienteConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					politicaclienteAux.setsDescripcionGeneralEntityReporte1(politicaclienteAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PoliticaClienteConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					politicaclienteAux.setsDescripcionGeneralEntityReporte1(politicaclienteAux.getcliente_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPoliticaCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPoliticaCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente=true;
				this.isVisibilidadCeldaGuardarCambiosPoliticaCliente=true;
			}
			
			this.isVisibilidadCeldaModificarPoliticaCliente=false;
			this.isVisibilidadCeldaActualizarPoliticaCliente=false;
			this.isVisibilidadCeldaEliminarPoliticaCliente=false;
			this.isVisibilidadCeldaCancelarPoliticaCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPoliticaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaCliente=false;
			this.isVisibilidadCeldaModificarPoliticaCliente=false;
			this.isVisibilidadCeldaActualizarPoliticaCliente=true;
			this.isVisibilidadCeldaEliminarPoliticaCliente=false;
			this.isVisibilidadCeldaCancelarPoliticaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPoliticaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaCliente=false;
			this.isVisibilidadCeldaModificarPoliticaCliente=false;
			this.isVisibilidadCeldaActualizarPoliticaCliente=true;
			this.isVisibilidadCeldaEliminarPoliticaCliente=true;
			this.isVisibilidadCeldaCancelarPoliticaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPoliticaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaCliente=false;
			this.isVisibilidadCeldaModificarPoliticaCliente=false;
			this.isVisibilidadCeldaActualizarPoliticaCliente=true;
			this.isVisibilidadCeldaEliminarPoliticaCliente=false;
			this.isVisibilidadCeldaCancelarPoliticaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPoliticaCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente=true;
			this.isVisibilidadCeldaGuardarCambiosPoliticaCliente=true;
			this.isVisibilidadCeldaModificarPoliticaCliente=false;
			this.isVisibilidadCeldaActualizarPoliticaCliente=false;
			this.isVisibilidadCeldaEliminarPoliticaCliente=false;
			this.isVisibilidadCeldaCancelarPoliticaCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPoliticaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaCliente=false;
			this.isVisibilidadCeldaActualizarPoliticaCliente=false;
			this.isVisibilidadCeldaEliminarPoliticaCliente=false;
			this.isVisibilidadCeldaCancelarPoliticaCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPoliticaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaCliente=false;
			this.isVisibilidadCeldaModificarPoliticaCliente=true;
			this.isVisibilidadCeldaActualizarPoliticaCliente=false;
			this.isVisibilidadCeldaEliminarPoliticaCliente=false;
			this.isVisibilidadCeldaCancelarPoliticaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PoliticaClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPoliticaCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente=true;
			this.isVisibilidadCeldaGuardarCambiosPoliticaCliente=true;
		} else {
			this.actualizarEstadoPanelsPoliticaCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPoliticaCliente=false;
			//this.isVisibilidadCeldaVerFormPoliticaCliente=false;
			this.isVisibilidadCeldaDuplicarPoliticaCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!politicaclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoPoliticaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(politicaclienteSessionBean.getEsGuardarRelacionado()) {
			if(!politicaclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente=false;												
			}
			
			this.jButtonCerrarPoliticaCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPoliticaCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.politicacliente)) {
			this.isVisibilidadCeldaActualizarPoliticaCliente=false;
			this.isVisibilidadCeldaEliminarPoliticaCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPoliticaCliente() {
	}
	
	public void actualizarEstadoPanelsPoliticaCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPoliticaCliente!=null) {
				this.jScrollPanelDatosEdicionPoliticaCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaCliente!=null) {
				this.jTabbedPaneBusquedasPoliticaCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaCliente!=null) {
				this.jScrollPanelDatosPoliticaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionPoliticaCliente!=null) {
				this.jPanelPaginacionPoliticaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPoliticaCliente!=null) {
				this.jPanelParametrosReportesPoliticaCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPoliticaCliente!=null) {
				this.jScrollPanelDatosEdicionPoliticaCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaCliente!=null) {
				this.jTabbedPaneBusquedasPoliticaCliente.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPoliticaCliente!=null) {
				this.jScrollPanelDatosPoliticaCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionPoliticaCliente!=null) {
				this.jPanelPaginacionPoliticaCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPoliticaCliente!=null) {
				this.jPanelParametrosReportesPoliticaCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPoliticaCliente!=null) {
				this.jScrollPanelDatosEdicionPoliticaCliente.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaCliente!=null) {
				this.jTabbedPaneBusquedasPoliticaCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaCliente!=null) {
				this.jScrollPanelDatosPoliticaCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionPoliticaCliente!=null) {
				this.jPanelPaginacionPoliticaCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPoliticaCliente!=null) {
				this.jPanelParametrosReportesPoliticaCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPoliticaCliente!=null) {
				this.jScrollPanelDatosEdicionPoliticaCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaCliente!=null) {
				this.jTabbedPaneBusquedasPoliticaCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaCliente!=null) {
				this.jScrollPanelDatosPoliticaCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionPoliticaCliente!=null) {
				this.jPanelPaginacionPoliticaCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPoliticaCliente!=null) {
				this.jPanelParametrosReportesPoliticaCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPoliticaCliente!=null) {
				this.jScrollPanelDatosEdicionPoliticaCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaCliente!=null) {
				this.jTabbedPaneBusquedasPoliticaCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaCliente!=null) {
				this.jScrollPanelDatosPoliticaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionPoliticaCliente!=null) {
				this.jPanelPaginacionPoliticaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPoliticaCliente!=null) {
				this.jPanelParametrosReportesPoliticaCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPoliticaCliente!=null) {
				this.jScrollPanelDatosEdicionPoliticaCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaCliente!=null) {
				this.jTabbedPaneBusquedasPoliticaCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaCliente!=null) {
				this.jScrollPanelDatosPoliticaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionPoliticaCliente!=null) {
				this.jPanelPaginacionPoliticaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPoliticaCliente!=null) {
				this.jPanelParametrosReportesPoliticaCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPoliticaCliente!=null) {
				this.jScrollPanelDatosEdicionPoliticaCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaCliente!=null) {
				this.jTabbedPaneBusquedasPoliticaCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaCliente!=null) {
				this.jScrollPanelDatosPoliticaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionPoliticaCliente!=null) {
				this.jPanelPaginacionPoliticaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPoliticaCliente!=null) {
				this.jPanelParametrosReportesPoliticaCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPoliticaCliente!=null) {
					this.jTabbedPaneBusquedasPoliticaCliente.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPoliticaCliente!=null) {
				this.jPanelParametrosReportesPoliticaCliente.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaCliente!=null) {
				this.jTabbedPaneBusquedasPoliticaCliente.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPoliticaCliente!=null) {
				this.jPanelParametrosReportesPoliticaCliente.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasPoliticaCliente.remove(jPanelFK_IdClientePoliticaCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasPoliticaCliente.remove(jPanelFK_IdClientePoliticaCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasPoliticaCliente.remove(jPanelFK_IdClientePoliticaCliente);}
		}
		
	}
	
	
	
	

	public String registrarSesionPoliticaClienteParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(politicaclienteSessionBean==null) {
				politicaclienteSessionBean=new PoliticaClienteSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(politicaclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.politicaclienteFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(PoliticaClienteConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionPoliticaCliente(true);
			//clienteSessionBean.setlidPoliticaClienteActual(this.idPoliticaClienteActual);

			politicaclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPoliticaCliente(true);
			politicaclienteSessionBean.setlIdPoliticaClienteActualForeignKey(this.idPoliticaClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PoliticaClienteSessionBean politicaclienteSessionBean=new PoliticaClienteSessionBean();
		
		if(this.politicaclienteSessionBean==null) {
			this.politicaclienteSessionBean=new PoliticaClienteSessionBean();
		}
		
		this.politicaclienteSessionBean.setsUltimaBusquedaPoliticaCliente(this.getsAccionBusqueda());
		this.politicaclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.politicaclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			politicaclienteSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			politicaclienteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			politicaclienteSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PoliticaClienteSessionBean politicaclienteSessionBean=new PoliticaClienteSessionBean();
		
		if(this.politicaclienteSessionBean==null) {
			this.politicaclienteSessionBean=new PoliticaClienteSessionBean();
		}
		
		if(this.politicaclienteSessionBean.getsUltimaBusquedaPoliticaCliente()!=null&&!this.politicaclienteSessionBean.getsUltimaBusquedaPoliticaCliente().equals("")) {
			this.setsAccionBusqueda(politicaclienteSessionBean.getsUltimaBusquedaPoliticaCliente());
			this.setiNumeroPaginacion(politicaclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(politicaclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(politicaclienteSessionBean.getid_cliente());
				politicaclienteSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(politicaclienteSessionBean.getid_empresa());
				politicaclienteSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(politicaclienteSessionBean.getid_sucursal());
				politicaclienteSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.politicaclienteSessionBean.setsUltimaBusquedaPoliticaCliente("");
		this.politicaclienteSessionBean.setiNumeroPaginacion(PoliticaClienteConstantesFunciones.INUMEROPAGINACION);
		this.politicaclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPoliticaCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPoliticaCliente() {
		this.updateBorderResaltarBusquedasFormularioPoliticaCliente();
		this.updateVisibilidadBusquedasFormularioPoliticaCliente();
		this.updateHabilitarBusquedasFormularioPoliticaCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioPoliticaCliente() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPoliticaCliente.getComponents().length>0) {
	

		if(this.politicaclienteConstantesFunciones.resaltarFK_IdClientePoliticaCliente!=null) {
			index= this.jTabbedPaneBusquedasPoliticaCliente.indexOfComponent(this.jPanelFK_IdClientePoliticaCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaCliente.getComponent(index);
				jPanel.setBorder(this.politicaclienteConstantesFunciones.resaltarFK_IdClientePoliticaCliente);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPoliticaCliente() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPoliticaCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPoliticaCliente.indexOfComponent(this.jPanelFK_IdClientePoliticaCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.politicaclienteConstantesFunciones.mostrarFK_IdClientePoliticaCliente);
			if(!this.politicaclienteConstantesFunciones.mostrarFK_IdClientePoliticaCliente && index>-1) {
				this.jTabbedPaneBusquedasPoliticaCliente.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPoliticaCliente() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPoliticaCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPoliticaCliente.indexOfComponent(this.jPanelFK_IdClientePoliticaCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.politicaclienteConstantesFunciones.activarFK_IdClientePoliticaCliente);
				this.jTabbedPaneBusquedasPoliticaCliente.setEnabledAt(index,this.politicaclienteConstantesFunciones.activarFK_IdClientePoliticaCliente);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPoliticaCliente(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasPoliticaCliente.indexOfComponent(this.jPanelFK_IdClientePoliticaCliente);

			this.jTabbedPaneBusquedasPoliticaCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaCliente.getComponent(index);

			this.politicaclienteConstantesFunciones.setResaltarFK_IdClientePoliticaCliente(resaltar);

			jPanel.setBorder(this.politicaclienteConstantesFunciones.resaltarFK_IdClientePoliticaCliente);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPoliticaCliente.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPoliticaCliente() throws Exception {

		if(this.jInternalFrameDetalleFormPoliticaCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPoliticaCliente();
		this.updateVisibilidadResaltarControlesFormularioPoliticaCliente();
		this.updateHabilitarResaltarControlesFormularioPoliticaCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioPoliticaCliente() throws Exception {
		if(this.jInternalFrameDetalleFormPoliticaCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.politicaclienteConstantesFunciones.resaltaridPoliticaCliente!=null && this.jInternalFrameDetalleFormPoliticaCliente!=null) {this.jInternalFrameDetalleFormPoliticaCliente.jLabelidPoliticaCliente.setBorder(this.politicaclienteConstantesFunciones.resaltaridPoliticaCliente);}
		if(this.politicaclienteConstantesFunciones.resaltarid_empresaPoliticaCliente!=null && this.jInternalFrameDetalleFormPoliticaCliente!=null) {this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_empresaPoliticaCliente.setBorder(this.politicaclienteConstantesFunciones.resaltarid_empresaPoliticaCliente);}
		if(this.politicaclienteConstantesFunciones.resaltarid_sucursalPoliticaCliente!=null && this.jInternalFrameDetalleFormPoliticaCliente!=null) {this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_sucursalPoliticaCliente.setBorder(this.politicaclienteConstantesFunciones.resaltarid_sucursalPoliticaCliente);}
		if(this.politicaclienteConstantesFunciones.resaltarid_clientePoliticaCliente!=null && this.jInternalFrameDetalleFormPoliticaCliente!=null) {this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_clientePoliticaCliente.setBorder(this.politicaclienteConstantesFunciones.resaltarid_clientePoliticaCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPoliticaCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormPoliticaCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
	
		//this.jInternalFrameDetalleFormPoliticaCliente.jLabelidPoliticaCliente.setVisible(this.politicaclienteConstantesFunciones.mostraridPoliticaCliente);
		this.jInternalFrameDetalleFormPoliticaCliente.jPanelidPoliticaCliente.setVisible(this.politicaclienteConstantesFunciones.mostraridPoliticaCliente);
		//this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_empresaPoliticaCliente.setVisible(this.politicaclienteConstantesFunciones.mostrarid_empresaPoliticaCliente);
		this.jInternalFrameDetalleFormPoliticaCliente.jPanelid_empresaPoliticaCliente.setVisible(this.politicaclienteConstantesFunciones.mostrarid_empresaPoliticaCliente);
		//this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_sucursalPoliticaCliente.setVisible(this.politicaclienteConstantesFunciones.mostrarid_sucursalPoliticaCliente);
		this.jInternalFrameDetalleFormPoliticaCliente.jPanelid_sucursalPoliticaCliente.setVisible(this.politicaclienteConstantesFunciones.mostrarid_sucursalPoliticaCliente);
		//this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_clientePoliticaCliente.setVisible(this.politicaclienteConstantesFunciones.mostrarid_clientePoliticaCliente);
		this.jInternalFrameDetalleFormPoliticaCliente.jPanelid_clientePoliticaCliente.setVisible(this.politicaclienteConstantesFunciones.mostrarid_clientePoliticaCliente);
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_clientePoliticaCliente.setVisible(this.politicaclienteConstantesFunciones.mostrarid_clientePoliticaCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPoliticaCliente() throws Exception {
		if(this.jInternalFrameDetalleFormPoliticaCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPoliticaCliente!=null) {
	
		this.jInternalFrameDetalleFormPoliticaCliente.jLabelidPoliticaCliente.setEnabled(this.politicaclienteConstantesFunciones.activaridPoliticaCliente);
		this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_empresaPoliticaCliente.setEnabled(this.politicaclienteConstantesFunciones.activarid_empresaPoliticaCliente);
		this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_sucursalPoliticaCliente.setEnabled(this.politicaclienteConstantesFunciones.activarid_sucursalPoliticaCliente);
		this.jInternalFrameDetalleFormPoliticaCliente.jComboBoxid_clientePoliticaCliente.setEnabled(this.politicaclienteConstantesFunciones.activarid_clientePoliticaCliente);
			this.jInternalFrameDetalleFormPoliticaCliente.jButtonid_clientePoliticaCliente.setEnabled(this.politicaclienteConstantesFunciones.activarid_clientePoliticaCliente);
		}
	}
	
		
}