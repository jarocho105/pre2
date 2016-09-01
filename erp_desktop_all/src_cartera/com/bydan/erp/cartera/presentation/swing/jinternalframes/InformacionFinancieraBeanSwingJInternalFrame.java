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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.InformacionFinancieraConstantesFunciones;
import com.bydan.erp.cartera.util.InformacionFinancieraParameterReturnGeneral;
//import com.bydan.erp.cartera.util.InformacionFinancieraParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.InformacionFinancieraBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class InformacionFinancieraBeanSwingJInternalFrame extends InformacionFinancieraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(InformacionFinancieraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<InformacionFinanciera> informacionfinancieraValidator = new ClassValidator<InformacionFinanciera>(InformacionFinanciera.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public InformacionFinanciera informacionfinanciera;	
	public InformacionFinanciera informacionfinancieraAux;
	public InformacionFinanciera informacionfinancieraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public InformacionFinanciera informacionfinancieraTotales;
	public Long idInformacionFinancieraActual;
	public Long iIdNuevoInformacionFinanciera=0L;
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

	public String sFinalQueryComboTipoMoviFinan="";

	public List<TipoMoviFinan> tipomovifinansForeignKey;

	public List<TipoMoviFinan> gettipomovifinansForeignKey() {
		return tipomovifinansForeignKey;
	}

	public void settipomovifinansForeignKey(List<TipoMoviFinan> tipomovifinansForeignKey) {
		this.tipomovifinansForeignKey = tipomovifinansForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoMoviFinan tipomovifinanForeignKey;

	public TipoMoviFinan gettipomovifinanForeignKey() {
		return tipomovifinanForeignKey;
	}

	public void settipomovifinanForeignKey(TipoMoviFinan tipomovifinanForeignKey) {
		this.tipomovifinanForeignKey = tipomovifinanForeignKey;
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
	
	public Boolean isPermisoTodoInformacionFinanciera;
	public Boolean isPermisoNuevoInformacionFinanciera;
	public Boolean isPermisoActualizarInformacionFinanciera;
	public Boolean isPermisoActualizarOriginalInformacionFinanciera;
	public Boolean isPermisoEliminarInformacionFinanciera;
	public Boolean isPermisoGuardarCambiosInformacionFinanciera;
	public Boolean isPermisoConsultaInformacionFinanciera;
	public Boolean isPermisoBusquedaInformacionFinanciera;
	public Boolean isPermisoReporteInformacionFinanciera;
	public Boolean isPermisoPaginacionMedioInformacionFinanciera;
	public Boolean isPermisoPaginacionAltoInformacionFinanciera;
	public Boolean isPermisoPaginacionTodoInformacionFinanciera;
	public Boolean isPermisoCopiarInformacionFinanciera;
	public Boolean isPermisoVerFormInformacionFinanciera;
	public Boolean isPermisoDuplicarInformacionFinanciera;
	public Boolean isPermisoOrdenInformacionFinanciera;
	
	
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
	
	public InformacionFinancieraParameterReturnGeneral informacionfinancieraReturnGeneral;
	public InformacionFinancieraParameterReturnGeneral informacionfinancieraParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoInformacionFinanciera=false;
	public Boolean esParaAccionDesdeFormularioInformacionFinanciera=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected InformacionFinancieraSessionBeanAdditional informacionfinancieraSessionBeanAdditional=null;
	
	public InformacionFinancieraSessionBeanAdditional getInformacionFinancieraSessionBeanAdditional() {
		return this.informacionfinancieraSessionBeanAdditional;
	}
	
	public void setInformacionFinancieraSessionBeanAdditional(InformacionFinancieraSessionBeanAdditional informacionfinancieraSessionBeanAdditional) {
		try {
			this.informacionfinancieraSessionBeanAdditional=informacionfinancieraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected InformacionFinancieraBeanSwingJInternalFrameAdditional informacionfinancieraBeanSwingJInternalFrameAdditional=null;
	//public class InformacionFinancieraBeanSwingJInternalFrame
	
	public InformacionFinancieraBeanSwingJInternalFrameAdditional getInformacionFinancieraBeanSwingJInternalFrameAdditional() {
		return this.informacionfinancieraBeanSwingJInternalFrameAdditional;
	}
	
	public void setInformacionFinancieraBeanSwingJInternalFrameAdditional(InformacionFinancieraBeanSwingJInternalFrameAdditional informacionfinancieraBeanSwingJInternalFrameAdditional) {
		try {
			this.informacionfinancieraBeanSwingJInternalFrameAdditional=informacionfinancieraBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public InformacionFinancieraLogic informacionfinancieraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public InformacionFinanciera informacionfinancieraBean;
	public InformacionFinancieraConstantesFunciones informacionfinancieraConstantesFunciones;
	//public InformacionFinancieraParameterReturnGeneral informacionfinancieraReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	public TipoMoviFinanLogic tipomovifinanLogic;
	
	//PARAMETROS
	
	
	//public List<InformacionFinanciera> informacionfinancieras;	
	//public List<InformacionFinanciera> informacionfinancierasEliminados;
	//public List<InformacionFinanciera> informacionfinancierasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoInformacionFinanciera=false;
	public Boolean isVisibilidadCeldaDuplicarInformacionFinanciera=true;
	public Boolean isVisibilidadCeldaCopiarInformacionFinanciera=true;
	public Boolean isVisibilidadCeldaVerFormInformacionFinanciera=true;
	public Boolean isVisibilidadCeldaOrdenInformacionFinanciera=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesInformacionFinanciera=false;
	public Boolean isVisibilidadCeldaModificarInformacionFinanciera=false;
	public Boolean isVisibilidadCeldaActualizarInformacionFinanciera=false;
	public Boolean isVisibilidadCeldaEliminarInformacionFinanciera=false;
	public Boolean isVisibilidadCeldaCancelarInformacionFinanciera=false;
	public Boolean isVisibilidadCeldaGuardarInformacionFinanciera=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosInformacionFinanciera=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdValorClienteMovimiento=false;
	
	public Long getiIdNuevoInformacionFinanciera() {
		return this.iIdNuevoInformacionFinanciera;
	}

	public void setiIdNuevoInformacionFinanciera(Long iIdNuevoInformacionFinanciera) {
		this.iIdNuevoInformacionFinanciera = iIdNuevoInformacionFinanciera;
	}
	
	public Long getidInformacionFinancieraActual() {
		return this.idInformacionFinancieraActual;
	}

	public void setidInformacionFinancieraActual(Long idInformacionFinancieraActual) {
		this.idInformacionFinancieraActual = idInformacionFinancieraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public InformacionFinanciera getinformacionfinanciera() {
		return this.informacionfinanciera;
	}

	public void setinformacionfinanciera(InformacionFinanciera informacionfinanciera) {
		this.informacionfinanciera = informacionfinanciera;
	}
	
	public InformacionFinanciera getinformacionfinancieraAux() {
		return this.informacionfinancieraAux;
	}

	public void setinformacionfinancieraAux(InformacionFinanciera informacionfinancieraAux) {
		this.informacionfinancieraAux = informacionfinancieraAux;
	}				
	
	public InformacionFinanciera getinformacionfinancieraAnterior() {
		return this.informacionfinancieraAnterior;
	}

	public void setinformacionfinancieraAnterior(InformacionFinanciera informacionfinancieraAnterior) {
		this.informacionfinancieraAnterior = informacionfinancieraAnterior;
	}	
	
	public InformacionFinanciera getinformacionfinancieraTotales() {
		return this.informacionfinancieraTotales;
	}

	public void setinformacionfinancieraTotales(InformacionFinanciera informacionfinancieraTotales) {
		this.informacionfinancieraTotales = informacionfinancieraTotales;
	}	
	
	public InformacionFinanciera getinformacionfinancieraBean() {
		return this.informacionfinancieraBean;
	}

	public void setinformacionfinancieraBean(InformacionFinanciera informacionfinancieraBean) {
		this.informacionfinancieraBean = informacionfinancieraBean;
	}	
	
	public InformacionFinancieraParameterReturnGeneral getinformacionfinancieraReturnGeneral() {
		return this.informacionfinancieraReturnGeneral;
	}

	public void setinformacionfinancieraReturnGeneral(InformacionFinancieraParameterReturnGeneral informacionfinancieraReturnGeneral) {
		this.informacionfinancieraReturnGeneral = informacionfinancieraReturnGeneral;
	}	
	
	
	public Long idclienteFK_IdCliente=-1L;

	public Long getidclienteFK_IdCliente() {
		return this.idclienteFK_IdCliente;
	}

	public void setidclienteFK_IdCliente(Long idclienteFK_IdCliente) {
		this.idclienteFK_IdCliente = idclienteFK_IdCliente;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long idvalorclientemovimientoFK_IdValorClienteMovimiento=-1L;

	public Long getidvalorclientemovimientoFK_IdValorClienteMovimiento() {
		return this.idvalorclientemovimientoFK_IdValorClienteMovimiento;
	}

	public void setidvalorclientemovimientoFK_IdValorClienteMovimiento(Long idvalorclientemovimientoFK_IdValorClienteMovimiento) {
		this.idvalorclientemovimientoFK_IdValorClienteMovimiento = idvalorclientemovimientoFK_IdValorClienteMovimiento;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public InformacionFinancieraLogic getInformacionFinancieraLogic()	{		
		return informacionfinancieraLogic;
	}

	public void setInformacionFinancieraLogic(InformacionFinancieraLogic informacionfinancieraLogic) {
		this.informacionfinancieraLogic = informacionfinancieraLogic;
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
	
	public Boolean getIsEsNuevoInformacionFinanciera() {
		return isEsNuevoInformacionFinanciera;
	}

	public void setIsEsNuevoInformacionFinanciera(Boolean isEsNuevoInformacionFinanciera) {
		this.isEsNuevoInformacionFinanciera = isEsNuevoInformacionFinanciera;
	}

	public Boolean getEsParaAccionDesdeFormularioInformacionFinanciera() {
		return esParaAccionDesdeFormularioInformacionFinanciera;
	}
	
	public void setEsParaAccionDesdeFormularioInformacionFinanciera(Boolean esParaAccionDesdeFormularioInformacionFinanciera) {
		this.esParaAccionDesdeFormularioInformacionFinanciera = esParaAccionDesdeFormularioInformacionFinanciera;
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

			if(this.informacionfinancieraSessionBean==null) {
				this.informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
			}

			if(!this.informacionfinancieraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(informacionfinancieraSessionBean.getlidEmpresaActual());
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

			if(this.informacionfinancieraSessionBean==null) {
				this.informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
			}

			if(!this.informacionfinancieraSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(informacionfinancieraSessionBean.getlidClienteActual());
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

	public void cargarCombosTipoMoviFinansForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipomovifinansForeignKey=new ArrayList<TipoMoviFinan>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoMoviFinanLogic tipomovifinanLogic=new TipoMoviFinanLogic();

			//tipomovifinanLogic.getTipoMoviFinanDataAccess().setIsForForeingKeyData(true);

			if(this.informacionfinancieraSessionBean==null) {
				this.informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
			}

			if(!this.informacionfinancieraSessionBean.getisBusquedaDesdeForeignKeySesionTipoMoviFinan()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipomovifinanLogic.getTipoMoviFinanDataAccess().setIsForForeingKeyData(true);

					tipomovifinanLogic.getTodosTipoMoviFinansWithConnection(sFinalQuery,new Pagination());

					this.tipomovifinansForeignKey=tipomovifinanLogic.getTipoMoviFinans();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoMoviFinan(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovifinanLogic.getEntityWithConnection(informacionfinancieraSessionBean.getlidTipoMoviFinanActual());
					this.tipomovifinansForeignKey.add(tipomovifinanLogic.getTipoMoviFinan());
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

					if(this.informacionfinanciera!=null) {
						this.informacionfinanciera.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
						this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxid_empresaInformacionFinanciera.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaInformacionFinanciera.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
						if(this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxid_empresaInformacionFinanciera.getItemCount()>0) {
							this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxid_empresaInformacionFinanciera.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaInformacionFinancieraGenerico)throws Exception
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
				jComboBoxid_empresaInformacionFinancieraGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaInformacionFinancieraGenerico!=null && jComboBoxid_empresaInformacionFinancieraGenerico.getItemCount()>0) {
					jComboBoxid_empresaInformacionFinancieraGenerico.setSelectedIndex(0);
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

					if(this.informacionfinanciera!=null) {
						this.informacionfinanciera.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
						this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidclienteInformacionFinanciera.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxidclienteInformacionFinanciera.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
						if(this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidclienteInformacionFinanciera.getItemCount()>0) {
							this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidclienteInformacionFinanciera.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxidclienteFK_IdClienteInformacionFinanciera!=null) {
						jComboBoxidclienteFK_IdClienteInformacionFinanciera.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxidclienteFK_IdClienteInformacionFinanciera!=null) {
							//jComboBoxidclienteFK_IdClienteInformacionFinanciera.setSelectedItem(clienteTemp);
							if(jComboBoxidclienteFK_IdClienteInformacionFinanciera.getItemCount()>0) {
								jComboBoxidclienteFK_IdClienteInformacionFinanciera.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxidclienteInformacionFinancieraGenerico)throws Exception
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
				jComboBoxidclienteInformacionFinancieraGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxidclienteInformacionFinancieraGenerico!=null && jComboBoxidclienteInformacionFinancieraGenerico.getItemCount()>0) {
					jComboBoxidclienteInformacionFinancieraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoMoviFinanForeignKey(Long idTipoMoviFinanSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoMoviFinan  tipomovifinanTemp=null;

			for(TipoMoviFinan tipomovifinanAux:tipomovifinansForeignKey) {
				if(tipomovifinanAux.getId()!=null && tipomovifinanAux.getId().equals(idTipoMoviFinanSeleccionado)) {
					tipomovifinanTemp=tipomovifinanAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipomovifinanTemp!=null) {

					if(this.informacionfinanciera!=null) {
						this.informacionfinanciera.setTipoMoviFinan(tipomovifinanTemp);
					}

					if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
						this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidvalorclientemovimientoInformacionFinanciera.setSelectedItem(tipomovifinanTemp);
					}
				} else {
					//jComboBoxidvalorclientemovimientoInformacionFinanciera.setSelectedItem(tipomovifinanTemp);
					if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
						if(this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidvalorclientemovimientoInformacionFinanciera.getItemCount()>0) {
							this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidvalorclientemovimientoInformacionFinanciera.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdValorClienteMovimiento") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomovifinanTemp!=null && jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera!=null) {
						jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.setSelectedItem(tipomovifinanTemp);
					} else {
						if(jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera!=null) {
							//jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.setSelectedItem(tipomovifinanTemp);
							if(jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.getItemCount()>0) {
								jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.setSelectedIndex(0);
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

	public String getActualTipoMoviFinanForeignKeyDescripcion(Long idTipoMoviFinanSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoMoviFinan  tipomovifinanTemp=null;

			for(TipoMoviFinan tipomovifinanAux:tipomovifinansForeignKey) {
				if(tipomovifinanAux.getId()!=null && tipomovifinanAux.getId().equals(idTipoMoviFinanSeleccionado)) {
					tipomovifinanTemp=tipomovifinanAux;
					break;
				}
			}


			sDescripcion=TipoMoviFinanConstantesFunciones.getTipoMoviFinanDescripcion(tipomovifinanTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoMoviFinanForeignKeyGenerico(Long idTipoMoviFinanSeleccionado,JComboBox jComboBoxidvalorclientemovimientoInformacionFinancieraGenerico)throws Exception
	{
		try
		{
			TipoMoviFinan  tipomovifinanTemp=null;

			for(TipoMoviFinan tipomovifinanAux:tipomovifinansForeignKey) {
				if(tipomovifinanAux.getId()!=null && tipomovifinanAux.getId().equals(idTipoMoviFinanSeleccionado)) {
					tipomovifinanTemp=tipomovifinanAux;
					break;
				}
			}

			if(tipomovifinanTemp!=null) {
				jComboBoxidvalorclientemovimientoInformacionFinancieraGenerico.setSelectedItem(tipomovifinanTemp);
			} else {
				if(jComboBoxidvalorclientemovimientoInformacionFinancieraGenerico!=null && jComboBoxidvalorclientemovimientoInformacionFinancieraGenerico.getItemCount()>0) {
					jComboBoxidvalorclientemovimientoInformacionFinancieraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(InformacionFinanciera informacionfinanciera,JComboBox jComboBoxid_empresaInformacionFinancieraGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaInformacionFinancieraGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxid_empresaInformacionFinanciera.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaInformacionFinancieraGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				informacionfinanciera.setid_empresa(empresaAux.getId());
				informacionfinanciera.setempresa_descripcion(InformacionFinancieraConstantesFunciones.getEmpresaDescripcion(empresaAux));
				informacionfinanciera.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(InformacionFinanciera informacionfinanciera,JComboBox jComboBoxidclienteInformacionFinancieraGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxidclienteInformacionFinancieraGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidclienteInformacionFinanciera.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxidclienteInformacionFinancieraGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				informacionfinanciera.setidcliente(clienteAux.getId());
				informacionfinanciera.setcliente_descripcion(InformacionFinancieraConstantesFunciones.getClienteDescripcion(clienteAux));
				informacionfinanciera.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMoviFinanForeignKey(InformacionFinanciera informacionfinanciera,JComboBox jComboBoxidvalorclientemovimientoInformacionFinancieraGenerico)throws Exception
	{
		try
		{
			TipoMoviFinan  tipomovifinanAux=new TipoMoviFinan();

			if(jComboBoxidvalorclientemovimientoInformacionFinancieraGenerico==null) {
				tipomovifinanAux=(TipoMoviFinan)this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidvalorclientemovimientoInformacionFinanciera.getSelectedItem();
			} else {
				tipomovifinanAux=(TipoMoviFinan)jComboBoxidvalorclientemovimientoInformacionFinancieraGenerico.getSelectedItem();
			}

			if(tipomovifinanAux!=null && tipomovifinanAux.getId()!=null) {
				informacionfinanciera.setidvalorclientemovimiento(tipomovifinanAux.getId());
				informacionfinanciera.settipomovifinan_descripcion(InformacionFinancieraConstantesFunciones.getTipoMoviFinanDescripcion(tipomovifinanAux));
				informacionfinanciera.setTipoMoviFinan(tipomovifinanAux);			}
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

					if(!InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { 
							this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxid_empresaInformacionFinanciera.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxid_empresaInformacionFinanciera.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { 
					}

					if(!InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
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

					if(!InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { 
							this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidclienteInformacionFinanciera.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidclienteInformacionFinanciera.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { 
					}

					if(!InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidclienteFK_IdClienteInformacionFinanciera.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxidclienteFK_IdClienteInformacionFinanciera.addItem(cliente);
							}
						}

						if(!InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoMoviFinansForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoMoviFinan=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { 
							this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidvalorclientemovimientoInformacionFinanciera.removeAllItems();

							for(TipoMoviFinan tipomovifinan:this.tipomovifinansForeignKey) {
								this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidvalorclientemovimientoInformacionFinanciera.addItem(tipomovifinan);
							}
						}
					}

					if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { 
					}

					if(!InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdValorClienteMovimiento") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.removeAllItems();

							for(TipoMoviFinan tipomovifinan:this.tipomovifinansForeignKey) {
								this.jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.addItem(tipomovifinan);
							}
						}

						if(!InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
							this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxid_empresaInformacionFinanciera.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
							this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxid_empresaInformacionFinanciera.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
							this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidclienteInformacionFinanciera.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
							this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidclienteInformacionFinanciera.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidclienteFK_IdClienteInformacionFinanciera.setSelectedItem(cliente);
						} else {
							this.jComboBoxidclienteFK_IdClienteInformacionFinanciera.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoMoviFinanForeignKey(TipoMoviFinan tipomovifinan,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
							this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidvalorclientemovimientoInformacionFinanciera.setSelectedItem(tipomovifinan);
						}
					} else {
						if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
							this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidvalorclientemovimientoInformacionFinanciera.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.setSelectedItem(tipomovifinan);
						} else {
							this.jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesInformacionFinanciera() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			InformacionFinancieraConstantesFunciones.refrescarForeignKeysDescripcionesInformacionFinanciera(this.informacionfinancieraLogic.getInformacionFinancieras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			InformacionFinancieraConstantesFunciones.refrescarForeignKeysDescripcionesInformacionFinanciera(this.informacionfinancieras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoMoviFinan.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//informacionfinancieraLogic.setInformacionFinancieras(this.informacionfinancieras);
			informacionfinancieraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public InformacionFinancieraParameterReturnGeneral getInformacionFinancieraParameterGeneral() {
		return this.informacionfinancieraParameterGeneral;
	}
	
	public void setInformacionFinancieraParameterGeneral(InformacionFinancieraParameterReturnGeneral informacionfinancieraParameterGeneral) {
		this.informacionfinancieraParameterGeneral = informacionfinancieraParameterGeneral;
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
	
	public Boolean getIsPermisoTodoInformacionFinanciera() {
		return isPermisoTodoInformacionFinanciera;
	}

	public void setIsPermisoTodoInformacionFinanciera(Boolean isPermisoTodoInformacionFinanciera) {
		this.isPermisoTodoInformacionFinanciera = isPermisoTodoInformacionFinanciera;
	}

	public Boolean getIsPermisoNuevoInformacionFinanciera() {
		return isPermisoNuevoInformacionFinanciera;
	}

	public void setIsPermisoNuevoInformacionFinanciera(Boolean isPermisoNuevoInformacionFinanciera) {
		this.isPermisoNuevoInformacionFinanciera = isPermisoNuevoInformacionFinanciera;
	}

	public Boolean getIsPermisoActualizarInformacionFinanciera() {
		return isPermisoActualizarInformacionFinanciera;
	}

	public void setIsPermisoActualizarInformacionFinanciera(Boolean isPermisoActualizarInformacionFinanciera) {
		this.isPermisoActualizarInformacionFinanciera = isPermisoActualizarInformacionFinanciera;
	}

	public Boolean getIsPermisoEliminarInformacionFinanciera() {
		return isPermisoEliminarInformacionFinanciera;
	}

	public void setIsPermisoEliminarInformacionFinanciera(Boolean isPermisoEliminarInformacionFinanciera) {
		this.isPermisoEliminarInformacionFinanciera = isPermisoEliminarInformacionFinanciera;
	}

	public Boolean getIsPermisoGuardarCambiosInformacionFinanciera() {
		return isPermisoGuardarCambiosInformacionFinanciera;
	}

	public void setIsPermisoGuardarCambiosInformacionFinanciera(Boolean isPermisoGuardarCambiosInformacionFinanciera) {
		this.isPermisoGuardarCambiosInformacionFinanciera = isPermisoGuardarCambiosInformacionFinanciera;
	}
	
	public Boolean getIsPermisoConsultaInformacionFinanciera() {
		return isPermisoConsultaInformacionFinanciera;
	}

	public void setIsPermisoConsultaInformacionFinanciera(Boolean isPermisoConsultaInformacionFinanciera) {
		this.isPermisoConsultaInformacionFinanciera = isPermisoConsultaInformacionFinanciera;
	}

	public Boolean getIsPermisoBusquedaInformacionFinanciera() {
		return isPermisoBusquedaInformacionFinanciera;
	}

	public void setIsPermisoBusquedaInformacionFinanciera(Boolean isPermisoBusquedaInformacionFinanciera) {
		this.isPermisoBusquedaInformacionFinanciera = isPermisoBusquedaInformacionFinanciera;
	}

	public Boolean getIsPermisoReporteInformacionFinanciera() {
		return isPermisoReporteInformacionFinanciera;
	}

	public void setIsPermisoReporteInformacionFinanciera(Boolean isPermisoReporteInformacionFinanciera) {
		this.isPermisoReporteInformacionFinanciera = isPermisoReporteInformacionFinanciera;
	}
	
	public Boolean getIsPermisoPaginacionMedioInformacionFinanciera() {
		return isPermisoPaginacionMedioInformacionFinanciera;
	}

	public void setIsPermisoPaginacionMedioInformacionFinanciera(Boolean isPermisoPaginacionMedioInformacionFinanciera) {
		this.isPermisoPaginacionMedioInformacionFinanciera = isPermisoPaginacionMedioInformacionFinanciera;
	}
	
	public Boolean getIsPermisoPaginacionTodoInformacionFinanciera() {
		return isPermisoPaginacionTodoInformacionFinanciera;
	}

	public void setIsPermisoPaginacionTodoInformacionFinanciera(Boolean isPermisoPaginacionTodoInformacionFinanciera) {
		this.isPermisoPaginacionTodoInformacionFinanciera = isPermisoPaginacionTodoInformacionFinanciera;
	}
	
	public Boolean getIsPermisoPaginacionAltoInformacionFinanciera() {
		return isPermisoPaginacionAltoInformacionFinanciera;
	}

	public void setIsPermisoPaginacionAltoInformacionFinanciera(Boolean isPermisoPaginacionAltoInformacionFinanciera) {
		this.isPermisoPaginacionAltoInformacionFinanciera = isPermisoPaginacionAltoInformacionFinanciera;
	}
	
	public Boolean getIsPermisoCopiarInformacionFinanciera() {
		return isPermisoCopiarInformacionFinanciera;
	}

	public void setIsPermisoCopiarInformacionFinanciera(Boolean isPermisoCopiarInformacionFinanciera) {
		this.isPermisoCopiarInformacionFinanciera = isPermisoCopiarInformacionFinanciera;
	}
	
	public Boolean getIsPermisoVerFormInformacionFinanciera() {
		return isPermisoVerFormInformacionFinanciera;
	}

	public void setIsPermisoVerFormInformacionFinanciera(Boolean isPermisoVerFormInformacionFinanciera) {
		this.isPermisoVerFormInformacionFinanciera = isPermisoVerFormInformacionFinanciera;
	}
	
	public Boolean getIsPermisoDuplicarInformacionFinanciera() {
		return isPermisoDuplicarInformacionFinanciera;
	}

	public void setIsPermisoDuplicarInformacionFinanciera(Boolean isPermisoDuplicarInformacionFinanciera) {
		this.isPermisoDuplicarInformacionFinanciera = isPermisoDuplicarInformacionFinanciera;
	}
	
	public Boolean getIsPermisoOrdenInformacionFinanciera() {
		return isPermisoOrdenInformacionFinanciera;
	}

	public void setIsPermisoOrdenInformacionFinanciera(Boolean isPermisoOrdenInformacionFinanciera) {
		this.isPermisoOrdenInformacionFinanciera = isPermisoOrdenInformacionFinanciera;
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
	
	public Boolean getIsVisibilidadCeldaNuevoInformacionFinanciera() {
		return isVisibilidadCeldaNuevoInformacionFinanciera;
	}

	public void setIsVisibilidadCeldaNuevoInformacionFinanciera(Boolean isVisibilidadCeldaNuevoInformacionFinanciera) {
		this.isVisibilidadCeldaNuevoInformacionFinanciera = isVisibilidadCeldaNuevoInformacionFinanciera;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarInformacionFinanciera() {
		return isVisibilidadCeldaDuplicarInformacionFinanciera;
	}

	public void setIsVisibilidadCeldaDuplicarInformacionFinanciera(Boolean isVisibilidadCeldaDuplicarInformacionFinanciera) {
		this.isVisibilidadCeldaDuplicarInformacionFinanciera = isVisibilidadCeldaDuplicarInformacionFinanciera;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarInformacionFinanciera() {
		return isVisibilidadCeldaCopiarInformacionFinanciera;
	}

	public void setIsVisibilidadCeldaCopiarInformacionFinanciera(Boolean isVisibilidadCeldaCopiarInformacionFinanciera) {
		this.isVisibilidadCeldaCopiarInformacionFinanciera = isVisibilidadCeldaCopiarInformacionFinanciera;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormInformacionFinanciera() {
		return isVisibilidadCeldaVerFormInformacionFinanciera;
	}

	public void setIsVisibilidadCeldaVerFormInformacionFinanciera(Boolean isVisibilidadCeldaVerFormInformacionFinanciera) {
		this.isVisibilidadCeldaVerFormInformacionFinanciera = isVisibilidadCeldaVerFormInformacionFinanciera;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenInformacionFinanciera() {
		return isVisibilidadCeldaOrdenInformacionFinanciera;
	}

	public void setIsVisibilidadCeldaOrdenInformacionFinanciera(Boolean isVisibilidadCeldaOrdenInformacionFinanciera) {
		this.isVisibilidadCeldaOrdenInformacionFinanciera = isVisibilidadCeldaOrdenInformacionFinanciera;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesInformacionFinanciera() {
		return isVisibilidadCeldaNuevoRelacionesInformacionFinanciera;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesInformacionFinanciera(Boolean isVisibilidadCeldaNuevoRelacionesInformacionFinanciera) {
		this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera = isVisibilidadCeldaNuevoRelacionesInformacionFinanciera;
	}
	
	public Boolean getIsVisibilidadCeldaModificarInformacionFinanciera() {
		return isVisibilidadCeldaModificarInformacionFinanciera;
	}

	public void setIsVisibilidadCeldaModificarInformacionFinanciera(Boolean isVisibilidadCeldaModificarInformacionFinanciera) {
		this.isVisibilidadCeldaModificarInformacionFinanciera = isVisibilidadCeldaModificarInformacionFinanciera;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarInformacionFinanciera() {
		return isVisibilidadCeldaActualizarInformacionFinanciera;
	}

	public void setIsVisibilidadCeldaActualizarInformacionFinanciera(Boolean isVisibilidadCeldaActualizarInformacionFinanciera) {
		this.isVisibilidadCeldaActualizarInformacionFinanciera = isVisibilidadCeldaActualizarInformacionFinanciera;
	}

	public Boolean getIsVisibilidadCeldaEliminarInformacionFinanciera() {
		return isVisibilidadCeldaEliminarInformacionFinanciera;
	}

	public void setIsVisibilidadCeldaEliminarInformacionFinanciera(Boolean isVisibilidadCeldaEliminarInformacionFinanciera) {
		this.isVisibilidadCeldaEliminarInformacionFinanciera = isVisibilidadCeldaEliminarInformacionFinanciera;
	}

	public Boolean getIsVisibilidadCeldaCancelarInformacionFinanciera() {
		return isVisibilidadCeldaCancelarInformacionFinanciera;
	}

	public void setIsVisibilidadCeldaCancelarInformacionFinanciera(Boolean isVisibilidadCeldaCancelarInformacionFinanciera) {
		this.isVisibilidadCeldaCancelarInformacionFinanciera = isVisibilidadCeldaCancelarInformacionFinanciera;
	}

	public Boolean getIsVisibilidadCeldaGuardarInformacionFinanciera() {
		return isVisibilidadCeldaGuardarInformacionFinanciera;
	}

	public void setIsVisibilidadCeldaGuardarInformacionFinanciera(Boolean isVisibilidadCeldaGuardarInformacionFinanciera) {
		this.isVisibilidadCeldaGuardarInformacionFinanciera = isVisibilidadCeldaGuardarInformacionFinanciera;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosInformacionFinanciera() {
		return isVisibilidadCeldaGuardarCambiosInformacionFinanciera;
	}

	public void setIsVisibilidadCeldaGuardarCambiosInformacionFinanciera(Boolean isVisibilidadCeldaGuardarCambiosInformacionFinanciera) {
		this.isVisibilidadCeldaGuardarCambiosInformacionFinanciera = isVisibilidadCeldaGuardarCambiosInformacionFinanciera;
	}
		
	public InformacionFinancieraSessionBean getinformacionfinancieraSessionBean() {
		return this.informacionfinancieraSessionBean;
	}
	
	public void setinformacionfinancieraSessionBean(InformacionFinancieraSessionBean informacionfinancieraSessionBean) {
		this.informacionfinancieraSessionBean=informacionfinancieraSessionBean;
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

	public Boolean getisVisibilidadFK_IdValorClienteMovimiento() {
		return this.isVisibilidadFK_IdValorClienteMovimiento;
	}

	public void setisVisibilidadFK_IdValorClienteMovimiento(Boolean isVisibilidadFK_IdValorClienteMovimiento) {
		this.isVisibilidadFK_IdValorClienteMovimiento=isVisibilidadFK_IdValorClienteMovimiento;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(InformacionFinanciera informacionfinanciera)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(informacionfinanciera,null);
				this.setActualParaGuardarClienteForeignKey(informacionfinanciera,null);
				this.setActualParaGuardarTipoMoviFinanForeignKey(informacionfinanciera,null);
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
	
	public void bugActualizarReferenciaActual(InformacionFinanciera informacionfinanciera,InformacionFinanciera informacionfinancieraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalInformacionFinanciera(informacionfinanciera);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		informacionfinancieraAux.setId(informacionfinanciera.getId());
		informacionfinancieraAux.setVersionRow(informacionfinanciera.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessInformacionFinanciera();
		
			int intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.informacionfinanciera,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = informacionfinancieraValidator.getInvalidValues(this.informacionfinanciera);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			informacionfinancieraLogic.setDatosCliente(datosCliente);
			informacionfinancieraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				informacionfinancieraAux=new  InformacionFinanciera();
				
				informacionfinancieraAux.setIsNew(true);
				informacionfinancieraAux.setIsChanged(true);
				
				informacionfinancieraAux.setInformacionFinancieraOriginal(this.informacionfinanciera);
				
				informacionfinancieraAux.setId(this.informacionfinanciera.getId());	
				informacionfinancieraAux.setVersionRow(this.informacionfinanciera.getVersionRow());	
				informacionfinancieraAux.setid_empresa(this.informacionfinanciera.getid_empresa());	
				informacionfinancieraAux.setidcliente(this.informacionfinanciera.getidcliente());	
				informacionfinancieraAux.setidvalorclientemovimiento(this.informacionfinanciera.getidvalorclientemovimiento());	
				informacionfinancieraAux.setvalor(this.informacionfinanciera.getvalor());	
				informacionfinancieraAux.setdescripcion(this.informacionfinanciera.getdescripcion());	
				informacionfinancieraAux.setesactivo(this.informacionfinanciera.getesactivo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.informacionfinancieraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.informacionfinancieraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(informacionfinancieraAux,informacionfinancieraLogic.getInformacionFinancieras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(informacionfinancieraAux,informacionfinancieras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.informacionfinancieraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.informacionfinancieraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionfinancieraLogic.saveInformacionFinancieras();//WithConnection
						//informacionfinancieraLogic.getSetVersionRowInformacionFinancieras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.informacionfinanciera,informacionfinancieraAux);
					
					this.refrescarForeignKeysDescripcionesInformacionFinanciera();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.informacionfinancieraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								informacionfinancieraLogic.saveInformacionFinancieraRelaciones(informacionfinancieraAux);//WithConnection
								//informacionfinancieraLogic.getSetVersionRowInformacionFinancieras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.informacionfinanciera,informacionfinancieraAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.informacionfinancieraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.informacionfinancieraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(informacionfinancieraAux,informacionfinancieraLogic.getInformacionFinancieras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(informacionfinancieraAux,informacionfinancieras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.informacionfinanciera,informacionfinancieraAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				informacionfinancieraAux=new  InformacionFinanciera();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado() 
					|| (this.informacionfinancieraSessionBean.getEsGuardarRelacionado() && this.informacionfinanciera.getId()>=0)) {
						
					informacionfinancieraAux.setIsNew(false);
				}
				
				informacionfinancieraAux.setIsDeleted(false);
			
				informacionfinancieraAux.setId(this.informacionfinanciera.getId());	
				informacionfinancieraAux.setVersionRow(this.informacionfinanciera.getVersionRow());	
				informacionfinancieraAux.setid_empresa(this.informacionfinanciera.getid_empresa());	
				informacionfinancieraAux.setidcliente(this.informacionfinanciera.getidcliente());	
				informacionfinancieraAux.setidvalorclientemovimiento(this.informacionfinanciera.getidvalorclientemovimiento());	
				informacionfinancieraAux.setvalor(this.informacionfinanciera.getvalor());	
				informacionfinancieraAux.setdescripcion(this.informacionfinanciera.getdescripcion());	
				informacionfinancieraAux.setesactivo(this.informacionfinanciera.getesactivo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(informacionfinancieraAux,informacionfinancieraLogic.getInformacionFinancieras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(informacionfinancieraAux,informacionfinancieras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.informacionfinancieraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.informacionfinancieraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionfinancieraLogic.saveInformacionFinancieras();//WithConnection
						//informacionfinancieraLogic.getSetVersionRowInformacionFinancieras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.informacionfinanciera,informacionfinancieraAux);
					
					this.refrescarForeignKeysDescripcionesInformacionFinanciera();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.informacionfinancieraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								informacionfinancieraLogic.saveInformacionFinancieraRelaciones(informacionfinancieraAux);//WithConnection
								//informacionfinancieraLogic.getSetVersionRowInformacionFinancieras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.informacionfinanciera,informacionfinancieraAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.informacionfinancieraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.informacionfinancieraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(informacionfinancieraAux,informacionfinancieraLogic.getInformacionFinancieras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(informacionfinancieraAux,informacionfinancieras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.informacionfinanciera,informacionfinancieraAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				informacionfinancieraAux=new  InformacionFinanciera();
				
				informacionfinancieraAux.setIsNew(false);
				informacionfinancieraAux.setIsChanged(false);
				
				informacionfinancieraAux.setIsDeleted(true);
				
				informacionfinancieraAux.setId(this.informacionfinanciera.getId());	
				informacionfinancieraAux.setVersionRow(this.informacionfinanciera.getVersionRow());	
				informacionfinancieraAux.setid_empresa(this.informacionfinanciera.getid_empresa());	
				informacionfinancieraAux.setidcliente(this.informacionfinanciera.getidcliente());	
				informacionfinancieraAux.setidvalorclientemovimiento(this.informacionfinanciera.getidvalorclientemovimiento());	
				informacionfinancieraAux.setvalor(this.informacionfinanciera.getvalor());	
				informacionfinancieraAux.setdescripcion(this.informacionfinanciera.getdescripcion());	
				informacionfinancieraAux.setesactivo(this.informacionfinanciera.getesactivo());	
				
				if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.informacionfinancieraAux.getId()>=0) {	
						this.informacionfinancierasEliminados.add(informacionfinancieraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(informacionfinancieraAux,informacionfinancieraLogic.getInformacionFinancieras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(informacionfinancieraAux,informacionfinancieras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.informacionfinancieraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.informacionfinancieraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionfinancieraLogic.saveInformacionFinancieras();//WithConnection
						//informacionfinancieraLogic.getSetVersionRowInformacionFinancieras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.informacionfinancieraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								informacionfinancieraLogic.saveInformacionFinancieraRelaciones(informacionfinancieraAux);//WithConnection
								//informacionfinancieraLogic.getSetVersionRowInformacionFinancieras();//WithConnection
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
							if(this.informacionfinancieraSessionBean.getEstaModoGuardarRelaciones() 
								|| this.informacionfinancieraSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(informacionfinancieraAux,informacionfinancieraLogic.getInformacionFinancieras());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(informacionfinancieraAux,informacionfinancieras);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.getInformacionFinancieras().addAll(this.informacionfinancierasEliminados);
					
					informacionfinancieraLogic.saveInformacionFinancieras();//WithConnection
					//informacionfinancieraLogic.getSetVersionRowInformacionFinancieras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesInformacionFinanciera();
				
				this.informacionfinancierasEliminados= new ArrayList<InformacionFinanciera>();		
			}
			
			if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Informacion Financiera GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Informacion Financiera",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.informacionfinanciera=informacionfinancieraAux;
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
      		//this.finishProcessInformacionFinanciera();
      	}
		
	}	
	
	public void actualizarRelaciones(InformacionFinanciera informacionfinancieraLocal) throws Exception {
		
		if(this.informacionfinancieraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(InformacionFinanciera informacionfinancieraLocal) throws Exception {	
		if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				informacionfinancieraLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				informacionfinancieraLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMoviFinanDetalleFormJInternalFrame.class)) {
				TipoMoviFinanBeanSwingJInternalFrame tipomovifinanBeanSwingJInternalFrameLocal=(TipoMoviFinanBeanSwingJInternalFrame) ((TipoMoviFinanDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomovifinanBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMoviFinan(tipomovifinanBeanSwingJInternalFrameLocal.gettipomovifinan(),true);
				tipomovifinanBeanSwingJInternalFrameLocal.actualizarLista(tipomovifinanBeanSwingJInternalFrameLocal.tipomovifinan,this.tipomovifinansForeignKey);

				tipomovifinanBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomovifinanBeanSwingJInternalFrameLocal.tipomovifinan);

				informacionfinancieraLocal.setTipoMoviFinan(tipomovifinanBeanSwingJInternalFrameLocal.tipomovifinan);

				this.addItemDefectoCombosForeignKeyTipoMoviFinan();
				this.cargarCombosFrameTipoMoviFinansForeignKey("Formulario");
				this.setActualTipoMoviFinanForeignKey(tipomovifinanBeanSwingJInternalFrameLocal.tipomovifinan.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarInformacionFinancieraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = informacionfinancieraValidator.getInvalidValues(this.informacionfinanciera);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(InformacionFinanciera informacionfinanciera,List<InformacionFinanciera> informacionfinancieras) throws Exception {
		try	{		
			InformacionFinancieraConstantesFunciones.actualizarLista(informacionfinanciera,informacionfinancieras,this.informacionfinancieraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(InformacionFinanciera informacionfinanciera,List<InformacionFinanciera> informacionfinancieras) throws Exception {
		try	{			
			InformacionFinancieraConstantesFunciones.actualizarSelectedLista(informacionfinanciera,informacionfinancieras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<InformacionFinanciera> informacionfinancierasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				informacionfinancierasLocal=this.informacionfinancieraLogic.getInformacionFinancieras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				informacionfinancierasLocal=this.informacionfinancieras;
			}
			//ARCHITECTURE
		
			for(InformacionFinanciera informacionfinancieraLocal:informacionfinancierasLocal) {
				if(this.permiteMantenimiento(informacionfinancieraLocal) && informacionfinancieraLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+InformacionFinancieraConstantesFunciones.getInformacionFinancieraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(InformacionFinancieraConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionFinanciera.jLabelid_empresaInformacionFinanciera,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionFinancieraConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionFinanciera.jLabelidclienteInformacionFinanciera,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionFinancieraConstantesFunciones.IDTIPOMOVIFINAN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionFinanciera.jLabelidvalorclientemovimientoInformacionFinanciera,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionFinancieraConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionFinanciera.jLabelvalorInformacionFinanciera,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionFinancieraConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionFinanciera.jLabeldescripcionInformacionFinanciera,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionFinancieraConstantesFunciones.ESACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionFinanciera.jLabelesactivoInformacionFinanciera,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionFinanciera.jLabelid_empresaInformacionFinanciera,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionFinanciera.jLabelidclienteInformacionFinanciera,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionFinanciera.jLabelidvalorclientemovimientoInformacionFinanciera,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionFinanciera.jLabelvalorInformacionFinanciera,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionFinanciera.jLabeldescripcionInformacionFinanciera,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionFinanciera.jLabelesactivoInformacionFinanciera,"");
		
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
		this.iIdNuevoInformacionFinanciera--;	
		
		
		this.informacionfinancieraAux=new InformacionFinanciera();
		
		this.informacionfinancieraAux.setId(this.iIdNuevoInformacionFinanciera);
		this.informacionfinancieraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.informacionfinancieraLogic.getInformacionFinancieras().add(this.informacionfinancieraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.informacionfinancieras.add(this.informacionfinancieraAux);
		}
		//ARCHITECTURE
		
		this.informacionfinanciera=this.informacionfinancieraAux;
		
		if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioInformacionFinanciera(this.informacionfinanciera);
			this.setVariablesObjetoActualToFormularioForeignKeyInformacionFinanciera(this.informacionfinanciera);
		}
				
		//this.setDefaultControlesInformacionFinanciera();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyInformacionFinanciera();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyInformacionFinanciera();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyInformacionFinanciera();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualInformacionFinanciera(this.informacionfinancieraBean,this.informacionfinanciera,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(InformacionFinancieraConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.informacionfinancieraSessionBean.getConGuardarRelaciones()) {
			classes=InformacionFinancieraConstantesFunciones.getClassesRelationshipsOfInformacionFinanciera(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.informacionfinancieraReturnGeneral=informacionfinancieraLogic.procesarEventosInformacionFinancierasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.informacionfinancieraLogic.getInformacionFinancieras(),this.informacionfinanciera,this.informacionfinancieraParameterGeneral,this.isEsNuevoInformacionFinanciera,classes);//this.informacionfinancieraLogic.getInformacionFinanciera()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanInformacionFinanciera(this.informacionfinancieraReturnGeneral,this.informacionfinancieraBean,false);
		
		if(this.informacionfinancieraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyInformacionFinanciera(this.informacionfinancieraReturnGeneral.getInformacionFinanciera());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioInformacionFinanciera(this.informacionfinancieraReturnGeneral.getInformacionFinanciera());
		}
		
		if(this.informacionfinancieraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioInformacionFinanciera(this.informacionfinancieraReturnGeneral.getInformacionFinanciera(),classes);//this.informacionfinancieraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.informacionfinanciera,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyInformacionFinanciera();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyInformacionFinanciera();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			InformacionFinancieraBeanSwingJInternalFrameAdditional.RecargarFormInformacionFinanciera(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingInformacionFinanciera(false);
						
			if(informacionfinancieraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualInformacionFinanciera();
			}
			
			this.actualizarVisualTableDatosInformacionFinanciera();
			
			this.jTableDatosInformacionFinanciera.setRowSelectionInterval(this.getIndiceNuevoInformacionFinanciera(), this.getIndiceNuevoInformacionFinanciera());
			
			this.seleccionarFilaTablaInformacionFinancieraActual();
						
			this.actualizarEstadoCeldasBotonesInformacionFinanciera("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesInformacionFinanciera(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormInformacionFinanciera.jTextFieldvalorInformacionFinanciera.setEnabled(isHabilitar && this.informacionfinancieraConstantesFunciones.activarvalorInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jTextAreadescripcionInformacionFinanciera.setEnabled(isHabilitar && this.informacionfinancieraConstantesFunciones.activardescripcionInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jCheckBoxesactivoInformacionFinanciera.setEnabled(isHabilitar && this.informacionfinancieraConstantesFunciones.activaresactivoInformacionFinanciera);	
		//
		this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxid_empresaInformacionFinanciera.setEnabled(isHabilitar && this.informacionfinancieraConstantesFunciones.activarid_empresaInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidclienteInformacionFinanciera.setEnabled(isHabilitar && this.informacionfinancieraConstantesFunciones.activaridclienteInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidvalorclientemovimientoInformacionFinanciera.setEnabled(isHabilitar && this.informacionfinancieraConstantesFunciones.activaridvalorclientemovimientoInformacionFinanciera);
	};
	
	public void setDefaultControlesInformacionFinanciera() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoInformacionFinanciera(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.informacionfinancieraSessionBean.setConGuardarRelaciones(true);			
			this.informacionfinancieraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormInformacionFinanciera.jTabbedPaneRelacionesInformacionFinanciera.setVisible(true);
			
					
		} else {
			//this.informacionfinancieraSessionBean.setConGuardarRelaciones(false);			
			this.informacionfinancieraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormInformacionFinanciera.jTabbedPaneRelacionesInformacionFinanciera.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoInformacionFinanciera() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformacionFinanciera informacionfinancieraAux:this.informacionfinancieraLogic.getInformacionFinancieras()) {
				if(informacionfinancieraAux.getId().equals(this.iIdNuevoInformacionFinanciera)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformacionFinanciera informacionfinancieraAux:this.informacionfinancieras) {
				if(informacionfinancieraAux.getId().equals(this.iIdNuevoInformacionFinanciera)) {
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
	
	public int getIndiceActualInformacionFinanciera(InformacionFinanciera informacionfinanciera,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformacionFinanciera informacionfinancieraAux:this.informacionfinancieraLogic.getInformacionFinancieras()) {
				if(informacionfinancieraAux.getId().equals(informacionfinanciera.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformacionFinanciera informacionfinancieraAux:this.informacionfinancieras) {
				if(informacionfinancieraAux.getId().equals(informacionfinanciera.getId())) {
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
	
	public void setCamposBaseDesdeOriginalInformacionFinanciera(InformacionFinanciera informacionfinancieraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformacionFinanciera informacionfinancieraAux:this.informacionfinancieraLogic.getInformacionFinancieras()) {
				if(informacionfinancieraAux.getInformacionFinancieraOriginal().getId().equals(informacionfinancieraOriginal.getId())) {
					existe=true;
					informacionfinancieraOriginal.setId(informacionfinancieraAux.getId());
					informacionfinancieraOriginal.setVersionRow(informacionfinancieraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformacionFinanciera informacionfinancieraAux:this.informacionfinancieras) {
				if(informacionfinancieraAux.getInformacionFinancieraOriginal().getId().equals(informacionfinancieraOriginal.getId())) {
					existe=true;
					informacionfinancieraOriginal.setId(informacionfinancieraAux.getId());
					informacionfinancieraOriginal.setVersionRow(informacionfinancieraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosInformacionFinanciera(Boolean esParaCancelar) throws Exception {
		informacionfinancierasAux=new ArrayList<InformacionFinanciera>();
		informacionfinancieraAux=new InformacionFinanciera();
		
		if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(InformacionFinanciera informacionfinancieraAux:this.informacionfinancieraLogic.getInformacionFinancieras()) {
					if(informacionfinancieraAux.getId()<0) {
						informacionfinancierasAux.add(informacionfinancieraAux);
					}		
				}
				this.iIdNuevoInformacionFinanciera=0L;
				this.informacionfinancieraLogic.getInformacionFinancieras().removeAll(informacionfinancierasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(InformacionFinanciera informacionfinancieraAux:this.informacionfinancieras) {
					if(informacionfinancieraAux.getId()<0) {
						informacionfinancierasAux.add(informacionfinancieraAux);
					}		
				}
				this.iIdNuevoInformacionFinanciera=0L;
				this.informacionfinancieras.removeAll(informacionfinancierasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoInformacionFinanciera 
					&& this.informacionfinancieraLogic.getInformacionFinancieras().size()>0
					) {
					informacionfinancieraAux=this.informacionfinancieraLogic.getInformacionFinancieras().get(this.informacionfinancieraLogic.getInformacionFinancieras().size() - 1);
				
					if(informacionfinancieraAux.getId()<0) {
						this.informacionfinancieraLogic.getInformacionFinancieras().remove(informacionfinancieraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoInformacionFinanciera && this.informacionfinancieras.size()>0) {
					informacionfinancieraAux=this.informacionfinancieras.get(this.informacionfinancieras.size() - 1);
				
					if(informacionfinancieraAux.getId()<0) {
						this.informacionfinancieras.remove(informacionfinancieraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoInformacionFinanciera(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(informacionfinanciera.getId()<0) {
				this.informacionfinancieraLogic.getInformacionFinancieras().remove(this.informacionfinanciera);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(informacionfinanciera.getId()<0) {
				this.informacionfinancieras.remove(this.informacionfinanciera);
			}
		}			
	}
	
	public void setEstadosInicialesInformacionFinanciera(List<InformacionFinanciera> informacionfinancierasAux) throws Exception {
		InformacionFinancieraConstantesFunciones.setEstadosInicialesInformacionFinanciera(informacionfinancierasAux);
	}
	
	public void setEstadosInicialesInformacionFinanciera(InformacionFinanciera informacionfinancieraAux) throws Exception {
		InformacionFinancieraConstantesFunciones.setEstadosInicialesInformacionFinanciera(informacionfinancieraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarInformacionFinancieraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesInformacionFinanciera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarInformacionFinancieraActual()) {
				if(!this.isEsNuevoInformacionFinanciera) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesInformacionFinanciera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoInformacionFinanciera=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarInformacionFinancieraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Informacion Financiera ?", "MANTENIMIENTO DE Informacion Financiera", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesInformacionFinanciera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(InformacionFinanciera informacionfinanciera) throws Exception {
		InformacionFinancieraConstantesFunciones.seleccionarAsignar(this.informacionfinanciera,informacionfinanciera);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarInformacionFinanciera=this.isPermisoActualizarOriginalInformacionFinanciera;
			
			
			this.seleccionarAsignar(informacionfinanciera);
			
			

			idClienteActual=informacionfinanciera.getidcliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			InformacionFinancieraConstantesFunciones.quitarEspaciosInformacionFinanciera(this.informacionfinanciera,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesInformacionFinanciera("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.informacionfinancieraSessionBean.setsFuncionBusquedaRapida(this.informacionfinancieraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoInformacionFinanciera) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosInformacionFinanciera(esParaCancelar);				
				this.cancelarNuevoInformacionFinanciera(esParaCancelar);								
			}
			
			this.informacionfinanciera=new InformacionFinanciera();
			
			this.inicializarInformacionFinanciera();
			
			this.actualizarEstadoCeldasBotonesInformacionFinanciera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarInformacionFinanciera() throws Exception {
		try {
			InformacionFinancieraConstantesFunciones.inicializarInformacionFinanciera(this.informacionfinanciera);
			
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
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.informacionfinancieraLogic.getInformacionFinancieras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteInformacionFinancieras(String sAccionBusqueda,List<InformacionFinanciera> informacionfinancierasParaReportes) throws Exception {
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
					sPathReporteFinal="InformacionFinanciera"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="InformacionFinancieraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("InformacionFinancieraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="InformacionFinanciera"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Informacion Financieras");		
		parameters.put("busquedapor", InformacionFinancieraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceInformacionFinanciera=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			InformacionFinancieraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			InformacionFinancieraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceInformacionFinanciera=new JRBeanArrayDataSource(InformacionFinancieraJInternalFrame.TraerInformacionFinancieraBeans(informacionfinancierasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceInformacionFinanciera);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+InformacionFinancieraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+InformacionFinancieraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(InformacionFinancieraBean.TraerInformacionFinancieraBeans(informacionfinancierasParaReportes).toArray()));
							
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
				this.generarExcelReporteInformacionFinancieras(sAccionBusqueda,sTipoArchivoReporte,informacionfinancierasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalInformacionFinancieras(sAccionBusqueda,sTipoArchivoReporte,informacionfinancierasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoInformacionFinancieraActionPerformed(null);
					//this.generarExcelReporteInformacionFinancieras(sAccionBusqueda,sTipoArchivoReporte,informacionfinancierasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalInformacionFinancieras(sAccionBusqueda,sTipoArchivoReporte,informacionfinancierasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesInformacionFinancieras(sAccionBusqueda,sTipoArchivoReporte,informacionfinancierasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesInformacionFinancieras(sAccionBusqueda,sTipoArchivoReporte,informacionfinancierasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteInformacionFinancieras(String sAccionBusqueda,String sTipoArchivoReporte,List<InformacionFinanciera> informacionfinancierasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacionfinanciera";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("InformacionFinancieras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderInformacionFinanciera("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(InformacionFinanciera informacionfinanciera : informacionfinancierasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			InformacionFinancieraConstantesFunciones.generarExcelReporteDataInformacionFinanciera("NORMAL",row,workbook,informacionfinanciera,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Financiera",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderInformacionFinanciera(String sTipo,Row row,Workbook workbook) {
		
		InformacionFinancieraConstantesFunciones.generarExcelReporteHeaderInformacionFinanciera(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalInformacionFinancieras(String sAccionBusqueda,String sTipoArchivoReporte,List<InformacionFinanciera> informacionfinancierasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacionfinanciera_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("InformacionFinancieras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(InformacionFinanciera informacionfinanciera : informacionfinancierasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(InformacionFinancieraConstantesFunciones.getInformacionFinancieraDescripcion(informacionfinanciera));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionFinancieraConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionfinanciera.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionFinancieraConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionfinanciera.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionFinancieraConstantesFunciones.LABEL_IDTIPOMOVIFINAN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_IDTIPOMOVIFINAN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionfinanciera.gettipomovifinan_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionFinancieraConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionfinanciera.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacionfinanciera.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(informacionfinanciera.getesactivo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Financiera",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesInformacionFinancieras(String sAccionBusqueda,String sTipoArchivoReporte,List<InformacionFinanciera> informacionfinancierasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<InformacionFinanciera> informacionfinancierasRespaldo=null;
		
		classes=InformacionFinancieraConstantesFunciones.getClassesRelationshipsOfInformacionFinanciera(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.informacionfinancieraLogic.setDatosCliente(this.datosCliente);
		this.informacionfinancieraLogic.setDatosDeep(this.datosDeep);
		this.informacionfinancieraLogic.setIsConDeep(true);
		
		informacionfinancierasRespaldo=this.informacionfinancieraLogic.getInformacionFinancieras();
		
		this.informacionfinancieraLogic.setInformacionFinancieras(informacionfinancierasParaReportes);	
		this.informacionfinancieraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		informacionfinancierasParaReportes=this.informacionfinancieraLogic.getInformacionFinancieras();
		this.informacionfinancieraLogic.setInformacionFinancieras(informacionfinancierasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacionfinanciera_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("InformacionFinancieras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderInformacionFinanciera("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(InformacionFinanciera informacionfinanciera : informacionfinancierasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderInformacionFinanciera("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			InformacionFinancieraConstantesFunciones.generarExcelReporteDataInformacionFinanciera("NORMAL",row,workbook,informacionfinanciera,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(InformacionFinancieraConstantesFunciones.getInformacionFinancieraDescripcion(informacionfinanciera));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Financiera",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessInformacionFinanciera() throws Exception {		
		this.startProcessInformacionFinanciera(true);
	}
	
	public void startProcessInformacionFinanciera(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasInformacionFinanciera ,this.jPanelParametrosReportesInformacionFinanciera, this.jScrollPanelDatosInformacionFinanciera,this.jPanelPaginacionInformacionFinanciera, this.jScrollPanelDatosEdicionInformacionFinanciera, this.jPanelAccionesInformacionFinanciera,this.jPanelAccionesFormularioInformacionFinanciera,this.jmenuBarInformacionFinanciera,this.jmenuBarDetalleInformacionFinanciera,this.jTtoolBarInformacionFinanciera,this.jTtoolBarDetalleInformacionFinanciera);		
		
		final JTabbedPane jTabbedPaneBusquedasInformacionFinanciera=this.jTabbedPaneBusquedasInformacionFinanciera; 
		
		final JPanel jPanelParametrosReportesInformacionFinanciera=this.jPanelParametrosReportesInformacionFinanciera;
		//final JScrollPane jScrollPanelDatosInformacionFinanciera=this.jScrollPanelDatosInformacionFinanciera;
		final JTable jTableDatosInformacionFinanciera=this.jTableDatosInformacionFinanciera;		
		final JPanel jPanelPaginacionInformacionFinanciera=this.jPanelPaginacionInformacionFinanciera;
		//final JScrollPane jScrollPanelDatosEdicionInformacionFinanciera=this.jScrollPanelDatosEdicionInformacionFinanciera;
		final JPanel jPanelAccionesInformacionFinanciera=this.jPanelAccionesInformacionFinanciera;
		
		JPanel jPanelCamposAuxiliarInformacionFinanciera=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarInformacionFinanciera=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
			jPanelCamposAuxiliarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jPanelCamposInformacionFinanciera;
			jPanelAccionesFormularioAuxiliarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jPanelAccionesFormularioInformacionFinanciera;
		}
		
		final JPanel jPanelCamposInformacionFinanciera=jPanelCamposAuxiliarInformacionFinanciera;
		final JPanel jPanelAccionesFormularioInformacionFinanciera=jPanelAccionesFormularioAuxiliarInformacionFinanciera;
		
		
		final JMenuBar jmenuBarInformacionFinanciera=this.jmenuBarInformacionFinanciera;
		final JToolBar jTtoolBarInformacionFinanciera=this.jTtoolBarInformacionFinanciera;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarInformacionFinanciera=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarInformacionFinanciera=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
			jmenuBarDetalleAuxiliarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jmenuBarDetalleInformacionFinanciera;
			jTtoolBarDetalleAuxiliarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jTtoolBarDetalleInformacionFinanciera;
		}
		
		final JMenuBar jmenuBarDetalleInformacionFinanciera=jmenuBarDetalleAuxiliarInformacionFinanciera;
		final JToolBar jTtoolBarDetalleInformacionFinanciera=jTtoolBarDetalleAuxiliarInformacionFinanciera;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasInformacionFinanciera;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesInformacionFinanciera;
			processRunnable.jTableDatos=jTableDatosInformacionFinanciera;
			processRunnable.jPanelCampos=jPanelCamposInformacionFinanciera;
			processRunnable.jPanelPaginacion=jPanelPaginacionInformacionFinanciera;
			processRunnable.jPanelAcciones=jPanelAccionesInformacionFinanciera;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioInformacionFinanciera;
			
			
			processRunnable.jmenuBar=jmenuBarInformacionFinanciera;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleInformacionFinanciera;
			processRunnable.jTtoolBar=jTtoolBarInformacionFinanciera;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleInformacionFinanciera;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasInformacionFinanciera ,jPanelParametrosReportesInformacionFinanciera,jTableDatosInformacionFinanciera, /*jScrollPanelDatosInformacionFinanciera,*/jPanelCamposInformacionFinanciera,jPanelPaginacionInformacionFinanciera, /*jScrollPanelDatosEdicionInformacionFinanciera,*/ jPanelAccionesInformacionFinanciera,jPanelAccionesFormularioInformacionFinanciera,jmenuBarInformacionFinanciera,jmenuBarDetalleInformacionFinanciera,jTtoolBarInformacionFinanciera,jTtoolBarDetalleInformacionFinanciera);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasInformacionFinanciera ,jPanelParametrosReportesInformacionFinanciera, jScrollPanelDatosInformacionFinanciera,jPanelPaginacionInformacionFinanciera, jScrollPanelDatosEdicionInformacionFinanciera, jPanelAccionesInformacionFinanciera,jPanelAccionesFormularioInformacionFinanciera,jmenuBarInformacionFinanciera,jmenuBarDetalleInformacionFinanciera,jTtoolBarInformacionFinanciera,jTtoolBarDetalleInformacionFinanciera);
						
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
	
	public void finishProcessInformacionFinanciera() {// throws Exception 
		this.finishProcessInformacionFinanciera(true);
	}
	
	public void finishProcessInformacionFinanciera(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasInformacionFinanciera ,this.jPanelParametrosReportesInformacionFinanciera, this.jScrollPanelDatosInformacionFinanciera,this.jPanelPaginacionInformacionFinanciera, this.jScrollPanelDatosEdicionInformacionFinanciera, this.jPanelAccionesInformacionFinanciera,this.jPanelAccionesFormularioInformacionFinanciera,this.jmenuBarInformacionFinanciera,this.jmenuBarDetalleInformacionFinanciera,this.jTtoolBarInformacionFinanciera,this.jTtoolBarDetalleInformacionFinanciera);		
		
		final JTabbedPane jTabbedPaneBusquedasInformacionFinanciera=this.jTabbedPaneBusquedasInformacionFinanciera; 
		
		final JPanel jPanelParametrosReportesInformacionFinanciera=this.jPanelParametrosReportesInformacionFinanciera;
		//final JScrollPane jScrollPanelDatosInformacionFinanciera=this.jScrollPanelDatosInformacionFinanciera;
		final JTable jTableDatosInformacionFinanciera=this.jTableDatosInformacionFinanciera;		
		final JPanel jPanelPaginacionInformacionFinanciera=this.jPanelPaginacionInformacionFinanciera;
		//final JScrollPane jScrollPanelDatosEdicionInformacionFinanciera=this.jScrollPanelDatosEdicionInformacionFinanciera;
		final JPanel jPanelAccionesInformacionFinanciera=this.jPanelAccionesInformacionFinanciera;
		
		JPanel jPanelCamposAuxiliarInformacionFinanciera=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarInformacionFinanciera=new JPanel();
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
			jPanelCamposAuxiliarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jPanelCamposInformacionFinanciera;
			jPanelAccionesFormularioAuxiliarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jPanelAccionesFormularioInformacionFinanciera;
		}
		
		final JPanel jPanelCamposInformacionFinanciera=jPanelCamposAuxiliarInformacionFinanciera;
		final JPanel jPanelAccionesFormularioInformacionFinanciera=jPanelAccionesFormularioAuxiliarInformacionFinanciera;
		
		
		final JMenuBar jmenuBarInformacionFinanciera=this.jmenuBarInformacionFinanciera;		
		final JToolBar jTtoolBarInformacionFinanciera=this.jTtoolBarInformacionFinanciera;
				
		JMenuBar jmenuBarDetalleAuxiliarInformacionFinanciera=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarInformacionFinanciera=new JToolBar();
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
			jmenuBarDetalleAuxiliarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jmenuBarDetalleInformacionFinanciera;
			jTtoolBarDetalleAuxiliarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jTtoolBarDetalleInformacionFinanciera;		
		}
		
		final JMenuBar jmenuBarDetalleInformacionFinanciera=jmenuBarDetalleAuxiliarInformacionFinanciera;
		final JToolBar jTtoolBarDetalleInformacionFinanciera=jTtoolBarDetalleAuxiliarInformacionFinanciera;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasInformacionFinanciera;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesInformacionFinanciera;
			processRunnable.jTableDatos=jTableDatosInformacionFinanciera;
			processRunnable.jPanelCampos=jPanelCamposInformacionFinanciera;
			processRunnable.jPanelPaginacion=jPanelPaginacionInformacionFinanciera;
			processRunnable.jPanelAcciones=jPanelAccionesInformacionFinanciera;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioInformacionFinanciera;
			
			
			processRunnable.jmenuBar=jmenuBarInformacionFinanciera;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleInformacionFinanciera;
			processRunnable.jTtoolBar=jTtoolBarInformacionFinanciera;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleInformacionFinanciera;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasInformacionFinanciera ,jPanelParametrosReportesInformacionFinanciera, jTableDatosInformacionFinanciera,/*jScrollPanelDatosInformacionFinanciera,*/jPanelCamposInformacionFinanciera,jPanelPaginacionInformacionFinanciera, /*jScrollPanelDatosEdicionInformacionFinanciera,*/ jPanelAccionesInformacionFinanciera,jPanelAccionesFormularioInformacionFinanciera,jmenuBarInformacionFinanciera,jmenuBarDetalleInformacionFinanciera,jTtoolBarInformacionFinanciera,jTtoolBarDetalleInformacionFinanciera));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesInformacionFinanciera(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarInformacionFinanciera(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuInformacionFinanciera(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarInformacionFinanciera(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarInformacionFinanciera,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleInformacionFinanciera,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuInformacionFinanciera(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarInformacionFinanciera,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleInformacionFinanciera,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.informacionfinancieraConstantesFunciones.getsFinalQueryInformacionFinanciera();
		String  finalQueryPaginacionTodos=this.informacionfinancieraConstantesFunciones.getsFinalQueryInformacionFinanciera();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=InformacionFinancieraConstantesFunciones.getArrayColumnasGlobalesNoInformacionFinanciera(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=InformacionFinancieraConstantesFunciones.getArrayColumnasGlobalesInformacionFinanciera(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,InformacionFinancieraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.informacionfinancierasEliminados= new ArrayList<InformacionFinanciera>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessInformacionFinanciera();
		
				///*InformacionFinancieraSessionBean*/this.informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
			
			if(this.informacionfinancieraSessionBean==null) {
				this.informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
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
					this.iNumeroPaginacion=InformacionFinancieraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=InformacionFinancieraConstantesFunciones.getClassesForeignKeysOfInformacionFinanciera(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/informacionfinanciera."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			informacionfinancierasAux= new ArrayList<InformacionFinanciera>();
			
				
			informacionfinancieraLogic.setDatosCliente(this.datosCliente);
			informacionfinancieraLogic.setDatosDeep(this.datosDeep);
			informacionfinancieraLogic.setIsConDeep(true);
			
			
			informacionfinancieraLogic.getInformacionFinancieraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					informacionfinancieraLogic.getTodosInformacionFinancieras(finalQueryGlobal,pagination);
					
					//informacionfinancieraLogic.getTodosInformacionFinancierasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(informacionfinancieraLogic.getInformacionFinancieras()==null|| informacionfinancieraLogic.getInformacionFinancieras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							informacionfinancierasAux= new ArrayList<InformacionFinanciera>();
							informacionfinancierasAux.addAll(informacionfinancieraLogic.getInformacionFinancieras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionfinancierasAux= new ArrayList<InformacionFinanciera>();
							informacionfinancierasAux.addAll(informacionfinancieras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							informacionfinancieraLogic.getTodosInformacionFinancieras(finalQueryGlobal+"",this.pagination);												
							
							//informacionfinancieraLogic.getTodosInformacionFinancierasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteInformacionFinancieras("Todos",informacionfinancieraLogic.getInformacionFinancieras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							informacionfinancieraLogic.setInformacionFinancieras(new ArrayList<InformacionFinanciera>());					
							informacionfinancieraLogic.getInformacionFinancieras().addAll(informacionfinancierasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionfinancieras=new ArrayList<InformacionFinanciera>();
							informacionfinancieras.addAll(informacionfinancierasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idInformacionFinanciera=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idInformacionFinanciera=this.idActual;
				
				} else if(this.idInformacionFinancieraActual!=null && this.idInformacionFinancieraActual!=0L) {
					idInformacionFinanciera=idInformacionFinancieraActual;
				}
				
					
				this.sDetalleReporte=InformacionFinancieraConstantesFunciones.getDetalleIndicePorId(idInformacionFinanciera);
				
				this.informacionfinancieras=new ArrayList<InformacionFinanciera>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					informacionfinancieraLogic.getEntity(idInformacionFinanciera);
					
					//informacionfinancieraLogic.getEntityWithConnection(idInformacionFinanciera);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacionfinancieraLogic.setInformacionFinancieras(new ArrayList<InformacionFinanciera>());
					informacionfinancieraLogic.getInformacionFinancieras().add(informacionfinancieraLogic.getInformacionFinanciera());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacionfinancieras=new ArrayList<InformacionFinanciera>();
					this.informacionfinancieras.add(informacionfinanciera);
				}
				
				if(informacionfinancieraLogic.getInformacionFinanciera()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=InformacionFinancieraConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					informacionfinancieraLogic.getInformacionFinancierasFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionFinancieraConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionFinancieraConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=informacionfinancieraLogic.getInformacionFinancieras()==null||informacionfinancieraLogic.getInformacionFinancieras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=informacionfinancieras==null|| informacionfinancieras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionfinancierasAux=new ArrayList<InformacionFinanciera>();
						informacionfinancierasAux.addAll(informacionfinancieraLogic.getInformacionFinancieras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionfinancierasAux=new ArrayList<InformacionFinanciera>();
							informacionfinancierasAux.addAll(informacionfinancieras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							informacionfinancieraLogic.getInformacionFinancierasFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionFinancieraConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionFinancieraConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteInformacionFinancieras("FK_IdCliente",informacionfinancieraLogic.getInformacionFinancieras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteInformacionFinancieras("FK_IdCliente",informacionfinancieras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionfinancieraLogic.setInformacionFinancieras(new ArrayList<InformacionFinanciera>());
						informacionfinancieraLogic.getInformacionFinancieras().addAll(informacionfinancierasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionfinancieras=new ArrayList<InformacionFinanciera>();
							informacionfinancieras.addAll(informacionfinancierasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=InformacionFinancieraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					informacionfinancieraLogic.getInformacionFinancierasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionFinancieraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionFinancieraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=informacionfinancieraLogic.getInformacionFinancieras()==null||informacionfinancieraLogic.getInformacionFinancieras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=informacionfinancieras==null|| informacionfinancieras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionfinancierasAux=new ArrayList<InformacionFinanciera>();
						informacionfinancierasAux.addAll(informacionfinancieraLogic.getInformacionFinancieras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionfinancierasAux=new ArrayList<InformacionFinanciera>();
							informacionfinancierasAux.addAll(informacionfinancieras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							informacionfinancieraLogic.getInformacionFinancierasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionFinancieraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionFinancieraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteInformacionFinancieras("FK_IdEmpresa",informacionfinancieraLogic.getInformacionFinancieras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteInformacionFinancieras("FK_IdEmpresa",informacionfinancieras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionfinancieraLogic.setInformacionFinancieras(new ArrayList<InformacionFinanciera>());
						informacionfinancieraLogic.getInformacionFinancieras().addAll(informacionfinancierasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionfinancieras=new ArrayList<InformacionFinanciera>();
							informacionfinancieras.addAll(informacionfinancierasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdValorClienteMovimiento")) {
				this.sDetalleReporte=InformacionFinancieraConstantesFunciones.getDetalleIndiceFK_IdValorClienteMovimiento(idvalorclientemovimientoFK_IdValorClienteMovimiento);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					informacionfinancieraLogic.getInformacionFinancierasFK_IdValorClienteMovimiento(finalQueryGlobal,pagination,idvalorclientemovimientoFK_IdValorClienteMovimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionFinancieraConstantesFunciones.getDetalleIndiceFK_IdValorClienteMovimiento(idvalorclientemovimientoFK_IdValorClienteMovimiento);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionFinancieraConstantesFunciones.getDetalleIndiceFK_IdValorClienteMovimiento(idvalorclientemovimientoFK_IdValorClienteMovimiento);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=informacionfinancieraLogic.getInformacionFinancieras()==null||informacionfinancieraLogic.getInformacionFinancieras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=informacionfinancieras==null|| informacionfinancieras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionfinancierasAux=new ArrayList<InformacionFinanciera>();
						informacionfinancierasAux.addAll(informacionfinancieraLogic.getInformacionFinancieras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionfinancierasAux=new ArrayList<InformacionFinanciera>();
							informacionfinancierasAux.addAll(informacionfinancieras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							informacionfinancieraLogic.getInformacionFinancierasFK_IdValorClienteMovimiento(finalQueryGlobal,pagination,idvalorclientemovimientoFK_IdValorClienteMovimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionFinancieraConstantesFunciones.getDetalleIndiceFK_IdValorClienteMovimiento(idvalorclientemovimientoFK_IdValorClienteMovimiento);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionFinancieraConstantesFunciones.getDetalleIndiceFK_IdValorClienteMovimiento(idvalorclientemovimientoFK_IdValorClienteMovimiento);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteInformacionFinancieras("FK_IdValorClienteMovimiento",informacionfinancieraLogic.getInformacionFinancieras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteInformacionFinancieras("FK_IdValorClienteMovimiento",informacionfinancieras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionfinancieraLogic.setInformacionFinancieras(new ArrayList<InformacionFinanciera>());
						informacionfinancieraLogic.getInformacionFinancieras().addAll(informacionfinancierasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionfinancieras=new ArrayList<InformacionFinanciera>();
							informacionfinancieras.addAll(informacionfinancierasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesInformacionFinanciera();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessInformacionFinanciera();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=informacionfinancieraLogic.getInformacionFinancieras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=informacionfinancieras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=informacionfinancieraLogic.getInformacionFinancieras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=informacionfinancieras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(InformacionFinanciera informacionfinanciera) {
		Boolean permite=true;
		
		if(this.informacionfinanciera.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=InformacionFinancieraConstantesFunciones.getOrderByListaInformacionFinanciera();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=InformacionFinancieraConstantesFunciones.getOrderByListaInformacionFinanciera();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformacionFinanciera informacionfinanciera:informacionfinancieraLogic.getInformacionFinancieras()) {
				if(informacionfinanciera.getsType().equals(Constantes2.S_TOTALES)) {
					informacionfinancieraTotales=informacionfinanciera;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformacionFinanciera informacionfinanciera:this.informacionfinancieras) {
				if(informacionfinanciera.getsType().equals(Constantes2.S_TOTALES)) {
					informacionfinancieraTotales=informacionfinanciera;
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
			this.informacionfinancieraAux=new InformacionFinanciera();
			this.informacionfinancieraAux.setsType(Constantes2.S_TOTALES);
			this.informacionfinancieraAux.setIsNew(false);
			this.informacionfinancieraAux.setIsChanged(false);
			this.informacionfinancieraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				InformacionFinancieraConstantesFunciones.TotalizarValoresFilaInformacionFinanciera(this.informacionfinancieraLogic.getInformacionFinancieras(),this.informacionfinancieraAux);
				
				this.informacionfinancieraLogic.getInformacionFinancieras().add(this.informacionfinancieraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				InformacionFinancieraConstantesFunciones.TotalizarValoresFilaInformacionFinanciera(this.informacionfinancieras,this.informacionfinancieraAux);
				
				this.informacionfinancieras.add(this.informacionfinancieraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		informacionfinancieraTotales=new InformacionFinanciera();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.informacionfinancieraLogic.getInformacionFinancieras().remove(informacionfinancieraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.informacionfinancieras.remove(informacionfinancieraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		informacionfinancieraTotales=new InformacionFinanciera();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformacionFinanciera informacionfinanciera:informacionfinancieraLogic.getInformacionFinancieras()) {
				if(informacionfinanciera.getsType().equals(Constantes2.S_TOTALES)) {
					informacionfinancieraTotales=informacionfinanciera;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				InformacionFinancieraConstantesFunciones.TotalizarValoresFilaInformacionFinanciera(this.informacionfinancieraLogic.getInformacionFinancieras(),informacionfinancieraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformacionFinanciera informacionfinanciera:this.informacionfinancieras) {
				if(informacionfinanciera.getsType().equals(Constantes2.S_TOTALES)) {
					informacionfinancieraTotales=informacionfinanciera;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				InformacionFinancieraConstantesFunciones.TotalizarValoresFilaInformacionFinanciera(this.informacionfinancieras,informacionfinancieraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getInformacionFinancierasFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getInformacionFinancierasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getInformacionFinancierasFK_IdValorClienteMovimiento()throws Exception {
		try {
			sAccionBusqueda="FK_IdValorClienteMovimiento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getInformacionFinancierasFK_IdCliente(String sFinalQuery,Long idcliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacionfinancieraLogic.getInformacionFinancierasFK_IdCliente(sFinalQuery,this.pagination,idcliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getInformacionFinancierasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacionfinancieraLogic.getInformacionFinancierasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getInformacionFinancierasFK_IdValorClienteMovimiento(String sFinalQuery,Long idvalorclientemovimiento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacionfinancieraLogic.getInformacionFinancierasFK_IdValorClienteMovimiento(sFinalQuery,this.pagination,idvalorclientemovimiento);
				
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
	
	public void inicializarPermisosInformacionFinanciera() {
		this.isPermisoTodoInformacionFinanciera=false;
		this.isPermisoNuevoInformacionFinanciera=false;
		this.isPermisoActualizarInformacionFinanciera=false;
		this.isPermisoActualizarOriginalInformacionFinanciera=false;
		this.isPermisoEliminarInformacionFinanciera=false;
		this.isPermisoGuardarCambiosInformacionFinanciera=false;
		this.isPermisoConsultaInformacionFinanciera=false;
		this.isPermisoBusquedaInformacionFinanciera=false;
		this.isPermisoReporteInformacionFinanciera=false;		
		this.isPermisoOrdenInformacionFinanciera=false;		
		this.isPermisoPaginacionMedioInformacionFinanciera=false;		
		this.isPermisoPaginacionAltoInformacionFinanciera=false;
		this.isPermisoPaginacionTodoInformacionFinanciera=false;
		this.isPermisoCopiarInformacionFinanciera=false;		
		this.isPermisoVerFormInformacionFinanciera=false;		
		this.isPermisoDuplicarInformacionFinanciera=false;		
		this.isPermisoOrdenInformacionFinanciera=false;		
	}
	
	public void setPermisosUsuarioInformacionFinanciera(Boolean isPermiso) {
		this.isPermisoTodoInformacionFinanciera=isPermiso;
		this.isPermisoNuevoInformacionFinanciera=isPermiso;
		this.isPermisoActualizarInformacionFinanciera=isPermiso;
		this.isPermisoActualizarOriginalInformacionFinanciera=isPermiso;
		this.isPermisoEliminarInformacionFinanciera=isPermiso;
		this.isPermisoGuardarCambiosInformacionFinanciera=isPermiso;
		this.isPermisoConsultaInformacionFinanciera=isPermiso;
		this.isPermisoBusquedaInformacionFinanciera=isPermiso;
		this.isPermisoReporteInformacionFinanciera=isPermiso;
		this.isPermisoOrdenInformacionFinanciera=isPermiso;		
		this.isPermisoPaginacionMedioInformacionFinanciera=isPermiso;		
		this.isPermisoPaginacionAltoInformacionFinanciera=isPermiso;		
		this.isPermisoPaginacionTodoInformacionFinanciera=isPermiso;		
		this.isPermisoCopiarInformacionFinanciera=isPermiso;		
		this.isPermisoVerFormInformacionFinanciera=isPermiso;		
		this.isPermisoDuplicarInformacionFinanciera=isPermiso;
		this.isPermisoOrdenInformacionFinanciera=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioInformacionFinanciera(Boolean isPermiso) {
		//this.isPermisoTodoInformacionFinanciera=isPermiso;
		this.isPermisoNuevoInformacionFinanciera=isPermiso;
		this.isPermisoActualizarInformacionFinanciera=isPermiso;
		this.isPermisoActualizarOriginalInformacionFinanciera=isPermiso;
		this.isPermisoEliminarInformacionFinanciera=isPermiso;
		this.isPermisoGuardarCambiosInformacionFinanciera=isPermiso;
		//this.isPermisoConsultaInformacionFinanciera=isPermiso;
		//this.isPermisoBusquedaInformacionFinanciera=isPermiso;
		//this.isPermisoReporteInformacionFinanciera=isPermiso;
		//this.isPermisoOrdenInformacionFinanciera=isPermiso;		
		//this.isPermisoPaginacionMedioInformacionFinanciera=isPermiso;		
		//this.isPermisoPaginacionAltoInformacionFinanciera=isPermiso;		
		//this.isPermisoPaginacionTodoInformacionFinanciera=isPermiso;		
		//this.isPermisoCopiarInformacionFinanciera=isPermiso;		
		//this.isPermisoDuplicarInformacionFinanciera=isPermiso;
		//this.isPermisoOrdenInformacionFinanciera=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioInformacionFinancieraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(InformacionFinancieraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebInformacionFinanciera(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioInformacionFinancieraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioInformacionFinancieraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionInformacionFinancieraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioInformacionFinancieraClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioInformacionFinanciera() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(InformacionFinancieraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, InformacionFinancieraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoInformacionFinanciera=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarInformacionFinanciera=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalInformacionFinanciera=this.isPermisoActualizarInformacionFinanciera;
			this.isPermisoEliminarInformacionFinanciera=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosInformacionFinanciera=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaInformacionFinanciera=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaInformacionFinanciera=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoInformacionFinanciera=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteInformacionFinanciera=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenInformacionFinanciera=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioInformacionFinanciera=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoInformacionFinanciera=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoInformacionFinanciera=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarInformacionFinanciera=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormInformacionFinanciera=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarInformacionFinanciera=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenInformacionFinanciera=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosInformacionFinanciera.setToolTipText(this.jTableDatosInformacionFinanciera.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioInformacionFinanciera(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioInformacionFinanciera(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(InformacionFinancieraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(InformacionFinancieraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioInformacionFinanciera() throws Exception {
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
	public void inicializarCombosForeignKeyInformacionFinancieraListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.tipomovifinansForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyInformacionFinancieraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(InformacionFinancieraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyInformacionFinancieraListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMoviFinanListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoMoviFinanListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipomovifinansForeignKey==null||this.tipomovifinansForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoMoviFinanConstantesFunciones.getArrayColumnasGlobalesTipoMoviFinan(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMoviFinanConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoMoviFinanConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoMoviFinansForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyInformacionFinancieraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			InformacionFinancieraParameterReturnGeneral informacionfinancieraReturnGeneral=new InformacionFinancieraParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.informacionfinancieraConstantesFunciones.cargarid_empresaInformacionFinanciera)
					 || (this.esRecargarFks && this.informacionfinancieraConstantesFunciones.cargarid_empresaInformacionFinanciera)) {

					if(!this.informacionfinancieraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+informacionfinancieraSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.informacionfinancieraConstantesFunciones.cargaridclienteInformacionFinanciera)
					 || (this.esRecargarFks && this.informacionfinancieraConstantesFunciones.cargaridclienteInformacionFinanciera)) {

					if(!this.informacionfinancieraSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+informacionfinancieraSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoMoviFinan="";

				if(((this.tipomovifinansForeignKey==null||this.tipomovifinansForeignKey.size()<=0) && this.informacionfinancieraConstantesFunciones.cargaridvalorclientemovimientoInformacionFinanciera)
					 || (this.esRecargarFks && this.informacionfinancieraConstantesFunciones.cargaridvalorclientemovimientoInformacionFinanciera)) {

					if(!this.informacionfinancieraSessionBean.getisBusquedaDesdeForeignKeySesionTipoMoviFinan()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoMoviFinanConstantesFunciones.getArrayColumnasGlobalesTipoMoviFinan(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoMoviFinan=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMoviFinanConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoMoviFinan=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoMoviFinan, "");
						finalQueryGlobalTipoMoviFinan+=TipoMoviFinanConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoMoviFinansForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoMoviFinan=" WHERE " + ConstantesSql.ID + "="+informacionfinancieraSessionBean.getlidTipoMoviFinanActual();
					}
				} else {
					finalQueryGlobalTipoMoviFinan="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				informacionfinancieraReturnGeneral=informacionfinancieraLogic.cargarCombosLoteForeignKeyInformacionFinanciera(finalQueryGlobalEmpresa,finalQueryGlobalCliente,finalQueryGlobalTipoMoviFinan);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=informacionfinancieraReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=informacionfinancieraReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoMoviFinan.equals("NONE")) {
				this.tipomovifinansForeignKey=informacionfinancieraReturnGeneral.gettipomovifinansForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyInformacionFinanciera()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoMoviFinan();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.informacionfinancieraSessionBean==null) {
				this.informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
			}

			if(!this.informacionfinancieraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.informacionfinancieraSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyTipoMoviFinan()throws Exception {
		try {

			if(!this.informacionfinancieraSessionBean.getisBusquedaDesdeForeignKeySesionTipoMoviFinan()) {
				TipoMoviFinan tipomovifinan=new TipoMoviFinan();
				TipoMoviFinanConstantesFunciones.setTipoMoviFinanDescripcion(tipomovifinan,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipomovifinan.setId(null);

				if(!TipoMoviFinanConstantesFunciones.ExisteEnLista(this.tipomovifinansForeignKey,tipomovifinan,true)) {

					this.tipomovifinansForeignKey.add(0,tipomovifinan);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyInformacionFinanciera()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyInformacionFinanciera(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyInformacionFinanciera()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyInformacionFinanciera();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyInformacionFinanciera(InformacionFinanciera informacionfinanciera)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(informacionfinanciera.getidcliente(),false,"Formulario");
			this.setActualTipoMoviFinanForeignKey(informacionfinanciera.getidvalorclientemovimiento(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyInformacionFinanciera(InformacionFinanciera informacionfinanciera,String sTipoEvento)throws Exception {	
		try {
			
			

				if(informacionfinanciera.getCliente()!=null && !sTipoEvento.equals("idclienteInformacionFinanciera")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(informacionfinanciera.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyInformacionFinanciera()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.informacionfinancieraConstantesFunciones.getidcliente(),false,"Formulario");
			this.setActualTipoMoviFinanForeignKey(this.informacionfinancieraConstantesFunciones.getidvalorclientemovimiento(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyInformacionFinanciera()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyInformacionFinanciera()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyInformacionFinanciera()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroInformacionFinanciera()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyInformacionFinanciera()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoMoviFinansForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyInformacionFinanciera(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMoviFinansForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyInformacionFinanciera()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxid_empresaInformacionFinanciera!=null && this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxid_empresaInformacionFinanciera.getItemCount()>0) {
				this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxid_empresaInformacionFinanciera.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidclienteInformacionFinanciera!=null && this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidclienteInformacionFinanciera.getItemCount()>0) {
				this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidclienteInformacionFinanciera.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidvalorclientemovimientoInformacionFinanciera!=null && this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidvalorclientemovimientoInformacionFinanciera.getItemCount()>0) {
				this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidvalorclientemovimientoInformacionFinanciera.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public InformacionFinancieraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public InformacionFinancieraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public InformacionFinancieraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.informacionfinancieraSessionBean=new InformacionFinancieraSessionBean(); 
		this.informacionfinancieraConstantesFunciones=new InformacionFinancieraConstantesFunciones(); 
		this.informacionfinancieraBean=new InformacionFinanciera();//(this.informacionfinancieraConstantesFunciones); 		
		this.informacionfinancieraReturnGeneral=new InformacionFinancieraParameterReturnGeneral(); 
		
		this.informacionfinancieraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.informacionfinancieraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public InformacionFinancieraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public InformacionFinancieraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public InformacionFinancieraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessInformacionFinanciera(true);
			
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
			
			this.informacionfinancieraConstantesFunciones=new InformacionFinancieraConstantesFunciones(); 
			this.informacionfinancieraBean=new InformacionFinanciera();//this.informacionfinancieraConstantesFunciones); 			
			this.informacionfinancieraReturnGeneral=new InformacionFinancieraParameterReturnGeneral(); 
		
			InformacionFinancieraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Informacion Financiera Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.informacionfinanciera=new InformacionFinanciera();
			this.informacionfinancieras = new ArrayList<InformacionFinanciera>();
			this.informacionfinancierasAux = new ArrayList<InformacionFinanciera>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic=new InformacionFinancieraLogic();
				this.informacionfinancieraLogic.getNewConnexionToDeep("");
			}
			
			//this.informacionfinancieraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.informacionfinancieraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormInformacionFinanciera);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoInformacionFinanciera!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoInformacionFinanciera);	
					}
					
					if(this.jInternalFrameImportacionInformacionFinanciera!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionInformacionFinanciera);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByInformacionFinanciera!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByInformacionFinanciera);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormInformacionFinanciera);
				this.jInternalFrameDetalleFormInformacionFinanciera.setVisible(false);
				this.jInternalFrameDetalleFormInformacionFinanciera.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoInformacionFinanciera!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoInformacionFinanciera);
					this.jInternalFrameReporteDinamicoInformacionFinanciera.setVisible(false);
					this.jInternalFrameReporteDinamicoInformacionFinanciera.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionInformacionFinanciera!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionInformacionFinanciera);
					this.jInternalFrameImportacionInformacionFinanciera.setVisible(false);
					this.jInternalFrameImportacionInformacionFinanciera.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByInformacionFinanciera!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByInformacionFinanciera);
					this.jInternalFrameOrderByInformacionFinanciera.setVisible(false);
					this.jInternalFrameOrderByInformacionFinanciera.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idInformacionFinancieraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=InformacionFinancieraConstantesFunciones.INUMEROPAGINACION;
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
			
			this.informacionfinancieraReturnGeneral=new InformacionFinancieraParameterReturnGeneral();
			
			this.informacionfinancieraParameterGeneral=new InformacionFinancieraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.informacionfinancieraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
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
			
			if(InformacionFinancieraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,InformacionFinancieraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.informacionfinancieraSessionBean.getEsGuardarRelacionado(),this.informacionfinancieraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,InformacionFinancieraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.informacionfinancieraSessionBean.getEsGuardarRelacionado(),this.informacionfinancieraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoInformacionFinanciera=false;
			this.isVisibilidadCeldaDuplicarInformacionFinanciera=true;
			this.isVisibilidadCeldaCopiarInformacionFinanciera=true;
			this.isVisibilidadCeldaVerFormInformacionFinanciera=true;
			this.isVisibilidadCeldaOrdenInformacionFinanciera=true;
			this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera=false;
			this.isVisibilidadCeldaModificarInformacionFinanciera=false;
			this.isVisibilidadCeldaActualizarInformacionFinanciera=false;
			this.isVisibilidadCeldaEliminarInformacionFinanciera=false;
			this.isVisibilidadCeldaCancelarInformacionFinanciera=false;
			this.isVisibilidadCeldaGuardarInformacionFinanciera=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionFinanciera=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdValorClienteMovimiento=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesInformacionFinanciera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosInformacionFinanciera();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioInformacionFinanciera(false);
			
			this.setPermisosUsuarioInformacionFinanciera();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado() 
				|| (this.informacionfinancieraSessionBean.getEsGuardarRelacionado() && this.informacionfinancieraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioInformacionFinancieraClasesRelacionadas();
			}
			
			if(this.informacionfinancieraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioInformacionFinancieraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosInformacionFinanciera();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualInformacionFinanciera();
			}
			
			if(!this.isPermisoBusquedaInformacionFinanciera) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasInformacionFinanciera.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioInformacionFinanciera,this.isPermisoPaginacionMedioInformacionFinanciera,this.isPermisoPaginacionTodoInformacionFinanciera);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(InformacionFinancieraConstantesFunciones.getTiposSeleccionarInformacionFinanciera());
				
				this.tiposColumnasSelect=InformacionFinancieraConstantesFunciones.getTiposSeleccionarInformacionFinanciera(true);
				
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
			//if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioInformacionFinanciera();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioInformacionFinanciera(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioInformacionFinanciera(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesInformacionFinanciera() ;
			
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
			this.clienteLogic=new ClienteLogic();
			this.tipomovifinanLogic=new TipoMoviFinanLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				informacionfinancieraImplementable= (InformacionFinancieraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+InformacionFinancieraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				informacionfinancieraImplementableHome= (InformacionFinancieraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+InformacionFinancieraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.informacionfinancieras= new ArrayList<InformacionFinanciera>();
			this.informacionfinancierasEliminados= new ArrayList<InformacionFinanciera>();
						
			this.isEsNuevoInformacionFinanciera=false;
			this.esParaAccionDesdeFormularioInformacionFinanciera=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipomovifinansForeignKey=new ArrayList<TipoMoviFinan>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyInformacionFinanciera(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroInformacionFinanciera();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			InformacionFinancieraBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=InformacionFinancieraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesInformacionFinanciera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingInformacionFinanciera(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioInformacionFinanciera();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioInformacionFinanciera();
			}
			
			InformacionFinancieraBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasInformacionFinanciera.getTabCount(); i++) {
					this.jTabbedPaneBusquedasInformacionFinanciera.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasInformacionFinanciera.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessInformacionFinanciera(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga InformacionFinanciera: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectInformacionFinanciera() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesInformacionFinanciera")) {
				iIndex=this.jInternalFrameDetalleFormInformacionFinanciera.jTabbedPaneRelacionesInformacionFinanciera.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormInformacionFinanciera.jTabbedPaneRelacionesInformacionFinanciera.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessInformacionFinanciera();	
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
	
	public void cargarCombosForeignKeyInformacionFinanciera(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyInformacionFinanciera(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyInformacionFinanciera(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyInformacionFinancieraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyInformacionFinanciera();
		
		this.cargarCombosFrameForeignKeyInformacionFinanciera();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyInformacionFinanciera();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyInformacionFinanciera();
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

	public void cargarCombosForeignKeyTipoMoviFinan(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoMoviFinanListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoMoviFinan();
				this.cargarCombosFrameTipoMoviFinansForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoMoviFinan(this.tipomovifinansForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoInformacionFinancieraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.informacionfinancieraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormInformacionFinanciera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
			
			
			if(jTableDatosInformacionFinanciera.getRowCount()>=1) {
				jTableDatosInformacionFinanciera.removeRowSelectionInterval(0, jTableDatosInformacionFinanciera.getRowCount()-1);						
			}
			
			this.isEsNuevoInformacionFinanciera=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoInformacionFinanciera(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesInformacionFinanciera(true);			
			//this.informacionfinanciera=new InformacionFinanciera();
			//this.informacionfinanciera.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesInformacionFinanciera(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInformacionFinanciera() ;
			
			if(InformacionFinancieraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleInformacionFinanciera(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.informacionfinanciera);	
			this.actualizarInformacion("INFO_PADRE",false,this.informacionfinanciera);				
			
			InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
			
			if(this.informacionfinancieraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar InformacionFinanciera: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarInformacionFinancieraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<InformacionFinanciera> informacionfinancierasSeleccionados=new ArrayList<InformacionFinanciera>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosInformacionFinanciera.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosInformacionFinanciera.getSelectedRows().length;			
			}
			
			informacionfinancierasSeleccionados=this.getInformacionFinancierasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoInformacionFinanciera--;			
				//InformacionFinanciera informacionfinancieraAux= new InformacionFinanciera();			
				//informacionfinancieraAux.setId(this.iIdNuevoInformacionFinanciera);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//InformacionFinanciera informacionfinancieraOrigen=new InformacionFinanciera();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(InformacionFinanciera informacionfinancieraOrigen : informacionfinancierasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							informacionfinancieraOrigen =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacionfinancieraOrigen =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaInformacionFinanciera();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.informacionfinanciera.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosInformacionFinanciera(informacionfinancieraOrigen,this.informacionfinanciera,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.informacionfinancieraLogic.getInformacionFinancieras().add(this.informacionfinancieraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.informacionfinancieras.add(this.informacionfinancieraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaInformacionFinanciera(false);
				
				this.jTableDatosInformacionFinanciera.setRowSelectionInterval(this.getIndiceNuevoInformacionFinanciera(), this.getIndiceNuevoInformacionFinanciera());
				
				int iLastRow =  this.jTableDatosInformacionFinanciera.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosInformacionFinanciera.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosInformacionFinanciera.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaInformacionFinanciera(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<InformacionFinanciera> informacionfinancierasSeleccionados=new ArrayList<InformacionFinanciera>();									
		
			InformacionFinanciera informacionfinancieraOrigen=new InformacionFinanciera();
			InformacionFinanciera informacionfinancieraDestino=new InformacionFinanciera();
				
			informacionfinancierasSeleccionados=this.getInformacionFinancierasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosInformacionFinanciera.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || informacionfinancierasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosInformacionFinanciera.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionfinancieraOrigen =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						informacionfinancieraOrigen =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						informacionfinancieraDestino =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						informacionfinancieraDestino =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				informacionfinancieraOrigen =informacionfinancierasSeleccionados.get(0);
				informacionfinancieraDestino =informacionfinancierasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosInformacionFinanciera(informacionfinancieraOrigen,informacionfinancieraDestino,true,false);
				
				informacionfinancieraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(informacionfinancieraDestino,informacionfinancieraLogic.getInformacionFinancieras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(informacionfinancieraDestino,informacionfinancieras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaInformacionFinanciera(false);
				
				//this.jTableDatosInformacionFinanciera.setRowSelectionInterval(this.getIndiceNuevoInformacionFinanciera(), this.getIndiceNuevoInformacionFinanciera());
				
				int iLastRow =  this.jTableDatosInformacionFinanciera.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosInformacionFinanciera.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosInformacionFinanciera.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaInformacionFinanciera(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormInformacionFinanciera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormInformacionFinanciera.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesInformacionFinanciera.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasInformacionFinanciera.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesInformacionFinanciera.setVisible(!isVisible);
			this.jPanelPaginacionInformacionFinanciera.setVisible(!isVisible);
			this.jPanelAccionesInformacionFinanciera.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameInformacionFinanciera();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoInformacionFinanciera();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionInformacionFinanciera();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByInformacionFinanciera();
			
			this.abrirFrameOrderByInformacionFinanciera();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByInformacionFinanciera();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleInformacionFinanciera(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormInformacionFinanciera);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormInformacionFinanciera.isMaximum()) {
					this.jInternalFrameDetalleFormInformacionFinanciera.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormInformacionFinanciera.setSize(this.jInternalFrameDetalleFormInformacionFinanciera.iWidthFormulario,this.jInternalFrameDetalleFormInformacionFinanciera.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormInformacionFinanciera.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormInformacionFinanciera.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormInformacionFinanciera.isMaximum()) {
						this.jInternalFrameDetalleFormInformacionFinanciera.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormInformacionFinanciera.jContentPaneDetalleInformacionFinanciera.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormInformacionFinanciera.jTabbedPaneRelacionesInformacionFinanciera.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormInformacionFinanciera.jContentPaneDetalleInformacionFinanciera.getWidth(),InformacionFinancieraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormInformacionFinanciera.jTabbedPaneRelacionesInformacionFinanciera.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormInformacionFinanciera.jContentPaneDetalleInformacionFinanciera.getWidth(),InformacionFinancieraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormInformacionFinanciera.jTabbedPaneRelacionesInformacionFinanciera.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormInformacionFinanciera.jContentPaneDetalleInformacionFinanciera.getWidth(),InformacionFinancieraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormInformacionFinanciera.setVisible(true);
	        this.jInternalFrameDetalleFormInformacionFinanciera.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByInformacionFinanciera() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByInformacionFinanciera==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByInformacionFinanciera=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInformacionFinanciera,false,this);
				} else {
					this.jInternalFrameOrderByInformacionFinanciera=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInformacionFinanciera,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByInformacionFinanciera);
				this.jInternalFrameOrderByInformacionFinanciera.setVisible(false);
				this.jInternalFrameOrderByInformacionFinanciera.setSelected(false);
				
				this.jInternalFrameOrderByInformacionFinanciera.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByInformacionFinanciera"));
				
				this.inicializarActualizarBindingTablaOrderByInformacionFinanciera();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionInformacionFinanciera() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionInformacionFinanciera==null) {
				
				this.jInternalFrameImportacionInformacionFinanciera=new ImportacionJInternalFrame(InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionInformacionFinanciera);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionInformacionFinanciera);
				this.jInternalFrameImportacionInformacionFinanciera.setVisible(false);
				this.jInternalFrameImportacionInformacionFinanciera.setSelected(false);


				this.jInternalFrameImportacionInformacionFinanciera.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionInformacionFinanciera"));
				this.jInternalFrameImportacionInformacionFinanciera.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionInformacionFinanciera"));
				this.jInternalFrameImportacionInformacionFinanciera.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionInformacionFinanciera"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoInformacionFinanciera() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoInformacionFinanciera==null) {
				this.jInternalFrameReporteDinamicoInformacionFinanciera=new ReporteDinamicoJInternalFrame(InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoInformacionFinanciera);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoInformacionFinanciera);
				this.jInternalFrameReporteDinamicoInformacionFinanciera.setVisible(false);
				this.jInternalFrameReporteDinamicoInformacionFinanciera.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoInformacionFinanciera.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoInformacionFinanciera"));
				this.jInternalFrameReporteDinamicoInformacionFinanciera.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoInformacionFinanciera"));
				this.jInternalFrameReporteDinamicoInformacionFinanciera.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoInformacionFinanciera"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualInformacionFinanciera();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleInformacionFinanciera() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormInformacionFinanciera);
			
	       	this.jInternalFrameDetalleFormInformacionFinanciera.setVisible(false);
	        this.jInternalFrameDetalleFormInformacionFinanciera.setSelected(false);
			
			//this.jInternalFrameDetalleFormInformacionFinanciera.dispose();
			//this.jInternalFrameDetalleFormInformacionFinanciera=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoInformacionFinanciera() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoInformacionFinanciera.setVisible(true);
	        this.jInternalFrameReporteDinamicoInformacionFinanciera.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionInformacionFinanciera() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionInformacionFinanciera.setVisible(true);
	        this.jInternalFrameImportacionInformacionFinanciera.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByInformacionFinanciera() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByInformacionFinanciera.setVisible(true);
	        this.jInternalFrameOrderByInformacionFinanciera.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByInformacionFinanciera() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByInformacionFinanciera.setVisible(false);
	        this.jInternalFrameOrderByInformacionFinanciera.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoInformacionFinanciera() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoInformacionFinanciera.setVisible(false);
	        this.jInternalFrameReporteDinamicoInformacionFinanciera.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionInformacionFinanciera() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionInformacionFinanciera.setVisible(false);
	        this.jInternalFrameImportacionInformacionFinanciera.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarInformacionFinanciera(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarInformacionFinanciera(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesInformacionFinanciera(true);
			//this.isEsNuevoInformacionFinanciera=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesInformacionFinanciera("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesInformacionFinanciera(false) ;
			
			if(informacionfinancieraSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(InformacionFinancieraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleInformacionFinanciera(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInformacionFinanciera(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaInformacionFinancieraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarInformacionFinanciera(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormInformacionFinanciera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesInformacionFinanciera(true);
			//this.isEsNuevoInformacionFinanciera=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.informacionfinanciera.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesInformacionFinanciera("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesInformacionFinanciera(false) ;
			
			if(InformacionFinancieraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleInformacionFinanciera(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInformacionFinanciera(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.informacionfinancieraConstantesFunciones.cargaridclienteInformacionFinanciera) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingInformacionFinanciera(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaidcliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosInformacionFinanciera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionFinanciera,InformacionFinancieraConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosInformacionFinanciera.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoMoviFinan(List<TipoMoviFinan> tipomovifinansForeignKey)throws Exception{
		TableColumn tableColumnTipoMoviFinan=this.jTableDatosInformacionFinanciera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionFinanciera,InformacionFinancieraConstantesFunciones.LABEL_IDTIPOMOVIFINAN));
		TableCellEditor tableCellEditorTipoMoviFinan =tableColumnTipoMoviFinan.getCellEditor();

		TipoMoviFinanTableCell tipomovifinanTableCellFk=(TipoMoviFinanTableCell)tableCellEditorTipoMoviFinan;

		if(tipomovifinanTableCellFk!=null) {
			tipomovifinanTableCellFk.settipomovifinansForeignKey(tipomovifinansForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosInformacionFinanciera.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomovifinanTableCellFk.setRowActual(intSelectedRow);
			//tipomovifinanTableCellFk.settipomovifinansForeignKeyActual(tipomovifinansForeignKey);
		//}


		if(tipomovifinanTableCellFk!=null) {
			tipomovifinanTableCellFk.RecargarTipoMoviFinansForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaidcliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesInformacionFinanciera(false);
			
			//if(!this.isEsNuevoInformacionFinanciera) {								
				int intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.informacionfinanciera,true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
				
			}
			
			if(this.permiteMantenimiento(this.informacionfinanciera)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoInformacionFinanciera=true;
					this.inicializarActualizarBindingTablaInformacionFinanciera(false);
					this.isEsNuevoInformacionFinanciera=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoInformacionFinanciera=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoInformacionFinanciera=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesInformacionFinanciera(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualInformacionFinanciera(false);
				
				this.habilitarDeshabilitarControlesInformacionFinanciera(false);
			
												
				
				if(InformacionFinancieraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleInformacionFinanciera();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoInformacionFinancieraActionPerformed(evt,informacionfinancieraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualInformacionFinanciera(this.informacionfinanciera,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosInformacionFinanciera.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,informacionfinancieraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.informacionfinanciera.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(InformacionFinanciera.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionFinanciera.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				this.informacionfinanciera.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				this.informacionfinanciera.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.informacionfinanciera)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((InformacionFinancieraModel) this.jTableDatosInformacionFinanciera.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoInformacionFinanciera=true;
				this.inicializarActualizarBindingTablaInformacionFinanciera(false);
				this.isEsNuevoInformacionFinanciera=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesInformacionFinanciera(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualInformacionFinanciera(false);
				
				this.habilitarDeshabilitarControlesInformacionFinanciera(false);
				
				
				
				if(InformacionFinancieraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleInformacionFinanciera();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosInformacionFinanciera.getRowCount()>=1) {
				jTableDatosInformacionFinanciera.removeRowSelectionInterval(0, jTableDatosInformacionFinanciera.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesInformacionFinanciera(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaInformacionFinanciera(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesInformacionFinanciera(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInformacionFinanciera(false) ;
			
			this.isEsNuevoInformacionFinanciera=false;
			
			if(InformacionFinancieraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleInformacionFinanciera();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingInformacionFinanciera(false);
				
				//SI ES MANUAL
				if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualInformacionFinanciera();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoInformacionFinanciera--;			
			//InformacionFinanciera informacionfinancieraAux= new InformacionFinanciera();			
			//informacionfinancieraAux.setId(this.iIdNuevoInformacionFinanciera);
			
			if(this.jInternalFrameDetalleFormInformacionFinanciera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaInformacionFinanciera();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
			
			this.informacionfinanciera.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.informacionfinancieraLogic.getInformacionFinancieras().add(this.informacionfinancieraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.informacionfinancieras.add(this.informacionfinancieraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaInformacionFinanciera(false);
			
			this.jTableDatosInformacionFinanciera.setRowSelectionInterval(this.getIndiceNuevoInformacionFinanciera(), this.getIndiceNuevoInformacionFinanciera());
			
			int iLastRow =  this.jTableDatosInformacionFinanciera.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosInformacionFinanciera.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosInformacionFinanciera.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaInformacionFinanciera(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingInformacionFinanciera(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInformacionFinanciera(false);
			
			//SI ES MANUAL
			if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualInformacionFinanciera();
			}
			
			//this.abrirFrameTreeInformacionFinanciera();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Informacion FinancieraS ?", "MANTENIMIENTO DE Informacion Financiera", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionInformacionFinanciera.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralInformacionFinanciera();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.informacionfinancieraReturnGeneral=informacionfinancieraLogic.procesarImportacionInformacionFinancierasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.informacionfinancieraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarInformacionFinancieraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionInformacionFinanciera.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionInformacionFinanciera.setFileImportacion(this.jInternalFrameImportacionInformacionFinanciera.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionInformacionFinanciera.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionInformacionFinanciera.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionInformacionFinanciera.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionInformacionFinanciera.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<InformacionFinanciera> informacionfinancierasSeleccionados=new ArrayList<InformacionFinanciera>();		

		informacionfinancierasSeleccionados=this.getInformacionFinancierasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("InformacionFinancieraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"InformacionFinancieraBaseDesign.jrxml";
			
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
			
			this.generarReporteInformacionFinancieras("Todos",informacionfinancierasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Financiera",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case InformacionFinancieraConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionFinancieraConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionFinancieraConstantesFunciones.LABEL_IDTIPOMOVIFINAN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoMoviFinan_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoMoviFinan_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoMoviFinan_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoMoviFinan_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionFinancieraConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Activo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Activo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Activo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Activo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoInformacionFinanciera.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case InformacionFinancieraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="idcliente";
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_IDTIPOMOVIFINAN:
					sNombreCampoCategoria="idvalorclientemovimiento";
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoria="esactivo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case InformacionFinancieraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="idcliente";
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_IDTIPOMOVIFINAN:
					sNombreCampoCategoriaValor="idvalorclientemovimiento";
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoriaValor="esactivo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case InformacionFinancieraConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idcliente");
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_IDTIPOMOVIFINAN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movi Finan",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idvalorclientemovimiento");
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esactivo");
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
	
	public void jButtonGenerarExcelReporteDinamicoInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<InformacionFinanciera> informacionfinancierasSeleccionados=new ArrayList<InformacionFinanciera>();		
		
		informacionfinancierasSeleccionados=this.getInformacionFinancierasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacionfinanciera";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("InformacionFinancieras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case InformacionFinancieraConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(InformacionFinanciera informacionfinanciera:informacionfinancierasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionfinanciera.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(InformacionFinanciera informacionfinanciera:informacionfinancierasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionfinanciera.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_IDTIPOMOVIFINAN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_IDTIPOMOVIFINAN);
					iRow++;

					for(InformacionFinanciera informacionfinanciera:informacionfinancierasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionfinanciera.gettipomovifinan_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(InformacionFinanciera informacionfinanciera:informacionfinancierasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionfinanciera.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(InformacionFinanciera informacionfinanciera:informacionfinancierasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionfinanciera.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO);
					iRow++;

					for(InformacionFinanciera informacionfinanciera:informacionfinancierasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacionfinanciera.getesactivo());
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
			//	this.getFilaCabeceraExportarExcelInformacionFinanciera(row);				
			//	iRow++;
			//}				
			
			//for(InformacionFinanciera informacionfinancieraAux:informacionfinancierasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelInformacionFinanciera(informacionfinancieraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Financiera",JOptionPane.INFORMATION_MESSAGE);
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
				this.informacionfinancieraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInformacionFinanciera(false);
			
			//SI ES MANUAL
			if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualInformacionFinanciera();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInformacionFinanciera(false);
			
			//SI ES MANUAL
			if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualInformacionFinanciera();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInformacionFinanciera(false);
			
			//SI ES MANUAL
			if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualInformacionFinanciera();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaInformacionFinanciera() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosInformacionFinanciera.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosInformacionFinanciera.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosInformacionFinanciera.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosInformacionFinanciera.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosInformacionFinanciera.setMinimumSize(dimensionMinimum);
		this.jTableDatosInformacionFinanciera.setMaximumSize(dimensionMaximum);
		this.jTableDatosInformacionFinanciera.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingInformacionFinanciera(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingInformacionFinanciera(esInicializar,true);
	}
	
	public void inicializarActualizarBindingInformacionFinanciera(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaInformacionFinanciera(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesInformacionFinanciera(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasInformacionFinanciera(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesInformacionFinanciera(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesInformacionFinanciera(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !InformacionFinancieraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualInformacionFinanciera() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaInformacionFinanciera();
		
		this.inicializarActualizarBindingBotonesManualInformacionFinanciera(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualInformacionFinanciera();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesInformacionFinanciera() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualInformacionFinanciera(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualInformacionFinanciera(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosInformacionFinanciera.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosInformacionFinanciera.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteInformacionFinanciera.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormInformacionFinanciera.jCheckBoxPostAccionNuevoInformacionFinanciera.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormInformacionFinanciera.jCheckBoxPostAccionSinCerrarInformacionFinanciera.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormInformacionFinanciera.jCheckBoxPostAccionSinMensajeInformacionFinanciera.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosInformacionFinanciera.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosInformacionFinanciera.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteInformacionFinanciera.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
				this.jInternalFrameDetalleFormInformacionFinanciera.jCheckBoxPostAccionNuevoInformacionFinanciera.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormInformacionFinanciera.jCheckBoxPostAccionSinCerrarInformacionFinanciera.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormInformacionFinanciera.jCheckBoxPostAccionSinMensajeInformacionFinanciera.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionInformacionFinanciera.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionInformacionFinanciera.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxTiposAccionesFormularioInformacionFinanciera.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesInformacionFinanciera.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoInformacionFinanciera!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesInformacionFinanciera.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesInformacionFinanciera.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarInformacionFinanciera.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesInformacionFinanciera.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoInformacionFinanciera!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesInformacionFinanciera.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralInformacionFinanciera.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesInformacionFinanciera(Boolean esInicializar) throws Exception {
		try	{	
			if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualInformacionFinanciera(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesInformacionFinanciera() throws Exception {
		try	{
			if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualInformacionFinanciera();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleInformacionFinanciera() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxTiposAccionesFormularioInformacionFinanciera.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxTiposAccionesFormularioInformacionFinanciera.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualInformacionFinanciera() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesInformacionFinanciera.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesInformacionFinanciera.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesInformacionFinanciera.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesInformacionFinanciera.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesInformacionFinanciera.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesInformacionFinanciera.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionInformacionFinanciera.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionInformacionFinanciera.addItem(reporte);
			}
			
			
			if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionInformacionFinanciera.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionInformacionFinanciera.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesInformacionFinanciera.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesInformacionFinanciera.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesInformacionFinanciera.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesInformacionFinanciera.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxTiposAccionesFormularioInformacionFinanciera.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxTiposAccionesFormularioInformacionFinanciera.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarInformacionFinanciera.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarInformacionFinanciera.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarInformacionFinanciera.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualInformacionFinanciera();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualInformacionFinanciera() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoInformacionFinanciera!=null) {
				this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoInformacionFinanciera!=null) {
				this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoInformacionFinanciera!=null) {
				
				if(this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=InformacionFinancieraConstantesFunciones.getTiposSeleccionarInformacionFinanciera(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=InformacionFinancieraConstantesFunciones.getTiposSeleccionarInformacionFinanciera(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=InformacionFinancieraConstantesFunciones.getTiposSeleccionarInformacionFinanciera(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoInformacionFinanciera.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoInformacionFinanciera.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualInformacionFinanciera()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxidclienteFK_IdClienteInformacionFinanciera.getSelectedItem()!=null){this.idclienteFK_IdCliente=((Cliente)this.jComboBoxidclienteFK_IdClienteInformacionFinanciera.getSelectedItem()).getId();}
		if(this.jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.getSelectedItem()!=null){this.idvalorclientemovimientoFK_IdValorClienteMovimiento=((TipoMoviFinan)this.jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasInformacionFinanciera(Boolean esInicializar) throws Exception {				
		if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualInformacionFinanciera();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaInformacionFinanciera() throws Exception {
		this.inicializarActualizarBindingTablaInformacionFinanciera(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByInformacionFinanciera() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByInformacionFinanciera.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByInformacionFinanciera.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByInformacionFinanciera.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new InformacionFinancieraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByInformacionFinanciera.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByInformacionFinanciera.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new InformacionFinancieraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosInformacionFinancieraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionFinancieraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new InformacionFinancieraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByInformacionFinanciera.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByInformacionFinanciera.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new InformacionFinancieraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByInformacionFinanciera.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaInformacionFinanciera(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=informacionfinancieraLogic.getInformacionFinancieras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=informacionfinancieras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosInformacionFinanciera.setModel(new InformacionFinancieraModel(this.informacionfinancieraLogic.getInformacionFinancieras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosInformacionFinanciera.setModel(new InformacionFinancieraModel(this.informacionfinancieras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByInformacionFinanciera!=null && this.jInternalFrameOrderByInformacionFinanciera.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByInformacionFinanciera();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosInformacionFinanciera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionFinanciera,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new InformacionFinancieraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO,informacionfinancieraConstantesFunciones.resaltarSeleccionarInformacionFinanciera,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO,informacionfinancieraConstantesFunciones.resaltarSeleccionarInformacionFinanciera,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosInformacionFinanciera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionFinanciera,InformacionFinancieraConstantesFunciones.LABEL_ID));

		if(this.informacionfinancieraConstantesFunciones.mostraridInformacionFinanciera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionFinancieraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.informacionfinancieraConstantesFunciones.resaltaridInformacionFinanciera,this.informacionfinancieraConstantesFunciones.activaridInformacionFinanciera,iSizeTabla,this,true,"idInformacionFinanciera","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacionfinancieraConstantesFunciones.resaltaridInformacionFinanciera,this.informacionfinancieraConstantesFunciones.activaridInformacionFinanciera,this,true,"idInformacionFinanciera","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionFinanciera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionFinanciera,InformacionFinancieraConstantesFunciones.LABEL_IDEMPRESA));

		if(this.informacionfinancieraConstantesFunciones.mostrarid_empresaInformacionFinanciera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionFinancieraConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.informacionfinancieraConstantesFunciones.resaltarid_empresaInformacionFinanciera,this,this.informacionfinancieraConstantesFunciones.activarid_empresaInformacionFinanciera,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.informacionfinancieraConstantesFunciones.resaltarid_empresaInformacionFinanciera,this,this.informacionfinancieraConstantesFunciones.activarid_empresaInformacionFinanciera,false,"id_empresaInformacionFinanciera","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionFinancieraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionFinanciera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionFinanciera,InformacionFinancieraConstantesFunciones.LABEL_IDCLIENTE));

		if(this.informacionfinancieraConstantesFunciones.mostraridclienteInformacionFinanciera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionFinancieraConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.informacionfinancieraConstantesFunciones.resaltaridclienteInformacionFinanciera,this,this.informacionfinancieraConstantesFunciones.activaridclienteInformacionFinanciera,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.informacionfinancieraConstantesFunciones.resaltaridclienteInformacionFinanciera,this,this.informacionfinancieraConstantesFunciones.activaridclienteInformacionFinanciera,true,"idclienteInformacionFinanciera","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new InformacionFinancieraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionFinanciera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionFinanciera,InformacionFinancieraConstantesFunciones.LABEL_IDTIPOMOVIFINAN));

		if(this.informacionfinancieraConstantesFunciones.mostraridvalorclientemovimientoInformacionFinanciera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionFinancieraConstantesFunciones.LABEL_IDTIPOMOVIFINAN,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoMoviFinanTableCell(this.tipomovifinansForeignKey,this.informacionfinancieraConstantesFunciones.resaltaridvalorclientemovimientoInformacionFinanciera,this,this.informacionfinancieraConstantesFunciones.activaridvalorclientemovimientoInformacionFinanciera,iSizeTabla));
			tableColumn.setCellEditor(new TipoMoviFinanTableCell(this.tipomovifinansForeignKey,this.informacionfinancieraConstantesFunciones.resaltaridvalorclientemovimientoInformacionFinanciera,this,this.informacionfinancieraConstantesFunciones.activaridvalorclientemovimientoInformacionFinanciera,true,"idvalorclientemovimientoInformacionFinanciera","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionFinancieraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionFinanciera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionFinanciera,InformacionFinancieraConstantesFunciones.LABEL_VALOR));

		if(this.informacionfinancieraConstantesFunciones.mostrarvalorInformacionFinanciera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionFinancieraConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.informacionfinancieraConstantesFunciones.resaltarvalorInformacionFinanciera,this.informacionfinancieraConstantesFunciones.activarvalorInformacionFinanciera,iSizeTabla,this,true,"valorInformacionFinanciera","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacionfinancieraConstantesFunciones.resaltarvalorInformacionFinanciera,this.informacionfinancieraConstantesFunciones.activarvalorInformacionFinanciera,this,true,"valorInformacionFinanciera","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new InformacionFinancieraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionFinanciera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionFinanciera,InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION));

		if(this.informacionfinancieraConstantesFunciones.mostrardescripcionInformacionFinanciera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informacionfinancieraConstantesFunciones.resaltardescripcionInformacionFinanciera,this.informacionfinancieraConstantesFunciones.activardescripcionInformacionFinanciera,iSizeTabla,this,true,"descripcionInformacionFinanciera","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacionfinancieraConstantesFunciones.resaltardescripcionInformacionFinanciera,this.informacionfinancieraConstantesFunciones.activardescripcionInformacionFinanciera,this,true,"descripcionInformacionFinanciera","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionFinancieraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionFinanciera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionFinanciera,InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO));

		if(this.informacionfinancieraConstantesFunciones.mostraresactivoInformacionFinanciera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.informacionfinancieraConstantesFunciones.resaltaresactivoInformacionFinanciera,this.informacionfinancieraConstantesFunciones.activaresactivoInformacionFinanciera,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.informacionfinancieraConstantesFunciones.resaltaresactivoInformacionFinanciera,this.informacionfinancieraConstantesFunciones.activaresactivoInformacionFinanciera,this,true,"esactivoInformacionFinanciera","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new InformacionFinancieraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.informacionfinancieraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.informacionfinancieraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosInformacionFinanciera.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.informacionfinancieraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.informacionfinancieraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosInformacionFinanciera.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarInformacionFinanciera && this.isPermisoGuardarCambiosInformacionFinanciera) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.informacionfinancieraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.informacionfinancieraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosInformacionFinanciera.addColumn(tableColumn);
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
			
			this.jTableDatosInformacionFinanciera.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarInformacionFinanciera && this.isPermisoGuardarCambiosInformacionFinanciera) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarInformacionFinanciera && this.isPermisoGuardarCambiosInformacionFinanciera) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosInformacionFinanciera.moveColumn(this.jTableDatosInformacionFinanciera.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosInformacionFinanciera.moveColumn(this.jTableDatosInformacionFinanciera.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosInformacionFinanciera.moveColumn(this.jTableDatosInformacionFinanciera.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosInformacionFinanciera.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosInformacionFinanciera.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosInformacionFinanciera,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!InformacionFinancieraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosInformacionFinanciera.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosInformacionFinanciera.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!InformacionFinancieraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!InformacionFinancieraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosInformacionFinanciera.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosInformacionFinanciera.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosInformacionFinanciera.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=informacionfinancieraLogic.getInformacionFinancieras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=informacionfinancieras.size()-1;
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
		//this.jTableDatosInformacionFinanciera.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosInformacionFinanciera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosInformacionFinanciera();
			
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
				
				//this.isEsNuevoInformacionFinanciera=false;
					
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
			
				if(this.informacionfinancieraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormInformacionFinanciera==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosInformacionFinanciera.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosInformacionFinanciera.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.informacionfinanciera.getsType().equals("DUPLICADO")
				   || this.informacionfinanciera.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoInformacionFinanciera=true;
				
				} else {
					this.isEsNuevoInformacionFinanciera=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
					if(this.informacionfinanciera.getId()>=0 && !this.informacionfinanciera.getIsNew()) {						
						this.isEsNuevoInformacionFinanciera=false;
						
					} else {
						this.isEsNuevoInformacionFinanciera=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoInformacionFinanciera(esRelaciones);						
				
				this.seleccionarInformacionFinanciera(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.informacionfinanciera.getId()<0) {
					this.isEsNuevoInformacionFinanciera=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarInformacionFinanciera(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarInformacionFinanciera(evt,rowIndex);
				}	
				
				if(this.informacionfinancieraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion InformacionFinanciera: " + this.dDif); 
					}
				}								
				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarInformacionFinanciera(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.informacionfinanciera)) {
					if(this.informacionfinanciera.getId()>0) {
						this.informacionfinanciera.setIsDeleted(true);
						
						this.informacionfinancierasEliminados.add(this.informacionfinanciera);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.informacionfinancieraLogic.getInformacionFinancieras().remove(this.informacionfinanciera);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.informacionfinancieras.remove(this.informacionfinanciera);				
					}
					
					
					((InformacionFinancieraModel) this.jTableDatosInformacionFinanciera.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaInformacionFinanciera(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarInformacionFinanciera(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoInformacionFinanciera) {
			
			if(this.jInternalFrameDetalleFormInformacionFinanciera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosInformacionFinanciera.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosInformacionFinanciera.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioInformacionFinanciera(this.informacionfinanciera);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.informacionfinancieraConstantesFunciones.cargarid_empresaInformacionFinanciera || this.informacionfinancieraConstantesFunciones.event_dependid_empresaInformacionFinanciera) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.informacionfinanciera.getid_empresa());
									//this.inicializarActualizarBindingInformacionFinanciera(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(informacionfinanciera.getEmpresa()!=null) {
							this.empresasForeignKey.add(informacionfinanciera.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.informacionfinanciera.getid_empresa(),false,"Formulario");

					//Cliente
					if(!this.informacionfinancieraConstantesFunciones.cargaridclienteInformacionFinanciera || this.informacionfinancieraConstantesFunciones.event_dependidclienteInformacionFinanciera) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.informacionfinanciera.getidcliente());
									//this.inicializarActualizarBindingInformacionFinanciera(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(informacionfinanciera.getCliente()!=null) {
							this.clientesForeignKey.add(informacionfinanciera.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.informacionfinanciera.getidcliente(),false,"Formulario");

					//TipoMoviFinan
					if(!this.informacionfinancieraConstantesFunciones.cargaridvalorclientemovimientoInformacionFinanciera || this.informacionfinancieraConstantesFunciones.event_dependidvalorclientemovimientoInformacionFinanciera) {
						//this.cargarCombosTipoMoviFinansForeignKeyLista(" where id="+this.informacionfinanciera.getidvalorclientemovimiento());
									//this.inicializarActualizarBindingInformacionFinanciera(false,false);
						this.tipomovifinansForeignKey=new ArrayList<TipoMoviFinan>();

						if(informacionfinanciera.getTipoMoviFinan()!=null) {
							this.tipomovifinansForeignKey.add(informacionfinanciera.getTipoMoviFinan());
						}

						this.addItemDefectoCombosForeignKeyTipoMoviFinan();
						this.cargarCombosFrameTipoMoviFinansForeignKey("Todos");
					}
					this.setActualTipoMoviFinanForeignKey(this.informacionfinanciera.getidvalorclientemovimiento(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesInformacionFinanciera("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesInformacionFinanciera(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualInformacionFinanciera() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoInformacionFinanciera(InformacionFinanciera informacionfinanciera) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoInformacionFinanciera(informacionfinanciera,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoInformacionFinanciera(InformacionFinanciera informacionfinanciera,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioInformacionFinanciera(informacionfinanciera);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyInformacionFinanciera(informacionfinanciera,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyInformacionFinanciera(informacionfinanciera);
	}
	
	public void setVariablesObjetoActualToFormularioInformacionFinanciera(InformacionFinanciera informacionfinanciera) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormInformacionFinanciera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormInformacionFinanciera.jLabelidInformacionFinanciera.setText(informacionfinanciera.getId().toString());
			this.jInternalFrameDetalleFormInformacionFinanciera.jTextFieldvalorInformacionFinanciera.setText(informacionfinanciera.getvalor().toString());
			this.jInternalFrameDetalleFormInformacionFinanciera.jTextAreadescripcionInformacionFinanciera.setText(informacionfinanciera.getdescripcion());
			this.jInternalFrameDetalleFormInformacionFinanciera.jCheckBoxesactivoInformacionFinanciera.setSelected(informacionfinanciera.getesactivo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,InformacionFinanciera informacionfinancieraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,informacionfinancieraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,InformacionFinanciera informacionfinancieraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				informacionfinancieraLocal=this.informacionfinanciera;
			} else {
				informacionfinancieraLocal=this.informacionfinancieraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(informacionfinancieraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoInformacionFinanciera(informacionfinancieraLocal,true);
					
					if(informacionfinancieraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(informacionfinancieraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(informacionfinancieraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoInformacionFinanciera(InformacionFinanciera informacionfinanciera,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualInformacionFinanciera(informacionfinanciera,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(informacionfinanciera);
	}
	
	public void setVariablesFormularioToObjetoActualInformacionFinanciera(InformacionFinanciera informacionfinanciera,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualInformacionFinanciera(informacionfinanciera,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualInformacionFinanciera(InformacionFinanciera informacionfinanciera,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormInformacionFinanciera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormInformacionFinanciera.jLabelidInformacionFinanciera.getText()==null || this.jInternalFrameDetalleFormInformacionFinanciera.jLabelidInformacionFinanciera.getText()=="" || this.jInternalFrameDetalleFormInformacionFinanciera.jLabelidInformacionFinanciera.getText()=="Id") {
				this.jInternalFrameDetalleFormInformacionFinanciera.jLabelidInformacionFinanciera.setText("0");
			}

			if(conColumnasBase) {informacionfinanciera.setId(Long.parseLong(this.jInternalFrameDetalleFormInformacionFinanciera.jLabelidInformacionFinanciera.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionFinancieraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionFinanciera.jLabelIdInformacionFinanciera,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacionfinanciera.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormInformacionFinanciera.jTextFieldvalorInformacionFinanciera.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionFinancieraConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionFinanciera.jLabelvalorInformacionFinanciera,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacionfinanciera.setdescripcion(this.jInternalFrameDetalleFormInformacionFinanciera.jTextAreadescripcionInformacionFinanciera.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionFinanciera.jLabeldescripcionInformacionFinanciera,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacionfinanciera.setesactivo(this.jInternalFrameDetalleFormInformacionFinanciera.jCheckBoxesactivoInformacionFinanciera.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionFinanciera.jLabelesactivoInformacionFinanciera,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualInformacionFinanciera(InformacionFinanciera informacionfinancieraBean,InformacionFinanciera informacionfinanciera,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && informacionfinancieraBean.getidcliente()!=null && !informacionfinancieraBean.getidcliente().equals(-1L))) {informacionfinanciera.setidcliente(informacionfinancieraBean.getidcliente());}
			if(conDefault || (!conDefault && informacionfinancieraBean.getidvalorclientemovimiento()!=null && !informacionfinancieraBean.getidvalorclientemovimiento().equals(-1L))) {informacionfinanciera.setidvalorclientemovimiento(informacionfinancieraBean.getidvalorclientemovimiento());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosInformacionFinanciera(InformacionFinanciera informacionfinancieraOrigen,InformacionFinanciera informacionfinanciera,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && informacionfinancieraOrigen.getId()!=null && !informacionfinancieraOrigen.getId().equals(0L))) {informacionfinanciera.setId(informacionfinancieraOrigen.getId());}}
			if(conDefault || (!conDefault && informacionfinancieraOrigen.getidcliente()!=null && !informacionfinancieraOrigen.getidcliente().equals(-1L))) {informacionfinanciera.setidcliente(informacionfinancieraOrigen.getidcliente());}
			if(conDefault || (!conDefault && informacionfinancieraOrigen.getidvalorclientemovimiento()!=null && !informacionfinancieraOrigen.getidvalorclientemovimiento().equals(-1L))) {informacionfinanciera.setidvalorclientemovimiento(informacionfinancieraOrigen.getidvalorclientemovimiento());}
			if(conDefault || (!conDefault && informacionfinancieraOrigen.getvalor()!=null && !informacionfinancieraOrigen.getvalor().equals(0.0))) {informacionfinanciera.setvalor(informacionfinancieraOrigen.getvalor());}
			if(conDefault || (!conDefault && informacionfinancieraOrigen.getdescripcion()!=null && !informacionfinancieraOrigen.getdescripcion().equals(""))) {informacionfinanciera.setdescripcion(informacionfinancieraOrigen.getdescripcion());}
			if(conDefault || (!conDefault && informacionfinancieraOrigen.getesactivo()!=null && !informacionfinancieraOrigen.getesactivo().equals(false))) {informacionfinanciera.setesactivo(informacionfinancieraOrigen.getesactivo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioInformacionFinanciera(InformacionFinanciera informacionfinanciera) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormInformacionFinanciera.jLabelidInformacionFinanciera.setText(informacionfinanciera.getId().toString());
			this.jInternalFrameDetalleFormInformacionFinanciera.jTextFieldvalorInformacionFinanciera.setText(informacionfinanciera.getvalor().toString());
			this.jInternalFrameDetalleFormInformacionFinanciera.jTextAreadescripcionInformacionFinanciera.setText(informacionfinanciera.getdescripcion());
			this.jInternalFrameDetalleFormInformacionFinanciera.jCheckBoxesactivoInformacionFinanciera.setSelected(informacionfinanciera.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioInformacionFinanciera(InformacionFinancieraBean informacionfinancieraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormInformacionFinanciera.jLabelidInformacionFinanciera.setText(informacionfinancieraBean.getId().toString());
			this.jInternalFrameDetalleFormInformacionFinanciera.jTextFieldvalorInformacionFinanciera.setText(informacionfinancieraBean.getvalor().toString());
			this.jInternalFrameDetalleFormInformacionFinanciera.jTextAreadescripcionInformacionFinanciera.setText(informacionfinancieraBean.getdescripcion());
			this.jInternalFrameDetalleFormInformacionFinanciera.jCheckBoxesactivoInformacionFinanciera.setSelected(informacionfinancieraBean.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanInformacionFinanciera(InformacionFinancieraParameterReturnGeneral informacionfinancieraReturnGeneral,InformacionFinancieraBean informacionfinancieraBean,Boolean conDefault) throws Exception { 
		try {
			InformacionFinanciera informacionfinancieraLocal=new InformacionFinanciera();
			
			informacionfinancieraLocal=informacionfinancieraReturnGeneral.getInformacionFinanciera();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && informacionfinancieraLocal.getId()!=null && !informacionfinancieraLocal.getId().equals(0L))) {informacionfinancieraBean.setId(informacionfinancieraLocal.getId());}}
			if(conDefault || (!conDefault && informacionfinancieraLocal.getidcliente()!=null && !informacionfinancieraLocal.getidcliente().equals(-1L))) {informacionfinancieraBean.setidcliente(informacionfinancieraLocal.getidcliente());}
			if(conDefault || (!conDefault && informacionfinancieraLocal.getidvalorclientemovimiento()!=null && !informacionfinancieraLocal.getidvalorclientemovimiento().equals(-1L))) {informacionfinancieraBean.setidvalorclientemovimiento(informacionfinancieraLocal.getidvalorclientemovimiento());}
			if(conDefault || (!conDefault && informacionfinancieraLocal.getvalor()!=null && !informacionfinancieraLocal.getvalor().equals(0.0))) {informacionfinancieraBean.setvalor(informacionfinancieraLocal.getvalor());}
			if(conDefault || (!conDefault && informacionfinancieraLocal.getdescripcion()!=null && !informacionfinancieraLocal.getdescripcion().equals(""))) {informacionfinancieraBean.setdescripcion(informacionfinancieraLocal.getdescripcion());}
			if(conDefault || (!conDefault && informacionfinancieraLocal.getesactivo()!=null && !informacionfinancieraLocal.getesactivo().equals(false))) {informacionfinancieraBean.setesactivo(informacionfinancieraLocal.getesactivo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxInformacionFinancieraGenerico(Long idInformacionFinancieraSeleccionado,JComboBox jComboBoxInformacionFinanciera,List<InformacionFinanciera> informacionfinancierasLocal)throws Exception {
		try {
			InformacionFinanciera  informacionfinancieraTemp=null;

			for(InformacionFinanciera informacionfinancieraAux:informacionfinancierasLocal) {
				if(informacionfinancieraAux.getId()!=null && informacionfinancieraAux.getId().equals(idInformacionFinancieraSeleccionado)) {
					informacionfinancieraTemp=informacionfinancieraAux;
					break;
				}
			}

			jComboBoxInformacionFinanciera.setSelectedItem(informacionfinancieraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxInformacionFinancieraGenerico(JComboBox jComboBoxInformacionFinanciera,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxInformacionFinanciera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxInformacionFinanciera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxInformacionFinanciera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxInformacionFinanciera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxInformacionFinanciera.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxInformacionFinanciera.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxInformacionFinanciera.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxInformacionFinanciera.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxInformacionFinanciera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxInformacionFinanciera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			informacionfinanciera=(InformacionFinanciera) informacionfinancieraLogic.getInformacionFinancieras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			informacionfinanciera =(InformacionFinanciera) informacionfinancieras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!informacionfinanciera.getIsNew() && !informacionfinanciera.getIsChanged() && !informacionfinanciera.getIsDeleted()) {
				sDescripcion=informacionfinanciera.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=informacionfinanciera.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!informacionfinanciera.getIsNew() && !informacionfinanciera.getIsChanged() && !informacionfinanciera.getIsDeleted()) {
				sDescripcion=informacionfinanciera.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=informacionfinanciera.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoMoviFinan")) {
			//sDescripcion=this.getActualTipoMoviFinanForeignKeyDescripcion((Long)value);
			if(!informacionfinanciera.getIsNew() && !informacionfinanciera.getIsChanged() && !informacionfinanciera.getIsDeleted()) {
				sDescripcion=informacionfinanciera.gettipomovifinan_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMoviFinanForeignKeyDescripcion((Long)value);
				sDescripcion=informacionfinanciera.gettipomovifinan_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		InformacionFinanciera informacionfinancieraRow=new InformacionFinanciera();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			informacionfinancieraRow=(InformacionFinanciera) informacionfinancieraLogic.getInformacionFinancieras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			informacionfinancieraRow=(InformacionFinanciera) informacionfinancieras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualInformacionFinanciera(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoInformacionFinanciera.setVisible((this.isVisibilidadCeldaNuevoInformacionFinanciera && this.isPermisoNuevoInformacionFinanciera));			
			this.jButtonDuplicarInformacionFinanciera.setVisible((this.isVisibilidadCeldaDuplicarInformacionFinanciera && this.isPermisoDuplicarInformacionFinanciera));			
			this.jButtonCopiarInformacionFinanciera.setVisible((this.isVisibilidadCeldaCopiarInformacionFinanciera && this.isPermisoCopiarInformacionFinanciera));
			this.jButtonVerFormInformacionFinanciera.setVisible((this.isVisibilidadCeldaVerFormInformacionFinanciera && this.isPermisoVerFormInformacionFinanciera));
			
			this.jButtonAbrirOrderByInformacionFinanciera.setVisible((this.isVisibilidadCeldaOrdenInformacionFinanciera && this.isPermisoOrdenInformacionFinanciera));			
			
			this.jButtonNuevoRelacionesInformacionFinanciera.setVisible((this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera && this.isPermisoNuevoInformacionFinanciera));			
			this.jButtonNuevoGuardarCambiosInformacionFinanciera.setVisible((this.isVisibilidadCeldaNuevoInformacionFinanciera && this.isPermisoNuevoInformacionFinanciera && this.isPermisoGuardarCambiosInformacionFinanciera));
			
			if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonModificarInformacionFinanciera.setVisible((this.isVisibilidadCeldaModificarInformacionFinanciera && this.isPermisoActualizarInformacionFinanciera));	
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonActualizarInformacionFinanciera.setVisible((this.isVisibilidadCeldaActualizarInformacionFinanciera && this.isPermisoActualizarInformacionFinanciera));	
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonEliminarInformacionFinanciera.setVisible((this.isVisibilidadCeldaEliminarInformacionFinanciera && this.isPermisoEliminarInformacionFinanciera));
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonCancelarInformacionFinanciera.setVisible(this.isVisibilidadCeldaCancelarInformacionFinanciera);							
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonGuardarCambiosInformacionFinanciera.setVisible((this.isVisibilidadCeldaGuardarInformacionFinanciera && this.isPermisoGuardarCambiosInformacionFinanciera));			
			
			}
						
			this.jButtonGuardarCambiosTablaInformacionFinanciera.setVisible((this.isVisibilidadCeldaGuardarCambiosInformacionFinanciera && this.isPermisoGuardarCambiosInformacionFinanciera));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarInformacionFinanciera.setVisible((this.isVisibilidadCeldaNuevoInformacionFinanciera && this.isPermisoNuevoInformacionFinanciera));						
			this.jButtonDuplicarToolBarInformacionFinanciera.setVisible((this.isVisibilidadCeldaDuplicarInformacionFinanciera && this.isPermisoDuplicarInformacionFinanciera));						
			this.jButtonCopiarToolBarInformacionFinanciera.setVisible((this.isVisibilidadCeldaCopiarInformacionFinanciera && this.isPermisoCopiarInformacionFinanciera));			
			this.jButtonVerFormToolBarInformacionFinanciera.setVisible((this.isVisibilidadCeldaVerFormInformacionFinanciera && this.isPermisoVerFormInformacionFinanciera));			
			this.jButtonAbrirOrderByToolBarInformacionFinanciera.setVisible((this.isVisibilidadCeldaOrdenInformacionFinanciera && this.isPermisoOrdenInformacionFinanciera));
			this.jButtonNuevoRelacionesToolBarInformacionFinanciera.setVisible((this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera && this.isPermisoNuevoInformacionFinanciera));			
			this.jButtonNuevoGuardarCambiosToolBarInformacionFinanciera.setVisible((this.isVisibilidadCeldaNuevoInformacionFinanciera && this.isPermisoNuevoInformacionFinanciera && this.isPermisoGuardarCambiosInformacionFinanciera));			
			
			if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonModificarToolBarInformacionFinanciera.setVisible((this.isVisibilidadCeldaModificarInformacionFinanciera && this.isPermisoActualizarInformacionFinanciera));	
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonActualizarToolBarInformacionFinanciera.setVisible((this.isVisibilidadCeldaActualizarInformacionFinanciera  && this.isPermisoActualizarInformacionFinanciera));	
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonEliminarToolBarInformacionFinanciera.setVisible((this.isVisibilidadCeldaEliminarInformacionFinanciera && this.isPermisoEliminarInformacionFinanciera));
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonCancelarToolBarInformacionFinanciera.setVisible(this.isVisibilidadCeldaCancelarInformacionFinanciera);				
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonGuardarCambiosToolBarInformacionFinanciera.setVisible((this.isVisibilidadCeldaGuardarInformacionFinanciera && this.isPermisoGuardarCambiosInformacionFinanciera));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarInformacionFinanciera.setVisible((this.isVisibilidadCeldaGuardarCambiosInformacionFinanciera && this.isPermisoGuardarCambiosInformacionFinanciera));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoInformacionFinanciera.setVisible((this.isVisibilidadCeldaNuevoInformacionFinanciera && this.isPermisoNuevoInformacionFinanciera));			
			this.jMenuItemDuplicarInformacionFinanciera.setVisible((this.isVisibilidadCeldaDuplicarInformacionFinanciera && this.isPermisoDuplicarInformacionFinanciera));			
			this.jMenuItemCopiarInformacionFinanciera.setVisible((this.isVisibilidadCeldaCopiarInformacionFinanciera && this.isPermisoCopiarInformacionFinanciera));			
			this.jMenuItemVerFormInformacionFinanciera.setVisible((this.isVisibilidadCeldaVerFormInformacionFinanciera && this.isPermisoVerFormInformacionFinanciera));			
			this.jMenuItemAbrirOrderByInformacionFinanciera.setVisible((this.isVisibilidadCeldaOrdenInformacionFinanciera && this.isPermisoOrdenInformacionFinanciera));			
			//this.jMenuItemMostrarOcultarInformacionFinanciera.setVisible((this.isVisibilidadCeldaOrdenInformacionFinanciera && this.isPermisoOrdenInformacionFinanciera));
			this.jMenuItemDetalleAbrirOrderByInformacionFinanciera.setVisible((this.isVisibilidadCeldaOrdenInformacionFinanciera && this.isPermisoOrdenInformacionFinanciera));			
			//this.jMenuItemDetalleMostrarOcultarInformacionFinanciera.setVisible((this.isVisibilidadCeldaOrdenInformacionFinanciera && this.isPermisoOrdenInformacionFinanciera));			
			this.jMenuItemNuevoRelacionesInformacionFinanciera.setVisible((this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera && this.isPermisoNuevoInformacionFinanciera));			
			this.jMenuItemNuevoGuardarCambiosInformacionFinanciera.setVisible((this.isVisibilidadCeldaNuevoInformacionFinanciera && this.isPermisoNuevoInformacionFinanciera && this.isPermisoGuardarCambiosInformacionFinanciera));									
			
			if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
			this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemModificarInformacionFinanciera.setVisible((this.isVisibilidadCeldaModificarInformacionFinanciera && this.isPermisoActualizarInformacionFinanciera));	
			this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemActualizarInformacionFinanciera.setVisible((this.isVisibilidadCeldaActualizarInformacionFinanciera && this.isPermisoActualizarInformacionFinanciera));	
			this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemEliminarInformacionFinanciera.setVisible((this.isVisibilidadCeldaEliminarInformacionFinanciera && this.isPermisoEliminarInformacionFinanciera));
			this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemCancelarInformacionFinanciera.setVisible(this.isVisibilidadCeldaCancelarInformacionFinanciera);				
			}
			
			this.jMenuItemGuardarCambiosInformacionFinanciera.setVisible((this.isVisibilidadCeldaGuardarInformacionFinanciera && this.isPermisoGuardarCambiosInformacionFinanciera));						
			this.jMenuItemGuardarCambiosTablaInformacionFinanciera.setVisible((this.isVisibilidadCeldaGuardarCambiosInformacionFinanciera && this.isPermisoGuardarCambiosInformacionFinanciera));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoInformacionFinanciera=this.jButtonNuevoInformacionFinanciera.isVisible();
			this.isVisibilidadCeldaDuplicarInformacionFinanciera=this.jButtonDuplicarInformacionFinanciera.isVisible();
			this.isVisibilidadCeldaCopiarInformacionFinanciera=this.jButtonCopiarInformacionFinanciera.isVisible();
			this.isVisibilidadCeldaVerFormInformacionFinanciera=this.jButtonVerFormInformacionFinanciera.isVisible();
			
			this.isVisibilidadCeldaOrdenInformacionFinanciera=this.jButtonAbrirOrderByInformacionFinanciera.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera=this.jButtonNuevoRelacionesInformacionFinanciera.isVisible();
			this.isVisibilidadCeldaModificarInformacionFinanciera=this.jButtonModificarInformacionFinanciera.isVisible();
			
			if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
			this.isVisibilidadCeldaActualizarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jButtonActualizarInformacionFinanciera.isVisible();
			this.isVisibilidadCeldaEliminarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jButtonEliminarInformacionFinanciera.isVisible();
			this.isVisibilidadCeldaCancelarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jButtonCancelarInformacionFinanciera.isVisible();
			this.isVisibilidadCeldaGuardarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jButtonGuardarCambiosInformacionFinanciera.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosInformacionFinanciera=this.jButtonGuardarCambiosTablaInformacionFinanciera.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoInformacionFinanciera=this.jButtonNuevoToolBarInformacionFinanciera.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera=this.jButtonNuevoRelacionesToolBarInformacionFinanciera.isVisible();
			
			if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
			this.isVisibilidadCeldaModificarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jButtonModificarToolBarInformacionFinanciera.isVisible();
			this.isVisibilidadCeldaActualizarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jButtonActualizarToolBarInformacionFinanciera.isVisible();
			this.isVisibilidadCeldaEliminarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jButtonEliminarToolBarInformacionFinanciera.isVisible();
			this.isVisibilidadCeldaCancelarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jButtonCancelarToolBarInformacionFinanciera.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarInformacionFinanciera=this.jButtonGuardarCambiosToolBarInformacionFinanciera.isVisible();
			this.isVisibilidadCeldaGuardarCambiosInformacionFinanciera=this.jButtonGuardarCambiosTablaToolBarInformacionFinanciera.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoInformacionFinanciera=this.jMenuItemNuevoInformacionFinanciera.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera=this.jMenuItemNuevoRelacionesInformacionFinanciera.isVisible();
			
			if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
			this.isVisibilidadCeldaModificarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemModificarInformacionFinanciera.isVisible();
			this.isVisibilidadCeldaActualizarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemActualizarInformacionFinanciera.isVisible();
			this.isVisibilidadCeldaEliminarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemEliminarInformacionFinanciera.isVisible();
			this.isVisibilidadCeldaCancelarInformacionFinanciera=this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemCancelarInformacionFinanciera.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarInformacionFinanciera=this.jMenuItemGuardarCambiosInformacionFinanciera.isVisible();
			this.isVisibilidadCeldaGuardarCambiosInformacionFinanciera=this.jMenuItemGuardarCambiosTablaInformacionFinanciera.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesInformacionFinanciera(Boolean esInicializar) {
		if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.informacionfinancieraSessionBean.getConGuardarRelaciones()) {
				//if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesInformacionFinanciera();
			}
			
			this.inicializarActualizarBindingBotonesManualInformacionFinanciera(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualInformacionFinanciera() {
		this.jButtonNuevoInformacionFinanciera.setVisible(this.isPermisoNuevoInformacionFinanciera);			
		this.jButtonDuplicarInformacionFinanciera.setVisible(this.isPermisoDuplicarInformacionFinanciera);			
		this.jButtonCopiarInformacionFinanciera.setVisible(this.isPermisoCopiarInformacionFinanciera);			
		this.jButtonVerFormInformacionFinanciera.setVisible(this.isPermisoVerFormInformacionFinanciera);			
		
		this.jButtonAbrirOrderByInformacionFinanciera.setVisible(this.isPermisoOrdenInformacionFinanciera);					
		
		this.jButtonNuevoRelacionesInformacionFinanciera.setVisible(this.isPermisoNuevoInformacionFinanciera);			
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonModificarInformacionFinanciera.setVisible(this.isPermisoActualizarInformacionFinanciera);	
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonActualizarInformacionFinanciera.setVisible(this.isPermisoActualizarInformacionFinanciera);	
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonEliminarInformacionFinanciera.setVisible(this.isPermisoEliminarInformacionFinanciera);
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonCancelarInformacionFinanciera.setVisible(this.isVisibilidadCeldaCancelarInformacionFinanciera);						
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonGuardarCambiosInformacionFinanciera.setVisible(this.isPermisoGuardarCambiosInformacionFinanciera);							
		}
		
		this.jButtonGuardarCambiosTablaInformacionFinanciera.setVisible(this.isPermisoActualizarInformacionFinanciera);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleInformacionFinanciera() {
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonModificarInformacionFinanciera.setVisible(this.isPermisoActualizarInformacionFinanciera);	
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonActualizarInformacionFinanciera.setVisible(this.isPermisoActualizarInformacionFinanciera);	
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonEliminarInformacionFinanciera.setVisible(this.isPermisoEliminarInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonCancelarInformacionFinanciera.setVisible(this.isVisibilidadCeldaCancelarInformacionFinanciera);							
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonGuardarCambiosInformacionFinanciera.setVisible((this.isVisibilidadCeldaGuardarInformacionFinanciera && this.isPermisoGuardarCambiosInformacionFinanciera));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosInformacionFinanciera() {
		if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualInformacionFinanciera();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesInformacionFinanciera() {
	}
	
	public void jTableDatosInformacionFinancieraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarInformacionFinanciera(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidInformacionFinancieraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.getinformacionfinanciera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionfinanciera==null) {
						this.informacionfinanciera = new InformacionFinanciera();
					}

					this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.informacionfinanciera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
				}

				if(this.informacionfinanciera.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.informacionfinanciera.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionFinanciera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaInformacionFinancieraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebInformacionFinanciera(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosInformacionFinanciera.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosInformacionFinanciera.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.getinformacionfinanciera(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.informacionfinancieraLogic.getConnexion());

				if(this.informacionfinanciera.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.informacionfinanciera.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderInformacionFinanciera=(TitledBorder)this.jScrollPanelDatosInformacionFinanciera.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderInformacionFinanciera.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaInformacionFinancieraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.getinformacionfinanciera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionfinanciera==null) {
						this.informacionfinanciera = new InformacionFinanciera();
					}

					this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.informacionfinanciera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
				}

				if(this.informacionfinanciera.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.informacionfinanciera.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionFinanciera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidclienteInformacionFinancieraActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderInformacionFinanciera=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosInformacionFinanciera.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderInformacionFinanciera=(TitledBorder)this.jScrollPanelDatosInformacionFinanciera.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderInformacionFinanciera.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonidclienteInformacionFinancieraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebInformacionFinanciera(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosInformacionFinanciera.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosInformacionFinanciera.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.getinformacionfinanciera(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.informacionfinancieraLogic.getConnexion());

				if(this.informacionfinanciera.getidcliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.informacionfinanciera.getidcliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderInformacionFinanciera=(TitledBorder)this.jScrollPanelDatosInformacionFinanciera.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderInformacionFinanciera.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidclienteInformacionFinancieraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.getinformacionfinanciera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionfinanciera==null) {
						this.informacionfinanciera = new InformacionFinanciera();
					}

					this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.informacionfinanciera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
				}

				if(this.informacionfinanciera.getidcliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idcliente = "+this.informacionfinanciera.getidcliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionFinanciera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidvalorclientemovimientoInformacionFinancieraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomovifinan=true;

			idTienePermisotipomovifinan=this.tienePermisosUsuarioEnPaginaWebInformacionFinanciera(TipoMoviFinanConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomovifinan) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosInformacionFinanciera.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosInformacionFinanciera.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.getinformacionfinanciera(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);

				this.tipomovifinanBeanSwingJInternalFrame=new TipoMoviFinanBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomovifinanBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomovifinanBeanSwingJInternalFrame.getTipoMoviFinanLogic().setConnexion(this.informacionfinancieraLogic.getConnexion());

				if(this.informacionfinanciera.getidvalorclientemovimiento()!=null) {
					this.tipomovifinanBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomovifinanBeanSwingJInternalFrame.setIdActual(this.informacionfinanciera.getidvalorclientemovimiento());
					this.tipomovifinanBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomovifinanBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomovifinanBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMoviFinan();
				}

				JInternalFrameBase jinternalFrame =this.tipomovifinanBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderInformacionFinanciera=(TitledBorder)this.jScrollPanelDatosInformacionFinanciera.getBorder();
				TitledBorder titledBordertipomovifinan=(TitledBorder)this.tipomovifinanBeanSwingJInternalFrame.jScrollPanelDatosTipoMoviFinan.getBorder();

				titledBordertipomovifinan.setTitle(titledBorderInformacionFinanciera.getTitle() + " -> Tipo Movi Finan");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidvalorclientemovimientoInformacionFinancieraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.getinformacionfinanciera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionfinanciera==null) {
						this.informacionfinanciera = new InformacionFinanciera();
					}

					this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.informacionfinanciera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
				}

				if(this.informacionfinanciera.getidvalorclientemovimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idvalorclientemovimiento = "+this.informacionfinanciera.getidvalorclientemovimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionFinanciera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorInformacionFinancieraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.getinformacionfinanciera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionfinanciera==null) {
						this.informacionfinanciera = new InformacionFinanciera();
					}

					this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.informacionfinanciera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
				}

				if(this.informacionfinanciera.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.informacionfinanciera.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionFinanciera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionInformacionFinancieraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.getinformacionfinanciera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionfinanciera==null) {
						this.informacionfinanciera = new InformacionFinanciera();
					}

					this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.informacionfinanciera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
				}

				if(this.informacionfinanciera.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.informacionfinanciera.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionFinanciera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesactivoInformacionFinancieraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.getinformacionfinanciera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacionfinanciera==null) {
						this.informacionfinanciera = new InformacionFinanciera();
					}

					this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.informacionfinanciera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);
				}

				if(this.informacionfinanciera.getesactivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esactivo = "+this.informacionfinanciera.getesactivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionFinanciera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingInformacionFinanciera(false,false);

			this.getInformacionFinancierasFK_IdCliente();

			this.inicializarActualizarBindingInformacionFinanciera(false);

			//if(InformacionFinancieraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingInformacionFinanciera(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingInformacionFinanciera(false,false);

			this.getInformacionFinancierasFK_IdEmpresa();

			this.inicializarActualizarBindingInformacionFinanciera(false);

			//if(InformacionFinancieraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingInformacionFinanciera(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdValorClienteMovimientoInformacionFinancieraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingInformacionFinanciera(false,false);

			this.getInformacionFinancierasFK_IdValorClienteMovimiento();

			this.inicializarActualizarBindingInformacionFinanciera(false);

			//if(InformacionFinancieraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingInformacionFinanciera(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacionfinancieraLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameInformacionFinanciera() {
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
			this.jInternalFrameDetalleFormInformacionFinanciera.setVisible(false);	    			
			this.jInternalFrameDetalleFormInformacionFinanciera.dispose();
			this.jInternalFrameDetalleFormInformacionFinanciera=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoInformacionFinanciera!=null) {
			this.jInternalFrameReporteDinamicoInformacionFinanciera.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoInformacionFinanciera.dispose();
			this.jInternalFrameReporteDinamicoInformacionFinanciera=null;
		}
		
		if(this.jInternalFrameImportacionInformacionFinanciera!=null) {
			this.jInternalFrameImportacionInformacionFinanciera.setVisible(false);	    			
			this.jInternalFrameImportacionInformacionFinanciera.dispose();
			this.jInternalFrameImportacionInformacionFinanciera=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessInformacionFinanciera();
			
			InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
			
			
			if(sTipo.equals("NuevoInformacionFinanciera")) {
				jButtonNuevoInformacionFinancieraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarInformacionFinanciera")) {
				jButtonDuplicarInformacionFinancieraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarInformacionFinanciera")) {
				jButtonCopiarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("VerFormInformacionFinanciera")) {
				jButtonVerFormInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarInformacionFinanciera")) {
				jButtonNuevoInformacionFinancieraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarInformacionFinanciera")) {
				jButtonDuplicarInformacionFinancieraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoInformacionFinanciera")) {
				jButtonNuevoInformacionFinancieraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarInformacionFinanciera")) {
				jButtonDuplicarInformacionFinancieraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesInformacionFinanciera")) {
				jButtonNuevoInformacionFinancieraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarInformacionFinanciera")) {
				jButtonNuevoInformacionFinancieraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesInformacionFinanciera")) {
				jButtonNuevoInformacionFinancieraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarInformacionFinanciera")) {
				jButtonModificarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarInformacionFinanciera")) {
				jButtonModificarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarInformacionFinanciera")) {
				jButtonModificarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarInformacionFinanciera")) {
				jButtonActualizarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarInformacionFinanciera")) {
				jButtonActualizarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarInformacionFinanciera")) {
				jButtonActualizarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("EliminarInformacionFinanciera")) {
				jButtonEliminarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarInformacionFinanciera")) {
				jButtonEliminarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarInformacionFinanciera")) {
				jButtonEliminarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("CancelarInformacionFinanciera")) {
				jButtonCancelarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarInformacionFinanciera")) {
				jButtonCancelarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarInformacionFinanciera")) {
				jButtonCancelarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("CerrarInformacionFinanciera")) {
				jButtonCerrarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarInformacionFinanciera")) {
				jButtonCerrarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarInformacionFinanciera")) {
				jButtonCerrarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarInformacionFinanciera")) {
				jButtonMostrarOcultarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarInformacionFinanciera")) {
				jButtonCancelarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosInformacionFinanciera")) {
				jButtonGuardarCambiosInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarInformacionFinanciera")) {
				jButtonGuardarCambiosInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarInformacionFinanciera")) {
				jButtonCopiarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarInformacionFinanciera")) {
				jButtonVerFormInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosInformacionFinanciera")) {
				jButtonGuardarCambiosInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarInformacionFinanciera")) {
				jButtonCopiarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormInformacionFinanciera")) {
				jButtonVerFormInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaInformacionFinanciera")) {
				jButtonGuardarCambiosInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarInformacionFinanciera")) {
				jButtonGuardarCambiosInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaInformacionFinanciera")) {
				jButtonGuardarCambiosInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionInformacionFinanciera")) {
				jButtonRecargarInformacionInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarInformacionFinanciera")) {
				jButtonRecargarInformacionInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionInformacionFinanciera")) {
				jButtonRecargarInformacionInformacionFinancieraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresInformacionFinanciera")) {
				jButtonAnterioresInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarInformacionFinanciera")) {
				jButtonAnterioresInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreInformacionFinanciera")) {
				jButtonAnterioresInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesInformacionFinanciera")) {
				jButtonSiguientesInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarInformacionFinanciera")) {
				jButtonSiguientesInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesInformacionFinanciera")) {
				jButtonSiguientesInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByInformacionFinanciera") || sTipo.equals("MenuItemDetalleAbrirOrderByInformacionFinanciera")) {
				jButtonAbrirOrderByInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarInformacionFinanciera") || sTipo.equals("MenuItemDetalleMostrarOcultarInformacionFinanciera")) {
				jButtonMostrarOcultarInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosInformacionFinanciera")) {
				jButtonNuevoGuardarCambiosInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarInformacionFinanciera")) {
				jButtonNuevoGuardarCambiosInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosInformacionFinanciera")) {
				jButtonNuevoGuardarCambiosInformacionFinancieraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoInformacionFinanciera")) {
				jButtonCerrarReporteDinamicoInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoInformacionFinanciera")) {
				jButtonGenerarReporteDinamicoInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoInformacionFinanciera")) {
				
				jButtonGenerarExcelReporteDinamicoInformacionFinancieraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionInformacionFinanciera")) {
				jButtonCerrarImportacionInformacionFinancieraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionInformacionFinanciera")) {
				
				jButtonGenerarImportacionInformacionFinancieraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionInformacionFinanciera")) {
				
				jButtonAbrirImportacionInformacionFinancieraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesInformacionFinanciera")) {
				jComboBoxTiposAccionesInformacionFinancieraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesInformacionFinanciera")) {
				jComboBoxTiposRelacionesInformacionFinancieraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioInformacionFinanciera")) {
				jComboBoxTiposAccionesInformacionFinancieraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarInformacionFinanciera")) {
				
				jComboBoxTiposSeleccionarInformacionFinancieraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralInformacionFinanciera")) {
				jTextFieldValorCampoGeneralInformacionFinancieraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByInformacionFinanciera")) {
				jButtonAbrirOrderByInformacionFinancieraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarInformacionFinanciera")) {
				jButtonAbrirOrderByInformacionFinancieraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByInformacionFinanciera")) {
				jButtonCerrarOrderByInformacionFinancieraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idInformacionFinancieraBusqueda")) {
				this.jButtonidInformacionFinancieraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaInformacionFinancieraUpdate")) {
				this.jButtonid_empresaInformacionFinancieraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaInformacionFinancieraBusqueda")) {
				this.jButtonid_empresaInformacionFinancieraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteInformacionFinanciera")) {
				this.jButtonidclienteInformacionFinancieraActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteInformacionFinancieraUpdate")) {
				this.jButtonidclienteInformacionFinancieraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteInformacionFinancieraBusqueda")) {
				this.jButtonidclienteInformacionFinancieraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientemovimientoInformacionFinancieraUpdate")) {
				this.jButtonidvalorclientemovimientoInformacionFinancieraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientemovimientoInformacionFinancieraBusqueda")) {
				this.jButtonidvalorclientemovimientoInformacionFinancieraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorInformacionFinancieraBusqueda")) {
				this.jButtonvalorInformacionFinancieraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionInformacionFinancieraBusqueda")) {
				this.jButtondescripcionInformacionFinancieraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoInformacionFinancieraBusqueda")) {
				this.jButtonesactivoInformacionFinancieraBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("idclienteInformacionFinanciera")) {
				this.jButtonidclienteInformacionFinancieraActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteInformacionFinanciera")) {
				this.jButtonFK_IdClienteInformacionFinancieraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdValorClienteMovimientoInformacionFinanciera")) {
				this.jButtonFK_IdValorClienteMovimientoInformacionFinancieraActionPerformed(evt);
			}
			
			;
			
			
			InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessInformacionFinanciera();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionFinancieraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionfinanciera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionfinanciera);
				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
				
				


				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionFinanciera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionFinanciera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			InformacionFinanciera informacionfinancieraLocal=null;
			
			if(!this.getEsControlTabla()) {
				informacionfinancieraLocal=this.informacionfinanciera;
			} else {
				informacionfinancieraLocal=this.informacionfinancieraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionfinanciera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionfinanciera);
				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
							
				
				


				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionFinanciera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionFinanciera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionFinancieraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraAnterior =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacionfinancieraAnterior =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
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
			
			InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
			
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
			
			


			
			InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionFinancieraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionfinanciera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionfinanciera);
				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
								
						
				


				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionFinanciera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionFinanciera.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionfinanciera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionfinanciera);
				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
								
				
				


				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionFinanciera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionFinanciera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionFinancieraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraAnterior =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacionfinancieraAnterior =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionfinanciera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionfinanciera);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionFinancieraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraAnterior =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacionfinancieraAnterior =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionFinancieraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionfinanciera);
			
			this.actualizarInformacion("INFO_PADRE",false,this.informacionfinanciera);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionfinanciera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionfinanciera);
				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
							
				
				


				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionFinanciera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionFinanciera.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionFinancieraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionfinancieraAnterior =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.informacionfinancieraAnterior =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
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
			
			InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
			
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
			
			


			
			InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionFinancieraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionfinanciera);
			
			this.actualizarInformacion("INFO_PADRE",false,this.informacionfinanciera);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionfinanciera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionfinanciera);
				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
								
				
				


				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionFinanciera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionFinanciera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionFinancieraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraAnterior =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacionfinancieraAnterior =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionFinancieraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionfinanciera);
			
			this.actualizarInformacion("INFO_PADRE",false,this.informacionfinanciera);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionFinancieraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionfinanciera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionfinanciera);
				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosInformacionFinanciera")) {
					jCheckBoxSeleccionarTodosInformacionFinancieraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosInformacionFinanciera")) {
					jCheckBoxSeleccionadosInformacionFinancieraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarInformacionFinanciera")) {
					
				}
				
				


				
				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionFinanciera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionFinanciera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionfinanciera);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.informacionfinanciera);
				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
												
				
				


				
				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionFinanciera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionFinanciera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionFinancieraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacionfinancieraAnterior =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.informacionfinancieraAnterior =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionFinancieraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionfinanciera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionfinanciera);
				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
				
				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
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
			
			InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
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
			
			


			
			InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionFinancieraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionfinanciera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionfinanciera);
				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionFinanciera.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionFinanciera.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacionfinanciera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacionfinanciera);
				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
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
				
				


				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionFinanciera.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionFinanciera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionFinancieraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacionfinancieraAnterior =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacionfinancieraAnterior =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarInformacionFinanciera")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosInformacionFinancieraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosInformacionFinanciera.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.informacionfinanciera =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.informacionfinanciera);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarInformacionFinanciera")) {
				
				}
				
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarInformacionFinanciera")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosInformacionFinanciera.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarInformacionFinanciera")) {
			
			}
			
			InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessInformacionFinanciera();
			
			InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
			
			if(sTipo.equals("NuevoInformacionFinanciera")) {
				jButtonNuevoInformacionFinancieraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarInformacionFinanciera")) {
				jButtonDuplicarInformacionFinancieraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarInformacionFinanciera")) {
				jButtonCopiarInformacionFinancieraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormInformacionFinanciera")) {
				jButtonVerFormInformacionFinancieraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesInformacionFinanciera")) {
				jButtonNuevoInformacionFinancieraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarInformacionFinanciera")) {
				jButtonModificarInformacionFinancieraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarInformacionFinanciera")) {
				jButtonActualizarInformacionFinancieraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarInformacionFinanciera")) {
				jButtonEliminarInformacionFinancieraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaInformacionFinanciera")) {
				jButtonGuardarCambiosInformacionFinancieraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarInformacionFinanciera")) {
				jButtonCancelarInformacionFinancieraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarInformacionFinanciera")) {
				jButtonCerrarInformacionFinancieraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosInformacionFinanciera")) {
				jButtonGuardarCambiosInformacionFinancieraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosInformacionFinanciera")) {
				jButtonNuevoGuardarCambiosInformacionFinancieraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByInformacionFinanciera")) {
				jButtonAbrirOrderByInformacionFinancieraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionInformacionFinanciera")) {
				jButtonRecargarInformacionInformacionFinancieraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresInformacionFinanciera")) {
				jButtonAnterioresInformacionFinancieraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesInformacionFinanciera")) {
				jButtonSiguientesInformacionFinancieraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idInformacionFinancieraBusqueda")) {
				this.jButtonidInformacionFinancieraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaInformacionFinancieraUpdate")) {
				this.jButtonid_empresaInformacionFinancieraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaInformacionFinancieraBusqueda")) {
				this.jButtonid_empresaInformacionFinancieraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteInformacionFinanciera")) {
				this.jButtonidclienteInformacionFinancieraActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteInformacionFinancieraUpdate")) {
				this.jButtonidclienteInformacionFinancieraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteInformacionFinancieraBusqueda")) {
				this.jButtonidclienteInformacionFinancieraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientemovimientoInformacionFinancieraUpdate")) {
				this.jButtonidvalorclientemovimientoInformacionFinancieraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientemovimientoInformacionFinancieraBusqueda")) {
				this.jButtonidvalorclientemovimientoInformacionFinancieraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorInformacionFinancieraBusqueda")) {
				this.jButtonvalorInformacionFinancieraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionInformacionFinancieraBusqueda")) {
				this.jButtondescripcionInformacionFinancieraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoInformacionFinancieraBusqueda")) {
				this.jButtonesactivoInformacionFinancieraBusquedaActionPerformed(evt);
			}
			
			InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessInformacionFinanciera();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameInformacionFinanciera")) {
				closingInternalFrameInformacionFinanciera();
				
			} else if(sTipo.equals("jButtonCancelarInformacionFinanciera")) {
				JInternalFrameBase jInternalFrameDetalleFormInformacionFinanciera = (JInternalFrameBase)evt.getSource();
	            	
	            InformacionFinancieraBeanSwingJInternalFrame jInternalFrameParent=(InformacionFinancieraBeanSwingJInternalFrame)jInternalFrameDetalleFormInformacionFinanciera.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarInformacionFinancieraActionPerformed(null);
			}
			
			InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.informacionfinanciera,new Object(),this.informacionfinancieraParameterGeneral,this.informacionfinancieraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormInformacionFinanciera(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormInformacionFinanciera(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormInformacionFinanciera(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.informacionfinanciera)) {
			if(!esControlTabla) {
				if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.informacionfinanciera,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);			
				}
				
				if(this.informacionfinancieraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualInformacionFinanciera(this.informacionfinanciera,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.informacionfinancieraReturnGeneral=informacionfinancieraLogic.procesarEventosInformacionFinancierasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.informacionfinancieraLogic.getInformacionFinancieras(),this.informacionfinanciera,this.informacionfinancieraParameterGeneral,this.isEsNuevoInformacionFinanciera,classes);//this.informacionfinancieraLogic.getInformacionFinanciera()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanInformacionFinanciera(this.informacionfinancieraReturnGeneral,this.informacionfinancieraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.informacionfinancieraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanInformacionFinanciera(classes,this.informacionfinancieraReturnGeneral,this.informacionfinancieraBean,false);
					}
						
					if(this.informacionfinancieraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyInformacionFinanciera(this.informacionfinancieraReturnGeneral.getInformacionFinanciera());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioInformacionFinanciera(this.informacionfinancieraReturnGeneral.getInformacionFinanciera());	
					}
						
					if(this.informacionfinancieraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioInformacionFinanciera(this.informacionfinancieraReturnGeneral.getInformacionFinanciera(),classes);//this.informacionfinancieraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioInformacionFinanciera(this.informacionfinanciera,classes);//this.informacionfinancieraBean);									
				}
			
				if(InformacionFinancieraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualInformacionFinanciera(this.informacionfinanciera,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionFinanciera(this.informacionfinanciera);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.informacionfinancieraAnterior!=null) {
						this.informacionfinanciera=this.informacionfinancieraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.informacionfinancieraReturnGeneral=informacionfinancieraLogic.procesarEventosInformacionFinancierasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.informacionfinancieraLogic.getInformacionFinancieras(),this.informacionfinanciera,this.informacionfinancieraParameterGeneral,this.isEsNuevoInformacionFinanciera,classes);//this.informacionfinancieraLogic.getInformacionFinanciera()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.informacionfinancieraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.informacionfinancieraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.informacionfinancieraReturnGeneral.getInformacionFinanciera(),informacionfinancieraLogic.getInformacionFinancieras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.informacionfinancieraReturnGeneral.getInformacionFinanciera(),this.informacionfinancieras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosInformacionFinanciera.repaint();
				
				//((AbstractTableModel) this.jTableDatosInformacionFinanciera.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosInformacionFinanciera();
			}
		}
	}
	
	public void actualizarVisualTableDatosInformacionFinanciera() throws Exception {
		
		InformacionFinancieraModel informacionfinancieraModel=(InformacionFinancieraModel)this.jTableDatosInformacionFinanciera.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			informacionfinancieraModel.informacionfinancieras=this.informacionfinancieraLogic.getInformacionFinancieras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			informacionfinancieraModel.informacionfinancieras=this.informacionfinancieras;
		}
		
		
		((InformacionFinancieraModel) this.jTableDatosInformacionFinanciera.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaInformacionFinanciera() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getinformacionfinancieraAnterior(),this.informacionfinancieraLogic.getInformacionFinancieras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getinformacionfinancieraAnterior(),this.informacionfinancieras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosInformacionFinanciera();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioInformacionFinanciera(InformacionFinanciera informacionfinanciera,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
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
										
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.informacionfinanciera,new Object(),generalEntityParameterGeneral,this.informacionfinancieraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.informacionfinancieraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=InformacionFinancieraConstantesFunciones.getClassesRelationshipsOfInformacionFinanciera(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=InformacionFinancieraConstantesFunciones.getClassesRelationshipsFromStringsOfInformacionFinanciera(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormInformacionFinanciera(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				InformacionFinancieraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.informacionfinanciera,new Object(),generalEntityParameterGeneral,this.informacionfinancieraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioInformacionFinanciera(InformacionFinancieraBean informacionfinancieraBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanInformacionFinanciera(ArrayList<Classe> classes,InformacionFinancieraReturnGeneral informacionfinancieraReturnGeneral,InformacionFinancieraBean informacionfinancieraBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualInformacionFinanciera(InformacionFinanciera informacionfinanciera,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.informacionfinanciera)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormInformacionFinanciera = new InformacionFinancieraDetalleFormJInternalFrame(jDesktopPane,this.informacionfinancieraSessionBean.getConGuardarRelaciones(),this.informacionfinancieraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.setVisible(false);
		this.jInternalFrameDetalleFormInformacionFinanciera.setSelected(false);						
		
		this.jInternalFrameDetalleFormInformacionFinanciera.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormInformacionFinanciera.informacionfinancieraLogic=this.informacionfinancieraLogic;
		
		this.cargarCombosFrameForeignKeyInformacionFinanciera("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleInformacionFinanciera();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleInformacionFinanciera();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyInformacionFinanciera("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyInformacionFinanciera();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormInformacionFinanciera.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarInformacionFinanciera"));
		
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonModificarInformacionFinanciera.addActionListener(new ButtonActionListener(this,"ModificarInformacionFinanciera"));

		
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonModificarToolBarInformacionFinanciera.addActionListener(new ButtonActionListener(this,"ModificarToolBarInformacionFinanciera"));
					
		this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemModificarInformacionFinanciera.addActionListener(new ButtonActionListener(this,"MenuItemModificarInformacionFinanciera"));		
		
		
		
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonActualizarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"ActualizarInformacionFinanciera"));
		
		
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonActualizarToolBarInformacionFinanciera.addActionListener(new ButtonActionListener(this,"ActualizarToolBarInformacionFinanciera"));
						
		this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemActualizarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemActualizarInformacionFinanciera"));		
		
		
		
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonEliminarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"EliminarInformacionFinanciera"));
		
		
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonEliminarToolBarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"EliminarToolBarInformacionFinanciera"));
								
		this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemEliminarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemEliminarInformacionFinanciera"));		
		
		
		
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonCancelarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"CancelarInformacionFinanciera"));
		
		
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonCancelarToolBarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"CancelarToolBarInformacionFinanciera"));
					
		this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemCancelarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemCancelarInformacionFinanciera"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemDetalleCerrarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarInformacionFinanciera"));		
		
		
		
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonGuardarCambiosToolBarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarInformacionFinanciera"));
		
		
		
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonGuardarCambiosToolBarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarInformacionFinanciera"));
		
		
		
		this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxTiposAccionesFormularioInformacionFinanciera.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioInformacionFinanciera"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"idInformacionFinancieraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonid_empresaInformacionFinancieraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaInformacionFinancieraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonid_empresaInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaInformacionFinancieraBusqueda"));
		//jButtonidclienteInformacionFinanciera.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteInformacionFinancieraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidclienteInformacionFinanciera.addActionListener(new ButtonActionListener(this,"idclienteInformacionFinanciera"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidclienteInformacionFinancieraUpdate.addActionListener(new ButtonActionListener(this,"idclienteInformacionFinancieraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidclienteInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"idclienteInformacionFinancieraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidvalorclientemovimientoInformacionFinancieraUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientemovimientoInformacionFinancieraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidvalorclientemovimientoInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientemovimientoInformacionFinancieraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonvalorInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"valorInformacionFinancieraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtondescripcionInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"descripcionInformacionFinancieraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonesactivoInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"esactivoInformacionFinancieraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormInformacionFinanciera.jTabbedPaneRelacionesInformacionFinanciera.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesInformacionFinanciera"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameInformacionFinanciera"));
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionFinanciera.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarInformacionFinanciera"));
		}
		
		this.jTableDatosInformacionFinanciera.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarInformacionFinanciera"));
		
		this.jTableDatosInformacionFinanciera.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarInformacionFinanciera"));
		
		this.jButtonNuevoInformacionFinanciera.addActionListener(new ButtonActionListener(this,"NuevoInformacionFinanciera"));
		
		this.jButtonDuplicarInformacionFinanciera.addActionListener(new ButtonActionListener(this,"DuplicarInformacionFinanciera"));
		
		this.jButtonCopiarInformacionFinanciera.addActionListener(new ButtonActionListener(this,"CopiarInformacionFinanciera"));
		
		this.jButtonVerFormInformacionFinanciera.addActionListener(new ButtonActionListener(this,"VerFormInformacionFinanciera"));
		
		
		this.jButtonNuevoToolBarInformacionFinanciera.addActionListener(new ButtonActionListener(this,"NuevoToolBarInformacionFinanciera"));
			
		this.jButtonDuplicarToolBarInformacionFinanciera.addActionListener(new ButtonActionListener(this,"DuplicarToolBarInformacionFinanciera"));
			
		this.jMenuItemNuevoInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemNuevoInformacionFinanciera"));
			
		this.jMenuItemDuplicarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarInformacionFinanciera"));		
		
		
		this.jButtonNuevoRelacionesInformacionFinanciera.addActionListener (new ButtonActionListener(this,"NuevoRelacionesInformacionFinanciera"));
		
		
		this.jButtonNuevoRelacionesToolBarInformacionFinanciera.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarInformacionFinanciera"));
			
		this.jMenuItemNuevoRelacionesInformacionFinanciera.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesInformacionFinanciera"));		
		
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonModificarInformacionFinanciera.addActionListener(new ButtonActionListener(this,"ModificarInformacionFinanciera"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonModificarToolBarInformacionFinanciera.addActionListener(new ButtonActionListener(this,"ModificarToolBarInformacionFinanciera"));
			
			this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemModificarInformacionFinanciera.addActionListener(new ButtonActionListener(this,"MenuItemModificarInformacionFinanciera"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonActualizarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"ActualizarInformacionFinanciera"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonActualizarToolBarInformacionFinanciera.addActionListener(new ButtonActionListener(this,"ActualizarToolBarInformacionFinanciera"));
				
			this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemActualizarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemActualizarInformacionFinanciera"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonEliminarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"EliminarInformacionFinanciera"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonEliminarToolBarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"EliminarToolBarInformacionFinanciera"));
						
			this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemEliminarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemEliminarInformacionFinanciera"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonCancelarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"CancelarInformacionFinanciera"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonCancelarToolBarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"CancelarToolBarInformacionFinanciera"));
			
			this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemCancelarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemCancelarInformacionFinanciera"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarInformacionFinanciera"));		
		
		
		this.jButtonCerrarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"CerrarInformacionFinanciera"));
		
		
		this.jButtonCerrarToolBarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"CerrarToolBarInformacionFinanciera"));
			
		this.jMenuItemCerrarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemCerrarInformacionFinanciera"));
			
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionFinanciera.jMenuItemDetalleCerrarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarInformacionFinanciera"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonGuardarCambiosInformacionFinanciera.addActionListener (new ButtonActionListener(this,"GuardarCambiosInformacionFinanciera"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonGuardarCambiosToolBarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarInformacionFinanciera"));
		}
		
		this.jButtonCopiarToolBarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"CopiarToolBarInformacionFinanciera"));
			
		this.jButtonVerFormToolBarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"VerFormToolBarInformacionFinanciera"));
		
		this.jMenuItemGuardarCambiosInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosInformacionFinanciera"));
			
		this.jMenuItemCopiarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemCopiarInformacionFinanciera"));		
		
		this.jMenuItemVerFormInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemVerFormInformacionFinanciera"));		
		
		
		this.jButtonGuardarCambiosTablaInformacionFinanciera.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaInformacionFinanciera"));
		
		
		this.jButtonGuardarCambiosTablaToolBarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarInformacionFinanciera"));
			
		this.jMenuItemGuardarCambiosTablaInformacionFinanciera.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaInformacionFinanciera"));		
		
		
		
		this.jButtonRecargarInformacionInformacionFinanciera.addActionListener (new ButtonActionListener(this,"RecargarInformacionInformacionFinanciera"));
					
		this.jButtonRecargarInformacionToolBarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarInformacionFinanciera"));
		
		this.jMenuItemRecargarInformacionInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionInformacionFinanciera"));		
		
		
		
		this.jButtonAnterioresInformacionFinanciera.addActionListener (new ButtonActionListener(this,"AnterioresInformacionFinanciera"));
		
		
		this.jButtonAnterioresToolBarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"AnterioresToolBarInformacionFinanciera"));
		
		this.jMenuItemAnterioresInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresInformacionFinanciera"));		
		
		
		this.jButtonSiguientesInformacionFinanciera.addActionListener (new ButtonActionListener(this,"SiguientesInformacionFinanciera"));
		
		
		this.jButtonSiguientesToolBarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"SiguientesToolBarInformacionFinanciera"));
			
		this.jMenuItemSiguientesInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesInformacionFinanciera"));
			
		this.jMenuItemAbrirOrderByInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByInformacionFinanciera"));
			
		this.jMenuItemMostrarOcultarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarInformacionFinanciera"));
			
		this.jMenuItemDetalleAbrirOrderByInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByInformacionFinanciera"));
			
		this.jMenuItemDetalleMostarOcultarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarInformacionFinanciera"));		
		
		
		this.jButtonNuevoGuardarCambiosInformacionFinanciera.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosInformacionFinanciera"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarInformacionFinanciera"));
			
		this.jMenuItemNuevoGuardarCambiosInformacionFinanciera.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosInformacionFinanciera"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosInformacionFinanciera.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosInformacionFinanciera"));

		this.jCheckBoxSeleccionadosInformacionFinanciera.addItemListener(new CheckBoxItemListener(this,"SeleccionadosInformacionFinanciera"));
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxTiposAccionesFormularioInformacionFinanciera.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioInformacionFinanciera"));
		}
		
		
		this.jComboBoxTiposRelacionesInformacionFinanciera.addActionListener (new ButtonActionListener(this,"TiposRelacionesInformacionFinanciera"));
			
		this.jComboBoxTiposAccionesInformacionFinanciera.addActionListener (new ButtonActionListener(this,"TiposAccionesInformacionFinanciera"));
					
		this.jComboBoxTiposSeleccionarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"TiposSeleccionarInformacionFinanciera"));
			
		this.jTextFieldValorCampoGeneralInformacionFinanciera.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralInformacionFinanciera"));		
		
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"idInformacionFinancieraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonid_empresaInformacionFinancieraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaInformacionFinancieraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonid_empresaInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaInformacionFinancieraBusqueda"));
		//jButtonidclienteInformacionFinanciera.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteInformacionFinancieraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidclienteInformacionFinanciera.addActionListener(new ButtonActionListener(this,"idclienteInformacionFinanciera"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidclienteInformacionFinancieraUpdate.addActionListener(new ButtonActionListener(this,"idclienteInformacionFinancieraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidclienteInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"idclienteInformacionFinancieraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidvalorclientemovimientoInformacionFinancieraUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientemovimientoInformacionFinancieraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidvalorclientemovimientoInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientemovimientoInformacionFinancieraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonvalorInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"valorInformacionFinancieraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtondescripcionInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"descripcionInformacionFinancieraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonesactivoInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"esactivoInformacionFinancieraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteInformacionFinanciera.addActionListener(new ButtonActionListener(this,"FK_IdClienteInformacionFinanciera"));

			this.jButtonBuscarFK_IdClienteidclienteInformacionFinanciera.addActionListener(new ButtonActionListener(this,"idclienteInformacionFinanciera"));

			this.jButtonFK_IdValorClienteMovimientoInformacionFinanciera.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteMovimientoInformacionFinanciera"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoInformacionFinanciera!=null) {
				this.jInternalFrameReporteDinamicoInformacionFinanciera.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoInformacionFinanciera"));
				this.jInternalFrameReporteDinamicoInformacionFinanciera.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoInformacionFinanciera"));
				this.jInternalFrameReporteDinamicoInformacionFinanciera.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoInformacionFinanciera"));
			}
			
			//this.jButtonCerrarReporteDinamicoInformacionFinanciera.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoInformacionFinanciera"));				
			//this.jButtonGenerarReporteDinamicoInformacionFinanciera.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoInformacionFinanciera"));
			//this.jButtonGenerarExcelReporteDinamicoInformacionFinanciera.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoInformacionFinanciera"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionInformacionFinanciera!=null) {
				this.jInternalFrameImportacionInformacionFinanciera.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionInformacionFinanciera"));
				this.jInternalFrameImportacionInformacionFinanciera.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionInformacionFinanciera"));
				this.jInternalFrameImportacionInformacionFinanciera.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionInformacionFinanciera"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByInformacionFinanciera.addActionListener (new ButtonActionListener(this,"AbrirOrderByInformacionFinanciera"));
			
			this.jButtonAbrirOrderByToolBarInformacionFinanciera.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarInformacionFinanciera"));			
			
			if(this.jInternalFrameOrderByInformacionFinanciera!=null) {
				this.jInternalFrameOrderByInformacionFinanciera.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByInformacionFinanciera"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionFinanciera.jTabbedPaneRelacionesInformacionFinanciera.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesInformacionFinanciera"));
		
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
            		closingInternalFrameInformacionFinanciera();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormInformacionFinanciera.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormInformacionFinanciera = (JInternalFrameBase)event.getSource();
	            	
	            InformacionFinancieraBeanSwingJInternalFrame jInternalFrameParent=(InformacionFinancieraBeanSwingJInternalFrame)jInternalFrameDetalleFormInformacionFinanciera.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarInformacionFinancieraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosInformacionFinanciera.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosInformacionFinancieraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosInformacionFinanciera.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosInformacionFinanciera.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionFinancieraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionFinancieraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionFinancieraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoInformacionFinanciera";
		inputMap = this.jButtonNuevoInformacionFinanciera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoInformacionFinanciera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoInformacionFinancieraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionFinancieraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionFinancieraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionFinancieraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesInformacionFinanciera";
		inputMap = this.jButtonNuevoRelacionesInformacionFinanciera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesInformacionFinanciera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoInformacionFinancieraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarInformacionFinanciera";
		inputMap = this.jButtonModificarInformacionFinanciera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarInformacionFinanciera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarInformacionFinancieraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarInformacionFinanciera";
		inputMap = this.jButtonActualizarInformacionFinanciera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarInformacionFinanciera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarInformacionFinancieraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarInformacionFinanciera";
		inputMap = this.jButtonEliminarInformacionFinanciera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarInformacionFinanciera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarInformacionFinancieraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarInformacionFinanciera";
		inputMap = this.jButtonCancelarInformacionFinanciera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarInformacionFinanciera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarInformacionFinancieraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarInformacionFinanciera";
		inputMap = this.jButtonCerrarInformacionFinanciera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarInformacionFinanciera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarInformacionFinancieraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonGuardarCambiosInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosInformacionFinanciera";
		inputMap = this.jInternalFrameDetalleFormInformacionFinanciera.jButtonGuardarCambiosInformacionFinanciera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonGuardarCambiosInformacionFinanciera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosInformacionFinancieraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosInformacionFinanciera.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosInformacionFinancieraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesInformacionFinanciera.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesInformacionFinancieraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarInformacionFinanciera.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarInformacionFinancieraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralInformacionFinanciera.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralInformacionFinancieraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"idInformacionFinancieraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonid_empresaInformacionFinancieraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaInformacionFinancieraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonid_empresaInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaInformacionFinancieraBusqueda"));
		//jButtonidclienteInformacionFinanciera.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteInformacionFinancieraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidclienteInformacionFinanciera.addActionListener(new ButtonActionListener(this,"idclienteInformacionFinanciera"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidclienteInformacionFinancieraUpdate.addActionListener(new ButtonActionListener(this,"idclienteInformacionFinancieraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidclienteInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"idclienteInformacionFinancieraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidvalorclientemovimientoInformacionFinancieraUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientemovimientoInformacionFinancieraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidvalorclientemovimientoInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientemovimientoInformacionFinancieraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonvalorInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"valorInformacionFinancieraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtondescripcionInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"descripcionInformacionFinancieraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionFinanciera.jButtonesactivoInformacionFinancieraBusqueda.addActionListener(new ButtonActionListener(this,"esactivoInformacionFinancieraBusqueda"));
		
		
		this.jButtonFK_IdClienteInformacionFinanciera.addActionListener(new ButtonActionListener(this,"FK_IdClienteInformacionFinanciera"));

		this.jButtonBuscarFK_IdClienteidclienteInformacionFinanciera.addActionListener(new ButtonActionListener(this,"idclienteInformacionFinanciera"));

		this.jButtonFK_IdValorClienteMovimientoInformacionFinanciera.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteMovimientoInformacionFinanciera"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionInformacionFinanciera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionInformacionFinancieraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarInformacionFinancieraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarInformacionFinanciera.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosInformacionFinanciera(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(InformacionFinanciera informacionfinancieraAux:this.informacionfinancieraLogic.getInformacionFinancieras()) {
					informacionfinancieraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(InformacionFinanciera informacionfinancieraAux:informacionfinancieras) {
					informacionfinancieraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosInformacionFinancieraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingInformacionFinanciera(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(InformacionFinanciera informacionfinancieraAux:this.informacionfinancieraLogic.getInformacionFinancieras()) {
						informacionfinancieraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(InformacionFinanciera informacionfinancieraAux:informacionfinancieras) {
						informacionfinancieraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(InformacionFinanciera informacionfinancieraAux:this.informacionfinancieraLogic.getInformacionFinancieras()) {
					
						if(sTipoSeleccionar.equals(InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							informacionfinancieraAux.setesactivo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(InformacionFinanciera informacionfinancieraAux:informacionfinancieras) {
						
						if(sTipoSeleccionar.equals(InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							informacionfinancieraAux.setesactivo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaInformacionFinanciera(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosInformacionFinanciera.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosInformacionFinanciera.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosInformacionFinanciera,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosInformacionFinancieraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingInformacionFinanciera(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosInformacionFinanciera.getSelectedRows();
			
			InformacionFinanciera informacionfinancieraLocal=new InformacionFinanciera();
			
			//this.seleccionarTodosInformacionFinanciera(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacionfinancieraLocal =(InformacionFinanciera) this.informacionfinancieraLogic.getInformacionFinancieras().toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					informacionfinancieraLocal =(InformacionFinanciera) this.informacionfinancieras.toArray()[this.jTableDatosInformacionFinanciera.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				informacionfinancieraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(InformacionFinanciera informacionfinancieraAux:this.informacionfinancieraLogic.getInformacionFinancieras()) {
						informacionfinancieraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(InformacionFinanciera informacionfinancieraAux:informacionfinancieras) {
						informacionfinancieraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaInformacionFinanciera(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosInformacionFinanciera.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosInformacionFinanciera.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosInformacionFinanciera,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualInformacionFinancieraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarInformacionFinancieraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralInformacionFinancieraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingInformacionFinanciera(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralInformacionFinanciera.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(InformacionFinanciera informacionfinancieraAux:this.informacionfinancieraLogic.getInformacionFinancieras()) {
				
						if(sTipoSeleccionar.equals(InformacionFinancieraConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							informacionfinancieraAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							informacionfinancieraAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(InformacionFinanciera informacionfinancieraAux:informacionfinancieras) {
					
						if(sTipoSeleccionar.equals(InformacionFinancieraConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							informacionfinancieraAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							informacionfinancieraAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaInformacionFinanciera(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesInformacionFinancieraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingInformacionFinanciera(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioInformacionFinanciera=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesInformacionFinanciera.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxTiposAccionesFormularioInformacionFinanciera.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteInformacionFinanciera) {				
					conSplash=true;//false;										
					
					//this.startProcessInformacionFinanciera(conSplash);
				
					this.generarReporteInformacionFinancierasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInformacionFinanciera.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxTiposAccionesFormularioInformacionFinanciera.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoInformacionFinancierasSeleccionados();
				//this.jComboBoxTiposAccionesInformacionFinanciera.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoInformacionFinancierasSeleccionados(false);
				//this.jComboBoxTiposAccionesInformacionFinanciera.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoInformacionFinancierasSeleccionados(true);
				//this.jComboBoxTiposAccionesInformacionFinanciera.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessInformacionFinanciera();
				
				this.exportarInformacionFinancierasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInformacionFinanciera.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxTiposAccionesFormularioInformacionFinanciera.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionInformacionFinancieras();
				//this.importarInformacionFinancieras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInformacionFinanciera.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxTiposAccionesFormularioInformacionFinanciera.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessInformacionFinanciera();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelInformacionFinancierasSeleccionados();
				//this.jComboBoxTiposAccionesInformacionFinanciera.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Informacion Financiera", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessInformacionFinanciera();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoInformacionFinanciera)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyInformacionFinanciera(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Informacion Financiera",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInformacionFinanciera.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxTiposAccionesFormularioInformacionFinanciera.setSelectedIndex(0);					
				}	
			} 			
			else if(InformacionFinancieraBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteInformacionFinanciera) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessInformacionFinanciera(conSplash);
					
						//this.actualizarParametrosGeneralInformacionFinanciera();
						
						this.generarReporteProcesoAccionInformacionFinancierasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesInformacionFinanciera.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxTiposAccionesFormularioInformacionFinanciera.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(InformacionFinancieraBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Informacion FinancieraS SELECCIONADOS?", "MANTENIMIENTO DE Informacion Financiera", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessInformacionFinanciera();
				
						this.actualizarParametrosGeneralInformacionFinanciera();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.informacionfinancieraReturnGeneral=informacionfinancieraLogic.procesarAccionInformacionFinancierasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.informacionfinancieraLogic.getInformacionFinancieras(),this.informacionfinancieraParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarInformacionFinancieraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesInformacionFinanciera.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxTiposAccionesFormularioInformacionFinanciera.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralInformacionFinanciera();
					
					InformacionFinancieraBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarInformacionFinancieraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesInformacionFinanciera.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxTiposAccionesFormularioInformacionFinanciera.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessInformacionFinanciera(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesInformacionFinancieraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessInformacionFinanciera();
			
			if(this.jInternalFrameDetalleFormInformacionFinanciera==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<InformacionFinanciera> informacionfinancierasSeleccionados=new ArrayList<InformacionFinanciera>();		
			InformacionFinanciera informacionfinanciera=new InformacionFinanciera();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingInformacionFinanciera(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesInformacionFinanciera.getSelectedItem();
			
			
			
			
			informacionfinancierasSeleccionados=this.getInformacionFinancierasSeleccionados(true);
			//this.sTipoAccion;
			
			if(informacionfinancierasSeleccionados.size()==1) {
				for(InformacionFinanciera informacionfinancieraAux:informacionfinancierasSeleccionados) {
					informacionfinanciera=informacionfinancieraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessInformacionFinanciera();
			
      		//this.finishProcessInformacionFinanciera(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarInformacionFinancieraReturnGeneral() throws Exception {
		if(this.informacionfinancieraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.informacionfinancieraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.informacionfinancieraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.informacionfinancieraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.informacionfinancieraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.informacionfinancieraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingInformacionFinanciera(false);
		}
		
		if(this.informacionfinancieraReturnGeneral.getConRetornoLista() || this.informacionfinancieraReturnGeneral.getConRetornoObjeto()) {
			if(this.informacionfinancieraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.informacionfinancieraLogic.setInformacionFinancieras(this.informacionfinancieraReturnGeneral.getInformacionFinancieras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.informacionfinancieraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.informacionfinancieraLogic.setInformacionFinanciera(this.informacionfinancieraReturnGeneral.getInformacionFinanciera());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingInformacionFinanciera(false);
		}
	}
	
	public void actualizarParametrosGeneralInformacionFinanciera() throws Exception {
		
		
	}
	
	public ArrayList<InformacionFinanciera> getInformacionFinancierasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<InformacionFinanciera> informacionfinancierasSeleccionados=new ArrayList<InformacionFinanciera>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioInformacionFinanciera) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(InformacionFinanciera informacionfinancieraAux:informacionfinancieraLogic.getInformacionFinancieras()) {
					if(informacionfinancieraAux.getIsSelected()) {
						informacionfinancierasSeleccionados.add(informacionfinancieraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(InformacionFinanciera informacionfinancieraAux:this.informacionfinancieras) {
					if(informacionfinancieraAux.getIsSelected()) {
						informacionfinancierasSeleccionados.add(informacionfinancieraAux);				
					}
				}
			}
			
			if(informacionfinancierasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						informacionfinancierasSeleccionados.addAll(this.informacionfinancieraLogic.getInformacionFinancieras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						informacionfinancierasSeleccionados.addAll(this.informacionfinancieras);				
					}
				}
			}
		} else {
			informacionfinancierasSeleccionados.add(this.informacionfinanciera);
		}
		
		return informacionfinancierasSeleccionados;
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
	
	public void generarReporteInformacionFinancierasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalInformacionFinancierasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoInformacionFinancierasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoInformacionFinancierasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoInformacionFinancierasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Informacion Financiera",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesInformacionFinancierasSeleccionados() throws Exception {
		ArrayList<InformacionFinanciera> informacionfinancierasSeleccionados=new ArrayList<InformacionFinanciera>();		
		
		informacionfinancierasSeleccionados=this.getInformacionFinancierasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteInformacionFinancieras("Todos",informacionfinancierasSeleccionados);
		
	}	
	
	public void generarReporteNormalInformacionFinancierasSeleccionados() throws Exception {
		ArrayList<InformacionFinanciera> informacionfinancierasSeleccionados=new ArrayList<InformacionFinanciera>();		
		
		informacionfinancierasSeleccionados=this.getInformacionFinancierasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteInformacionFinancieras("Todos",informacionfinancierasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionInformacionFinancierasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<InformacionFinanciera> informacionfinancierasSeleccionados=new ArrayList<InformacionFinanciera>();
		
		informacionfinancierasSeleccionados=this.getInformacionFinancierasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteInformacionFinancieras("Todos",informacionfinancierasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoInformacionFinancierasSeleccionados() throws Exception {
		ArrayList<InformacionFinanciera> informacionfinancierasSeleccionados=new ArrayList<InformacionFinanciera>();		
		
		
		this.abrirInicializarFrameReporteDinamicoInformacionFinanciera();
		
		
		informacionfinancierasSeleccionados=this.getInformacionFinancierasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoInformacionFinanciera();
		
		
		//this.generarReporteInformacionFinancieras("Todos",informacionfinancierasSeleccionados ,informacionfinancieraImplementable,informacionfinancieraImplementableHome);
	}
	
	public void mostrarImportacionInformacionFinancieras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionInformacionFinanciera();
		
		this.abrirFrameImportacionInformacionFinanciera();		
		
			
		//this.generarReporteInformacionFinancieras("Todos",informacionfinancierasSeleccionados ,informacionfinancieraImplementable,informacionfinancieraImplementableHome);
	}
	
	public void importarInformacionFinancieras() throws Exception {		
	
	}
	
	public void exportarInformacionFinancierasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelInformacionFinancierasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoInformacionFinancierasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlInformacionFinancierasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Informacion Financiera",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoInformacionFinancierasSeleccionados() throws Exception {
		ArrayList<InformacionFinanciera> informacionfinancierasSeleccionados=new ArrayList<InformacionFinanciera>();		
		
		informacionfinancierasSeleccionados=this.getInformacionFinancierasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacionfinanciera."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarInformacionFinanciera(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(InformacionFinanciera informacionfinancieraAux:informacionfinancierasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarInformacionFinanciera(informacionfinancieraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//informacionfinancieraAux.setsDetalleGeneralEntityReporte(informacionfinancieraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Financiera",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarInformacionFinanciera(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=InformacionFinancieraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionFinancieraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionFinancieraConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionFinancieraConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionFinancieraConstantesFunciones.LABEL_IDTIPOMOVIFINAN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionFinancieraConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarInformacionFinanciera(InformacionFinanciera informacionfinanciera,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=informacionfinanciera.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionfinanciera.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionfinanciera.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionfinanciera.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionfinanciera.gettipomovifinan_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionfinanciera.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionfinanciera.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacionfinanciera.getesactivo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelInformacionFinancierasSeleccionados() throws Exception {
		ArrayList<InformacionFinanciera> informacionfinancierasSeleccionados=new ArrayList<InformacionFinanciera>();		
		
		informacionfinancierasSeleccionados=this.getInformacionFinancierasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacionfinanciera.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("InformacionFinancieras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelInformacionFinanciera(row);				
				iRow++;
			}				
			
			for(InformacionFinanciera informacionfinancieraAux:informacionfinancierasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelInformacionFinanciera(informacionfinancieraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Financiera",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlInformacionFinancierasSeleccionados() throws Exception {
		ArrayList<InformacionFinanciera> informacionfinancierasSeleccionados=new ArrayList<InformacionFinanciera>();		
		
		informacionfinancierasSeleccionados=this.getInformacionFinancierasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacionfinanciera.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("informacionfinancieras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("informacionfinanciera");
			//elementRoot.appendChild(element);
		
			for(InformacionFinanciera informacionfinancieraAux:informacionfinancierasSeleccionados) {
				element = document.createElement("informacionfinanciera");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlInformacionFinanciera(informacionfinancieraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Financiera",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelInformacionFinanciera(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_IDTIPOMOVIFINAN);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelInformacionFinanciera(InformacionFinanciera informacionfinanciera,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(informacionfinanciera.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionfinanciera.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionfinanciera.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionfinanciera.gettipomovifinan_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionfinanciera.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionfinanciera.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(informacionfinanciera.getesactivo());				
	}
	
	public void setFilaDatosExportarXmlInformacionFinanciera(InformacionFinanciera informacionfinanciera,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(InformacionFinancieraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(informacionfinanciera.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(InformacionFinancieraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(informacionfinanciera.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(InformacionFinancieraConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(informacionfinanciera.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(InformacionFinancieraConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(informacionfinanciera.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtipomovifinan_descripcion = document.createElement(InformacionFinancieraConstantesFunciones.IDTIPOMOVIFINAN);
		elementtipomovifinan_descripcion.appendChild(document.createTextNode(informacionfinanciera.gettipomovifinan_descripcion()));
		element.appendChild(elementtipomovifinan_descripcion);

		Element elementvalor = document.createElement(InformacionFinancieraConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(informacionfinanciera.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementdescripcion = document.createElement(InformacionFinancieraConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(informacionfinanciera.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementesactivo = document.createElement(InformacionFinancieraConstantesFunciones.ESACTIVO);
		elementesactivo.appendChild(document.createTextNode(informacionfinanciera.getesactivo().toString().trim()));
		element.appendChild(elementesactivo);
	}
	
	public void generarReporteGroupGenericoInformacionFinancierasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<InformacionFinanciera> informacionfinancierasSeleccionados=new ArrayList<InformacionFinanciera>();
		
		informacionfinancierasSeleccionados=this.getInformacionFinancierasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoInformacionFinanciera(informacionfinancierasSeleccionados);
		
		this.generarReporteInformacionFinancieras("Todos",informacionfinancierasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoInformacionFinanciera(ArrayList<InformacionFinanciera> informacionfinancierasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(InformacionFinanciera informacionfinancieraAux:informacionfinancierasSeleccionados) {
				informacionfinancieraAux.setsDetalleGeneralEntityReporte(informacionfinancieraAux.toString());
			
				if(sTipoSeleccionar.equals(InformacionFinancieraConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					informacionfinancieraAux.setsDescripcionGeneralEntityReporte1(informacionfinancieraAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(InformacionFinancieraConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					informacionfinancieraAux.setsDescripcionGeneralEntityReporte1(informacionfinancieraAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(InformacionFinancieraConstantesFunciones.LABEL_IDTIPOMOVIFINAN)) {
					existe=true;
					informacionfinancieraAux.setsDescripcionGeneralEntityReporte1(informacionfinancieraAux.gettipomovifinan_descripcion());
				}
				 else if(sTipoSeleccionar.equals(InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					informacionfinancieraAux.setsDescripcionGeneralEntityReporte1(informacionfinancieraAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO)) {
					existe=true;
					informacionfinancieraAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(informacionfinancieraAux.getesactivo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionFinancieraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesInformacionFinanciera(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoInformacionFinanciera=true;
				this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera=true;
				this.isVisibilidadCeldaGuardarCambiosInformacionFinanciera=true;
			}
			
			this.isVisibilidadCeldaModificarInformacionFinanciera=false;
			this.isVisibilidadCeldaActualizarInformacionFinanciera=false;
			this.isVisibilidadCeldaEliminarInformacionFinanciera=false;
			this.isVisibilidadCeldaCancelarInformacionFinanciera=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionFinanciera=true;
				} else {
					this.isVisibilidadCeldaGuardarInformacionFinanciera=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoInformacionFinanciera=false;
			this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionFinanciera=false;
			this.isVisibilidadCeldaModificarInformacionFinanciera=false;
			this.isVisibilidadCeldaActualizarInformacionFinanciera=true;
			this.isVisibilidadCeldaEliminarInformacionFinanciera=false;
			this.isVisibilidadCeldaCancelarInformacionFinanciera=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionFinanciera=true;
				} else {
					this.isVisibilidadCeldaGuardarInformacionFinanciera=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoInformacionFinanciera=false;
			this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionFinanciera=false;
			this.isVisibilidadCeldaModificarInformacionFinanciera=false;
			this.isVisibilidadCeldaActualizarInformacionFinanciera=true;
			this.isVisibilidadCeldaEliminarInformacionFinanciera=true;
			this.isVisibilidadCeldaCancelarInformacionFinanciera=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionFinanciera=true;
				} else {
					this.isVisibilidadCeldaGuardarInformacionFinanciera=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoInformacionFinanciera=false;
			this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionFinanciera=false;
			this.isVisibilidadCeldaModificarInformacionFinanciera=false;
			this.isVisibilidadCeldaActualizarInformacionFinanciera=true;
			this.isVisibilidadCeldaEliminarInformacionFinanciera=false;
			this.isVisibilidadCeldaCancelarInformacionFinanciera=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionFinanciera=false;
				} else {
					this.isVisibilidadCeldaGuardarInformacionFinanciera=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoInformacionFinanciera=true;
			this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera=true;
			this.isVisibilidadCeldaGuardarCambiosInformacionFinanciera=true;
			this.isVisibilidadCeldaModificarInformacionFinanciera=false;
			this.isVisibilidadCeldaActualizarInformacionFinanciera=false;
			this.isVisibilidadCeldaEliminarInformacionFinanciera=false;
			this.isVisibilidadCeldaCancelarInformacionFinanciera=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionFinanciera=true;
				} else {
					this.isVisibilidadCeldaGuardarInformacionFinanciera=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoInformacionFinanciera=false;
			this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionFinanciera=false;
			this.isVisibilidadCeldaActualizarInformacionFinanciera=false;
			this.isVisibilidadCeldaEliminarInformacionFinanciera=false;
			this.isVisibilidadCeldaCancelarInformacionFinanciera=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionFinanciera=false;
				} else {
					this.isVisibilidadCeldaGuardarInformacionFinanciera=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoInformacionFinanciera=false;
			this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionFinanciera=false;
			this.isVisibilidadCeldaModificarInformacionFinanciera=true;
			this.isVisibilidadCeldaActualizarInformacionFinanciera=false;
			this.isVisibilidadCeldaEliminarInformacionFinanciera=false;
			this.isVisibilidadCeldaCancelarInformacionFinanciera=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionFinanciera=false;
				} else {
					this.isVisibilidadCeldaGuardarInformacionFinanciera=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(InformacionFinancieraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoInformacionFinanciera=true;
			this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera=true;
			this.isVisibilidadCeldaGuardarCambiosInformacionFinanciera=true;
		} else {
			this.actualizarEstadoPanelsInformacionFinanciera(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarInformacionFinanciera=false;
			//this.isVisibilidadCeldaVerFormInformacionFinanciera=false;
			this.isVisibilidadCeldaDuplicarInformacionFinanciera=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!informacionfinancieraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera=false;
		} else {
			this.isVisibilidadCeldaNuevoInformacionFinanciera=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionFinanciera=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
			if(!informacionfinancieraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera=false;												
			}
			
			this.jButtonCerrarInformacionFinanciera.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesInformacionFinanciera=false;
		}
		
		if(!this.permiteMantenimiento(this.informacionfinanciera)) {
			this.isVisibilidadCeldaActualizarInformacionFinanciera=false;
			this.isVisibilidadCeldaEliminarInformacionFinanciera=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesInformacionFinanciera() {
	}
	
	public void actualizarEstadoPanelsInformacionFinanciera(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionInformacionFinanciera!=null) {
				this.jScrollPanelDatosEdicionInformacionFinanciera.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionFinanciera!=null) {
				this.jTabbedPaneBusquedasInformacionFinanciera.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosInformacionFinanciera!=null) {
				this.jScrollPanelDatosInformacionFinanciera.setVisible(true);
			}
			
			if(this.jPanelPaginacionInformacionFinanciera!=null) {
				this.jPanelPaginacionInformacionFinanciera.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInformacionFinanciera!=null) {
				this.jPanelParametrosReportesInformacionFinanciera.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionInformacionFinanciera!=null) {
				this.jScrollPanelDatosEdicionInformacionFinanciera.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionFinanciera!=null) {
				this.jTabbedPaneBusquedasInformacionFinanciera.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosInformacionFinanciera!=null) {
				this.jScrollPanelDatosInformacionFinanciera.setVisible(false);
			}
			
			if(this.jPanelPaginacionInformacionFinanciera!=null) {
				this.jPanelPaginacionInformacionFinanciera.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesInformacionFinanciera!=null) {
				this.jPanelParametrosReportesInformacionFinanciera.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionInformacionFinanciera!=null) {
				this.jScrollPanelDatosEdicionInformacionFinanciera.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionFinanciera!=null) {
				this.jTabbedPaneBusquedasInformacionFinanciera.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosInformacionFinanciera!=null) {
				this.jScrollPanelDatosInformacionFinanciera.setVisible(false);
			}
			
			if(this.jPanelPaginacionInformacionFinanciera!=null) {
				this.jPanelPaginacionInformacionFinanciera.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesInformacionFinanciera!=null) {
				this.jPanelParametrosReportesInformacionFinanciera.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionInformacionFinanciera!=null) {
				this.jScrollPanelDatosEdicionInformacionFinanciera.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionFinanciera!=null) {
				this.jTabbedPaneBusquedasInformacionFinanciera.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosInformacionFinanciera!=null) {
				this.jScrollPanelDatosInformacionFinanciera.setVisible(false);
			}
			
			if(this.jPanelPaginacionInformacionFinanciera!=null) {
				this.jPanelPaginacionInformacionFinanciera.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesInformacionFinanciera!=null) {
				this.jPanelParametrosReportesInformacionFinanciera.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionInformacionFinanciera!=null) {
				this.jScrollPanelDatosEdicionInformacionFinanciera.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionFinanciera!=null) {
				this.jTabbedPaneBusquedasInformacionFinanciera.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosInformacionFinanciera!=null) {
				this.jScrollPanelDatosInformacionFinanciera.setVisible(true);
			}
			
			if(this.jPanelPaginacionInformacionFinanciera!=null) {
				this.jPanelPaginacionInformacionFinanciera.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInformacionFinanciera!=null) {
				this.jPanelParametrosReportesInformacionFinanciera.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionInformacionFinanciera!=null) {
				this.jScrollPanelDatosEdicionInformacionFinanciera.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionFinanciera!=null) {
				this.jTabbedPaneBusquedasInformacionFinanciera.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosInformacionFinanciera!=null) {
				this.jScrollPanelDatosInformacionFinanciera.setVisible(true);
			}
			
			if(this.jPanelPaginacionInformacionFinanciera!=null) {
				this.jPanelPaginacionInformacionFinanciera.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInformacionFinanciera!=null) {
				this.jPanelParametrosReportesInformacionFinanciera.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionInformacionFinanciera!=null) {
				this.jScrollPanelDatosEdicionInformacionFinanciera.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionFinanciera!=null) {
				this.jTabbedPaneBusquedasInformacionFinanciera.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosInformacionFinanciera!=null) {
				this.jScrollPanelDatosInformacionFinanciera.setVisible(true);
			}
			
			if(this.jPanelPaginacionInformacionFinanciera!=null) {
				this.jPanelPaginacionInformacionFinanciera.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInformacionFinanciera!=null) {
				this.jPanelParametrosReportesInformacionFinanciera.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasInformacionFinanciera!=null) {
					this.jTabbedPaneBusquedasInformacionFinanciera.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesInformacionFinanciera!=null) {
				this.jPanelParametrosReportesInformacionFinanciera.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionFinanciera!=null) {
				this.jTabbedPaneBusquedasInformacionFinanciera.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesInformacionFinanciera!=null) {
				this.jPanelParametrosReportesInformacionFinanciera.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasInformacionFinanciera.remove(jPanelFK_IdClienteInformacionFinanciera);}

			this.isVisibilidadFK_IdValorClienteMovimiento=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdValorClienteMovimiento) {this.jTabbedPaneBusquedasInformacionFinanciera.remove(jPanelFK_IdValorClienteMovimientoInformacionFinanciera);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasInformacionFinanciera.remove(jPanelFK_IdClienteInformacionFinanciera);}

			this.isVisibilidadFK_IdValorClienteMovimiento=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdValorClienteMovimiento) {this.jTabbedPaneBusquedasInformacionFinanciera.remove(jPanelFK_IdValorClienteMovimientoInformacionFinanciera);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMoviFinan(Boolean isParaTipoMoviFinan){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMoviFinanNegation=!isParaTipoMoviFinan;

			this.isVisibilidadFK_IdCliente=isParaTipoMoviFinanNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasInformacionFinanciera.remove(jPanelFK_IdClienteInformacionFinanciera);}

			this.isVisibilidadFK_IdValorClienteMovimiento=isParaTipoMoviFinan;
			if(!this.isVisibilidadFK_IdValorClienteMovimiento) {this.jTabbedPaneBusquedasInformacionFinanciera.remove(jPanelFK_IdValorClienteMovimientoInformacionFinanciera);}
		}
		
	}
	
	
	
	

	public String registrarSesionInformacionFinancieraParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(informacionfinancieraSessionBean==null) {
				informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(informacionfinancieraSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.informacionfinancieraFuncionGeneral.setCombosCodigoDesdeBusquedaidcliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(InformacionFinancieraConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionInformacionFinanciera(true);
			//clienteSessionBean.setlidInformacionFinancieraActual(this.idInformacionFinancieraActual);

			informacionfinancieraSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyInformacionFinanciera(true);
			informacionfinancieraSessionBean.setlIdInformacionFinancieraActualForeignKey(this.idInformacionFinancieraActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//InformacionFinancieraSessionBean informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
		
		if(this.informacionfinancieraSessionBean==null) {
			this.informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
		}
		
		this.informacionfinancieraSessionBean.setsUltimaBusquedaInformacionFinanciera(this.getsAccionBusqueda());
		this.informacionfinancieraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.informacionfinancieraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			informacionfinancieraSessionBean.setidcliente(this.getidclienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			informacionfinancieraSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdValorClienteMovimiento")) {
			informacionfinancieraSessionBean.setidvalorclientemovimiento(this.getidvalorclientemovimientoFK_IdValorClienteMovimiento());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//InformacionFinancieraSessionBean informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
		
		if(this.informacionfinancieraSessionBean==null) {
			this.informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
		}
		
		if(this.informacionfinancieraSessionBean.getsUltimaBusquedaInformacionFinanciera()!=null&&!this.informacionfinancieraSessionBean.getsUltimaBusquedaInformacionFinanciera().equals("")) {
			this.setsAccionBusqueda(informacionfinancieraSessionBean.getsUltimaBusquedaInformacionFinanciera());
			this.setiNumeroPaginacion(informacionfinancieraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(informacionfinancieraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setidclienteFK_IdCliente(informacionfinancieraSessionBean.getidcliente());
				informacionfinancieraSessionBean.setidcliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(informacionfinancieraSessionBean.getid_empresa());
				informacionfinancieraSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdValorClienteMovimiento")) {
				this.setidvalorclientemovimientoFK_IdValorClienteMovimiento(informacionfinancieraSessionBean.getidvalorclientemovimiento());
				informacionfinancieraSessionBean.setidvalorclientemovimiento(-1L);
			}
		}
		
		this.informacionfinancieraSessionBean.setsUltimaBusquedaInformacionFinanciera("");
		this.informacionfinancieraSessionBean.setiNumeroPaginacion(InformacionFinancieraConstantesFunciones.INUMEROPAGINACION);
		this.informacionfinancieraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaInformacionFinanciera(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioInformacionFinanciera() {
		this.updateBorderResaltarBusquedasFormularioInformacionFinanciera();
		this.updateVisibilidadBusquedasFormularioInformacionFinanciera();
		this.updateHabilitarBusquedasFormularioInformacionFinanciera();
	}
	
	public void updateBorderResaltarBusquedasFormularioInformacionFinanciera() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasInformacionFinanciera.getComponents().length>0) {
	

		if(this.informacionfinancieraConstantesFunciones.resaltarFK_IdClienteInformacionFinanciera!=null) {
			index= this.jTabbedPaneBusquedasInformacionFinanciera.indexOfComponent(this.jPanelFK_IdClienteInformacionFinanciera);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionFinanciera.getComponent(index);
				jPanel.setBorder(this.informacionfinancieraConstantesFunciones.resaltarFK_IdClienteInformacionFinanciera);
			}
		}

		if(this.informacionfinancieraConstantesFunciones.resaltarFK_IdValorClienteMovimientoInformacionFinanciera!=null) {
			index= this.jTabbedPaneBusquedasInformacionFinanciera.indexOfComponent(this.jPanelFK_IdValorClienteMovimientoInformacionFinanciera);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionFinanciera.getComponent(index);
				jPanel.setBorder(this.informacionfinancieraConstantesFunciones.resaltarFK_IdValorClienteMovimientoInformacionFinanciera);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioInformacionFinanciera() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasInformacionFinanciera.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasInformacionFinanciera.indexOfComponent(this.jPanelFK_IdClienteInformacionFinanciera);
			jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionFinanciera.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.informacionfinancieraConstantesFunciones.mostrarFK_IdClienteInformacionFinanciera);
			if(!this.informacionfinancieraConstantesFunciones.mostrarFK_IdClienteInformacionFinanciera && index>-1) {
				this.jTabbedPaneBusquedasInformacionFinanciera.remove(index);
			}

			index= this.jTabbedPaneBusquedasInformacionFinanciera.indexOfComponent(this.jPanelFK_IdValorClienteMovimientoInformacionFinanciera);
			jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionFinanciera.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.informacionfinancieraConstantesFunciones.mostrarFK_IdValorClienteMovimientoInformacionFinanciera);
			if(!this.informacionfinancieraConstantesFunciones.mostrarFK_IdValorClienteMovimientoInformacionFinanciera && index>-1) {
				this.jTabbedPaneBusquedasInformacionFinanciera.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioInformacionFinanciera() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasInformacionFinanciera.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasInformacionFinanciera.indexOfComponent(this.jPanelFK_IdClienteInformacionFinanciera);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionFinanciera.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.informacionfinancieraConstantesFunciones.activarFK_IdClienteInformacionFinanciera);
				this.jTabbedPaneBusquedasInformacionFinanciera.setEnabledAt(index,this.informacionfinancieraConstantesFunciones.activarFK_IdClienteInformacionFinanciera);
			}

			index= this.jTabbedPaneBusquedasInformacionFinanciera.indexOfComponent(this.jPanelFK_IdValorClienteMovimientoInformacionFinanciera);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionFinanciera.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.informacionfinancieraConstantesFunciones.activarFK_IdValorClienteMovimientoInformacionFinanciera);
				this.jTabbedPaneBusquedasInformacionFinanciera.setEnabledAt(index,this.informacionfinancieraConstantesFunciones.activarFK_IdValorClienteMovimientoInformacionFinanciera);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaInformacionFinanciera(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasInformacionFinanciera.indexOfComponent(this.jPanelFK_IdClienteInformacionFinanciera);

			this.jTabbedPaneBusquedasInformacionFinanciera.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionFinanciera.getComponent(index);

			this.informacionfinancieraConstantesFunciones.setResaltarFK_IdClienteInformacionFinanciera(resaltar);

			jPanel.setBorder(this.informacionfinancieraConstantesFunciones.resaltarFK_IdClienteInformacionFinanciera);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdValorClienteMovimiento")) {
			index= this.jTabbedPaneBusquedasInformacionFinanciera.indexOfComponent(this.jPanelFK_IdValorClienteMovimientoInformacionFinanciera);

			this.jTabbedPaneBusquedasInformacionFinanciera.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionFinanciera.getComponent(index);

			this.informacionfinancieraConstantesFunciones.setResaltarFK_IdValorClienteMovimientoInformacionFinanciera(resaltar);

			jPanel.setBorder(this.informacionfinancieraConstantesFunciones.resaltarFK_IdValorClienteMovimientoInformacionFinanciera);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarInformacionFinanciera.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioInformacionFinanciera() throws Exception {

		if(this.jInternalFrameDetalleFormInformacionFinanciera==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioInformacionFinanciera();
		this.updateVisibilidadResaltarControlesFormularioInformacionFinanciera();
		this.updateHabilitarResaltarControlesFormularioInformacionFinanciera();
		
	}
	
	public void updateBorderResaltarControlesFormularioInformacionFinanciera() throws Exception {
		if(this.jInternalFrameDetalleFormInformacionFinanciera==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.informacionfinancieraConstantesFunciones.resaltaridInformacionFinanciera!=null && this.jInternalFrameDetalleFormInformacionFinanciera!=null) {this.jInternalFrameDetalleFormInformacionFinanciera.jLabelidInformacionFinanciera.setBorder(this.informacionfinancieraConstantesFunciones.resaltaridInformacionFinanciera);}
		if(this.informacionfinancieraConstantesFunciones.resaltarid_empresaInformacionFinanciera!=null && this.jInternalFrameDetalleFormInformacionFinanciera!=null) {this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxid_empresaInformacionFinanciera.setBorder(this.informacionfinancieraConstantesFunciones.resaltarid_empresaInformacionFinanciera);}
		if(this.informacionfinancieraConstantesFunciones.resaltaridclienteInformacionFinanciera!=null && this.jInternalFrameDetalleFormInformacionFinanciera!=null) {this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidclienteInformacionFinanciera.setBorder(this.informacionfinancieraConstantesFunciones.resaltaridclienteInformacionFinanciera);}
		if(this.informacionfinancieraConstantesFunciones.resaltaridvalorclientemovimientoInformacionFinanciera!=null && this.jInternalFrameDetalleFormInformacionFinanciera!=null) {this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidvalorclientemovimientoInformacionFinanciera.setBorder(this.informacionfinancieraConstantesFunciones.resaltaridvalorclientemovimientoInformacionFinanciera);}
		if(this.informacionfinancieraConstantesFunciones.resaltarvalorInformacionFinanciera!=null && this.jInternalFrameDetalleFormInformacionFinanciera!=null) {this.jInternalFrameDetalleFormInformacionFinanciera.jTextFieldvalorInformacionFinanciera.setBorder(this.informacionfinancieraConstantesFunciones.resaltarvalorInformacionFinanciera);}
		if(this.informacionfinancieraConstantesFunciones.resaltardescripcionInformacionFinanciera!=null && this.jInternalFrameDetalleFormInformacionFinanciera!=null) {this.jInternalFrameDetalleFormInformacionFinanciera.jTextAreadescripcionInformacionFinanciera.setBorder(this.informacionfinancieraConstantesFunciones.resaltardescripcionInformacionFinanciera);}
		if(this.informacionfinancieraConstantesFunciones.resaltaresactivoInformacionFinanciera!=null && this.jInternalFrameDetalleFormInformacionFinanciera!=null) {this.jInternalFrameDetalleFormInformacionFinanciera.jCheckBoxesactivoInformacionFinanciera.setBorderPainted(true);this.jInternalFrameDetalleFormInformacionFinanciera.jCheckBoxesactivoInformacionFinanciera.setBorder(this.informacionfinancieraConstantesFunciones.resaltaresactivoInformacionFinanciera);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioInformacionFinanciera() throws Exception {		
		if(this.jInternalFrameDetalleFormInformacionFinanciera==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
	
		//this.jInternalFrameDetalleFormInformacionFinanciera.jLabelidInformacionFinanciera.setVisible(this.informacionfinancieraConstantesFunciones.mostraridInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jPanelidInformacionFinanciera.setVisible(this.informacionfinancieraConstantesFunciones.mostraridInformacionFinanciera);
		//this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxid_empresaInformacionFinanciera.setVisible(this.informacionfinancieraConstantesFunciones.mostrarid_empresaInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jPanelid_empresaInformacionFinanciera.setVisible(this.informacionfinancieraConstantesFunciones.mostrarid_empresaInformacionFinanciera);
		//this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidclienteInformacionFinanciera.setVisible(this.informacionfinancieraConstantesFunciones.mostraridclienteInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jPanelidclienteInformacionFinanciera.setVisible(this.informacionfinancieraConstantesFunciones.mostraridclienteInformacionFinanciera);
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidclienteInformacionFinanciera.setVisible(this.informacionfinancieraConstantesFunciones.mostraridclienteInformacionFinanciera);
		//this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidvalorclientemovimientoInformacionFinanciera.setVisible(this.informacionfinancieraConstantesFunciones.mostraridvalorclientemovimientoInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jPanelidvalorclientemovimientoInformacionFinanciera.setVisible(this.informacionfinancieraConstantesFunciones.mostraridvalorclientemovimientoInformacionFinanciera);
		//this.jInternalFrameDetalleFormInformacionFinanciera.jTextFieldvalorInformacionFinanciera.setVisible(this.informacionfinancieraConstantesFunciones.mostrarvalorInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jPanelvalorInformacionFinanciera.setVisible(this.informacionfinancieraConstantesFunciones.mostrarvalorInformacionFinanciera);
		//this.jInternalFrameDetalleFormInformacionFinanciera.jTextAreadescripcionInformacionFinanciera.setVisible(this.informacionfinancieraConstantesFunciones.mostrardescripcionInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jPaneldescripcionInformacionFinanciera.setVisible(this.informacionfinancieraConstantesFunciones.mostrardescripcionInformacionFinanciera);
		//this.jInternalFrameDetalleFormInformacionFinanciera.jCheckBoxesactivoInformacionFinanciera.setVisible(this.informacionfinancieraConstantesFunciones.mostraresactivoInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jPanelesactivoInformacionFinanciera.setVisible(this.informacionfinancieraConstantesFunciones.mostraresactivoInformacionFinanciera);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioInformacionFinanciera() throws Exception {
		if(this.jInternalFrameDetalleFormInformacionFinanciera==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormInformacionFinanciera!=null) {
	
		this.jInternalFrameDetalleFormInformacionFinanciera.jLabelidInformacionFinanciera.setEnabled(this.informacionfinancieraConstantesFunciones.activaridInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxid_empresaInformacionFinanciera.setEnabled(this.informacionfinancieraConstantesFunciones.activarid_empresaInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidclienteInformacionFinanciera.setEnabled(this.informacionfinancieraConstantesFunciones.activaridclienteInformacionFinanciera);
			this.jInternalFrameDetalleFormInformacionFinanciera.jButtonidclienteInformacionFinanciera.setEnabled(this.informacionfinancieraConstantesFunciones.activaridclienteInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jComboBoxidvalorclientemovimientoInformacionFinanciera.setEnabled(this.informacionfinancieraConstantesFunciones.activaridvalorclientemovimientoInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jTextFieldvalorInformacionFinanciera.setEnabled(this.informacionfinancieraConstantesFunciones.activarvalorInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jTextAreadescripcionInformacionFinanciera.setEnabled(this.informacionfinancieraConstantesFunciones.activardescripcionInformacionFinanciera);
		this.jInternalFrameDetalleFormInformacionFinanciera.jCheckBoxesactivoInformacionFinanciera.setEnabled(this.informacionfinancieraConstantesFunciones.activaresactivoInformacionFinanciera);
		}
	}
	
		
}