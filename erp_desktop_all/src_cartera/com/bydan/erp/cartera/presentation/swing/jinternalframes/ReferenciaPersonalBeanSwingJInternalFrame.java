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

import com.bydan.erp.cartera.util.ReferenciaPersonalConstantesFunciones;
import com.bydan.erp.cartera.util.ReferenciaPersonalParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ReferenciaPersonalParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.ReferenciaPersonalBean;
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
public class ReferenciaPersonalBeanSwingJInternalFrame extends ReferenciaPersonalJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ReferenciaPersonalBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ReferenciaPersonal> referenciapersonalValidator = new ClassValidator<ReferenciaPersonal>(ReferenciaPersonal.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ReferenciaPersonal referenciapersonal;	
	public ReferenciaPersonal referenciapersonalAux;
	public ReferenciaPersonal referenciapersonalAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ReferenciaPersonal referenciapersonalTotales;
	public Long idReferenciaPersonalActual;
	public Long iIdNuevoReferenciaPersonal=0L;
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

	public String sFinalQueryComboTipoRefePerso="";

	public List<TipoRefePerso> tiporefepersosForeignKey;

	public List<TipoRefePerso> gettiporefepersosForeignKey() {
		return tiporefepersosForeignKey;
	}

	public void settiporefepersosForeignKey(List<TipoRefePerso> tiporefepersosForeignKey) {
		this.tiporefepersosForeignKey = tiporefepersosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoRefePerso tiporefepersoForeignKey;

	public TipoRefePerso gettiporefepersoForeignKey() {
		return tiporefepersoForeignKey;
	}

	public void settiporefepersoForeignKey(TipoRefePerso tiporefepersoForeignKey) {
		this.tiporefepersoForeignKey = tiporefepersoForeignKey;
	}

	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
	}

	public String sFinalQueryComboCiudad="";

	public List<Ciudad> ciudadsForeignKey;

	public List<Ciudad> getciudadsForeignKey() {
		return ciudadsForeignKey;
	}

	public void setciudadsForeignKey(List<Ciudad> ciudadsForeignKey) {
		this.ciudadsForeignKey = ciudadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ciudad ciudadForeignKey;

	public Ciudad getciudadForeignKey() {
		return ciudadForeignKey;
	}

	public void setciudadForeignKey(Ciudad ciudadForeignKey) {
		this.ciudadForeignKey = ciudadForeignKey;
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
	
	public Boolean isPermisoTodoReferenciaPersonal;
	public Boolean isPermisoNuevoReferenciaPersonal;
	public Boolean isPermisoActualizarReferenciaPersonal;
	public Boolean isPermisoActualizarOriginalReferenciaPersonal;
	public Boolean isPermisoEliminarReferenciaPersonal;
	public Boolean isPermisoGuardarCambiosReferenciaPersonal;
	public Boolean isPermisoConsultaReferenciaPersonal;
	public Boolean isPermisoBusquedaReferenciaPersonal;
	public Boolean isPermisoReporteReferenciaPersonal;
	public Boolean isPermisoPaginacionMedioReferenciaPersonal;
	public Boolean isPermisoPaginacionAltoReferenciaPersonal;
	public Boolean isPermisoPaginacionTodoReferenciaPersonal;
	public Boolean isPermisoCopiarReferenciaPersonal;
	public Boolean isPermisoVerFormReferenciaPersonal;
	public Boolean isPermisoDuplicarReferenciaPersonal;
	public Boolean isPermisoOrdenReferenciaPersonal;
	
	
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
	
	public ReferenciaPersonalParameterReturnGeneral referenciapersonalReturnGeneral;
	public ReferenciaPersonalParameterReturnGeneral referenciapersonalParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoReferenciaPersonal=false;
	public Boolean esParaAccionDesdeFormularioReferenciaPersonal=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ReferenciaPersonalSessionBeanAdditional referenciapersonalSessionBeanAdditional=null;
	
	public ReferenciaPersonalSessionBeanAdditional getReferenciaPersonalSessionBeanAdditional() {
		return this.referenciapersonalSessionBeanAdditional;
	}
	
	public void setReferenciaPersonalSessionBeanAdditional(ReferenciaPersonalSessionBeanAdditional referenciapersonalSessionBeanAdditional) {
		try {
			this.referenciapersonalSessionBeanAdditional=referenciapersonalSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ReferenciaPersonalBeanSwingJInternalFrameAdditional referenciapersonalBeanSwingJInternalFrameAdditional=null;
	//public class ReferenciaPersonalBeanSwingJInternalFrame
	
	public ReferenciaPersonalBeanSwingJInternalFrameAdditional getReferenciaPersonalBeanSwingJInternalFrameAdditional() {
		return this.referenciapersonalBeanSwingJInternalFrameAdditional;
	}
	
	public void setReferenciaPersonalBeanSwingJInternalFrameAdditional(ReferenciaPersonalBeanSwingJInternalFrameAdditional referenciapersonalBeanSwingJInternalFrameAdditional) {
		try {
			this.referenciapersonalBeanSwingJInternalFrameAdditional=referenciapersonalBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ReferenciaPersonalLogic referenciapersonalLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ReferenciaPersonal referenciapersonalBean;
	public ReferenciaPersonalConstantesFunciones referenciapersonalConstantesFunciones;
	//public ReferenciaPersonalParameterReturnGeneral referenciapersonalReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	public TipoRefePersoLogic tiporefepersoLogic;
	public PaisLogic paisLogic;
	public CiudadLogic ciudadLogic;
	
	//PARAMETROS
	
	
	//public List<ReferenciaPersonal> referenciapersonals;	
	//public List<ReferenciaPersonal> referenciapersonalsEliminados;
	//public List<ReferenciaPersonal> referenciapersonalsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoReferenciaPersonal=false;
	public Boolean isVisibilidadCeldaDuplicarReferenciaPersonal=true;
	public Boolean isVisibilidadCeldaCopiarReferenciaPersonal=true;
	public Boolean isVisibilidadCeldaVerFormReferenciaPersonal=true;
	public Boolean isVisibilidadCeldaOrdenReferenciaPersonal=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesReferenciaPersonal=false;
	public Boolean isVisibilidadCeldaModificarReferenciaPersonal=false;
	public Boolean isVisibilidadCeldaActualizarReferenciaPersonal=false;
	public Boolean isVisibilidadCeldaEliminarReferenciaPersonal=false;
	public Boolean isVisibilidadCeldaCancelarReferenciaPersonal=false;
	public Boolean isVisibilidadCeldaGuardarReferenciaPersonal=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosReferenciaPersonal=false;	
	
	
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdTipoReferenciaPersonal=false;
	
	public Long getiIdNuevoReferenciaPersonal() {
		return this.iIdNuevoReferenciaPersonal;
	}

	public void setiIdNuevoReferenciaPersonal(Long iIdNuevoReferenciaPersonal) {
		this.iIdNuevoReferenciaPersonal = iIdNuevoReferenciaPersonal;
	}
	
	public Long getidReferenciaPersonalActual() {
		return this.idReferenciaPersonalActual;
	}

	public void setidReferenciaPersonalActual(Long idReferenciaPersonalActual) {
		this.idReferenciaPersonalActual = idReferenciaPersonalActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ReferenciaPersonal getreferenciapersonal() {
		return this.referenciapersonal;
	}

	public void setreferenciapersonal(ReferenciaPersonal referenciapersonal) {
		this.referenciapersonal = referenciapersonal;
	}
	
	public ReferenciaPersonal getreferenciapersonalAux() {
		return this.referenciapersonalAux;
	}

	public void setreferenciapersonalAux(ReferenciaPersonal referenciapersonalAux) {
		this.referenciapersonalAux = referenciapersonalAux;
	}				
	
	public ReferenciaPersonal getreferenciapersonalAnterior() {
		return this.referenciapersonalAnterior;
	}

	public void setreferenciapersonalAnterior(ReferenciaPersonal referenciapersonalAnterior) {
		this.referenciapersonalAnterior = referenciapersonalAnterior;
	}	
	
	public ReferenciaPersonal getreferenciapersonalTotales() {
		return this.referenciapersonalTotales;
	}

	public void setreferenciapersonalTotales(ReferenciaPersonal referenciapersonalTotales) {
		this.referenciapersonalTotales = referenciapersonalTotales;
	}	
	
	public ReferenciaPersonal getreferenciapersonalBean() {
		return this.referenciapersonalBean;
	}

	public void setreferenciapersonalBean(ReferenciaPersonal referenciapersonalBean) {
		this.referenciapersonalBean = referenciapersonalBean;
	}	
	
	public ReferenciaPersonalParameterReturnGeneral getreferenciapersonalReturnGeneral() {
		return this.referenciapersonalReturnGeneral;
	}

	public void setreferenciapersonalReturnGeneral(ReferenciaPersonalParameterReturnGeneral referenciapersonalReturnGeneral) {
		this.referenciapersonalReturnGeneral = referenciapersonalReturnGeneral;
	}	
	
	
	public Long idciudadFK_IdCiudad=-1L;

	public Long getidciudadFK_IdCiudad() {
		return this.idciudadFK_IdCiudad;
	}

	public void setidciudadFK_IdCiudad(Long idciudadFK_IdCiudad) {
		this.idciudadFK_IdCiudad = idciudadFK_IdCiudad;
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

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

	public Long idvalorclientereferenciapersonalFK_IdTipoReferenciaPersonal=-1L;

	public Long getidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonal() {
		return this.idvalorclientereferenciapersonalFK_IdTipoReferenciaPersonal;
	}

	public void setidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonal(Long idvalorclientereferenciapersonalFK_IdTipoReferenciaPersonal) {
		this.idvalorclientereferenciapersonalFK_IdTipoReferenciaPersonal = idvalorclientereferenciapersonalFK_IdTipoReferenciaPersonal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ReferenciaPersonalLogic getReferenciaPersonalLogic()	{		
		return referenciapersonalLogic;
	}

	public void setReferenciaPersonalLogic(ReferenciaPersonalLogic referenciapersonalLogic) {
		this.referenciapersonalLogic = referenciapersonalLogic;
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
	
	public Boolean getIsEsNuevoReferenciaPersonal() {
		return isEsNuevoReferenciaPersonal;
	}

	public void setIsEsNuevoReferenciaPersonal(Boolean isEsNuevoReferenciaPersonal) {
		this.isEsNuevoReferenciaPersonal = isEsNuevoReferenciaPersonal;
	}

	public Boolean getEsParaAccionDesdeFormularioReferenciaPersonal() {
		return esParaAccionDesdeFormularioReferenciaPersonal;
	}
	
	public void setEsParaAccionDesdeFormularioReferenciaPersonal(Boolean esParaAccionDesdeFormularioReferenciaPersonal) {
		this.esParaAccionDesdeFormularioReferenciaPersonal = esParaAccionDesdeFormularioReferenciaPersonal;
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

			if(this.referenciapersonalSessionBean==null) {
				this.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
			}

			if(!this.referenciapersonalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(referenciapersonalSessionBean.getlidEmpresaActual());
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

			if(this.referenciapersonalSessionBean==null) {
				this.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
			}

			if(!this.referenciapersonalSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(referenciapersonalSessionBean.getlidClienteActual());
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

	public void cargarCombosTipoRefePersosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiporefepersosForeignKey=new ArrayList<TipoRefePerso>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoRefePersoLogic tiporefepersoLogic=new TipoRefePersoLogic();

			//tiporefepersoLogic.getTipoRefePersoDataAccess().setIsForForeingKeyData(true);

			if(this.referenciapersonalSessionBean==null) {
				this.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
			}

			if(!this.referenciapersonalSessionBean.getisBusquedaDesdeForeignKeySesionTipoRefePerso()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tiporefepersoLogic.getTipoRefePersoDataAccess().setIsForForeingKeyData(true);

					tiporefepersoLogic.getTodosTipoRefePersosWithConnection(sFinalQuery,new Pagination());

					this.tiporefepersosForeignKey=tiporefepersoLogic.getTipoRefePersos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoRefePerso(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporefepersoLogic.getEntityWithConnection(referenciapersonalSessionBean.getlidTipoRefePersoActual());
					this.tiporefepersosForeignKey.add(tiporefepersoLogic.getTipoRefePerso());
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

	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.referenciapersonalSessionBean==null) {
				this.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
			}

			if(!this.referenciapersonalSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(referenciapersonalSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

	public void cargarCombosCiudadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ciudadsForeignKey=new ArrayList<Ciudad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CiudadLogic ciudadLogic=new CiudadLogic();

			//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

			if(this.referenciapersonalSessionBean==null) {
				this.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
			}

			if(!this.referenciapersonalSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

					ciudadLogic.getTodosCiudadsWithConnection(sFinalQuery,new Pagination());

					this.ciudadsForeignKey=ciudadLogic.getCiudads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCiudad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getEntityWithConnection(referenciapersonalSessionBean.getlidCiudadActual());
					this.ciudadsForeignKey.add(ciudadLogic.getCiudad());
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

					if(this.referenciapersonal!=null) {
						this.referenciapersonal.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
						this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_empresaReferenciaPersonal.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaReferenciaPersonal.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
						if(this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_empresaReferenciaPersonal.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_empresaReferenciaPersonal.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaReferenciaPersonalGenerico)throws Exception
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
				jComboBoxid_empresaReferenciaPersonalGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaReferenciaPersonalGenerico!=null && jComboBoxid_empresaReferenciaPersonalGenerico.getItemCount()>0) {
					jComboBoxid_empresaReferenciaPersonalGenerico.setSelectedIndex(0);
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

					if(this.referenciapersonal!=null) {
						this.referenciapersonal.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
						this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidclienteReferenciaPersonal.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxidclienteReferenciaPersonal.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
						if(this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidclienteReferenciaPersonal.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidclienteReferenciaPersonal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxidclienteFK_IdClienteReferenciaPersonal!=null) {
						jComboBoxidclienteFK_IdClienteReferenciaPersonal.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxidclienteFK_IdClienteReferenciaPersonal!=null) {
							//jComboBoxidclienteFK_IdClienteReferenciaPersonal.setSelectedItem(clienteTemp);
							if(jComboBoxidclienteFK_IdClienteReferenciaPersonal.getItemCount()>0) {
								jComboBoxidclienteFK_IdClienteReferenciaPersonal.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxidclienteReferenciaPersonalGenerico)throws Exception
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
				jComboBoxidclienteReferenciaPersonalGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxidclienteReferenciaPersonalGenerico!=null && jComboBoxidclienteReferenciaPersonalGenerico.getItemCount()>0) {
					jComboBoxidclienteReferenciaPersonalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoRefePersoForeignKey(Long idTipoRefePersoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoRefePerso  tiporefepersoTemp=null;

			for(TipoRefePerso tiporefepersoAux:tiporefepersosForeignKey) {
				if(tiporefepersoAux.getId()!=null && tiporefepersoAux.getId().equals(idTipoRefePersoSeleccionado)) {
					tiporefepersoTemp=tiporefepersoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiporefepersoTemp!=null) {

					if(this.referenciapersonal!=null) {
						this.referenciapersonal.setTipoRefePerso(tiporefepersoTemp);
					}

					if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
						this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.setSelectedItem(tiporefepersoTemp);
					}
				} else {
					//jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.setSelectedItem(tiporefepersoTemp);
					if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
						if(this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoReferenciaPersonal") || sFormularioTipoBusqueda.equals("Todos")){
					if(tiporefepersoTemp!=null && jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal!=null) {
						jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.setSelectedItem(tiporefepersoTemp);
					} else {
						if(jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal!=null) {
							//jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.setSelectedItem(tiporefepersoTemp);
							if(jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.getItemCount()>0) {
								jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.setSelectedIndex(0);
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

	public String getActualTipoRefePersoForeignKeyDescripcion(Long idTipoRefePersoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoRefePerso  tiporefepersoTemp=null;

			for(TipoRefePerso tiporefepersoAux:tiporefepersosForeignKey) {
				if(tiporefepersoAux.getId()!=null && tiporefepersoAux.getId().equals(idTipoRefePersoSeleccionado)) {
					tiporefepersoTemp=tiporefepersoAux;
					break;
				}
			}


			sDescripcion=TipoRefePersoConstantesFunciones.getTipoRefePersoDescripcion(tiporefepersoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoRefePersoForeignKeyGenerico(Long idTipoRefePersoSeleccionado,JComboBox jComboBoxidvalorclientereferenciapersonalReferenciaPersonalGenerico)throws Exception
	{
		try
		{
			TipoRefePerso  tiporefepersoTemp=null;

			for(TipoRefePerso tiporefepersoAux:tiporefepersosForeignKey) {
				if(tiporefepersoAux.getId()!=null && tiporefepersoAux.getId().equals(idTipoRefePersoSeleccionado)) {
					tiporefepersoTemp=tiporefepersoAux;
					break;
				}
			}

			if(tiporefepersoTemp!=null) {
				jComboBoxidvalorclientereferenciapersonalReferenciaPersonalGenerico.setSelectedItem(tiporefepersoTemp);
			} else {
				if(jComboBoxidvalorclientereferenciapersonalReferenciaPersonalGenerico!=null && jComboBoxidvalorclientereferenciapersonalReferenciaPersonalGenerico.getItemCount()>0) {
					jComboBoxidvalorclientereferenciapersonalReferenciaPersonalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.referenciapersonal!=null) {
						this.referenciapersonal.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
						this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisReferenciaPersonal.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
						if(this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisReferenciaPersonal!=null) {
						jComboBoxid_paisFK_IdPaisReferenciaPersonal.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisReferenciaPersonal!=null) {
							//jComboBoxid_paisFK_IdPaisReferenciaPersonal.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisReferenciaPersonal.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisReferenciaPersonal.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisReferenciaPersonalGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisReferenciaPersonalGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisReferenciaPersonalGenerico!=null && jComboBoxid_paisReferenciaPersonalGenerico.getItemCount()>0) {
					jComboBoxid_paisReferenciaPersonalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCiudadForeignKey(Long idCiudadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ciudadTemp!=null) {

					if(this.referenciapersonal!=null) {
						this.referenciapersonal.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
						this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidciudadReferenciaPersonal.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxidciudadReferenciaPersonal.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
						if(this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidciudadReferenciaPersonal.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidciudadReferenciaPersonal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){
					if(ciudadTemp!=null && jComboBoxidciudadFK_IdCiudadReferenciaPersonal!=null) {
						jComboBoxidciudadFK_IdCiudadReferenciaPersonal.setSelectedItem(ciudadTemp);
					} else {
						if(jComboBoxidciudadFK_IdCiudadReferenciaPersonal!=null) {
							//jComboBoxidciudadFK_IdCiudadReferenciaPersonal.setSelectedItem(ciudadTemp);
							if(jComboBoxidciudadFK_IdCiudadReferenciaPersonal.getItemCount()>0) {
								jComboBoxidciudadFK_IdCiudadReferenciaPersonal.setSelectedIndex(0);
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

	public String getActualCiudadForeignKeyDescripcion(Long idCiudadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}


			sDescripcion=CiudadConstantesFunciones.getCiudadDescripcion(ciudadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxidciudadReferenciaPersonalGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(ciudadTemp!=null) {
				jComboBoxidciudadReferenciaPersonalGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxidciudadReferenciaPersonalGenerico!=null && jComboBoxidciudadReferenciaPersonalGenerico.getItemCount()>0) {
					jComboBoxidciudadReferenciaPersonalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ReferenciaPersonal referenciapersonal,JComboBox jComboBoxid_empresaReferenciaPersonalGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaReferenciaPersonalGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_empresaReferenciaPersonal.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaReferenciaPersonalGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				referenciapersonal.setid_empresa(empresaAux.getId());
				referenciapersonal.setempresa_descripcion(ReferenciaPersonalConstantesFunciones.getEmpresaDescripcion(empresaAux));
				referenciapersonal.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ReferenciaPersonal referenciapersonal,JComboBox jComboBoxidclienteReferenciaPersonalGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxidclienteReferenciaPersonalGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidclienteReferenciaPersonal.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxidclienteReferenciaPersonalGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				referenciapersonal.setidcliente(clienteAux.getId());
				referenciapersonal.setcliente_descripcion(ReferenciaPersonalConstantesFunciones.getClienteDescripcion(clienteAux));
				referenciapersonal.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRefePersoForeignKey(ReferenciaPersonal referenciapersonal,JComboBox jComboBoxidvalorclientereferenciapersonalReferenciaPersonalGenerico)throws Exception
	{
		try
		{
			TipoRefePerso  tiporefepersoAux=new TipoRefePerso();

			if(jComboBoxidvalorclientereferenciapersonalReferenciaPersonalGenerico==null) {
				tiporefepersoAux=(TipoRefePerso)this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.getSelectedItem();
			} else {
				tiporefepersoAux=(TipoRefePerso)jComboBoxidvalorclientereferenciapersonalReferenciaPersonalGenerico.getSelectedItem();
			}

			if(tiporefepersoAux!=null && tiporefepersoAux.getId()!=null) {
				referenciapersonal.setidvalorclientereferenciapersonal(tiporefepersoAux.getId());
				referenciapersonal.settiporefeperso_descripcion(ReferenciaPersonalConstantesFunciones.getTipoRefePersoDescripcion(tiporefepersoAux));
				referenciapersonal.setTipoRefePerso(tiporefepersoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(ReferenciaPersonal referenciapersonal,JComboBox jComboBoxid_paisReferenciaPersonalGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisReferenciaPersonalGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisReferenciaPersonalGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				referenciapersonal.setid_pais(paisAux.getId());
				referenciapersonal.setpais_descripcion(ReferenciaPersonalConstantesFunciones.getPaisDescripcion(paisAux));
				referenciapersonal.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(ReferenciaPersonal referenciapersonal,JComboBox jComboBoxidciudadReferenciaPersonalGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxidciudadReferenciaPersonalGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidciudadReferenciaPersonal.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxidciudadReferenciaPersonalGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				referenciapersonal.setidciudad(ciudadAux.getId());
				referenciapersonal.setciudad_descripcion(ReferenciaPersonalConstantesFunciones.getCiudadDescripcion(ciudadAux));
				referenciapersonal.setCiudad(ciudadAux);			}
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

					if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { 
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_empresaReferenciaPersonal.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_empresaReferenciaPersonal.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { 
					}

					if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { 
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidclienteReferenciaPersonal.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidclienteReferenciaPersonal.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { 
					}

					if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidclienteFK_IdClienteReferenciaPersonal.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxidclienteFK_IdClienteReferenciaPersonal.addItem(cliente);
							}
						}

						if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoRefePersosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoRefePerso=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { 
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.removeAllItems();

							for(TipoRefePerso tiporefeperso:this.tiporefepersosForeignKey) {
								this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.addItem(tiporefeperso);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { 
					}

					if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoReferenciaPersonal") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.removeAllItems();

							for(TipoRefePerso tiporefeperso:this.tiporefepersosForeignKey) {
								this.jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.addItem(tiporefeperso);
							}
						}

						if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { 
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { 
					}

					if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisReferenciaPersonal.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisReferenciaPersonal.addItem(pais);
							}
						}

						if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCiudadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCiudad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { 
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidciudadReferenciaPersonal.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidciudadReferenciaPersonal.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { 
					}

					if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidciudadFK_IdCiudadReferenciaPersonal.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jComboBoxidciudadFK_IdCiudadReferenciaPersonal.addItem(ciudad);
							}
						}

						if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_empresaReferenciaPersonal.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_empresaReferenciaPersonal.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidclienteReferenciaPersonal.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidclienteReferenciaPersonal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidclienteFK_IdClienteReferenciaPersonal.setSelectedItem(cliente);
						} else {
							this.jComboBoxidclienteFK_IdClienteReferenciaPersonal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoRefePersoForeignKey(TipoRefePerso tiporefeperso,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.setSelectedItem(tiporefeperso);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.setSelectedItem(tiporefeperso);
						} else {
							this.jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisReferenciaPersonal.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisReferenciaPersonal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCiudadForeignKey(Ciudad ciudad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidciudadReferenciaPersonal.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidciudadReferenciaPersonal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidciudadFK_IdCiudadReferenciaPersonal.setSelectedItem(ciudad);
						} else {
							this.jComboBoxidciudadFK_IdCiudadReferenciaPersonal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesReferenciaPersonal() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ReferenciaPersonalConstantesFunciones.refrescarForeignKeysDescripcionesReferenciaPersonal(this.referenciapersonalLogic.getReferenciaPersonals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ReferenciaPersonalConstantesFunciones.refrescarForeignKeysDescripcionesReferenciaPersonal(this.referenciapersonals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoRefePerso.class));
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(Ciudad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//referenciapersonalLogic.setReferenciaPersonals(this.referenciapersonals);
			referenciapersonalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ReferenciaPersonalParameterReturnGeneral getReferenciaPersonalParameterGeneral() {
		return this.referenciapersonalParameterGeneral;
	}
	
	public void setReferenciaPersonalParameterGeneral(ReferenciaPersonalParameterReturnGeneral referenciapersonalParameterGeneral) {
		this.referenciapersonalParameterGeneral = referenciapersonalParameterGeneral;
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
	
	public Boolean getIsPermisoTodoReferenciaPersonal() {
		return isPermisoTodoReferenciaPersonal;
	}

	public void setIsPermisoTodoReferenciaPersonal(Boolean isPermisoTodoReferenciaPersonal) {
		this.isPermisoTodoReferenciaPersonal = isPermisoTodoReferenciaPersonal;
	}

	public Boolean getIsPermisoNuevoReferenciaPersonal() {
		return isPermisoNuevoReferenciaPersonal;
	}

	public void setIsPermisoNuevoReferenciaPersonal(Boolean isPermisoNuevoReferenciaPersonal) {
		this.isPermisoNuevoReferenciaPersonal = isPermisoNuevoReferenciaPersonal;
	}

	public Boolean getIsPermisoActualizarReferenciaPersonal() {
		return isPermisoActualizarReferenciaPersonal;
	}

	public void setIsPermisoActualizarReferenciaPersonal(Boolean isPermisoActualizarReferenciaPersonal) {
		this.isPermisoActualizarReferenciaPersonal = isPermisoActualizarReferenciaPersonal;
	}

	public Boolean getIsPermisoEliminarReferenciaPersonal() {
		return isPermisoEliminarReferenciaPersonal;
	}

	public void setIsPermisoEliminarReferenciaPersonal(Boolean isPermisoEliminarReferenciaPersonal) {
		this.isPermisoEliminarReferenciaPersonal = isPermisoEliminarReferenciaPersonal;
	}

	public Boolean getIsPermisoGuardarCambiosReferenciaPersonal() {
		return isPermisoGuardarCambiosReferenciaPersonal;
	}

	public void setIsPermisoGuardarCambiosReferenciaPersonal(Boolean isPermisoGuardarCambiosReferenciaPersonal) {
		this.isPermisoGuardarCambiosReferenciaPersonal = isPermisoGuardarCambiosReferenciaPersonal;
	}
	
	public Boolean getIsPermisoConsultaReferenciaPersonal() {
		return isPermisoConsultaReferenciaPersonal;
	}

	public void setIsPermisoConsultaReferenciaPersonal(Boolean isPermisoConsultaReferenciaPersonal) {
		this.isPermisoConsultaReferenciaPersonal = isPermisoConsultaReferenciaPersonal;
	}

	public Boolean getIsPermisoBusquedaReferenciaPersonal() {
		return isPermisoBusquedaReferenciaPersonal;
	}

	public void setIsPermisoBusquedaReferenciaPersonal(Boolean isPermisoBusquedaReferenciaPersonal) {
		this.isPermisoBusquedaReferenciaPersonal = isPermisoBusquedaReferenciaPersonal;
	}

	public Boolean getIsPermisoReporteReferenciaPersonal() {
		return isPermisoReporteReferenciaPersonal;
	}

	public void setIsPermisoReporteReferenciaPersonal(Boolean isPermisoReporteReferenciaPersonal) {
		this.isPermisoReporteReferenciaPersonal = isPermisoReporteReferenciaPersonal;
	}
	
	public Boolean getIsPermisoPaginacionMedioReferenciaPersonal() {
		return isPermisoPaginacionMedioReferenciaPersonal;
	}

	public void setIsPermisoPaginacionMedioReferenciaPersonal(Boolean isPermisoPaginacionMedioReferenciaPersonal) {
		this.isPermisoPaginacionMedioReferenciaPersonal = isPermisoPaginacionMedioReferenciaPersonal;
	}
	
	public Boolean getIsPermisoPaginacionTodoReferenciaPersonal() {
		return isPermisoPaginacionTodoReferenciaPersonal;
	}

	public void setIsPermisoPaginacionTodoReferenciaPersonal(Boolean isPermisoPaginacionTodoReferenciaPersonal) {
		this.isPermisoPaginacionTodoReferenciaPersonal = isPermisoPaginacionTodoReferenciaPersonal;
	}
	
	public Boolean getIsPermisoPaginacionAltoReferenciaPersonal() {
		return isPermisoPaginacionAltoReferenciaPersonal;
	}

	public void setIsPermisoPaginacionAltoReferenciaPersonal(Boolean isPermisoPaginacionAltoReferenciaPersonal) {
		this.isPermisoPaginacionAltoReferenciaPersonal = isPermisoPaginacionAltoReferenciaPersonal;
	}
	
	public Boolean getIsPermisoCopiarReferenciaPersonal() {
		return isPermisoCopiarReferenciaPersonal;
	}

	public void setIsPermisoCopiarReferenciaPersonal(Boolean isPermisoCopiarReferenciaPersonal) {
		this.isPermisoCopiarReferenciaPersonal = isPermisoCopiarReferenciaPersonal;
	}
	
	public Boolean getIsPermisoVerFormReferenciaPersonal() {
		return isPermisoVerFormReferenciaPersonal;
	}

	public void setIsPermisoVerFormReferenciaPersonal(Boolean isPermisoVerFormReferenciaPersonal) {
		this.isPermisoVerFormReferenciaPersonal = isPermisoVerFormReferenciaPersonal;
	}
	
	public Boolean getIsPermisoDuplicarReferenciaPersonal() {
		return isPermisoDuplicarReferenciaPersonal;
	}

	public void setIsPermisoDuplicarReferenciaPersonal(Boolean isPermisoDuplicarReferenciaPersonal) {
		this.isPermisoDuplicarReferenciaPersonal = isPermisoDuplicarReferenciaPersonal;
	}
	
	public Boolean getIsPermisoOrdenReferenciaPersonal() {
		return isPermisoOrdenReferenciaPersonal;
	}

	public void setIsPermisoOrdenReferenciaPersonal(Boolean isPermisoOrdenReferenciaPersonal) {
		this.isPermisoOrdenReferenciaPersonal = isPermisoOrdenReferenciaPersonal;
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
	
	public Boolean getIsVisibilidadCeldaNuevoReferenciaPersonal() {
		return isVisibilidadCeldaNuevoReferenciaPersonal;
	}

	public void setIsVisibilidadCeldaNuevoReferenciaPersonal(Boolean isVisibilidadCeldaNuevoReferenciaPersonal) {
		this.isVisibilidadCeldaNuevoReferenciaPersonal = isVisibilidadCeldaNuevoReferenciaPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarReferenciaPersonal() {
		return isVisibilidadCeldaDuplicarReferenciaPersonal;
	}

	public void setIsVisibilidadCeldaDuplicarReferenciaPersonal(Boolean isVisibilidadCeldaDuplicarReferenciaPersonal) {
		this.isVisibilidadCeldaDuplicarReferenciaPersonal = isVisibilidadCeldaDuplicarReferenciaPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarReferenciaPersonal() {
		return isVisibilidadCeldaCopiarReferenciaPersonal;
	}

	public void setIsVisibilidadCeldaCopiarReferenciaPersonal(Boolean isVisibilidadCeldaCopiarReferenciaPersonal) {
		this.isVisibilidadCeldaCopiarReferenciaPersonal = isVisibilidadCeldaCopiarReferenciaPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormReferenciaPersonal() {
		return isVisibilidadCeldaVerFormReferenciaPersonal;
	}

	public void setIsVisibilidadCeldaVerFormReferenciaPersonal(Boolean isVisibilidadCeldaVerFormReferenciaPersonal) {
		this.isVisibilidadCeldaVerFormReferenciaPersonal = isVisibilidadCeldaVerFormReferenciaPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenReferenciaPersonal() {
		return isVisibilidadCeldaOrdenReferenciaPersonal;
	}

	public void setIsVisibilidadCeldaOrdenReferenciaPersonal(Boolean isVisibilidadCeldaOrdenReferenciaPersonal) {
		this.isVisibilidadCeldaOrdenReferenciaPersonal = isVisibilidadCeldaOrdenReferenciaPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesReferenciaPersonal() {
		return isVisibilidadCeldaNuevoRelacionesReferenciaPersonal;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesReferenciaPersonal(Boolean isVisibilidadCeldaNuevoRelacionesReferenciaPersonal) {
		this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal = isVisibilidadCeldaNuevoRelacionesReferenciaPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaModificarReferenciaPersonal() {
		return isVisibilidadCeldaModificarReferenciaPersonal;
	}

	public void setIsVisibilidadCeldaModificarReferenciaPersonal(Boolean isVisibilidadCeldaModificarReferenciaPersonal) {
		this.isVisibilidadCeldaModificarReferenciaPersonal = isVisibilidadCeldaModificarReferenciaPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarReferenciaPersonal() {
		return isVisibilidadCeldaActualizarReferenciaPersonal;
	}

	public void setIsVisibilidadCeldaActualizarReferenciaPersonal(Boolean isVisibilidadCeldaActualizarReferenciaPersonal) {
		this.isVisibilidadCeldaActualizarReferenciaPersonal = isVisibilidadCeldaActualizarReferenciaPersonal;
	}

	public Boolean getIsVisibilidadCeldaEliminarReferenciaPersonal() {
		return isVisibilidadCeldaEliminarReferenciaPersonal;
	}

	public void setIsVisibilidadCeldaEliminarReferenciaPersonal(Boolean isVisibilidadCeldaEliminarReferenciaPersonal) {
		this.isVisibilidadCeldaEliminarReferenciaPersonal = isVisibilidadCeldaEliminarReferenciaPersonal;
	}

	public Boolean getIsVisibilidadCeldaCancelarReferenciaPersonal() {
		return isVisibilidadCeldaCancelarReferenciaPersonal;
	}

	public void setIsVisibilidadCeldaCancelarReferenciaPersonal(Boolean isVisibilidadCeldaCancelarReferenciaPersonal) {
		this.isVisibilidadCeldaCancelarReferenciaPersonal = isVisibilidadCeldaCancelarReferenciaPersonal;
	}

	public Boolean getIsVisibilidadCeldaGuardarReferenciaPersonal() {
		return isVisibilidadCeldaGuardarReferenciaPersonal;
	}

	public void setIsVisibilidadCeldaGuardarReferenciaPersonal(Boolean isVisibilidadCeldaGuardarReferenciaPersonal) {
		this.isVisibilidadCeldaGuardarReferenciaPersonal = isVisibilidadCeldaGuardarReferenciaPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosReferenciaPersonal() {
		return isVisibilidadCeldaGuardarCambiosReferenciaPersonal;
	}

	public void setIsVisibilidadCeldaGuardarCambiosReferenciaPersonal(Boolean isVisibilidadCeldaGuardarCambiosReferenciaPersonal) {
		this.isVisibilidadCeldaGuardarCambiosReferenciaPersonal = isVisibilidadCeldaGuardarCambiosReferenciaPersonal;
	}
		
	public ReferenciaPersonalSessionBean getreferenciapersonalSessionBean() {
		return this.referenciapersonalSessionBean;
	}
	
	public void setreferenciapersonalSessionBean(ReferenciaPersonalSessionBean referenciapersonalSessionBean) {
		this.referenciapersonalSessionBean=referenciapersonalSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCiudad() {
		return this.isVisibilidadFK_IdCiudad;
	}

	public void setisVisibilidadFK_IdCiudad(Boolean isVisibilidadFK_IdCiudad) {
		this.isVisibilidadFK_IdCiudad=isVisibilidadFK_IdCiudad;
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

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	public Boolean getisVisibilidadFK_IdTipoReferenciaPersonal() {
		return this.isVisibilidadFK_IdTipoReferenciaPersonal;
	}

	public void setisVisibilidadFK_IdTipoReferenciaPersonal(Boolean isVisibilidadFK_IdTipoReferenciaPersonal) {
		this.isVisibilidadFK_IdTipoReferenciaPersonal=isVisibilidadFK_IdTipoReferenciaPersonal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(ReferenciaPersonal referenciapersonal)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(referenciapersonal,null);
				this.setActualParaGuardarClienteForeignKey(referenciapersonal,null);
				this.setActualParaGuardarTipoRefePersoForeignKey(referenciapersonal,null);
				this.setActualParaGuardarPaisForeignKey(referenciapersonal,null);
				this.setActualParaGuardarCiudadForeignKey(referenciapersonal,null);
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
	
	public void bugActualizarReferenciaActual(ReferenciaPersonal referenciapersonal,ReferenciaPersonal referenciapersonalAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalReferenciaPersonal(referenciapersonal);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		referenciapersonalAux.setId(referenciapersonal.getId());
		referenciapersonalAux.setVersionRow(referenciapersonal.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessReferenciaPersonal();
		
			int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = referenciapersonalValidator.getInvalidValues(this.referenciapersonal);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			referenciapersonalLogic.setDatosCliente(datosCliente);
			referenciapersonalLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				referenciapersonalAux=new  ReferenciaPersonal();
				
				referenciapersonalAux.setIsNew(true);
				referenciapersonalAux.setIsChanged(true);
				
				referenciapersonalAux.setReferenciaPersonalOriginal(this.referenciapersonal);
				
				referenciapersonalAux.setId(this.referenciapersonal.getId());	
				referenciapersonalAux.setVersionRow(this.referenciapersonal.getVersionRow());	
				referenciapersonalAux.setid_empresa(this.referenciapersonal.getid_empresa());	
				referenciapersonalAux.setidcliente(this.referenciapersonal.getidcliente());	
				referenciapersonalAux.setidvalorclientereferenciapersonal(this.referenciapersonal.getidvalorclientereferenciapersonal());	
				referenciapersonalAux.setid_pais(this.referenciapersonal.getid_pais());	
				referenciapersonalAux.setidciudad(this.referenciapersonal.getidciudad());	
				referenciapersonalAux.setnombre(this.referenciapersonal.getnombre());	
				referenciapersonalAux.setidentificacion(this.referenciapersonal.getidentificacion());	
				referenciapersonalAux.setfecha_nacimiento(this.referenciapersonal.getfecha_nacimiento());	
				referenciapersonalAux.setdireccion(this.referenciapersonal.getdireccion());	
				referenciapersonalAux.settelefono(this.referenciapersonal.gettelefono());	
				referenciapersonalAux.settelefonomovil(this.referenciapersonal.gettelefonomovil());	
				referenciapersonalAux.settelefonocodigoarea(this.referenciapersonal.gettelefonocodigoarea());	
				referenciapersonalAux.setpreferencia(this.referenciapersonal.getpreferencia());	
				referenciapersonalAux.setemail(this.referenciapersonal.getemail());	
				referenciapersonalAux.setobservacion(this.referenciapersonal.getobservacion());	
				referenciapersonalAux.setesta_trabajando(this.referenciapersonal.getesta_trabajando());	
				referenciapersonalAux.setempresa_trabajo(this.referenciapersonal.getempresa_trabajo());	
				referenciapersonalAux.setdireccion_trabajo(this.referenciapersonal.getdireccion_trabajo());	
				referenciapersonalAux.settelefono_trabajo(this.referenciapersonal.gettelefono_trabajo());	
				referenciapersonalAux.setesactivo(this.referenciapersonal.getesactivo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.referenciapersonalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.referenciapersonalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(referenciapersonalAux,referenciapersonalLogic.getReferenciaPersonals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(referenciapersonalAux,referenciapersonals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.referenciapersonalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.referenciapersonalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciapersonalLogic.saveReferenciaPersonals();//WithConnection
						//referenciapersonalLogic.getSetVersionRowReferenciaPersonals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.referenciapersonal,referenciapersonalAux);
					
					this.refrescarForeignKeysDescripcionesReferenciaPersonal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.referenciapersonalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								referenciapersonalLogic.saveReferenciaPersonalRelaciones(referenciapersonalAux);//WithConnection
								//referenciapersonalLogic.getSetVersionRowReferenciaPersonals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.referenciapersonal,referenciapersonalAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.referenciapersonalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.referenciapersonalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(referenciapersonalAux,referenciapersonalLogic.getReferenciaPersonals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(referenciapersonalAux,referenciapersonals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.referenciapersonal,referenciapersonalAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				referenciapersonalAux=new  ReferenciaPersonal();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado() 
					|| (this.referenciapersonalSessionBean.getEsGuardarRelacionado() && this.referenciapersonal.getId()>=0)) {
						
					referenciapersonalAux.setIsNew(false);
				}
				
				referenciapersonalAux.setIsDeleted(false);
			
				referenciapersonalAux.setId(this.referenciapersonal.getId());	
				referenciapersonalAux.setVersionRow(this.referenciapersonal.getVersionRow());	
				referenciapersonalAux.setid_empresa(this.referenciapersonal.getid_empresa());	
				referenciapersonalAux.setidcliente(this.referenciapersonal.getidcliente());	
				referenciapersonalAux.setidvalorclientereferenciapersonal(this.referenciapersonal.getidvalorclientereferenciapersonal());	
				referenciapersonalAux.setid_pais(this.referenciapersonal.getid_pais());	
				referenciapersonalAux.setidciudad(this.referenciapersonal.getidciudad());	
				referenciapersonalAux.setnombre(this.referenciapersonal.getnombre());	
				referenciapersonalAux.setidentificacion(this.referenciapersonal.getidentificacion());	
				referenciapersonalAux.setfecha_nacimiento(this.referenciapersonal.getfecha_nacimiento());	
				referenciapersonalAux.setdireccion(this.referenciapersonal.getdireccion());	
				referenciapersonalAux.settelefono(this.referenciapersonal.gettelefono());	
				referenciapersonalAux.settelefonomovil(this.referenciapersonal.gettelefonomovil());	
				referenciapersonalAux.settelefonocodigoarea(this.referenciapersonal.gettelefonocodigoarea());	
				referenciapersonalAux.setpreferencia(this.referenciapersonal.getpreferencia());	
				referenciapersonalAux.setemail(this.referenciapersonal.getemail());	
				referenciapersonalAux.setobservacion(this.referenciapersonal.getobservacion());	
				referenciapersonalAux.setesta_trabajando(this.referenciapersonal.getesta_trabajando());	
				referenciapersonalAux.setempresa_trabajo(this.referenciapersonal.getempresa_trabajo());	
				referenciapersonalAux.setdireccion_trabajo(this.referenciapersonal.getdireccion_trabajo());	
				referenciapersonalAux.settelefono_trabajo(this.referenciapersonal.gettelefono_trabajo());	
				referenciapersonalAux.setesactivo(this.referenciapersonal.getesactivo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(referenciapersonalAux,referenciapersonalLogic.getReferenciaPersonals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(referenciapersonalAux,referenciapersonals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.referenciapersonalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.referenciapersonalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciapersonalLogic.saveReferenciaPersonals();//WithConnection
						//referenciapersonalLogic.getSetVersionRowReferenciaPersonals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.referenciapersonal,referenciapersonalAux);
					
					this.refrescarForeignKeysDescripcionesReferenciaPersonal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.referenciapersonalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								referenciapersonalLogic.saveReferenciaPersonalRelaciones(referenciapersonalAux);//WithConnection
								//referenciapersonalLogic.getSetVersionRowReferenciaPersonals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.referenciapersonal,referenciapersonalAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.referenciapersonalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.referenciapersonalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(referenciapersonalAux,referenciapersonalLogic.getReferenciaPersonals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(referenciapersonalAux,referenciapersonals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.referenciapersonal,referenciapersonalAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				referenciapersonalAux=new  ReferenciaPersonal();
				
				referenciapersonalAux.setIsNew(false);
				referenciapersonalAux.setIsChanged(false);
				
				referenciapersonalAux.setIsDeleted(true);
				
				referenciapersonalAux.setId(this.referenciapersonal.getId());	
				referenciapersonalAux.setVersionRow(this.referenciapersonal.getVersionRow());	
				referenciapersonalAux.setid_empresa(this.referenciapersonal.getid_empresa());	
				referenciapersonalAux.setidcliente(this.referenciapersonal.getidcliente());	
				referenciapersonalAux.setidvalorclientereferenciapersonal(this.referenciapersonal.getidvalorclientereferenciapersonal());	
				referenciapersonalAux.setid_pais(this.referenciapersonal.getid_pais());	
				referenciapersonalAux.setidciudad(this.referenciapersonal.getidciudad());	
				referenciapersonalAux.setnombre(this.referenciapersonal.getnombre());	
				referenciapersonalAux.setidentificacion(this.referenciapersonal.getidentificacion());	
				referenciapersonalAux.setfecha_nacimiento(this.referenciapersonal.getfecha_nacimiento());	
				referenciapersonalAux.setdireccion(this.referenciapersonal.getdireccion());	
				referenciapersonalAux.settelefono(this.referenciapersonal.gettelefono());	
				referenciapersonalAux.settelefonomovil(this.referenciapersonal.gettelefonomovil());	
				referenciapersonalAux.settelefonocodigoarea(this.referenciapersonal.gettelefonocodigoarea());	
				referenciapersonalAux.setpreferencia(this.referenciapersonal.getpreferencia());	
				referenciapersonalAux.setemail(this.referenciapersonal.getemail());	
				referenciapersonalAux.setobservacion(this.referenciapersonal.getobservacion());	
				referenciapersonalAux.setesta_trabajando(this.referenciapersonal.getesta_trabajando());	
				referenciapersonalAux.setempresa_trabajo(this.referenciapersonal.getempresa_trabajo());	
				referenciapersonalAux.setdireccion_trabajo(this.referenciapersonal.getdireccion_trabajo());	
				referenciapersonalAux.settelefono_trabajo(this.referenciapersonal.gettelefono_trabajo());	
				referenciapersonalAux.setesactivo(this.referenciapersonal.getesactivo());	
				
				if(this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.referenciapersonalAux.getId()>=0) {	
						this.referenciapersonalsEliminados.add(referenciapersonalAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(referenciapersonalAux,referenciapersonalLogic.getReferenciaPersonals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(referenciapersonalAux,referenciapersonals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.referenciapersonalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.referenciapersonalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciapersonalLogic.saveReferenciaPersonals();//WithConnection
						//referenciapersonalLogic.getSetVersionRowReferenciaPersonals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.referenciapersonalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								referenciapersonalLogic.saveReferenciaPersonalRelaciones(referenciapersonalAux);//WithConnection
								//referenciapersonalLogic.getSetVersionRowReferenciaPersonals();//WithConnection
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
							if(this.referenciapersonalSessionBean.getEstaModoGuardarRelaciones() 
								|| this.referenciapersonalSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(referenciapersonalAux,referenciapersonalLogic.getReferenciaPersonals());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(referenciapersonalAux,referenciapersonals);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getReferenciaPersonals().addAll(this.referenciapersonalsEliminados);
					
					referenciapersonalLogic.saveReferenciaPersonals();//WithConnection
					//referenciapersonalLogic.getSetVersionRowReferenciaPersonals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesReferenciaPersonal();
				
				this.referenciapersonalsEliminados= new ArrayList<ReferenciaPersonal>();		
			}
			
			if(this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Referencia Personal GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Referencia Personal",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.referenciapersonal=referenciapersonalAux;
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
      		//this.finishProcessReferenciaPersonal();
      	}
		
	}	
	
	public void actualizarRelaciones(ReferenciaPersonal referenciapersonalLocal) throws Exception {
		
		if(this.referenciapersonalSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ReferenciaPersonal referenciapersonalLocal) throws Exception {	
		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				referenciapersonalLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				referenciapersonalLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRefePersoDetalleFormJInternalFrame.class)) {
				TipoRefePersoBeanSwingJInternalFrame tiporefepersoBeanSwingJInternalFrameLocal=(TipoRefePersoBeanSwingJInternalFrame) ((TipoRefePersoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporefepersoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRefePerso(tiporefepersoBeanSwingJInternalFrameLocal.gettiporefeperso(),true);
				tiporefepersoBeanSwingJInternalFrameLocal.actualizarLista(tiporefepersoBeanSwingJInternalFrameLocal.tiporefeperso,this.tiporefepersosForeignKey);

				tiporefepersoBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporefepersoBeanSwingJInternalFrameLocal.tiporefeperso);

				referenciapersonalLocal.setTipoRefePerso(tiporefepersoBeanSwingJInternalFrameLocal.tiporefeperso);

				this.addItemDefectoCombosForeignKeyTipoRefePerso();
				this.cargarCombosFrameTipoRefePersosForeignKey("Formulario");
				this.setActualTipoRefePersoForeignKey(tiporefepersoBeanSwingJInternalFrameLocal.tiporefeperso.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				referenciapersonalLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				referenciapersonalLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarReferenciaPersonalActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = referenciapersonalValidator.getInvalidValues(this.referenciapersonal);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ReferenciaPersonal referenciapersonal,List<ReferenciaPersonal> referenciapersonals) throws Exception {
		try	{		
			ReferenciaPersonalConstantesFunciones.actualizarLista(referenciapersonal,referenciapersonals,this.referenciapersonalSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ReferenciaPersonal referenciapersonal,List<ReferenciaPersonal> referenciapersonals) throws Exception {
		try	{			
			ReferenciaPersonalConstantesFunciones.actualizarSelectedLista(referenciapersonal,referenciapersonals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ReferenciaPersonal> referenciapersonalsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				referenciapersonalsLocal=this.referenciapersonalLogic.getReferenciaPersonals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				referenciapersonalsLocal=this.referenciapersonals;
			}
			//ARCHITECTURE
		
			for(ReferenciaPersonal referenciapersonalLocal:referenciapersonalsLocal) {
				if(this.permiteMantenimiento(referenciapersonalLocal) && referenciapersonalLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ReferenciaPersonalConstantesFunciones.getReferenciaPersonalLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelid_empresaReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidclienteReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.IDTIPOREFEPERSO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidvalorclientereferenciapersonalReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelid_paisReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.IDCIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidciudadReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelnombreReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.IDENTIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidentificacionReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.FECHANACIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelfecha_nacimientoReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeldireccionReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeltelefonoReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.TELEFONOMOVIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeltelefonomovilReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.TELEFONOCODIGOAREA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeltelefonocodigoareaReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.PREFERENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelpreferenciaReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.EMAIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelemailReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.OBSERVACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelobservacionReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.ESTATRABAJANDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelesta_trabajandoReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.EMPRESATRABAJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelempresa_trabajoReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.DIRECCIONTRABAJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeldireccion_trabajoReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.TELEFONOTRABAJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeltelefono_trabajoReferenciaPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaPersonalConstantesFunciones.ESACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelesactivoReferenciaPersonal,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelid_empresaReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidclienteReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidvalorclientereferenciapersonalReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelid_paisReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidciudadReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelnombreReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidentificacionReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelfecha_nacimientoReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeldireccionReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeltelefonoReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeltelefonomovilReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeltelefonocodigoareaReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelpreferenciaReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelemailReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelobservacionReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelesta_trabajandoReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelempresa_trabajoReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeldireccion_trabajoReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeltelefono_trabajoReferenciaPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelesactivoReferenciaPersonal,"");
		
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
		this.iIdNuevoReferenciaPersonal--;	
		
		
		this.referenciapersonalAux=new ReferenciaPersonal();
		
		this.referenciapersonalAux.setId(this.iIdNuevoReferenciaPersonal);
		this.referenciapersonalAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.referenciapersonalLogic.getReferenciaPersonals().add(this.referenciapersonalAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.referenciapersonals.add(this.referenciapersonalAux);
		}
		//ARCHITECTURE
		
		this.referenciapersonal=this.referenciapersonalAux;
		
		if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioReferenciaPersonal(this.referenciapersonal);
			this.setVariablesObjetoActualToFormularioForeignKeyReferenciaPersonal(this.referenciapersonal);
		}
				
		//this.setDefaultControlesReferenciaPersonal();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyReferenciaPersonal();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyReferenciaPersonal();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyReferenciaPersonal();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualReferenciaPersonal(this.referenciapersonalBean,this.referenciapersonal,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.referenciapersonalSessionBean.getConGuardarRelaciones()) {
			classes=ReferenciaPersonalConstantesFunciones.getClassesRelationshipsOfReferenciaPersonal(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.referenciapersonalReturnGeneral=referenciapersonalLogic.procesarEventosReferenciaPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.referenciapersonalLogic.getReferenciaPersonals(),this.referenciapersonal,this.referenciapersonalParameterGeneral,this.isEsNuevoReferenciaPersonal,classes);//this.referenciapersonalLogic.getReferenciaPersonal()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanReferenciaPersonal(this.referenciapersonalReturnGeneral,this.referenciapersonalBean,false);
		
		if(this.referenciapersonalReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyReferenciaPersonal(this.referenciapersonalReturnGeneral.getReferenciaPersonal());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioReferenciaPersonal(this.referenciapersonalReturnGeneral.getReferenciaPersonal());
		}
		
		if(this.referenciapersonalReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioReferenciaPersonal(this.referenciapersonalReturnGeneral.getReferenciaPersonal(),classes);//this.referenciapersonalBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyReferenciaPersonal();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyReferenciaPersonal();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.RecargarFormReferenciaPersonal(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingReferenciaPersonal(false);
						
			if(referenciapersonalSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReferenciaPersonal();
			}
			
			this.actualizarVisualTableDatosReferenciaPersonal();
			
			this.jTableDatosReferenciaPersonal.setRowSelectionInterval(this.getIndiceNuevoReferenciaPersonal(), this.getIndiceNuevoReferenciaPersonal());
			
			this.seleccionarFilaTablaReferenciaPersonalActual();
						
			this.actualizarEstadoCeldasBotonesReferenciaPersonal("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesReferenciaPersonal(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreanombreReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activarnombreReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextFieldidentificacionReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activaridentificacionReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jDateChooserfecha_nacimientoReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activarfecha_nacimientoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreadireccionReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activardireccionReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefonoReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activartelefonoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefonomovilReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activartelefonomovilReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextFieldtelefonocodigoareaReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activartelefonocodigoareaReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreapreferenciaReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activarpreferenciaReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaemailReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activaremailReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaobservacionReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activarobservacionReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesta_trabajandoReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activaresta_trabajandoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaempresa_trabajoReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activarempresa_trabajoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreadireccion_trabajoReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activardireccion_trabajoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefono_trabajoReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activartelefono_trabajoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesactivoReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activaresactivoReferenciaPersonal);	
		//
		this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_empresaReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activarid_empresaReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidclienteReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activaridclienteReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activaridvalorclientereferenciapersonalReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activarid_paisReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidciudadReferenciaPersonal.setEnabled(isHabilitar && this.referenciapersonalConstantesFunciones.activaridciudadReferenciaPersonal);
	};
	
	public void setDefaultControlesReferenciaPersonal() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoReferenciaPersonal(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.referenciapersonalSessionBean.setConGuardarRelaciones(true);			
			this.referenciapersonalSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormReferenciaPersonal.jTabbedPaneRelacionesReferenciaPersonal.setVisible(true);
			
					
		} else {
			//this.referenciapersonalSessionBean.setConGuardarRelaciones(false);			
			this.referenciapersonalSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormReferenciaPersonal.jTabbedPaneRelacionesReferenciaPersonal.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoReferenciaPersonal() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReferenciaPersonal referenciapersonalAux:this.referenciapersonalLogic.getReferenciaPersonals()) {
				if(referenciapersonalAux.getId().equals(this.iIdNuevoReferenciaPersonal)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReferenciaPersonal referenciapersonalAux:this.referenciapersonals) {
				if(referenciapersonalAux.getId().equals(this.iIdNuevoReferenciaPersonal)) {
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
	
	public int getIndiceActualReferenciaPersonal(ReferenciaPersonal referenciapersonal,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReferenciaPersonal referenciapersonalAux:this.referenciapersonalLogic.getReferenciaPersonals()) {
				if(referenciapersonalAux.getId().equals(referenciapersonal.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReferenciaPersonal referenciapersonalAux:this.referenciapersonals) {
				if(referenciapersonalAux.getId().equals(referenciapersonal.getId())) {
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
	
	public void setCamposBaseDesdeOriginalReferenciaPersonal(ReferenciaPersonal referenciapersonalOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReferenciaPersonal referenciapersonalAux:this.referenciapersonalLogic.getReferenciaPersonals()) {
				if(referenciapersonalAux.getReferenciaPersonalOriginal().getId().equals(referenciapersonalOriginal.getId())) {
					existe=true;
					referenciapersonalOriginal.setId(referenciapersonalAux.getId());
					referenciapersonalOriginal.setVersionRow(referenciapersonalAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReferenciaPersonal referenciapersonalAux:this.referenciapersonals) {
				if(referenciapersonalAux.getReferenciaPersonalOriginal().getId().equals(referenciapersonalOriginal.getId())) {
					existe=true;
					referenciapersonalOriginal.setId(referenciapersonalAux.getId());
					referenciapersonalOriginal.setVersionRow(referenciapersonalAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosReferenciaPersonal(Boolean esParaCancelar) throws Exception {
		referenciapersonalsAux=new ArrayList<ReferenciaPersonal>();
		referenciapersonalAux=new ReferenciaPersonal();
		
		if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ReferenciaPersonal referenciapersonalAux:this.referenciapersonalLogic.getReferenciaPersonals()) {
					if(referenciapersonalAux.getId()<0) {
						referenciapersonalsAux.add(referenciapersonalAux);
					}		
				}
				this.iIdNuevoReferenciaPersonal=0L;
				this.referenciapersonalLogic.getReferenciaPersonals().removeAll(referenciapersonalsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReferenciaPersonal referenciapersonalAux:this.referenciapersonals) {
					if(referenciapersonalAux.getId()<0) {
						referenciapersonalsAux.add(referenciapersonalAux);
					}		
				}
				this.iIdNuevoReferenciaPersonal=0L;
				this.referenciapersonals.removeAll(referenciapersonalsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoReferenciaPersonal 
					&& this.referenciapersonalLogic.getReferenciaPersonals().size()>0
					) {
					referenciapersonalAux=this.referenciapersonalLogic.getReferenciaPersonals().get(this.referenciapersonalLogic.getReferenciaPersonals().size() - 1);
				
					if(referenciapersonalAux.getId()<0) {
						this.referenciapersonalLogic.getReferenciaPersonals().remove(referenciapersonalAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoReferenciaPersonal && this.referenciapersonals.size()>0) {
					referenciapersonalAux=this.referenciapersonals.get(this.referenciapersonals.size() - 1);
				
					if(referenciapersonalAux.getId()<0) {
						this.referenciapersonals.remove(referenciapersonalAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoReferenciaPersonal(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(referenciapersonal.getId()<0) {
				this.referenciapersonalLogic.getReferenciaPersonals().remove(this.referenciapersonal);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(referenciapersonal.getId()<0) {
				this.referenciapersonals.remove(this.referenciapersonal);
			}
		}			
	}
	
	public void setEstadosInicialesReferenciaPersonal(List<ReferenciaPersonal> referenciapersonalsAux) throws Exception {
		ReferenciaPersonalConstantesFunciones.setEstadosInicialesReferenciaPersonal(referenciapersonalsAux);
	}
	
	public void setEstadosInicialesReferenciaPersonal(ReferenciaPersonal referenciapersonalAux) throws Exception {
		ReferenciaPersonalConstantesFunciones.setEstadosInicialesReferenciaPersonal(referenciapersonalAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarReferenciaPersonalActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesReferenciaPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarReferenciaPersonalActual()) {
				if(!this.isEsNuevoReferenciaPersonal) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesReferenciaPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoReferenciaPersonal=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarReferenciaPersonalActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Referencia Personal ?", "MANTENIMIENTO DE Referencia Personal", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesReferenciaPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ReferenciaPersonal referenciapersonal) throws Exception {
		ReferenciaPersonalConstantesFunciones.seleccionarAsignar(this.referenciapersonal,referenciapersonal);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarReferenciaPersonal=this.isPermisoActualizarOriginalReferenciaPersonal;
			
			
			this.seleccionarAsignar(referenciapersonal);
			
			

			idClienteActual=referenciapersonal.getidcliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ReferenciaPersonalConstantesFunciones.quitarEspaciosReferenciaPersonal(this.referenciapersonal,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesReferenciaPersonal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.referenciapersonalSessionBean.setsFuncionBusquedaRapida(this.referenciapersonalSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoReferenciaPersonal) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosReferenciaPersonal(esParaCancelar);				
				this.cancelarNuevoReferenciaPersonal(esParaCancelar);								
			}
			
			this.referenciapersonal=new ReferenciaPersonal();
			
			this.inicializarReferenciaPersonal();
			
			this.actualizarEstadoCeldasBotonesReferenciaPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarReferenciaPersonal() throws Exception {
		try {
			ReferenciaPersonalConstantesFunciones.inicializarReferenciaPersonal(this.referenciapersonal);
			
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
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.referenciapersonalLogic.getReferenciaPersonals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteReferenciaPersonals(String sAccionBusqueda,List<ReferenciaPersonal> referenciapersonalsParaReportes) throws Exception {
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
					sPathReporteFinal="ReferenciaPersonal"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ReferenciaPersonalMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ReferenciaPersonalMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ReferenciaPersonal"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Referencia Personales");		
		parameters.put("busquedapor", ReferenciaPersonalConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceReferenciaPersonal=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ReferenciaPersonalConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ReferenciaPersonalConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceReferenciaPersonal=new JRBeanArrayDataSource(ReferenciaPersonalJInternalFrame.TraerReferenciaPersonalBeans(referenciapersonalsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceReferenciaPersonal);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ReferenciaPersonalConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ReferenciaPersonalConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ReferenciaPersonalBean.TraerReferenciaPersonalBeans(referenciapersonalsParaReportes).toArray()));
							
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
				this.generarExcelReporteReferenciaPersonals(sAccionBusqueda,sTipoArchivoReporte,referenciapersonalsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalReferenciaPersonals(sAccionBusqueda,sTipoArchivoReporte,referenciapersonalsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoReferenciaPersonalActionPerformed(null);
					//this.generarExcelReporteReferenciaPersonals(sAccionBusqueda,sTipoArchivoReporte,referenciapersonalsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalReferenciaPersonals(sAccionBusqueda,sTipoArchivoReporte,referenciapersonalsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesReferenciaPersonals(sAccionBusqueda,sTipoArchivoReporte,referenciapersonalsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesReferenciaPersonals(sAccionBusqueda,sTipoArchivoReporte,referenciapersonalsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteReferenciaPersonals(String sAccionBusqueda,String sTipoArchivoReporte,List<ReferenciaPersonal> referenciapersonalsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciapersonal";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ReferenciaPersonals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderReferenciaPersonal("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ReferenciaPersonal referenciapersonal : referenciapersonalsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ReferenciaPersonalConstantesFunciones.generarExcelReporteDataReferenciaPersonal("NORMAL",row,workbook,referenciapersonal,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Personal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderReferenciaPersonal(String sTipo,Row row,Workbook workbook) {
		
		ReferenciaPersonalConstantesFunciones.generarExcelReporteHeaderReferenciaPersonal(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalReferenciaPersonals(String sAccionBusqueda,String sTipoArchivoReporte,List<ReferenciaPersonal> referenciapersonalsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciapersonal_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ReferenciaPersonals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ReferenciaPersonal referenciapersonal : referenciapersonalsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ReferenciaPersonalConstantesFunciones.getReferenciaPersonalDescripcion(referenciapersonal));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_IDTIPOREFEPERSO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDTIPOREFEPERSO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.gettiporefeperso_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.getidentificacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.getfecha_nacimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.gettelefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.gettelefonomovil());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.gettelefonocodigoarea());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.getpreferencia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_EMAIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_EMAIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.getemail());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.getobservacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(referenciapersonal.getesta_trabajando()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.getempresa_trabajo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.getdireccion_trabajo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciapersonal.gettelefono_trabajo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(referenciapersonal.getesactivo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Personal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesReferenciaPersonals(String sAccionBusqueda,String sTipoArchivoReporte,List<ReferenciaPersonal> referenciapersonalsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ReferenciaPersonal> referenciapersonalsRespaldo=null;
		
		classes=ReferenciaPersonalConstantesFunciones.getClassesRelationshipsOfReferenciaPersonal(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.referenciapersonalLogic.setDatosCliente(this.datosCliente);
		this.referenciapersonalLogic.setDatosDeep(this.datosDeep);
		this.referenciapersonalLogic.setIsConDeep(true);
		
		referenciapersonalsRespaldo=this.referenciapersonalLogic.getReferenciaPersonals();
		
		this.referenciapersonalLogic.setReferenciaPersonals(referenciapersonalsParaReportes);	
		this.referenciapersonalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		referenciapersonalsParaReportes=this.referenciapersonalLogic.getReferenciaPersonals();
		this.referenciapersonalLogic.setReferenciaPersonals(referenciapersonalsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciapersonal_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ReferenciaPersonals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderReferenciaPersonal("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ReferenciaPersonal referenciapersonal : referenciapersonalsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderReferenciaPersonal("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ReferenciaPersonalConstantesFunciones.generarExcelReporteDataReferenciaPersonal("NORMAL",row,workbook,referenciapersonal,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ReferenciaPersonalConstantesFunciones.getReferenciaPersonalDescripcion(referenciapersonal));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Personal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoReferenciaPersonal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReferenciaPersonal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoReferenciaPersonal.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReferenciaPersonal.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessReferenciaPersonal() throws Exception {		
		this.startProcessReferenciaPersonal(true);
	}
	
	public void startProcessReferenciaPersonal(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasReferenciaPersonal ,this.jPanelParametrosReportesReferenciaPersonal, this.jScrollPanelDatosReferenciaPersonal,this.jPanelPaginacionReferenciaPersonal, this.jScrollPanelDatosEdicionReferenciaPersonal, this.jPanelAccionesReferenciaPersonal,this.jPanelAccionesFormularioReferenciaPersonal,this.jmenuBarReferenciaPersonal,this.jmenuBarDetalleReferenciaPersonal,this.jTtoolBarReferenciaPersonal,this.jTtoolBarDetalleReferenciaPersonal);		
		
		final JTabbedPane jTabbedPaneBusquedasReferenciaPersonal=this.jTabbedPaneBusquedasReferenciaPersonal; 
		
		final JPanel jPanelParametrosReportesReferenciaPersonal=this.jPanelParametrosReportesReferenciaPersonal;
		//final JScrollPane jScrollPanelDatosReferenciaPersonal=this.jScrollPanelDatosReferenciaPersonal;
		final JTable jTableDatosReferenciaPersonal=this.jTableDatosReferenciaPersonal;		
		final JPanel jPanelPaginacionReferenciaPersonal=this.jPanelPaginacionReferenciaPersonal;
		//final JScrollPane jScrollPanelDatosEdicionReferenciaPersonal=this.jScrollPanelDatosEdicionReferenciaPersonal;
		final JPanel jPanelAccionesReferenciaPersonal=this.jPanelAccionesReferenciaPersonal;
		
		JPanel jPanelCamposAuxiliarReferenciaPersonal=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarReferenciaPersonal=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
			jPanelCamposAuxiliarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jPanelCamposReferenciaPersonal;
			jPanelAccionesFormularioAuxiliarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jPanelAccionesFormularioReferenciaPersonal;
		}
		
		final JPanel jPanelCamposReferenciaPersonal=jPanelCamposAuxiliarReferenciaPersonal;
		final JPanel jPanelAccionesFormularioReferenciaPersonal=jPanelAccionesFormularioAuxiliarReferenciaPersonal;
		
		
		final JMenuBar jmenuBarReferenciaPersonal=this.jmenuBarReferenciaPersonal;
		final JToolBar jTtoolBarReferenciaPersonal=this.jTtoolBarReferenciaPersonal;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarReferenciaPersonal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarReferenciaPersonal=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
			jmenuBarDetalleAuxiliarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jmenuBarDetalleReferenciaPersonal;
			jTtoolBarDetalleAuxiliarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jTtoolBarDetalleReferenciaPersonal;
		}
		
		final JMenuBar jmenuBarDetalleReferenciaPersonal=jmenuBarDetalleAuxiliarReferenciaPersonal;
		final JToolBar jTtoolBarDetalleReferenciaPersonal=jTtoolBarDetalleAuxiliarReferenciaPersonal;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasReferenciaPersonal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesReferenciaPersonal;
			processRunnable.jTableDatos=jTableDatosReferenciaPersonal;
			processRunnable.jPanelCampos=jPanelCamposReferenciaPersonal;
			processRunnable.jPanelPaginacion=jPanelPaginacionReferenciaPersonal;
			processRunnable.jPanelAcciones=jPanelAccionesReferenciaPersonal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioReferenciaPersonal;
			
			
			processRunnable.jmenuBar=jmenuBarReferenciaPersonal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleReferenciaPersonal;
			processRunnable.jTtoolBar=jTtoolBarReferenciaPersonal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleReferenciaPersonal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasReferenciaPersonal ,jPanelParametrosReportesReferenciaPersonal,jTableDatosReferenciaPersonal, /*jScrollPanelDatosReferenciaPersonal,*/jPanelCamposReferenciaPersonal,jPanelPaginacionReferenciaPersonal, /*jScrollPanelDatosEdicionReferenciaPersonal,*/ jPanelAccionesReferenciaPersonal,jPanelAccionesFormularioReferenciaPersonal,jmenuBarReferenciaPersonal,jmenuBarDetalleReferenciaPersonal,jTtoolBarReferenciaPersonal,jTtoolBarDetalleReferenciaPersonal);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasReferenciaPersonal ,jPanelParametrosReportesReferenciaPersonal, jScrollPanelDatosReferenciaPersonal,jPanelPaginacionReferenciaPersonal, jScrollPanelDatosEdicionReferenciaPersonal, jPanelAccionesReferenciaPersonal,jPanelAccionesFormularioReferenciaPersonal,jmenuBarReferenciaPersonal,jmenuBarDetalleReferenciaPersonal,jTtoolBarReferenciaPersonal,jTtoolBarDetalleReferenciaPersonal);
						
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
	
	public void finishProcessReferenciaPersonal() {// throws Exception 
		this.finishProcessReferenciaPersonal(true);
	}
	
	public void finishProcessReferenciaPersonal(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasReferenciaPersonal ,this.jPanelParametrosReportesReferenciaPersonal, this.jScrollPanelDatosReferenciaPersonal,this.jPanelPaginacionReferenciaPersonal, this.jScrollPanelDatosEdicionReferenciaPersonal, this.jPanelAccionesReferenciaPersonal,this.jPanelAccionesFormularioReferenciaPersonal,this.jmenuBarReferenciaPersonal,this.jmenuBarDetalleReferenciaPersonal,this.jTtoolBarReferenciaPersonal,this.jTtoolBarDetalleReferenciaPersonal);		
		
		final JTabbedPane jTabbedPaneBusquedasReferenciaPersonal=this.jTabbedPaneBusquedasReferenciaPersonal; 
		
		final JPanel jPanelParametrosReportesReferenciaPersonal=this.jPanelParametrosReportesReferenciaPersonal;
		//final JScrollPane jScrollPanelDatosReferenciaPersonal=this.jScrollPanelDatosReferenciaPersonal;
		final JTable jTableDatosReferenciaPersonal=this.jTableDatosReferenciaPersonal;		
		final JPanel jPanelPaginacionReferenciaPersonal=this.jPanelPaginacionReferenciaPersonal;
		//final JScrollPane jScrollPanelDatosEdicionReferenciaPersonal=this.jScrollPanelDatosEdicionReferenciaPersonal;
		final JPanel jPanelAccionesReferenciaPersonal=this.jPanelAccionesReferenciaPersonal;
		
		JPanel jPanelCamposAuxiliarReferenciaPersonal=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarReferenciaPersonal=new JPanel();
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
			jPanelCamposAuxiliarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jPanelCamposReferenciaPersonal;
			jPanelAccionesFormularioAuxiliarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jPanelAccionesFormularioReferenciaPersonal;
		}
		
		final JPanel jPanelCamposReferenciaPersonal=jPanelCamposAuxiliarReferenciaPersonal;
		final JPanel jPanelAccionesFormularioReferenciaPersonal=jPanelAccionesFormularioAuxiliarReferenciaPersonal;
		
		
		final JMenuBar jmenuBarReferenciaPersonal=this.jmenuBarReferenciaPersonal;		
		final JToolBar jTtoolBarReferenciaPersonal=this.jTtoolBarReferenciaPersonal;
				
		JMenuBar jmenuBarDetalleAuxiliarReferenciaPersonal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarReferenciaPersonal=new JToolBar();
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
			jmenuBarDetalleAuxiliarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jmenuBarDetalleReferenciaPersonal;
			jTtoolBarDetalleAuxiliarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jTtoolBarDetalleReferenciaPersonal;		
		}
		
		final JMenuBar jmenuBarDetalleReferenciaPersonal=jmenuBarDetalleAuxiliarReferenciaPersonal;
		final JToolBar jTtoolBarDetalleReferenciaPersonal=jTtoolBarDetalleAuxiliarReferenciaPersonal;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasReferenciaPersonal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesReferenciaPersonal;
			processRunnable.jTableDatos=jTableDatosReferenciaPersonal;
			processRunnable.jPanelCampos=jPanelCamposReferenciaPersonal;
			processRunnable.jPanelPaginacion=jPanelPaginacionReferenciaPersonal;
			processRunnable.jPanelAcciones=jPanelAccionesReferenciaPersonal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioReferenciaPersonal;
			
			
			processRunnable.jmenuBar=jmenuBarReferenciaPersonal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleReferenciaPersonal;
			processRunnable.jTtoolBar=jTtoolBarReferenciaPersonal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleReferenciaPersonal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasReferenciaPersonal ,jPanelParametrosReportesReferenciaPersonal, jTableDatosReferenciaPersonal,/*jScrollPanelDatosReferenciaPersonal,*/jPanelCamposReferenciaPersonal,jPanelPaginacionReferenciaPersonal, /*jScrollPanelDatosEdicionReferenciaPersonal,*/ jPanelAccionesReferenciaPersonal,jPanelAccionesFormularioReferenciaPersonal,jmenuBarReferenciaPersonal,jmenuBarDetalleReferenciaPersonal,jTtoolBarReferenciaPersonal,jTtoolBarDetalleReferenciaPersonal));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesReferenciaPersonal(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarReferenciaPersonal(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuReferenciaPersonal(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarReferenciaPersonal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarReferenciaPersonal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleReferenciaPersonal,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuReferenciaPersonal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarReferenciaPersonal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleReferenciaPersonal,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.referenciapersonalConstantesFunciones.getsFinalQueryReferenciaPersonal();
		String  finalQueryPaginacionTodos=this.referenciapersonalConstantesFunciones.getsFinalQueryReferenciaPersonal();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ReferenciaPersonalConstantesFunciones.getArrayColumnasGlobalesNoReferenciaPersonal(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ReferenciaPersonalConstantesFunciones.getArrayColumnasGlobalesReferenciaPersonal(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ReferenciaPersonalConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.referenciapersonalsEliminados= new ArrayList<ReferenciaPersonal>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessReferenciaPersonal();
		
				///*ReferenciaPersonalSessionBean*/this.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
			
			if(this.referenciapersonalSessionBean==null) {
				this.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
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
					this.iNumeroPaginacion=ReferenciaPersonalConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ReferenciaPersonalConstantesFunciones.getClassesForeignKeysOfReferenciaPersonal(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/referenciapersonal."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			referenciapersonalsAux= new ArrayList<ReferenciaPersonal>();
			
				
			referenciapersonalLogic.setDatosCliente(this.datosCliente);
			referenciapersonalLogic.setDatosDeep(this.datosDeep);
			referenciapersonalLogic.setIsConDeep(true);
			
			
			referenciapersonalLogic.getReferenciaPersonalDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					referenciapersonalLogic.getTodosReferenciaPersonals(finalQueryGlobal,pagination);
					
					//referenciapersonalLogic.getTodosReferenciaPersonalsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(referenciapersonalLogic.getReferenciaPersonals()==null|| referenciapersonalLogic.getReferenciaPersonals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							referenciapersonalsAux= new ArrayList<ReferenciaPersonal>();
							referenciapersonalsAux.addAll(referenciapersonalLogic.getReferenciaPersonals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciapersonalsAux= new ArrayList<ReferenciaPersonal>();
							referenciapersonalsAux.addAll(referenciapersonals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							referenciapersonalLogic.getTodosReferenciaPersonals(finalQueryGlobal+"",this.pagination);												
							
							//referenciapersonalLogic.getTodosReferenciaPersonalsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteReferenciaPersonals("Todos",referenciapersonalLogic.getReferenciaPersonals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							referenciapersonalLogic.setReferenciaPersonals(new ArrayList<ReferenciaPersonal>());					
							referenciapersonalLogic.getReferenciaPersonals().addAll(referenciapersonalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciapersonals=new ArrayList<ReferenciaPersonal>();
							referenciapersonals.addAll(referenciapersonalsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idReferenciaPersonal=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idReferenciaPersonal=this.idActual;
				
				} else if(this.idReferenciaPersonalActual!=null && this.idReferenciaPersonalActual!=0L) {
					idReferenciaPersonal=idReferenciaPersonalActual;
				}
				
					
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndicePorId(idReferenciaPersonal);
				
				this.referenciapersonals=new ArrayList<ReferenciaPersonal>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					referenciapersonalLogic.getEntity(idReferenciaPersonal);
					
					//referenciapersonalLogic.getEntityWithConnection(idReferenciaPersonal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciapersonalLogic.setReferenciaPersonals(new ArrayList<ReferenciaPersonal>());
					referenciapersonalLogic.getReferenciaPersonals().add(referenciapersonalLogic.getReferenciaPersonal());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciapersonals=new ArrayList<ReferenciaPersonal>();
					this.referenciapersonals.add(referenciapersonal);
				}
				
				if(referenciapersonalLogic.getReferenciaPersonal()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCiudad")) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciapersonalLogic.getReferenciaPersonalsFK_IdCiudad(finalQueryGlobal,pagination,idciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciapersonalLogic.getReferenciaPersonals()==null||referenciapersonalLogic.getReferenciaPersonals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referenciapersonals==null|| referenciapersonals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciapersonalsAux=new ArrayList<ReferenciaPersonal>();
						referenciapersonalsAux.addAll(referenciapersonalLogic.getReferenciaPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciapersonalsAux=new ArrayList<ReferenciaPersonal>();
							referenciapersonalsAux.addAll(referenciapersonals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciapersonalLogic.getReferenciaPersonalsFK_IdCiudad(finalQueryGlobal,pagination,idciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferenciaPersonals("FK_IdCiudad",referenciapersonalLogic.getReferenciaPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferenciaPersonals("FK_IdCiudad",referenciapersonals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciapersonalLogic.setReferenciaPersonals(new ArrayList<ReferenciaPersonal>());
						referenciapersonalLogic.getReferenciaPersonals().addAll(referenciapersonalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciapersonals=new ArrayList<ReferenciaPersonal>();
							referenciapersonals.addAll(referenciapersonalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciapersonalLogic.getReferenciaPersonalsFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciapersonalLogic.getReferenciaPersonals()==null||referenciapersonalLogic.getReferenciaPersonals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referenciapersonals==null|| referenciapersonals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciapersonalsAux=new ArrayList<ReferenciaPersonal>();
						referenciapersonalsAux.addAll(referenciapersonalLogic.getReferenciaPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciapersonalsAux=new ArrayList<ReferenciaPersonal>();
							referenciapersonalsAux.addAll(referenciapersonals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciapersonalLogic.getReferenciaPersonalsFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferenciaPersonals("FK_IdCliente",referenciapersonalLogic.getReferenciaPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferenciaPersonals("FK_IdCliente",referenciapersonals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciapersonalLogic.setReferenciaPersonals(new ArrayList<ReferenciaPersonal>());
						referenciapersonalLogic.getReferenciaPersonals().addAll(referenciapersonalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciapersonals=new ArrayList<ReferenciaPersonal>();
							referenciapersonals.addAll(referenciapersonalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciapersonalLogic.getReferenciaPersonalsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciapersonalLogic.getReferenciaPersonals()==null||referenciapersonalLogic.getReferenciaPersonals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referenciapersonals==null|| referenciapersonals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciapersonalsAux=new ArrayList<ReferenciaPersonal>();
						referenciapersonalsAux.addAll(referenciapersonalLogic.getReferenciaPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciapersonalsAux=new ArrayList<ReferenciaPersonal>();
							referenciapersonalsAux.addAll(referenciapersonals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciapersonalLogic.getReferenciaPersonalsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferenciaPersonals("FK_IdEmpresa",referenciapersonalLogic.getReferenciaPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferenciaPersonals("FK_IdEmpresa",referenciapersonals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciapersonalLogic.setReferenciaPersonals(new ArrayList<ReferenciaPersonal>());
						referenciapersonalLogic.getReferenciaPersonals().addAll(referenciapersonalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciapersonals=new ArrayList<ReferenciaPersonal>();
							referenciapersonals.addAll(referenciapersonalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciapersonalLogic.getReferenciaPersonalsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciapersonalLogic.getReferenciaPersonals()==null||referenciapersonalLogic.getReferenciaPersonals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referenciapersonals==null|| referenciapersonals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciapersonalsAux=new ArrayList<ReferenciaPersonal>();
						referenciapersonalsAux.addAll(referenciapersonalLogic.getReferenciaPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciapersonalsAux=new ArrayList<ReferenciaPersonal>();
							referenciapersonalsAux.addAll(referenciapersonals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciapersonalLogic.getReferenciaPersonalsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferenciaPersonals("FK_IdPais",referenciapersonalLogic.getReferenciaPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferenciaPersonals("FK_IdPais",referenciapersonals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciapersonalLogic.setReferenciaPersonals(new ArrayList<ReferenciaPersonal>());
						referenciapersonalLogic.getReferenciaPersonals().addAll(referenciapersonalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciapersonals=new ArrayList<ReferenciaPersonal>();
							referenciapersonals.addAll(referenciapersonalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoReferenciaPersonal")) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdTipoReferenciaPersonal(idvalorclientereferenciapersonalFK_IdTipoReferenciaPersonal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciapersonalLogic.getReferenciaPersonalsFK_IdTipoReferenciaPersonal(finalQueryGlobal,pagination,idvalorclientereferenciapersonalFK_IdTipoReferenciaPersonal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdTipoReferenciaPersonal(idvalorclientereferenciapersonalFK_IdTipoReferenciaPersonal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdTipoReferenciaPersonal(idvalorclientereferenciapersonalFK_IdTipoReferenciaPersonal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciapersonalLogic.getReferenciaPersonals()==null||referenciapersonalLogic.getReferenciaPersonals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referenciapersonals==null|| referenciapersonals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciapersonalsAux=new ArrayList<ReferenciaPersonal>();
						referenciapersonalsAux.addAll(referenciapersonalLogic.getReferenciaPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciapersonalsAux=new ArrayList<ReferenciaPersonal>();
							referenciapersonalsAux.addAll(referenciapersonals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciapersonalLogic.getReferenciaPersonalsFK_IdTipoReferenciaPersonal(finalQueryGlobal,pagination,idvalorclientereferenciapersonalFK_IdTipoReferenciaPersonal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdTipoReferenciaPersonal(idvalorclientereferenciapersonalFK_IdTipoReferenciaPersonal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaPersonalConstantesFunciones.getDetalleIndiceFK_IdTipoReferenciaPersonal(idvalorclientereferenciapersonalFK_IdTipoReferenciaPersonal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferenciaPersonals("FK_IdTipoReferenciaPersonal",referenciapersonalLogic.getReferenciaPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferenciaPersonals("FK_IdTipoReferenciaPersonal",referenciapersonals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciapersonalLogic.setReferenciaPersonals(new ArrayList<ReferenciaPersonal>());
						referenciapersonalLogic.getReferenciaPersonals().addAll(referenciapersonalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciapersonals=new ArrayList<ReferenciaPersonal>();
							referenciapersonals.addAll(referenciapersonalsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesReferenciaPersonal();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessReferenciaPersonal();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=referenciapersonalLogic.getReferenciaPersonals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=referenciapersonals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=referenciapersonalLogic.getReferenciaPersonals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=referenciapersonals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ReferenciaPersonal referenciapersonal) {
		Boolean permite=true;
		
		if(this.referenciapersonal.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ReferenciaPersonalConstantesFunciones.getOrderByListaReferenciaPersonal();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ReferenciaPersonalConstantesFunciones.getOrderByListaReferenciaPersonal();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReferenciaPersonal referenciapersonal:referenciapersonalLogic.getReferenciaPersonals()) {
				if(referenciapersonal.getsType().equals(Constantes2.S_TOTALES)) {
					referenciapersonalTotales=referenciapersonal;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReferenciaPersonal referenciapersonal:this.referenciapersonals) {
				if(referenciapersonal.getsType().equals(Constantes2.S_TOTALES)) {
					referenciapersonalTotales=referenciapersonal;
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
			this.referenciapersonalAux=new ReferenciaPersonal();
			this.referenciapersonalAux.setsType(Constantes2.S_TOTALES);
			this.referenciapersonalAux.setIsNew(false);
			this.referenciapersonalAux.setIsChanged(false);
			this.referenciapersonalAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ReferenciaPersonalConstantesFunciones.TotalizarValoresFilaReferenciaPersonal(this.referenciapersonalLogic.getReferenciaPersonals(),this.referenciapersonalAux);
				
				this.referenciapersonalLogic.getReferenciaPersonals().add(this.referenciapersonalAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ReferenciaPersonalConstantesFunciones.TotalizarValoresFilaReferenciaPersonal(this.referenciapersonals,this.referenciapersonalAux);
				
				this.referenciapersonals.add(this.referenciapersonalAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		referenciapersonalTotales=new ReferenciaPersonal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.referenciapersonalLogic.getReferenciaPersonals().remove(referenciapersonalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.referenciapersonals.remove(referenciapersonalTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		referenciapersonalTotales=new ReferenciaPersonal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReferenciaPersonal referenciapersonal:referenciapersonalLogic.getReferenciaPersonals()) {
				if(referenciapersonal.getsType().equals(Constantes2.S_TOTALES)) {
					referenciapersonalTotales=referenciapersonal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ReferenciaPersonalConstantesFunciones.TotalizarValoresFilaReferenciaPersonal(this.referenciapersonalLogic.getReferenciaPersonals(),referenciapersonalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReferenciaPersonal referenciapersonal:this.referenciapersonals) {
				if(referenciapersonal.getsType().equals(Constantes2.S_TOTALES)) {
					referenciapersonalTotales=referenciapersonal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ReferenciaPersonalConstantesFunciones.TotalizarValoresFilaReferenciaPersonal(this.referenciapersonals,referenciapersonalTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getReferenciaPersonalsFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReferenciaPersonalsFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReferenciaPersonalsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReferenciaPersonalsFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReferenciaPersonalsFK_IdTipoReferenciaPersonal()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoReferenciaPersonal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getReferenciaPersonalsFK_IdCiudad(String sFinalQuery,Long idciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciapersonalLogic.getReferenciaPersonalsFK_IdCiudad(sFinalQuery,this.pagination,idciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReferenciaPersonalsFK_IdCliente(String sFinalQuery,Long idcliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciapersonalLogic.getReferenciaPersonalsFK_IdCliente(sFinalQuery,this.pagination,idcliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReferenciaPersonalsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciapersonalLogic.getReferenciaPersonalsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReferenciaPersonalsFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciapersonalLogic.getReferenciaPersonalsFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReferenciaPersonalsFK_IdTipoReferenciaPersonal(String sFinalQuery,Long idvalorclientereferenciapersonal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciapersonalLogic.getReferenciaPersonalsFK_IdTipoReferenciaPersonal(sFinalQuery,this.pagination,idvalorclientereferenciapersonal);
				
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
	
	public void inicializarPermisosReferenciaPersonal() {
		this.isPermisoTodoReferenciaPersonal=false;
		this.isPermisoNuevoReferenciaPersonal=false;
		this.isPermisoActualizarReferenciaPersonal=false;
		this.isPermisoActualizarOriginalReferenciaPersonal=false;
		this.isPermisoEliminarReferenciaPersonal=false;
		this.isPermisoGuardarCambiosReferenciaPersonal=false;
		this.isPermisoConsultaReferenciaPersonal=false;
		this.isPermisoBusquedaReferenciaPersonal=false;
		this.isPermisoReporteReferenciaPersonal=false;		
		this.isPermisoOrdenReferenciaPersonal=false;		
		this.isPermisoPaginacionMedioReferenciaPersonal=false;		
		this.isPermisoPaginacionAltoReferenciaPersonal=false;
		this.isPermisoPaginacionTodoReferenciaPersonal=false;
		this.isPermisoCopiarReferenciaPersonal=false;		
		this.isPermisoVerFormReferenciaPersonal=false;		
		this.isPermisoDuplicarReferenciaPersonal=false;		
		this.isPermisoOrdenReferenciaPersonal=false;		
	}
	
	public void setPermisosUsuarioReferenciaPersonal(Boolean isPermiso) {
		this.isPermisoTodoReferenciaPersonal=isPermiso;
		this.isPermisoNuevoReferenciaPersonal=isPermiso;
		this.isPermisoActualizarReferenciaPersonal=isPermiso;
		this.isPermisoActualizarOriginalReferenciaPersonal=isPermiso;
		this.isPermisoEliminarReferenciaPersonal=isPermiso;
		this.isPermisoGuardarCambiosReferenciaPersonal=isPermiso;
		this.isPermisoConsultaReferenciaPersonal=isPermiso;
		this.isPermisoBusquedaReferenciaPersonal=isPermiso;
		this.isPermisoReporteReferenciaPersonal=isPermiso;
		this.isPermisoOrdenReferenciaPersonal=isPermiso;		
		this.isPermisoPaginacionMedioReferenciaPersonal=isPermiso;		
		this.isPermisoPaginacionAltoReferenciaPersonal=isPermiso;		
		this.isPermisoPaginacionTodoReferenciaPersonal=isPermiso;		
		this.isPermisoCopiarReferenciaPersonal=isPermiso;		
		this.isPermisoVerFormReferenciaPersonal=isPermiso;		
		this.isPermisoDuplicarReferenciaPersonal=isPermiso;
		this.isPermisoOrdenReferenciaPersonal=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioReferenciaPersonal(Boolean isPermiso) {
		//this.isPermisoTodoReferenciaPersonal=isPermiso;
		this.isPermisoNuevoReferenciaPersonal=isPermiso;
		this.isPermisoActualizarReferenciaPersonal=isPermiso;
		this.isPermisoActualizarOriginalReferenciaPersonal=isPermiso;
		this.isPermisoEliminarReferenciaPersonal=isPermiso;
		this.isPermisoGuardarCambiosReferenciaPersonal=isPermiso;
		//this.isPermisoConsultaReferenciaPersonal=isPermiso;
		//this.isPermisoBusquedaReferenciaPersonal=isPermiso;
		//this.isPermisoReporteReferenciaPersonal=isPermiso;
		//this.isPermisoOrdenReferenciaPersonal=isPermiso;		
		//this.isPermisoPaginacionMedioReferenciaPersonal=isPermiso;		
		//this.isPermisoPaginacionAltoReferenciaPersonal=isPermiso;		
		//this.isPermisoPaginacionTodoReferenciaPersonal=isPermiso;		
		//this.isPermisoCopiarReferenciaPersonal=isPermiso;		
		//this.isPermisoDuplicarReferenciaPersonal=isPermiso;
		//this.isPermisoOrdenReferenciaPersonal=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioReferenciaPersonalClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ReferenciaPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebReferenciaPersonal(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioReferenciaPersonalClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioReferenciaPersonalClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionReferenciaPersonalClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioReferenciaPersonalClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioReferenciaPersonal() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ReferenciaPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ReferenciaPersonalConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoReferenciaPersonal=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarReferenciaPersonal=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalReferenciaPersonal=this.isPermisoActualizarReferenciaPersonal;
			this.isPermisoEliminarReferenciaPersonal=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosReferenciaPersonal=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaReferenciaPersonal=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaReferenciaPersonal=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoReferenciaPersonal=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteReferenciaPersonal=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenReferenciaPersonal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioReferenciaPersonal=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoReferenciaPersonal=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoReferenciaPersonal=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarReferenciaPersonal=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormReferenciaPersonal=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarReferenciaPersonal=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenReferenciaPersonal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosReferenciaPersonal.setToolTipText(this.jTableDatosReferenciaPersonal.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioReferenciaPersonal(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioReferenciaPersonal(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ReferenciaPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ReferenciaPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioReferenciaPersonal() throws Exception {
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
	public void inicializarCombosForeignKeyReferenciaPersonalListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.tiporefepersosForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyReferenciaPersonalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ReferenciaPersonalJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyReferenciaPersonalListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoRefePersoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoRefePersoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiporefepersosForeignKey==null||this.tiporefepersosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoRefePersoConstantesFunciones.getArrayColumnasGlobalesTipoRefePerso(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRefePersoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoRefePersoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoRefePersosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CiudadConstantesFunciones.SFINALQUERY;

				this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyReferenciaPersonalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ReferenciaPersonalParameterReturnGeneral referenciapersonalReturnGeneral=new ReferenciaPersonalParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.referenciapersonalConstantesFunciones.cargarid_empresaReferenciaPersonal)
					 || (this.esRecargarFks && this.referenciapersonalConstantesFunciones.cargarid_empresaReferenciaPersonal)) {

					if(!this.referenciapersonalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+referenciapersonalSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.referenciapersonalConstantesFunciones.cargaridclienteReferenciaPersonal)
					 || (this.esRecargarFks && this.referenciapersonalConstantesFunciones.cargaridclienteReferenciaPersonal)) {

					if(!this.referenciapersonalSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+referenciapersonalSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoRefePerso="";

				if(((this.tiporefepersosForeignKey==null||this.tiporefepersosForeignKey.size()<=0) && this.referenciapersonalConstantesFunciones.cargaridvalorclientereferenciapersonalReferenciaPersonal)
					 || (this.esRecargarFks && this.referenciapersonalConstantesFunciones.cargaridvalorclientereferenciapersonalReferenciaPersonal)) {

					if(!this.referenciapersonalSessionBean.getisBusquedaDesdeForeignKeySesionTipoRefePerso()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoRefePersoConstantesFunciones.getArrayColumnasGlobalesTipoRefePerso(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoRefePerso=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRefePersoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoRefePerso=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoRefePerso, "");
						finalQueryGlobalTipoRefePerso+=TipoRefePersoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoRefePersosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoRefePerso=" WHERE " + ConstantesSql.ID + "="+referenciapersonalSessionBean.getlidTipoRefePersoActual();
					}
				} else {
					finalQueryGlobalTipoRefePerso="NONE";
				}


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.referenciapersonalConstantesFunciones.cargarid_paisReferenciaPersonal)
					 || (this.esRecargarFks && this.referenciapersonalConstantesFunciones.cargarid_paisReferenciaPersonal)) {

					if(!this.referenciapersonalSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+referenciapersonalSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalCiudad="";

				if(cargarCombosDependencia && ((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0) && this.referenciapersonalConstantesFunciones.cargaridciudadReferenciaPersonal)
					 || (this.esRecargarFks && this.referenciapersonalConstantesFunciones.cargaridciudadReferenciaPersonal)) {

					if(!this.referenciapersonalSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCiudad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

						finalQueryGlobalCiudad=Funciones.GetFinalQueryAppend(finalQueryGlobalCiudad, "");
						finalQueryGlobalCiudad+=CiudadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCiudad=" WHERE " + ConstantesSql.ID + "="+referenciapersonalSessionBean.getlidCiudadActual();
					}
				} else {
					finalQueryGlobalCiudad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				referenciapersonalReturnGeneral=referenciapersonalLogic.cargarCombosLoteForeignKeyReferenciaPersonal(finalQueryGlobalEmpresa,finalQueryGlobalCliente,finalQueryGlobalTipoRefePerso,finalQueryGlobalPais,finalQueryGlobalCiudad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=referenciapersonalReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=referenciapersonalReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoRefePerso.equals("NONE")) {
				this.tiporefepersosForeignKey=referenciapersonalReturnGeneral.gettiporefepersosForeignKey();
			}

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=referenciapersonalReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalCiudad.equals("NONE")) {
				this.ciudadsForeignKey=referenciapersonalReturnGeneral.getciudadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyReferenciaPersonal()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoRefePerso();
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyCiudad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.referenciapersonalSessionBean==null) {
				this.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
			}

			if(!this.referenciapersonalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.referenciapersonalSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyTipoRefePerso()throws Exception {
		try {

			if(!this.referenciapersonalSessionBean.getisBusquedaDesdeForeignKeySesionTipoRefePerso()) {
				TipoRefePerso tiporefeperso=new TipoRefePerso();
				TipoRefePersoConstantesFunciones.setTipoRefePersoDescripcion(tiporefeperso,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiporefeperso.setId(null);

				if(!TipoRefePersoConstantesFunciones.ExisteEnLista(this.tiporefepersosForeignKey,tiporefeperso,true)) {

					this.tiporefepersosForeignKey.add(0,tiporefeperso);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {

			if(!this.referenciapersonalSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCiudad()throws Exception {
		try {

			if(!this.referenciapersonalSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				Ciudad ciudad=new Ciudad();
				CiudadConstantesFunciones.setCiudadDescripcion(ciudad,Constantes.SMENSAJE_ESCOJA_OPCION);
				ciudad.setId(null);

				if(!CiudadConstantesFunciones.ExisteEnLista(this.ciudadsForeignKey,ciudad,true)) {

					this.ciudadsForeignKey.add(0,ciudad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyReferenciaPersonal()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyReferenciaPersonal(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyPais(JComboBox jComboBoxPaisGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Pais paisLocal=(Pais)jComboBoxPaisGenerico.getSelectedItem();

			if(paisLocal!=null  && paisLocal.getId()!=null  && paisLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_pais="+paisLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboCiudad=sFinalQueryCombo;

			this.ciudadsForeignKey=new ArrayList<Ciudad>();
			this.cargarCombosForeignKeyCiudad(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyPais(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
						this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.addItemListener(new ComboBoxItemListener(this,"id_paisReferenciaPersonal"));
						this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.addFocusListener(new ComboBoxFocusListener(this,"id_paisReferenciaPersonal"));
					}
				} else {
					if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
						this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.addActionListener(new ComboBoxActionListener(this,"id_paisReferenciaPersonal"));
						this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.addFocusListener(new ComboBoxFocusListener(this,"id_paisReferenciaPersonal"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_paisFK_IdPaisReferenciaPersonal.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_paisFK_IdPaisReferenciaPersonal"));

						this.jComboBoxid_paisFK_IdPaisReferenciaPersonal.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisReferenciaPersonal"));

					} else {
						this.jComboBoxid_paisFK_IdPaisReferenciaPersonal.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_paisFK_IdPaisReferenciaPersonal"));

						this.jComboBoxid_paisFK_IdPaisReferenciaPersonal.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisReferenciaPersonal"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyReferenciaPersonal()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.referenciapersonal.setfecha_nacimiento(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyReferenciaPersonal();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyReferenciaPersonal(ReferenciaPersonal referenciapersonal)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(referenciapersonal.getidcliente(),false,"Formulario");
			this.setActualTipoRefePersoForeignKey(referenciapersonal.getidvalorclientereferenciapersonal(),false,"Formulario");
			this.setActualPaisForeignKey(referenciapersonal.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(referenciapersonal.getidciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyReferenciaPersonal(ReferenciaPersonal referenciapersonal,String sTipoEvento)throws Exception {	
		try {
			
			

				if(referenciapersonal.getCliente()!=null && !sTipoEvento.equals("idclienteReferenciaPersonal")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(referenciapersonal.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyReferenciaPersonal()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.referenciapersonalConstantesFunciones.getidcliente(),false,"Formulario");
			this.setActualTipoRefePersoForeignKey(this.referenciapersonalConstantesFunciones.getidvalorclientereferenciapersonal(),false,"Formulario");
			this.setActualPaisForeignKey(this.referenciapersonalConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(this.referenciapersonalConstantesFunciones.getidciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyReferenciaPersonal()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyReferenciaPersonal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyReferenciaPersonal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroReferenciaPersonal()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyReferenciaPersonal()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoRefePersosForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyReferenciaPersonal(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRefePersosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyReferenciaPersonal()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_empresaReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_empresaReferenciaPersonal.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_empresaReferenciaPersonal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidclienteReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidclienteReferenciaPersonal.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidclienteReferenciaPersonal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidvalorclientereferenciapersonalReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidciudadReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidciudadReferenciaPersonal.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidciudadReferenciaPersonal.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	







	public void recargarFormReferenciaPersonalPais(JComboBox<?> jComboBoxGenericoPais,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormReferenciaPersonalidciudad(jComboBoxGenericoPais,sFormularioTipoBusqueda,"Pais",false);
	}


	
	



	public void recargarFormReferenciaPersonalidciudad(JComboBox<?> jComboBoxGenericoCiudad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Pais")){
				this.setActualParaGuardarPaisForeignKey(this.referenciapersonal,jComboBoxGenericoCiudad);
			}

			if(this.referenciapersonal.getid_pais()!=null && this.referenciapersonal.getid_pais()!=0L) {
				sFinalQuery+="  WHERE  id_pais="+this.referenciapersonal.getid_pais();
			} else {
				sFinalQuery+="  WHERE  id_pais=-1";
			}



			//BUCLE RECURSIVO
			this.setActualCiudadForeignKey(this.referenciapersonal.getid_pais(),true,sFormularioTipoBusqueda);

			this.cargarCombosCiudadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public ReferenciaPersonalBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ReferenciaPersonalBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ReferenciaPersonalBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean(); 
		this.referenciapersonalConstantesFunciones=new ReferenciaPersonalConstantesFunciones(); 
		this.referenciapersonalBean=new ReferenciaPersonal();//(this.referenciapersonalConstantesFunciones); 		
		this.referenciapersonalReturnGeneral=new ReferenciaPersonalParameterReturnGeneral(); 
		
		this.referenciapersonalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.referenciapersonalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ReferenciaPersonalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ReferenciaPersonalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ReferenciaPersonalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessReferenciaPersonal(true);
			
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
			
			this.referenciapersonalConstantesFunciones=new ReferenciaPersonalConstantesFunciones(); 
			this.referenciapersonalBean=new ReferenciaPersonal();//this.referenciapersonalConstantesFunciones); 			
			this.referenciapersonalReturnGeneral=new ReferenciaPersonalParameterReturnGeneral(); 
		
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Referencia Personal Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.referenciapersonal=new ReferenciaPersonal();
			this.referenciapersonals = new ArrayList<ReferenciaPersonal>();
			this.referenciapersonalsAux = new ArrayList<ReferenciaPersonal>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic=new ReferenciaPersonalLogic();
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}
			
			//this.referenciapersonalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.referenciapersonalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormReferenciaPersonal);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoReferenciaPersonal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoReferenciaPersonal);	
					}
					
					if(this.jInternalFrameImportacionReferenciaPersonal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionReferenciaPersonal);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByReferenciaPersonal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByReferenciaPersonal);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormReferenciaPersonal);
				this.jInternalFrameDetalleFormReferenciaPersonal.setVisible(false);
				this.jInternalFrameDetalleFormReferenciaPersonal.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoReferenciaPersonal!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoReferenciaPersonal);
					this.jInternalFrameReporteDinamicoReferenciaPersonal.setVisible(false);
					this.jInternalFrameReporteDinamicoReferenciaPersonal.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionReferenciaPersonal!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionReferenciaPersonal);
					this.jInternalFrameImportacionReferenciaPersonal.setVisible(false);
					this.jInternalFrameImportacionReferenciaPersonal.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByReferenciaPersonal!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByReferenciaPersonal);
					this.jInternalFrameOrderByReferenciaPersonal.setVisible(false);
					this.jInternalFrameOrderByReferenciaPersonal.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idReferenciaPersonalActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ReferenciaPersonalConstantesFunciones.INUMEROPAGINACION;
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
			
			this.referenciapersonalReturnGeneral=new ReferenciaPersonalParameterReturnGeneral();
			
			this.referenciapersonalParameterGeneral=new ReferenciaPersonalParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.referenciapersonalLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ReferenciaPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ReferenciaPersonalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.referenciapersonalSessionBean.getEsGuardarRelacionado(),this.referenciapersonalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ReferenciaPersonalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.referenciapersonalSessionBean.getEsGuardarRelacionado(),this.referenciapersonalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoReferenciaPersonal=false;
			this.isVisibilidadCeldaDuplicarReferenciaPersonal=true;
			this.isVisibilidadCeldaCopiarReferenciaPersonal=true;
			this.isVisibilidadCeldaVerFormReferenciaPersonal=true;
			this.isVisibilidadCeldaOrdenReferenciaPersonal=true;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal=false;
			this.isVisibilidadCeldaModificarReferenciaPersonal=false;
			this.isVisibilidadCeldaActualizarReferenciaPersonal=false;
			this.isVisibilidadCeldaEliminarReferenciaPersonal=false;
			this.isVisibilidadCeldaCancelarReferenciaPersonal=false;
			this.isVisibilidadCeldaGuardarReferenciaPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaPersonal=false;
			
			
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdTipoReferenciaPersonal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesReferenciaPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosReferenciaPersonal();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioReferenciaPersonal(false);
			
			this.setPermisosUsuarioReferenciaPersonal();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado() 
				|| (this.referenciapersonalSessionBean.getEsGuardarRelacionado() && this.referenciapersonalSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioReferenciaPersonalClasesRelacionadas();
			}
			
			if(this.referenciapersonalSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioReferenciaPersonalClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosReferenciaPersonal();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualReferenciaPersonal();
			}
			
			if(!this.isPermisoBusquedaReferenciaPersonal) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasReferenciaPersonal.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioReferenciaPersonal,this.isPermisoPaginacionMedioReferenciaPersonal,this.isPermisoPaginacionTodoReferenciaPersonal);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ReferenciaPersonalConstantesFunciones.getTiposSeleccionarReferenciaPersonal());
				
				this.tiposColumnasSelect=ReferenciaPersonalConstantesFunciones.getTiposSeleccionarReferenciaPersonal(true);
				
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
			//if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioReferenciaPersonal();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioReferenciaPersonal(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioReferenciaPersonal(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesReferenciaPersonal() ;
			
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
			this.tiporefepersoLogic=new TipoRefePersoLogic();
			this.paisLogic=new PaisLogic();
			this.ciudadLogic=new CiudadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				referenciapersonalImplementable= (ReferenciaPersonalImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ReferenciaPersonalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				referenciapersonalImplementableHome= (ReferenciaPersonalImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ReferenciaPersonalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.referenciapersonals= new ArrayList<ReferenciaPersonal>();
			this.referenciapersonalsEliminados= new ArrayList<ReferenciaPersonal>();
						
			this.isEsNuevoReferenciaPersonal=false;
			this.esParaAccionDesdeFormularioReferenciaPersonal=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tiporefepersosForeignKey=new ArrayList<TipoRefePerso>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyReferenciaPersonal(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroReferenciaPersonal();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ReferenciaPersonalConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesReferenciaPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingReferenciaPersonal(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioReferenciaPersonal();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioReferenciaPersonal();
			}
			
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasReferenciaPersonal.getTabCount(); i++) {
					this.jTabbedPaneBusquedasReferenciaPersonal.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasReferenciaPersonal.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessReferenciaPersonal(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ReferenciaPersonal: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectReferenciaPersonal() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesReferenciaPersonal")) {
				iIndex=this.jInternalFrameDetalleFormReferenciaPersonal.jTabbedPaneRelacionesReferenciaPersonal.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormReferenciaPersonal.jTabbedPaneRelacionesReferenciaPersonal.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessReferenciaPersonal();	
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
	
	public void cargarCombosForeignKeyReferenciaPersonal(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyReferenciaPersonal(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyReferenciaPersonal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyReferenciaPersonalListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyReferenciaPersonal();
		
		this.cargarCombosFrameForeignKeyReferenciaPersonal();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyReferenciaPersonal();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyReferenciaPersonal();
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

	public void cargarCombosForeignKeyTipoRefePerso(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoRefePersoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoRefePerso();
				this.cargarCombosFrameTipoRefePersosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoRefePerso(this.tiporefepersosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaCiudad(this.ciudadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoReferenciaPersonalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.referenciapersonalSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormReferenciaPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
			
			
			if(jTableDatosReferenciaPersonal.getRowCount()>=1) {
				jTableDatosReferenciaPersonal.removeRowSelectionInterval(0, jTableDatosReferenciaPersonal.getRowCount()-1);						
			}
			
			this.isEsNuevoReferenciaPersonal=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoReferenciaPersonal(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesReferenciaPersonal(true);			
			//this.referenciapersonal=new ReferenciaPersonal();
			//this.referenciapersonal.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReferenciaPersonal(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReferenciaPersonal() ;
			
			if(ReferenciaPersonalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReferenciaPersonal(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.referenciapersonal);	
			this.actualizarInformacion("INFO_PADRE",false,this.referenciapersonal);				
			
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
			
			if(this.referenciapersonalSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ReferenciaPersonal: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarReferenciaPersonalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ReferenciaPersonal> referenciapersonalsSeleccionados=new ArrayList<ReferenciaPersonal>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosReferenciaPersonal.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosReferenciaPersonal.getSelectedRows().length;			
			}
			
			referenciapersonalsSeleccionados=this.getReferenciaPersonalsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoReferenciaPersonal--;			
				//ReferenciaPersonal referenciapersonalAux= new ReferenciaPersonal();			
				//referenciapersonalAux.setId(this.iIdNuevoReferenciaPersonal);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ReferenciaPersonal referenciapersonalOrigen=new ReferenciaPersonal();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ReferenciaPersonal referenciapersonalOrigen : referenciapersonalsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							referenciapersonalOrigen =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciapersonalOrigen =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaReferenciaPersonal();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.referenciapersonal.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosReferenciaPersonal(referenciapersonalOrigen,this.referenciapersonal,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.referenciapersonalLogic.getReferenciaPersonals().add(this.referenciapersonalAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.referenciapersonals.add(this.referenciapersonalAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaReferenciaPersonal(false);
				
				this.jTableDatosReferenciaPersonal.setRowSelectionInterval(this.getIndiceNuevoReferenciaPersonal(), this.getIndiceNuevoReferenciaPersonal());
				
				int iLastRow =  this.jTableDatosReferenciaPersonal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosReferenciaPersonal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosReferenciaPersonal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaReferenciaPersonal(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ReferenciaPersonal> referenciapersonalsSeleccionados=new ArrayList<ReferenciaPersonal>();									
		
			ReferenciaPersonal referenciapersonalOrigen=new ReferenciaPersonal();
			ReferenciaPersonal referenciapersonalDestino=new ReferenciaPersonal();
				
			referenciapersonalsSeleccionados=this.getReferenciaPersonalsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosReferenciaPersonal.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || referenciapersonalsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosReferenciaPersonal.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciapersonalOrigen =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						referenciapersonalOrigen =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciapersonalDestino =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						referenciapersonalDestino =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				referenciapersonalOrigen =referenciapersonalsSeleccionados.get(0);
				referenciapersonalDestino =referenciapersonalsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosReferenciaPersonal(referenciapersonalOrigen,referenciapersonalDestino,true,false);
				
				referenciapersonalDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(referenciapersonalDestino,referenciapersonalLogic.getReferenciaPersonals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(referenciapersonalDestino,referenciapersonals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaReferenciaPersonal(false);
				
				//this.jTableDatosReferenciaPersonal.setRowSelectionInterval(this.getIndiceNuevoReferenciaPersonal(), this.getIndiceNuevoReferenciaPersonal());
				
				int iLastRow =  this.jTableDatosReferenciaPersonal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosReferenciaPersonal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosReferenciaPersonal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaReferenciaPersonal(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormReferenciaPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormReferenciaPersonal.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesReferenciaPersonal.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasReferenciaPersonal.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesReferenciaPersonal.setVisible(!isVisible);
			this.jPanelPaginacionReferenciaPersonal.setVisible(!isVisible);
			this.jPanelAccionesReferenciaPersonal.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameReferenciaPersonal();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoReferenciaPersonal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionReferenciaPersonal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByReferenciaPersonal();
			
			this.abrirFrameOrderByReferenciaPersonal();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByReferenciaPersonal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleReferenciaPersonal(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormReferenciaPersonal);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormReferenciaPersonal.isMaximum()) {
					this.jInternalFrameDetalleFormReferenciaPersonal.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormReferenciaPersonal.setSize(this.jInternalFrameDetalleFormReferenciaPersonal.iWidthFormulario,this.jInternalFrameDetalleFormReferenciaPersonal.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormReferenciaPersonal.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormReferenciaPersonal.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormReferenciaPersonal.isMaximum()) {
						this.jInternalFrameDetalleFormReferenciaPersonal.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormReferenciaPersonal.jContentPaneDetalleReferenciaPersonal.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormReferenciaPersonal.jTabbedPaneRelacionesReferenciaPersonal.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormReferenciaPersonal.jContentPaneDetalleReferenciaPersonal.getWidth(),ReferenciaPersonalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormReferenciaPersonal.jTabbedPaneRelacionesReferenciaPersonal.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormReferenciaPersonal.jContentPaneDetalleReferenciaPersonal.getWidth(),ReferenciaPersonalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormReferenciaPersonal.jTabbedPaneRelacionesReferenciaPersonal.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormReferenciaPersonal.jContentPaneDetalleReferenciaPersonal.getWidth(),ReferenciaPersonalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormReferenciaPersonal.setVisible(true);
	        this.jInternalFrameDetalleFormReferenciaPersonal.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByReferenciaPersonal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByReferenciaPersonal==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByReferenciaPersonal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReferenciaPersonal,false,this);
				} else {
					this.jInternalFrameOrderByReferenciaPersonal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReferenciaPersonal,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByReferenciaPersonal);
				this.jInternalFrameOrderByReferenciaPersonal.setVisible(false);
				this.jInternalFrameOrderByReferenciaPersonal.setSelected(false);
				
				this.jInternalFrameOrderByReferenciaPersonal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByReferenciaPersonal"));
				
				this.inicializarActualizarBindingTablaOrderByReferenciaPersonal();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionReferenciaPersonal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionReferenciaPersonal==null) {
				
				this.jInternalFrameImportacionReferenciaPersonal=new ImportacionJInternalFrame(ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionReferenciaPersonal);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionReferenciaPersonal);
				this.jInternalFrameImportacionReferenciaPersonal.setVisible(false);
				this.jInternalFrameImportacionReferenciaPersonal.setSelected(false);


				this.jInternalFrameImportacionReferenciaPersonal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionReferenciaPersonal"));
				this.jInternalFrameImportacionReferenciaPersonal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionReferenciaPersonal"));
				this.jInternalFrameImportacionReferenciaPersonal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionReferenciaPersonal"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoReferenciaPersonal() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoReferenciaPersonal==null) {
				this.jInternalFrameReporteDinamicoReferenciaPersonal=new ReporteDinamicoJInternalFrame(ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoReferenciaPersonal);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoReferenciaPersonal);
				this.jInternalFrameReporteDinamicoReferenciaPersonal.setVisible(false);
				this.jInternalFrameReporteDinamicoReferenciaPersonal.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoReferenciaPersonal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReferenciaPersonal"));
				this.jInternalFrameReporteDinamicoReferenciaPersonal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReferenciaPersonal"));
				this.jInternalFrameReporteDinamicoReferenciaPersonal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReferenciaPersonal"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReferenciaPersonal();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleReferenciaPersonal() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormReferenciaPersonal);
			
	       	this.jInternalFrameDetalleFormReferenciaPersonal.setVisible(false);
	        this.jInternalFrameDetalleFormReferenciaPersonal.setSelected(false);
			
			//this.jInternalFrameDetalleFormReferenciaPersonal.dispose();
			//this.jInternalFrameDetalleFormReferenciaPersonal=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoReferenciaPersonal() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoReferenciaPersonal.setVisible(true);
	        this.jInternalFrameReporteDinamicoReferenciaPersonal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionReferenciaPersonal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionReferenciaPersonal.setVisible(true);
	        this.jInternalFrameImportacionReferenciaPersonal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByReferenciaPersonal() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByReferenciaPersonal.setVisible(true);
	        this.jInternalFrameOrderByReferenciaPersonal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByReferenciaPersonal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByReferenciaPersonal.setVisible(false);
	        this.jInternalFrameOrderByReferenciaPersonal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoReferenciaPersonal() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoReferenciaPersonal.setVisible(false);
	        this.jInternalFrameReporteDinamicoReferenciaPersonal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionReferenciaPersonal() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionReferenciaPersonal.setVisible(false);
	        this.jInternalFrameImportacionReferenciaPersonal.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarReferenciaPersonal(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarReferenciaPersonal(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesReferenciaPersonal(true);
			//this.isEsNuevoReferenciaPersonal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesReferenciaPersonal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReferenciaPersonal(false) ;
			
			if(referenciapersonalSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ReferenciaPersonalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReferenciaPersonal(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReferenciaPersonal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaReferenciaPersonalActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarReferenciaPersonal(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormReferenciaPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesReferenciaPersonal(true);
			//this.isEsNuevoReferenciaPersonal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.referenciapersonal.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesReferenciaPersonal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesReferenciaPersonal(false) ;
			
			if(ReferenciaPersonalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReferenciaPersonal(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReferenciaPersonal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.referenciapersonalConstantesFunciones.cargaridclienteReferenciaPersonal) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingReferenciaPersonal(false,false);
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
		TableColumn tableColumnCliente=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReferenciaPersonal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoRefePerso(List<TipoRefePerso> tiporefepersosForeignKey)throws Exception{
		TableColumn tableColumnTipoRefePerso=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_IDTIPOREFEPERSO));
		TableCellEditor tableCellEditorTipoRefePerso =tableColumnTipoRefePerso.getCellEditor();

		TipoRefePersoTableCell tiporefepersoTableCellFk=(TipoRefePersoTableCell)tableCellEditorTipoRefePerso;

		if(tiporefepersoTableCellFk!=null) {
			tiporefepersoTableCellFk.settiporefepersosForeignKey(tiporefepersosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReferenciaPersonal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporefepersoTableCellFk.setRowActual(intSelectedRow);
			//tiporefepersoTableCellFk.settiporefepersosForeignKeyActual(tiporefepersosForeignKey);
		//}


		if(tiporefepersoTableCellFk!=null) {
			tiporefepersoTableCellFk.RecargarTipoRefePersosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReferenciaPersonal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCiudad(List<Ciudad> ciudadsForeignKey)throws Exception{
		TableColumn tableColumnCiudad=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReferenciaPersonal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaidcliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesReferenciaPersonal(false);
			
			//if(!this.isEsNuevoReferenciaPersonal) {								
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				
			}
			
			if(this.permiteMantenimiento(this.referenciapersonal)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoReferenciaPersonal=true;
					this.inicializarActualizarBindingTablaReferenciaPersonal(false);
					this.isEsNuevoReferenciaPersonal=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoReferenciaPersonal=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoReferenciaPersonal=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesReferenciaPersonal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReferenciaPersonal(false);
				
				this.habilitarDeshabilitarControlesReferenciaPersonal(false);
			
												
				
				if(ReferenciaPersonalJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleReferenciaPersonal();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoReferenciaPersonalActionPerformed(evt,referenciapersonalSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualReferenciaPersonal(this.referenciapersonal,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosReferenciaPersonal.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,referenciapersonalSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.referenciapersonal.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ReferenciaPersonal.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaPersonal.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				this.referenciapersonal.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				this.referenciapersonal.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.referenciapersonal)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ReferenciaPersonalModel) this.jTableDatosReferenciaPersonal.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoReferenciaPersonal=true;
				this.inicializarActualizarBindingTablaReferenciaPersonal(false);
				this.isEsNuevoReferenciaPersonal=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesReferenciaPersonal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReferenciaPersonal(false);
				
				this.habilitarDeshabilitarControlesReferenciaPersonal(false);
				
				
				
				if(ReferenciaPersonalJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleReferenciaPersonal();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosReferenciaPersonal.getRowCount()>=1) {
				jTableDatosReferenciaPersonal.removeRowSelectionInterval(0, jTableDatosReferenciaPersonal.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesReferenciaPersonal(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaReferenciaPersonal(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReferenciaPersonal(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReferenciaPersonal(false) ;
			
			this.isEsNuevoReferenciaPersonal=false;
			
			if(ReferenciaPersonalJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleReferenciaPersonal();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingReferenciaPersonal(false);
				
				//SI ES MANUAL
				if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualReferenciaPersonal();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoReferenciaPersonal--;			
			//ReferenciaPersonal referenciapersonalAux= new ReferenciaPersonal();			
			//referenciapersonalAux.setId(this.iIdNuevoReferenciaPersonal);
			
			if(this.jInternalFrameDetalleFormReferenciaPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaReferenciaPersonal();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
			
			this.referenciapersonal.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.referenciapersonalLogic.getReferenciaPersonals().add(this.referenciapersonalAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.referenciapersonals.add(this.referenciapersonalAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaReferenciaPersonal(false);
			
			this.jTableDatosReferenciaPersonal.setRowSelectionInterval(this.getIndiceNuevoReferenciaPersonal(), this.getIndiceNuevoReferenciaPersonal());
			
			int iLastRow =  this.jTableDatosReferenciaPersonal.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosReferenciaPersonal.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosReferenciaPersonal.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaReferenciaPersonal(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingReferenciaPersonal(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReferenciaPersonal(false);
			
			//SI ES MANUAL
			if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReferenciaPersonal();
			}
			
			//this.abrirFrameTreeReferenciaPersonal();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Referencia PersonalES ?", "MANTENIMIENTO DE Referencia Personal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionReferenciaPersonal.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralReferenciaPersonal();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.referenciapersonalReturnGeneral=referenciapersonalLogic.procesarImportacionReferenciaPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.referenciapersonalParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarReferenciaPersonalReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionReferenciaPersonal.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionReferenciaPersonal.setFileImportacion(this.jInternalFrameImportacionReferenciaPersonal.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionReferenciaPersonal.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionReferenciaPersonal.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionReferenciaPersonal.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionReferenciaPersonal.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ReferenciaPersonal> referenciapersonalsSeleccionados=new ArrayList<ReferenciaPersonal>();		

		referenciapersonalsSeleccionados=this.getReferenciaPersonalsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReferenciaPersonal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReferenciaPersonal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ReferenciaPersonalBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ReferenciaPersonalBaseDesign.jrxml";
			
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
			
			this.generarReporteReferenciaPersonals("Todos",referenciapersonalsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Personal",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoReferenciaPersonal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReferenciaPersonal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ReferenciaPersonalConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDTIPOREFEPERSO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoRefePerso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoRefePerso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoRefePerso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoRefePerso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDCIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ciudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ciudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ciudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ciudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_entificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_entificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_entificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_entificacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaNacimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaNacimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaNacimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaNacimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoMovil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoMovil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoMovil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoMovil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoCodigoArea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoCodigoArea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoCodigoArea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoCodigoArea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_eferencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_eferencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_eferencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_eferencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_EMAIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ail_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ail_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ail_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ail_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_servacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_servacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_servacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_servacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taTrabajando_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taTrabajando_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taTrabajando_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taTrabajando_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_presaTrabajo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_presaTrabajo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_presaTrabajo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_presaTrabajo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccionTrabajo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccionTrabajo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccionTrabajo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccionTrabajo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoTrabajo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoTrabajo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoTrabajo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoTrabajo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO:
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
		
		if(this.jInternalFrameReporteDinamicoReferenciaPersonal.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoReferenciaPersonal.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoReferenciaPersonal.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ReferenciaPersonalConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="idcliente";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDTIPOREFEPERSO:
					sNombreCampoCategoria="idvalorclientereferenciapersonal";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoria="idciudad";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoria="identificacion";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO:
					sNombreCampoCategoria="fecha_nacimiento";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL:
					sNombreCampoCategoria="telefonomovil";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					sNombreCampoCategoria="telefonocodigoarea";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA:
					sNombreCampoCategoria="preferencia";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoria="email";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoria="observacion";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO:
					sNombreCampoCategoria="esta_trabajando";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO:
					sNombreCampoCategoria="empresa_trabajo";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO:
					sNombreCampoCategoria="direccion_trabajo";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO:
					sNombreCampoCategoria="telefono_trabajo";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoria="esactivo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoReferenciaPersonal.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ReferenciaPersonalConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="idcliente";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDTIPOREFEPERSO:
					sNombreCampoCategoriaValor="idvalorclientereferenciapersonal";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoriaValor="idciudad";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoriaValor="identificacion";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO:
					sNombreCampoCategoriaValor="fecha_nacimiento";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL:
					sNombreCampoCategoriaValor="telefonomovil";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					sNombreCampoCategoriaValor="telefonocodigoarea";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA:
					sNombreCampoCategoriaValor="preferencia";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoriaValor="email";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoriaValor="observacion";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO:
					sNombreCampoCategoriaValor="esta_trabajando";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO:
					sNombreCampoCategoriaValor="empresa_trabajo";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO:
					sNombreCampoCategoriaValor="direccion_trabajo";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO:
					sNombreCampoCategoriaValor="telefono_trabajo";
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoriaValor="esactivo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoReferenciaPersonal.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReferenciaPersonal.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ReferenciaPersonalConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idcliente");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDTIPOREFEPERSO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Refe Perso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idvalorclientereferenciapersonal");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDCIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idciudad");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Identificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"identificacion");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Nacimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_nacimiento");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Movil",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefonomovil");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Codigo Area",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefonocodigoarea");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Preferencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"preferencia");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_EMAIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Email",sNombreCampoCategoria,sNombreCampoCategoriaValor,"email");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Observacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"observacion");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Trabajando",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_trabajando");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa Trabajo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"empresa_trabajo");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion Trabajo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion_trabajo");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Trabajo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono_trabajo");
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO:
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
	
	public void jButtonGenerarExcelReporteDinamicoReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ReferenciaPersonal> referenciapersonalsSeleccionados=new ArrayList<ReferenciaPersonal>();		
		
		referenciapersonalsSeleccionados=this.getReferenciaPersonalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciapersonal";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ReferenciaPersonals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoReferenciaPersonal.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoReferenciaPersonal.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ReferenciaPersonalConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDTIPOREFEPERSO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDTIPOREFEPERSO);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.gettiporefeperso_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.getidentificacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.getfecha_nacimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.gettelefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.gettelefonomovil());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.gettelefonocodigoarea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.getpreferencia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_EMAIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_EMAIL);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.getemail());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.getobservacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.getesta_trabajando());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.getempresa_trabajo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.getdireccion_trabajo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.gettelefono_trabajo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO);
					iRow++;

					for(ReferenciaPersonal referenciapersonal:referenciapersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciapersonal.getesactivo());
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
			//	this.getFilaCabeceraExportarExcelReferenciaPersonal(row);				
			//	iRow++;
			//}				
			
			//for(ReferenciaPersonal referenciapersonalAux:referenciapersonalsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelReferenciaPersonal(referenciapersonalAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Personal",JOptionPane.INFORMATION_MESSAGE);
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
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReferenciaPersonal(false);
			
			//SI ES MANUAL
			if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReferenciaPersonal();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReferenciaPersonal(false);
			
			//SI ES MANUAL
			if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualReferenciaPersonal();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReferenciaPersonal(false);
			
			//SI ES MANUAL
			if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualReferenciaPersonal();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaReferenciaPersonal() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosReferenciaPersonal.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosReferenciaPersonal.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosReferenciaPersonal.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosReferenciaPersonal.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosReferenciaPersonal.setMinimumSize(dimensionMinimum);
		this.jTableDatosReferenciaPersonal.setMaximumSize(dimensionMaximum);
		this.jTableDatosReferenciaPersonal.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingReferenciaPersonal(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingReferenciaPersonal(esInicializar,true);
	}
	
	public void inicializarActualizarBindingReferenciaPersonal(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaReferenciaPersonal(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesReferenciaPersonal(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasReferenciaPersonal(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesReferenciaPersonal(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesReferenciaPersonal(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualReferenciaPersonal() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaReferenciaPersonal();
		
		this.inicializarActualizarBindingBotonesManualReferenciaPersonal(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualReferenciaPersonal();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesReferenciaPersonal() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualReferenciaPersonal(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualReferenciaPersonal(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosReferenciaPersonal.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosReferenciaPersonal.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteReferenciaPersonal.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxPostAccionNuevoReferenciaPersonal.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxPostAccionSinCerrarReferenciaPersonal.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxPostAccionSinMensajeReferenciaPersonal.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosReferenciaPersonal.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosReferenciaPersonal.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteReferenciaPersonal.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
				this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxPostAccionNuevoReferenciaPersonal.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxPostAccionSinCerrarReferenciaPersonal.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxPostAccionSinMensajeReferenciaPersonal.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionReferenciaPersonal.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionReferenciaPersonal.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxTiposAccionesFormularioReferenciaPersonal.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesReferenciaPersonal.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoReferenciaPersonal!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReferenciaPersonal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesReferenciaPersonal.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesReferenciaPersonal.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarReferenciaPersonal.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesReferenciaPersonal.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoReferenciaPersonal!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReferenciaPersonal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesReferenciaPersonal.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralReferenciaPersonal.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesReferenciaPersonal(Boolean esInicializar) throws Exception {
		try	{	
			if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualReferenciaPersonal(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesReferenciaPersonal() throws Exception {
		try	{
			if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualReferenciaPersonal();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleReferenciaPersonal() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxTiposAccionesFormularioReferenciaPersonal.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxTiposAccionesFormularioReferenciaPersonal.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualReferenciaPersonal() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesReferenciaPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesReferenciaPersonal.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesReferenciaPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesReferenciaPersonal.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesReferenciaPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesReferenciaPersonal.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionReferenciaPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionReferenciaPersonal.addItem(reporte);
			}
			
			
			if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionReferenciaPersonal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionReferenciaPersonal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesReferenciaPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesReferenciaPersonal.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesReferenciaPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesReferenciaPersonal.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxTiposAccionesFormularioReferenciaPersonal.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxTiposAccionesFormularioReferenciaPersonal.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarReferenciaPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarReferenciaPersonal.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarReferenciaPersonal.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReferenciaPersonal();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReferenciaPersonal() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoReferenciaPersonal!=null) {
				this.jInternalFrameReporteDinamicoReferenciaPersonal.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoReferenciaPersonal.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoReferenciaPersonal!=null) {
				this.jInternalFrameReporteDinamicoReferenciaPersonal.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoReferenciaPersonal.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoReferenciaPersonal!=null) {
				
				if(this.jInternalFrameReporteDinamicoReferenciaPersonal.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoReferenciaPersonal.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoReferenciaPersonal.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoReferenciaPersonal.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoReferenciaPersonal.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoReferenciaPersonal.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualReferenciaPersonal()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxidciudadFK_IdCiudadReferenciaPersonal.getSelectedItem()!=null){this.idciudadFK_IdCiudad=((Ciudad)this.jComboBoxidciudadFK_IdCiudadReferenciaPersonal.getSelectedItem()).getId();}
		if(this.jComboBoxidclienteFK_IdClienteReferenciaPersonal.getSelectedItem()!=null){this.idclienteFK_IdCliente=((Cliente)this.jComboBoxidclienteFK_IdClienteReferenciaPersonal.getSelectedItem()).getId();}
		if(this.jComboBoxid_paisFK_IdPaisReferenciaPersonal.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisReferenciaPersonal.getSelectedItem()).getId();}
		if(this.jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.getSelectedItem()!=null){this.idvalorclientereferenciapersonalFK_IdTipoReferenciaPersonal=((TipoRefePerso)this.jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasReferenciaPersonal(Boolean esInicializar) throws Exception {				
		if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualReferenciaPersonal();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaReferenciaPersonal() throws Exception {
		this.inicializarActualizarBindingTablaReferenciaPersonal(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByReferenciaPersonal() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByReferenciaPersonal.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByReferenciaPersonal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReferenciaPersonal.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByReferenciaPersonal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReferenciaPersonal.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosReferenciaPersonalOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonalOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByReferenciaPersonal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReferenciaPersonal.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByReferenciaPersonal.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaReferenciaPersonal(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=referenciapersonalLogic.getReferenciaPersonals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=referenciapersonals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosReferenciaPersonal.setModel(new ReferenciaPersonalModel(this.referenciapersonalLogic.getReferenciaPersonals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosReferenciaPersonal.setModel(new ReferenciaPersonalModel(this.referenciapersonals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByReferenciaPersonal!=null && this.jInternalFrameOrderByReferenciaPersonal.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByReferenciaPersonal();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO,referenciapersonalConstantesFunciones.resaltarSeleccionarReferenciaPersonal,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO,referenciapersonalConstantesFunciones.resaltarSeleccionarReferenciaPersonal,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_ID));

		if(this.referenciapersonalConstantesFunciones.mostraridReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.referenciapersonalConstantesFunciones.resaltaridReferenciaPersonal,this.referenciapersonalConstantesFunciones.activaridReferenciaPersonal,this,true,"idReferenciaPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciapersonalConstantesFunciones.resaltaridReferenciaPersonal,this.referenciapersonalConstantesFunciones.activaridReferenciaPersonal,this,true,"idReferenciaPersonal","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_IDEMPRESA));

		if(this.referenciapersonalConstantesFunciones.mostrarid_empresaReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.referenciapersonalConstantesFunciones.resaltarid_empresaReferenciaPersonal,this,this.referenciapersonalConstantesFunciones.activarid_empresaReferenciaPersonal));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.referenciapersonalConstantesFunciones.resaltarid_empresaReferenciaPersonal,this,this.referenciapersonalConstantesFunciones.activarid_empresaReferenciaPersonal,false,"id_empresaReferenciaPersonal","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_IDCLIENTE));

		if(this.referenciapersonalConstantesFunciones.mostraridclienteReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.referenciapersonalConstantesFunciones.resaltaridclienteReferenciaPersonal,this,this.referenciapersonalConstantesFunciones.activaridclienteReferenciaPersonal));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.referenciapersonalConstantesFunciones.resaltaridclienteReferenciaPersonal,this,this.referenciapersonalConstantesFunciones.activaridclienteReferenciaPersonal,true,"idclienteReferenciaPersonal","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_IDTIPOREFEPERSO));

		if(this.referenciapersonalConstantesFunciones.mostraridvalorclientereferenciapersonalReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_IDTIPOREFEPERSO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoRefePersoTableCell(this.tiporefepersosForeignKey,this.referenciapersonalConstantesFunciones.resaltaridvalorclientereferenciapersonalReferenciaPersonal,this,this.referenciapersonalConstantesFunciones.activaridvalorclientereferenciapersonalReferenciaPersonal));
			tableColumn.setCellEditor(new TipoRefePersoTableCell(this.tiporefepersosForeignKey,this.referenciapersonalConstantesFunciones.resaltaridvalorclientereferenciapersonalReferenciaPersonal,this,this.referenciapersonalConstantesFunciones.activaridvalorclientereferenciapersonalReferenciaPersonal,true,"idvalorclientereferenciapersonalReferenciaPersonal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_IDPAIS));

		if(this.referenciapersonalConstantesFunciones.mostrarid_paisReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.referenciapersonalConstantesFunciones.resaltarid_paisReferenciaPersonal,this,this.referenciapersonalConstantesFunciones.activarid_paisReferenciaPersonal));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.referenciapersonalConstantesFunciones.resaltarid_paisReferenciaPersonal,this,this.referenciapersonalConstantesFunciones.activarid_paisReferenciaPersonal,true,"id_paisReferenciaPersonal","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_IDCIUDAD));

		if(this.referenciapersonalConstantesFunciones.mostraridciudadReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_IDCIUDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CiudadTableCell(this.ciudadsForeignKey,this.referenciapersonalConstantesFunciones.resaltaridciudadReferenciaPersonal,this,this.referenciapersonalConstantesFunciones.activaridciudadReferenciaPersonal));
			tableColumn.setCellEditor(new CiudadTableCell(this.ciudadsForeignKey,this.referenciapersonalConstantesFunciones.resaltaridciudadReferenciaPersonal,this,this.referenciapersonalConstantesFunciones.activaridciudadReferenciaPersonal,true,"idciudadReferenciaPersonal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE));

		if(this.referenciapersonalConstantesFunciones.mostrarnombreReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciapersonalConstantesFunciones.resaltarnombreReferenciaPersonal,this.referenciapersonalConstantesFunciones.activarnombreReferenciaPersonal,this,true,"nombreReferenciaPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciapersonalConstantesFunciones.resaltarnombreReferenciaPersonal,this.referenciapersonalConstantesFunciones.activarnombreReferenciaPersonal,this,true,"nombreReferenciaPersonal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION));

		if(this.referenciapersonalConstantesFunciones.mostraridentificacionReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciapersonalConstantesFunciones.resaltaridentificacionReferenciaPersonal,this.referenciapersonalConstantesFunciones.activaridentificacionReferenciaPersonal,this,true,"identificacionReferenciaPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciapersonalConstantesFunciones.resaltaridentificacionReferenciaPersonal,this.referenciapersonalConstantesFunciones.activaridentificacionReferenciaPersonal,this,true,"identificacionReferenciaPersonal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO));

		if(this.referenciapersonalConstantesFunciones.mostrarfecha_nacimientoReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.referenciapersonalConstantesFunciones.resaltarfecha_nacimientoReferenciaPersonal,this.referenciapersonalConstantesFunciones.activarfecha_nacimientoReferenciaPersonal,this,true,"fecha_nacimientoReferenciaPersonal","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.referenciapersonalConstantesFunciones.resaltarfecha_nacimientoReferenciaPersonal,this.referenciapersonalConstantesFunciones.activarfecha_nacimientoReferenciaPersonal,this,true,"fecha_nacimientoReferenciaPersonal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION));

		if(this.referenciapersonalConstantesFunciones.mostrardireccionReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciapersonalConstantesFunciones.resaltardireccionReferenciaPersonal,this.referenciapersonalConstantesFunciones.activardireccionReferenciaPersonal,this,true,"direccionReferenciaPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciapersonalConstantesFunciones.resaltardireccionReferenciaPersonal,this.referenciapersonalConstantesFunciones.activardireccionReferenciaPersonal,this,true,"direccionReferenciaPersonal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO));

		if(this.referenciapersonalConstantesFunciones.mostrartelefonoReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciapersonalConstantesFunciones.resaltartelefonoReferenciaPersonal,this.referenciapersonalConstantesFunciones.activartelefonoReferenciaPersonal,this,true,"telefonoReferenciaPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciapersonalConstantesFunciones.resaltartelefonoReferenciaPersonal,this.referenciapersonalConstantesFunciones.activartelefonoReferenciaPersonal,this,true,"telefonoReferenciaPersonal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL));

		if(this.referenciapersonalConstantesFunciones.mostrartelefonomovilReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciapersonalConstantesFunciones.resaltartelefonomovilReferenciaPersonal,this.referenciapersonalConstantesFunciones.activartelefonomovilReferenciaPersonal,this,true,"telefonomovilReferenciaPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciapersonalConstantesFunciones.resaltartelefonomovilReferenciaPersonal,this.referenciapersonalConstantesFunciones.activartelefonomovilReferenciaPersonal,this,true,"telefonomovilReferenciaPersonal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA));

		if(this.referenciapersonalConstantesFunciones.mostrartelefonocodigoareaReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciapersonalConstantesFunciones.resaltartelefonocodigoareaReferenciaPersonal,this.referenciapersonalConstantesFunciones.activartelefonocodigoareaReferenciaPersonal,this,true,"telefonocodigoareaReferenciaPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciapersonalConstantesFunciones.resaltartelefonocodigoareaReferenciaPersonal,this.referenciapersonalConstantesFunciones.activartelefonocodigoareaReferenciaPersonal,this,true,"telefonocodigoareaReferenciaPersonal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA));

		if(this.referenciapersonalConstantesFunciones.mostrarpreferenciaReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciapersonalConstantesFunciones.resaltarpreferenciaReferenciaPersonal,this.referenciapersonalConstantesFunciones.activarpreferenciaReferenciaPersonal,this,true,"preferenciaReferenciaPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciapersonalConstantesFunciones.resaltarpreferenciaReferenciaPersonal,this.referenciapersonalConstantesFunciones.activarpreferenciaReferenciaPersonal,this,true,"preferenciaReferenciaPersonal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_EMAIL));

		if(this.referenciapersonalConstantesFunciones.mostraremailReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_EMAIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciapersonalConstantesFunciones.resaltaremailReferenciaPersonal,this.referenciapersonalConstantesFunciones.activaremailReferenciaPersonal,this,true,"emailReferenciaPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciapersonalConstantesFunciones.resaltaremailReferenciaPersonal,this.referenciapersonalConstantesFunciones.activaremailReferenciaPersonal,this,true,"emailReferenciaPersonal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION));

		if(this.referenciapersonalConstantesFunciones.mostrarobservacionReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciapersonalConstantesFunciones.resaltarobservacionReferenciaPersonal,this.referenciapersonalConstantesFunciones.activarobservacionReferenciaPersonal,this,true,"observacionReferenciaPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciapersonalConstantesFunciones.resaltarobservacionReferenciaPersonal,this.referenciapersonalConstantesFunciones.activarobservacionReferenciaPersonal,this,true,"observacionReferenciaPersonal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO));

		if(this.referenciapersonalConstantesFunciones.mostraresta_trabajandoReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.referenciapersonalConstantesFunciones.resaltaresta_trabajandoReferenciaPersonal,this.referenciapersonalConstantesFunciones.activaresta_trabajandoReferenciaPersonal));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.referenciapersonalConstantesFunciones.resaltaresta_trabajandoReferenciaPersonal,this.referenciapersonalConstantesFunciones.activaresta_trabajandoReferenciaPersonal,this,true,"esta_trabajandoReferenciaPersonal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO));

		if(this.referenciapersonalConstantesFunciones.mostrarempresa_trabajoReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciapersonalConstantesFunciones.resaltarempresa_trabajoReferenciaPersonal,this.referenciapersonalConstantesFunciones.activarempresa_trabajoReferenciaPersonal,this,true,"empresa_trabajoReferenciaPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciapersonalConstantesFunciones.resaltarempresa_trabajoReferenciaPersonal,this.referenciapersonalConstantesFunciones.activarempresa_trabajoReferenciaPersonal,this,true,"empresa_trabajoReferenciaPersonal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO));

		if(this.referenciapersonalConstantesFunciones.mostrardireccion_trabajoReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciapersonalConstantesFunciones.resaltardireccion_trabajoReferenciaPersonal,this.referenciapersonalConstantesFunciones.activardireccion_trabajoReferenciaPersonal,this,true,"direccion_trabajoReferenciaPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciapersonalConstantesFunciones.resaltardireccion_trabajoReferenciaPersonal,this.referenciapersonalConstantesFunciones.activardireccion_trabajoReferenciaPersonal,this,true,"direccion_trabajoReferenciaPersonal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO));

		if(this.referenciapersonalConstantesFunciones.mostrartelefono_trabajoReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciapersonalConstantesFunciones.resaltartelefono_trabajoReferenciaPersonal,this.referenciapersonalConstantesFunciones.activartelefono_trabajoReferenciaPersonal,this,true,"telefono_trabajoReferenciaPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciapersonalConstantesFunciones.resaltartelefono_trabajoReferenciaPersonal,this.referenciapersonalConstantesFunciones.activartelefono_trabajoReferenciaPersonal,this,true,"telefono_trabajoReferenciaPersonal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO));

		if(this.referenciapersonalConstantesFunciones.mostraresactivoReferenciaPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.referenciapersonalConstantesFunciones.resaltaresactivoReferenciaPersonal,this.referenciapersonalConstantesFunciones.activaresactivoReferenciaPersonal));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.referenciapersonalConstantesFunciones.resaltaresactivoReferenciaPersonal,this.referenciapersonalConstantesFunciones.activaresactivoReferenciaPersonal,this,true,"esactivoReferenciaPersonal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ReferenciaPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.referenciapersonalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.referenciapersonalSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosReferenciaPersonal.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.referenciapersonalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.referenciapersonalSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosReferenciaPersonal.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarReferenciaPersonal && this.isPermisoGuardarCambiosReferenciaPersonal) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.referenciapersonalSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.referenciapersonalSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosReferenciaPersonal.addColumn(tableColumn);
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
			
			this.jTableDatosReferenciaPersonal.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarReferenciaPersonal && this.isPermisoGuardarCambiosReferenciaPersonal) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarReferenciaPersonal && this.isPermisoGuardarCambiosReferenciaPersonal) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosReferenciaPersonal.moveColumn(this.jTableDatosReferenciaPersonal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosReferenciaPersonal.moveColumn(this.jTableDatosReferenciaPersonal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosReferenciaPersonal.moveColumn(this.jTableDatosReferenciaPersonal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosReferenciaPersonal.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosReferenciaPersonal.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosReferenciaPersonal,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosReferenciaPersonal.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosReferenciaPersonal.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosReferenciaPersonal.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosReferenciaPersonal.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=referenciapersonalLogic.getReferenciaPersonals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=referenciapersonals.size()-1;
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
		//this.jTableDatosReferenciaPersonal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosReferenciaPersonal();
			
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
				
				//this.isEsNuevoReferenciaPersonal=false;
					
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
			
				if(this.referenciapersonalSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormReferenciaPersonal==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosReferenciaPersonal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosReferenciaPersonal.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.referenciapersonal.getsType().equals("DUPLICADO")
				   || this.referenciapersonal.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoReferenciaPersonal=true;
				
				} else {
					this.isEsNuevoReferenciaPersonal=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
					if(this.referenciapersonal.getId()>=0 && !this.referenciapersonal.getIsNew()) {						
						this.isEsNuevoReferenciaPersonal=false;
						
					} else {
						this.isEsNuevoReferenciaPersonal=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoReferenciaPersonal(esRelaciones);						
				
				this.seleccionarReferenciaPersonal(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.referenciapersonal.getId()<0) {
					this.isEsNuevoReferenciaPersonal=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarReferenciaPersonal(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarReferenciaPersonal(evt,rowIndex);
				}	
				
				if(this.referenciapersonalSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ReferenciaPersonal: " + this.dDif); 
					}
				}								
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarReferenciaPersonal(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.referenciapersonal)) {
					if(this.referenciapersonal.getId()>0) {
						this.referenciapersonal.setIsDeleted(true);
						
						this.referenciapersonalsEliminados.add(this.referenciapersonal);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.referenciapersonalLogic.getReferenciaPersonals().remove(this.referenciapersonal);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.referenciapersonals.remove(this.referenciapersonal);				
					}
					
					
					((ReferenciaPersonalModel) this.jTableDatosReferenciaPersonal.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaReferenciaPersonal(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarReferenciaPersonal(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoReferenciaPersonal) {
			
			if(this.jInternalFrameDetalleFormReferenciaPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosReferenciaPersonal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosReferenciaPersonal.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioReferenciaPersonal(this.referenciapersonal);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.referenciapersonalConstantesFunciones.cargarid_empresaReferenciaPersonal || this.referenciapersonalConstantesFunciones.event_dependid_empresaReferenciaPersonal) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.referenciapersonal.getid_empresa());
									//this.inicializarActualizarBindingReferenciaPersonal(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(referenciapersonal.getEmpresa()!=null) {
							this.empresasForeignKey.add(referenciapersonal.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.referenciapersonal.getid_empresa(),false,"Formulario");

					//Cliente
					if(!this.referenciapersonalConstantesFunciones.cargaridclienteReferenciaPersonal || this.referenciapersonalConstantesFunciones.event_dependidclienteReferenciaPersonal) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.referenciapersonal.getidcliente());
									//this.inicializarActualizarBindingReferenciaPersonal(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(referenciapersonal.getCliente()!=null) {
							this.clientesForeignKey.add(referenciapersonal.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.referenciapersonal.getidcliente(),false,"Formulario");

					//TipoRefePerso
					if(!this.referenciapersonalConstantesFunciones.cargaridvalorclientereferenciapersonalReferenciaPersonal || this.referenciapersonalConstantesFunciones.event_dependidvalorclientereferenciapersonalReferenciaPersonal) {
						//this.cargarCombosTipoRefePersosForeignKeyLista(" where id="+this.referenciapersonal.getidvalorclientereferenciapersonal());
									//this.inicializarActualizarBindingReferenciaPersonal(false,false);
						this.tiporefepersosForeignKey=new ArrayList<TipoRefePerso>();

						if(referenciapersonal.getTipoRefePerso()!=null) {
							this.tiporefepersosForeignKey.add(referenciapersonal.getTipoRefePerso());
						}

						this.addItemDefectoCombosForeignKeyTipoRefePerso();
						this.cargarCombosFrameTipoRefePersosForeignKey("Todos");
					}
					this.setActualTipoRefePersoForeignKey(this.referenciapersonal.getidvalorclientereferenciapersonal(),false,"Formulario");

					//Pais
					if(!this.referenciapersonalConstantesFunciones.cargarid_paisReferenciaPersonal || this.referenciapersonalConstantesFunciones.event_dependid_paisReferenciaPersonal) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.referenciapersonal.getid_pais());
									//this.inicializarActualizarBindingReferenciaPersonal(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(referenciapersonal.getPais()!=null) {
							this.paissForeignKey.add(referenciapersonal.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.referenciapersonal.getid_pais(),false,"Formulario");

					//Ciudad
					if(!this.referenciapersonalConstantesFunciones.cargaridciudadReferenciaPersonal || this.referenciapersonalConstantesFunciones.event_dependidciudadReferenciaPersonal) {
						//this.cargarCombosCiudadsForeignKeyLista(" where id="+this.referenciapersonal.getidciudad());
									//this.inicializarActualizarBindingReferenciaPersonal(false,false);
						this.ciudadsForeignKey=new ArrayList<Ciudad>();

						if(referenciapersonal.getCiudad()!=null) {
							this.ciudadsForeignKey.add(referenciapersonal.getCiudad());
						}

						this.addItemDefectoCombosForeignKeyCiudad();
						this.cargarCombosFrameCiudadsForeignKey("Todos");
					}
					this.setActualCiudadForeignKey(this.referenciapersonal.getidciudad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesReferenciaPersonal("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesReferenciaPersonal(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReferenciaPersonal() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoReferenciaPersonal(ReferenciaPersonal referenciapersonal) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoReferenciaPersonal(referenciapersonal,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoReferenciaPersonal(ReferenciaPersonal referenciapersonal,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioReferenciaPersonal(referenciapersonal);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyReferenciaPersonal(referenciapersonal,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyReferenciaPersonal(referenciapersonal);
	}
	
	public void setVariablesObjetoActualToFormularioReferenciaPersonal(ReferenciaPersonal referenciapersonal) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormReferenciaPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidReferenciaPersonal.setText(referenciapersonal.getId().toString());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreanombreReferenciaPersonal.setText(referenciapersonal.getnombre());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextFieldidentificacionReferenciaPersonal.setText(referenciapersonal.getidentificacion());
			this.jInternalFrameDetalleFormReferenciaPersonal.jDateChooserfecha_nacimientoReferenciaPersonal.setDate(referenciapersonal.getfecha_nacimiento());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreadireccionReferenciaPersonal.setText(referenciapersonal.getdireccion());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefonoReferenciaPersonal.setText(referenciapersonal.gettelefono());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefonomovilReferenciaPersonal.setText(referenciapersonal.gettelefonomovil());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextFieldtelefonocodigoareaReferenciaPersonal.setText(referenciapersonal.gettelefonocodigoarea());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreapreferenciaReferenciaPersonal.setText(referenciapersonal.getpreferencia());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaemailReferenciaPersonal.setText(referenciapersonal.getemail());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaobservacionReferenciaPersonal.setText(referenciapersonal.getobservacion());
			this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesta_trabajandoReferenciaPersonal.setSelected(referenciapersonal.getesta_trabajando());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaempresa_trabajoReferenciaPersonal.setText(referenciapersonal.getempresa_trabajo());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreadireccion_trabajoReferenciaPersonal.setText(referenciapersonal.getdireccion_trabajo());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefono_trabajoReferenciaPersonal.setText(referenciapersonal.gettelefono_trabajo());
			this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesactivoReferenciaPersonal.setSelected(referenciapersonal.getesactivo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ReferenciaPersonal referenciapersonalLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,referenciapersonalLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ReferenciaPersonal referenciapersonalLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				referenciapersonalLocal=this.referenciapersonal;
			} else {
				referenciapersonalLocal=this.referenciapersonalAnterior;
			}
		}
		
		if(this.permiteMantenimiento(referenciapersonalLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoReferenciaPersonal(referenciapersonalLocal,true);
					
					if(referenciapersonalSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(referenciapersonalLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(referenciapersonalLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoReferenciaPersonal(ReferenciaPersonal referenciapersonal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualReferenciaPersonal(referenciapersonal,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(referenciapersonal);
	}
	
	public void setVariablesFormularioToObjetoActualReferenciaPersonal(ReferenciaPersonal referenciapersonal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualReferenciaPersonal(referenciapersonal,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualReferenciaPersonal(ReferenciaPersonal referenciapersonal,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormReferenciaPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidReferenciaPersonal.getText()==null || this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidReferenciaPersonal.getText()=="" || this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidReferenciaPersonal.getText()=="Id") {
				this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidReferenciaPersonal.setText("0");
			}

			if(conColumnasBase) {referenciapersonal.setId(Long.parseLong(this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidReferenciaPersonal.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaPersonalConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelIdReferenciaPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciapersonal.setnombre(this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreanombreReferenciaPersonal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelnombreReferenciaPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciapersonal.setidentificacion(this.jInternalFrameDetalleFormReferenciaPersonal.jTextFieldidentificacionReferenciaPersonal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidentificacionReferenciaPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciapersonal.setfecha_nacimiento(this.jInternalFrameDetalleFormReferenciaPersonal.jDateChooserfecha_nacimientoReferenciaPersonal.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelfecha_nacimientoReferenciaPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciapersonal.setdireccion(this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreadireccionReferenciaPersonal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeldireccionReferenciaPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciapersonal.settelefono(this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefonoReferenciaPersonal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeltelefonoReferenciaPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciapersonal.settelefonomovil(this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefonomovilReferenciaPersonal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeltelefonomovilReferenciaPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciapersonal.settelefonocodigoarea(this.jInternalFrameDetalleFormReferenciaPersonal.jTextFieldtelefonocodigoareaReferenciaPersonal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeltelefonocodigoareaReferenciaPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciapersonal.setpreferencia(this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreapreferenciaReferenciaPersonal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelpreferenciaReferenciaPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciapersonal.setemail(this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaemailReferenciaPersonal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaPersonalConstantesFunciones.LABEL_EMAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelemailReferenciaPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciapersonal.setobservacion(this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaobservacionReferenciaPersonal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelobservacionReferenciaPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciapersonal.setesta_trabajando(this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesta_trabajandoReferenciaPersonal.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelesta_trabajandoReferenciaPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciapersonal.setempresa_trabajo(this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaempresa_trabajoReferenciaPersonal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelempresa_trabajoReferenciaPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciapersonal.setdireccion_trabajo(this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreadireccion_trabajoReferenciaPersonal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeldireccion_trabajoReferenciaPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciapersonal.settelefono_trabajo(this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefono_trabajoReferenciaPersonal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabeltelefono_trabajoReferenciaPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciapersonal.setesactivo(this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesactivoReferenciaPersonal.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaPersonal.jLabelesactivoReferenciaPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualReferenciaPersonal(ReferenciaPersonal referenciapersonalBean,ReferenciaPersonal referenciapersonal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && referenciapersonalBean.getidcliente()!=null && !referenciapersonalBean.getidcliente().equals(-1L))) {referenciapersonal.setidcliente(referenciapersonalBean.getidcliente());}
			if(conDefault || (!conDefault && referenciapersonalBean.getidvalorclientereferenciapersonal()!=null && !referenciapersonalBean.getidvalorclientereferenciapersonal().equals(-1L))) {referenciapersonal.setidvalorclientereferenciapersonal(referenciapersonalBean.getidvalorclientereferenciapersonal());}
			if(conDefault || (!conDefault && referenciapersonalBean.getid_pais()!=null && !referenciapersonalBean.getid_pais().equals(-1L))) {referenciapersonal.setid_pais(referenciapersonalBean.getid_pais());}
			if(conDefault || (!conDefault && referenciapersonalBean.getidciudad()!=null && !referenciapersonalBean.getidciudad().equals(-1L))) {referenciapersonal.setidciudad(referenciapersonalBean.getidciudad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosReferenciaPersonal(ReferenciaPersonal referenciapersonalOrigen,ReferenciaPersonal referenciapersonal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && referenciapersonalOrigen.getId()!=null && !referenciapersonalOrigen.getId().equals(0L))) {referenciapersonal.setId(referenciapersonalOrigen.getId());}}
			if(conDefault || (!conDefault && referenciapersonalOrigen.getidcliente()!=null && !referenciapersonalOrigen.getidcliente().equals(-1L))) {referenciapersonal.setidcliente(referenciapersonalOrigen.getidcliente());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.getidvalorclientereferenciapersonal()!=null && !referenciapersonalOrigen.getidvalorclientereferenciapersonal().equals(-1L))) {referenciapersonal.setidvalorclientereferenciapersonal(referenciapersonalOrigen.getidvalorclientereferenciapersonal());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.getid_pais()!=null && !referenciapersonalOrigen.getid_pais().equals(-1L))) {referenciapersonal.setid_pais(referenciapersonalOrigen.getid_pais());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.getidciudad()!=null && !referenciapersonalOrigen.getidciudad().equals(-1L))) {referenciapersonal.setidciudad(referenciapersonalOrigen.getidciudad());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.getnombre()!=null && !referenciapersonalOrigen.getnombre().equals(""))) {referenciapersonal.setnombre(referenciapersonalOrigen.getnombre());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.getidentificacion()!=null && !referenciapersonalOrigen.getidentificacion().equals(""))) {referenciapersonal.setidentificacion(referenciapersonalOrigen.getidentificacion());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.getfecha_nacimiento()!=null && !referenciapersonalOrigen.getfecha_nacimiento().equals(new Date()))) {referenciapersonal.setfecha_nacimiento(referenciapersonalOrigen.getfecha_nacimiento());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.getdireccion()!=null && !referenciapersonalOrigen.getdireccion().equals(""))) {referenciapersonal.setdireccion(referenciapersonalOrigen.getdireccion());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.gettelefono()!=null && !referenciapersonalOrigen.gettelefono().equals(""))) {referenciapersonal.settelefono(referenciapersonalOrigen.gettelefono());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.gettelefonomovil()!=null && !referenciapersonalOrigen.gettelefonomovil().equals(""))) {referenciapersonal.settelefonomovil(referenciapersonalOrigen.gettelefonomovil());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.gettelefonocodigoarea()!=null && !referenciapersonalOrigen.gettelefonocodigoarea().equals(""))) {referenciapersonal.settelefonocodigoarea(referenciapersonalOrigen.gettelefonocodigoarea());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.getpreferencia()!=null && !referenciapersonalOrigen.getpreferencia().equals(""))) {referenciapersonal.setpreferencia(referenciapersonalOrigen.getpreferencia());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.getemail()!=null && !referenciapersonalOrigen.getemail().equals(""))) {referenciapersonal.setemail(referenciapersonalOrigen.getemail());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.getobservacion()!=null && !referenciapersonalOrigen.getobservacion().equals(""))) {referenciapersonal.setobservacion(referenciapersonalOrigen.getobservacion());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.getesta_trabajando()!=null && !referenciapersonalOrigen.getesta_trabajando().equals(false))) {referenciapersonal.setesta_trabajando(referenciapersonalOrigen.getesta_trabajando());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.getempresa_trabajo()!=null && !referenciapersonalOrigen.getempresa_trabajo().equals(""))) {referenciapersonal.setempresa_trabajo(referenciapersonalOrigen.getempresa_trabajo());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.getdireccion_trabajo()!=null && !referenciapersonalOrigen.getdireccion_trabajo().equals(""))) {referenciapersonal.setdireccion_trabajo(referenciapersonalOrigen.getdireccion_trabajo());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.gettelefono_trabajo()!=null && !referenciapersonalOrigen.gettelefono_trabajo().equals(""))) {referenciapersonal.settelefono_trabajo(referenciapersonalOrigen.gettelefono_trabajo());}
			if(conDefault || (!conDefault && referenciapersonalOrigen.getesactivo()!=null && !referenciapersonalOrigen.getesactivo().equals(false))) {referenciapersonal.setesactivo(referenciapersonalOrigen.getesactivo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioReferenciaPersonal(ReferenciaPersonal referenciapersonal) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidReferenciaPersonal.setText(referenciapersonal.getId().toString());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreanombreReferenciaPersonal.setText(referenciapersonal.getnombre());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextFieldidentificacionReferenciaPersonal.setText(referenciapersonal.getidentificacion());
			this.jInternalFrameDetalleFormReferenciaPersonal.jDateChooserfecha_nacimientoReferenciaPersonal.setDate(referenciapersonal.getfecha_nacimiento());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreadireccionReferenciaPersonal.setText(referenciapersonal.getdireccion());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefonoReferenciaPersonal.setText(referenciapersonal.gettelefono());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefonomovilReferenciaPersonal.setText(referenciapersonal.gettelefonomovil());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextFieldtelefonocodigoareaReferenciaPersonal.setText(referenciapersonal.gettelefonocodigoarea());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreapreferenciaReferenciaPersonal.setText(referenciapersonal.getpreferencia());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaemailReferenciaPersonal.setText(referenciapersonal.getemail());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaobservacionReferenciaPersonal.setText(referenciapersonal.getobservacion());
			this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesta_trabajandoReferenciaPersonal.setSelected(referenciapersonal.getesta_trabajando());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaempresa_trabajoReferenciaPersonal.setText(referenciapersonal.getempresa_trabajo());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreadireccion_trabajoReferenciaPersonal.setText(referenciapersonal.getdireccion_trabajo());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefono_trabajoReferenciaPersonal.setText(referenciapersonal.gettelefono_trabajo());
			this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesactivoReferenciaPersonal.setSelected(referenciapersonal.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioReferenciaPersonal(ReferenciaPersonalBean referenciapersonalBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidReferenciaPersonal.setText(referenciapersonalBean.getId().toString());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreanombreReferenciaPersonal.setText(referenciapersonalBean.getnombre());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextFieldidentificacionReferenciaPersonal.setText(referenciapersonalBean.getidentificacion());
			this.jInternalFrameDetalleFormReferenciaPersonal.jDateChooserfecha_nacimientoReferenciaPersonal.setDate(referenciapersonalBean.getfecha_nacimiento());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreadireccionReferenciaPersonal.setText(referenciapersonalBean.getdireccion());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefonoReferenciaPersonal.setText(referenciapersonalBean.gettelefono());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefonomovilReferenciaPersonal.setText(referenciapersonalBean.gettelefonomovil());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextFieldtelefonocodigoareaReferenciaPersonal.setText(referenciapersonalBean.gettelefonocodigoarea());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreapreferenciaReferenciaPersonal.setText(referenciapersonalBean.getpreferencia());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaemailReferenciaPersonal.setText(referenciapersonalBean.getemail());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaobservacionReferenciaPersonal.setText(referenciapersonalBean.getobservacion());
			this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesta_trabajandoReferenciaPersonal.setSelected(referenciapersonalBean.getesta_trabajando());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaempresa_trabajoReferenciaPersonal.setText(referenciapersonalBean.getempresa_trabajo());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreadireccion_trabajoReferenciaPersonal.setText(referenciapersonalBean.getdireccion_trabajo());
			this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefono_trabajoReferenciaPersonal.setText(referenciapersonalBean.gettelefono_trabajo());
			this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesactivoReferenciaPersonal.setSelected(referenciapersonalBean.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanReferenciaPersonal(ReferenciaPersonalParameterReturnGeneral referenciapersonalReturnGeneral,ReferenciaPersonalBean referenciapersonalBean,Boolean conDefault) throws Exception { 
		try {
			ReferenciaPersonal referenciapersonalLocal=new ReferenciaPersonal();
			
			referenciapersonalLocal=referenciapersonalReturnGeneral.getReferenciaPersonal();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && referenciapersonalLocal.getId()!=null && !referenciapersonalLocal.getId().equals(0L))) {referenciapersonalBean.setId(referenciapersonalLocal.getId());}}
			if(conDefault || (!conDefault && referenciapersonalLocal.getidcliente()!=null && !referenciapersonalLocal.getidcliente().equals(-1L))) {referenciapersonalBean.setidcliente(referenciapersonalLocal.getidcliente());}
			if(conDefault || (!conDefault && referenciapersonalLocal.getidvalorclientereferenciapersonal()!=null && !referenciapersonalLocal.getidvalorclientereferenciapersonal().equals(-1L))) {referenciapersonalBean.setidvalorclientereferenciapersonal(referenciapersonalLocal.getidvalorclientereferenciapersonal());}
			if(conDefault || (!conDefault && referenciapersonalLocal.getid_pais()!=null && !referenciapersonalLocal.getid_pais().equals(-1L))) {referenciapersonalBean.setid_pais(referenciapersonalLocal.getid_pais());}
			if(conDefault || (!conDefault && referenciapersonalLocal.getidciudad()!=null && !referenciapersonalLocal.getidciudad().equals(-1L))) {referenciapersonalBean.setidciudad(referenciapersonalLocal.getidciudad());}
			if(conDefault || (!conDefault && referenciapersonalLocal.getnombre()!=null && !referenciapersonalLocal.getnombre().equals(""))) {referenciapersonalBean.setnombre(referenciapersonalLocal.getnombre());}
			if(conDefault || (!conDefault && referenciapersonalLocal.getidentificacion()!=null && !referenciapersonalLocal.getidentificacion().equals(""))) {referenciapersonalBean.setidentificacion(referenciapersonalLocal.getidentificacion());}
			if(conDefault || (!conDefault && referenciapersonalLocal.getfecha_nacimiento()!=null && !referenciapersonalLocal.getfecha_nacimiento().equals(new Date()))) {referenciapersonalBean.setfecha_nacimiento(referenciapersonalLocal.getfecha_nacimiento());}
			if(conDefault || (!conDefault && referenciapersonalLocal.getdireccion()!=null && !referenciapersonalLocal.getdireccion().equals(""))) {referenciapersonalBean.setdireccion(referenciapersonalLocal.getdireccion());}
			if(conDefault || (!conDefault && referenciapersonalLocal.gettelefono()!=null && !referenciapersonalLocal.gettelefono().equals(""))) {referenciapersonalBean.settelefono(referenciapersonalLocal.gettelefono());}
			if(conDefault || (!conDefault && referenciapersonalLocal.gettelefonomovil()!=null && !referenciapersonalLocal.gettelefonomovil().equals(""))) {referenciapersonalBean.settelefonomovil(referenciapersonalLocal.gettelefonomovil());}
			if(conDefault || (!conDefault && referenciapersonalLocal.gettelefonocodigoarea()!=null && !referenciapersonalLocal.gettelefonocodigoarea().equals(""))) {referenciapersonalBean.settelefonocodigoarea(referenciapersonalLocal.gettelefonocodigoarea());}
			if(conDefault || (!conDefault && referenciapersonalLocal.getpreferencia()!=null && !referenciapersonalLocal.getpreferencia().equals(""))) {referenciapersonalBean.setpreferencia(referenciapersonalLocal.getpreferencia());}
			if(conDefault || (!conDefault && referenciapersonalLocal.getemail()!=null && !referenciapersonalLocal.getemail().equals(""))) {referenciapersonalBean.setemail(referenciapersonalLocal.getemail());}
			if(conDefault || (!conDefault && referenciapersonalLocal.getobservacion()!=null && !referenciapersonalLocal.getobservacion().equals(""))) {referenciapersonalBean.setobservacion(referenciapersonalLocal.getobservacion());}
			if(conDefault || (!conDefault && referenciapersonalLocal.getesta_trabajando()!=null && !referenciapersonalLocal.getesta_trabajando().equals(false))) {referenciapersonalBean.setesta_trabajando(referenciapersonalLocal.getesta_trabajando());}
			if(conDefault || (!conDefault && referenciapersonalLocal.getempresa_trabajo()!=null && !referenciapersonalLocal.getempresa_trabajo().equals(""))) {referenciapersonalBean.setempresa_trabajo(referenciapersonalLocal.getempresa_trabajo());}
			if(conDefault || (!conDefault && referenciapersonalLocal.getdireccion_trabajo()!=null && !referenciapersonalLocal.getdireccion_trabajo().equals(""))) {referenciapersonalBean.setdireccion_trabajo(referenciapersonalLocal.getdireccion_trabajo());}
			if(conDefault || (!conDefault && referenciapersonalLocal.gettelefono_trabajo()!=null && !referenciapersonalLocal.gettelefono_trabajo().equals(""))) {referenciapersonalBean.settelefono_trabajo(referenciapersonalLocal.gettelefono_trabajo());}
			if(conDefault || (!conDefault && referenciapersonalLocal.getesactivo()!=null && !referenciapersonalLocal.getesactivo().equals(false))) {referenciapersonalBean.setesactivo(referenciapersonalLocal.getesactivo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxReferenciaPersonalGenerico(Long idReferenciaPersonalSeleccionado,JComboBox jComboBoxReferenciaPersonal,List<ReferenciaPersonal> referenciapersonalsLocal)throws Exception {
		try {
			ReferenciaPersonal  referenciapersonalTemp=null;

			for(ReferenciaPersonal referenciapersonalAux:referenciapersonalsLocal) {
				if(referenciapersonalAux.getId()!=null && referenciapersonalAux.getId().equals(idReferenciaPersonalSeleccionado)) {
					referenciapersonalTemp=referenciapersonalAux;
					break;
				}
			}

			jComboBoxReferenciaPersonal.setSelectedItem(referenciapersonalTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxReferenciaPersonalGenerico(JComboBox jComboBoxReferenciaPersonal,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxReferenciaPersonal.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxReferenciaPersonal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxReferenciaPersonal.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxReferenciaPersonal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			referenciapersonal=(ReferenciaPersonal) referenciapersonalLogic.getReferenciaPersonals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			referenciapersonal =(ReferenciaPersonal) referenciapersonals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!referenciapersonal.getIsNew() && !referenciapersonal.getIsChanged() && !referenciapersonal.getIsDeleted()) {
				sDescripcion=referenciapersonal.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=referenciapersonal.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!referenciapersonal.getIsNew() && !referenciapersonal.getIsChanged() && !referenciapersonal.getIsDeleted()) {
				sDescripcion=referenciapersonal.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=referenciapersonal.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoRefePerso")) {
			//sDescripcion=this.getActualTipoRefePersoForeignKeyDescripcion((Long)value);
			if(!referenciapersonal.getIsNew() && !referenciapersonal.getIsChanged() && !referenciapersonal.getIsDeleted()) {
				sDescripcion=referenciapersonal.gettiporefeperso_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRefePersoForeignKeyDescripcion((Long)value);
				sDescripcion=referenciapersonal.gettiporefeperso_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!referenciapersonal.getIsNew() && !referenciapersonal.getIsChanged() && !referenciapersonal.getIsDeleted()) {
				sDescripcion=referenciapersonal.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=referenciapersonal.getpais_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!referenciapersonal.getIsNew() && !referenciapersonal.getIsChanged() && !referenciapersonal.getIsDeleted()) {
				sDescripcion=referenciapersonal.getciudad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=referenciapersonal.getciudad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ReferenciaPersonal referenciapersonalRow=new ReferenciaPersonal();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			referenciapersonalRow=(ReferenciaPersonal) referenciapersonalLogic.getReferenciaPersonals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			referenciapersonalRow=(ReferenciaPersonal) referenciapersonals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualReferenciaPersonal(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoReferenciaPersonal.setVisible((this.isVisibilidadCeldaNuevoReferenciaPersonal && this.isPermisoNuevoReferenciaPersonal));			
			this.jButtonDuplicarReferenciaPersonal.setVisible((this.isVisibilidadCeldaDuplicarReferenciaPersonal && this.isPermisoDuplicarReferenciaPersonal));			
			this.jButtonCopiarReferenciaPersonal.setVisible((this.isVisibilidadCeldaCopiarReferenciaPersonal && this.isPermisoCopiarReferenciaPersonal));
			this.jButtonVerFormReferenciaPersonal.setVisible((this.isVisibilidadCeldaVerFormReferenciaPersonal && this.isPermisoVerFormReferenciaPersonal));
			
			this.jButtonAbrirOrderByReferenciaPersonal.setVisible((this.isVisibilidadCeldaOrdenReferenciaPersonal && this.isPermisoOrdenReferenciaPersonal));			
			
			this.jButtonNuevoRelacionesReferenciaPersonal.setVisible((this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal && this.isPermisoNuevoReferenciaPersonal));			
			this.jButtonNuevoGuardarCambiosReferenciaPersonal.setVisible((this.isVisibilidadCeldaNuevoReferenciaPersonal && this.isPermisoNuevoReferenciaPersonal && this.isPermisoGuardarCambiosReferenciaPersonal));
			
			if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonModificarReferenciaPersonal.setVisible((this.isVisibilidadCeldaModificarReferenciaPersonal && this.isPermisoActualizarReferenciaPersonal));	
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonActualizarReferenciaPersonal.setVisible((this.isVisibilidadCeldaActualizarReferenciaPersonal && this.isPermisoActualizarReferenciaPersonal));	
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonEliminarReferenciaPersonal.setVisible((this.isVisibilidadCeldaEliminarReferenciaPersonal && this.isPermisoEliminarReferenciaPersonal));
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonCancelarReferenciaPersonal.setVisible(this.isVisibilidadCeldaCancelarReferenciaPersonal);							
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonGuardarCambiosReferenciaPersonal.setVisible((this.isVisibilidadCeldaGuardarReferenciaPersonal && this.isPermisoGuardarCambiosReferenciaPersonal));			
			
			}
						
			this.jButtonGuardarCambiosTablaReferenciaPersonal.setVisible((this.isVisibilidadCeldaGuardarCambiosReferenciaPersonal && this.isPermisoGuardarCambiosReferenciaPersonal));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarReferenciaPersonal.setVisible((this.isVisibilidadCeldaNuevoReferenciaPersonal && this.isPermisoNuevoReferenciaPersonal));						
			this.jButtonDuplicarToolBarReferenciaPersonal.setVisible((this.isVisibilidadCeldaDuplicarReferenciaPersonal && this.isPermisoDuplicarReferenciaPersonal));						
			this.jButtonCopiarToolBarReferenciaPersonal.setVisible((this.isVisibilidadCeldaCopiarReferenciaPersonal && this.isPermisoCopiarReferenciaPersonal));			
			this.jButtonVerFormToolBarReferenciaPersonal.setVisible((this.isVisibilidadCeldaVerFormReferenciaPersonal && this.isPermisoVerFormReferenciaPersonal));			
			this.jButtonAbrirOrderByToolBarReferenciaPersonal.setVisible((this.isVisibilidadCeldaOrdenReferenciaPersonal && this.isPermisoOrdenReferenciaPersonal));
			this.jButtonNuevoRelacionesToolBarReferenciaPersonal.setVisible((this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal && this.isPermisoNuevoReferenciaPersonal));			
			this.jButtonNuevoGuardarCambiosToolBarReferenciaPersonal.setVisible((this.isVisibilidadCeldaNuevoReferenciaPersonal && this.isPermisoNuevoReferenciaPersonal && this.isPermisoGuardarCambiosReferenciaPersonal));			
			
			if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonModificarToolBarReferenciaPersonal.setVisible((this.isVisibilidadCeldaModificarReferenciaPersonal && this.isPermisoActualizarReferenciaPersonal));	
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonActualizarToolBarReferenciaPersonal.setVisible((this.isVisibilidadCeldaActualizarReferenciaPersonal  && this.isPermisoActualizarReferenciaPersonal));	
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonEliminarToolBarReferenciaPersonal.setVisible((this.isVisibilidadCeldaEliminarReferenciaPersonal && this.isPermisoEliminarReferenciaPersonal));
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonCancelarToolBarReferenciaPersonal.setVisible(this.isVisibilidadCeldaCancelarReferenciaPersonal);				
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonGuardarCambiosToolBarReferenciaPersonal.setVisible((this.isVisibilidadCeldaGuardarReferenciaPersonal && this.isPermisoGuardarCambiosReferenciaPersonal));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarReferenciaPersonal.setVisible((this.isVisibilidadCeldaGuardarCambiosReferenciaPersonal && this.isPermisoGuardarCambiosReferenciaPersonal));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoReferenciaPersonal.setVisible((this.isVisibilidadCeldaNuevoReferenciaPersonal && this.isPermisoNuevoReferenciaPersonal));			
			this.jMenuItemDuplicarReferenciaPersonal.setVisible((this.isVisibilidadCeldaDuplicarReferenciaPersonal && this.isPermisoDuplicarReferenciaPersonal));			
			this.jMenuItemCopiarReferenciaPersonal.setVisible((this.isVisibilidadCeldaCopiarReferenciaPersonal && this.isPermisoCopiarReferenciaPersonal));			
			this.jMenuItemVerFormReferenciaPersonal.setVisible((this.isVisibilidadCeldaVerFormReferenciaPersonal && this.isPermisoVerFormReferenciaPersonal));			
			this.jMenuItemAbrirOrderByReferenciaPersonal.setVisible((this.isVisibilidadCeldaOrdenReferenciaPersonal && this.isPermisoOrdenReferenciaPersonal));			
			//this.jMenuItemMostrarOcultarReferenciaPersonal.setVisible((this.isVisibilidadCeldaOrdenReferenciaPersonal && this.isPermisoOrdenReferenciaPersonal));
			this.jMenuItemDetalleAbrirOrderByReferenciaPersonal.setVisible((this.isVisibilidadCeldaOrdenReferenciaPersonal && this.isPermisoOrdenReferenciaPersonal));			
			//this.jMenuItemDetalleMostrarOcultarReferenciaPersonal.setVisible((this.isVisibilidadCeldaOrdenReferenciaPersonal && this.isPermisoOrdenReferenciaPersonal));			
			this.jMenuItemNuevoRelacionesReferenciaPersonal.setVisible((this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal && this.isPermisoNuevoReferenciaPersonal));			
			this.jMenuItemNuevoGuardarCambiosReferenciaPersonal.setVisible((this.isVisibilidadCeldaNuevoReferenciaPersonal && this.isPermisoNuevoReferenciaPersonal && this.isPermisoGuardarCambiosReferenciaPersonal));									
			
			if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
			this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemModificarReferenciaPersonal.setVisible((this.isVisibilidadCeldaModificarReferenciaPersonal && this.isPermisoActualizarReferenciaPersonal));	
			this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemActualizarReferenciaPersonal.setVisible((this.isVisibilidadCeldaActualizarReferenciaPersonal && this.isPermisoActualizarReferenciaPersonal));	
			this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemEliminarReferenciaPersonal.setVisible((this.isVisibilidadCeldaEliminarReferenciaPersonal && this.isPermisoEliminarReferenciaPersonal));
			this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemCancelarReferenciaPersonal.setVisible(this.isVisibilidadCeldaCancelarReferenciaPersonal);				
			}
			
			this.jMenuItemGuardarCambiosReferenciaPersonal.setVisible((this.isVisibilidadCeldaGuardarReferenciaPersonal && this.isPermisoGuardarCambiosReferenciaPersonal));						
			this.jMenuItemGuardarCambiosTablaReferenciaPersonal.setVisible((this.isVisibilidadCeldaGuardarCambiosReferenciaPersonal && this.isPermisoGuardarCambiosReferenciaPersonal));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoReferenciaPersonal=this.jButtonNuevoReferenciaPersonal.isVisible();
			this.isVisibilidadCeldaDuplicarReferenciaPersonal=this.jButtonDuplicarReferenciaPersonal.isVisible();
			this.isVisibilidadCeldaCopiarReferenciaPersonal=this.jButtonCopiarReferenciaPersonal.isVisible();
			this.isVisibilidadCeldaVerFormReferenciaPersonal=this.jButtonVerFormReferenciaPersonal.isVisible();
			
			this.isVisibilidadCeldaOrdenReferenciaPersonal=this.jButtonAbrirOrderByReferenciaPersonal.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal=this.jButtonNuevoRelacionesReferenciaPersonal.isVisible();
			this.isVisibilidadCeldaModificarReferenciaPersonal=this.jButtonModificarReferenciaPersonal.isVisible();
			
			if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
			this.isVisibilidadCeldaActualizarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jButtonActualizarReferenciaPersonal.isVisible();
			this.isVisibilidadCeldaEliminarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jButtonEliminarReferenciaPersonal.isVisible();
			this.isVisibilidadCeldaCancelarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jButtonCancelarReferenciaPersonal.isVisible();
			this.isVisibilidadCeldaGuardarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jButtonGuardarCambiosReferenciaPersonal.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosReferenciaPersonal=this.jButtonGuardarCambiosTablaReferenciaPersonal.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoReferenciaPersonal=this.jButtonNuevoToolBarReferenciaPersonal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal=this.jButtonNuevoRelacionesToolBarReferenciaPersonal.isVisible();
			
			if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
			this.isVisibilidadCeldaModificarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jButtonModificarToolBarReferenciaPersonal.isVisible();
			this.isVisibilidadCeldaActualizarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jButtonActualizarToolBarReferenciaPersonal.isVisible();
			this.isVisibilidadCeldaEliminarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jButtonEliminarToolBarReferenciaPersonal.isVisible();
			this.isVisibilidadCeldaCancelarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jButtonCancelarToolBarReferenciaPersonal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarReferenciaPersonal=this.jButtonGuardarCambiosToolBarReferenciaPersonal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosReferenciaPersonal=this.jButtonGuardarCambiosTablaToolBarReferenciaPersonal.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoReferenciaPersonal=this.jMenuItemNuevoReferenciaPersonal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal=this.jMenuItemNuevoRelacionesReferenciaPersonal.isVisible();
			
			if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
			this.isVisibilidadCeldaModificarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemModificarReferenciaPersonal.isVisible();
			this.isVisibilidadCeldaActualizarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemActualizarReferenciaPersonal.isVisible();
			this.isVisibilidadCeldaEliminarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemEliminarReferenciaPersonal.isVisible();
			this.isVisibilidadCeldaCancelarReferenciaPersonal=this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemCancelarReferenciaPersonal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarReferenciaPersonal=this.jMenuItemGuardarCambiosReferenciaPersonal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosReferenciaPersonal=this.jMenuItemGuardarCambiosTablaReferenciaPersonal.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesReferenciaPersonal(Boolean esInicializar) {
		if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {			
			if(this.referenciapersonalSessionBean.getConGuardarRelaciones()) {
				//if(this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesReferenciaPersonal();
			}
			
			this.inicializarActualizarBindingBotonesManualReferenciaPersonal(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualReferenciaPersonal() {
		this.jButtonNuevoReferenciaPersonal.setVisible(this.isPermisoNuevoReferenciaPersonal);			
		this.jButtonDuplicarReferenciaPersonal.setVisible(this.isPermisoDuplicarReferenciaPersonal);			
		this.jButtonCopiarReferenciaPersonal.setVisible(this.isPermisoCopiarReferenciaPersonal);			
		this.jButtonVerFormReferenciaPersonal.setVisible(this.isPermisoVerFormReferenciaPersonal);			
		
		this.jButtonAbrirOrderByReferenciaPersonal.setVisible(this.isPermisoOrdenReferenciaPersonal);					
		
		this.jButtonNuevoRelacionesReferenciaPersonal.setVisible(this.isPermisoNuevoReferenciaPersonal);			
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonModificarReferenciaPersonal.setVisible(this.isPermisoActualizarReferenciaPersonal);	
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonActualizarReferenciaPersonal.setVisible(this.isPermisoActualizarReferenciaPersonal);	
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonEliminarReferenciaPersonal.setVisible(this.isPermisoEliminarReferenciaPersonal);
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonCancelarReferenciaPersonal.setVisible(this.isVisibilidadCeldaCancelarReferenciaPersonal);						
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonGuardarCambiosReferenciaPersonal.setVisible(this.isPermisoGuardarCambiosReferenciaPersonal);							
		}
		
		this.jButtonGuardarCambiosTablaReferenciaPersonal.setVisible(this.isPermisoActualizarReferenciaPersonal);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleReferenciaPersonal() {
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonModificarReferenciaPersonal.setVisible(this.isPermisoActualizarReferenciaPersonal);	
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonActualizarReferenciaPersonal.setVisible(this.isPermisoActualizarReferenciaPersonal);	
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonEliminarReferenciaPersonal.setVisible(this.isPermisoEliminarReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonCancelarReferenciaPersonal.setVisible(this.isVisibilidadCeldaCancelarReferenciaPersonal);							
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonGuardarCambiosReferenciaPersonal.setVisible((this.isVisibilidadCeldaGuardarReferenciaPersonal && this.isPermisoGuardarCambiosReferenciaPersonal));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosReferenciaPersonal() {
		if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualReferenciaPersonal();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesReferenciaPersonal() {
	}
	
	public void jTableDatosReferenciaPersonalListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarReferenciaPersonal(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.referenciapersonal.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaReferenciaPersonalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebReferenciaPersonal(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferenciaPersonal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferenciaPersonal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.referenciapersonalLogic.getConnexion());

				if(this.referenciapersonal.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.referenciapersonal.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferenciaPersonal=(TitledBorder)this.jScrollPanelDatosReferenciaPersonal.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderReferenciaPersonal.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.referenciapersonal.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidclienteReferenciaPersonalActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderReferenciaPersonal=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosReferenciaPersonal.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderReferenciaPersonal=(TitledBorder)this.jScrollPanelDatosReferenciaPersonal.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderReferenciaPersonal.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonidclienteReferenciaPersonalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebReferenciaPersonal(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferenciaPersonal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferenciaPersonal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.referenciapersonalLogic.getConnexion());

				if(this.referenciapersonal.getidcliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.referenciapersonal.getidcliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferenciaPersonal=(TitledBorder)this.jScrollPanelDatosReferenciaPersonal.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderReferenciaPersonal.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidclienteReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.getidcliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idcliente = "+this.referenciapersonal.getidcliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidvalorclientereferenciapersonalReferenciaPersonalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporefeperso=true;

			idTienePermisotiporefeperso=this.tienePermisosUsuarioEnPaginaWebReferenciaPersonal(TipoRefePersoConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporefeperso) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferenciaPersonal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferenciaPersonal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);

				this.tiporefepersoBeanSwingJInternalFrame=new TipoRefePersoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporefepersoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporefepersoBeanSwingJInternalFrame.getTipoRefePersoLogic().setConnexion(this.referenciapersonalLogic.getConnexion());

				if(this.referenciapersonal.getidvalorclientereferenciapersonal()!=null) {
					this.tiporefepersoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporefepersoBeanSwingJInternalFrame.setIdActual(this.referenciapersonal.getidvalorclientereferenciapersonal());
					this.tiporefepersoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporefepersoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporefepersoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRefePerso();
				}

				JInternalFrameBase jinternalFrame =this.tiporefepersoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferenciaPersonal=(TitledBorder)this.jScrollPanelDatosReferenciaPersonal.getBorder();
				TitledBorder titledBordertiporefeperso=(TitledBorder)this.tiporefepersoBeanSwingJInternalFrame.jScrollPanelDatosTipoRefePerso.getBorder();

				titledBordertiporefeperso.setTitle(titledBorderReferenciaPersonal.getTitle() + " -> Tipo Refe Perso");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidvalorclientereferenciapersonalReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.getidvalorclientereferenciapersonal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idvalorclientereferenciapersonal = "+this.referenciapersonal.getidvalorclientereferenciapersonal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisReferenciaPersonalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebReferenciaPersonal(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferenciaPersonal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferenciaPersonal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.referenciapersonalLogic.getConnexion());

				if(this.referenciapersonal.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.referenciapersonal.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferenciaPersonal=(TitledBorder)this.jScrollPanelDatosReferenciaPersonal.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderReferenciaPersonal.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.referenciapersonal.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidciudadReferenciaPersonalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebReferenciaPersonal(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferenciaPersonal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferenciaPersonal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.referenciapersonalLogic.getConnexion());

				if(this.referenciapersonal.getidciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.referenciapersonal.getidciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferenciaPersonal=(TitledBorder)this.jScrollPanelDatosReferenciaPersonal.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderReferenciaPersonal.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidciudadReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.getidciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idciudad = "+this.referenciapersonal.getidciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.referenciapersonal.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidentificacionReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.getidentificacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where identificacion like '%"+this.referenciapersonal.getidentificacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_nacimientoReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.getfecha_nacimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_nacimiento = '"+Funciones2.getStringPostgresDate(this.referenciapersonal.getfecha_nacimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.referenciapersonal.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.referenciapersonal.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonomovilReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.gettelefonomovil()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefonomovil like '%"+this.referenciapersonal.gettelefonomovil()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonocodigoareaReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.gettelefonocodigoarea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefonocodigoarea like '%"+this.referenciapersonal.gettelefonocodigoarea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpreferenciaReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.getpreferencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where preferencia like '%"+this.referenciapersonal.getpreferencia()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonemailReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.getemail()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where email like '%"+this.referenciapersonal.getemail()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonobservacionReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.getobservacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where observacion like '%"+this.referenciapersonal.getobservacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_trabajandoReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.getesta_trabajando()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_trabajando = "+this.referenciapersonal.getesta_trabajando().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonempresa_trabajoReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.getempresa_trabajo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where empresa_trabajo like '%"+this.referenciapersonal.getempresa_trabajo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccion_trabajoReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.getdireccion_trabajo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion_trabajo like '%"+this.referenciapersonal.getdireccion_trabajo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefono_trabajoReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.gettelefono_trabajo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono_trabajo like '%"+this.referenciapersonal.gettelefono_trabajo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesactivoReferenciaPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.getreferenciapersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciapersonal==null) {
						this.referenciapersonal = new ReferenciaPersonal();
					}

					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);
				}

				if(this.referenciapersonal.getesactivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esactivo = "+this.referenciapersonal.getesactivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCiudadReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferenciaPersonal(false,false);

			this.getReferenciaPersonalsFK_IdCiudad();

			this.inicializarActualizarBindingReferenciaPersonal(false);

			//if(ReferenciaPersonalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferenciaPersonal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferenciaPersonal(false,false);

			this.getReferenciaPersonalsFK_IdCliente();

			this.inicializarActualizarBindingReferenciaPersonal(false);

			//if(ReferenciaPersonalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferenciaPersonal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferenciaPersonal(false,false);

			this.getReferenciaPersonalsFK_IdEmpresa();

			this.inicializarActualizarBindingReferenciaPersonal(false);

			//if(ReferenciaPersonalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferenciaPersonal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferenciaPersonal(false,false);

			this.getReferenciaPersonalsFK_IdPais();

			this.inicializarActualizarBindingReferenciaPersonal(false);

			//if(ReferenciaPersonalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferenciaPersonal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoReferenciaPersonalReferenciaPersonalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferenciaPersonal(false,false);

			this.getReferenciaPersonalsFK_IdTipoReferenciaPersonal();

			this.inicializarActualizarBindingReferenciaPersonal(false);

			//if(ReferenciaPersonalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferenciaPersonal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciapersonalLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameReferenciaPersonal() {
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
			this.jInternalFrameDetalleFormReferenciaPersonal.setVisible(false);	    			
			this.jInternalFrameDetalleFormReferenciaPersonal.dispose();
			this.jInternalFrameDetalleFormReferenciaPersonal=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoReferenciaPersonal!=null) {
			this.jInternalFrameReporteDinamicoReferenciaPersonal.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoReferenciaPersonal.dispose();
			this.jInternalFrameReporteDinamicoReferenciaPersonal=null;
		}
		
		if(this.jInternalFrameImportacionReferenciaPersonal!=null) {
			this.jInternalFrameImportacionReferenciaPersonal.setVisible(false);	    			
			this.jInternalFrameImportacionReferenciaPersonal.dispose();
			this.jInternalFrameImportacionReferenciaPersonal=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessReferenciaPersonal();
			
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
			
			
			if(sTipo.equals("NuevoReferenciaPersonal")) {
				jButtonNuevoReferenciaPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarReferenciaPersonal")) {
				jButtonDuplicarReferenciaPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarReferenciaPersonal")) {
				jButtonCopiarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("VerFormReferenciaPersonal")) {
				jButtonVerFormReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarReferenciaPersonal")) {
				jButtonNuevoReferenciaPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarReferenciaPersonal")) {
				jButtonDuplicarReferenciaPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoReferenciaPersonal")) {
				jButtonNuevoReferenciaPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarReferenciaPersonal")) {
				jButtonDuplicarReferenciaPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesReferenciaPersonal")) {
				jButtonNuevoReferenciaPersonalActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarReferenciaPersonal")) {
				jButtonNuevoReferenciaPersonalActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesReferenciaPersonal")) {
				jButtonNuevoReferenciaPersonalActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarReferenciaPersonal")) {
				jButtonModificarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarReferenciaPersonal")) {
				jButtonModificarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarReferenciaPersonal")) {
				jButtonModificarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarReferenciaPersonal")) {
				jButtonActualizarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarReferenciaPersonal")) {
				jButtonActualizarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarReferenciaPersonal")) {
				jButtonActualizarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("EliminarReferenciaPersonal")) {
				jButtonEliminarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarReferenciaPersonal")) {
				jButtonEliminarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarReferenciaPersonal")) {
				jButtonEliminarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("CancelarReferenciaPersonal")) {
				jButtonCancelarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarReferenciaPersonal")) {
				jButtonCancelarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarReferenciaPersonal")) {
				jButtonCancelarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("CerrarReferenciaPersonal")) {
				jButtonCerrarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarReferenciaPersonal")) {
				jButtonCerrarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarReferenciaPersonal")) {
				jButtonCerrarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarReferenciaPersonal")) {
				jButtonMostrarOcultarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarReferenciaPersonal")) {
				jButtonCancelarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosReferenciaPersonal")) {
				jButtonGuardarCambiosReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarReferenciaPersonal")) {
				jButtonGuardarCambiosReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarReferenciaPersonal")) {
				jButtonCopiarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarReferenciaPersonal")) {
				jButtonVerFormReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosReferenciaPersonal")) {
				jButtonGuardarCambiosReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarReferenciaPersonal")) {
				jButtonCopiarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormReferenciaPersonal")) {
				jButtonVerFormReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaReferenciaPersonal")) {
				jButtonGuardarCambiosReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarReferenciaPersonal")) {
				jButtonGuardarCambiosReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaReferenciaPersonal")) {
				jButtonGuardarCambiosReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionReferenciaPersonal")) {
				jButtonRecargarInformacionReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarReferenciaPersonal")) {
				jButtonRecargarInformacionReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionReferenciaPersonal")) {
				jButtonRecargarInformacionReferenciaPersonalActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresReferenciaPersonal")) {
				jButtonAnterioresReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarReferenciaPersonal")) {
				jButtonAnterioresReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreReferenciaPersonal")) {
				jButtonAnterioresReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesReferenciaPersonal")) {
				jButtonSiguientesReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarReferenciaPersonal")) {
				jButtonSiguientesReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesReferenciaPersonal")) {
				jButtonSiguientesReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByReferenciaPersonal") || sTipo.equals("MenuItemDetalleAbrirOrderByReferenciaPersonal")) {
				jButtonAbrirOrderByReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarReferenciaPersonal") || sTipo.equals("MenuItemDetalleMostrarOcultarReferenciaPersonal")) {
				jButtonMostrarOcultarReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosReferenciaPersonal")) {
				jButtonNuevoGuardarCambiosReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarReferenciaPersonal")) {
				jButtonNuevoGuardarCambiosReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosReferenciaPersonal")) {
				jButtonNuevoGuardarCambiosReferenciaPersonalActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoReferenciaPersonal")) {
				jButtonCerrarReporteDinamicoReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoReferenciaPersonal")) {
				jButtonGenerarReporteDinamicoReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoReferenciaPersonal")) {
				
				jButtonGenerarExcelReporteDinamicoReferenciaPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionReferenciaPersonal")) {
				jButtonCerrarImportacionReferenciaPersonalActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionReferenciaPersonal")) {
				
				jButtonGenerarImportacionReferenciaPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionReferenciaPersonal")) {
				
				jButtonAbrirImportacionReferenciaPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesReferenciaPersonal")) {
				jComboBoxTiposAccionesReferenciaPersonalActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesReferenciaPersonal")) {
				jComboBoxTiposRelacionesReferenciaPersonalActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioReferenciaPersonal")) {
				jComboBoxTiposAccionesReferenciaPersonalActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarReferenciaPersonal")) {
				
				jComboBoxTiposSeleccionarReferenciaPersonalActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralReferenciaPersonal")) {
				jTextFieldValorCampoGeneralReferenciaPersonalActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByReferenciaPersonal")) {
				jButtonAbrirOrderByReferenciaPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarReferenciaPersonal")) {
				jButtonAbrirOrderByReferenciaPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByReferenciaPersonal")) {
				jButtonCerrarOrderByReferenciaPersonalActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idReferenciaPersonalBusqueda")) {
				this.jButtonidReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaReferenciaPersonalUpdate")) {
				this.jButtonid_empresaReferenciaPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaReferenciaPersonalBusqueda")) {
				this.jButtonid_empresaReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteReferenciaPersonal")) {
				this.jButtonidclienteReferenciaPersonalActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteReferenciaPersonalUpdate")) {
				this.jButtonidclienteReferenciaPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteReferenciaPersonalBusqueda")) {
				this.jButtonidclienteReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientereferenciapersonalReferenciaPersonalUpdate")) {
				this.jButtonidvalorclientereferenciapersonalReferenciaPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientereferenciapersonalReferenciaPersonalBusqueda")) {
				this.jButtonidvalorclientereferenciapersonalReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisReferenciaPersonalUpdate")) {
				this.jButtonid_paisReferenciaPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisReferenciaPersonalBusqueda")) {
				this.jButtonid_paisReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idciudadReferenciaPersonalUpdate")) {
				this.jButtonidciudadReferenciaPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idciudadReferenciaPersonalBusqueda")) {
				this.jButtonidciudadReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreReferenciaPersonalBusqueda")) {
				this.jButtonnombreReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionReferenciaPersonalBusqueda")) {
				this.jButtonidentificacionReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_nacimientoReferenciaPersonalBusqueda")) {
				this.jButtonfecha_nacimientoReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionReferenciaPersonalBusqueda")) {
				this.jButtondireccionReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoReferenciaPersonalBusqueda")) {
				this.jButtontelefonoReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonomovilReferenciaPersonalBusqueda")) {
				this.jButtontelefonomovilReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonocodigoareaReferenciaPersonalBusqueda")) {
				this.jButtontelefonocodigoareaReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("preferenciaReferenciaPersonalBusqueda")) {
				this.jButtonpreferenciaReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailReferenciaPersonalBusqueda")) {
				this.jButtonemailReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionReferenciaPersonalBusqueda")) {
				this.jButtonobservacionReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_trabajandoReferenciaPersonalBusqueda")) {
				this.jButtonesta_trabajandoReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("empresa_trabajoReferenciaPersonalBusqueda")) {
				this.jButtonempresa_trabajoReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_trabajoReferenciaPersonalBusqueda")) {
				this.jButtondireccion_trabajoReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_trabajoReferenciaPersonalBusqueda")) {
				this.jButtontelefono_trabajoReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoReferenciaPersonalBusqueda")) {
				this.jButtonesactivoReferenciaPersonalBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("idclienteReferenciaPersonal")) {
				this.jButtonidclienteReferenciaPersonalActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCiudadReferenciaPersonal")) {
				this.jButtonFK_IdCiudadReferenciaPersonalActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteReferenciaPersonal")) {
				this.jButtonFK_IdClienteReferenciaPersonalActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisReferenciaPersonal")) {
				this.jButtonFK_IdPaisReferenciaPersonalActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoReferenciaPersonalReferenciaPersonal")) {
				this.jButtonFK_IdTipoReferenciaPersonalReferenciaPersonalActionPerformed(evt);
			}
			
			;
			
			
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessReferenciaPersonal();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaPersonalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciapersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciapersonal);
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
				
				


				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ReferenciaPersonal referenciapersonalLocal=null;
			
			if(!this.getEsControlTabla()) {
				referenciapersonalLocal=this.referenciapersonal;
			} else {
				referenciapersonalLocal=this.referenciapersonalAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciapersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciapersonal);
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
							
				
				


				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalAnterior =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciapersonalAnterior =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
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
			
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
			
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
			
			


			
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaPersonalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciapersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciapersonal);
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
								
						
				


				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaPersonal.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciapersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciapersonal);
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
								
				
				


				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalAnterior =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciapersonalAnterior =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciapersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciapersonal);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalAnterior =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciapersonalAnterior =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaPersonalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciapersonal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.referenciapersonal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciapersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciapersonal);
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
							
				
				


				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaPersonal.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaPersonalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonalAnterior =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.referenciapersonalAnterior =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
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
			
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
			
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
			
			


			
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaPersonalActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciapersonal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.referenciapersonal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciapersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciapersonal);
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
								
				
				


				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalAnterior =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciapersonalAnterior =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaPersonalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciapersonal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.referenciapersonal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaPersonalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciapersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciapersonal);
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosReferenciaPersonal")) {
					jCheckBoxSeleccionarTodosReferenciaPersonalItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosReferenciaPersonal")) {
					jCheckBoxSeleccionadosReferenciaPersonalItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarReferenciaPersonal")) {
					
				}
				
				


				
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciapersonal);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.referenciapersonal);
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
												
				
				


				
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaPersonalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciapersonalAnterior =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.referenciapersonalAnterior =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaPersonalActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciapersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciapersonal);
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
				
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
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
			
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
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
			
			


			if(sTipo.equals("id_paisReferenciaPersonal")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal;
				}

				if(this.referenciapersonalSessionBean.getConGuardarRelaciones()) {
					//classes=ReferenciaPersonalConstantesFunciones.getClassesRelationshipsOfReferenciaPersonal(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormReferenciaPersonal(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisReferenciaPersonal")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisReferenciaPersonal,"FK_IdPais");
				//recargarFormReferenciaPersonalPais(jComboBoxid_paisFK_IdPaisReferenciaPersonal,"FK_IdPais");
			}
			
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaPersonalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciapersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciapersonal);
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_paisReferenciaPersonal")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal;
				}

				if(this.referenciapersonalSessionBean.getConGuardarRelaciones()) {
					//classes=ReferenciaPersonalConstantesFunciones.getClassesRelationshipsOfReferenciaPersonal(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormReferenciaPersonal(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisReferenciaPersonal")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisReferenciaPersonal,"FK_IdPais");
				//recargarFormReferenciaPersonalPais(jComboBoxid_paisFK_IdPaisReferenciaPersonal,"FK_IdPais");
			}
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaPersonal.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaPersonal.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciapersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciapersonal);
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
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
				
				


			if(sTipo.equals("id_paisReferenciaPersonal")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal;
				}

				if(this.referenciapersonalSessionBean.getConGuardarRelaciones()) {
					//classes=ReferenciaPersonalConstantesFunciones.getClassesRelationshipsOfReferenciaPersonal(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormReferenciaPersonal(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisReferenciaPersonal")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisReferenciaPersonal,"FK_IdPais");
				//recargarFormReferenciaPersonalPais(jComboBoxid_paisFK_IdPaisReferenciaPersonal,"FK_IdPais");
			}
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaPersonal.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciapersonalAnterior =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciapersonalAnterior =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarReferenciaPersonal")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosReferenciaPersonalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosReferenciaPersonal.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.referenciapersonal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.referenciapersonal);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarReferenciaPersonal")) {
				
				}
				
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarReferenciaPersonal")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosReferenciaPersonal.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarReferenciaPersonal")) {
			
			}
			
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessReferenciaPersonal();
			
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
			
			if(sTipo.equals("NuevoReferenciaPersonal")) {
				jButtonNuevoReferenciaPersonalActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarReferenciaPersonal")) {
				jButtonDuplicarReferenciaPersonalActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarReferenciaPersonal")) {
				jButtonCopiarReferenciaPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormReferenciaPersonal")) {
				jButtonVerFormReferenciaPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesReferenciaPersonal")) {
				jButtonNuevoReferenciaPersonalActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarReferenciaPersonal")) {
				jButtonModificarReferenciaPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarReferenciaPersonal")) {
				jButtonActualizarReferenciaPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarReferenciaPersonal")) {
				jButtonEliminarReferenciaPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaReferenciaPersonal")) {
				jButtonGuardarCambiosReferenciaPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarReferenciaPersonal")) {
				jButtonCancelarReferenciaPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarReferenciaPersonal")) {
				jButtonCerrarReferenciaPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosReferenciaPersonal")) {
				jButtonGuardarCambiosReferenciaPersonalActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosReferenciaPersonal")) {
				jButtonNuevoGuardarCambiosReferenciaPersonalActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByReferenciaPersonal")) {
				jButtonAbrirOrderByReferenciaPersonalActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionReferenciaPersonal")) {
				jButtonRecargarInformacionReferenciaPersonalActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresReferenciaPersonal")) {
				jButtonAnterioresReferenciaPersonalActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesReferenciaPersonal")) {
				jButtonSiguientesReferenciaPersonalActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idReferenciaPersonalBusqueda")) {
				this.jButtonidReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaReferenciaPersonalUpdate")) {
				this.jButtonid_empresaReferenciaPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaReferenciaPersonalBusqueda")) {
				this.jButtonid_empresaReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteReferenciaPersonal")) {
				this.jButtonidclienteReferenciaPersonalActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteReferenciaPersonalUpdate")) {
				this.jButtonidclienteReferenciaPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteReferenciaPersonalBusqueda")) {
				this.jButtonidclienteReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientereferenciapersonalReferenciaPersonalUpdate")) {
				this.jButtonidvalorclientereferenciapersonalReferenciaPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientereferenciapersonalReferenciaPersonalBusqueda")) {
				this.jButtonidvalorclientereferenciapersonalReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisReferenciaPersonalUpdate")) {
				this.jButtonid_paisReferenciaPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisReferenciaPersonalBusqueda")) {
				this.jButtonid_paisReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idciudadReferenciaPersonalUpdate")) {
				this.jButtonidciudadReferenciaPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idciudadReferenciaPersonalBusqueda")) {
				this.jButtonidciudadReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreReferenciaPersonalBusqueda")) {
				this.jButtonnombreReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionReferenciaPersonalBusqueda")) {
				this.jButtonidentificacionReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_nacimientoReferenciaPersonalBusqueda")) {
				this.jButtonfecha_nacimientoReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionReferenciaPersonalBusqueda")) {
				this.jButtondireccionReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoReferenciaPersonalBusqueda")) {
				this.jButtontelefonoReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonomovilReferenciaPersonalBusqueda")) {
				this.jButtontelefonomovilReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonocodigoareaReferenciaPersonalBusqueda")) {
				this.jButtontelefonocodigoareaReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("preferenciaReferenciaPersonalBusqueda")) {
				this.jButtonpreferenciaReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailReferenciaPersonalBusqueda")) {
				this.jButtonemailReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionReferenciaPersonalBusqueda")) {
				this.jButtonobservacionReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_trabajandoReferenciaPersonalBusqueda")) {
				this.jButtonesta_trabajandoReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("empresa_trabajoReferenciaPersonalBusqueda")) {
				this.jButtonempresa_trabajoReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_trabajoReferenciaPersonalBusqueda")) {
				this.jButtondireccion_trabajoReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_trabajoReferenciaPersonalBusqueda")) {
				this.jButtontelefono_trabajoReferenciaPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoReferenciaPersonalBusqueda")) {
				this.jButtonesactivoReferenciaPersonalBusquedaActionPerformed(evt);
			}
			
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessReferenciaPersonal();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameReferenciaPersonal")) {
				closingInternalFrameReferenciaPersonal();
				
			} else if(sTipo.equals("jButtonCancelarReferenciaPersonal")) {
				JInternalFrameBase jInternalFrameDetalleFormReferenciaPersonal = (JInternalFrameBase)evt.getSource();
	            	
	            ReferenciaPersonalBeanSwingJInternalFrame jInternalFrameParent=(ReferenciaPersonalBeanSwingJInternalFrame)jInternalFrameDetalleFormReferenciaPersonal.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarReferenciaPersonalActionPerformed(null);
			}
			
			ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.referenciapersonal,new Object(),this.referenciapersonalParameterGeneral,this.referenciapersonalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormReferenciaPersonal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormReferenciaPersonal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormReferenciaPersonal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.referenciapersonal)) {
			if(!esControlTabla) {
				if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);			
				}
				
				if(this.referenciapersonalSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualReferenciaPersonal(this.referenciapersonal,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.referenciapersonalReturnGeneral=referenciapersonalLogic.procesarEventosReferenciaPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.referenciapersonalLogic.getReferenciaPersonals(),this.referenciapersonal,this.referenciapersonalParameterGeneral,this.isEsNuevoReferenciaPersonal,classes);//this.referenciapersonalLogic.getReferenciaPersonal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanReferenciaPersonal(this.referenciapersonalReturnGeneral,this.referenciapersonalBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.referenciapersonalSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanReferenciaPersonal(classes,this.referenciapersonalReturnGeneral,this.referenciapersonalBean,false);
					}
						
					if(this.referenciapersonalReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyReferenciaPersonal(this.referenciapersonalReturnGeneral.getReferenciaPersonal());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioReferenciaPersonal(this.referenciapersonalReturnGeneral.getReferenciaPersonal());	
					}
						
					if(this.referenciapersonalReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioReferenciaPersonal(this.referenciapersonalReturnGeneral.getReferenciaPersonal(),classes);//this.referenciapersonalBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioReferenciaPersonal(this.referenciapersonal,classes);//this.referenciapersonalBean);									
				}
			
				if(ReferenciaPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualReferenciaPersonal(this.referenciapersonal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaPersonal(this.referenciapersonal);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.referenciapersonalAnterior!=null) {
						this.referenciapersonal=this.referenciapersonalAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.referenciapersonalReturnGeneral=referenciapersonalLogic.procesarEventosReferenciaPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.referenciapersonalLogic.getReferenciaPersonals(),this.referenciapersonal,this.referenciapersonalParameterGeneral,this.isEsNuevoReferenciaPersonal,classes);//this.referenciapersonalLogic.getReferenciaPersonal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.referenciapersonalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.referenciapersonalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.referenciapersonalReturnGeneral.getReferenciaPersonal(),referenciapersonalLogic.getReferenciaPersonals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.referenciapersonalReturnGeneral.getReferenciaPersonal(),this.referenciapersonals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosReferenciaPersonal.repaint();
				
				//((AbstractTableModel) this.jTableDatosReferenciaPersonal.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosReferenciaPersonal();
			}
		}
	}
	
	public void actualizarVisualTableDatosReferenciaPersonal() throws Exception {
		
		ReferenciaPersonalModel referenciapersonalModel=(ReferenciaPersonalModel)this.jTableDatosReferenciaPersonal.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			referenciapersonalModel.referenciapersonals=this.referenciapersonalLogic.getReferenciaPersonals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			referenciapersonalModel.referenciapersonals=this.referenciapersonals;
		}
		
		
		((ReferenciaPersonalModel) this.jTableDatosReferenciaPersonal.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaReferenciaPersonal() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getreferenciapersonalAnterior(),this.referenciapersonalLogic.getReferenciaPersonals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getreferenciapersonalAnterior(),this.referenciapersonals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosReferenciaPersonal();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioReferenciaPersonal(ReferenciaPersonal referenciapersonal,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
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
										
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.referenciapersonal,new Object(),generalEntityParameterGeneral,this.referenciapersonalReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.referenciapersonalSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ReferenciaPersonalConstantesFunciones.getClassesRelationshipsOfReferenciaPersonal(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ReferenciaPersonalConstantesFunciones.getClassesRelationshipsFromStringsOfReferenciaPersonal(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormReferenciaPersonal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ReferenciaPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.referenciapersonal,new Object(),generalEntityParameterGeneral,this.referenciapersonalReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioReferenciaPersonal(ReferenciaPersonalBean referenciapersonalBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanReferenciaPersonal(ArrayList<Classe> classes,ReferenciaPersonalReturnGeneral referenciapersonalReturnGeneral,ReferenciaPersonalBean referenciapersonalBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualReferenciaPersonal(ReferenciaPersonal referenciapersonal,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.referenciapersonal)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormReferenciaPersonal = new ReferenciaPersonalDetalleFormJInternalFrame(jDesktopPane,this.referenciapersonalSessionBean.getConGuardarRelaciones(),this.referenciapersonalSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.setVisible(false);
		this.jInternalFrameDetalleFormReferenciaPersonal.setSelected(false);						
		
		this.jInternalFrameDetalleFormReferenciaPersonal.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormReferenciaPersonal.referenciapersonalLogic=this.referenciapersonalLogic;
		
		this.cargarCombosFrameForeignKeyReferenciaPersonal("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleReferenciaPersonal();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleReferenciaPersonal();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyReferenciaPersonal("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyReferenciaPersonal();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormReferenciaPersonal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarReferenciaPersonal"));
		
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonModificarReferenciaPersonal.addActionListener(new ButtonActionListener(this,"ModificarReferenciaPersonal"));

		
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonModificarToolBarReferenciaPersonal.addActionListener(new ButtonActionListener(this,"ModificarToolBarReferenciaPersonal"));
					
		this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemModificarReferenciaPersonal.addActionListener(new ButtonActionListener(this,"MenuItemModificarReferenciaPersonal"));		
		
		
		
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonActualizarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"ActualizarReferenciaPersonal"));
		
		
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonActualizarToolBarReferenciaPersonal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarReferenciaPersonal"));
						
		this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemActualizarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarReferenciaPersonal"));		
		
		
		
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonEliminarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"EliminarReferenciaPersonal"));
		
		
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonEliminarToolBarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"EliminarToolBarReferenciaPersonal"));
								
		this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemEliminarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarReferenciaPersonal"));		
		
		
		
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonCancelarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"CancelarReferenciaPersonal"));
		
		
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonCancelarToolBarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"CancelarToolBarReferenciaPersonal"));
					
		this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemCancelarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarReferenciaPersonal"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemDetalleCerrarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarReferenciaPersonal"));		
		
		
		
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonGuardarCambiosToolBarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReferenciaPersonal"));
		
		
		
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonGuardarCambiosToolBarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReferenciaPersonal"));
		
		
		
		this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxTiposAccionesFormularioReferenciaPersonal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioReferenciaPersonal"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idReferenciaPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonid_empresaReferenciaPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonid_empresaReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaPersonalBusqueda"));
		//jButtonidclienteReferenciaPersonal.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteReferenciaPersonalActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidclienteReferenciaPersonal.addActionListener(new ButtonActionListener(this,"idclienteReferenciaPersonal"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidclienteReferenciaPersonalUpdate.addActionListener(new ButtonActionListener(this,"idclienteReferenciaPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidclienteReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idclienteReferenciaPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidvalorclientereferenciapersonalReferenciaPersonalUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientereferenciapersonalReferenciaPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidvalorclientereferenciapersonalReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientereferenciapersonalReferenciaPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonid_paisReferenciaPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_paisReferenciaPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonid_paisReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_paisReferenciaPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidciudadReferenciaPersonalUpdate.addActionListener(new ButtonActionListener(this,"idciudadReferenciaPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidciudadReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idciudadReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonnombreReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"nombreReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidentificacionReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"identificacionReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonfecha_nacimientoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimientoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtondireccionReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"direccionReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtontelefonoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"telefonoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtontelefonomovilReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"telefonomovilReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtontelefonocodigoareaReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"telefonocodigoareaReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonpreferenciaReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"preferenciaReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonemailReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"emailReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonobservacionReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"observacionReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonesta_trabajandoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"esta_trabajandoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonempresa_trabajoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"empresa_trabajoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtondireccion_trabajoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"direccion_trabajoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtontelefono_trabajoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"telefono_trabajoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonesactivoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"esactivoReferenciaPersonalBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormReferenciaPersonal.jTabbedPaneRelacionesReferenciaPersonal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesReferenciaPersonal"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameReferenciaPersonal"));
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaPersonal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarReferenciaPersonal"));
		}
		
		this.jTableDatosReferenciaPersonal.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarReferenciaPersonal"));
		
		this.jTableDatosReferenciaPersonal.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarReferenciaPersonal"));
		
		this.jButtonNuevoReferenciaPersonal.addActionListener(new ButtonActionListener(this,"NuevoReferenciaPersonal"));
		
		this.jButtonDuplicarReferenciaPersonal.addActionListener(new ButtonActionListener(this,"DuplicarReferenciaPersonal"));
		
		this.jButtonCopiarReferenciaPersonal.addActionListener(new ButtonActionListener(this,"CopiarReferenciaPersonal"));
		
		this.jButtonVerFormReferenciaPersonal.addActionListener(new ButtonActionListener(this,"VerFormReferenciaPersonal"));
		
		
		this.jButtonNuevoToolBarReferenciaPersonal.addActionListener(new ButtonActionListener(this,"NuevoToolBarReferenciaPersonal"));
			
		this.jButtonDuplicarToolBarReferenciaPersonal.addActionListener(new ButtonActionListener(this,"DuplicarToolBarReferenciaPersonal"));
			
		this.jMenuItemNuevoReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoReferenciaPersonal"));
			
		this.jMenuItemDuplicarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarReferenciaPersonal"));		
		
		
		this.jButtonNuevoRelacionesReferenciaPersonal.addActionListener (new ButtonActionListener(this,"NuevoRelacionesReferenciaPersonal"));
		
		
		this.jButtonNuevoRelacionesToolBarReferenciaPersonal.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarReferenciaPersonal"));
			
		this.jMenuItemNuevoRelacionesReferenciaPersonal.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesReferenciaPersonal"));		
		
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonModificarReferenciaPersonal.addActionListener(new ButtonActionListener(this,"ModificarReferenciaPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonModificarToolBarReferenciaPersonal.addActionListener(new ButtonActionListener(this,"ModificarToolBarReferenciaPersonal"));
			
			this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemModificarReferenciaPersonal.addActionListener(new ButtonActionListener(this,"MenuItemModificarReferenciaPersonal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonActualizarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"ActualizarReferenciaPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonActualizarToolBarReferenciaPersonal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarReferenciaPersonal"));
				
			this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemActualizarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarReferenciaPersonal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonEliminarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"EliminarReferenciaPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonEliminarToolBarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"EliminarToolBarReferenciaPersonal"));
						
			this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemEliminarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarReferenciaPersonal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonCancelarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"CancelarReferenciaPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonCancelarToolBarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"CancelarToolBarReferenciaPersonal"));
			
			this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemCancelarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarReferenciaPersonal"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarReferenciaPersonal"));		
		
		
		this.jButtonCerrarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"CerrarReferenciaPersonal"));
		
		
		this.jButtonCerrarToolBarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"CerrarToolBarReferenciaPersonal"));
			
		this.jMenuItemCerrarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemCerrarReferenciaPersonal"));
			
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaPersonal.jMenuItemDetalleCerrarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarReferenciaPersonal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonGuardarCambiosReferenciaPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosReferenciaPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonGuardarCambiosToolBarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReferenciaPersonal"));
		}
		
		this.jButtonCopiarToolBarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"CopiarToolBarReferenciaPersonal"));
			
		this.jButtonVerFormToolBarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"VerFormToolBarReferenciaPersonal"));
		
		this.jMenuItemGuardarCambiosReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosReferenciaPersonal"));
			
		this.jMenuItemCopiarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemCopiarReferenciaPersonal"));		
		
		this.jMenuItemVerFormReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemVerFormReferenciaPersonal"));		
		
		
		this.jButtonGuardarCambiosTablaReferenciaPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaReferenciaPersonal"));
		
		
		this.jButtonGuardarCambiosTablaToolBarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarReferenciaPersonal"));
			
		this.jMenuItemGuardarCambiosTablaReferenciaPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaReferenciaPersonal"));		
		
		
		
		this.jButtonRecargarInformacionReferenciaPersonal.addActionListener (new ButtonActionListener(this,"RecargarInformacionReferenciaPersonal"));
					
		this.jButtonRecargarInformacionToolBarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarReferenciaPersonal"));
		
		this.jMenuItemRecargarInformacionReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionReferenciaPersonal"));		
		
		
		
		this.jButtonAnterioresReferenciaPersonal.addActionListener (new ButtonActionListener(this,"AnterioresReferenciaPersonal"));
		
		
		this.jButtonAnterioresToolBarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"AnterioresToolBarReferenciaPersonal"));
		
		this.jMenuItemAnterioresReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresReferenciaPersonal"));		
		
		
		this.jButtonSiguientesReferenciaPersonal.addActionListener (new ButtonActionListener(this,"SiguientesReferenciaPersonal"));
		
		
		this.jButtonSiguientesToolBarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"SiguientesToolBarReferenciaPersonal"));
			
		this.jMenuItemSiguientesReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesReferenciaPersonal"));
			
		this.jMenuItemAbrirOrderByReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByReferenciaPersonal"));
			
		this.jMenuItemMostrarOcultarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarReferenciaPersonal"));
			
		this.jMenuItemDetalleAbrirOrderByReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByReferenciaPersonal"));
			
		this.jMenuItemDetalleMostarOcultarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarReferenciaPersonal"));		
		
		
		this.jButtonNuevoGuardarCambiosReferenciaPersonal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosReferenciaPersonal"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarReferenciaPersonal"));
			
		this.jMenuItemNuevoGuardarCambiosReferenciaPersonal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosReferenciaPersonal"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosReferenciaPersonal.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosReferenciaPersonal"));

		this.jCheckBoxSeleccionadosReferenciaPersonal.addItemListener(new CheckBoxItemListener(this,"SeleccionadosReferenciaPersonal"));
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxTiposAccionesFormularioReferenciaPersonal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioReferenciaPersonal"));
		}
		
		
		this.jComboBoxTiposRelacionesReferenciaPersonal.addActionListener (new ButtonActionListener(this,"TiposRelacionesReferenciaPersonal"));
			
		this.jComboBoxTiposAccionesReferenciaPersonal.addActionListener (new ButtonActionListener(this,"TiposAccionesReferenciaPersonal"));
					
		this.jComboBoxTiposSeleccionarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"TiposSeleccionarReferenciaPersonal"));
			
		this.jTextFieldValorCampoGeneralReferenciaPersonal.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralReferenciaPersonal"));		
		
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idReferenciaPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonid_empresaReferenciaPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonid_empresaReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaPersonalBusqueda"));
		//jButtonidclienteReferenciaPersonal.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteReferenciaPersonalActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidclienteReferenciaPersonal.addActionListener(new ButtonActionListener(this,"idclienteReferenciaPersonal"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidclienteReferenciaPersonalUpdate.addActionListener(new ButtonActionListener(this,"idclienteReferenciaPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidclienteReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idclienteReferenciaPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidvalorclientereferenciapersonalReferenciaPersonalUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientereferenciapersonalReferenciaPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidvalorclientereferenciapersonalReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientereferenciapersonalReferenciaPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonid_paisReferenciaPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_paisReferenciaPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonid_paisReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_paisReferenciaPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidciudadReferenciaPersonalUpdate.addActionListener(new ButtonActionListener(this,"idciudadReferenciaPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidciudadReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idciudadReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonnombreReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"nombreReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidentificacionReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"identificacionReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonfecha_nacimientoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimientoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtondireccionReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"direccionReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtontelefonoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"telefonoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtontelefonomovilReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"telefonomovilReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtontelefonocodigoareaReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"telefonocodigoareaReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonpreferenciaReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"preferenciaReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonemailReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"emailReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonobservacionReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"observacionReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonesta_trabajandoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"esta_trabajandoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonempresa_trabajoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"empresa_trabajoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtondireccion_trabajoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"direccion_trabajoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtontelefono_trabajoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"telefono_trabajoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonesactivoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"esactivoReferenciaPersonalBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCiudadReferenciaPersonal.addActionListener(new ButtonActionListener(this,"FK_IdCiudadReferenciaPersonal"));

			this.jButtonFK_IdClienteReferenciaPersonal.addActionListener(new ButtonActionListener(this,"FK_IdClienteReferenciaPersonal"));

			this.jButtonBuscarFK_IdClienteidclienteReferenciaPersonal.addActionListener(new ButtonActionListener(this,"idclienteReferenciaPersonal"));

			this.jButtonFK_IdPaisReferenciaPersonal.addActionListener(new ButtonActionListener(this,"FK_IdPaisReferenciaPersonal"));

			this.jButtonFK_IdTipoReferenciaPersonalReferenciaPersonal.addActionListener(new ButtonActionListener(this,"FK_IdTipoReferenciaPersonalReferenciaPersonal"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoReferenciaPersonal!=null) {
				this.jInternalFrameReporteDinamicoReferenciaPersonal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReferenciaPersonal"));
				this.jInternalFrameReporteDinamicoReferenciaPersonal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReferenciaPersonal"));
				this.jInternalFrameReporteDinamicoReferenciaPersonal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReferenciaPersonal"));
			}
			
			//this.jButtonCerrarReporteDinamicoReferenciaPersonal.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReferenciaPersonal"));				
			//this.jButtonGenerarReporteDinamicoReferenciaPersonal.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReferenciaPersonal"));
			//this.jButtonGenerarExcelReporteDinamicoReferenciaPersonal.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReferenciaPersonal"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionReferenciaPersonal!=null) {
				this.jInternalFrameImportacionReferenciaPersonal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionReferenciaPersonal"));
				this.jInternalFrameImportacionReferenciaPersonal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionReferenciaPersonal"));
				this.jInternalFrameImportacionReferenciaPersonal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionReferenciaPersonal"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByReferenciaPersonal.addActionListener (new ButtonActionListener(this,"AbrirOrderByReferenciaPersonal"));
			
			this.jButtonAbrirOrderByToolBarReferenciaPersonal.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarReferenciaPersonal"));			
			
			if(this.jInternalFrameOrderByReferenciaPersonal!=null) {
				this.jInternalFrameOrderByReferenciaPersonal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByReferenciaPersonal"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaPersonal.jTabbedPaneRelacionesReferenciaPersonal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesReferenciaPersonal"));
		
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
            		closingInternalFrameReferenciaPersonal();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormReferenciaPersonal.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormReferenciaPersonal = (JInternalFrameBase)event.getSource();
	            	
	            ReferenciaPersonalBeanSwingJInternalFrame jInternalFrameParent=(ReferenciaPersonalBeanSwingJInternalFrame)jInternalFrameDetalleFormReferenciaPersonal.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarReferenciaPersonalActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosReferenciaPersonal.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosReferenciaPersonalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosReferenciaPersonal.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosReferenciaPersonal.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaPersonalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaPersonalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaPersonalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoReferenciaPersonal";
		inputMap = this.jButtonNuevoReferenciaPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoReferenciaPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoReferenciaPersonalActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaPersonalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaPersonalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaPersonalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesReferenciaPersonal";
		inputMap = this.jButtonNuevoRelacionesReferenciaPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesReferenciaPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoReferenciaPersonalActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarReferenciaPersonal";
		inputMap = this.jButtonModificarReferenciaPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarReferenciaPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarReferenciaPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarReferenciaPersonal";
		inputMap = this.jButtonActualizarReferenciaPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarReferenciaPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarReferenciaPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarReferenciaPersonal";
		inputMap = this.jButtonEliminarReferenciaPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarReferenciaPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarReferenciaPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarReferenciaPersonal";
		inputMap = this.jButtonCancelarReferenciaPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarReferenciaPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarReferenciaPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarReferenciaPersonal";
		inputMap = this.jButtonCerrarReferenciaPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarReferenciaPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarReferenciaPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonGuardarCambiosReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosReferenciaPersonal";
		inputMap = this.jInternalFrameDetalleFormReferenciaPersonal.jButtonGuardarCambiosReferenciaPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonGuardarCambiosReferenciaPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosReferenciaPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosReferenciaPersonal.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosReferenciaPersonalItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesReferenciaPersonal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesReferenciaPersonalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarReferenciaPersonal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarReferenciaPersonalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralReferenciaPersonal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralReferenciaPersonalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idReferenciaPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonid_empresaReferenciaPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonid_empresaReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaPersonalBusqueda"));
		//jButtonidclienteReferenciaPersonal.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteReferenciaPersonalActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidclienteReferenciaPersonal.addActionListener(new ButtonActionListener(this,"idclienteReferenciaPersonal"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidclienteReferenciaPersonalUpdate.addActionListener(new ButtonActionListener(this,"idclienteReferenciaPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidclienteReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idclienteReferenciaPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidvalorclientereferenciapersonalReferenciaPersonalUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientereferenciapersonalReferenciaPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidvalorclientereferenciapersonalReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientereferenciapersonalReferenciaPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonid_paisReferenciaPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_paisReferenciaPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonid_paisReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_paisReferenciaPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidciudadReferenciaPersonalUpdate.addActionListener(new ButtonActionListener(this,"idciudadReferenciaPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidciudadReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idciudadReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonnombreReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"nombreReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidentificacionReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"identificacionReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonfecha_nacimientoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimientoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtondireccionReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"direccionReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtontelefonoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"telefonoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtontelefonomovilReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"telefonomovilReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtontelefonocodigoareaReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"telefonocodigoareaReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonpreferenciaReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"preferenciaReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonemailReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"emailReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonobservacionReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"observacionReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonesta_trabajandoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"esta_trabajandoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonempresa_trabajoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"empresa_trabajoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtondireccion_trabajoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"direccion_trabajoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtontelefono_trabajoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"telefono_trabajoReferenciaPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaPersonal.jButtonesactivoReferenciaPersonalBusqueda.addActionListener(new ButtonActionListener(this,"esactivoReferenciaPersonalBusqueda"));
		
		
		this.jButtonFK_IdCiudadReferenciaPersonal.addActionListener(new ButtonActionListener(this,"FK_IdCiudadReferenciaPersonal"));

		this.jButtonFK_IdClienteReferenciaPersonal.addActionListener(new ButtonActionListener(this,"FK_IdClienteReferenciaPersonal"));

		this.jButtonBuscarFK_IdClienteidclienteReferenciaPersonal.addActionListener(new ButtonActionListener(this,"idclienteReferenciaPersonal"));

		this.jButtonFK_IdPaisReferenciaPersonal.addActionListener(new ButtonActionListener(this,"FK_IdPaisReferenciaPersonal"));

		this.jButtonFK_IdTipoReferenciaPersonalReferenciaPersonal.addActionListener(new ButtonActionListener(this,"FK_IdTipoReferenciaPersonalReferenciaPersonal"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionReferenciaPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionReferenciaPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarReferenciaPersonalActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarReferenciaPersonal.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosReferenciaPersonal(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ReferenciaPersonal referenciapersonalAux:this.referenciapersonalLogic.getReferenciaPersonals()) {
					referenciapersonalAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReferenciaPersonal referenciapersonalAux:referenciapersonals) {
					referenciapersonalAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosReferenciaPersonalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingReferenciaPersonal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ReferenciaPersonal referenciapersonalAux:this.referenciapersonalLogic.getReferenciaPersonals()) {
						referenciapersonalAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ReferenciaPersonal referenciapersonalAux:referenciapersonals) {
						referenciapersonalAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ReferenciaPersonal referenciapersonalAux:this.referenciapersonalLogic.getReferenciaPersonals()) {
					
						if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO)) {
							existe=true;
							referenciapersonalAux.setesta_trabajando(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							referenciapersonalAux.setesactivo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ReferenciaPersonal referenciapersonalAux:referenciapersonals) {
						
						if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO)) {
							existe=true;
							referenciapersonalAux.setesta_trabajando(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							referenciapersonalAux.setesactivo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaReferenciaPersonal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosReferenciaPersonal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosReferenciaPersonal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosReferenciaPersonalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingReferenciaPersonal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosReferenciaPersonal.getSelectedRows();
			
			ReferenciaPersonal referenciapersonalLocal=new ReferenciaPersonal();
			
			//this.seleccionarTodosReferenciaPersonal(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciapersonalLocal =(ReferenciaPersonal) this.referenciapersonalLogic.getReferenciaPersonals().toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					referenciapersonalLocal =(ReferenciaPersonal) this.referenciapersonals.toArray()[this.jTableDatosReferenciaPersonal.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				referenciapersonalLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ReferenciaPersonal referenciapersonalAux:this.referenciapersonalLogic.getReferenciaPersonals()) {
						referenciapersonalAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ReferenciaPersonal referenciapersonalAux:referenciapersonals) {
						referenciapersonalAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaReferenciaPersonal(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosReferenciaPersonal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosReferenciaPersonal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosReferenciaPersonal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualReferenciaPersonalItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarReferenciaPersonalParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralReferenciaPersonalActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingReferenciaPersonal(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralReferenciaPersonal.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ReferenciaPersonal referenciapersonalAux:this.referenciapersonalLogic.getReferenciaPersonals()) {
				
						if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							referenciapersonalAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							referenciapersonalAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO)) {
							existe=true;
							referenciapersonalAux.setfecha_nacimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							referenciapersonalAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							referenciapersonalAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL)) {
							existe=true;
							referenciapersonalAux.settelefonomovil(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA)) {
							existe=true;
							referenciapersonalAux.settelefonocodigoarea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA)) {
							existe=true;
							referenciapersonalAux.setpreferencia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							referenciapersonalAux.setemail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							referenciapersonalAux.setobservacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO)) {
							existe=true;
							referenciapersonalAux.setempresa_trabajo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO)) {
							existe=true;
							referenciapersonalAux.setdireccion_trabajo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO)) {
							existe=true;
							referenciapersonalAux.settelefono_trabajo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReferenciaPersonal referenciapersonalAux:referenciapersonals) {
					
						if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							referenciapersonalAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							referenciapersonalAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO)) {
							existe=true;
							referenciapersonalAux.setfecha_nacimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							referenciapersonalAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							referenciapersonalAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL)) {
							existe=true;
							referenciapersonalAux.settelefonomovil(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA)) {
							existe=true;
							referenciapersonalAux.settelefonocodigoarea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA)) {
							existe=true;
							referenciapersonalAux.setpreferencia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							referenciapersonalAux.setemail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							referenciapersonalAux.setobservacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO)) {
							existe=true;
							referenciapersonalAux.setempresa_trabajo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO)) {
							existe=true;
							referenciapersonalAux.setdireccion_trabajo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO)) {
							existe=true;
							referenciapersonalAux.settelefono_trabajo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaReferenciaPersonal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesReferenciaPersonalActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingReferenciaPersonal(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioReferenciaPersonal=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesReferenciaPersonal.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxTiposAccionesFormularioReferenciaPersonal.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteReferenciaPersonal) {				
					conSplash=true;//false;										
					
					//this.startProcessReferenciaPersonal(conSplash);
				
					this.generarReporteReferenciaPersonalsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReferenciaPersonal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxTiposAccionesFormularioReferenciaPersonal.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoReferenciaPersonalsSeleccionados();
				//this.jComboBoxTiposAccionesReferenciaPersonal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoReferenciaPersonalsSeleccionados(false);
				//this.jComboBoxTiposAccionesReferenciaPersonal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoReferenciaPersonalsSeleccionados(true);
				//this.jComboBoxTiposAccionesReferenciaPersonal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessReferenciaPersonal();
				
				this.exportarReferenciaPersonalsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReferenciaPersonal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxTiposAccionesFormularioReferenciaPersonal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionReferenciaPersonals();
				//this.importarReferenciaPersonals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReferenciaPersonal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxTiposAccionesFormularioReferenciaPersonal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessReferenciaPersonal();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelReferenciaPersonalsSeleccionados();
				//this.jComboBoxTiposAccionesReferenciaPersonal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Referencia Personal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessReferenciaPersonal();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoReferenciaPersonal)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyReferenciaPersonal(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Referencia Personal",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReferenciaPersonal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxTiposAccionesFormularioReferenciaPersonal.setSelectedIndex(0);					
				}	
			} 			
			else if(ReferenciaPersonalBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteReferenciaPersonal) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessReferenciaPersonal(conSplash);
					
						//this.actualizarParametrosGeneralReferenciaPersonal();
						
						this.generarReporteProcesoAccionReferenciaPersonalsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesReferenciaPersonal.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxTiposAccionesFormularioReferenciaPersonal.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ReferenciaPersonalBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Referencia PersonalES SELECCIONADOS?", "MANTENIMIENTO DE Referencia Personal", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessReferenciaPersonal();
				
						this.actualizarParametrosGeneralReferenciaPersonal();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.referenciapersonalReturnGeneral=referenciapersonalLogic.procesarAccionReferenciaPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.referenciapersonalLogic.getReferenciaPersonals(),this.referenciapersonalParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarReferenciaPersonalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesReferenciaPersonal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxTiposAccionesFormularioReferenciaPersonal.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralReferenciaPersonal();
					
					ReferenciaPersonalBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarReferenciaPersonalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesReferenciaPersonal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxTiposAccionesFormularioReferenciaPersonal.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessReferenciaPersonal(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesReferenciaPersonalActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessReferenciaPersonal();
			
			if(this.jInternalFrameDetalleFormReferenciaPersonal==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ReferenciaPersonal> referenciapersonalsSeleccionados=new ArrayList<ReferenciaPersonal>();		
			ReferenciaPersonal referenciapersonal=new ReferenciaPersonal();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingReferenciaPersonal(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesReferenciaPersonal.getSelectedItem();
			
			
			
			
			referenciapersonalsSeleccionados=this.getReferenciaPersonalsSeleccionados(true);
			//this.sTipoAccion;
			
			if(referenciapersonalsSeleccionados.size()==1) {
				for(ReferenciaPersonal referenciapersonalAux:referenciapersonalsSeleccionados) {
					referenciapersonal=referenciapersonalAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessReferenciaPersonal();
			
      		//this.finishProcessReferenciaPersonal(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarReferenciaPersonalReturnGeneral() throws Exception {
		if(this.referenciapersonalReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.referenciapersonalReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.referenciapersonalReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.referenciapersonalReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.referenciapersonalReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.referenciapersonalReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingReferenciaPersonal(false);
		}
		
		if(this.referenciapersonalReturnGeneral.getConRetornoLista() || this.referenciapersonalReturnGeneral.getConRetornoObjeto()) {
			if(this.referenciapersonalReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.referenciapersonalLogic.setReferenciaPersonals(this.referenciapersonalReturnGeneral.getReferenciaPersonals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.referenciapersonalReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.referenciapersonalLogic.setReferenciaPersonal(this.referenciapersonalReturnGeneral.getReferenciaPersonal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingReferenciaPersonal(false);
		}
	}
	
	public void actualizarParametrosGeneralReferenciaPersonal() throws Exception {
		
		
	}
	
	public ArrayList<ReferenciaPersonal> getReferenciaPersonalsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ReferenciaPersonal> referenciapersonalsSeleccionados=new ArrayList<ReferenciaPersonal>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioReferenciaPersonal) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ReferenciaPersonal referenciapersonalAux:referenciapersonalLogic.getReferenciaPersonals()) {
					if(referenciapersonalAux.getIsSelected()) {
						referenciapersonalsSeleccionados.add(referenciapersonalAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReferenciaPersonal referenciapersonalAux:this.referenciapersonals) {
					if(referenciapersonalAux.getIsSelected()) {
						referenciapersonalsSeleccionados.add(referenciapersonalAux);				
					}
				}
			}
			
			if(referenciapersonalsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						referenciapersonalsSeleccionados.addAll(this.referenciapersonalLogic.getReferenciaPersonals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						referenciapersonalsSeleccionados.addAll(this.referenciapersonals);				
					}
				}
			}
		} else {
			referenciapersonalsSeleccionados.add(this.referenciapersonal);
		}
		
		return referenciapersonalsSeleccionados;
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
	
	public void generarReporteReferenciaPersonalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalReferenciaPersonalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoReferenciaPersonalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoReferenciaPersonalsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoReferenciaPersonalsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Referencia Personal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesReferenciaPersonalsSeleccionados() throws Exception {
		ArrayList<ReferenciaPersonal> referenciapersonalsSeleccionados=new ArrayList<ReferenciaPersonal>();		
		
		referenciapersonalsSeleccionados=this.getReferenciaPersonalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteReferenciaPersonals("Todos",referenciapersonalsSeleccionados);
		
	}	
	
	public void generarReporteNormalReferenciaPersonalsSeleccionados() throws Exception {
		ArrayList<ReferenciaPersonal> referenciapersonalsSeleccionados=new ArrayList<ReferenciaPersonal>();		
		
		referenciapersonalsSeleccionados=this.getReferenciaPersonalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteReferenciaPersonals("Todos",referenciapersonalsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionReferenciaPersonalsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ReferenciaPersonal> referenciapersonalsSeleccionados=new ArrayList<ReferenciaPersonal>();
		
		referenciapersonalsSeleccionados=this.getReferenciaPersonalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteReferenciaPersonals("Todos",referenciapersonalsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoReferenciaPersonalsSeleccionados() throws Exception {
		ArrayList<ReferenciaPersonal> referenciapersonalsSeleccionados=new ArrayList<ReferenciaPersonal>();		
		
		
		this.abrirInicializarFrameReporteDinamicoReferenciaPersonal();
		
		
		referenciapersonalsSeleccionados=this.getReferenciaPersonalsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoReferenciaPersonal();
		
		
		//this.generarReporteReferenciaPersonals("Todos",referenciapersonalsSeleccionados ,referenciapersonalImplementable,referenciapersonalImplementableHome);
	}
	
	public void mostrarImportacionReferenciaPersonals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionReferenciaPersonal();
		
		this.abrirFrameImportacionReferenciaPersonal();		
		
			
		//this.generarReporteReferenciaPersonals("Todos",referenciapersonalsSeleccionados ,referenciapersonalImplementable,referenciapersonalImplementableHome);
	}
	
	public void importarReferenciaPersonals() throws Exception {		
	
	}
	
	public void exportarReferenciaPersonalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelReferenciaPersonalsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoReferenciaPersonalsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlReferenciaPersonalsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Referencia Personal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoReferenciaPersonalsSeleccionados() throws Exception {
		ArrayList<ReferenciaPersonal> referenciapersonalsSeleccionados=new ArrayList<ReferenciaPersonal>();		
		
		referenciapersonalsSeleccionados=this.getReferenciaPersonalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciapersonal."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarReferenciaPersonal(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ReferenciaPersonal referenciapersonalAux:referenciapersonalsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarReferenciaPersonal(referenciapersonalAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//referenciapersonalAux.setsDetalleGeneralEntityReporte(referenciapersonalAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Personal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarReferenciaPersonal(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_IDTIPOREFEPERSO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_EMAIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarReferenciaPersonal(ReferenciaPersonal referenciapersonal,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=referenciapersonal.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.gettiporefeperso_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.getidentificacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.getfecha_nacimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.gettelefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.gettelefonomovil();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.gettelefonocodigoarea();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.getpreferencia();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.getemail();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.getobservacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.getesta_trabajando().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.getempresa_trabajo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.getdireccion_trabajo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.gettelefono_trabajo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciapersonal.getesactivo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelReferenciaPersonalsSeleccionados() throws Exception {
		ArrayList<ReferenciaPersonal> referenciapersonalsSeleccionados=new ArrayList<ReferenciaPersonal>();		
		
		referenciapersonalsSeleccionados=this.getReferenciaPersonalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciapersonal.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ReferenciaPersonals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelReferenciaPersonal(row);				
				iRow++;
			}				
			
			for(ReferenciaPersonal referenciapersonalAux:referenciapersonalsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelReferenciaPersonal(referenciapersonalAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Personal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlReferenciaPersonalsSeleccionados() throws Exception {
		ArrayList<ReferenciaPersonal> referenciapersonalsSeleccionados=new ArrayList<ReferenciaPersonal>();		
		
		referenciapersonalsSeleccionados=this.getReferenciaPersonalsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciapersonal.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("referenciapersonals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("referenciapersonal");
			//elementRoot.appendChild(element);
		
			for(ReferenciaPersonal referenciapersonalAux:referenciapersonalsSeleccionados) {
				element = document.createElement("referenciapersonal");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlReferenciaPersonal(referenciapersonalAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Personal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelReferenciaPersonal(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDTIPOREFEPERSO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_EMAIL);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelReferenciaPersonal(ReferenciaPersonal referenciapersonal,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.gettiporefeperso_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.getidentificacion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.getfecha_nacimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.gettelefono());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.gettelefonomovil());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.gettelefonocodigoarea());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.getpreferencia());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.getemail());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.getobservacion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.getesta_trabajando());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.getempresa_trabajo());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.getdireccion_trabajo());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.gettelefono_trabajo());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciapersonal.getesactivo());				
	}
	
	public void setFilaDatosExportarXmlReferenciaPersonal(ReferenciaPersonal referenciapersonal,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ReferenciaPersonalConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(referenciapersonal.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ReferenciaPersonalConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(referenciapersonal.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ReferenciaPersonalConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(referenciapersonal.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(ReferenciaPersonalConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(referenciapersonal.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtiporefeperso_descripcion = document.createElement(ReferenciaPersonalConstantesFunciones.IDTIPOREFEPERSO);
		elementtiporefeperso_descripcion.appendChild(document.createTextNode(referenciapersonal.gettiporefeperso_descripcion()));
		element.appendChild(elementtiporefeperso_descripcion);

		Element elementpais_descripcion = document.createElement(ReferenciaPersonalConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(referenciapersonal.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementciudad_descripcion = document.createElement(ReferenciaPersonalConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(referenciapersonal.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementnombre = document.createElement(ReferenciaPersonalConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(referenciapersonal.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementidentificacion = document.createElement(ReferenciaPersonalConstantesFunciones.IDENTIFICACION);
		elementidentificacion.appendChild(document.createTextNode(referenciapersonal.getidentificacion().trim()));
		element.appendChild(elementidentificacion);

		Element elementfecha_nacimiento = document.createElement(ReferenciaPersonalConstantesFunciones.FECHANACIMIENTO);
		elementfecha_nacimiento.appendChild(document.createTextNode(referenciapersonal.getfecha_nacimiento().toString().trim()));
		element.appendChild(elementfecha_nacimiento);

		Element elementdireccion = document.createElement(ReferenciaPersonalConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(referenciapersonal.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementtelefono = document.createElement(ReferenciaPersonalConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(referenciapersonal.gettelefono().trim()));
		element.appendChild(elementtelefono);

		Element elementtelefonomovil = document.createElement(ReferenciaPersonalConstantesFunciones.TELEFONOMOVIL);
		elementtelefonomovil.appendChild(document.createTextNode(referenciapersonal.gettelefonomovil().trim()));
		element.appendChild(elementtelefonomovil);

		Element elementtelefonocodigoarea = document.createElement(ReferenciaPersonalConstantesFunciones.TELEFONOCODIGOAREA);
		elementtelefonocodigoarea.appendChild(document.createTextNode(referenciapersonal.gettelefonocodigoarea().trim()));
		element.appendChild(elementtelefonocodigoarea);

		Element elementpreferencia = document.createElement(ReferenciaPersonalConstantesFunciones.PREFERENCIA);
		elementpreferencia.appendChild(document.createTextNode(referenciapersonal.getpreferencia().trim()));
		element.appendChild(elementpreferencia);

		Element elementemail = document.createElement(ReferenciaPersonalConstantesFunciones.EMAIL);
		elementemail.appendChild(document.createTextNode(referenciapersonal.getemail().trim()));
		element.appendChild(elementemail);

		Element elementobservacion = document.createElement(ReferenciaPersonalConstantesFunciones.OBSERVACION);
		elementobservacion.appendChild(document.createTextNode(referenciapersonal.getobservacion().trim()));
		element.appendChild(elementobservacion);

		Element elementesta_trabajando = document.createElement(ReferenciaPersonalConstantesFunciones.ESTATRABAJANDO);
		elementesta_trabajando.appendChild(document.createTextNode(referenciapersonal.getesta_trabajando().toString().trim()));
		element.appendChild(elementesta_trabajando);

		Element elementempresa_trabajo = document.createElement(ReferenciaPersonalConstantesFunciones.EMPRESATRABAJO);
		elementempresa_trabajo.appendChild(document.createTextNode(referenciapersonal.getempresa_trabajo().trim()));
		element.appendChild(elementempresa_trabajo);

		Element elementdireccion_trabajo = document.createElement(ReferenciaPersonalConstantesFunciones.DIRECCIONTRABAJO);
		elementdireccion_trabajo.appendChild(document.createTextNode(referenciapersonal.getdireccion_trabajo().trim()));
		element.appendChild(elementdireccion_trabajo);

		Element elementtelefono_trabajo = document.createElement(ReferenciaPersonalConstantesFunciones.TELEFONOTRABAJO);
		elementtelefono_trabajo.appendChild(document.createTextNode(referenciapersonal.gettelefono_trabajo().trim()));
		element.appendChild(elementtelefono_trabajo);

		Element elementesactivo = document.createElement(ReferenciaPersonalConstantesFunciones.ESACTIVO);
		elementesactivo.appendChild(document.createTextNode(referenciapersonal.getesactivo().toString().trim()));
		element.appendChild(elementesactivo);
	}
	
	public void generarReporteGroupGenericoReferenciaPersonalsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ReferenciaPersonal> referenciapersonalsSeleccionados=new ArrayList<ReferenciaPersonal>();
		
		referenciapersonalsSeleccionados=this.getReferenciaPersonalsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoReferenciaPersonal(referenciapersonalsSeleccionados);
		
		this.generarReporteReferenciaPersonals("Todos",referenciapersonalsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoReferenciaPersonal(ArrayList<ReferenciaPersonal> referenciapersonalsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ReferenciaPersonal referenciapersonalAux:referenciapersonalsSeleccionados) {
				referenciapersonalAux.setsDetalleGeneralEntityReporte(referenciapersonalAux.toString());
			
				if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(referenciapersonalAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(referenciapersonalAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_IDTIPOREFEPERSO)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(referenciapersonalAux.gettiporefeperso_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(referenciapersonalAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(referenciapersonalAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(referenciapersonalAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(referenciapersonalAux.getidentificacion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(referenciapersonalAux.getfecha_nacimiento()));
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(referenciapersonalAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(referenciapersonalAux.gettelefono());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(referenciapersonalAux.gettelefonomovil());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(referenciapersonalAux.gettelefonocodigoarea());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(referenciapersonalAux.getpreferencia());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_EMAIL)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(referenciapersonalAux.getemail());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(referenciapersonalAux.getobservacion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(referenciapersonalAux.getesta_trabajando()));
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(referenciapersonalAux.getempresa_trabajo());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(referenciapersonalAux.getdireccion_trabajo());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(referenciapersonalAux.gettelefono_trabajo());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO)) {
					existe=true;
					referenciapersonalAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(referenciapersonalAux.getesactivo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesReferenciaPersonal(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoReferenciaPersonal=true;
				this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal=true;
				this.isVisibilidadCeldaGuardarCambiosReferenciaPersonal=true;
			}
			
			this.isVisibilidadCeldaModificarReferenciaPersonal=false;
			this.isVisibilidadCeldaActualizarReferenciaPersonal=false;
			this.isVisibilidadCeldaEliminarReferenciaPersonal=false;
			this.isVisibilidadCeldaCancelarReferenciaPersonal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaPersonal=true;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaPersonal=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoReferenciaPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaPersonal=false;
			this.isVisibilidadCeldaModificarReferenciaPersonal=false;
			this.isVisibilidadCeldaActualizarReferenciaPersonal=true;
			this.isVisibilidadCeldaEliminarReferenciaPersonal=false;
			this.isVisibilidadCeldaCancelarReferenciaPersonal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaPersonal=true;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaPersonal=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoReferenciaPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaPersonal=false;
			this.isVisibilidadCeldaModificarReferenciaPersonal=false;
			this.isVisibilidadCeldaActualizarReferenciaPersonal=true;
			this.isVisibilidadCeldaEliminarReferenciaPersonal=true;
			this.isVisibilidadCeldaCancelarReferenciaPersonal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaPersonal=true;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaPersonal=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoReferenciaPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaPersonal=false;
			this.isVisibilidadCeldaModificarReferenciaPersonal=false;
			this.isVisibilidadCeldaActualizarReferenciaPersonal=true;
			this.isVisibilidadCeldaEliminarReferenciaPersonal=false;
			this.isVisibilidadCeldaCancelarReferenciaPersonal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaPersonal=false;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaPersonal=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoReferenciaPersonal=true;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal=true;
			this.isVisibilidadCeldaGuardarCambiosReferenciaPersonal=true;
			this.isVisibilidadCeldaModificarReferenciaPersonal=false;
			this.isVisibilidadCeldaActualizarReferenciaPersonal=false;
			this.isVisibilidadCeldaEliminarReferenciaPersonal=false;
			this.isVisibilidadCeldaCancelarReferenciaPersonal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaPersonal=true;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaPersonal=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoReferenciaPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaPersonal=false;
			this.isVisibilidadCeldaActualizarReferenciaPersonal=false;
			this.isVisibilidadCeldaEliminarReferenciaPersonal=false;
			this.isVisibilidadCeldaCancelarReferenciaPersonal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaPersonal=false;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaPersonal=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoReferenciaPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaPersonal=false;
			this.isVisibilidadCeldaModificarReferenciaPersonal=true;
			this.isVisibilidadCeldaActualizarReferenciaPersonal=false;
			this.isVisibilidadCeldaEliminarReferenciaPersonal=false;
			this.isVisibilidadCeldaCancelarReferenciaPersonal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaPersonal=false;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaPersonal=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ReferenciaPersonalJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoReferenciaPersonal=true;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal=true;
			this.isVisibilidadCeldaGuardarCambiosReferenciaPersonal=true;
		} else {
			this.actualizarEstadoPanelsReferenciaPersonal(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarReferenciaPersonal=false;
			//this.isVisibilidadCeldaVerFormReferenciaPersonal=false;
			this.isVisibilidadCeldaDuplicarReferenciaPersonal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!referenciapersonalSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal=false;
		} else {
			this.isVisibilidadCeldaNuevoReferenciaPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaPersonal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(referenciapersonalSessionBean.getEsGuardarRelacionado()) {
			if(!referenciapersonalSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal=false;												
			}
			
			this.jButtonCerrarReferenciaPersonal.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesReferenciaPersonal=false;
		}
		
		if(!this.permiteMantenimiento(this.referenciapersonal)) {
			this.isVisibilidadCeldaActualizarReferenciaPersonal=false;
			this.isVisibilidadCeldaEliminarReferenciaPersonal=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesReferenciaPersonal() {
	}
	
	public void actualizarEstadoPanelsReferenciaPersonal(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionReferenciaPersonal!=null) {
				this.jScrollPanelDatosEdicionReferenciaPersonal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaPersonal!=null) {
				this.jTabbedPaneBusquedasReferenciaPersonal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaPersonal!=null) {
				this.jScrollPanelDatosReferenciaPersonal.setVisible(true);
			}
			
			if(this.jPanelPaginacionReferenciaPersonal!=null) {
				this.jPanelPaginacionReferenciaPersonal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReferenciaPersonal!=null) {
				this.jPanelParametrosReportesReferenciaPersonal.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionReferenciaPersonal!=null) {
				this.jScrollPanelDatosEdicionReferenciaPersonal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaPersonal!=null) {
				this.jTabbedPaneBusquedasReferenciaPersonal.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosReferenciaPersonal!=null) {
				this.jScrollPanelDatosReferenciaPersonal.setVisible(false);
			}
			
			if(this.jPanelPaginacionReferenciaPersonal!=null) {
				this.jPanelPaginacionReferenciaPersonal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReferenciaPersonal!=null) {
				this.jPanelParametrosReportesReferenciaPersonal.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionReferenciaPersonal!=null) {
				this.jScrollPanelDatosEdicionReferenciaPersonal.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaPersonal!=null) {
				this.jTabbedPaneBusquedasReferenciaPersonal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaPersonal!=null) {
				this.jScrollPanelDatosReferenciaPersonal.setVisible(false);
			}
			
			if(this.jPanelPaginacionReferenciaPersonal!=null) {
				this.jPanelPaginacionReferenciaPersonal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReferenciaPersonal!=null) {
				this.jPanelParametrosReportesReferenciaPersonal.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionReferenciaPersonal!=null) {
				this.jScrollPanelDatosEdicionReferenciaPersonal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaPersonal!=null) {
				this.jTabbedPaneBusquedasReferenciaPersonal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaPersonal!=null) {
				this.jScrollPanelDatosReferenciaPersonal.setVisible(false);
			}
			
			if(this.jPanelPaginacionReferenciaPersonal!=null) {
				this.jPanelPaginacionReferenciaPersonal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReferenciaPersonal!=null) {
				this.jPanelParametrosReportesReferenciaPersonal.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionReferenciaPersonal!=null) {
				this.jScrollPanelDatosEdicionReferenciaPersonal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaPersonal!=null) {
				this.jTabbedPaneBusquedasReferenciaPersonal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaPersonal!=null) {
				this.jScrollPanelDatosReferenciaPersonal.setVisible(true);
			}
			
			if(this.jPanelPaginacionReferenciaPersonal!=null) {
				this.jPanelPaginacionReferenciaPersonal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReferenciaPersonal!=null) {
				this.jPanelParametrosReportesReferenciaPersonal.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionReferenciaPersonal!=null) {
				this.jScrollPanelDatosEdicionReferenciaPersonal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaPersonal!=null) {
				this.jTabbedPaneBusquedasReferenciaPersonal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaPersonal!=null) {
				this.jScrollPanelDatosReferenciaPersonal.setVisible(true);
			}
			
			if(this.jPanelPaginacionReferenciaPersonal!=null) {
				this.jPanelPaginacionReferenciaPersonal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReferenciaPersonal!=null) {
				this.jPanelParametrosReportesReferenciaPersonal.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionReferenciaPersonal!=null) {
				this.jScrollPanelDatosEdicionReferenciaPersonal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaPersonal!=null) {
				this.jTabbedPaneBusquedasReferenciaPersonal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaPersonal!=null) {
				this.jScrollPanelDatosReferenciaPersonal.setVisible(true);
			}
			
			if(this.jPanelPaginacionReferenciaPersonal!=null) {
				this.jPanelPaginacionReferenciaPersonal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReferenciaPersonal!=null) {
				this.jPanelParametrosReportesReferenciaPersonal.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasReferenciaPersonal!=null) {
					this.jTabbedPaneBusquedasReferenciaPersonal.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesReferenciaPersonal!=null) {
				this.jPanelParametrosReportesReferenciaPersonal.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaPersonal!=null) {
				this.jTabbedPaneBusquedasReferenciaPersonal.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesReferenciaPersonal!=null) {
				this.jPanelParametrosReportesReferenciaPersonal.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCiudad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdCiudadReferenciaPersonal);}

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdClienteReferenciaPersonal);}

			this.isVisibilidadFK_IdPais=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdPaisReferenciaPersonal);}

			this.isVisibilidadFK_IdTipoReferenciaPersonal=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoReferenciaPersonal) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdTipoReferenciaPersonalReferenciaPersonal);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCiudad=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdCiudadReferenciaPersonal);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdClienteReferenciaPersonal);}

			this.isVisibilidadFK_IdPais=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdPaisReferenciaPersonal);}

			this.isVisibilidadFK_IdTipoReferenciaPersonal=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoReferenciaPersonal) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdTipoReferenciaPersonalReferenciaPersonal);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRefePerso(Boolean isParaTipoRefePerso){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRefePersoNegation=!isParaTipoRefePerso;

			this.isVisibilidadFK_IdCiudad=isParaTipoRefePersoNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdCiudadReferenciaPersonal);}

			this.isVisibilidadFK_IdCliente=isParaTipoRefePersoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdClienteReferenciaPersonal);}

			this.isVisibilidadFK_IdPais=isParaTipoRefePersoNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdPaisReferenciaPersonal);}

			this.isVisibilidadFK_IdTipoReferenciaPersonal=isParaTipoRefePerso;
			if(!this.isVisibilidadFK_IdTipoReferenciaPersonal) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdTipoReferenciaPersonalReferenciaPersonal);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdCiudad=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdCiudadReferenciaPersonal);}

			this.isVisibilidadFK_IdCliente=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdClienteReferenciaPersonal);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdPaisReferenciaPersonal);}

			this.isVisibilidadFK_IdTipoReferenciaPersonal=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdTipoReferenciaPersonal) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdTipoReferenciaPersonalReferenciaPersonal);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadFK_IdCiudad=isParaCiudad;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdCiudadReferenciaPersonal);}

			this.isVisibilidadFK_IdCliente=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdClienteReferenciaPersonal);}

			this.isVisibilidadFK_IdPais=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdPaisReferenciaPersonal);}

			this.isVisibilidadFK_IdTipoReferenciaPersonal=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdTipoReferenciaPersonal) {this.jTabbedPaneBusquedasReferenciaPersonal.remove(jPanelFK_IdTipoReferenciaPersonalReferenciaPersonal);}
		}
		
	}
	
	
	
	

	public String registrarSesionReferenciaPersonalParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(referenciapersonalSessionBean==null) {
				referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(referenciapersonalSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.referenciapersonalFuncionGeneral.setCombosCodigoDesdeBusquedaidcliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ReferenciaPersonalConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionReferenciaPersonal(true);
			//clienteSessionBean.setlidReferenciaPersonalActual(this.idReferenciaPersonalActual);

			referenciapersonalSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyReferenciaPersonal(true);
			referenciapersonalSessionBean.setlIdReferenciaPersonalActualForeignKey(this.idReferenciaPersonalActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ReferenciaPersonalSessionBean referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
		
		if(this.referenciapersonalSessionBean==null) {
			this.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
		}
		
		this.referenciapersonalSessionBean.setsUltimaBusquedaReferenciaPersonal(this.getsAccionBusqueda());
		this.referenciapersonalSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.referenciapersonalSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
			referenciapersonalSessionBean.setidciudad(this.getidciudadFK_IdCiudad());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			referenciapersonalSessionBean.setidcliente(this.getidclienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			referenciapersonalSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			referenciapersonalSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoReferenciaPersonal")) {
			referenciapersonalSessionBean.setidvalorclientereferenciapersonal(this.getidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ReferenciaPersonalSessionBean referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
		
		if(this.referenciapersonalSessionBean==null) {
			this.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
		}
		
		if(this.referenciapersonalSessionBean.getsUltimaBusquedaReferenciaPersonal()!=null&&!this.referenciapersonalSessionBean.getsUltimaBusquedaReferenciaPersonal().equals("")) {
			this.setsAccionBusqueda(referenciapersonalSessionBean.getsUltimaBusquedaReferenciaPersonal());
			this.setiNumeroPaginacion(referenciapersonalSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(referenciapersonalSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
				this.setidciudadFK_IdCiudad(referenciapersonalSessionBean.getidciudad());
				referenciapersonalSessionBean.setidciudad(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setidclienteFK_IdCliente(referenciapersonalSessionBean.getidcliente());
				referenciapersonalSessionBean.setidcliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(referenciapersonalSessionBean.getid_empresa());
				referenciapersonalSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(referenciapersonalSessionBean.getid_pais());
				referenciapersonalSessionBean.setid_pais(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoReferenciaPersonal")) {
				this.setidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonal(referenciapersonalSessionBean.getidvalorclientereferenciapersonal());
				referenciapersonalSessionBean.setidvalorclientereferenciapersonal(-1L);
			}
		}
		
		this.referenciapersonalSessionBean.setsUltimaBusquedaReferenciaPersonal("");
		this.referenciapersonalSessionBean.setiNumeroPaginacion(ReferenciaPersonalConstantesFunciones.INUMEROPAGINACION);
		this.referenciapersonalSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaReferenciaPersonal(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioReferenciaPersonal() {
		this.updateBorderResaltarBusquedasFormularioReferenciaPersonal();
		this.updateVisibilidadBusquedasFormularioReferenciaPersonal();
		this.updateHabilitarBusquedasFormularioReferenciaPersonal();
	}
	
	public void updateBorderResaltarBusquedasFormularioReferenciaPersonal() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasReferenciaPersonal.getComponents().length>0) {
	

		if(this.referenciapersonalConstantesFunciones.resaltarFK_IdCiudadReferenciaPersonal!=null) {
			index= this.jTabbedPaneBusquedasReferenciaPersonal.indexOfComponent(this.jPanelFK_IdCiudadReferenciaPersonal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaPersonal.getComponent(index);
				jPanel.setBorder(this.referenciapersonalConstantesFunciones.resaltarFK_IdCiudadReferenciaPersonal);
			}
		}

		if(this.referenciapersonalConstantesFunciones.resaltarFK_IdClienteReferenciaPersonal!=null) {
			index= this.jTabbedPaneBusquedasReferenciaPersonal.indexOfComponent(this.jPanelFK_IdClienteReferenciaPersonal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaPersonal.getComponent(index);
				jPanel.setBorder(this.referenciapersonalConstantesFunciones.resaltarFK_IdClienteReferenciaPersonal);
			}
		}

		if(this.referenciapersonalConstantesFunciones.resaltarFK_IdPaisReferenciaPersonal!=null) {
			index= this.jTabbedPaneBusquedasReferenciaPersonal.indexOfComponent(this.jPanelFK_IdPaisReferenciaPersonal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaPersonal.getComponent(index);
				jPanel.setBorder(this.referenciapersonalConstantesFunciones.resaltarFK_IdPaisReferenciaPersonal);
			}
		}

		if(this.referenciapersonalConstantesFunciones.resaltarFK_IdTipoReferenciaPersonalReferenciaPersonal!=null) {
			index= this.jTabbedPaneBusquedasReferenciaPersonal.indexOfComponent(this.jPanelFK_IdTipoReferenciaPersonalReferenciaPersonal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaPersonal.getComponent(index);
				jPanel.setBorder(this.referenciapersonalConstantesFunciones.resaltarFK_IdTipoReferenciaPersonalReferenciaPersonal);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioReferenciaPersonal() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasReferenciaPersonal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasReferenciaPersonal.indexOfComponent(this.jPanelFK_IdCiudadReferenciaPersonal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaPersonal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.referenciapersonalConstantesFunciones.mostrarFK_IdCiudadReferenciaPersonal);
			if(!this.referenciapersonalConstantesFunciones.mostrarFK_IdCiudadReferenciaPersonal && index>-1) {
				this.jTabbedPaneBusquedasReferenciaPersonal.remove(index);
			}

			index= this.jTabbedPaneBusquedasReferenciaPersonal.indexOfComponent(this.jPanelFK_IdClienteReferenciaPersonal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaPersonal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.referenciapersonalConstantesFunciones.mostrarFK_IdClienteReferenciaPersonal);
			if(!this.referenciapersonalConstantesFunciones.mostrarFK_IdClienteReferenciaPersonal && index>-1) {
				this.jTabbedPaneBusquedasReferenciaPersonal.remove(index);
			}

			index= this.jTabbedPaneBusquedasReferenciaPersonal.indexOfComponent(this.jPanelFK_IdPaisReferenciaPersonal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaPersonal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.referenciapersonalConstantesFunciones.mostrarFK_IdPaisReferenciaPersonal);
			if(!this.referenciapersonalConstantesFunciones.mostrarFK_IdPaisReferenciaPersonal && index>-1) {
				this.jTabbedPaneBusquedasReferenciaPersonal.remove(index);
			}

			index= this.jTabbedPaneBusquedasReferenciaPersonal.indexOfComponent(this.jPanelFK_IdTipoReferenciaPersonalReferenciaPersonal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaPersonal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.referenciapersonalConstantesFunciones.mostrarFK_IdTipoReferenciaPersonalReferenciaPersonal);
			if(!this.referenciapersonalConstantesFunciones.mostrarFK_IdTipoReferenciaPersonalReferenciaPersonal && index>-1) {
				this.jTabbedPaneBusquedasReferenciaPersonal.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioReferenciaPersonal() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasReferenciaPersonal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasReferenciaPersonal.indexOfComponent(this.jPanelFK_IdCiudadReferenciaPersonal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaPersonal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.referenciapersonalConstantesFunciones.activarFK_IdCiudadReferenciaPersonal);
				this.jTabbedPaneBusquedasReferenciaPersonal.setEnabledAt(index,this.referenciapersonalConstantesFunciones.activarFK_IdCiudadReferenciaPersonal);
			}

			index= this.jTabbedPaneBusquedasReferenciaPersonal.indexOfComponent(this.jPanelFK_IdClienteReferenciaPersonal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaPersonal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.referenciapersonalConstantesFunciones.activarFK_IdClienteReferenciaPersonal);
				this.jTabbedPaneBusquedasReferenciaPersonal.setEnabledAt(index,this.referenciapersonalConstantesFunciones.activarFK_IdClienteReferenciaPersonal);
			}

			index= this.jTabbedPaneBusquedasReferenciaPersonal.indexOfComponent(this.jPanelFK_IdPaisReferenciaPersonal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaPersonal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.referenciapersonalConstantesFunciones.activarFK_IdPaisReferenciaPersonal);
				this.jTabbedPaneBusquedasReferenciaPersonal.setEnabledAt(index,this.referenciapersonalConstantesFunciones.activarFK_IdPaisReferenciaPersonal);
			}

			index= this.jTabbedPaneBusquedasReferenciaPersonal.indexOfComponent(this.jPanelFK_IdTipoReferenciaPersonalReferenciaPersonal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaPersonal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.referenciapersonalConstantesFunciones.activarFK_IdTipoReferenciaPersonalReferenciaPersonal);
				this.jTabbedPaneBusquedasReferenciaPersonal.setEnabledAt(index,this.referenciapersonalConstantesFunciones.activarFK_IdTipoReferenciaPersonalReferenciaPersonal);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaReferenciaPersonal(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCiudad")) {
			index= this.jTabbedPaneBusquedasReferenciaPersonal.indexOfComponent(this.jPanelFK_IdCiudadReferenciaPersonal);

			this.jTabbedPaneBusquedasReferenciaPersonal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaPersonal.getComponent(index);

			this.referenciapersonalConstantesFunciones.setResaltarFK_IdCiudadReferenciaPersonal(resaltar);

			jPanel.setBorder(this.referenciapersonalConstantesFunciones.resaltarFK_IdCiudadReferenciaPersonal);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasReferenciaPersonal.indexOfComponent(this.jPanelFK_IdClienteReferenciaPersonal);

			this.jTabbedPaneBusquedasReferenciaPersonal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaPersonal.getComponent(index);

			this.referenciapersonalConstantesFunciones.setResaltarFK_IdClienteReferenciaPersonal(resaltar);

			jPanel.setBorder(this.referenciapersonalConstantesFunciones.resaltarFK_IdClienteReferenciaPersonal);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasReferenciaPersonal.indexOfComponent(this.jPanelFK_IdPaisReferenciaPersonal);

			this.jTabbedPaneBusquedasReferenciaPersonal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaPersonal.getComponent(index);

			this.referenciapersonalConstantesFunciones.setResaltarFK_IdPaisReferenciaPersonal(resaltar);

			jPanel.setBorder(this.referenciapersonalConstantesFunciones.resaltarFK_IdPaisReferenciaPersonal);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoReferenciaPersonal")) {
			index= this.jTabbedPaneBusquedasReferenciaPersonal.indexOfComponent(this.jPanelFK_IdTipoReferenciaPersonalReferenciaPersonal);

			this.jTabbedPaneBusquedasReferenciaPersonal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaPersonal.getComponent(index);

			this.referenciapersonalConstantesFunciones.setResaltarFK_IdTipoReferenciaPersonalReferenciaPersonal(resaltar);

			jPanel.setBorder(this.referenciapersonalConstantesFunciones.resaltarFK_IdTipoReferenciaPersonalReferenciaPersonal);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarReferenciaPersonal.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioReferenciaPersonal() throws Exception {

		if(this.jInternalFrameDetalleFormReferenciaPersonal==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioReferenciaPersonal();
		this.updateVisibilidadResaltarControlesFormularioReferenciaPersonal();
		this.updateHabilitarResaltarControlesFormularioReferenciaPersonal();
		
	}
	
	public void updateBorderResaltarControlesFormularioReferenciaPersonal() throws Exception {
		if(this.jInternalFrameDetalleFormReferenciaPersonal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.referenciapersonalConstantesFunciones.resaltaridReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltaridReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltarid_empresaReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_empresaReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltarid_empresaReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltaridclienteReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidclienteReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltaridclienteReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltaridvalorclientereferenciapersonalReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltaridvalorclientereferenciapersonalReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltarid_paisReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltarid_paisReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltaridciudadReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidciudadReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltaridciudadReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltarnombreReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreanombreReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltarnombreReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltaridentificacionReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jTextFieldidentificacionReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltaridentificacionReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltarfecha_nacimientoReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jDateChooserfecha_nacimientoReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltarfecha_nacimientoReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltardireccionReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreadireccionReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltardireccionReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltartelefonoReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefonoReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltartelefonoReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltartelefonomovilReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefonomovilReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltartelefonomovilReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltartelefonocodigoareaReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jTextFieldtelefonocodigoareaReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltartelefonocodigoareaReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltarpreferenciaReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreapreferenciaReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltarpreferenciaReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltaremailReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaemailReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltaremailReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltarobservacionReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaobservacionReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltarobservacionReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltaresta_trabajandoReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesta_trabajandoReferenciaPersonal.setBorderPainted(true);this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesta_trabajandoReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltaresta_trabajandoReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltarempresa_trabajoReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaempresa_trabajoReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltarempresa_trabajoReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltardireccion_trabajoReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreadireccion_trabajoReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltardireccion_trabajoReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltartelefono_trabajoReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefono_trabajoReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltartelefono_trabajoReferenciaPersonal);}
		if(this.referenciapersonalConstantesFunciones.resaltaresactivoReferenciaPersonal!=null && this.jInternalFrameDetalleFormReferenciaPersonal!=null) {this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesactivoReferenciaPersonal.setBorderPainted(true);this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesactivoReferenciaPersonal.setBorder(this.referenciapersonalConstantesFunciones.resaltaresactivoReferenciaPersonal);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioReferenciaPersonal() throws Exception {		
		if(this.jInternalFrameDetalleFormReferenciaPersonal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
	
		//this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostraridReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPanelidReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostraridReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_empresaReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrarid_empresaReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPanelid_empresaReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrarid_empresaReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidclienteReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostraridclienteReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPanelidclienteReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostraridclienteReferenciaPersonal);
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidclienteReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostraridclienteReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostraridvalorclientereferenciapersonalReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPanelidvalorclientereferenciapersonalReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostraridvalorclientereferenciapersonalReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrarid_paisReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPanelid_paisReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrarid_paisReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidciudadReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostraridciudadReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPanelidciudadReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostraridciudadReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreanombreReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrarnombreReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPanelnombreReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrarnombreReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jTextFieldidentificacionReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostraridentificacionReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPanelidentificacionReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostraridentificacionReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jDateChooserfecha_nacimientoReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrarfecha_nacimientoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPanelfecha_nacimientoReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrarfecha_nacimientoReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreadireccionReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrardireccionReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPaneldireccionReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrardireccionReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefonoReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrartelefonoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPaneltelefonoReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrartelefonoReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefonomovilReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrartelefonomovilReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPaneltelefonomovilReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrartelefonomovilReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jTextFieldtelefonocodigoareaReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrartelefonocodigoareaReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPaneltelefonocodigoareaReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrartelefonocodigoareaReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreapreferenciaReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrarpreferenciaReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPanelpreferenciaReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrarpreferenciaReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaemailReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostraremailReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPanelemailReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostraremailReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaobservacionReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrarobservacionReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPanelobservacionReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrarobservacionReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesta_trabajandoReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostraresta_trabajandoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPanelesta_trabajandoReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostraresta_trabajandoReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaempresa_trabajoReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrarempresa_trabajoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPanelempresa_trabajoReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrarempresa_trabajoReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreadireccion_trabajoReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrardireccion_trabajoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPaneldireccion_trabajoReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrardireccion_trabajoReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefono_trabajoReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrartelefono_trabajoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPaneltelefono_trabajoReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostrartelefono_trabajoReferenciaPersonal);
		//this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesactivoReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostraresactivoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jPanelesactivoReferenciaPersonal.setVisible(this.referenciapersonalConstantesFunciones.mostraresactivoReferenciaPersonal);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioReferenciaPersonal() throws Exception {
		if(this.jInternalFrameDetalleFormReferenciaPersonal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormReferenciaPersonal!=null) {
	
		this.jInternalFrameDetalleFormReferenciaPersonal.jLabelidReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activaridReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_empresaReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activarid_empresaReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidclienteReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activaridclienteReferenciaPersonal);
			this.jInternalFrameDetalleFormReferenciaPersonal.jButtonidclienteReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activaridclienteReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activaridvalorclientereferenciapersonalReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxid_paisReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activarid_paisReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jComboBoxidciudadReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activaridciudadReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreanombreReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activarnombreReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextFieldidentificacionReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activaridentificacionReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jDateChooserfecha_nacimientoReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activarfecha_nacimientoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreadireccionReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activardireccionReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefonoReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activartelefonoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefonomovilReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activartelefonomovilReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextFieldtelefonocodigoareaReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activartelefonocodigoareaReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreapreferenciaReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activarpreferenciaReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaemailReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activaremailReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaobservacionReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activarobservacionReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesta_trabajandoReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activaresta_trabajandoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreaempresa_trabajoReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activarempresa_trabajoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreadireccion_trabajoReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activardireccion_trabajoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jTextAreatelefono_trabajoReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activartelefono_trabajoReferenciaPersonal);
		this.jInternalFrameDetalleFormReferenciaPersonal.jCheckBoxesactivoReferenciaPersonal.setEnabled(this.referenciapersonalConstantesFunciones.activaresactivoReferenciaPersonal);
		}
	}
	
		
}