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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.puntoventa.util.FacturaDescuadradaConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.FacturaDescuadradaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.FacturaDescuadradaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.report.FacturaDescuadradaBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.puntoventa.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.puntoventa.util.*;

import com.bydan.erp.puntoventa.util.report.*;
import com.bydan.erp.puntoventa.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.report.*;
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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;

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
public class FacturaDescuadradaBeanSwingJInternalFrame extends FacturaDescuadradaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FacturaDescuadradaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FacturaDescuadrada> facturadescuadradaValidator = new ClassValidator<FacturaDescuadrada>(FacturaDescuadrada.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FacturaDescuadrada facturadescuadrada;	
	public FacturaDescuadrada facturadescuadradaAux;
	public FacturaDescuadrada facturadescuadradaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FacturaDescuadrada facturadescuadradaTotales;
	public Long idFacturaDescuadradaActual;
	public Long iIdNuevoFacturaDescuadrada=0L;
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
	
	public Boolean isPermisoTodoFacturaDescuadrada;
	public Boolean isPermisoNuevoFacturaDescuadrada;
	public Boolean isPermisoActualizarFacturaDescuadrada;
	public Boolean isPermisoActualizarOriginalFacturaDescuadrada;
	public Boolean isPermisoEliminarFacturaDescuadrada;
	public Boolean isPermisoGuardarCambiosFacturaDescuadrada;
	public Boolean isPermisoConsultaFacturaDescuadrada;
	public Boolean isPermisoBusquedaFacturaDescuadrada;
	public Boolean isPermisoReporteFacturaDescuadrada;
	public Boolean isPermisoPaginacionMedioFacturaDescuadrada;
	public Boolean isPermisoPaginacionAltoFacturaDescuadrada;
	public Boolean isPermisoPaginacionTodoFacturaDescuadrada;
	public Boolean isPermisoCopiarFacturaDescuadrada;
	public Boolean isPermisoVerFormFacturaDescuadrada;
	public Boolean isPermisoDuplicarFacturaDescuadrada;
	public Boolean isPermisoOrdenFacturaDescuadrada;
	
	
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
	
	public FacturaDescuadradaParameterReturnGeneral facturadescuadradaReturnGeneral;
	public FacturaDescuadradaParameterReturnGeneral facturadescuadradaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFacturaDescuadrada=false;
	public Boolean esParaAccionDesdeFormularioFacturaDescuadrada=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FacturaDescuadradaSessionBeanAdditional facturadescuadradaSessionBeanAdditional=null;
	
	public FacturaDescuadradaSessionBeanAdditional getFacturaDescuadradaSessionBeanAdditional() {
		return this.facturadescuadradaSessionBeanAdditional;
	}
	
	public void setFacturaDescuadradaSessionBeanAdditional(FacturaDescuadradaSessionBeanAdditional facturadescuadradaSessionBeanAdditional) {
		try {
			this.facturadescuadradaSessionBeanAdditional=facturadescuadradaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FacturaDescuadradaBeanSwingJInternalFrameAdditional facturadescuadradaBeanSwingJInternalFrameAdditional=null;
	//public class FacturaDescuadradaBeanSwingJInternalFrame
	
	public FacturaDescuadradaBeanSwingJInternalFrameAdditional getFacturaDescuadradaBeanSwingJInternalFrameAdditional() {
		return this.facturadescuadradaBeanSwingJInternalFrameAdditional;
	}
	
	public void setFacturaDescuadradaBeanSwingJInternalFrameAdditional(FacturaDescuadradaBeanSwingJInternalFrameAdditional facturadescuadradaBeanSwingJInternalFrameAdditional) {
		try {
			this.facturadescuadradaBeanSwingJInternalFrameAdditional=facturadescuadradaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FacturaDescuadradaLogic facturadescuadradaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FacturaDescuadrada facturadescuadradaBean;
	public FacturaDescuadradaConstantesFunciones facturadescuadradaConstantesFunciones;
	//public FacturaDescuadradaParameterReturnGeneral facturadescuadradaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<FacturaDescuadrada> facturadescuadradas;	
	//public List<FacturaDescuadrada> facturadescuadradasEliminados;
	//public List<FacturaDescuadrada> facturadescuadradasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFacturaDescuadrada=false;
	public Boolean isVisibilidadCeldaDuplicarFacturaDescuadrada=true;
	public Boolean isVisibilidadCeldaCopiarFacturaDescuadrada=true;
	public Boolean isVisibilidadCeldaVerFormFacturaDescuadrada=true;
	public Boolean isVisibilidadCeldaOrdenFacturaDescuadrada=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada=false;
	public Boolean isVisibilidadCeldaModificarFacturaDescuadrada=false;
	public Boolean isVisibilidadCeldaActualizarFacturaDescuadrada=false;
	public Boolean isVisibilidadCeldaEliminarFacturaDescuadrada=false;
	public Boolean isVisibilidadCeldaCancelarFacturaDescuadrada=false;
	public Boolean isVisibilidadCeldaGuardarFacturaDescuadrada=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFacturaDescuadrada=false;	
	
	
	public Boolean isVisibilidadBusquedaFacturaDescuadrada=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoFacturaDescuadrada() {
		return this.iIdNuevoFacturaDescuadrada;
	}

	public void setiIdNuevoFacturaDescuadrada(Long iIdNuevoFacturaDescuadrada) {
		this.iIdNuevoFacturaDescuadrada = iIdNuevoFacturaDescuadrada;
	}
	
	public Long getidFacturaDescuadradaActual() {
		return this.idFacturaDescuadradaActual;
	}

	public void setidFacturaDescuadradaActual(Long idFacturaDescuadradaActual) {
		this.idFacturaDescuadradaActual = idFacturaDescuadradaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FacturaDescuadrada getfacturadescuadrada() {
		return this.facturadescuadrada;
	}

	public void setfacturadescuadrada(FacturaDescuadrada facturadescuadrada) {
		this.facturadescuadrada = facturadescuadrada;
	}
	
	public FacturaDescuadrada getfacturadescuadradaAux() {
		return this.facturadescuadradaAux;
	}

	public void setfacturadescuadradaAux(FacturaDescuadrada facturadescuadradaAux) {
		this.facturadescuadradaAux = facturadescuadradaAux;
	}				
	
	public FacturaDescuadrada getfacturadescuadradaAnterior() {
		return this.facturadescuadradaAnterior;
	}

	public void setfacturadescuadradaAnterior(FacturaDescuadrada facturadescuadradaAnterior) {
		this.facturadescuadradaAnterior = facturadescuadradaAnterior;
	}	
	
	public FacturaDescuadrada getfacturadescuadradaTotales() {
		return this.facturadescuadradaTotales;
	}

	public void setfacturadescuadradaTotales(FacturaDescuadrada facturadescuadradaTotales) {
		this.facturadescuadradaTotales = facturadescuadradaTotales;
	}	
	
	public FacturaDescuadrada getfacturadescuadradaBean() {
		return this.facturadescuadradaBean;
	}

	public void setfacturadescuadradaBean(FacturaDescuadrada facturadescuadradaBean) {
		this.facturadescuadradaBean = facturadescuadradaBean;
	}	
	
	public FacturaDescuadradaParameterReturnGeneral getfacturadescuadradaReturnGeneral() {
		return this.facturadescuadradaReturnGeneral;
	}

	public void setfacturadescuadradaReturnGeneral(FacturaDescuadradaParameterReturnGeneral facturadescuadradaReturnGeneral) {
		this.facturadescuadradaReturnGeneral = facturadescuadradaReturnGeneral;
	}	
	
	
	public Date fecha_inicioBusquedaFacturaDescuadrada=new Date();

	public Date getfecha_inicioBusquedaFacturaDescuadrada() {
		return this.fecha_inicioBusquedaFacturaDescuadrada;
	}

	public void setfecha_inicioBusquedaFacturaDescuadrada(Date fecha_inicioBusquedaFacturaDescuadrada) {
		this.fecha_inicioBusquedaFacturaDescuadrada = fecha_inicioBusquedaFacturaDescuadrada;
	}

;
	public Date fecha_finBusquedaFacturaDescuadrada=new Date();

	public Date getfecha_finBusquedaFacturaDescuadrada() {
		return this.fecha_finBusquedaFacturaDescuadrada;
	}

	public void setfecha_finBusquedaFacturaDescuadrada(Date fecha_finBusquedaFacturaDescuadrada) {
		this.fecha_finBusquedaFacturaDescuadrada = fecha_finBusquedaFacturaDescuadrada;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public FacturaDescuadradaLogic getFacturaDescuadradaLogic()	{		
		return facturadescuadradaLogic;
	}

	public void setFacturaDescuadradaLogic(FacturaDescuadradaLogic facturadescuadradaLogic) {
		this.facturadescuadradaLogic = facturadescuadradaLogic;
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
	
	public Boolean getIsEsNuevoFacturaDescuadrada() {
		return isEsNuevoFacturaDescuadrada;
	}

	public void setIsEsNuevoFacturaDescuadrada(Boolean isEsNuevoFacturaDescuadrada) {
		this.isEsNuevoFacturaDescuadrada = isEsNuevoFacturaDescuadrada;
	}

	public Boolean getEsParaAccionDesdeFormularioFacturaDescuadrada() {
		return esParaAccionDesdeFormularioFacturaDescuadrada;
	}
	
	public void setEsParaAccionDesdeFormularioFacturaDescuadrada(Boolean esParaAccionDesdeFormularioFacturaDescuadrada) {
		this.esParaAccionDesdeFormularioFacturaDescuadrada = esParaAccionDesdeFormularioFacturaDescuadrada;
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

			if(this.facturadescuadradaSessionBean==null) {
				this.facturadescuadradaSessionBean=new FacturaDescuadradaSessionBean();
			}

			if(!this.facturadescuadradaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(facturadescuadradaSessionBean.getlidEmpresaActual());
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

					if(this.facturadescuadrada!=null) {
						this.facturadescuadrada.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
						this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxid_empresaFacturaDescuadrada.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFacturaDescuadrada.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
						if(this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxid_empresaFacturaDescuadrada.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxid_empresaFacturaDescuadrada.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFacturaDescuadradaGenerico)throws Exception
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
				jComboBoxid_empresaFacturaDescuadradaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFacturaDescuadradaGenerico!=null && jComboBoxid_empresaFacturaDescuadradaGenerico.getItemCount()>0) {
					jComboBoxid_empresaFacturaDescuadradaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FacturaDescuadrada facturadescuadrada,JComboBox jComboBoxid_empresaFacturaDescuadradaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFacturaDescuadradaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxid_empresaFacturaDescuadrada.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFacturaDescuadradaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				facturadescuadrada.setid_empresa(empresaAux.getId());
				facturadescuadrada.setempresa_descripcion(FacturaDescuadradaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				facturadescuadrada.setEmpresa(empresaAux);			}
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

					if(!FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { 
							this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxid_empresaFacturaDescuadrada.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxid_empresaFacturaDescuadrada.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { 
					}

					if(!FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
							this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxid_empresaFacturaDescuadrada.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
							this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxid_empresaFacturaDescuadrada.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesFacturaDescuadrada() throws Exception {
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
		
	public FacturaDescuadradaParameterReturnGeneral getFacturaDescuadradaParameterGeneral() {
		return this.facturadescuadradaParameterGeneral;
	}
	
	public void setFacturaDescuadradaParameterGeneral(FacturaDescuadradaParameterReturnGeneral facturadescuadradaParameterGeneral) {
		this.facturadescuadradaParameterGeneral = facturadescuadradaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFacturaDescuadrada() {
		return isPermisoTodoFacturaDescuadrada;
	}

	public void setIsPermisoTodoFacturaDescuadrada(Boolean isPermisoTodoFacturaDescuadrada) {
		this.isPermisoTodoFacturaDescuadrada = isPermisoTodoFacturaDescuadrada;
	}

	public Boolean getIsPermisoNuevoFacturaDescuadrada() {
		return isPermisoNuevoFacturaDescuadrada;
	}

	public void setIsPermisoNuevoFacturaDescuadrada(Boolean isPermisoNuevoFacturaDescuadrada) {
		this.isPermisoNuevoFacturaDescuadrada = isPermisoNuevoFacturaDescuadrada;
	}

	public Boolean getIsPermisoActualizarFacturaDescuadrada() {
		return isPermisoActualizarFacturaDescuadrada;
	}

	public void setIsPermisoActualizarFacturaDescuadrada(Boolean isPermisoActualizarFacturaDescuadrada) {
		this.isPermisoActualizarFacturaDescuadrada = isPermisoActualizarFacturaDescuadrada;
	}

	public Boolean getIsPermisoEliminarFacturaDescuadrada() {
		return isPermisoEliminarFacturaDescuadrada;
	}

	public void setIsPermisoEliminarFacturaDescuadrada(Boolean isPermisoEliminarFacturaDescuadrada) {
		this.isPermisoEliminarFacturaDescuadrada = isPermisoEliminarFacturaDescuadrada;
	}

	public Boolean getIsPermisoGuardarCambiosFacturaDescuadrada() {
		return isPermisoGuardarCambiosFacturaDescuadrada;
	}

	public void setIsPermisoGuardarCambiosFacturaDescuadrada(Boolean isPermisoGuardarCambiosFacturaDescuadrada) {
		this.isPermisoGuardarCambiosFacturaDescuadrada = isPermisoGuardarCambiosFacturaDescuadrada;
	}
	
	public Boolean getIsPermisoConsultaFacturaDescuadrada() {
		return isPermisoConsultaFacturaDescuadrada;
	}

	public void setIsPermisoConsultaFacturaDescuadrada(Boolean isPermisoConsultaFacturaDescuadrada) {
		this.isPermisoConsultaFacturaDescuadrada = isPermisoConsultaFacturaDescuadrada;
	}

	public Boolean getIsPermisoBusquedaFacturaDescuadrada() {
		return isPermisoBusquedaFacturaDescuadrada;
	}

	public void setIsPermisoBusquedaFacturaDescuadrada(Boolean isPermisoBusquedaFacturaDescuadrada) {
		this.isPermisoBusquedaFacturaDescuadrada = isPermisoBusquedaFacturaDescuadrada;
	}

	public Boolean getIsPermisoReporteFacturaDescuadrada() {
		return isPermisoReporteFacturaDescuadrada;
	}

	public void setIsPermisoReporteFacturaDescuadrada(Boolean isPermisoReporteFacturaDescuadrada) {
		this.isPermisoReporteFacturaDescuadrada = isPermisoReporteFacturaDescuadrada;
	}
	
	public Boolean getIsPermisoPaginacionMedioFacturaDescuadrada() {
		return isPermisoPaginacionMedioFacturaDescuadrada;
	}

	public void setIsPermisoPaginacionMedioFacturaDescuadrada(Boolean isPermisoPaginacionMedioFacturaDescuadrada) {
		this.isPermisoPaginacionMedioFacturaDescuadrada = isPermisoPaginacionMedioFacturaDescuadrada;
	}
	
	public Boolean getIsPermisoPaginacionTodoFacturaDescuadrada() {
		return isPermisoPaginacionTodoFacturaDescuadrada;
	}

	public void setIsPermisoPaginacionTodoFacturaDescuadrada(Boolean isPermisoPaginacionTodoFacturaDescuadrada) {
		this.isPermisoPaginacionTodoFacturaDescuadrada = isPermisoPaginacionTodoFacturaDescuadrada;
	}
	
	public Boolean getIsPermisoPaginacionAltoFacturaDescuadrada() {
		return isPermisoPaginacionAltoFacturaDescuadrada;
	}

	public void setIsPermisoPaginacionAltoFacturaDescuadrada(Boolean isPermisoPaginacionAltoFacturaDescuadrada) {
		this.isPermisoPaginacionAltoFacturaDescuadrada = isPermisoPaginacionAltoFacturaDescuadrada;
	}
	
	public Boolean getIsPermisoCopiarFacturaDescuadrada() {
		return isPermisoCopiarFacturaDescuadrada;
	}

	public void setIsPermisoCopiarFacturaDescuadrada(Boolean isPermisoCopiarFacturaDescuadrada) {
		this.isPermisoCopiarFacturaDescuadrada = isPermisoCopiarFacturaDescuadrada;
	}
	
	public Boolean getIsPermisoVerFormFacturaDescuadrada() {
		return isPermisoVerFormFacturaDescuadrada;
	}

	public void setIsPermisoVerFormFacturaDescuadrada(Boolean isPermisoVerFormFacturaDescuadrada) {
		this.isPermisoVerFormFacturaDescuadrada = isPermisoVerFormFacturaDescuadrada;
	}
	
	public Boolean getIsPermisoDuplicarFacturaDescuadrada() {
		return isPermisoDuplicarFacturaDescuadrada;
	}

	public void setIsPermisoDuplicarFacturaDescuadrada(Boolean isPermisoDuplicarFacturaDescuadrada) {
		this.isPermisoDuplicarFacturaDescuadrada = isPermisoDuplicarFacturaDescuadrada;
	}
	
	public Boolean getIsPermisoOrdenFacturaDescuadrada() {
		return isPermisoOrdenFacturaDescuadrada;
	}

	public void setIsPermisoOrdenFacturaDescuadrada(Boolean isPermisoOrdenFacturaDescuadrada) {
		this.isPermisoOrdenFacturaDescuadrada = isPermisoOrdenFacturaDescuadrada;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFacturaDescuadrada() {
		return isVisibilidadCeldaNuevoFacturaDescuadrada;
	}

	public void setIsVisibilidadCeldaNuevoFacturaDescuadrada(Boolean isVisibilidadCeldaNuevoFacturaDescuadrada) {
		this.isVisibilidadCeldaNuevoFacturaDescuadrada = isVisibilidadCeldaNuevoFacturaDescuadrada;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFacturaDescuadrada() {
		return isVisibilidadCeldaDuplicarFacturaDescuadrada;
	}

	public void setIsVisibilidadCeldaDuplicarFacturaDescuadrada(Boolean isVisibilidadCeldaDuplicarFacturaDescuadrada) {
		this.isVisibilidadCeldaDuplicarFacturaDescuadrada = isVisibilidadCeldaDuplicarFacturaDescuadrada;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFacturaDescuadrada() {
		return isVisibilidadCeldaCopiarFacturaDescuadrada;
	}

	public void setIsVisibilidadCeldaCopiarFacturaDescuadrada(Boolean isVisibilidadCeldaCopiarFacturaDescuadrada) {
		this.isVisibilidadCeldaCopiarFacturaDescuadrada = isVisibilidadCeldaCopiarFacturaDescuadrada;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFacturaDescuadrada() {
		return isVisibilidadCeldaVerFormFacturaDescuadrada;
	}

	public void setIsVisibilidadCeldaVerFormFacturaDescuadrada(Boolean isVisibilidadCeldaVerFormFacturaDescuadrada) {
		this.isVisibilidadCeldaVerFormFacturaDescuadrada = isVisibilidadCeldaVerFormFacturaDescuadrada;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFacturaDescuadrada() {
		return isVisibilidadCeldaOrdenFacturaDescuadrada;
	}

	public void setIsVisibilidadCeldaOrdenFacturaDescuadrada(Boolean isVisibilidadCeldaOrdenFacturaDescuadrada) {
		this.isVisibilidadCeldaOrdenFacturaDescuadrada = isVisibilidadCeldaOrdenFacturaDescuadrada;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFacturaDescuadrada() {
		return isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFacturaDescuadrada(Boolean isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada) {
		this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada = isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFacturaDescuadrada() {
		return isVisibilidadCeldaModificarFacturaDescuadrada;
	}

	public void setIsVisibilidadCeldaModificarFacturaDescuadrada(Boolean isVisibilidadCeldaModificarFacturaDescuadrada) {
		this.isVisibilidadCeldaModificarFacturaDescuadrada = isVisibilidadCeldaModificarFacturaDescuadrada;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFacturaDescuadrada() {
		return isVisibilidadCeldaActualizarFacturaDescuadrada;
	}

	public void setIsVisibilidadCeldaActualizarFacturaDescuadrada(Boolean isVisibilidadCeldaActualizarFacturaDescuadrada) {
		this.isVisibilidadCeldaActualizarFacturaDescuadrada = isVisibilidadCeldaActualizarFacturaDescuadrada;
	}

	public Boolean getIsVisibilidadCeldaEliminarFacturaDescuadrada() {
		return isVisibilidadCeldaEliminarFacturaDescuadrada;
	}

	public void setIsVisibilidadCeldaEliminarFacturaDescuadrada(Boolean isVisibilidadCeldaEliminarFacturaDescuadrada) {
		this.isVisibilidadCeldaEliminarFacturaDescuadrada = isVisibilidadCeldaEliminarFacturaDescuadrada;
	}

	public Boolean getIsVisibilidadCeldaCancelarFacturaDescuadrada() {
		return isVisibilidadCeldaCancelarFacturaDescuadrada;
	}

	public void setIsVisibilidadCeldaCancelarFacturaDescuadrada(Boolean isVisibilidadCeldaCancelarFacturaDescuadrada) {
		this.isVisibilidadCeldaCancelarFacturaDescuadrada = isVisibilidadCeldaCancelarFacturaDescuadrada;
	}

	public Boolean getIsVisibilidadCeldaGuardarFacturaDescuadrada() {
		return isVisibilidadCeldaGuardarFacturaDescuadrada;
	}

	public void setIsVisibilidadCeldaGuardarFacturaDescuadrada(Boolean isVisibilidadCeldaGuardarFacturaDescuadrada) {
		this.isVisibilidadCeldaGuardarFacturaDescuadrada = isVisibilidadCeldaGuardarFacturaDescuadrada;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFacturaDescuadrada() {
		return isVisibilidadCeldaGuardarCambiosFacturaDescuadrada;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFacturaDescuadrada(Boolean isVisibilidadCeldaGuardarCambiosFacturaDescuadrada) {
		this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada = isVisibilidadCeldaGuardarCambiosFacturaDescuadrada;
	}
		
	public FacturaDescuadradaSessionBean getfacturadescuadradaSessionBean() {
		return this.facturadescuadradaSessionBean;
	}
	
	public void setfacturadescuadradaSessionBean(FacturaDescuadradaSessionBean facturadescuadradaSessionBean) {
		this.facturadescuadradaSessionBean=facturadescuadradaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaFacturaDescuadrada() {
		return this.isVisibilidadBusquedaFacturaDescuadrada;
	}

	public void setisVisibilidadBusquedaFacturaDescuadrada(Boolean isVisibilidadBusquedaFacturaDescuadrada) {
		this.isVisibilidadBusquedaFacturaDescuadrada=isVisibilidadBusquedaFacturaDescuadrada;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(FacturaDescuadrada facturadescuadrada)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(facturadescuadrada,null);
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
	
	public void bugActualizarReferenciaActual(FacturaDescuadrada facturadescuadrada,FacturaDescuadrada facturadescuadradaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFacturaDescuadrada(facturadescuadrada);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		facturadescuadradaAux.setId(facturadescuadrada.getId());
		facturadescuadradaAux.setVersionRow(facturadescuadrada.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(FacturaDescuadrada facturadescuadradaLocal) throws Exception {
		
		if(this.facturadescuadradaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FacturaDescuadrada facturadescuadradaLocal) throws Exception {	
		if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				facturadescuadradaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFacturaDescuadradaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = facturadescuadradaValidator.getInvalidValues(this.facturadescuadrada);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FacturaDescuadrada facturadescuadrada,List<FacturaDescuadrada> facturadescuadradas) throws Exception {
	}		
	
	public void actualizarSelectedLista(FacturaDescuadrada facturadescuadrada,List<FacturaDescuadrada> facturadescuadradas) throws Exception {
		try	{			
			FacturaDescuadradaConstantesFunciones.actualizarSelectedLista(facturadescuadrada,facturadescuadradas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FacturaDescuadrada> facturadescuadradasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				facturadescuadradasLocal=this.facturadescuadradaLogic.getFacturaDescuadradas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				facturadescuadradasLocal=this.facturadescuadradas;
			}
			//ARCHITECTURE
		
			for(FacturaDescuadrada facturadescuadradaLocal:facturadescuadradasLocal) {
				if(this.permiteMantenimiento(facturadescuadradaLocal) && facturadescuadradaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FacturaDescuadradaConstantesFunciones.getFacturaDescuadradaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FacturaDescuadradaConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelsecuencialFacturaDescuadrada,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDescuadradaConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelfechaFacturaDescuadrada,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDescuadradaConstantesFunciones.SUBTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelsubtotalFacturaDescuadrada,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDescuadradaConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelivaFacturaDescuadrada,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDescuadradaConstantesFunciones.DESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabeldescuentoFacturaDescuadrada,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDescuadradaConstantesFunciones.FINANCIAMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelfinanciamientoFacturaDescuadrada,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDescuadradaConstantesFunciones.FLETE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelfleteFacturaDescuadrada,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDescuadradaConstantesFunciones.ICE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabeliceFacturaDescuadrada,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDescuadradaConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabeltotalFacturaDescuadrada,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDescuadradaConstantesFunciones.TOTALFORMASPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabeltotal_formas_pagoFacturaDescuadrada,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDescuadradaConstantesFunciones.DESCUENTOREAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabeldescuento_realFacturaDescuadrada,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelsecuencialFacturaDescuadrada,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelfechaFacturaDescuadrada,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelsubtotalFacturaDescuadrada,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelivaFacturaDescuadrada,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabeldescuentoFacturaDescuadrada,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelfinanciamientoFacturaDescuadrada,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelfleteFacturaDescuadrada,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabeliceFacturaDescuadrada,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabeltotalFacturaDescuadrada,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabeltotal_formas_pagoFacturaDescuadrada,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabeldescuento_realFacturaDescuadrada,"");
		
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
		this.iIdNuevoFacturaDescuadrada--;	
		
		
		this.facturadescuadradaAux=new FacturaDescuadrada();
		
		this.facturadescuadradaAux.setId(this.iIdNuevoFacturaDescuadrada);
		this.facturadescuadradaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturadescuadradaLogic.getFacturaDescuadradas().add(this.facturadescuadradaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.facturadescuadradas.add(this.facturadescuadradaAux);
		}
		//ARCHITECTURE
		
		this.facturadescuadrada=this.facturadescuadradaAux;
		
		if(FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFacturaDescuadrada(this.facturadescuadrada);
			this.setVariablesObjetoActualToFormularioForeignKeyFacturaDescuadrada(this.facturadescuadrada);
		}
				
		//this.setDefaultControlesFacturaDescuadrada();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFacturaDescuadrada();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFacturaDescuadrada();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturaDescuadrada();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturaDescuadrada(this.facturadescuadradaBean,this.facturadescuadrada,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFacturaDescuadrada(this.facturadescuadradaReturnGeneral,this.facturadescuadradaBean,false);
		
		if(this.facturadescuadradaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFacturaDescuadrada(this.facturadescuadradaReturnGeneral.getFacturaDescuadrada());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFacturaDescuadrada(this.facturadescuadradaReturnGeneral.getFacturaDescuadrada());
		}
		
		if(this.facturadescuadradaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFacturaDescuadrada(this.facturadescuadradaReturnGeneral.getFacturaDescuadrada(),classes);//this.facturadescuadradaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFacturaDescuadrada();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFacturaDescuadrada();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.RecargarFormFacturaDescuadrada(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFacturaDescuadrada(false);
						
			if(facturadescuadradaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturaDescuadrada();
			}
			
			this.actualizarVisualTableDatosFacturaDescuadrada();
			
			this.jTableDatosFacturaDescuadrada.setRowSelectionInterval(this.getIndiceNuevoFacturaDescuadrada(), this.getIndiceNuevoFacturaDescuadrada());
			
			this.seleccionarFilaTablaFacturaDescuadradaActual();
						
			this.actualizarEstadoCeldasBotonesFacturaDescuadrada("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFacturaDescuadrada(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFacturaDescuadrada.jDateChooserfecha_inicioFacturaDescuadrada.setEnabled(isHabilitar && this.facturadescuadradaConstantesFunciones.activarfecha_inicioFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jDateChooserfecha_finFacturaDescuadrada.setEnabled(isHabilitar && this.facturadescuadradaConstantesFunciones.activarfecha_finFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldsecuencialFacturaDescuadrada.setEnabled(isHabilitar && this.facturadescuadradaConstantesFunciones.activarsecuencialFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jDateChooserfechaFacturaDescuadrada.setEnabled(isHabilitar && this.facturadescuadradaConstantesFunciones.activarfechaFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldsubtotalFacturaDescuadrada.setEnabled(isHabilitar && this.facturadescuadradaConstantesFunciones.activarsubtotalFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldivaFacturaDescuadrada.setEnabled(isHabilitar && this.facturadescuadradaConstantesFunciones.activarivaFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFielddescuentoFacturaDescuadrada.setEnabled(isHabilitar && this.facturadescuadradaConstantesFunciones.activardescuentoFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldfinanciamientoFacturaDescuadrada.setEnabled(isHabilitar && this.facturadescuadradaConstantesFunciones.activarfinanciamientoFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldfleteFacturaDescuadrada.setEnabled(isHabilitar && this.facturadescuadradaConstantesFunciones.activarfleteFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldiceFacturaDescuadrada.setEnabled(isHabilitar && this.facturadescuadradaConstantesFunciones.activariceFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldtotalFacturaDescuadrada.setEnabled(isHabilitar && this.facturadescuadradaConstantesFunciones.activartotalFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldtotal_formas_pagoFacturaDescuadrada.setEnabled(isHabilitar && this.facturadescuadradaConstantesFunciones.activartotal_formas_pagoFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFielddescuento_realFacturaDescuadrada.setEnabled(isHabilitar && this.facturadescuadradaConstantesFunciones.activardescuento_realFacturaDescuadrada);	
		//
		this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxid_empresaFacturaDescuadrada.setEnabled(isHabilitar && this.facturadescuadradaConstantesFunciones.activarid_empresaFacturaDescuadrada);
	};
	
	public void setDefaultControlesFacturaDescuadrada() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFacturaDescuadrada(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.facturadescuadradaSessionBean.setConGuardarRelaciones(true);			
			this.facturadescuadradaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTabbedPaneRelacionesFacturaDescuadrada.setVisible(true);
			
					
		} else {
			//this.facturadescuadradaSessionBean.setConGuardarRelaciones(false);			
			this.facturadescuadradaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTabbedPaneRelacionesFacturaDescuadrada.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoFacturaDescuadrada() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturaDescuadrada facturadescuadradaAux:this.facturadescuadradaLogic.getFacturaDescuadradas()) {
				if(facturadescuadradaAux.getId().equals(this.iIdNuevoFacturaDescuadrada)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturaDescuadrada facturadescuadradaAux:this.facturadescuadradas) {
				if(facturadescuadradaAux.getId().equals(this.iIdNuevoFacturaDescuadrada)) {
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
	
	public int getIndiceActualFacturaDescuadrada(FacturaDescuadrada facturadescuadrada,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturaDescuadrada facturadescuadradaAux:this.facturadescuadradaLogic.getFacturaDescuadradas()) {
				if(facturadescuadradaAux.getId().equals(facturadescuadrada.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturaDescuadrada facturadescuadradaAux:this.facturadescuadradas) {
				if(facturadescuadradaAux.getId().equals(facturadescuadrada.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFacturaDescuadrada(FacturaDescuadrada facturadescuadradaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturaDescuadrada facturadescuadradaAux:this.facturadescuadradaLogic.getFacturaDescuadradas()) {
				if(facturadescuadradaAux.getFacturaDescuadradaOriginal().getId().equals(facturadescuadradaOriginal.getId())) {
					existe=true;
					facturadescuadradaOriginal.setId(facturadescuadradaAux.getId());
					facturadescuadradaOriginal.setVersionRow(facturadescuadradaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturaDescuadrada facturadescuadradaAux:this.facturadescuadradas) {
				if(facturadescuadradaAux.getFacturaDescuadradaOriginal().getId().equals(facturadescuadradaOriginal.getId())) {
					existe=true;
					facturadescuadradaOriginal.setId(facturadescuadradaAux.getId());
					facturadescuadradaOriginal.setVersionRow(facturadescuadradaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFacturaDescuadrada(Boolean esParaCancelar) throws Exception {
		facturadescuadradasAux=new ArrayList<FacturaDescuadrada>();
		facturadescuadradaAux=new FacturaDescuadrada();
		
		if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FacturaDescuadrada facturadescuadradaAux:this.facturadescuadradaLogic.getFacturaDescuadradas()) {
					if(facturadescuadradaAux.getId()<0) {
						facturadescuadradasAux.add(facturadescuadradaAux);
					}		
				}
				this.iIdNuevoFacturaDescuadrada=0L;
				this.facturadescuadradaLogic.getFacturaDescuadradas().removeAll(facturadescuadradasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturaDescuadrada facturadescuadradaAux:this.facturadescuadradas) {
					if(facturadescuadradaAux.getId()<0) {
						facturadescuadradasAux.add(facturadescuadradaAux);
					}		
				}
				this.iIdNuevoFacturaDescuadrada=0L;
				this.facturadescuadradas.removeAll(facturadescuadradasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFacturaDescuadrada 
					&& this.facturadescuadradaLogic.getFacturaDescuadradas().size()>0
					) {
					facturadescuadradaAux=this.facturadescuadradaLogic.getFacturaDescuadradas().get(this.facturadescuadradaLogic.getFacturaDescuadradas().size() - 1);
				
					if(facturadescuadradaAux.getId()<0) {
						this.facturadescuadradaLogic.getFacturaDescuadradas().remove(facturadescuadradaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFacturaDescuadrada && this.facturadescuadradas.size()>0) {
					facturadescuadradaAux=this.facturadescuadradas.get(this.facturadescuadradas.size() - 1);
				
					if(facturadescuadradaAux.getId()<0) {
						this.facturadescuadradas.remove(facturadescuadradaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFacturaDescuadrada(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(facturadescuadrada.getId()<0) {
				this.facturadescuadradaLogic.getFacturaDescuadradas().remove(this.facturadescuadrada);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(facturadescuadrada.getId()<0) {
				this.facturadescuadradas.remove(this.facturadescuadrada);
			}
		}			
	}
	
	public void setEstadosInicialesFacturaDescuadrada(List<FacturaDescuadrada> facturadescuadradasAux) throws Exception {
		FacturaDescuadradaConstantesFunciones.setEstadosInicialesFacturaDescuadrada(facturadescuadradasAux);
	}
	
	public void setEstadosInicialesFacturaDescuadrada(FacturaDescuadrada facturadescuadradaAux) throws Exception {
		FacturaDescuadradaConstantesFunciones.setEstadosInicialesFacturaDescuadrada(facturadescuadradaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFacturaDescuadradaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFacturaDescuadrada("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFacturaDescuadradaActual()) {
				if(!this.isEsNuevoFacturaDescuadrada) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFacturaDescuadrada("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFacturaDescuadrada=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFacturaDescuadradaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Factura Descuadrada ?", "MANTENIMIENTO DE Factura Descuadrada", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFacturaDescuadrada("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FacturaDescuadrada facturadescuadrada) throws Exception {
		FacturaDescuadradaConstantesFunciones.seleccionarAsignar(this.facturadescuadrada,facturadescuadrada);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFacturaDescuadrada=this.isPermisoActualizarOriginalFacturaDescuadrada;
			
			
			this.seleccionarAsignar(facturadescuadrada);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesFacturaDescuadrada("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.facturadescuadradaSessionBean.setsFuncionBusquedaRapida(this.facturadescuadradaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFacturaDescuadrada) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFacturaDescuadrada(esParaCancelar);				
				this.cancelarNuevoFacturaDescuadrada(esParaCancelar);								
			}
			
			this.facturadescuadrada=new FacturaDescuadrada();
			
			this.inicializarFacturaDescuadrada();
			
			this.actualizarEstadoCeldasBotonesFacturaDescuadrada("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFacturaDescuadrada() throws Exception {
		try {
			FacturaDescuadradaConstantesFunciones.inicializarFacturaDescuadrada(this.facturadescuadrada);
			
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
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.facturadescuadradaLogic.getFacturaDescuadradas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFacturaDescuadradas(String sAccionBusqueda,List<FacturaDescuadrada> facturadescuadradasParaReportes) throws Exception {
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
					sPathReporteFinal="FacturaDescuadrada"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FacturaDescuadradaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FacturaDescuadradaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FacturaDescuadrada"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Factura Descuadradas");		
		parameters.put("busquedapor", FacturaDescuadradaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFacturaDescuadrada=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FacturaDescuadradaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FacturaDescuadradaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFacturaDescuadrada=new JRBeanArrayDataSource(FacturaDescuadradaJInternalFrame.TraerFacturaDescuadradaBeans(facturadescuadradasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFacturaDescuadrada);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FacturaDescuadradaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FacturaDescuadradaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FacturaDescuadradaBean.TraerFacturaDescuadradaBeans(facturadescuadradasParaReportes).toArray()));
							
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
				this.generarExcelReporteFacturaDescuadradas(sAccionBusqueda,sTipoArchivoReporte,facturadescuadradasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFacturaDescuadradas(sAccionBusqueda,sTipoArchivoReporte,facturadescuadradasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFacturaDescuadradaActionPerformed(null);
					//this.generarExcelReporteFacturaDescuadradas(sAccionBusqueda,sTipoArchivoReporte,facturadescuadradasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFacturaDescuadradas(sAccionBusqueda,sTipoArchivoReporte,facturadescuadradasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFacturaDescuadradas(sAccionBusqueda,sTipoArchivoReporte,facturadescuadradasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFacturaDescuadradas(sAccionBusqueda,sTipoArchivoReporte,facturadescuadradasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFacturaDescuadradas(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturaDescuadrada> facturadescuadradasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturadescuadrada";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturaDescuadradas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturaDescuadrada("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FacturaDescuadrada facturadescuadrada : facturadescuadradasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FacturaDescuadradaConstantesFunciones.generarExcelReporteDataFacturaDescuadrada("NORMAL",row,workbook,facturadescuadrada,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Descuadrada",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFacturaDescuadrada(String sTipo,Row row,Workbook workbook) {
		
		FacturaDescuadradaConstantesFunciones.generarExcelReporteHeaderFacturaDescuadrada(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFacturaDescuadradas(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturaDescuadrada> facturadescuadradasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturadescuadrada_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturaDescuadradas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FacturaDescuadrada facturadescuadrada : facturadescuadradasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FacturaDescuadradaConstantesFunciones.getFacturaDescuadradaDescripcion(facturadescuadrada));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDescuadradaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadescuadrada.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDescuadradaConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadescuadrada.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDescuadradaConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadescuadrada.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadescuadrada.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDescuadradaConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadescuadrada.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDescuadradaConstantesFunciones.LABEL_SUBTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_SUBTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadescuadrada.getsubtotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDescuadradaConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadescuadrada.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadescuadrada.getdescuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDescuadradaConstantesFunciones.LABEL_FINANCIAMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_FINANCIAMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadescuadrada.getfinanciamiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDescuadradaConstantesFunciones.LABEL_FLETE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_FLETE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadescuadrada.getflete());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDescuadradaConstantesFunciones.LABEL_ICE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_ICE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadescuadrada.getice());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDescuadradaConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadescuadrada.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDescuadradaConstantesFunciones.LABEL_TOTALFORMASPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_TOTALFORMASPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadescuadrada.gettotal_formas_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTOREAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTOREAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadescuadrada.getdescuento_real());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Descuadrada",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFacturaDescuadradas(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturaDescuadrada> facturadescuadradasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FacturaDescuadrada> facturadescuadradasRespaldo=null;
		
		classes=FacturaDescuadradaConstantesFunciones.getClassesRelationshipsOfFacturaDescuadrada(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.facturadescuadradaLogic.setDatosCliente(this.datosCliente);
		this.facturadescuadradaLogic.setDatosDeep(this.datosDeep);
		this.facturadescuadradaLogic.setIsConDeep(true);
		
		facturadescuadradasRespaldo=this.facturadescuadradaLogic.getFacturaDescuadradas();
		
		this.facturadescuadradaLogic.setFacturaDescuadradas(facturadescuadradasParaReportes);	
		this.facturadescuadradaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		facturadescuadradasParaReportes=this.facturadescuadradaLogic.getFacturaDescuadradas();
		this.facturadescuadradaLogic.setFacturaDescuadradas(facturadescuadradasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturadescuadrada_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturaDescuadradas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturaDescuadrada("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FacturaDescuadrada facturadescuadrada : facturadescuadradasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFacturaDescuadrada("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FacturaDescuadradaConstantesFunciones.generarExcelReporteDataFacturaDescuadrada("NORMAL",row,workbook,facturadescuadrada,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FacturaDescuadradaConstantesFunciones.getFacturaDescuadradaDescripcion(facturadescuadrada));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Descuadrada",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFacturaDescuadrada() throws Exception {		
		this.startProcessFacturaDescuadrada(true);
	}
	
	public void startProcessFacturaDescuadrada(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFacturaDescuadrada ,this.jPanelParametrosReportesFacturaDescuadrada, this.jScrollPanelDatosFacturaDescuadrada,this.jPanelPaginacionFacturaDescuadrada, this.jScrollPanelDatosEdicionFacturaDescuadrada, this.jPanelAccionesFacturaDescuadrada,this.jPanelAccionesFormularioFacturaDescuadrada,this.jmenuBarFacturaDescuadrada,this.jmenuBarDetalleFacturaDescuadrada,this.jTtoolBarFacturaDescuadrada,this.jTtoolBarDetalleFacturaDescuadrada);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturaDescuadrada=this.jTabbedPaneBusquedasFacturaDescuadrada; 
		
		final JPanel jPanelParametrosReportesFacturaDescuadrada=this.jPanelParametrosReportesFacturaDescuadrada;
		//final JScrollPane jScrollPanelDatosFacturaDescuadrada=this.jScrollPanelDatosFacturaDescuadrada;
		final JTable jTableDatosFacturaDescuadrada=this.jTableDatosFacturaDescuadrada;		
		final JPanel jPanelPaginacionFacturaDescuadrada=this.jPanelPaginacionFacturaDescuadrada;
		//final JScrollPane jScrollPanelDatosEdicionFacturaDescuadrada=this.jScrollPanelDatosEdicionFacturaDescuadrada;
		final JPanel jPanelAccionesFacturaDescuadrada=this.jPanelAccionesFacturaDescuadrada;
		
		JPanel jPanelCamposAuxiliarFacturaDescuadrada=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFacturaDescuadrada=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
			jPanelCamposAuxiliarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jPanelCamposFacturaDescuadrada;
			jPanelAccionesFormularioAuxiliarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jPanelAccionesFormularioFacturaDescuadrada;
		}
		
		final JPanel jPanelCamposFacturaDescuadrada=jPanelCamposAuxiliarFacturaDescuadrada;
		final JPanel jPanelAccionesFormularioFacturaDescuadrada=jPanelAccionesFormularioAuxiliarFacturaDescuadrada;
		
		
		final JMenuBar jmenuBarFacturaDescuadrada=this.jmenuBarFacturaDescuadrada;
		final JToolBar jTtoolBarFacturaDescuadrada=this.jTtoolBarFacturaDescuadrada;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFacturaDescuadrada=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturaDescuadrada=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
			jmenuBarDetalleAuxiliarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jmenuBarDetalleFacturaDescuadrada;
			jTtoolBarDetalleAuxiliarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jTtoolBarDetalleFacturaDescuadrada;
		}
		
		final JMenuBar jmenuBarDetalleFacturaDescuadrada=jmenuBarDetalleAuxiliarFacturaDescuadrada;
		final JToolBar jTtoolBarDetalleFacturaDescuadrada=jTtoolBarDetalleAuxiliarFacturaDescuadrada;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturaDescuadrada;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturaDescuadrada;
			processRunnable.jTableDatos=jTableDatosFacturaDescuadrada;
			processRunnable.jPanelCampos=jPanelCamposFacturaDescuadrada;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturaDescuadrada;
			processRunnable.jPanelAcciones=jPanelAccionesFacturaDescuadrada;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturaDescuadrada;
			
			
			processRunnable.jmenuBar=jmenuBarFacturaDescuadrada;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturaDescuadrada;
			processRunnable.jTtoolBar=jTtoolBarFacturaDescuadrada;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturaDescuadrada;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFacturaDescuadrada ,jPanelParametrosReportesFacturaDescuadrada,jTableDatosFacturaDescuadrada, /*jScrollPanelDatosFacturaDescuadrada,*/jPanelCamposFacturaDescuadrada,jPanelPaginacionFacturaDescuadrada, /*jScrollPanelDatosEdicionFacturaDescuadrada,*/ jPanelAccionesFacturaDescuadrada,jPanelAccionesFormularioFacturaDescuadrada,jmenuBarFacturaDescuadrada,jmenuBarDetalleFacturaDescuadrada,jTtoolBarFacturaDescuadrada,jTtoolBarDetalleFacturaDescuadrada);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFacturaDescuadrada ,jPanelParametrosReportesFacturaDescuadrada, jScrollPanelDatosFacturaDescuadrada,jPanelPaginacionFacturaDescuadrada, jScrollPanelDatosEdicionFacturaDescuadrada, jPanelAccionesFacturaDescuadrada,jPanelAccionesFormularioFacturaDescuadrada,jmenuBarFacturaDescuadrada,jmenuBarDetalleFacturaDescuadrada,jTtoolBarFacturaDescuadrada,jTtoolBarDetalleFacturaDescuadrada);
						
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
	
	public void finishProcessFacturaDescuadrada() {// throws Exception 
		this.finishProcessFacturaDescuadrada(true);
	}
	
	public void finishProcessFacturaDescuadrada(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFacturaDescuadrada ,this.jPanelParametrosReportesFacturaDescuadrada, this.jScrollPanelDatosFacturaDescuadrada,this.jPanelPaginacionFacturaDescuadrada, this.jScrollPanelDatosEdicionFacturaDescuadrada, this.jPanelAccionesFacturaDescuadrada,this.jPanelAccionesFormularioFacturaDescuadrada,this.jmenuBarFacturaDescuadrada,this.jmenuBarDetalleFacturaDescuadrada,this.jTtoolBarFacturaDescuadrada,this.jTtoolBarDetalleFacturaDescuadrada);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturaDescuadrada=this.jTabbedPaneBusquedasFacturaDescuadrada; 
		
		final JPanel jPanelParametrosReportesFacturaDescuadrada=this.jPanelParametrosReportesFacturaDescuadrada;
		//final JScrollPane jScrollPanelDatosFacturaDescuadrada=this.jScrollPanelDatosFacturaDescuadrada;
		final JTable jTableDatosFacturaDescuadrada=this.jTableDatosFacturaDescuadrada;		
		final JPanel jPanelPaginacionFacturaDescuadrada=this.jPanelPaginacionFacturaDescuadrada;
		//final JScrollPane jScrollPanelDatosEdicionFacturaDescuadrada=this.jScrollPanelDatosEdicionFacturaDescuadrada;
		final JPanel jPanelAccionesFacturaDescuadrada=this.jPanelAccionesFacturaDescuadrada;
		
		JPanel jPanelCamposAuxiliarFacturaDescuadrada=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFacturaDescuadrada=new JPanel();
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
			jPanelCamposAuxiliarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jPanelCamposFacturaDescuadrada;
			jPanelAccionesFormularioAuxiliarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jPanelAccionesFormularioFacturaDescuadrada;
		}
		
		final JPanel jPanelCamposFacturaDescuadrada=jPanelCamposAuxiliarFacturaDescuadrada;
		final JPanel jPanelAccionesFormularioFacturaDescuadrada=jPanelAccionesFormularioAuxiliarFacturaDescuadrada;
		
		
		final JMenuBar jmenuBarFacturaDescuadrada=this.jmenuBarFacturaDescuadrada;		
		final JToolBar jTtoolBarFacturaDescuadrada=this.jTtoolBarFacturaDescuadrada;
				
		JMenuBar jmenuBarDetalleAuxiliarFacturaDescuadrada=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturaDescuadrada=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
			jmenuBarDetalleAuxiliarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jmenuBarDetalleFacturaDescuadrada;
			jTtoolBarDetalleAuxiliarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jTtoolBarDetalleFacturaDescuadrada;		
		}
		
		final JMenuBar jmenuBarDetalleFacturaDescuadrada=jmenuBarDetalleAuxiliarFacturaDescuadrada;
		final JToolBar jTtoolBarDetalleFacturaDescuadrada=jTtoolBarDetalleAuxiliarFacturaDescuadrada;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturaDescuadrada;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturaDescuadrada;
			processRunnable.jTableDatos=jTableDatosFacturaDescuadrada;
			processRunnable.jPanelCampos=jPanelCamposFacturaDescuadrada;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturaDescuadrada;
			processRunnable.jPanelAcciones=jPanelAccionesFacturaDescuadrada;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturaDescuadrada;
			
			
			processRunnable.jmenuBar=jmenuBarFacturaDescuadrada;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturaDescuadrada;
			processRunnable.jTtoolBar=jTtoolBarFacturaDescuadrada;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturaDescuadrada;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFacturaDescuadrada ,jPanelParametrosReportesFacturaDescuadrada, jTableDatosFacturaDescuadrada,/*jScrollPanelDatosFacturaDescuadrada,*/jPanelCamposFacturaDescuadrada,jPanelPaginacionFacturaDescuadrada, /*jScrollPanelDatosEdicionFacturaDescuadrada,*/ jPanelAccionesFacturaDescuadrada,jPanelAccionesFormularioFacturaDescuadrada,jmenuBarFacturaDescuadrada,jmenuBarDetalleFacturaDescuadrada,jTtoolBarFacturaDescuadrada,jTtoolBarDetalleFacturaDescuadrada));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFacturaDescuadrada(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFacturaDescuadrada(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFacturaDescuadrada(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFacturaDescuadrada(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFacturaDescuadrada,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFacturaDescuadrada,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFacturaDescuadrada(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFacturaDescuadrada,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFacturaDescuadrada,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.facturadescuadradaConstantesFunciones.getsFinalQueryFacturaDescuadrada();
		String  finalQueryPaginacionTodos=this.facturadescuadradaConstantesFunciones.getsFinalQueryFacturaDescuadrada();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FacturaDescuadradaConstantesFunciones.getArrayColumnasGlobalesNoFacturaDescuadrada(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FacturaDescuadradaConstantesFunciones.getArrayColumnasGlobalesFacturaDescuadrada(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FacturaDescuadradaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.facturadescuadradasEliminados= new ArrayList<FacturaDescuadrada>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFacturaDescuadrada();
		
				///*FacturaDescuadradaSessionBean*/this.facturadescuadradaSessionBean=new FacturaDescuadradaSessionBean();
			
			if(this.facturadescuadradaSessionBean==null) {
				this.facturadescuadradaSessionBean=new FacturaDescuadradaSessionBean();
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
					this.iNumeroPaginacion=FacturaDescuadradaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FacturaDescuadradaConstantesFunciones.getClassesForeignKeysOfFacturaDescuadrada(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/facturadescuadrada."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			facturadescuadradasAux= new ArrayList<FacturaDescuadrada>();
			
				
			facturadescuadradaLogic.setDatosCliente(this.datosCliente);
			facturadescuadradaLogic.setDatosDeep(this.datosDeep);
			facturadescuadradaLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaFacturaDescuadrada")) {
				this.sDetalleReporte=FacturaDescuadradaConstantesFunciones.getDetalleIndiceBusquedaFacturaDescuadrada(fecha_inicioBusquedaFacturaDescuadrada,fecha_finBusquedaFacturaDescuadrada);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					facturadescuadradaLogic.getFacturaDescuadradasBusquedaFacturaDescuadrada(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_inicioBusquedaFacturaDescuadrada,fecha_finBusquedaFacturaDescuadrada);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaDescuadradaConstantesFunciones.getDetalleIndiceBusquedaFacturaDescuadrada(fecha_inicioBusquedaFacturaDescuadrada,fecha_finBusquedaFacturaDescuadrada);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaDescuadradaConstantesFunciones.getDetalleIndiceBusquedaFacturaDescuadrada(fecha_inicioBusquedaFacturaDescuadrada,fecha_finBusquedaFacturaDescuadrada);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=facturadescuadradaLogic.getFacturaDescuadradas()==null||facturadescuadradaLogic.getFacturaDescuadradas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=facturadescuadradas==null|| facturadescuadradas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadescuadradasAux=new ArrayList<FacturaDescuadrada>();
						facturadescuadradasAux.addAll(facturadescuadradaLogic.getFacturaDescuadradas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturadescuadradasAux=new ArrayList<FacturaDescuadrada>();
							facturadescuadradasAux.addAll(facturadescuadradas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							facturadescuadradaLogic.getFacturaDescuadradasBusquedaFacturaDescuadrada(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_inicioBusquedaFacturaDescuadrada,fecha_finBusquedaFacturaDescuadrada);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaDescuadradaConstantesFunciones.getDetalleIndiceBusquedaFacturaDescuadrada(fecha_inicioBusquedaFacturaDescuadrada,fecha_finBusquedaFacturaDescuadrada);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaDescuadradaConstantesFunciones.getDetalleIndiceBusquedaFacturaDescuadrada(fecha_inicioBusquedaFacturaDescuadrada,fecha_finBusquedaFacturaDescuadrada);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFacturaDescuadradas("BusquedaFacturaDescuadrada",facturadescuadradaLogic.getFacturaDescuadradas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFacturaDescuadradas("BusquedaFacturaDescuadrada",facturadescuadradas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadescuadradaLogic.setFacturaDescuadradas(new ArrayList<FacturaDescuadrada>());
						facturadescuadradaLogic.getFacturaDescuadradas().addAll(facturadescuadradasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturadescuadradas=new ArrayList<FacturaDescuadrada>();
							facturadescuadradas.addAll(facturadescuadradasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFacturaDescuadrada();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFacturaDescuadrada();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturadescuadradaLogic.getFacturaDescuadradas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturadescuadradas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturadescuadradaLogic.getFacturaDescuadradas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturadescuadradas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FacturaDescuadrada facturadescuadrada) {
		Boolean permite=true;
		
		if(this.facturadescuadrada.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FacturaDescuadradaConstantesFunciones.getOrderByListaFacturaDescuadrada();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FacturaDescuadradaConstantesFunciones.getOrderByListaFacturaDescuadrada();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturaDescuadrada facturadescuadrada:facturadescuadradaLogic.getFacturaDescuadradas()) {
				if(facturadescuadrada.getsType().equals(Constantes2.S_TOTALES)) {
					facturadescuadradaTotales=facturadescuadrada;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturaDescuadrada facturadescuadrada:this.facturadescuadradas) {
				if(facturadescuadrada.getsType().equals(Constantes2.S_TOTALES)) {
					facturadescuadradaTotales=facturadescuadrada;
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
			this.facturadescuadradaAux=new FacturaDescuadrada();
			this.facturadescuadradaAux.setsType(Constantes2.S_TOTALES);
			this.facturadescuadradaAux.setIsNew(false);
			this.facturadescuadradaAux.setIsChanged(false);
			this.facturadescuadradaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//FacturaDescuadradaConstantesFunciones.TotalizarValoresFilaFacturaDescuadrada(this.facturadescuadradaLogic.getFacturaDescuadradas(),this.facturadescuadradaAux);
				
				//this.facturadescuadradaLogic.getFacturaDescuadradas().add(this.facturadescuadradaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FacturaDescuadradaConstantesFunciones.TotalizarValoresFilaFacturaDescuadrada(this.facturadescuadradas,this.facturadescuadradaAux);
				
				this.facturadescuadradas.add(this.facturadescuadradaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		facturadescuadradaTotales=new FacturaDescuadrada();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturadescuadradaLogic.getFacturaDescuadradas().remove(facturadescuadradaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturadescuadradas.remove(facturadescuadradaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		facturadescuadradaTotales=new FacturaDescuadrada();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturaDescuadrada facturadescuadrada:facturadescuadradaLogic.getFacturaDescuadradas()) {
				if(facturadescuadrada.getsType().equals(Constantes2.S_TOTALES)) {
					facturadescuadradaTotales=facturadescuadrada;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturaDescuadradaConstantesFunciones.TotalizarValoresFilaFacturaDescuadrada(this.facturadescuadradaLogic.getFacturaDescuadradas(),facturadescuadradaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturaDescuadrada facturadescuadrada:this.facturadescuadradas) {
				if(facturadescuadrada.getsType().equals(Constantes2.S_TOTALES)) {
					facturadescuadradaTotales=facturadescuadrada;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturaDescuadradaConstantesFunciones.TotalizarValoresFilaFacturaDescuadrada(this.facturadescuadradas,facturadescuadradaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFacturaDescuadradasBusquedaFacturaDescuadrada()throws Exception {
		try {
			sAccionBusqueda="BusquedaFacturaDescuadrada";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturaDescuadradasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFacturaDescuadradasBusquedaFacturaDescuadrada(String sFinalQuery,Date fecha_inicio,Date fecha_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturadescuadradaLogic.getFacturaDescuadradasBusquedaFacturaDescuadrada(sFinalQuery,this.pagination,fecha_inicio,fecha_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturaDescuadradasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturadescuadradaLogic.getFacturaDescuadradasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosFacturaDescuadrada() {
		this.isPermisoTodoFacturaDescuadrada=false;
		this.isPermisoNuevoFacturaDescuadrada=false;
		this.isPermisoActualizarFacturaDescuadrada=false;
		this.isPermisoActualizarOriginalFacturaDescuadrada=false;
		this.isPermisoEliminarFacturaDescuadrada=false;
		this.isPermisoGuardarCambiosFacturaDescuadrada=false;
		this.isPermisoConsultaFacturaDescuadrada=true;
		this.isPermisoBusquedaFacturaDescuadrada=true;
		this.isPermisoReporteFacturaDescuadrada=true;
		this.isPermisoOrdenFacturaDescuadrada=false;		
		this.isPermisoPaginacionMedioFacturaDescuadrada=false;		
		this.isPermisoPaginacionAltoFacturaDescuadrada=false;		
		this.isPermisoPaginacionTodoFacturaDescuadrada=false;		
		this.isPermisoCopiarFacturaDescuadrada=false;		
		this.isPermisoVerFormFacturaDescuadrada=false;		
		this.isPermisoDuplicarFacturaDescuadrada=false;
		this.isPermisoOrdenFacturaDescuadrada=false;
	}
	
	public void setPermisosUsuarioFacturaDescuadrada(Boolean isPermiso) {
		this.isPermisoTodoFacturaDescuadrada=isPermiso;
		this.isPermisoNuevoFacturaDescuadrada=isPermiso;
		this.isPermisoActualizarFacturaDescuadrada=isPermiso;
		this.isPermisoActualizarOriginalFacturaDescuadrada=isPermiso;
		this.isPermisoEliminarFacturaDescuadrada=isPermiso;
		this.isPermisoGuardarCambiosFacturaDescuadrada=isPermiso;
		this.isPermisoConsultaFacturaDescuadrada=isPermiso;
		this.isPermisoBusquedaFacturaDescuadrada=isPermiso;
		this.isPermisoReporteFacturaDescuadrada=isPermiso;
		this.isPermisoOrdenFacturaDescuadrada=isPermiso;		
		this.isPermisoPaginacionMedioFacturaDescuadrada=isPermiso;		
		this.isPermisoPaginacionAltoFacturaDescuadrada=isPermiso;		
		this.isPermisoPaginacionTodoFacturaDescuadrada=isPermiso;		
		this.isPermisoCopiarFacturaDescuadrada=isPermiso;		
		this.isPermisoVerFormFacturaDescuadrada=isPermiso;		
		this.isPermisoDuplicarFacturaDescuadrada=isPermiso;
		this.isPermisoOrdenFacturaDescuadrada=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFacturaDescuadrada(Boolean isPermiso) {
		//this.isPermisoTodoFacturaDescuadrada=isPermiso;
		this.isPermisoNuevoFacturaDescuadrada=isPermiso;
		this.isPermisoActualizarFacturaDescuadrada=isPermiso;
		this.isPermisoActualizarOriginalFacturaDescuadrada=isPermiso;
		this.isPermisoEliminarFacturaDescuadrada=isPermiso;
		this.isPermisoGuardarCambiosFacturaDescuadrada=isPermiso;
		//this.isPermisoConsultaFacturaDescuadrada=isPermiso;
		//this.isPermisoBusquedaFacturaDescuadrada=isPermiso;
		//this.isPermisoReporteFacturaDescuadrada=isPermiso;
		//this.isPermisoOrdenFacturaDescuadrada=isPermiso;		
		//this.isPermisoPaginacionMedioFacturaDescuadrada=isPermiso;		
		//this.isPermisoPaginacionAltoFacturaDescuadrada=isPermiso;		
		//this.isPermisoPaginacionTodoFacturaDescuadrada=isPermiso;		
		//this.isPermisoCopiarFacturaDescuadrada=isPermiso;		
		//this.isPermisoDuplicarFacturaDescuadrada=isPermiso;
		//this.isPermisoOrdenFacturaDescuadrada=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFacturaDescuadradaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(FacturaDescuadradaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebFacturaDescuadrada(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFacturaDescuadradaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioFacturaDescuadradaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFacturaDescuadradaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFacturaDescuadradaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioFacturaDescuadrada() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FacturaDescuadradaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FacturaDescuadradaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFacturaDescuadrada=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFacturaDescuadrada=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFacturaDescuadrada=this.isPermisoActualizarFacturaDescuadrada;
			this.isPermisoEliminarFacturaDescuadrada=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFacturaDescuadrada=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFacturaDescuadrada=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFacturaDescuadrada=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFacturaDescuadrada=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFacturaDescuadrada=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturaDescuadrada=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFacturaDescuadrada=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFacturaDescuadrada=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFacturaDescuadrada=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFacturaDescuadrada=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFacturaDescuadrada=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFacturaDescuadrada=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturaDescuadrada=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFacturaDescuadrada.setToolTipText(this.jTableDatosFacturaDescuadrada.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFacturaDescuadrada(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFacturaDescuadrada(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FacturaDescuadradaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FacturaDescuadradaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFacturaDescuadrada() throws Exception {
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
	public void inicializarCombosForeignKeyFacturaDescuadradaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFacturaDescuadradaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FacturaDescuadradaJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyFacturaDescuadrada()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.facturadescuadradaSessionBean==null) {
				this.facturadescuadradaSessionBean=new FacturaDescuadradaSessionBean();
			}

			if(!this.facturadescuadradaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyFacturaDescuadrada()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFacturaDescuadrada(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFacturaDescuadrada()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturaDescuadrada();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFacturaDescuadrada(FacturaDescuadrada facturadescuadrada)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFacturaDescuadrada(FacturaDescuadrada facturadescuadrada,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFacturaDescuadrada()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFacturaDescuadrada()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFacturaDescuadrada()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFacturaDescuadrada()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFacturaDescuadrada()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFacturaDescuadrada()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFacturaDescuadrada(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFacturaDescuadrada()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxid_empresaFacturaDescuadrada!=null && this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxid_empresaFacturaDescuadrada.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxid_empresaFacturaDescuadrada.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public FacturaDescuadradaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FacturaDescuadradaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FacturaDescuadradaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.facturadescuadradaSessionBean=new FacturaDescuadradaSessionBean(); 
		this.facturadescuadradaConstantesFunciones=new FacturaDescuadradaConstantesFunciones(); 
		this.facturadescuadradaBean=new FacturaDescuadrada();//(this.facturadescuadradaConstantesFunciones); 		
		this.facturadescuadradaReturnGeneral=new FacturaDescuadradaParameterReturnGeneral(); 
		
		this.facturadescuadradaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturadescuadradaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FacturaDescuadradaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FacturaDescuadradaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FacturaDescuadradaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFacturaDescuadrada(true);
			
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
			
			this.facturadescuadradaConstantesFunciones=new FacturaDescuadradaConstantesFunciones(); 
			this.facturadescuadradaBean=new FacturaDescuadrada();//this.facturadescuadradaConstantesFunciones); 			
			this.facturadescuadradaReturnGeneral=new FacturaDescuadradaParameterReturnGeneral(); 
		
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Factura Descuadrada Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.facturadescuadrada=new FacturaDescuadrada();
			this.facturadescuadradas = new ArrayList<FacturaDescuadrada>();
			this.facturadescuadradasAux = new ArrayList<FacturaDescuadrada>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic=new FacturaDescuadradaLogic();
				this.facturadescuadradaLogic.getNewConnexionToDeep("");
			}
			
			//this.facturadescuadradaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.facturadescuadradaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFacturaDescuadrada);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFacturaDescuadrada!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturaDescuadrada);	
					}
					
					if(this.jInternalFrameImportacionFacturaDescuadrada!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturaDescuadrada);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFacturaDescuadrada!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFacturaDescuadrada);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturaDescuadrada);
				this.jInternalFrameDetalleFormFacturaDescuadrada.setVisible(false);
				this.jInternalFrameDetalleFormFacturaDescuadrada.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturaDescuadrada!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturaDescuadrada);
					this.jInternalFrameReporteDinamicoFacturaDescuadrada.setVisible(false);
					this.jInternalFrameReporteDinamicoFacturaDescuadrada.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFacturaDescuadrada!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFacturaDescuadrada);
					this.jInternalFrameImportacionFacturaDescuadrada.setVisible(false);
					this.jInternalFrameImportacionFacturaDescuadrada.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFacturaDescuadrada!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFacturaDescuadrada);
					this.jInternalFrameOrderByFacturaDescuadrada.setVisible(false);
					this.jInternalFrameOrderByFacturaDescuadrada.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFacturaDescuadradaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FacturaDescuadradaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.facturadescuadradaReturnGeneral=new FacturaDescuadradaParameterReturnGeneral();
			
			this.facturadescuadradaParameterGeneral=new FacturaDescuadradaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.facturadescuadradaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FacturaDescuadradaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturaDescuadradaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturadescuadradaSessionBean.getEsGuardarRelacionado(),this.facturadescuadradaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturaDescuadradaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturadescuadradaSessionBean.getEsGuardarRelacionado(),this.facturadescuadradaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFacturaDescuadrada=false;
			this.isVisibilidadCeldaDuplicarFacturaDescuadrada=true;
			this.isVisibilidadCeldaCopiarFacturaDescuadrada=true;
			this.isVisibilidadCeldaVerFormFacturaDescuadrada=true;
			this.isVisibilidadCeldaOrdenFacturaDescuadrada=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada=false;
			this.isVisibilidadCeldaModificarFacturaDescuadrada=false;
			this.isVisibilidadCeldaActualizarFacturaDescuadrada=false;
			this.isVisibilidadCeldaEliminarFacturaDescuadrada=false;
			this.isVisibilidadCeldaCancelarFacturaDescuadrada=false;
			this.isVisibilidadCeldaGuardarFacturaDescuadrada=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada=false;
			
			
			this.isVisibilidadBusquedaFacturaDescuadrada=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFacturaDescuadrada("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFacturaDescuadrada();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFacturaDescuadrada(false);
			
			this.setPermisosUsuarioFacturaDescuadrada();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado() 
				|| (this.facturadescuadradaSessionBean.getEsGuardarRelacionado() && this.facturadescuadradaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFacturaDescuadradaClasesRelacionadas();
			}
			
			if(this.facturadescuadradaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFacturaDescuadradaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFacturaDescuadrada();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFacturaDescuadrada();
			}
			
			if(!this.isPermisoBusquedaFacturaDescuadrada) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFacturaDescuadrada.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FacturaDescuadradaConstantesFunciones.getTiposSeleccionarFacturaDescuadrada());
				
				this.tiposColumnasSelect=FacturaDescuadradaConstantesFunciones.getTiposSeleccionarFacturaDescuadrada(true);
				
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
			//if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFacturaDescuadrada();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioFacturaDescuadrada(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioFacturaDescuadrada(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturaDescuadrada() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				facturadescuadradaImplementable= (FacturaDescuadradaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturaDescuadradaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				facturadescuadradaImplementableHome= (FacturaDescuadradaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturaDescuadradaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.facturadescuadradas= new ArrayList<FacturaDescuadrada>();
			this.facturadescuadradasEliminados= new ArrayList<FacturaDescuadrada>();
						
			this.isEsNuevoFacturaDescuadrada=false;
			this.esParaAccionDesdeFormularioFacturaDescuadrada=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFacturaDescuadrada(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFacturaDescuadrada();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FacturaDescuadradaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFacturaDescuadrada("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFacturaDescuadrada(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFacturaDescuadrada();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFacturaDescuadrada();
			}
			
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFacturaDescuadrada.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFacturaDescuadrada.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFacturaDescuadrada.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFacturaDescuadrada(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FacturaDescuadrada: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFacturaDescuadrada() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFacturaDescuadrada")) {
				iIndex=this.jInternalFrameDetalleFormFacturaDescuadrada.jTabbedPaneRelacionesFacturaDescuadrada.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFacturaDescuadrada.jTabbedPaneRelacionesFacturaDescuadrada.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFacturaDescuadrada();	
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
	
	public void cargarCombosForeignKeyFacturaDescuadrada(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFacturaDescuadrada(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFacturaDescuadrada(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFacturaDescuadradaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFacturaDescuadrada();
		
		this.cargarCombosFrameForeignKeyFacturaDescuadrada();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFacturaDescuadrada();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFacturaDescuadrada();
		}
	}
	
	
	
	public void jButtonNuevoFacturaDescuadradaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.facturadescuadradaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFacturaDescuadrada==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
			
			
			if(jTableDatosFacturaDescuadrada.getRowCount()>=1) {
				jTableDatosFacturaDescuadrada.removeRowSelectionInterval(0, jTableDatosFacturaDescuadrada.getRowCount()-1);						
			}
			
			this.isEsNuevoFacturaDescuadrada=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFacturaDescuadrada(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFacturaDescuadrada(true);			
			//this.facturadescuadrada=new FacturaDescuadrada();
			//this.facturadescuadrada.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturaDescuadrada(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturaDescuadrada() ;
			
			if(FacturaDescuadradaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturaDescuadrada(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.facturadescuadrada);	
			this.actualizarInformacion("INFO_PADRE",false,this.facturadescuadrada);				
			
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
			
			if(this.facturadescuadradaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FacturaDescuadrada: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFacturaDescuadradaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FacturaDescuadrada> facturadescuadradasSeleccionados=new ArrayList<FacturaDescuadrada>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFacturaDescuadrada.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFacturaDescuadrada.getSelectedRows().length;			
			}
			
			facturadescuadradasSeleccionados=this.getFacturaDescuadradasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFacturaDescuadrada--;			
				//FacturaDescuadrada facturadescuadradaAux= new FacturaDescuadrada();			
				//facturadescuadradaAux.setId(this.iIdNuevoFacturaDescuadrada);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FacturaDescuadrada facturadescuadradaOrigen=new FacturaDescuadrada();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FacturaDescuadrada facturadescuadradaOrigen : facturadescuadradasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							facturadescuadradaOrigen =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturadescuadradaOrigen =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFacturaDescuadrada();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.facturadescuadrada.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFacturaDescuadrada(facturadescuadradaOrigen,this.facturadescuadrada,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturadescuadradaLogic.getFacturaDescuadradas().add(this.facturadescuadradaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturadescuadradas.add(this.facturadescuadradaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFacturaDescuadrada(false);
				
				this.jTableDatosFacturaDescuadrada.setRowSelectionInterval(this.getIndiceNuevoFacturaDescuadrada(), this.getIndiceNuevoFacturaDescuadrada());
				
				int iLastRow =  this.jTableDatosFacturaDescuadrada.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturaDescuadrada.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturaDescuadrada.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturaDescuadrada(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FacturaDescuadrada> facturadescuadradasSeleccionados=new ArrayList<FacturaDescuadrada>();									
		
			FacturaDescuadrada facturadescuadradaOrigen=new FacturaDescuadrada();
			FacturaDescuadrada facturadescuadradaDestino=new FacturaDescuadrada();
				
			facturadescuadradasSeleccionados=this.getFacturaDescuadradasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFacturaDescuadrada.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || facturadescuadradasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFacturaDescuadrada.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadescuadradaOrigen =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturadescuadradaOrigen =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadescuadradaDestino =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturadescuadradaDestino =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				facturadescuadradaOrigen =facturadescuadradasSeleccionados.get(0);
				facturadescuadradaDestino =facturadescuadradasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFacturaDescuadrada(facturadescuadradaOrigen,facturadescuadradaDestino,true,false);
				
				facturadescuadradaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(facturadescuadradaDestino,facturadescuadradaLogic.getFacturaDescuadradas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturadescuadradaDestino,facturadescuadradas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFacturaDescuadrada(false);
				
				//this.jTableDatosFacturaDescuadrada.setRowSelectionInterval(this.getIndiceNuevoFacturaDescuadrada(), this.getIndiceNuevoFacturaDescuadrada());
				
				int iLastRow =  this.jTableDatosFacturaDescuadrada.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturaDescuadrada.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturaDescuadrada.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturaDescuadrada(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturaDescuadrada==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFacturaDescuadrada.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFacturaDescuadrada.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFacturaDescuadrada.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFacturaDescuadrada.setVisible(!isVisible);
			this.jPanelPaginacionFacturaDescuadrada.setVisible(!isVisible);
			this.jPanelAccionesFacturaDescuadrada.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFacturaDescuadrada();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFacturaDescuadrada();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFacturaDescuadrada();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFacturaDescuadrada();
			
			this.abrirFrameOrderByFacturaDescuadrada();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFacturaDescuadrada();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFacturaDescuadrada(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturaDescuadrada);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFacturaDescuadrada.isMaximum()) {
					this.jInternalFrameDetalleFormFacturaDescuadrada.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFacturaDescuadrada.setSize(this.jInternalFrameDetalleFormFacturaDescuadrada.iWidthFormulario,this.jInternalFrameDetalleFormFacturaDescuadrada.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFacturaDescuadrada.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFacturaDescuadrada.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFacturaDescuadrada.isMaximum()) {
						this.jInternalFrameDetalleFormFacturaDescuadrada.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFacturaDescuadrada.jContentPaneDetalleFacturaDescuadrada.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFacturaDescuadrada.jTabbedPaneRelacionesFacturaDescuadrada.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFacturaDescuadrada.jContentPaneDetalleFacturaDescuadrada.getWidth(),FacturaDescuadradaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturaDescuadrada.jTabbedPaneRelacionesFacturaDescuadrada.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFacturaDescuadrada.jContentPaneDetalleFacturaDescuadrada.getWidth(),FacturaDescuadradaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturaDescuadrada.jTabbedPaneRelacionesFacturaDescuadrada.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFacturaDescuadrada.jContentPaneDetalleFacturaDescuadrada.getWidth(),FacturaDescuadradaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFacturaDescuadrada.setVisible(true);
	        this.jInternalFrameDetalleFormFacturaDescuadrada.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFacturaDescuadrada() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFacturaDescuadrada==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFacturaDescuadrada=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaDescuadrada,false,this);
				} else {
					this.jInternalFrameOrderByFacturaDescuadrada=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaDescuadrada,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFacturaDescuadrada);
				this.jInternalFrameOrderByFacturaDescuadrada.setVisible(false);
				this.jInternalFrameOrderByFacturaDescuadrada.setSelected(false);
				
				this.jInternalFrameOrderByFacturaDescuadrada.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturaDescuadrada"));
				
				this.inicializarActualizarBindingTablaOrderByFacturaDescuadrada();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFacturaDescuadrada() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFacturaDescuadrada==null) {
				
				this.jInternalFrameImportacionFacturaDescuadrada=new ImportacionJInternalFrame(FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturaDescuadrada);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFacturaDescuadrada);
				this.jInternalFrameImportacionFacturaDescuadrada.setVisible(false);
				this.jInternalFrameImportacionFacturaDescuadrada.setSelected(false);


				this.jInternalFrameImportacionFacturaDescuadrada.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturaDescuadrada"));
				this.jInternalFrameImportacionFacturaDescuadrada.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturaDescuadrada"));
				this.jInternalFrameImportacionFacturaDescuadrada.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturaDescuadrada"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFacturaDescuadrada() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFacturaDescuadrada==null) {
				this.jInternalFrameReporteDinamicoFacturaDescuadrada=new ReporteDinamicoJInternalFrame(FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturaDescuadrada);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturaDescuadrada);
				this.jInternalFrameReporteDinamicoFacturaDescuadrada.setVisible(false);
				this.jInternalFrameReporteDinamicoFacturaDescuadrada.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturaDescuadrada"));
				this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturaDescuadrada"));
				this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturaDescuadrada"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturaDescuadrada();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleFacturaDescuadrada() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturaDescuadrada);
			
	       	this.jInternalFrameDetalleFormFacturaDescuadrada.setVisible(false);
	        this.jInternalFrameDetalleFormFacturaDescuadrada.setSelected(false);
			
			//this.jInternalFrameDetalleFormFacturaDescuadrada.dispose();
			//this.jInternalFrameDetalleFormFacturaDescuadrada=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFacturaDescuadrada() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFacturaDescuadrada.setVisible(true);
	        this.jInternalFrameReporteDinamicoFacturaDescuadrada.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFacturaDescuadrada() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFacturaDescuadrada.setVisible(true);
	        this.jInternalFrameImportacionFacturaDescuadrada.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFacturaDescuadrada() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFacturaDescuadrada.setVisible(true);
	        this.jInternalFrameOrderByFacturaDescuadrada.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFacturaDescuadrada() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFacturaDescuadrada.setVisible(false);
	        this.jInternalFrameOrderByFacturaDescuadrada.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFacturaDescuadrada() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFacturaDescuadrada.setVisible(false);
	        this.jInternalFrameReporteDinamicoFacturaDescuadrada.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFacturaDescuadrada() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFacturaDescuadrada.setVisible(false);
	        this.jInternalFrameImportacionFacturaDescuadrada.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFacturaDescuadrada(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFacturaDescuadrada(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFacturaDescuadrada(true);
			//this.isEsNuevoFacturaDescuadrada=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFacturaDescuadrada("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturaDescuadrada(false) ;
			
			if(facturadescuadradaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(FacturaDescuadradaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturaDescuadrada(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturaDescuadrada(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFacturaDescuadradaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFacturaDescuadrada(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturaDescuadrada==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFacturaDescuadrada(true);
			//this.isEsNuevoFacturaDescuadrada=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.facturadescuadrada.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFacturaDescuadrada("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFacturaDescuadrada(false) ;
			
			if(FacturaDescuadradaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturaDescuadrada(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturaDescuadrada(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFacturaDescuadrada(false);
			
			//if(!this.isEsNuevoFacturaDescuadrada) {								
				int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
				
			}
			
			if(this.permiteMantenimiento(this.facturadescuadrada)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFacturaDescuadrada=true;
					this.inicializarActualizarBindingTablaFacturaDescuadrada(false);
					this.isEsNuevoFacturaDescuadrada=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFacturaDescuadrada=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFacturaDescuadrada=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturaDescuadrada(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturaDescuadrada(false);
				
				this.habilitarDeshabilitarControlesFacturaDescuadrada(false);
			
												
				
				if(FacturaDescuadradaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFacturaDescuadrada();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFacturaDescuadradaActionPerformed(evt,facturadescuadradaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFacturaDescuadrada(this.facturadescuadrada,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFacturaDescuadrada.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,facturadescuadradaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.facturadescuadrada.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FacturaDescuadrada.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDescuadrada.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				this.facturadescuadrada.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				this.facturadescuadrada.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.facturadescuadrada)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FacturaDescuadradaModel) this.jTableDatosFacturaDescuadrada.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFacturaDescuadrada=true;
				this.inicializarActualizarBindingTablaFacturaDescuadrada(false);
				this.isEsNuevoFacturaDescuadrada=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturaDescuadrada(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturaDescuadrada(false);
				
				this.habilitarDeshabilitarControlesFacturaDescuadrada(false);
				
				
				
				if(FacturaDescuadradaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFacturaDescuadrada();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFacturaDescuadrada.getRowCount()>=1) {
				jTableDatosFacturaDescuadrada.removeRowSelectionInterval(0, jTableDatosFacturaDescuadrada.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFacturaDescuadrada(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFacturaDescuadrada(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturaDescuadrada(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturaDescuadrada(false) ;
			
			this.isEsNuevoFacturaDescuadrada=false;
			
			if(FacturaDescuadradaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFacturaDescuadrada();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFacturaDescuadrada(false);
				
				//SI ES MANUAL
				if(FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFacturaDescuadrada();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFacturaDescuadrada--;			
			//FacturaDescuadrada facturadescuadradaAux= new FacturaDescuadrada();			
			//facturadescuadradaAux.setId(this.iIdNuevoFacturaDescuadrada);
			
			if(this.jInternalFrameDetalleFormFacturaDescuadrada==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFacturaDescuadrada();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
			
			this.facturadescuadrada.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.facturadescuadradaLogic.getFacturaDescuadradas().add(this.facturadescuadradaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.facturadescuadradas.add(this.facturadescuadradaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFacturaDescuadrada(false);
			
			this.jTableDatosFacturaDescuadrada.setRowSelectionInterval(this.getIndiceNuevoFacturaDescuadrada(), this.getIndiceNuevoFacturaDescuadrada());
			
			int iLastRow =  this.jTableDatosFacturaDescuadrada.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFacturaDescuadrada.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFacturaDescuadrada.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFacturaDescuadrada(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFacturaDescuadrada(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturaDescuadrada(false);
			
			//SI ES MANUAL
			if(FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturaDescuadrada();
			}
			
			//this.abrirFrameTreeFacturaDescuadrada();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFacturaDescuadrada.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFacturaDescuadrada.setFileImportacion(this.jInternalFrameImportacionFacturaDescuadrada.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFacturaDescuadrada.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFacturaDescuadrada.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFacturaDescuadrada.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFacturaDescuadrada.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FacturaDescuadrada> facturadescuadradasSeleccionados=new ArrayList<FacturaDescuadrada>();		

		facturadescuadradasSeleccionados=this.getFacturaDescuadradasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FacturaDescuadradaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FacturaDescuadradaBaseDesign.jrxml";
			
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
			
			this.generarReporteFacturaDescuadradas("Todos",facturadescuadradasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Descuadrada",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_SUBTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_btotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_btotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_btotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_btotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_FINANCIAMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nanciamiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nanciamiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nanciamiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nanciamiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_FLETE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ete_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ete_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ete_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ete_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_ICE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_e_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_e_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_e_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_e_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_TOTALFORMASPAGO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talFormasPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talFormasPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talFormasPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talFormasPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTOREAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuentoReal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuentoReal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuentoReal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuentoReal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoria="subtotal";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoria="descuento";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_FINANCIAMIENTO:
					sNombreCampoCategoria="financiamiento";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoria="flete";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoria="ice";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_TOTALFORMASPAGO:
					sNombreCampoCategoria="total_formas_pago";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTOREAL:
					sNombreCampoCategoria="descuento_real";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoriaValor="subtotal";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoriaValor="descuento";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_FINANCIAMIENTO:
					sNombreCampoCategoriaValor="financiamiento";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoriaValor="flete";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoriaValor="ice";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_TOTALFORMASPAGO:
					sNombreCampoCategoriaValor="total_formas_pago";
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTOREAL:
					sNombreCampoCategoriaValor="descuento_real";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_SUBTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Subtotal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"subtotal");
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento");
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_FINANCIAMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Financiamiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"financiamiento");
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_FLETE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Flete",sNombreCampoCategoria,sNombreCampoCategoriaValor,"flete");
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_ICE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ice",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ice");
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_TOTALFORMASPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Formas Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_formas_pago");
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTOREAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento Real",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento_real");
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
	
	public void jButtonGenerarExcelReporteDinamicoFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FacturaDescuadrada> facturadescuadradasSeleccionados=new ArrayList<FacturaDescuadrada>();		
		
		facturadescuadradasSeleccionados=this.getFacturaDescuadradasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturadescuadrada";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FacturaDescuadradas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FacturaDescuadradaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FacturaDescuadrada facturadescuadrada:facturadescuadradasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadescuadrada.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(FacturaDescuadrada facturadescuadrada:facturadescuadradasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadescuadrada.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(FacturaDescuadrada facturadescuadrada:facturadescuadradasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadescuadrada.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(FacturaDescuadrada facturadescuadrada:facturadescuadradasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadescuadrada.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(FacturaDescuadrada facturadescuadrada:facturadescuadradasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadescuadrada.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_SUBTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_SUBTOTAL);
					iRow++;

					for(FacturaDescuadrada facturadescuadrada:facturadescuadradasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadescuadrada.getsubtotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_IVA);
					iRow++;

					for(FacturaDescuadrada facturadescuadrada:facturadescuadradasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadescuadrada.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTO);
					iRow++;

					for(FacturaDescuadrada facturadescuadrada:facturadescuadradasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadescuadrada.getdescuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_FINANCIAMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_FINANCIAMIENTO);
					iRow++;

					for(FacturaDescuadrada facturadescuadrada:facturadescuadradasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadescuadrada.getfinanciamiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_FLETE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_FLETE);
					iRow++;

					for(FacturaDescuadrada facturadescuadrada:facturadescuadradasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadescuadrada.getflete());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_ICE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_ICE);
					iRow++;

					for(FacturaDescuadrada facturadescuadrada:facturadescuadradasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadescuadrada.getice());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(FacturaDescuadrada facturadescuadrada:facturadescuadradasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadescuadrada.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_TOTALFORMASPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_TOTALFORMASPAGO);
					iRow++;

					for(FacturaDescuadrada facturadescuadrada:facturadescuadradasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadescuadrada.gettotal_formas_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTOREAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTOREAL);
					iRow++;

					for(FacturaDescuadrada facturadescuadrada:facturadescuadradasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadescuadrada.getdescuento_real());
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
			//	this.getFilaCabeceraExportarExcelFacturaDescuadrada(row);				
			//	iRow++;
			//}				
			
			//for(FacturaDescuadrada facturadescuadradaAux:facturadescuadradasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFacturaDescuadrada(facturadescuadradaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Descuadrada",JOptionPane.INFORMATION_MESSAGE);
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
				this.facturadescuadradaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturaDescuadrada(false);
			
			//SI ES MANUAL
			if(FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturaDescuadrada();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturaDescuadrada(false);
			
			//SI ES MANUAL
			if(FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturaDescuadrada();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturaDescuadrada(false);
			
			//SI ES MANUAL
			if(FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturaDescuadrada();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFacturaDescuadrada() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFacturaDescuadrada.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFacturaDescuadrada.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFacturaDescuadrada.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFacturaDescuadrada.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFacturaDescuadrada.setMinimumSize(dimensionMinimum);
		this.jTableDatosFacturaDescuadrada.setMaximumSize(dimensionMaximum);
		this.jTableDatosFacturaDescuadrada.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFacturaDescuadrada(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFacturaDescuadrada(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFacturaDescuadrada(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFacturaDescuadrada(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFacturaDescuadrada(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFacturaDescuadrada(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturaDescuadrada(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFacturaDescuadrada(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFacturaDescuadrada() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFacturaDescuadrada();
		
		this.inicializarActualizarBindingBotonesManualFacturaDescuadrada(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFacturaDescuadrada();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturaDescuadrada() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFacturaDescuadrada(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFacturaDescuadrada(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFacturaDescuadrada.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFacturaDescuadrada.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFacturaDescuadrada.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFacturaDescuadrada.jCheckBoxPostAccionNuevoFacturaDescuadrada.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFacturaDescuadrada.jCheckBoxPostAccionSinCerrarFacturaDescuadrada.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFacturaDescuadrada.jCheckBoxPostAccionSinMensajeFacturaDescuadrada.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFacturaDescuadrada.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFacturaDescuadrada.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFacturaDescuadrada.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
				this.jInternalFrameDetalleFormFacturaDescuadrada.jCheckBoxPostAccionNuevoFacturaDescuadrada.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFacturaDescuadrada.jCheckBoxPostAccionSinCerrarFacturaDescuadrada.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFacturaDescuadrada.jCheckBoxPostAccionSinMensajeFacturaDescuadrada.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFacturaDescuadrada.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFacturaDescuadrada.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxTiposAccionesFormularioFacturaDescuadrada.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFacturaDescuadrada.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFacturaDescuadrada!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFacturaDescuadrada.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFacturaDescuadrada.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFacturaDescuadrada.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFacturaDescuadrada.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFacturaDescuadrada!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFacturaDescuadrada.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFacturaDescuadrada.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFacturaDescuadrada(Boolean esInicializar) throws Exception {
		try	{	
			if(FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFacturaDescuadrada(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFacturaDescuadrada() throws Exception {
		try	{
			if(FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturaDescuadrada();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturaDescuadrada() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxTiposAccionesFormularioFacturaDescuadrada.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxTiposAccionesFormularioFacturaDescuadrada.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturaDescuadrada() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFacturaDescuadrada.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFacturaDescuadrada.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFacturaDescuadrada.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFacturaDescuadrada.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFacturaDescuadrada.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFacturaDescuadrada.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFacturaDescuadrada.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFacturaDescuadrada.addItem(reporte);
			}
			
			
			if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFacturaDescuadrada.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFacturaDescuadrada.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFacturaDescuadrada.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFacturaDescuadrada.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFacturaDescuadrada.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFacturaDescuadrada.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxTiposAccionesFormularioFacturaDescuadrada.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxTiposAccionesFormularioFacturaDescuadrada.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFacturaDescuadrada.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFacturaDescuadrada.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFacturaDescuadrada.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturaDescuadrada();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturaDescuadrada() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturaDescuadrada!=null) {
				this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturaDescuadrada!=null) {
				this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFacturaDescuadrada!=null) {
				
				if(this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=FacturaDescuadradaConstantesFunciones.getTiposSeleccionarFacturaDescuadrada(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=FacturaDescuadradaConstantesFunciones.getTiposSeleccionarFacturaDescuadrada(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=FacturaDescuadradaConstantesFunciones.getTiposSeleccionarFacturaDescuadrada(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFacturaDescuadrada()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_inicioBusquedaFacturaDescuadrada=new Date(this.jDateChooserfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada.getDate().getTime());
		this.fecha_finBusquedaFacturaDescuadrada=new Date(this.jDateChooserfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFacturaDescuadrada(Boolean esInicializar) throws Exception {				
		if(FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFacturaDescuadrada();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFacturaDescuadrada() throws Exception {
		this.inicializarActualizarBindingTablaFacturaDescuadrada(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFacturaDescuadrada() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFacturaDescuadrada.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFacturaDescuadrada.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturaDescuadrada.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FacturaDescuadradaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFacturaDescuadrada.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturaDescuadrada.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FacturaDescuadradaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFacturaDescuadradaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDescuadradaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FacturaDescuadradaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFacturaDescuadrada.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturaDescuadrada.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FacturaDescuadradaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFacturaDescuadrada.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFacturaDescuadrada(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=facturadescuadradaLogic.getFacturaDescuadradas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=facturadescuadradas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFacturaDescuadrada.setModel(new FacturaDescuadradaModel(this.facturadescuadradaLogic.getFacturaDescuadradas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFacturaDescuadrada.setModel(new FacturaDescuadradaModel(this.facturadescuadradas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFacturaDescuadrada!=null && this.jInternalFrameOrderByFacturaDescuadrada.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFacturaDescuadrada();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFacturaDescuadrada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDescuadrada,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FacturaDescuadradaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO,facturadescuadradaConstantesFunciones.resaltarSeleccionarFacturaDescuadrada,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO,facturadescuadradaConstantesFunciones.resaltarSeleccionarFacturaDescuadrada,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFacturaDescuadrada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDescuadrada,FacturaDescuadradaConstantesFunciones.LABEL_ID));

		if(this.facturadescuadradaConstantesFunciones.mostraridFacturaDescuadrada && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDescuadradaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturadescuadradaConstantesFunciones.resaltaridFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activaridFacturaDescuadrada,iSizeTabla,this,true,"idFacturaDescuadrada","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadescuadradaConstantesFunciones.resaltaridFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activaridFacturaDescuadrada,this,true,"idFacturaDescuadrada","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDescuadrada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDescuadrada,FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL));

		if(this.facturadescuadradaConstantesFunciones.mostrarsecuencialFacturaDescuadrada && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturadescuadradaConstantesFunciones.resaltarsecuencialFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activarsecuencialFacturaDescuadrada,iSizeTabla,this,true,"secuencialFacturaDescuadrada","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadescuadradaConstantesFunciones.resaltarsecuencialFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activarsecuencialFacturaDescuadrada,this,true,"secuencialFacturaDescuadrada","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturaDescuadradaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDescuadrada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDescuadrada,FacturaDescuadradaConstantesFunciones.LABEL_FECHA));

		if(this.facturadescuadradaConstantesFunciones.mostrarfechaFacturaDescuadrada && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDescuadradaConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.facturadescuadradaConstantesFunciones.resaltarfechaFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activarfechaFacturaDescuadrada,iSizeTabla,this,true,"fechaFacturaDescuadrada","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.facturadescuadradaConstantesFunciones.resaltarfechaFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activarfechaFacturaDescuadrada,this,true,"fechaFacturaDescuadrada","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new FacturaDescuadradaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDescuadrada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDescuadrada,FacturaDescuadradaConstantesFunciones.LABEL_SUBTOTAL));

		if(this.facturadescuadradaConstantesFunciones.mostrarsubtotalFacturaDescuadrada && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDescuadradaConstantesFunciones.LABEL_SUBTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturadescuadradaConstantesFunciones.resaltarsubtotalFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activarsubtotalFacturaDescuadrada,iSizeTabla,this,true,"subtotalFacturaDescuadrada","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadescuadradaConstantesFunciones.resaltarsubtotalFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activarsubtotalFacturaDescuadrada,this,true,"subtotalFacturaDescuadrada","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturaDescuadradaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDescuadrada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDescuadrada,FacturaDescuadradaConstantesFunciones.LABEL_IVA));

		if(this.facturadescuadradaConstantesFunciones.mostrarivaFacturaDescuadrada && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDescuadradaConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturadescuadradaConstantesFunciones.resaltarivaFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activarivaFacturaDescuadrada,iSizeTabla,this,true,"ivaFacturaDescuadrada","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadescuadradaConstantesFunciones.resaltarivaFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activarivaFacturaDescuadrada,this,true,"ivaFacturaDescuadrada","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturaDescuadradaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDescuadrada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDescuadrada,FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTO));

		if(this.facturadescuadradaConstantesFunciones.mostrardescuentoFacturaDescuadrada && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturadescuadradaConstantesFunciones.resaltardescuentoFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activardescuentoFacturaDescuadrada,iSizeTabla,this,true,"descuentoFacturaDescuadrada","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadescuadradaConstantesFunciones.resaltardescuentoFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activardescuentoFacturaDescuadrada,this,true,"descuentoFacturaDescuadrada","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturaDescuadradaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDescuadrada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDescuadrada,FacturaDescuadradaConstantesFunciones.LABEL_FINANCIAMIENTO));

		if(this.facturadescuadradaConstantesFunciones.mostrarfinanciamientoFacturaDescuadrada && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDescuadradaConstantesFunciones.LABEL_FINANCIAMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturadescuadradaConstantesFunciones.resaltarfinanciamientoFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activarfinanciamientoFacturaDescuadrada,iSizeTabla,this,true,"financiamientoFacturaDescuadrada","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadescuadradaConstantesFunciones.resaltarfinanciamientoFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activarfinanciamientoFacturaDescuadrada,this,true,"financiamientoFacturaDescuadrada","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturaDescuadradaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDescuadrada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDescuadrada,FacturaDescuadradaConstantesFunciones.LABEL_FLETE));

		if(this.facturadescuadradaConstantesFunciones.mostrarfleteFacturaDescuadrada && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDescuadradaConstantesFunciones.LABEL_FLETE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturadescuadradaConstantesFunciones.resaltarfleteFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activarfleteFacturaDescuadrada,iSizeTabla,this,true,"fleteFacturaDescuadrada","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadescuadradaConstantesFunciones.resaltarfleteFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activarfleteFacturaDescuadrada,this,true,"fleteFacturaDescuadrada","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturaDescuadradaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDescuadrada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDescuadrada,FacturaDescuadradaConstantesFunciones.LABEL_ICE));

		if(this.facturadescuadradaConstantesFunciones.mostrariceFacturaDescuadrada && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDescuadradaConstantesFunciones.LABEL_ICE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturadescuadradaConstantesFunciones.resaltariceFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activariceFacturaDescuadrada,iSizeTabla,this,true,"iceFacturaDescuadrada","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadescuadradaConstantesFunciones.resaltariceFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activariceFacturaDescuadrada,this,true,"iceFacturaDescuadrada","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturaDescuadradaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDescuadrada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDescuadrada,FacturaDescuadradaConstantesFunciones.LABEL_TOTAL));

		if(this.facturadescuadradaConstantesFunciones.mostrartotalFacturaDescuadrada && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDescuadradaConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturadescuadradaConstantesFunciones.resaltartotalFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activartotalFacturaDescuadrada,iSizeTabla,this,true,"totalFacturaDescuadrada","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadescuadradaConstantesFunciones.resaltartotalFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activartotalFacturaDescuadrada,this,true,"totalFacturaDescuadrada","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturaDescuadradaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDescuadrada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDescuadrada,FacturaDescuadradaConstantesFunciones.LABEL_TOTALFORMASPAGO));

		if(this.facturadescuadradaConstantesFunciones.mostrartotal_formas_pagoFacturaDescuadrada && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDescuadradaConstantesFunciones.LABEL_TOTALFORMASPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturadescuadradaConstantesFunciones.resaltartotal_formas_pagoFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activartotal_formas_pagoFacturaDescuadrada,iSizeTabla,this,true,"total_formas_pagoFacturaDescuadrada","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadescuadradaConstantesFunciones.resaltartotal_formas_pagoFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activartotal_formas_pagoFacturaDescuadrada,this,true,"total_formas_pagoFacturaDescuadrada","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturaDescuadradaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDescuadrada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDescuadrada,FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTOREAL));

		if(this.facturadescuadradaConstantesFunciones.mostrardescuento_realFacturaDescuadrada && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTOREAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturadescuadradaConstantesFunciones.resaltardescuento_realFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activardescuento_realFacturaDescuadrada,iSizeTabla,this,true,"descuento_realFacturaDescuadrada","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadescuadradaConstantesFunciones.resaltardescuento_realFacturaDescuadrada,this.facturadescuadradaConstantesFunciones.activardescuento_realFacturaDescuadrada,this,true,"descuento_realFacturaDescuadrada","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturaDescuadradaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturadescuadradaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturadescuadradaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturaDescuadrada.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturadescuadradaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturadescuadradaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturaDescuadrada.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFacturaDescuadrada && this.isPermisoGuardarCambiosFacturaDescuadrada) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.facturadescuadradaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.facturadescuadradaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFacturaDescuadrada.addColumn(tableColumn);
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
			
			this.jTableDatosFacturaDescuadrada.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturaDescuadrada && this.isPermisoGuardarCambiosFacturaDescuadrada) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturaDescuadrada && this.isPermisoGuardarCambiosFacturaDescuadrada) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFacturaDescuadrada.moveColumn(this.jTableDatosFacturaDescuadrada.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFacturaDescuadrada.moveColumn(this.jTableDatosFacturaDescuadrada.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFacturaDescuadrada.moveColumn(this.jTableDatosFacturaDescuadrada.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFacturaDescuadrada.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFacturaDescuadrada.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFacturaDescuadrada,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFacturaDescuadrada.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFacturaDescuadrada.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFacturaDescuadrada.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFacturaDescuadrada.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFacturaDescuadrada.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=facturadescuadradaLogic.getFacturaDescuadradas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=facturadescuadradas.size()-1;
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
		//this.jTableDatosFacturaDescuadrada.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFacturaDescuadrada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFacturaDescuadrada();
			
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
				
				//this.isEsNuevoFacturaDescuadrada=false;
					
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
			
				if(this.facturadescuadradaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFacturaDescuadrada==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturaDescuadrada.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturaDescuadrada.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.facturadescuadrada.getsType().equals("DUPLICADO")
				   || this.facturadescuadrada.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFacturaDescuadrada=true;
				
				} else {
					this.isEsNuevoFacturaDescuadrada=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
					if(this.facturadescuadrada.getId()>=0 && !this.facturadescuadrada.getIsNew()) {						
						this.isEsNuevoFacturaDescuadrada=false;
						
					} else {
						this.isEsNuevoFacturaDescuadrada=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFacturaDescuadrada(esRelaciones);						
				
				this.seleccionarFacturaDescuadrada(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.facturadescuadrada.getId()<0) {
					this.isEsNuevoFacturaDescuadrada=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFacturaDescuadrada(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFacturaDescuadrada(evt,rowIndex);
				}	
				
				if(this.facturadescuadradaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FacturaDescuadrada: " + this.dDif); 
					}
				}								
				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFacturaDescuadrada(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.facturadescuadrada)) {
					if(this.facturadescuadrada.getId()>0) {
						this.facturadescuadrada.setIsDeleted(true);
						
						this.facturadescuadradasEliminados.add(this.facturadescuadrada);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturadescuadradaLogic.getFacturaDescuadradas().remove(this.facturadescuadrada);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturadescuadradas.remove(this.facturadescuadrada);				
					}
					
					
					((FacturaDescuadradaModel) this.jTableDatosFacturaDescuadrada.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturaDescuadrada(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFacturaDescuadrada(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFacturaDescuadrada) {
			
			if(this.jInternalFrameDetalleFormFacturaDescuadrada==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturaDescuadrada.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturaDescuadrada.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFacturaDescuadrada(this.facturadescuadrada);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFacturaDescuadrada("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFacturaDescuadrada(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturaDescuadrada() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturaDescuadrada(FacturaDescuadrada facturadescuadrada) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFacturaDescuadrada(facturadescuadrada,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturaDescuadrada(FacturaDescuadrada facturadescuadrada,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFacturaDescuadrada(facturadescuadrada);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFacturaDescuadrada(facturadescuadrada,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFacturaDescuadrada(facturadescuadrada);
	}
	
	public void setVariablesObjetoActualToFormularioFacturaDescuadrada(FacturaDescuadrada facturadescuadrada) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFacturaDescuadrada==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelidFacturaDescuadrada.setText(facturadescuadrada.getId().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldsecuencialFacturaDescuadrada.setText(facturadescuadrada.getsecuencial());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jDateChooserfechaFacturaDescuadrada.setDate(facturadescuadrada.getfecha());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldsubtotalFacturaDescuadrada.setText(facturadescuadrada.getsubtotal().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldivaFacturaDescuadrada.setText(facturadescuadrada.getiva().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFielddescuentoFacturaDescuadrada.setText(facturadescuadrada.getdescuento().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldfinanciamientoFacturaDescuadrada.setText(facturadescuadrada.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldfleteFacturaDescuadrada.setText(facturadescuadrada.getflete().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldiceFacturaDescuadrada.setText(facturadescuadrada.getice().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldtotalFacturaDescuadrada.setText(facturadescuadrada.gettotal().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldtotal_formas_pagoFacturaDescuadrada.setText(facturadescuadrada.gettotal_formas_pago().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFielddescuento_realFacturaDescuadrada.setText(facturadescuadrada.getdescuento_real().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FacturaDescuadrada facturadescuadradaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,facturadescuadradaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FacturaDescuadrada facturadescuadradaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				facturadescuadradaLocal=this.facturadescuadrada;
			} else {
				facturadescuadradaLocal=this.facturadescuadradaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(facturadescuadradaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFacturaDescuadrada(facturadescuadradaLocal,true);
					
					if(facturadescuadradaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(facturadescuadradaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(facturadescuadradaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFacturaDescuadrada(FacturaDescuadrada facturadescuadrada,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturaDescuadrada(facturadescuadrada,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(facturadescuadrada);
	}
	
	public void setVariablesFormularioToObjetoActualFacturaDescuadrada(FacturaDescuadrada facturadescuadrada,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturaDescuadrada(facturadescuadrada,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFacturaDescuadrada(FacturaDescuadrada facturadescuadrada,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFacturaDescuadrada==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelidFacturaDescuadrada.getText()==null || this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelidFacturaDescuadrada.getText()=="" || this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelidFacturaDescuadrada.getText()=="Id") {
				this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelidFacturaDescuadrada.setText("0");
			}

			if(conColumnasBase) {facturadescuadrada.setId(Long.parseLong(this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelidFacturaDescuadrada.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDescuadradaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelIdFacturaDescuadrada,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadescuadrada.setsecuencial(this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldsecuencialFacturaDescuadrada.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelsecuencialFacturaDescuadrada,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadescuadrada.setfecha(this.jInternalFrameDetalleFormFacturaDescuadrada.jDateChooserfechaFacturaDescuadrada.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDescuadradaConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelfechaFacturaDescuadrada,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadescuadrada.setsubtotal(Double.parseDouble(this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldsubtotalFacturaDescuadrada.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDescuadradaConstantesFunciones.LABEL_SUBTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelsubtotalFacturaDescuadrada,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadescuadrada.setiva(Double.parseDouble(this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldivaFacturaDescuadrada.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDescuadradaConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelivaFacturaDescuadrada,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadescuadrada.setdescuento(Double.parseDouble(this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFielddescuentoFacturaDescuadrada.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabeldescuentoFacturaDescuadrada,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadescuadrada.setfinanciamiento(Double.parseDouble(this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldfinanciamientoFacturaDescuadrada.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDescuadradaConstantesFunciones.LABEL_FINANCIAMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelfinanciamientoFacturaDescuadrada,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadescuadrada.setflete(Double.parseDouble(this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldfleteFacturaDescuadrada.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDescuadradaConstantesFunciones.LABEL_FLETE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelfleteFacturaDescuadrada,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadescuadrada.setice(Double.parseDouble(this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldiceFacturaDescuadrada.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDescuadradaConstantesFunciones.LABEL_ICE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabeliceFacturaDescuadrada,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadescuadrada.settotal(Double.parseDouble(this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldtotalFacturaDescuadrada.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDescuadradaConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabeltotalFacturaDescuadrada,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadescuadrada.settotal_formas_pago(Double.parseDouble(this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldtotal_formas_pagoFacturaDescuadrada.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDescuadradaConstantesFunciones.LABEL_TOTALFORMASPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabeltotal_formas_pagoFacturaDescuadrada,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadescuadrada.setdescuento_real(Double.parseDouble(this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFielddescuento_realFacturaDescuadrada.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTOREAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDescuadrada.jLabeldescuento_realFacturaDescuadrada,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturaDescuadrada(FacturaDescuadrada facturadescuadradaBean,FacturaDescuadrada facturadescuadrada,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFacturaDescuadrada(FacturaDescuadrada facturadescuadradaOrigen,FacturaDescuadrada facturadescuadrada,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturadescuadradaOrigen.getId()!=null && !facturadescuadradaOrigen.getId().equals(0L))) {facturadescuadrada.setId(facturadescuadradaOrigen.getId());}}
			if(conDefault || (!conDefault && facturadescuadradaOrigen.getfecha_inicio()!=null && !facturadescuadradaOrigen.getfecha_inicio().equals(new Date()))) {facturadescuadrada.setfecha_inicio(facturadescuadradaOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && facturadescuadradaOrigen.getfecha_fin()!=null && !facturadescuadradaOrigen.getfecha_fin().equals(new Date()))) {facturadescuadrada.setfecha_fin(facturadescuadradaOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && facturadescuadradaOrigen.getsecuencial()!=null && !facturadescuadradaOrigen.getsecuencial().equals(""))) {facturadescuadrada.setsecuencial(facturadescuadradaOrigen.getsecuencial());}
			if(conDefault || (!conDefault && facturadescuadradaOrigen.getfecha()!=null && !facturadescuadradaOrigen.getfecha().equals(new Date()))) {facturadescuadrada.setfecha(facturadescuadradaOrigen.getfecha());}
			if(conDefault || (!conDefault && facturadescuadradaOrigen.getsubtotal()!=null && !facturadescuadradaOrigen.getsubtotal().equals(0.0))) {facturadescuadrada.setsubtotal(facturadescuadradaOrigen.getsubtotal());}
			if(conDefault || (!conDefault && facturadescuadradaOrigen.getiva()!=null && !facturadescuadradaOrigen.getiva().equals(0.0))) {facturadescuadrada.setiva(facturadescuadradaOrigen.getiva());}
			if(conDefault || (!conDefault && facturadescuadradaOrigen.getdescuento()!=null && !facturadescuadradaOrigen.getdescuento().equals(0.0))) {facturadescuadrada.setdescuento(facturadescuadradaOrigen.getdescuento());}
			if(conDefault || (!conDefault && facturadescuadradaOrigen.getfinanciamiento()!=null && !facturadescuadradaOrigen.getfinanciamiento().equals(0.0))) {facturadescuadrada.setfinanciamiento(facturadescuadradaOrigen.getfinanciamiento());}
			if(conDefault || (!conDefault && facturadescuadradaOrigen.getflete()!=null && !facturadescuadradaOrigen.getflete().equals(0.0))) {facturadescuadrada.setflete(facturadescuadradaOrigen.getflete());}
			if(conDefault || (!conDefault && facturadescuadradaOrigen.getice()!=null && !facturadescuadradaOrigen.getice().equals(0.0))) {facturadescuadrada.setice(facturadescuadradaOrigen.getice());}
			if(conDefault || (!conDefault && facturadescuadradaOrigen.gettotal()!=null && !facturadescuadradaOrigen.gettotal().equals(0.0))) {facturadescuadrada.settotal(facturadescuadradaOrigen.gettotal());}
			if(conDefault || (!conDefault && facturadescuadradaOrigen.gettotal_formas_pago()!=null && !facturadescuadradaOrigen.gettotal_formas_pago().equals(0.0))) {facturadescuadrada.settotal_formas_pago(facturadescuadradaOrigen.gettotal_formas_pago());}
			if(conDefault || (!conDefault && facturadescuadradaOrigen.getdescuento_real()!=null && !facturadescuadradaOrigen.getdescuento_real().equals(0.0))) {facturadescuadrada.setdescuento_real(facturadescuadradaOrigen.getdescuento_real());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturaDescuadrada(FacturaDescuadrada facturadescuadrada) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelidFacturaDescuadrada.setText(facturadescuadrada.getId().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldsecuencialFacturaDescuadrada.setText(facturadescuadrada.getsecuencial());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jDateChooserfechaFacturaDescuadrada.setDate(facturadescuadrada.getfecha());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldsubtotalFacturaDescuadrada.setText(facturadescuadrada.getsubtotal().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldivaFacturaDescuadrada.setText(facturadescuadrada.getiva().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFielddescuentoFacturaDescuadrada.setText(facturadescuadrada.getdescuento().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldfinanciamientoFacturaDescuadrada.setText(facturadescuadrada.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldfleteFacturaDescuadrada.setText(facturadescuadrada.getflete().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldiceFacturaDescuadrada.setText(facturadescuadrada.getice().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldtotalFacturaDescuadrada.setText(facturadescuadrada.gettotal().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldtotal_formas_pagoFacturaDescuadrada.setText(facturadescuadrada.gettotal_formas_pago().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFielddescuento_realFacturaDescuadrada.setText(facturadescuadrada.getdescuento_real().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturaDescuadrada(FacturaDescuadradaBean facturadescuadradaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelidFacturaDescuadrada.setText(facturadescuadradaBean.getId().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldsecuencialFacturaDescuadrada.setText(facturadescuadradaBean.getsecuencial());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jDateChooserfechaFacturaDescuadrada.setDate(facturadescuadradaBean.getfecha());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldsubtotalFacturaDescuadrada.setText(facturadescuadradaBean.getsubtotal().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldivaFacturaDescuadrada.setText(facturadescuadradaBean.getiva().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFielddescuentoFacturaDescuadrada.setText(facturadescuadradaBean.getdescuento().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldfinanciamientoFacturaDescuadrada.setText(facturadescuadradaBean.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldfleteFacturaDescuadrada.setText(facturadescuadradaBean.getflete().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldiceFacturaDescuadrada.setText(facturadescuadradaBean.getice().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldtotalFacturaDescuadrada.setText(facturadescuadradaBean.gettotal().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldtotal_formas_pagoFacturaDescuadrada.setText(facturadescuadradaBean.gettotal_formas_pago().toString());
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFielddescuento_realFacturaDescuadrada.setText(facturadescuadradaBean.getdescuento_real().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFacturaDescuadrada(FacturaDescuadradaParameterReturnGeneral facturadescuadradaReturnGeneral,FacturaDescuadradaBean facturadescuadradaBean,Boolean conDefault) throws Exception { 
		try {
			FacturaDescuadrada facturadescuadradaLocal=new FacturaDescuadrada();
			
			facturadescuadradaLocal=facturadescuadradaReturnGeneral.getFacturaDescuadrada();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturadescuadradaLocal.getId()!=null && !facturadescuadradaLocal.getId().equals(0L))) {facturadescuadradaBean.setId(facturadescuadradaLocal.getId());}}
			if(conDefault || (!conDefault && facturadescuadradaLocal.getsecuencial()!=null && !facturadescuadradaLocal.getsecuencial().equals(""))) {facturadescuadradaBean.setsecuencial(facturadescuadradaLocal.getsecuencial());}
			if(conDefault || (!conDefault && facturadescuadradaLocal.getfecha()!=null && !facturadescuadradaLocal.getfecha().equals(new Date()))) {facturadescuadradaBean.setfecha(facturadescuadradaLocal.getfecha());}
			if(conDefault || (!conDefault && facturadescuadradaLocal.getsubtotal()!=null && !facturadescuadradaLocal.getsubtotal().equals(0.0))) {facturadescuadradaBean.setsubtotal(facturadescuadradaLocal.getsubtotal());}
			if(conDefault || (!conDefault && facturadescuadradaLocal.getiva()!=null && !facturadescuadradaLocal.getiva().equals(0.0))) {facturadescuadradaBean.setiva(facturadescuadradaLocal.getiva());}
			if(conDefault || (!conDefault && facturadescuadradaLocal.getdescuento()!=null && !facturadescuadradaLocal.getdescuento().equals(0.0))) {facturadescuadradaBean.setdescuento(facturadescuadradaLocal.getdescuento());}
			if(conDefault || (!conDefault && facturadescuadradaLocal.getfinanciamiento()!=null && !facturadescuadradaLocal.getfinanciamiento().equals(0.0))) {facturadescuadradaBean.setfinanciamiento(facturadescuadradaLocal.getfinanciamiento());}
			if(conDefault || (!conDefault && facturadescuadradaLocal.getflete()!=null && !facturadescuadradaLocal.getflete().equals(0.0))) {facturadescuadradaBean.setflete(facturadescuadradaLocal.getflete());}
			if(conDefault || (!conDefault && facturadescuadradaLocal.getice()!=null && !facturadescuadradaLocal.getice().equals(0.0))) {facturadescuadradaBean.setice(facturadescuadradaLocal.getice());}
			if(conDefault || (!conDefault && facturadescuadradaLocal.gettotal()!=null && !facturadescuadradaLocal.gettotal().equals(0.0))) {facturadescuadradaBean.settotal(facturadescuadradaLocal.gettotal());}
			if(conDefault || (!conDefault && facturadescuadradaLocal.gettotal_formas_pago()!=null && !facturadescuadradaLocal.gettotal_formas_pago().equals(0.0))) {facturadescuadradaBean.settotal_formas_pago(facturadescuadradaLocal.gettotal_formas_pago());}
			if(conDefault || (!conDefault && facturadescuadradaLocal.getdescuento_real()!=null && !facturadescuadradaLocal.getdescuento_real().equals(0.0))) {facturadescuadradaBean.setdescuento_real(facturadescuadradaLocal.getdescuento_real());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFacturaDescuadradaGenerico(Long idFacturaDescuadradaSeleccionado,JComboBox jComboBoxFacturaDescuadrada,List<FacturaDescuadrada> facturadescuadradasLocal)throws Exception {
		try {
			FacturaDescuadrada  facturadescuadradaTemp=null;

			for(FacturaDescuadrada facturadescuadradaAux:facturadescuadradasLocal) {
				if(facturadescuadradaAux.getId()!=null && facturadescuadradaAux.getId().equals(idFacturaDescuadradaSeleccionado)) {
					facturadescuadradaTemp=facturadescuadradaAux;
					break;
				}
			}

			jComboBoxFacturaDescuadrada.setSelectedItem(facturadescuadradaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFacturaDescuadradaGenerico(JComboBox jComboBoxFacturaDescuadrada,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturaDescuadrada.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFacturaDescuadrada.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturaDescuadrada.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFacturaDescuadrada.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturadescuadrada=(FacturaDescuadrada) facturadescuadradaLogic.getFacturaDescuadradas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturadescuadrada =(FacturaDescuadrada) facturadescuadradas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!facturadescuadrada.getIsNew() && !facturadescuadrada.getIsChanged() && !facturadescuadrada.getIsDeleted()) {
				sDescripcion=facturadescuadrada.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=facturadescuadrada.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FacturaDescuadrada facturadescuadradaRow=new FacturaDescuadrada();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturadescuadradaRow=(FacturaDescuadrada) facturadescuadradaLogic.getFacturaDescuadradas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturadescuadradaRow=(FacturaDescuadrada) facturadescuadradas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFacturaDescuadrada(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFacturaDescuadrada.setVisible((this.isVisibilidadCeldaNuevoFacturaDescuadrada && this.isPermisoNuevoFacturaDescuadrada));			
			this.jButtonDuplicarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaDuplicarFacturaDescuadrada && this.isPermisoDuplicarFacturaDescuadrada));			
			this.jButtonCopiarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaCopiarFacturaDescuadrada && this.isPermisoCopiarFacturaDescuadrada));
			this.jButtonVerFormFacturaDescuadrada.setVisible((this.isVisibilidadCeldaVerFormFacturaDescuadrada && this.isPermisoVerFormFacturaDescuadrada));
			
			this.jButtonAbrirOrderByFacturaDescuadrada.setVisible((this.isVisibilidadCeldaOrdenFacturaDescuadrada && this.isPermisoOrdenFacturaDescuadrada));			
			
			this.jButtonNuevoRelacionesFacturaDescuadrada.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada && this.isPermisoNuevoFacturaDescuadrada));			
			this.jButtonNuevoGuardarCambiosFacturaDescuadrada.setVisible((this.isVisibilidadCeldaNuevoFacturaDescuadrada && this.isPermisoNuevoFacturaDescuadrada && this.isPermisoGuardarCambiosFacturaDescuadrada));
			
			if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonModificarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaModificarFacturaDescuadrada && this.isPermisoActualizarFacturaDescuadrada));	
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonActualizarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaActualizarFacturaDescuadrada && this.isPermisoActualizarFacturaDescuadrada));	
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonEliminarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaEliminarFacturaDescuadrada && this.isPermisoEliminarFacturaDescuadrada));
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonCancelarFacturaDescuadrada.setVisible(this.isVisibilidadCeldaCancelarFacturaDescuadrada);							
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonGuardarCambiosFacturaDescuadrada.setVisible((this.isVisibilidadCeldaGuardarFacturaDescuadrada && this.isPermisoGuardarCambiosFacturaDescuadrada));			
			
			}
						
			this.jButtonGuardarCambiosTablaFacturaDescuadrada.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada && this.isPermisoGuardarCambiosFacturaDescuadrada));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaNuevoFacturaDescuadrada && this.isPermisoNuevoFacturaDescuadrada));						
			this.jButtonDuplicarToolBarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaDuplicarFacturaDescuadrada && this.isPermisoDuplicarFacturaDescuadrada));						
			this.jButtonCopiarToolBarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaCopiarFacturaDescuadrada && this.isPermisoCopiarFacturaDescuadrada));			
			this.jButtonVerFormToolBarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaVerFormFacturaDescuadrada && this.isPermisoVerFormFacturaDescuadrada));			
			this.jButtonAbrirOrderByToolBarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaOrdenFacturaDescuadrada && this.isPermisoOrdenFacturaDescuadrada));
			this.jButtonNuevoRelacionesToolBarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada && this.isPermisoNuevoFacturaDescuadrada));			
			this.jButtonNuevoGuardarCambiosToolBarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaNuevoFacturaDescuadrada && this.isPermisoNuevoFacturaDescuadrada && this.isPermisoGuardarCambiosFacturaDescuadrada));			
			
			if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonModificarToolBarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaModificarFacturaDescuadrada && this.isPermisoActualizarFacturaDescuadrada));	
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonActualizarToolBarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaActualizarFacturaDescuadrada  && this.isPermisoActualizarFacturaDescuadrada));	
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonEliminarToolBarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaEliminarFacturaDescuadrada && this.isPermisoEliminarFacturaDescuadrada));
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonCancelarToolBarFacturaDescuadrada.setVisible(this.isVisibilidadCeldaCancelarFacturaDescuadrada);				
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonGuardarCambiosToolBarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaGuardarFacturaDescuadrada && this.isPermisoGuardarCambiosFacturaDescuadrada));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada && this.isPermisoGuardarCambiosFacturaDescuadrada));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFacturaDescuadrada.setVisible((this.isVisibilidadCeldaNuevoFacturaDescuadrada && this.isPermisoNuevoFacturaDescuadrada));			
			this.jMenuItemDuplicarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaDuplicarFacturaDescuadrada && this.isPermisoDuplicarFacturaDescuadrada));			
			this.jMenuItemCopiarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaCopiarFacturaDescuadrada && this.isPermisoCopiarFacturaDescuadrada));			
			this.jMenuItemVerFormFacturaDescuadrada.setVisible((this.isVisibilidadCeldaVerFormFacturaDescuadrada && this.isPermisoVerFormFacturaDescuadrada));			
			this.jMenuItemAbrirOrderByFacturaDescuadrada.setVisible((this.isVisibilidadCeldaOrdenFacturaDescuadrada && this.isPermisoOrdenFacturaDescuadrada));			
			//this.jMenuItemMostrarOcultarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaOrdenFacturaDescuadrada && this.isPermisoOrdenFacturaDescuadrada));
			this.jMenuItemDetalleAbrirOrderByFacturaDescuadrada.setVisible((this.isVisibilidadCeldaOrdenFacturaDescuadrada && this.isPermisoOrdenFacturaDescuadrada));			
			//this.jMenuItemDetalleMostrarOcultarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaOrdenFacturaDescuadrada && this.isPermisoOrdenFacturaDescuadrada));			
			this.jMenuItemNuevoRelacionesFacturaDescuadrada.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada && this.isPermisoNuevoFacturaDescuadrada));			
			this.jMenuItemNuevoGuardarCambiosFacturaDescuadrada.setVisible((this.isVisibilidadCeldaNuevoFacturaDescuadrada && this.isPermisoNuevoFacturaDescuadrada && this.isPermisoGuardarCambiosFacturaDescuadrada));									
			
			if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemModificarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaModificarFacturaDescuadrada && this.isPermisoActualizarFacturaDescuadrada));	
			this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemActualizarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaActualizarFacturaDescuadrada && this.isPermisoActualizarFacturaDescuadrada));	
			this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemEliminarFacturaDescuadrada.setVisible((this.isVisibilidadCeldaEliminarFacturaDescuadrada && this.isPermisoEliminarFacturaDescuadrada));
			this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemCancelarFacturaDescuadrada.setVisible(this.isVisibilidadCeldaCancelarFacturaDescuadrada);				
			}
			
			this.jMenuItemGuardarCambiosFacturaDescuadrada.setVisible((this.isVisibilidadCeldaGuardarFacturaDescuadrada && this.isPermisoGuardarCambiosFacturaDescuadrada));						
			this.jMenuItemGuardarCambiosTablaFacturaDescuadrada.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada && this.isPermisoGuardarCambiosFacturaDescuadrada));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFacturaDescuadrada=this.jButtonNuevoFacturaDescuadrada.isVisible();
			this.isVisibilidadCeldaDuplicarFacturaDescuadrada=this.jButtonDuplicarFacturaDescuadrada.isVisible();
			this.isVisibilidadCeldaCopiarFacturaDescuadrada=this.jButtonCopiarFacturaDescuadrada.isVisible();
			this.isVisibilidadCeldaVerFormFacturaDescuadrada=this.jButtonVerFormFacturaDescuadrada.isVisible();
			
			this.isVisibilidadCeldaOrdenFacturaDescuadrada=this.jButtonAbrirOrderByFacturaDescuadrada.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada=this.jButtonNuevoRelacionesFacturaDescuadrada.isVisible();
			this.isVisibilidadCeldaModificarFacturaDescuadrada=this.jButtonModificarFacturaDescuadrada.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
			this.isVisibilidadCeldaActualizarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonActualizarFacturaDescuadrada.isVisible();
			this.isVisibilidadCeldaEliminarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonEliminarFacturaDescuadrada.isVisible();
			this.isVisibilidadCeldaCancelarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonCancelarFacturaDescuadrada.isVisible();
			this.isVisibilidadCeldaGuardarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonGuardarCambiosFacturaDescuadrada.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada=this.jButtonGuardarCambiosTablaFacturaDescuadrada.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFacturaDescuadrada=this.jButtonNuevoToolBarFacturaDescuadrada.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada=this.jButtonNuevoRelacionesToolBarFacturaDescuadrada.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
			this.isVisibilidadCeldaModificarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonModificarToolBarFacturaDescuadrada.isVisible();
			this.isVisibilidadCeldaActualizarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonActualizarToolBarFacturaDescuadrada.isVisible();
			this.isVisibilidadCeldaEliminarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonEliminarToolBarFacturaDescuadrada.isVisible();
			this.isVisibilidadCeldaCancelarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonCancelarToolBarFacturaDescuadrada.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturaDescuadrada=this.jButtonGuardarCambiosToolBarFacturaDescuadrada.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada=this.jButtonGuardarCambiosTablaToolBarFacturaDescuadrada.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFacturaDescuadrada=this.jMenuItemNuevoFacturaDescuadrada.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada=this.jMenuItemNuevoRelacionesFacturaDescuadrada.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
			this.isVisibilidadCeldaModificarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemModificarFacturaDescuadrada.isVisible();
			this.isVisibilidadCeldaActualizarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemActualizarFacturaDescuadrada.isVisible();
			this.isVisibilidadCeldaEliminarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemEliminarFacturaDescuadrada.isVisible();
			this.isVisibilidadCeldaCancelarFacturaDescuadrada=this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemCancelarFacturaDescuadrada.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturaDescuadrada=this.jMenuItemGuardarCambiosFacturaDescuadrada.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada=this.jMenuItemGuardarCambiosTablaFacturaDescuadrada.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFacturaDescuadrada(Boolean esInicializar) {
		if(FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.facturadescuadradaSessionBean.getConGuardarRelaciones()) {
				//if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFacturaDescuadrada();
			}
			
			this.inicializarActualizarBindingBotonesManualFacturaDescuadrada(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFacturaDescuadrada() {
		this.jButtonNuevoFacturaDescuadrada.setVisible(this.isPermisoNuevoFacturaDescuadrada);			
		this.jButtonDuplicarFacturaDescuadrada.setVisible(this.isPermisoDuplicarFacturaDescuadrada);			
		this.jButtonCopiarFacturaDescuadrada.setVisible(this.isPermisoCopiarFacturaDescuadrada);			
		this.jButtonVerFormFacturaDescuadrada.setVisible(this.isPermisoVerFormFacturaDescuadrada);			
		
		this.jButtonAbrirOrderByFacturaDescuadrada.setVisible(this.isPermisoOrdenFacturaDescuadrada);					
		
		this.jButtonNuevoRelacionesFacturaDescuadrada.setVisible(this.isPermisoNuevoFacturaDescuadrada);			
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonModificarFacturaDescuadrada.setVisible(this.isPermisoActualizarFacturaDescuadrada);	
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonActualizarFacturaDescuadrada.setVisible(this.isPermisoActualizarFacturaDescuadrada);	
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonEliminarFacturaDescuadrada.setVisible(this.isPermisoEliminarFacturaDescuadrada);
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonCancelarFacturaDescuadrada.setVisible(this.isVisibilidadCeldaCancelarFacturaDescuadrada);						
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonGuardarCambiosFacturaDescuadrada.setVisible(this.isPermisoGuardarCambiosFacturaDescuadrada);							
		}
		
		this.jButtonGuardarCambiosTablaFacturaDescuadrada.setVisible(this.isPermisoActualizarFacturaDescuadrada);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturaDescuadrada() {
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonModificarFacturaDescuadrada.setVisible(this.isPermisoActualizarFacturaDescuadrada);	
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonActualizarFacturaDescuadrada.setVisible(this.isPermisoActualizarFacturaDescuadrada);	
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonEliminarFacturaDescuadrada.setVisible(this.isPermisoEliminarFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonCancelarFacturaDescuadrada.setVisible(this.isVisibilidadCeldaCancelarFacturaDescuadrada);							
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonGuardarCambiosFacturaDescuadrada.setVisible((this.isVisibilidadCeldaGuardarFacturaDescuadrada && this.isPermisoGuardarCambiosFacturaDescuadrada));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFacturaDescuadrada() {
		if(FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFacturaDescuadrada();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFacturaDescuadrada() {
	}
	
	public void jTableDatosFacturaDescuadradaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFacturaDescuadrada(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFacturaDescuadradaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.getfacturadescuadrada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadescuadrada==null) {
						this.facturadescuadrada = new FacturaDescuadrada();
					}

					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
				}

				if(this.facturadescuadrada.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.facturadescuadrada.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDescuadrada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFacturaDescuadradaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFacturaDescuadrada(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturaDescuadrada.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturaDescuadrada.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.getfacturadescuadrada(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.facturadescuadradaLogic.getConnexion());

				if(this.facturadescuadrada.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.facturadescuadrada.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturaDescuadrada=(TitledBorder)this.jScrollPanelDatosFacturaDescuadrada.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFacturaDescuadrada.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFacturaDescuadradaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.getfacturadescuadrada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadescuadrada==null) {
						this.facturadescuadrada = new FacturaDescuadrada();
					}

					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
				}

				if(this.facturadescuadrada.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.facturadescuadrada.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDescuadrada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioFacturaDescuadradaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.getfacturadescuadrada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadescuadrada==null) {
						this.facturadescuadrada = new FacturaDescuadrada();
					}

					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
				}

				if(this.facturadescuadrada.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.facturadescuadrada.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDescuadrada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finFacturaDescuadradaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.getfacturadescuadrada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadescuadrada==null) {
						this.facturadescuadrada = new FacturaDescuadrada();
					}

					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
				}

				if(this.facturadescuadrada.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.facturadescuadrada.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDescuadrada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialFacturaDescuadradaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.getfacturadescuadrada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadescuadrada==null) {
						this.facturadescuadrada = new FacturaDescuadrada();
					}

					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
				}

				if(this.facturadescuadrada.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.facturadescuadrada.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDescuadrada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaFacturaDescuadradaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.getfacturadescuadrada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadescuadrada==null) {
						this.facturadescuadrada = new FacturaDescuadrada();
					}

					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
				}

				if(this.facturadescuadrada.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.facturadescuadrada.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDescuadrada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsubtotalFacturaDescuadradaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.getfacturadescuadrada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadescuadrada==null) {
						this.facturadescuadrada = new FacturaDescuadrada();
					}

					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
				}

				if(this.facturadescuadrada.getsubtotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where subtotal = "+this.facturadescuadrada.getsubtotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDescuadrada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaFacturaDescuadradaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.getfacturadescuadrada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadescuadrada==null) {
						this.facturadescuadrada = new FacturaDescuadrada();
					}

					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
				}

				if(this.facturadescuadrada.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.facturadescuadrada.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDescuadrada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuentoFacturaDescuadradaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.getfacturadescuadrada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadescuadrada==null) {
						this.facturadescuadrada = new FacturaDescuadrada();
					}

					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
				}

				if(this.facturadescuadrada.getdescuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento = "+this.facturadescuadrada.getdescuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDescuadrada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfinanciamientoFacturaDescuadradaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.getfacturadescuadrada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadescuadrada==null) {
						this.facturadescuadrada = new FacturaDescuadrada();
					}

					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
				}

				if(this.facturadescuadrada.getfinanciamiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where financiamiento = "+this.facturadescuadrada.getfinanciamiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDescuadrada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfleteFacturaDescuadradaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.getfacturadescuadrada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadescuadrada==null) {
						this.facturadescuadrada = new FacturaDescuadrada();
					}

					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
				}

				if(this.facturadescuadrada.getflete()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where flete = "+this.facturadescuadrada.getflete().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDescuadrada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoniceFacturaDescuadradaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.getfacturadescuadrada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadescuadrada==null) {
						this.facturadescuadrada = new FacturaDescuadrada();
					}

					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
				}

				if(this.facturadescuadrada.getice()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ice = "+this.facturadescuadrada.getice().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDescuadrada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalFacturaDescuadradaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.getfacturadescuadrada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadescuadrada==null) {
						this.facturadescuadrada = new FacturaDescuadrada();
					}

					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
				}

				if(this.facturadescuadrada.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.facturadescuadrada.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDescuadrada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_formas_pagoFacturaDescuadradaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.getfacturadescuadrada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadescuadrada==null) {
						this.facturadescuadrada = new FacturaDescuadrada();
					}

					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
				}

				if(this.facturadescuadrada.gettotal_formas_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_formas_pago = "+this.facturadescuadrada.gettotal_formas_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDescuadrada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuento_realFacturaDescuadradaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.getfacturadescuadrada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadescuadrada==null) {
						this.facturadescuadrada = new FacturaDescuadrada();
					}

					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);
				}

				if(this.facturadescuadrada.getdescuento_real()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento_real = "+this.facturadescuadrada.getdescuento_real().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDescuadrada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaFacturaDescuadradaFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturaDescuadrada(false,false);

			this.getFacturaDescuadradasBusquedaFacturaDescuadrada();

			this.inicializarActualizarBindingFacturaDescuadrada(false);

			//if(FacturaDescuadradaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturaDescuadrada(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaFacturaDescuadradaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturaDescuadrada(false,false);

			this.getFacturaDescuadradasFK_IdEmpresa();

			this.inicializarActualizarBindingFacturaDescuadrada(false);

			//if(FacturaDescuadradaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturaDescuadrada(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadescuadradaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFacturaDescuadrada() {
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.setVisible(false);	    			
			this.jInternalFrameDetalleFormFacturaDescuadrada.dispose();
			this.jInternalFrameDetalleFormFacturaDescuadrada=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFacturaDescuadrada!=null) {
			this.jInternalFrameReporteDinamicoFacturaDescuadrada.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFacturaDescuadrada.dispose();
			this.jInternalFrameReporteDinamicoFacturaDescuadrada=null;
		}
		
		if(this.jInternalFrameImportacionFacturaDescuadrada!=null) {
			this.jInternalFrameImportacionFacturaDescuadrada.setVisible(false);	    			
			this.jInternalFrameImportacionFacturaDescuadrada.dispose();
			this.jInternalFrameImportacionFacturaDescuadrada=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFacturaDescuadrada();
			
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
			
			
			if(sTipo.equals("NuevoFacturaDescuadrada")) {
				jButtonNuevoFacturaDescuadradaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFacturaDescuadrada")) {
				jButtonDuplicarFacturaDescuadradaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFacturaDescuadrada")) {
				jButtonCopiarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("VerFormFacturaDescuadrada")) {
				jButtonVerFormFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFacturaDescuadrada")) {
				jButtonNuevoFacturaDescuadradaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFacturaDescuadrada")) {
				jButtonDuplicarFacturaDescuadradaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFacturaDescuadrada")) {
				jButtonNuevoFacturaDescuadradaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFacturaDescuadrada")) {
				jButtonDuplicarFacturaDescuadradaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFacturaDescuadrada")) {
				jButtonNuevoFacturaDescuadradaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFacturaDescuadrada")) {
				jButtonNuevoFacturaDescuadradaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFacturaDescuadrada")) {
				jButtonNuevoFacturaDescuadradaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFacturaDescuadrada")) {
				jButtonModificarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFacturaDescuadrada")) {
				jButtonModificarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFacturaDescuadrada")) {
				jButtonModificarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFacturaDescuadrada")) {
				jButtonActualizarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFacturaDescuadrada")) {
				jButtonActualizarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFacturaDescuadrada")) {
				jButtonActualizarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("EliminarFacturaDescuadrada")) {
				jButtonEliminarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFacturaDescuadrada")) {
				jButtonEliminarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFacturaDescuadrada")) {
				jButtonEliminarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("CancelarFacturaDescuadrada")) {
				jButtonCancelarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFacturaDescuadrada")) {
				jButtonCancelarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFacturaDescuadrada")) {
				jButtonCancelarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("CerrarFacturaDescuadrada")) {
				jButtonCerrarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFacturaDescuadrada")) {
				jButtonCerrarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFacturaDescuadrada")) {
				jButtonCerrarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFacturaDescuadrada")) {
				jButtonMostrarOcultarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFacturaDescuadrada")) {
				jButtonCancelarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFacturaDescuadrada")) {
				jButtonGuardarCambiosFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFacturaDescuadrada")) {
				jButtonGuardarCambiosFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFacturaDescuadrada")) {
				jButtonCopiarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFacturaDescuadrada")) {
				jButtonVerFormFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFacturaDescuadrada")) {
				jButtonGuardarCambiosFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFacturaDescuadrada")) {
				jButtonCopiarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFacturaDescuadrada")) {
				jButtonVerFormFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFacturaDescuadrada")) {
				jButtonGuardarCambiosFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFacturaDescuadrada")) {
				jButtonGuardarCambiosFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFacturaDescuadrada")) {
				jButtonGuardarCambiosFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFacturaDescuadrada")) {
				jButtonRecargarInformacionFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFacturaDescuadrada")) {
				jButtonRecargarInformacionFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFacturaDescuadrada")) {
				jButtonRecargarInformacionFacturaDescuadradaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFacturaDescuadrada")) {
				jButtonAnterioresFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFacturaDescuadrada")) {
				jButtonAnterioresFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFacturaDescuadrada")) {
				jButtonAnterioresFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFacturaDescuadrada")) {
				jButtonSiguientesFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFacturaDescuadrada")) {
				jButtonSiguientesFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFacturaDescuadrada")) {
				jButtonSiguientesFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFacturaDescuadrada") || sTipo.equals("MenuItemDetalleAbrirOrderByFacturaDescuadrada")) {
				jButtonAbrirOrderByFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFacturaDescuadrada") || sTipo.equals("MenuItemDetalleMostrarOcultarFacturaDescuadrada")) {
				jButtonMostrarOcultarFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFacturaDescuadrada")) {
				jButtonNuevoGuardarCambiosFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFacturaDescuadrada")) {
				jButtonNuevoGuardarCambiosFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFacturaDescuadrada")) {
				jButtonNuevoGuardarCambiosFacturaDescuadradaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFacturaDescuadrada")) {
				jButtonCerrarReporteDinamicoFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFacturaDescuadrada")) {
				jButtonGenerarReporteDinamicoFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFacturaDescuadrada")) {
				
				jButtonGenerarExcelReporteDinamicoFacturaDescuadradaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFacturaDescuadrada")) {
				jButtonCerrarImportacionFacturaDescuadradaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFacturaDescuadrada")) {
				
				jButtonGenerarImportacionFacturaDescuadradaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFacturaDescuadrada")) {
				
				jButtonAbrirImportacionFacturaDescuadradaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFacturaDescuadrada")) {
				jComboBoxTiposAccionesFacturaDescuadradaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFacturaDescuadrada")) {
				jComboBoxTiposRelacionesFacturaDescuadradaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFacturaDescuadrada")) {
				jComboBoxTiposAccionesFacturaDescuadradaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFacturaDescuadrada")) {
				
				jComboBoxTiposSeleccionarFacturaDescuadradaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFacturaDescuadrada")) {
				jTextFieldValorCampoGeneralFacturaDescuadradaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFacturaDescuadrada")) {
				jButtonAbrirOrderByFacturaDescuadradaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFacturaDescuadrada")) {
				jButtonAbrirOrderByFacturaDescuadradaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFacturaDescuadrada")) {
				jButtonCerrarOrderByFacturaDescuadradaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturaDescuadradaBusqueda")) {
				this.jButtonidFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFacturaDescuadradaUpdate")) {
				this.jButtonid_empresaFacturaDescuadradaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFacturaDescuadradaBusqueda")) {
				this.jButtonid_empresaFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioFacturaDescuadradaBusqueda")) {
				this.jButtonfecha_inicioFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finFacturaDescuadradaBusqueda")) {
				this.jButtonfecha_finFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialFacturaDescuadradaBusqueda")) {
				this.jButtonsecuencialFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaFacturaDescuadradaBusqueda")) {
				this.jButtonfechaFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("subtotalFacturaDescuadradaBusqueda")) {
				this.jButtonsubtotalFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaFacturaDescuadradaBusqueda")) {
				this.jButtonivaFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoFacturaDescuadradaBusqueda")) {
				this.jButtondescuentoFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("financiamientoFacturaDescuadradaBusqueda")) {
				this.jButtonfinanciamientoFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteFacturaDescuadradaBusqueda")) {
				this.jButtonfleteFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceFacturaDescuadradaBusqueda")) {
				this.jButtoniceFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalFacturaDescuadradaBusqueda")) {
				this.jButtontotalFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_formas_pagoFacturaDescuadradaBusqueda")) {
				this.jButtontotal_formas_pagoFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento_realFacturaDescuadradaBusqueda")) {
				this.jButtondescuento_realFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaFacturaDescuadradaFacturaDescuadrada")) {
				this.jButtonBusquedaFacturaDescuadradaFacturaDescuadradaActionPerformed(evt);
			}
			
			;
			
			
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFacturaDescuadrada();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaDescuadradaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadescuadrada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadescuadrada);
				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
				
				


				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDescuadrada.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDescuadrada.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FacturaDescuadrada facturadescuadradaLocal=null;
			
			if(!this.getEsControlTabla()) {
				facturadescuadradaLocal=this.facturadescuadrada;
			} else {
				facturadescuadradaLocal=this.facturadescuadradaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadescuadrada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadescuadrada);
				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
							
				
				


				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDescuadrada.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDescuadrada.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaDescuadradaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaAnterior =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturadescuadradaAnterior =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
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
			
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
			
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
			
			


			
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaDescuadradaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadescuadrada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadescuadrada);
				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
								
						
				


				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDescuadrada.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDescuadrada.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadescuadrada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadescuadrada);
				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
								
				
				


				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDescuadrada.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDescuadrada.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaDescuadradaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaAnterior =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturadescuadradaAnterior =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadescuadrada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadescuadrada);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaDescuadradaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaAnterior =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturadescuadradaAnterior =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaDescuadradaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadescuadrada);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturadescuadrada);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadescuadrada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadescuadrada);
				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
							
				
				


				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDescuadrada.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDescuadrada.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaDescuadradaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadescuadradaAnterior =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturadescuadradaAnterior =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
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
			
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
			
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
			
			


			
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaDescuadradaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadescuadrada);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturadescuadrada);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadescuadrada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadescuadrada);
				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
								
				
				


				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDescuadrada.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDescuadrada.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaDescuadradaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaAnterior =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturadescuadradaAnterior =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaDescuadradaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadescuadrada);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturadescuadrada);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaDescuadradaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadescuadrada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadescuadrada);
				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFacturaDescuadrada")) {
					jCheckBoxSeleccionarTodosFacturaDescuadradaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFacturaDescuadrada")) {
					jCheckBoxSeleccionadosFacturaDescuadradaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFacturaDescuadrada")) {
					
				}
				
				


				
				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDescuadrada.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDescuadrada.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadescuadrada);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.facturadescuadrada);
				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
												
				
				


				
				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDescuadrada.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDescuadrada.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaDescuadradaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadescuadradaAnterior =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturadescuadradaAnterior =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaDescuadradaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadescuadrada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadescuadrada);
				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
				
				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
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
			
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
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
			
			


			
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaDescuadradaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadescuadrada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadescuadrada);
				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDescuadrada.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDescuadrada.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadescuadrada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadescuadrada);
				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
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
				
				


				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDescuadrada.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDescuadrada.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaDescuadradaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadescuadradaAnterior =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturadescuadradaAnterior =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFacturaDescuadrada")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFacturaDescuadradaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFacturaDescuadrada.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.facturadescuadrada =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.facturadescuadrada);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFacturaDescuadrada")) {
				
				}
				
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFacturaDescuadrada")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFacturaDescuadrada.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFacturaDescuadrada")) {
			
			}
			
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFacturaDescuadrada();
			
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
			
			if(sTipo.equals("NuevoFacturaDescuadrada")) {
				jButtonNuevoFacturaDescuadradaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFacturaDescuadrada")) {
				jButtonDuplicarFacturaDescuadradaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFacturaDescuadrada")) {
				jButtonCopiarFacturaDescuadradaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFacturaDescuadrada")) {
				jButtonVerFormFacturaDescuadradaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFacturaDescuadrada")) {
				jButtonNuevoFacturaDescuadradaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFacturaDescuadrada")) {
				jButtonModificarFacturaDescuadradaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFacturaDescuadrada")) {
				jButtonActualizarFacturaDescuadradaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFacturaDescuadrada")) {
				jButtonEliminarFacturaDescuadradaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFacturaDescuadrada")) {
				jButtonGuardarCambiosFacturaDescuadradaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFacturaDescuadrada")) {
				jButtonCancelarFacturaDescuadradaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFacturaDescuadrada")) {
				jButtonCerrarFacturaDescuadradaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFacturaDescuadrada")) {
				jButtonGuardarCambiosFacturaDescuadradaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFacturaDescuadrada")) {
				jButtonNuevoGuardarCambiosFacturaDescuadradaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFacturaDescuadrada")) {
				jButtonAbrirOrderByFacturaDescuadradaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFacturaDescuadrada")) {
				jButtonRecargarInformacionFacturaDescuadradaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFacturaDescuadrada")) {
				jButtonAnterioresFacturaDescuadradaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFacturaDescuadrada")) {
				jButtonSiguientesFacturaDescuadradaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturaDescuadradaBusqueda")) {
				this.jButtonidFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFacturaDescuadradaUpdate")) {
				this.jButtonid_empresaFacturaDescuadradaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFacturaDescuadradaBusqueda")) {
				this.jButtonid_empresaFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioFacturaDescuadradaBusqueda")) {
				this.jButtonfecha_inicioFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finFacturaDescuadradaBusqueda")) {
				this.jButtonfecha_finFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialFacturaDescuadradaBusqueda")) {
				this.jButtonsecuencialFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaFacturaDescuadradaBusqueda")) {
				this.jButtonfechaFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("subtotalFacturaDescuadradaBusqueda")) {
				this.jButtonsubtotalFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaFacturaDescuadradaBusqueda")) {
				this.jButtonivaFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoFacturaDescuadradaBusqueda")) {
				this.jButtondescuentoFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("financiamientoFacturaDescuadradaBusqueda")) {
				this.jButtonfinanciamientoFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteFacturaDescuadradaBusqueda")) {
				this.jButtonfleteFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceFacturaDescuadradaBusqueda")) {
				this.jButtoniceFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalFacturaDescuadradaBusqueda")) {
				this.jButtontotalFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_formas_pagoFacturaDescuadradaBusqueda")) {
				this.jButtontotal_formas_pagoFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento_realFacturaDescuadradaBusqueda")) {
				this.jButtondescuento_realFacturaDescuadradaBusquedaActionPerformed(evt);
			}
			
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFacturaDescuadrada();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFacturaDescuadrada")) {
				closingInternalFrameFacturaDescuadrada();
				
			} else if(sTipo.equals("jButtonCancelarFacturaDescuadrada")) {
				JInternalFrameBase jInternalFrameDetalleFormFacturaDescuadrada = (JInternalFrameBase)evt.getSource();
	            	
	            FacturaDescuadradaBeanSwingJInternalFrame jInternalFrameParent=(FacturaDescuadradaBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturaDescuadrada.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFacturaDescuadradaActionPerformed(null);
			}
			
			FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturadescuadrada,new Object(),this.facturadescuadradaParameterGeneral,this.facturadescuadradaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFacturaDescuadrada(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFacturaDescuadrada(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFacturaDescuadrada(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.facturadescuadrada)) {
			if(!esControlTabla) {
				if(FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);			
				}
				
				if(this.facturadescuadradaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFacturaDescuadrada(this.facturadescuadrada,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFacturaDescuadrada(this.facturadescuadradaReturnGeneral,this.facturadescuadradaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.facturadescuadradaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFacturaDescuadrada(classes,this.facturadescuadradaReturnGeneral,this.facturadescuadradaBean,false);
					}
						
					if(this.facturadescuadradaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFacturaDescuadrada(this.facturadescuadradaReturnGeneral.getFacturaDescuadrada());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFacturaDescuadrada(this.facturadescuadradaReturnGeneral.getFacturaDescuadrada());	
					}
						
					if(this.facturadescuadradaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFacturaDescuadrada(this.facturadescuadradaReturnGeneral.getFacturaDescuadrada(),classes);//this.facturadescuadradaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFacturaDescuadrada(this.facturadescuadrada,classes);//this.facturadescuadradaBean);									
				}
			
				if(FacturaDescuadradaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFacturaDescuadrada(this.facturadescuadrada,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDescuadrada(this.facturadescuadrada);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.facturadescuadradaAnterior!=null) {
						this.facturadescuadrada=this.facturadescuadradaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.facturadescuadradaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.facturadescuadradaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.facturadescuadradaReturnGeneral.getFacturaDescuadrada(),facturadescuadradaLogic.getFacturaDescuadradas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.facturadescuadradaReturnGeneral.getFacturaDescuadrada(),this.facturadescuadradas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFacturaDescuadrada.repaint();
				
				//((AbstractTableModel) this.jTableDatosFacturaDescuadrada.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFacturaDescuadrada();
			}
		}
	}
	
	public void actualizarVisualTableDatosFacturaDescuadrada() throws Exception {
		
		FacturaDescuadradaModel facturadescuadradaModel=(FacturaDescuadradaModel)this.jTableDatosFacturaDescuadrada.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturadescuadradaModel.facturadescuadradas=this.facturadescuadradaLogic.getFacturaDescuadradas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			facturadescuadradaModel.facturadescuadradas=this.facturadescuadradas;
		}
		
		
		((FacturaDescuadradaModel) this.jTableDatosFacturaDescuadrada.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFacturaDescuadrada() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getfacturadescuadradaAnterior(),this.facturadescuadradaLogic.getFacturaDescuadradas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getfacturadescuadradaAnterior(),this.facturadescuadradas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFacturaDescuadrada();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFacturaDescuadrada(FacturaDescuadrada facturadescuadrada,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
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
										
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturadescuadrada,new Object(),generalEntityParameterGeneral,this.facturadescuadradaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.facturadescuadradaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FacturaDescuadradaConstantesFunciones.getClassesRelationshipsOfFacturaDescuadrada(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FacturaDescuadradaConstantesFunciones.getClassesRelationshipsFromStringsOfFacturaDescuadrada(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFacturaDescuadrada(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FacturaDescuadradaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturadescuadrada,new Object(),generalEntityParameterGeneral,this.facturadescuadradaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFacturaDescuadrada(FacturaDescuadradaBean facturadescuadradaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFacturaDescuadrada(ArrayList<Classe> classes,FacturaDescuadradaReturnGeneral facturadescuadradaReturnGeneral,FacturaDescuadradaBean facturadescuadradaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFacturaDescuadrada(FacturaDescuadrada facturadescuadrada,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.facturadescuadrada)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFacturaDescuadrada = new FacturaDescuadradaDetalleFormJInternalFrame(jDesktopPane,this.facturadescuadradaSessionBean.getConGuardarRelaciones(),this.facturadescuadradaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.setVisible(false);
		this.jInternalFrameDetalleFormFacturaDescuadrada.setSelected(false);						
		
		this.jInternalFrameDetalleFormFacturaDescuadrada.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFacturaDescuadrada.facturadescuadradaLogic=this.facturadescuadradaLogic;
		
		this.cargarCombosFrameForeignKeyFacturaDescuadrada("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturaDescuadrada();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturaDescuadrada();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFacturaDescuadrada("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFacturaDescuadrada();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFacturaDescuadrada.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturaDescuadrada"));
		
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonModificarFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"ModificarFacturaDescuadrada"));

		
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonModificarToolBarFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturaDescuadrada"));
					
		this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemModificarFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturaDescuadrada"));		
		
		
		
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonActualizarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"ActualizarFacturaDescuadrada"));
		
		
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonActualizarToolBarFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturaDescuadrada"));
						
		this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemActualizarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturaDescuadrada"));		
		
		
		
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonEliminarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"EliminarFacturaDescuadrada"));
		
		
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonEliminarToolBarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturaDescuadrada"));
								
		this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemEliminarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturaDescuadrada"));		
		
		
		
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonCancelarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"CancelarFacturaDescuadrada"));
		
		
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonCancelarToolBarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturaDescuadrada"));
					
		this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemCancelarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturaDescuadrada"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemDetalleCerrarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturaDescuadrada"));		
		
		
		
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonGuardarCambiosToolBarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturaDescuadrada"));
		
		
		
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonGuardarCambiosToolBarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturaDescuadrada"));
		
		
		
		this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxTiposAccionesFormularioFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturaDescuadrada"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonidFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"idFacturaDescuadradaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonid_empresaFacturaDescuadradaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturaDescuadradaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonid_empresaFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonfecha_inicioFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonfecha_finFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonsecuencialFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"secuencialFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonfechaFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"fechaFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonsubtotalFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"subtotalFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonivaFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"ivaFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtondescuentoFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonfinanciamientoFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonfleteFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"fleteFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtoniceFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"iceFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtontotalFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"totalFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtontotal_formas_pagoFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"total_formas_pagoFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtondescuento_realFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"descuento_realFacturaDescuadradaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTabbedPaneRelacionesFacturaDescuadrada.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturaDescuadrada"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFacturaDescuadrada"));
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturaDescuadrada"));
		}
		
		this.jTableDatosFacturaDescuadrada.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFacturaDescuadrada"));
		
		this.jTableDatosFacturaDescuadrada.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFacturaDescuadrada"));
		
		this.jButtonNuevoFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"NuevoFacturaDescuadrada"));
		
		this.jButtonDuplicarFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"DuplicarFacturaDescuadrada"));
		
		this.jButtonCopiarFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"CopiarFacturaDescuadrada"));
		
		this.jButtonVerFormFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"VerFormFacturaDescuadrada"));
		
		
		this.jButtonNuevoToolBarFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"NuevoToolBarFacturaDescuadrada"));
			
		this.jButtonDuplicarToolBarFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFacturaDescuadrada"));
			
		this.jMenuItemNuevoFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFacturaDescuadrada"));
			
		this.jMenuItemDuplicarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFacturaDescuadrada"));		
		
		
		this.jButtonNuevoRelacionesFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFacturaDescuadrada"));
		
		
		this.jButtonNuevoRelacionesToolBarFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFacturaDescuadrada"));
			
		this.jMenuItemNuevoRelacionesFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFacturaDescuadrada"));		
		
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonModificarFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"ModificarFacturaDescuadrada"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonModificarToolBarFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturaDescuadrada"));
			
			this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemModificarFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturaDescuadrada"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonActualizarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"ActualizarFacturaDescuadrada"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonActualizarToolBarFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturaDescuadrada"));
				
			this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemActualizarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturaDescuadrada"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonEliminarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"EliminarFacturaDescuadrada"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonEliminarToolBarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturaDescuadrada"));
						
			this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemEliminarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturaDescuadrada"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonCancelarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"CancelarFacturaDescuadrada"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonCancelarToolBarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturaDescuadrada"));
			
			this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemCancelarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturaDescuadrada"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFacturaDescuadrada"));		
		
		
		this.jButtonCerrarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"CerrarFacturaDescuadrada"));
		
		
		this.jButtonCerrarToolBarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"CerrarToolBarFacturaDescuadrada"));
			
		this.jMenuItemCerrarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFacturaDescuadrada"));
			
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.jMenuItemDetalleCerrarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturaDescuadrada"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonGuardarCambiosFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"GuardarCambiosFacturaDescuadrada"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonGuardarCambiosToolBarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturaDescuadrada"));
		}
		
		this.jButtonCopiarToolBarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"CopiarToolBarFacturaDescuadrada"));
			
		this.jButtonVerFormToolBarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"VerFormToolBarFacturaDescuadrada"));
		
		this.jMenuItemGuardarCambiosFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFacturaDescuadrada"));
			
		this.jMenuItemCopiarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFacturaDescuadrada"));		
		
		this.jMenuItemVerFormFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFacturaDescuadrada"));		
		
		
		this.jButtonGuardarCambiosTablaFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturaDescuadrada"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFacturaDescuadrada"));
			
		this.jMenuItemGuardarCambiosTablaFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturaDescuadrada"));		
		
		
		
		this.jButtonRecargarInformacionFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"RecargarInformacionFacturaDescuadrada"));
					
		this.jButtonRecargarInformacionToolBarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFacturaDescuadrada"));
		
		this.jMenuItemRecargarInformacionFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFacturaDescuadrada"));		
		
		
		
		this.jButtonAnterioresFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"AnterioresFacturaDescuadrada"));
		
		
		this.jButtonAnterioresToolBarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFacturaDescuadrada"));
		
		this.jMenuItemAnterioresFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFacturaDescuadrada"));		
		
		
		this.jButtonSiguientesFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"SiguientesFacturaDescuadrada"));
		
		
		this.jButtonSiguientesToolBarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFacturaDescuadrada"));
			
		this.jMenuItemSiguientesFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFacturaDescuadrada"));
			
		this.jMenuItemAbrirOrderByFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFacturaDescuadrada"));
			
		this.jMenuItemMostrarOcultarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFacturaDescuadrada"));
			
		this.jMenuItemDetalleAbrirOrderByFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFacturaDescuadrada"));
			
		this.jMenuItemDetalleMostarOcultarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFacturaDescuadrada"));		
		
		
		this.jButtonNuevoGuardarCambiosFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFacturaDescuadrada"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFacturaDescuadrada"));
			
		this.jMenuItemNuevoGuardarCambiosFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFacturaDescuadrada"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFacturaDescuadrada.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFacturaDescuadrada"));

		this.jCheckBoxSeleccionadosFacturaDescuadrada.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFacturaDescuadrada"));
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxTiposAccionesFormularioFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturaDescuadrada"));
		}
		
		
		this.jComboBoxTiposRelacionesFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"TiposRelacionesFacturaDescuadrada"));
			
		this.jComboBoxTiposAccionesFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"TiposAccionesFacturaDescuadrada"));
					
		this.jComboBoxTiposSeleccionarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFacturaDescuadrada"));
			
		this.jTextFieldValorCampoGeneralFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFacturaDescuadrada"));		
		
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonidFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"idFacturaDescuadradaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonid_empresaFacturaDescuadradaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturaDescuadradaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonid_empresaFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonfecha_inicioFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonfecha_finFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonsecuencialFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"secuencialFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonfechaFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"fechaFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonsubtotalFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"subtotalFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonivaFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"ivaFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtondescuentoFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonfinanciamientoFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonfleteFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"fleteFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtoniceFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"iceFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtontotalFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"totalFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtontotal_formas_pagoFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"total_formas_pagoFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtondescuento_realFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"descuento_realFacturaDescuadradaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaFacturaDescuadradaFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"BusquedaFacturaDescuadradaFacturaDescuadrada"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFacturaDescuadrada!=null) {
				this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturaDescuadrada"));
				this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturaDescuadrada"));
				this.jInternalFrameReporteDinamicoFacturaDescuadrada.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturaDescuadrada"));
			}
			
			//this.jButtonCerrarReporteDinamicoFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturaDescuadrada"));				
			//this.jButtonGenerarReporteDinamicoFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturaDescuadrada"));
			//this.jButtonGenerarExcelReporteDinamicoFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturaDescuadrada"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFacturaDescuadrada!=null) {
				this.jInternalFrameImportacionFacturaDescuadrada.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturaDescuadrada"));
				this.jInternalFrameImportacionFacturaDescuadrada.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturaDescuadrada"));
				this.jInternalFrameImportacionFacturaDescuadrada.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturaDescuadrada"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"AbrirOrderByFacturaDescuadrada"));
			
			this.jButtonAbrirOrderByToolBarFacturaDescuadrada.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFacturaDescuadrada"));			
			
			if(this.jInternalFrameOrderByFacturaDescuadrada!=null) {
				this.jInternalFrameOrderByFacturaDescuadrada.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturaDescuadrada"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDescuadrada.jTabbedPaneRelacionesFacturaDescuadrada.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturaDescuadrada"));
		
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
            		closingInternalFrameFacturaDescuadrada();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFacturaDescuadrada.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFacturaDescuadrada = (JInternalFrameBase)event.getSource();
	            	
	            FacturaDescuadradaBeanSwingJInternalFrame jInternalFrameParent=(FacturaDescuadradaBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturaDescuadrada.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFacturaDescuadradaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFacturaDescuadrada.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFacturaDescuadradaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFacturaDescuadrada.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFacturaDescuadrada.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaDescuadradaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaDescuadradaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaDescuadradaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFacturaDescuadrada";
		inputMap = this.jButtonNuevoFacturaDescuadrada.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFacturaDescuadrada.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturaDescuadradaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaDescuadradaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaDescuadradaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaDescuadradaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFacturaDescuadrada";
		inputMap = this.jButtonNuevoRelacionesFacturaDescuadrada.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFacturaDescuadrada.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturaDescuadradaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFacturaDescuadrada";
		inputMap = this.jButtonModificarFacturaDescuadrada.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFacturaDescuadrada.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFacturaDescuadradaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFacturaDescuadrada";
		inputMap = this.jButtonActualizarFacturaDescuadrada.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFacturaDescuadrada.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFacturaDescuadradaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFacturaDescuadrada";
		inputMap = this.jButtonEliminarFacturaDescuadrada.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFacturaDescuadrada.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFacturaDescuadradaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFacturaDescuadrada";
		inputMap = this.jButtonCancelarFacturaDescuadrada.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFacturaDescuadrada.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFacturaDescuadradaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFacturaDescuadrada";
		inputMap = this.jButtonCerrarFacturaDescuadrada.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFacturaDescuadrada.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFacturaDescuadradaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonGuardarCambiosFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFacturaDescuadrada";
		inputMap = this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonGuardarCambiosFacturaDescuadrada.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonGuardarCambiosFacturaDescuadrada.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFacturaDescuadradaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFacturaDescuadrada.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFacturaDescuadradaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFacturaDescuadrada.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFacturaDescuadradaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFacturaDescuadrada.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFacturaDescuadradaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFacturaDescuadrada.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFacturaDescuadradaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonidFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"idFacturaDescuadradaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonid_empresaFacturaDescuadradaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturaDescuadradaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonid_empresaFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonfecha_inicioFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonfecha_finFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonsecuencialFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"secuencialFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonfechaFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"fechaFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonsubtotalFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"subtotalFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonivaFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"ivaFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtondescuentoFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonfinanciamientoFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtonfleteFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"fleteFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtoniceFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"iceFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtontotalFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"totalFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtontotal_formas_pagoFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"total_formas_pagoFacturaDescuadradaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDescuadrada.jButtondescuento_realFacturaDescuadradaBusqueda.addActionListener(new ButtonActionListener(this,"descuento_realFacturaDescuadradaBusqueda"));
		
		
		this.jButtonBusquedaFacturaDescuadradaFacturaDescuadrada.addActionListener(new ButtonActionListener(this,"BusquedaFacturaDescuadradaFacturaDescuadrada"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFacturaDescuadrada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFacturaDescuadradaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFacturaDescuadradaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFacturaDescuadrada.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFacturaDescuadrada(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FacturaDescuadrada facturadescuadradaAux:this.facturadescuadradaLogic.getFacturaDescuadradas()) {
					facturadescuadradaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturaDescuadrada facturadescuadradaAux:facturadescuadradas) {
					facturadescuadradaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFacturaDescuadradaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturaDescuadrada(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FacturaDescuadrada facturadescuadradaAux:this.facturadescuadradaLogic.getFacturaDescuadradas()) {
						facturadescuadradaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturaDescuadrada facturadescuadradaAux:facturadescuadradas) {
						facturadescuadradaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FacturaDescuadrada facturadescuadradaAux:this.facturadescuadradaLogic.getFacturaDescuadradas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturaDescuadrada facturadescuadradaAux:facturadescuadradas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFacturaDescuadrada(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturaDescuadrada.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturaDescuadrada.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturaDescuadrada,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFacturaDescuadradaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturaDescuadrada(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFacturaDescuadrada.getSelectedRows();
			
			FacturaDescuadrada facturadescuadradaLocal=new FacturaDescuadrada();
			
			//this.seleccionarTodosFacturaDescuadrada(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturadescuadradaLocal =(FacturaDescuadrada) this.facturadescuadradaLogic.getFacturaDescuadradas().toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					facturadescuadradaLocal =(FacturaDescuadrada) this.facturadescuadradas.toArray()[this.jTableDatosFacturaDescuadrada.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				facturadescuadradaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FacturaDescuadrada facturadescuadradaAux:this.facturadescuadradaLogic.getFacturaDescuadradas()) {
						facturadescuadradaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturaDescuadrada facturadescuadradaAux:facturadescuadradas) {
						facturadescuadradaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFacturaDescuadrada(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturaDescuadrada.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturaDescuadrada.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturaDescuadrada,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFacturaDescuadradaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFacturaDescuadradaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFacturaDescuadradaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFacturaDescuadrada(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFacturaDescuadrada.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FacturaDescuadrada facturadescuadradaAux:this.facturadescuadradaLogic.getFacturaDescuadradas()) {
				
						if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							facturadescuadradaAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							facturadescuadradaAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							facturadescuadradaAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							facturadescuadradaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							facturadescuadradaAux.setsubtotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							facturadescuadradaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							facturadescuadradaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_FINANCIAMIENTO)) {
							existe=true;
							facturadescuadradaAux.setfinanciamiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							facturadescuadradaAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_ICE)) {
							existe=true;
							facturadescuadradaAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							facturadescuadradaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_TOTALFORMASPAGO)) {
							existe=true;
							facturadescuadradaAux.settotal_formas_pago(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTOREAL)) {
							existe=true;
							facturadescuadradaAux.setdescuento_real(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturaDescuadrada facturadescuadradaAux:facturadescuadradas) {
					
						if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							facturadescuadradaAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							facturadescuadradaAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							facturadescuadradaAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							facturadescuadradaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							facturadescuadradaAux.setsubtotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							facturadescuadradaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							facturadescuadradaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_FINANCIAMIENTO)) {
							existe=true;
							facturadescuadradaAux.setfinanciamiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							facturadescuadradaAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_ICE)) {
							existe=true;
							facturadescuadradaAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							facturadescuadradaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_TOTALFORMASPAGO)) {
							existe=true;
							facturadescuadradaAux.settotal_formas_pago(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTOREAL)) {
							existe=true;
							facturadescuadradaAux.setdescuento_real(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFacturaDescuadrada(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFacturaDescuadradaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFacturaDescuadrada(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFacturaDescuadrada=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFacturaDescuadrada.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxTiposAccionesFormularioFacturaDescuadrada.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFacturaDescuadrada) {				
					conSplash=true;//false;										
					
					//this.startProcessFacturaDescuadrada(conSplash);
				
					this.generarReporteFacturaDescuadradasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturaDescuadrada.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxTiposAccionesFormularioFacturaDescuadrada.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFacturaDescuadradasSeleccionados();
				//this.jComboBoxTiposAccionesFacturaDescuadrada.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturaDescuadradasSeleccionados(false);
				//this.jComboBoxTiposAccionesFacturaDescuadrada.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturaDescuadradasSeleccionados(true);
				//this.jComboBoxTiposAccionesFacturaDescuadrada.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturaDescuadrada();
				
				this.exportarFacturaDescuadradasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturaDescuadrada.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxTiposAccionesFormularioFacturaDescuadrada.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFacturaDescuadradas();
				//this.importarFacturaDescuadradas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturaDescuadrada.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxTiposAccionesFormularioFacturaDescuadrada.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturaDescuadrada();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFacturaDescuadradasSeleccionados();
				//this.jComboBoxTiposAccionesFacturaDescuadrada.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Factura Descuadrada", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFacturaDescuadrada();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFacturaDescuadrada)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFacturaDescuadrada(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Factura Descuadrada",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturaDescuadrada.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxTiposAccionesFormularioFacturaDescuadrada.setSelectedIndex(0);					
				}	
			} 			
			else if(FacturaDescuadradaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFacturaDescuadrada) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFacturaDescuadrada(conSplash);
					
						//this.actualizarParametrosGeneralFacturaDescuadrada();
						
						this.generarReporteProcesoAccionFacturaDescuadradasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFacturaDescuadrada.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxTiposAccionesFormularioFacturaDescuadrada.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FacturaDescuadradaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Factura DescuadradaS SELECCIONADOS?", "MANTENIMIENTO DE Factura Descuadrada", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFacturaDescuadrada();
				
						this.actualizarParametrosGeneralFacturaDescuadrada();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.facturadescuadradaReturnGeneral=facturadescuadradaLogic.procesarAccionFacturaDescuadradasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.facturadescuadradaLogic.getFacturaDescuadradas(),this.facturadescuadradaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFacturaDescuadradaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturaDescuadrada.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxTiposAccionesFormularioFacturaDescuadrada.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFacturaDescuadrada();
					
					FacturaDescuadradaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFacturaDescuadradaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturaDescuadrada.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxTiposAccionesFormularioFacturaDescuadrada.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFacturaDescuadrada(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFacturaDescuadradaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFacturaDescuadrada();
			
			if(this.jInternalFrameDetalleFormFacturaDescuadrada==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FacturaDescuadrada> facturadescuadradasSeleccionados=new ArrayList<FacturaDescuadrada>();		
			FacturaDescuadrada facturadescuadrada=new FacturaDescuadrada();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFacturaDescuadrada(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFacturaDescuadrada.getSelectedItem();
			
			
			
			
			facturadescuadradasSeleccionados=this.getFacturaDescuadradasSeleccionados(true);
			//this.sTipoAccion;
			
			if(facturadescuadradasSeleccionados.size()==1) {
				for(FacturaDescuadrada facturadescuadradaAux:facturadescuadradasSeleccionados) {
					facturadescuadrada=facturadescuadradaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFacturaDescuadrada();
			
      		//this.finishProcessFacturaDescuadrada(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFacturaDescuadradaReturnGeneral() throws Exception {
		if(this.facturadescuadradaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.facturadescuadradaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.facturadescuadradaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.facturadescuadradaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.facturadescuadradaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.facturadescuadradaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFacturaDescuadrada(false);
		}
		
		if(this.facturadescuadradaReturnGeneral.getConRetornoLista() || this.facturadescuadradaReturnGeneral.getConRetornoObjeto()) {
			if(this.facturadescuadradaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.facturadescuadradaLogic.setFacturaDescuadradas(this.facturadescuadradaReturnGeneral.getFacturaDescuadradas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingFacturaDescuadrada(false);
		}
	}
	
	public void actualizarParametrosGeneralFacturaDescuadrada() throws Exception {
		
		
	}
	
	public ArrayList<FacturaDescuadrada> getFacturaDescuadradasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FacturaDescuadrada> facturadescuadradasSeleccionados=new ArrayList<FacturaDescuadrada>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFacturaDescuadrada) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FacturaDescuadrada facturadescuadradaAux:facturadescuadradaLogic.getFacturaDescuadradas()) {
					if(facturadescuadradaAux.getIsSelected()) {
						facturadescuadradasSeleccionados.add(facturadescuadradaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturaDescuadrada facturadescuadradaAux:this.facturadescuadradas) {
					if(facturadescuadradaAux.getIsSelected()) {
						facturadescuadradasSeleccionados.add(facturadescuadradaAux);				
					}
				}
			}
			
			if(facturadescuadradasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						facturadescuadradasSeleccionados.addAll(this.facturadescuadradaLogic.getFacturaDescuadradas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						facturadescuadradasSeleccionados.addAll(this.facturadescuadradas);				
					}
				}
			}
		} else {
			facturadescuadradasSeleccionados.add(this.facturadescuadrada);
		}
		
		return facturadescuadradasSeleccionados;
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
	
	public void generarReporteFacturaDescuadradasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFacturaDescuadradasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFacturaDescuadradasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturaDescuadradasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturaDescuadradasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Factura Descuadrada",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFacturaDescuadradasSeleccionados() throws Exception {
		ArrayList<FacturaDescuadrada> facturadescuadradasSeleccionados=new ArrayList<FacturaDescuadrada>();		
		
		facturadescuadradasSeleccionados=this.getFacturaDescuadradasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFacturaDescuadradas("Todos",facturadescuadradasSeleccionados);
		
	}	
	
	public void generarReporteNormalFacturaDescuadradasSeleccionados() throws Exception {
		ArrayList<FacturaDescuadrada> facturadescuadradasSeleccionados=new ArrayList<FacturaDescuadrada>();		
		
		facturadescuadradasSeleccionados=this.getFacturaDescuadradasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFacturaDescuadradas("Todos",facturadescuadradasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFacturaDescuadradasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FacturaDescuadrada> facturadescuadradasSeleccionados=new ArrayList<FacturaDescuadrada>();
		
		facturadescuadradasSeleccionados=this.getFacturaDescuadradasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFacturaDescuadradas("Todos",facturadescuadradasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFacturaDescuadradasSeleccionados() throws Exception {
		ArrayList<FacturaDescuadrada> facturadescuadradasSeleccionados=new ArrayList<FacturaDescuadrada>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFacturaDescuadrada();
		
		
		facturadescuadradasSeleccionados=this.getFacturaDescuadradasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFacturaDescuadrada();
		
		
		//this.generarReporteFacturaDescuadradas("Todos",facturadescuadradasSeleccionados ,facturadescuadradaImplementable,facturadescuadradaImplementableHome);
	}
	
	public void mostrarImportacionFacturaDescuadradas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFacturaDescuadrada();
		
		this.abrirFrameImportacionFacturaDescuadrada();		
		
			
		//this.generarReporteFacturaDescuadradas("Todos",facturadescuadradasSeleccionados ,facturadescuadradaImplementable,facturadescuadradaImplementableHome);
	}
	
	public void importarFacturaDescuadradas() throws Exception {		
	
	}
	
	public void exportarFacturaDescuadradasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFacturaDescuadradasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFacturaDescuadradasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFacturaDescuadradasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Factura Descuadrada",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFacturaDescuadradasSeleccionados() throws Exception {
		ArrayList<FacturaDescuadrada> facturadescuadradasSeleccionados=new ArrayList<FacturaDescuadrada>();		
		
		facturadescuadradasSeleccionados=this.getFacturaDescuadradasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturadescuadrada."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFacturaDescuadrada(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FacturaDescuadrada facturadescuadradaAux:facturadescuadradasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFacturaDescuadrada(facturadescuadradaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//facturadescuadradaAux.setsDetalleGeneralEntityReporte(facturadescuadradaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Descuadrada",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFacturaDescuadrada(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FacturaDescuadradaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDescuadradaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDescuadradaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDescuadradaConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDescuadradaConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDescuadradaConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDescuadradaConstantesFunciones.LABEL_SUBTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDescuadradaConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDescuadradaConstantesFunciones.LABEL_FINANCIAMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDescuadradaConstantesFunciones.LABEL_FLETE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDescuadradaConstantesFunciones.LABEL_ICE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDescuadradaConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDescuadradaConstantesFunciones.LABEL_TOTALFORMASPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTOREAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFacturaDescuadrada(FacturaDescuadrada facturadescuadrada,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=facturadescuadrada.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadescuadrada.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadescuadrada.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadescuadrada.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadescuadrada.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadescuadrada.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadescuadrada.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadescuadrada.getsubtotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadescuadrada.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadescuadrada.getdescuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadescuadrada.getfinanciamiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadescuadrada.getflete().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadescuadrada.getice().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadescuadrada.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadescuadrada.gettotal_formas_pago().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadescuadrada.getdescuento_real().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFacturaDescuadradasSeleccionados() throws Exception {
		ArrayList<FacturaDescuadrada> facturadescuadradasSeleccionados=new ArrayList<FacturaDescuadrada>();		
		
		facturadescuadradasSeleccionados=this.getFacturaDescuadradasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturadescuadrada.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FacturaDescuadradas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFacturaDescuadrada(row);				
				iRow++;
			}				
			
			for(FacturaDescuadrada facturadescuadradaAux:facturadescuadradasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFacturaDescuadrada(facturadescuadradaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Descuadrada",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFacturaDescuadradasSeleccionados() throws Exception {
		ArrayList<FacturaDescuadrada> facturadescuadradasSeleccionados=new ArrayList<FacturaDescuadrada>();		
		
		facturadescuadradasSeleccionados=this.getFacturaDescuadradasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturadescuadrada.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("facturadescuadradas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("facturadescuadrada");
			//elementRoot.appendChild(element);
		
			for(FacturaDescuadrada facturadescuadradaAux:facturadescuadradasSeleccionados) {
				element = document.createElement("facturadescuadrada");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFacturaDescuadrada(facturadescuadradaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Descuadrada",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFacturaDescuadrada(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_SUBTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_FINANCIAMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_FLETE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_ICE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_TOTALFORMASPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTOREAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFacturaDescuadrada(FacturaDescuadrada facturadescuadrada,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(facturadescuadrada.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadescuadrada.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadescuadrada.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadescuadrada.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadescuadrada.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadescuadrada.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadescuadrada.getsubtotal());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadescuadrada.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadescuadrada.getdescuento());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadescuadrada.getfinanciamiento());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadescuadrada.getflete());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadescuadrada.getice());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadescuadrada.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadescuadrada.gettotal_formas_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadescuadrada.getdescuento_real());				
	}
	
	public void setFilaDatosExportarXmlFacturaDescuadrada(FacturaDescuadrada facturadescuadrada,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FacturaDescuadradaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(facturadescuadrada.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FacturaDescuadradaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(facturadescuadrada.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FacturaDescuadradaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(facturadescuadrada.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfecha_inicio = document.createElement(FacturaDescuadradaConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(facturadescuadrada.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(FacturaDescuadradaConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(facturadescuadrada.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementsecuencial = document.createElement(FacturaDescuadradaConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(facturadescuadrada.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementfecha = document.createElement(FacturaDescuadradaConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(facturadescuadrada.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementsubtotal = document.createElement(FacturaDescuadradaConstantesFunciones.SUBTOTAL);
		elementsubtotal.appendChild(document.createTextNode(facturadescuadrada.getsubtotal().toString().trim()));
		element.appendChild(elementsubtotal);

		Element elementiva = document.createElement(FacturaDescuadradaConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(facturadescuadrada.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementdescuento = document.createElement(FacturaDescuadradaConstantesFunciones.DESCUENTO);
		elementdescuento.appendChild(document.createTextNode(facturadescuadrada.getdescuento().toString().trim()));
		element.appendChild(elementdescuento);

		Element elementfinanciamiento = document.createElement(FacturaDescuadradaConstantesFunciones.FINANCIAMIENTO);
		elementfinanciamiento.appendChild(document.createTextNode(facturadescuadrada.getfinanciamiento().toString().trim()));
		element.appendChild(elementfinanciamiento);

		Element elementflete = document.createElement(FacturaDescuadradaConstantesFunciones.FLETE);
		elementflete.appendChild(document.createTextNode(facturadescuadrada.getflete().toString().trim()));
		element.appendChild(elementflete);

		Element elementice = document.createElement(FacturaDescuadradaConstantesFunciones.ICE);
		elementice.appendChild(document.createTextNode(facturadescuadrada.getice().toString().trim()));
		element.appendChild(elementice);

		Element elementtotal = document.createElement(FacturaDescuadradaConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(facturadescuadrada.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementtotal_formas_pago = document.createElement(FacturaDescuadradaConstantesFunciones.TOTALFORMASPAGO);
		elementtotal_formas_pago.appendChild(document.createTextNode(facturadescuadrada.gettotal_formas_pago().toString().trim()));
		element.appendChild(elementtotal_formas_pago);

		Element elementdescuento_real = document.createElement(FacturaDescuadradaConstantesFunciones.DESCUENTOREAL);
		elementdescuento_real.appendChild(document.createTextNode(facturadescuadrada.getdescuento_real().toString().trim()));
		element.appendChild(elementdescuento_real);
	}
	
	public void generarReporteGroupGenericoFacturaDescuadradasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FacturaDescuadrada> facturadescuadradasSeleccionados=new ArrayList<FacturaDescuadrada>();
		
		facturadescuadradasSeleccionados=this.getFacturaDescuadradasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFacturaDescuadrada(facturadescuadradasSeleccionados);
		
		this.generarReporteFacturaDescuadradas("Todos",facturadescuadradasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFacturaDescuadrada(ArrayList<FacturaDescuadrada> facturadescuadradasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FacturaDescuadrada facturadescuadradaAux:facturadescuadradasSeleccionados) {
				facturadescuadradaAux.setsDetalleGeneralEntityReporte(facturadescuadradaAux.toString());
			
				if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					facturadescuadradaAux.setsDescripcionGeneralEntityReporte1(facturadescuadradaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					facturadescuadradaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturadescuadradaAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					facturadescuadradaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturadescuadradaAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					facturadescuadradaAux.setsDescripcionGeneralEntityReporte1(facturadescuadradaAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(FacturaDescuadradaConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					facturadescuadradaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturadescuadradaAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDescuadradaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFacturaDescuadrada(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFacturaDescuadrada=true;
				this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada=true;
				this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada=true;
			}
			
			this.isVisibilidadCeldaModificarFacturaDescuadrada=false;
			this.isVisibilidadCeldaActualizarFacturaDescuadrada=false;
			this.isVisibilidadCeldaEliminarFacturaDescuadrada=false;
			this.isVisibilidadCeldaCancelarFacturaDescuadrada=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaDescuadrada=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturaDescuadrada=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFacturaDescuadrada=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada=false;
			this.isVisibilidadCeldaModificarFacturaDescuadrada=false;
			this.isVisibilidadCeldaActualizarFacturaDescuadrada=true;
			this.isVisibilidadCeldaEliminarFacturaDescuadrada=false;
			this.isVisibilidadCeldaCancelarFacturaDescuadrada=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaDescuadrada=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturaDescuadrada=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFacturaDescuadrada=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada=false;
			this.isVisibilidadCeldaModificarFacturaDescuadrada=false;
			this.isVisibilidadCeldaActualizarFacturaDescuadrada=true;
			this.isVisibilidadCeldaEliminarFacturaDescuadrada=true;
			this.isVisibilidadCeldaCancelarFacturaDescuadrada=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaDescuadrada=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturaDescuadrada=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFacturaDescuadrada=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada=false;
			this.isVisibilidadCeldaModificarFacturaDescuadrada=false;
			this.isVisibilidadCeldaActualizarFacturaDescuadrada=true;
			this.isVisibilidadCeldaEliminarFacturaDescuadrada=false;
			this.isVisibilidadCeldaCancelarFacturaDescuadrada=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaDescuadrada=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturaDescuadrada=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFacturaDescuadrada=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada=true;
			this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada=true;
			this.isVisibilidadCeldaModificarFacturaDescuadrada=false;
			this.isVisibilidadCeldaActualizarFacturaDescuadrada=false;
			this.isVisibilidadCeldaEliminarFacturaDescuadrada=false;
			this.isVisibilidadCeldaCancelarFacturaDescuadrada=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaDescuadrada=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturaDescuadrada=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFacturaDescuadrada=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada=false;
			this.isVisibilidadCeldaActualizarFacturaDescuadrada=false;
			this.isVisibilidadCeldaEliminarFacturaDescuadrada=false;
			this.isVisibilidadCeldaCancelarFacturaDescuadrada=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaDescuadrada=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturaDescuadrada=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFacturaDescuadrada=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada=false;
			this.isVisibilidadCeldaModificarFacturaDescuadrada=true;
			this.isVisibilidadCeldaActualizarFacturaDescuadrada=false;
			this.isVisibilidadCeldaEliminarFacturaDescuadrada=false;
			this.isVisibilidadCeldaCancelarFacturaDescuadrada=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaDescuadrada=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturaDescuadrada=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FacturaDescuadradaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFacturaDescuadrada=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada=true;
			this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada=true;
		} else {
			this.actualizarEstadoPanelsFacturaDescuadrada(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFacturaDescuadrada=false;
			//this.isVisibilidadCeldaVerFormFacturaDescuadrada=false;
			this.isVisibilidadCeldaDuplicarFacturaDescuadrada=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!facturadescuadradaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada=false;
		} else {
			this.isVisibilidadCeldaNuevoFacturaDescuadrada=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
			if(!facturadescuadradaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada=false;												
			}
			
			this.jButtonCerrarFacturaDescuadrada.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada=false;
		}
		
		if(!this.permiteMantenimiento(this.facturadescuadrada)) {
			this.isVisibilidadCeldaActualizarFacturaDescuadrada=false;
			this.isVisibilidadCeldaEliminarFacturaDescuadrada=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoFacturaDescuadrada=false;
		this.isVisibilidadCeldaNuevoRelacionesFacturaDescuadrada=false;
		this.isVisibilidadCeldaGuardarCambiosFacturaDescuadrada=false;
		//this.isVisibilidadCeldaModificarFacturaDescuadrada=true;
		this.isVisibilidadCeldaActualizarFacturaDescuadrada=false;
		this.isVisibilidadCeldaEliminarFacturaDescuadrada=false;
		//this.isVisibilidadCeldaCancelarFacturaDescuadrada=true;			
		this.isVisibilidadCeldaGuardarFacturaDescuadrada=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFacturaDescuadrada() {
	}
	
	public void actualizarEstadoPanelsFacturaDescuadrada(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFacturaDescuadrada!=null) {
				this.jScrollPanelDatosEdicionFacturaDescuadrada.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaDescuadrada!=null) {
				this.jTabbedPaneBusquedasFacturaDescuadrada.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturaDescuadrada!=null) {
				this.jScrollPanelDatosFacturaDescuadrada.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturaDescuadrada!=null) {
				this.jPanelPaginacionFacturaDescuadrada.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturaDescuadrada!=null) {
				this.jPanelParametrosReportesFacturaDescuadrada.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFacturaDescuadrada!=null) {
				this.jScrollPanelDatosEdicionFacturaDescuadrada.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaDescuadrada!=null) {
				this.jTabbedPaneBusquedasFacturaDescuadrada.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFacturaDescuadrada!=null) {
				this.jScrollPanelDatosFacturaDescuadrada.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturaDescuadrada!=null) {
				this.jPanelPaginacionFacturaDescuadrada.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturaDescuadrada!=null) {
				this.jPanelParametrosReportesFacturaDescuadrada.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFacturaDescuadrada!=null) {
				this.jScrollPanelDatosEdicionFacturaDescuadrada.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaDescuadrada!=null) {
				this.jTabbedPaneBusquedasFacturaDescuadrada.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturaDescuadrada!=null) {
				this.jScrollPanelDatosFacturaDescuadrada.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturaDescuadrada!=null) {
				this.jPanelPaginacionFacturaDescuadrada.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturaDescuadrada!=null) {
				this.jPanelParametrosReportesFacturaDescuadrada.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFacturaDescuadrada!=null) {
				this.jScrollPanelDatosEdicionFacturaDescuadrada.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaDescuadrada!=null) {
				this.jTabbedPaneBusquedasFacturaDescuadrada.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturaDescuadrada!=null) {
				this.jScrollPanelDatosFacturaDescuadrada.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturaDescuadrada!=null) {
				this.jPanelPaginacionFacturaDescuadrada.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturaDescuadrada!=null) {
				this.jPanelParametrosReportesFacturaDescuadrada.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFacturaDescuadrada!=null) {
				this.jScrollPanelDatosEdicionFacturaDescuadrada.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaDescuadrada!=null) {
				this.jTabbedPaneBusquedasFacturaDescuadrada.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturaDescuadrada!=null) {
				this.jScrollPanelDatosFacturaDescuadrada.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturaDescuadrada!=null) {
				this.jPanelPaginacionFacturaDescuadrada.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturaDescuadrada!=null) {
				this.jPanelParametrosReportesFacturaDescuadrada.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFacturaDescuadrada!=null) {
				this.jScrollPanelDatosEdicionFacturaDescuadrada.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaDescuadrada!=null) {
				this.jTabbedPaneBusquedasFacturaDescuadrada.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturaDescuadrada!=null) {
				this.jScrollPanelDatosFacturaDescuadrada.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturaDescuadrada!=null) {
				this.jPanelPaginacionFacturaDescuadrada.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturaDescuadrada!=null) {
				this.jPanelParametrosReportesFacturaDescuadrada.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFacturaDescuadrada!=null) {
				this.jScrollPanelDatosEdicionFacturaDescuadrada.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaDescuadrada!=null) {
				this.jTabbedPaneBusquedasFacturaDescuadrada.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturaDescuadrada!=null) {
				this.jScrollPanelDatosFacturaDescuadrada.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturaDescuadrada!=null) {
				this.jPanelPaginacionFacturaDescuadrada.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturaDescuadrada!=null) {
				this.jPanelParametrosReportesFacturaDescuadrada.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFacturaDescuadrada!=null) {
					this.jTabbedPaneBusquedasFacturaDescuadrada.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFacturaDescuadrada!=null) {
				this.jPanelParametrosReportesFacturaDescuadrada.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaDescuadrada!=null) {
				this.jTabbedPaneBusquedasFacturaDescuadrada.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFacturaDescuadrada!=null) {
				this.jPanelParametrosReportesFacturaDescuadrada.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaFacturaDescuadrada=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaFacturaDescuadrada) {this.jTabbedPaneBusquedasFacturaDescuadrada.remove(jPanelBusquedaFacturaDescuadradaFacturaDescuadrada);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFacturaDescuadrada(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFacturaDescuadrada() {
		this.updateBorderResaltarBusquedasFormularioFacturaDescuadrada();
		this.updateVisibilidadBusquedasFormularioFacturaDescuadrada();
		this.updateHabilitarBusquedasFormularioFacturaDescuadrada();
	}
	
	public void updateBorderResaltarBusquedasFormularioFacturaDescuadrada() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFacturaDescuadrada.getComponents().length>0) {
	

		if(this.facturadescuadradaConstantesFunciones.resaltarBusquedaFacturaDescuadradaFacturaDescuadrada!=null) {
			index= this.jTabbedPaneBusquedasFacturaDescuadrada.indexOfComponent(this.jPanelBusquedaFacturaDescuadradaFacturaDescuadrada);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaDescuadrada.getComponent(index);
				jPanel.setBorder(this.facturadescuadradaConstantesFunciones.resaltarBusquedaFacturaDescuadradaFacturaDescuadrada);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFacturaDescuadrada() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFacturaDescuadrada.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFacturaDescuadrada.indexOfComponent(this.jPanelBusquedaFacturaDescuadradaFacturaDescuadrada);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaDescuadrada.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.facturadescuadradaConstantesFunciones.mostrarBusquedaFacturaDescuadradaFacturaDescuadrada);
			if(!this.facturadescuadradaConstantesFunciones.mostrarBusquedaFacturaDescuadradaFacturaDescuadrada && index>-1) {
				this.jTabbedPaneBusquedasFacturaDescuadrada.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFacturaDescuadrada() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFacturaDescuadrada.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFacturaDescuadrada.indexOfComponent(this.jPanelBusquedaFacturaDescuadradaFacturaDescuadrada);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaDescuadrada.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.facturadescuadradaConstantesFunciones.activarBusquedaFacturaDescuadradaFacturaDescuadrada);
				this.jTabbedPaneBusquedasFacturaDescuadrada.setEnabledAt(index,this.facturadescuadradaConstantesFunciones.activarBusquedaFacturaDescuadradaFacturaDescuadrada);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFacturaDescuadrada(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaFacturaDescuadrada")) {
			index= this.jTabbedPaneBusquedasFacturaDescuadrada.indexOfComponent(this.jPanelBusquedaFacturaDescuadradaFacturaDescuadrada);

			this.jTabbedPaneBusquedasFacturaDescuadrada.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaDescuadrada.getComponent(index);

			this.facturadescuadradaConstantesFunciones.setResaltarBusquedaFacturaDescuadradaFacturaDescuadrada(resaltar);

			jPanel.setBorder(this.facturadescuadradaConstantesFunciones.resaltarBusquedaFacturaDescuadradaFacturaDescuadrada);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFacturaDescuadrada.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFacturaDescuadrada() throws Exception {

		if(this.jInternalFrameDetalleFormFacturaDescuadrada==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFacturaDescuadrada();
		this.updateVisibilidadResaltarControlesFormularioFacturaDescuadrada();
		this.updateHabilitarResaltarControlesFormularioFacturaDescuadrada();
		
	}
	
	public void updateBorderResaltarControlesFormularioFacturaDescuadrada() throws Exception {
		if(this.jInternalFrameDetalleFormFacturaDescuadrada==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.facturadescuadradaConstantesFunciones.resaltaridFacturaDescuadrada!=null && this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelidFacturaDescuadrada.setBorder(this.facturadescuadradaConstantesFunciones.resaltaridFacturaDescuadrada);}
		if(this.facturadescuadradaConstantesFunciones.resaltarid_empresaFacturaDescuadrada!=null && this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxid_empresaFacturaDescuadrada.setBorder(this.facturadescuadradaConstantesFunciones.resaltarid_empresaFacturaDescuadrada);}
		if(this.facturadescuadradaConstantesFunciones.resaltarfecha_inicioFacturaDescuadrada!=null && this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {this.jInternalFrameDetalleFormFacturaDescuadrada.jDateChooserfecha_inicioFacturaDescuadrada.setBorder(this.facturadescuadradaConstantesFunciones.resaltarfecha_inicioFacturaDescuadrada);}
		if(this.facturadescuadradaConstantesFunciones.resaltarfecha_finFacturaDescuadrada!=null && this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {this.jInternalFrameDetalleFormFacturaDescuadrada.jDateChooserfecha_finFacturaDescuadrada.setBorder(this.facturadescuadradaConstantesFunciones.resaltarfecha_finFacturaDescuadrada);}
		if(this.facturadescuadradaConstantesFunciones.resaltarsecuencialFacturaDescuadrada!=null && this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldsecuencialFacturaDescuadrada.setBorder(this.facturadescuadradaConstantesFunciones.resaltarsecuencialFacturaDescuadrada);}
		if(this.facturadescuadradaConstantesFunciones.resaltarfechaFacturaDescuadrada!=null && this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {this.jInternalFrameDetalleFormFacturaDescuadrada.jDateChooserfechaFacturaDescuadrada.setBorder(this.facturadescuadradaConstantesFunciones.resaltarfechaFacturaDescuadrada);}
		if(this.facturadescuadradaConstantesFunciones.resaltarsubtotalFacturaDescuadrada!=null && this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldsubtotalFacturaDescuadrada.setBorder(this.facturadescuadradaConstantesFunciones.resaltarsubtotalFacturaDescuadrada);}
		if(this.facturadescuadradaConstantesFunciones.resaltarivaFacturaDescuadrada!=null && this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldivaFacturaDescuadrada.setBorder(this.facturadescuadradaConstantesFunciones.resaltarivaFacturaDescuadrada);}
		if(this.facturadescuadradaConstantesFunciones.resaltardescuentoFacturaDescuadrada!=null && this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFielddescuentoFacturaDescuadrada.setBorder(this.facturadescuadradaConstantesFunciones.resaltardescuentoFacturaDescuadrada);}
		if(this.facturadescuadradaConstantesFunciones.resaltarfinanciamientoFacturaDescuadrada!=null && this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldfinanciamientoFacturaDescuadrada.setBorder(this.facturadescuadradaConstantesFunciones.resaltarfinanciamientoFacturaDescuadrada);}
		if(this.facturadescuadradaConstantesFunciones.resaltarfleteFacturaDescuadrada!=null && this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldfleteFacturaDescuadrada.setBorder(this.facturadescuadradaConstantesFunciones.resaltarfleteFacturaDescuadrada);}
		if(this.facturadescuadradaConstantesFunciones.resaltariceFacturaDescuadrada!=null && this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldiceFacturaDescuadrada.setBorder(this.facturadescuadradaConstantesFunciones.resaltariceFacturaDescuadrada);}
		if(this.facturadescuadradaConstantesFunciones.resaltartotalFacturaDescuadrada!=null && this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldtotalFacturaDescuadrada.setBorder(this.facturadescuadradaConstantesFunciones.resaltartotalFacturaDescuadrada);}
		if(this.facturadescuadradaConstantesFunciones.resaltartotal_formas_pagoFacturaDescuadrada!=null && this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldtotal_formas_pagoFacturaDescuadrada.setBorder(this.facturadescuadradaConstantesFunciones.resaltartotal_formas_pagoFacturaDescuadrada);}
		if(this.facturadescuadradaConstantesFunciones.resaltardescuento_realFacturaDescuadrada!=null && this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFielddescuento_realFacturaDescuadrada.setBorder(this.facturadescuadradaConstantesFunciones.resaltardescuento_realFacturaDescuadrada);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFacturaDescuadrada() throws Exception {		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
	
		//this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelidFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostraridFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jPanelidFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostraridFacturaDescuadrada);
		//this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxid_empresaFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarid_empresaFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jPanelid_empresaFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarid_empresaFacturaDescuadrada);
		//this.jInternalFrameDetalleFormFacturaDescuadrada.jDateChooserfecha_inicioFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarfecha_inicioFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jPanelfecha_inicioFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarfecha_inicioFacturaDescuadrada);
		//this.jInternalFrameDetalleFormFacturaDescuadrada.jDateChooserfecha_finFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarfecha_finFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jPanelfecha_finFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarfecha_finFacturaDescuadrada);
		//this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldsecuencialFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarsecuencialFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jPanelsecuencialFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarsecuencialFacturaDescuadrada);
		//this.jInternalFrameDetalleFormFacturaDescuadrada.jDateChooserfechaFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarfechaFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jPanelfechaFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarfechaFacturaDescuadrada);
		//this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldsubtotalFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarsubtotalFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jPanelsubtotalFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarsubtotalFacturaDescuadrada);
		//this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldivaFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarivaFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jPanelivaFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarivaFacturaDescuadrada);
		//this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFielddescuentoFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrardescuentoFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jPaneldescuentoFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrardescuentoFacturaDescuadrada);
		//this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldfinanciamientoFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarfinanciamientoFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jPanelfinanciamientoFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarfinanciamientoFacturaDescuadrada);
		//this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldfleteFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarfleteFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jPanelfleteFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrarfleteFacturaDescuadrada);
		//this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldiceFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrariceFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jPaneliceFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrariceFacturaDescuadrada);
		//this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldtotalFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrartotalFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jPaneltotalFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrartotalFacturaDescuadrada);
		//this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldtotal_formas_pagoFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrartotal_formas_pagoFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jPaneltotal_formas_pagoFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrartotal_formas_pagoFacturaDescuadrada);
		//this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFielddescuento_realFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrardescuento_realFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jPaneldescuento_realFacturaDescuadrada.setVisible(this.facturadescuadradaConstantesFunciones.mostrardescuento_realFacturaDescuadrada);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFacturaDescuadrada() throws Exception {
		if(this.jInternalFrameDetalleFormFacturaDescuadrada==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturaDescuadrada!=null) {
	
		this.jInternalFrameDetalleFormFacturaDescuadrada.jLabelidFacturaDescuadrada.setEnabled(this.facturadescuadradaConstantesFunciones.activaridFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jComboBoxid_empresaFacturaDescuadrada.setEnabled(this.facturadescuadradaConstantesFunciones.activarid_empresaFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jDateChooserfecha_inicioFacturaDescuadrada.setEnabled(this.facturadescuadradaConstantesFunciones.activarfecha_inicioFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jDateChooserfecha_finFacturaDescuadrada.setEnabled(this.facturadescuadradaConstantesFunciones.activarfecha_finFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldsecuencialFacturaDescuadrada.setEnabled(this.facturadescuadradaConstantesFunciones.activarsecuencialFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jDateChooserfechaFacturaDescuadrada.setEnabled(this.facturadescuadradaConstantesFunciones.activarfechaFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldsubtotalFacturaDescuadrada.setEnabled(this.facturadescuadradaConstantesFunciones.activarsubtotalFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldivaFacturaDescuadrada.setEnabled(this.facturadescuadradaConstantesFunciones.activarivaFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFielddescuentoFacturaDescuadrada.setEnabled(this.facturadescuadradaConstantesFunciones.activardescuentoFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldfinanciamientoFacturaDescuadrada.setEnabled(this.facturadescuadradaConstantesFunciones.activarfinanciamientoFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldfleteFacturaDescuadrada.setEnabled(this.facturadescuadradaConstantesFunciones.activarfleteFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldiceFacturaDescuadrada.setEnabled(this.facturadescuadradaConstantesFunciones.activariceFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldtotalFacturaDescuadrada.setEnabled(this.facturadescuadradaConstantesFunciones.activartotalFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFieldtotal_formas_pagoFacturaDescuadrada.setEnabled(this.facturadescuadradaConstantesFunciones.activartotal_formas_pagoFacturaDescuadrada);
		this.jInternalFrameDetalleFormFacturaDescuadrada.jTextFielddescuento_realFacturaDescuadrada.setEnabled(this.facturadescuadradaConstantesFunciones.activardescuento_realFacturaDescuadrada);
		}
	}
	
		
}