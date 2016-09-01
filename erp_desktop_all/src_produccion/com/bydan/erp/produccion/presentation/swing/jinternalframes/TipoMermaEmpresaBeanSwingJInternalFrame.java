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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;




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

import com.bydan.erp.produccion.util.TipoMermaEmpresaConstantesFunciones;
import com.bydan.erp.produccion.util.TipoMermaEmpresaParameterReturnGeneral;
//import com.bydan.erp.produccion.util.TipoMermaEmpresaParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.TipoMermaEmpresaBean;
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

import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.produccion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.produccion.util.*;
import com.bydan.erp.produccion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
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


import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
public class TipoMermaEmpresaBeanSwingJInternalFrame extends TipoMermaEmpresaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoMermaEmpresaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoMermaEmpresa> tipomermaempresaValidator = new ClassValidator<TipoMermaEmpresa>(TipoMermaEmpresa.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoMermaEmpresa tipomermaempresa;	
	public TipoMermaEmpresa tipomermaempresaAux;
	public TipoMermaEmpresa tipomermaempresaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoMermaEmpresa tipomermaempresaTotales;
	public Long idTipoMermaEmpresaActual;
	public Long iIdNuevoTipoMermaEmpresa=0L;
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
	
	public Boolean isPermisoTodoTipoMermaEmpresa;
	public Boolean isPermisoNuevoTipoMermaEmpresa;
	public Boolean isPermisoActualizarTipoMermaEmpresa;
	public Boolean isPermisoActualizarOriginalTipoMermaEmpresa;
	public Boolean isPermisoEliminarTipoMermaEmpresa;
	public Boolean isPermisoGuardarCambiosTipoMermaEmpresa;
	public Boolean isPermisoConsultaTipoMermaEmpresa;
	public Boolean isPermisoBusquedaTipoMermaEmpresa;
	public Boolean isPermisoReporteTipoMermaEmpresa;
	public Boolean isPermisoPaginacionMedioTipoMermaEmpresa;
	public Boolean isPermisoPaginacionAltoTipoMermaEmpresa;
	public Boolean isPermisoPaginacionTodoTipoMermaEmpresa;
	public Boolean isPermisoCopiarTipoMermaEmpresa;
	public Boolean isPermisoVerFormTipoMermaEmpresa;
	public Boolean isPermisoDuplicarTipoMermaEmpresa;
	public Boolean isPermisoOrdenTipoMermaEmpresa;
	
	
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
	
	public TipoMermaEmpresaParameterReturnGeneral tipomermaempresaReturnGeneral;
	public TipoMermaEmpresaParameterReturnGeneral tipomermaempresaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoMermaEmpresa=false;
	public Boolean esParaAccionDesdeFormularioTipoMermaEmpresa=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoMermaEmpresaSessionBeanAdditional tipomermaempresaSessionBeanAdditional=null;
	
	public TipoMermaEmpresaSessionBeanAdditional getTipoMermaEmpresaSessionBeanAdditional() {
		return this.tipomermaempresaSessionBeanAdditional;
	}
	
	public void setTipoMermaEmpresaSessionBeanAdditional(TipoMermaEmpresaSessionBeanAdditional tipomermaempresaSessionBeanAdditional) {
		try {
			this.tipomermaempresaSessionBeanAdditional=tipomermaempresaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoMermaEmpresaBeanSwingJInternalFrameAdditional tipomermaempresaBeanSwingJInternalFrameAdditional=null;
	//public class TipoMermaEmpresaBeanSwingJInternalFrame
	
	public TipoMermaEmpresaBeanSwingJInternalFrameAdditional getTipoMermaEmpresaBeanSwingJInternalFrameAdditional() {
		return this.tipomermaempresaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoMermaEmpresaBeanSwingJInternalFrameAdditional(TipoMermaEmpresaBeanSwingJInternalFrameAdditional tipomermaempresaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipomermaempresaBeanSwingJInternalFrameAdditional=tipomermaempresaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoMermaEmpresaLogic tipomermaempresaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoMermaEmpresa tipomermaempresaBean;
	public TipoMermaEmpresaConstantesFunciones tipomermaempresaConstantesFunciones;
	//public TipoMermaEmpresaParameterReturnGeneral tipomermaempresaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoMermaEmpresa> tipomermaempresas;	
	//public List<TipoMermaEmpresa> tipomermaempresasEliminados;
	//public List<TipoMermaEmpresa> tipomermaempresasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoMermaEmpresa=false;
	public Boolean isVisibilidadCeldaDuplicarTipoMermaEmpresa=true;
	public Boolean isVisibilidadCeldaCopiarTipoMermaEmpresa=true;
	public Boolean isVisibilidadCeldaVerFormTipoMermaEmpresa=true;
	public Boolean isVisibilidadCeldaOrdenTipoMermaEmpresa=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa=false;
	public Boolean isVisibilidadCeldaModificarTipoMermaEmpresa=false;
	public Boolean isVisibilidadCeldaActualizarTipoMermaEmpresa=false;
	public Boolean isVisibilidadCeldaEliminarTipoMermaEmpresa=false;
	public Boolean isVisibilidadCeldaCancelarTipoMermaEmpresa=false;
	public Boolean isVisibilidadCeldaGuardarTipoMermaEmpresa=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoMermaEmpresa() {
		return this.iIdNuevoTipoMermaEmpresa;
	}

	public void setiIdNuevoTipoMermaEmpresa(Long iIdNuevoTipoMermaEmpresa) {
		this.iIdNuevoTipoMermaEmpresa = iIdNuevoTipoMermaEmpresa;
	}
	
	public Long getidTipoMermaEmpresaActual() {
		return this.idTipoMermaEmpresaActual;
	}

	public void setidTipoMermaEmpresaActual(Long idTipoMermaEmpresaActual) {
		this.idTipoMermaEmpresaActual = idTipoMermaEmpresaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoMermaEmpresa gettipomermaempresa() {
		return this.tipomermaempresa;
	}

	public void settipomermaempresa(TipoMermaEmpresa tipomermaempresa) {
		this.tipomermaempresa = tipomermaempresa;
	}
	
	public TipoMermaEmpresa gettipomermaempresaAux() {
		return this.tipomermaempresaAux;
	}

	public void settipomermaempresaAux(TipoMermaEmpresa tipomermaempresaAux) {
		this.tipomermaempresaAux = tipomermaempresaAux;
	}				
	
	public TipoMermaEmpresa gettipomermaempresaAnterior() {
		return this.tipomermaempresaAnterior;
	}

	public void settipomermaempresaAnterior(TipoMermaEmpresa tipomermaempresaAnterior) {
		this.tipomermaempresaAnterior = tipomermaempresaAnterior;
	}	
	
	public TipoMermaEmpresa gettipomermaempresaTotales() {
		return this.tipomermaempresaTotales;
	}

	public void settipomermaempresaTotales(TipoMermaEmpresa tipomermaempresaTotales) {
		this.tipomermaempresaTotales = tipomermaempresaTotales;
	}	
	
	public TipoMermaEmpresa gettipomermaempresaBean() {
		return this.tipomermaempresaBean;
	}

	public void settipomermaempresaBean(TipoMermaEmpresa tipomermaempresaBean) {
		this.tipomermaempresaBean = tipomermaempresaBean;
	}	
	
	public TipoMermaEmpresaParameterReturnGeneral gettipomermaempresaReturnGeneral() {
		return this.tipomermaempresaReturnGeneral;
	}

	public void settipomermaempresaReturnGeneral(TipoMermaEmpresaParameterReturnGeneral tipomermaempresaReturnGeneral) {
		this.tipomermaempresaReturnGeneral = tipomermaempresaReturnGeneral;
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
	
	
	public TipoMermaEmpresaLogic getTipoMermaEmpresaLogic()	{		
		return tipomermaempresaLogic;
	}

	public void setTipoMermaEmpresaLogic(TipoMermaEmpresaLogic tipomermaempresaLogic) {
		this.tipomermaempresaLogic = tipomermaempresaLogic;
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
	
	public Boolean getIsEsNuevoTipoMermaEmpresa() {
		return isEsNuevoTipoMermaEmpresa;
	}

	public void setIsEsNuevoTipoMermaEmpresa(Boolean isEsNuevoTipoMermaEmpresa) {
		this.isEsNuevoTipoMermaEmpresa = isEsNuevoTipoMermaEmpresa;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoMermaEmpresa() {
		return esParaAccionDesdeFormularioTipoMermaEmpresa;
	}
	
	public void setEsParaAccionDesdeFormularioTipoMermaEmpresa(Boolean esParaAccionDesdeFormularioTipoMermaEmpresa) {
		this.esParaAccionDesdeFormularioTipoMermaEmpresa = esParaAccionDesdeFormularioTipoMermaEmpresa;
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

			if(this.tipomermaempresaSessionBean==null) {
				this.tipomermaempresaSessionBean=new TipoMermaEmpresaSessionBean();
			}

			if(!this.tipomermaempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipomermaempresaSessionBean.getlidEmpresaActual());
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

					if(this.tipomermaempresa!=null) {
						this.tipomermaempresa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
						this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxid_empresaTipoMermaEmpresa.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoMermaEmpresa.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
						if(this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxid_empresaTipoMermaEmpresa.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxid_empresaTipoMermaEmpresa.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoMermaEmpresaGenerico)throws Exception
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
				jComboBoxid_empresaTipoMermaEmpresaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoMermaEmpresaGenerico!=null && jComboBoxid_empresaTipoMermaEmpresaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoMermaEmpresaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoMermaEmpresa tipomermaempresa,JComboBox jComboBoxid_empresaTipoMermaEmpresaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoMermaEmpresaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxid_empresaTipoMermaEmpresa.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoMermaEmpresaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipomermaempresa.setid_empresa(empresaAux.getId());
				tipomermaempresa.setempresa_descripcion(TipoMermaEmpresaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipomermaempresa.setEmpresa(empresaAux);			}
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

					if(!TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { 
							this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxid_empresaTipoMermaEmpresa.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxid_empresaTipoMermaEmpresa.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { 
					}

					if(!TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxid_empresaTipoMermaEmpresa.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxid_empresaTipoMermaEmpresa.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoMermaEmpresa() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoMermaEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoMermaEmpresa(this.tipomermaempresaLogic.getTipoMermaEmpresas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoMermaEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoMermaEmpresa(this.tipomermaempresas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipomermaempresaLogic.setTipoMermaEmpresas(this.tipomermaempresas);
			tipomermaempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoMermaEmpresaParameterReturnGeneral getTipoMermaEmpresaParameterGeneral() {
		return this.tipomermaempresaParameterGeneral;
	}
	
	public void setTipoMermaEmpresaParameterGeneral(TipoMermaEmpresaParameterReturnGeneral tipomermaempresaParameterGeneral) {
		this.tipomermaempresaParameterGeneral = tipomermaempresaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoMermaEmpresa() {
		return isPermisoTodoTipoMermaEmpresa;
	}

	public void setIsPermisoTodoTipoMermaEmpresa(Boolean isPermisoTodoTipoMermaEmpresa) {
		this.isPermisoTodoTipoMermaEmpresa = isPermisoTodoTipoMermaEmpresa;
	}

	public Boolean getIsPermisoNuevoTipoMermaEmpresa() {
		return isPermisoNuevoTipoMermaEmpresa;
	}

	public void setIsPermisoNuevoTipoMermaEmpresa(Boolean isPermisoNuevoTipoMermaEmpresa) {
		this.isPermisoNuevoTipoMermaEmpresa = isPermisoNuevoTipoMermaEmpresa;
	}

	public Boolean getIsPermisoActualizarTipoMermaEmpresa() {
		return isPermisoActualizarTipoMermaEmpresa;
	}

	public void setIsPermisoActualizarTipoMermaEmpresa(Boolean isPermisoActualizarTipoMermaEmpresa) {
		this.isPermisoActualizarTipoMermaEmpresa = isPermisoActualizarTipoMermaEmpresa;
	}

	public Boolean getIsPermisoEliminarTipoMermaEmpresa() {
		return isPermisoEliminarTipoMermaEmpresa;
	}

	public void setIsPermisoEliminarTipoMermaEmpresa(Boolean isPermisoEliminarTipoMermaEmpresa) {
		this.isPermisoEliminarTipoMermaEmpresa = isPermisoEliminarTipoMermaEmpresa;
	}

	public Boolean getIsPermisoGuardarCambiosTipoMermaEmpresa() {
		return isPermisoGuardarCambiosTipoMermaEmpresa;
	}

	public void setIsPermisoGuardarCambiosTipoMermaEmpresa(Boolean isPermisoGuardarCambiosTipoMermaEmpresa) {
		this.isPermisoGuardarCambiosTipoMermaEmpresa = isPermisoGuardarCambiosTipoMermaEmpresa;
	}
	
	public Boolean getIsPermisoConsultaTipoMermaEmpresa() {
		return isPermisoConsultaTipoMermaEmpresa;
	}

	public void setIsPermisoConsultaTipoMermaEmpresa(Boolean isPermisoConsultaTipoMermaEmpresa) {
		this.isPermisoConsultaTipoMermaEmpresa = isPermisoConsultaTipoMermaEmpresa;
	}

	public Boolean getIsPermisoBusquedaTipoMermaEmpresa() {
		return isPermisoBusquedaTipoMermaEmpresa;
	}

	public void setIsPermisoBusquedaTipoMermaEmpresa(Boolean isPermisoBusquedaTipoMermaEmpresa) {
		this.isPermisoBusquedaTipoMermaEmpresa = isPermisoBusquedaTipoMermaEmpresa;
	}

	public Boolean getIsPermisoReporteTipoMermaEmpresa() {
		return isPermisoReporteTipoMermaEmpresa;
	}

	public void setIsPermisoReporteTipoMermaEmpresa(Boolean isPermisoReporteTipoMermaEmpresa) {
		this.isPermisoReporteTipoMermaEmpresa = isPermisoReporteTipoMermaEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoMermaEmpresa() {
		return isPermisoPaginacionMedioTipoMermaEmpresa;
	}

	public void setIsPermisoPaginacionMedioTipoMermaEmpresa(Boolean isPermisoPaginacionMedioTipoMermaEmpresa) {
		this.isPermisoPaginacionMedioTipoMermaEmpresa = isPermisoPaginacionMedioTipoMermaEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoMermaEmpresa() {
		return isPermisoPaginacionTodoTipoMermaEmpresa;
	}

	public void setIsPermisoPaginacionTodoTipoMermaEmpresa(Boolean isPermisoPaginacionTodoTipoMermaEmpresa) {
		this.isPermisoPaginacionTodoTipoMermaEmpresa = isPermisoPaginacionTodoTipoMermaEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoMermaEmpresa() {
		return isPermisoPaginacionAltoTipoMermaEmpresa;
	}

	public void setIsPermisoPaginacionAltoTipoMermaEmpresa(Boolean isPermisoPaginacionAltoTipoMermaEmpresa) {
		this.isPermisoPaginacionAltoTipoMermaEmpresa = isPermisoPaginacionAltoTipoMermaEmpresa;
	}
	
	public Boolean getIsPermisoCopiarTipoMermaEmpresa() {
		return isPermisoCopiarTipoMermaEmpresa;
	}

	public void setIsPermisoCopiarTipoMermaEmpresa(Boolean isPermisoCopiarTipoMermaEmpresa) {
		this.isPermisoCopiarTipoMermaEmpresa = isPermisoCopiarTipoMermaEmpresa;
	}
	
	public Boolean getIsPermisoVerFormTipoMermaEmpresa() {
		return isPermisoVerFormTipoMermaEmpresa;
	}

	public void setIsPermisoVerFormTipoMermaEmpresa(Boolean isPermisoVerFormTipoMermaEmpresa) {
		this.isPermisoVerFormTipoMermaEmpresa = isPermisoVerFormTipoMermaEmpresa;
	}
	
	public Boolean getIsPermisoDuplicarTipoMermaEmpresa() {
		return isPermisoDuplicarTipoMermaEmpresa;
	}

	public void setIsPermisoDuplicarTipoMermaEmpresa(Boolean isPermisoDuplicarTipoMermaEmpresa) {
		this.isPermisoDuplicarTipoMermaEmpresa = isPermisoDuplicarTipoMermaEmpresa;
	}
	
	public Boolean getIsPermisoOrdenTipoMermaEmpresa() {
		return isPermisoOrdenTipoMermaEmpresa;
	}

	public void setIsPermisoOrdenTipoMermaEmpresa(Boolean isPermisoOrdenTipoMermaEmpresa) {
		this.isPermisoOrdenTipoMermaEmpresa = isPermisoOrdenTipoMermaEmpresa;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoMermaEmpresa() {
		return isVisibilidadCeldaNuevoTipoMermaEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoTipoMermaEmpresa(Boolean isVisibilidadCeldaNuevoTipoMermaEmpresa) {
		this.isVisibilidadCeldaNuevoTipoMermaEmpresa = isVisibilidadCeldaNuevoTipoMermaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoMermaEmpresa() {
		return isVisibilidadCeldaDuplicarTipoMermaEmpresa;
	}

	public void setIsVisibilidadCeldaDuplicarTipoMermaEmpresa(Boolean isVisibilidadCeldaDuplicarTipoMermaEmpresa) {
		this.isVisibilidadCeldaDuplicarTipoMermaEmpresa = isVisibilidadCeldaDuplicarTipoMermaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoMermaEmpresa() {
		return isVisibilidadCeldaCopiarTipoMermaEmpresa;
	}

	public void setIsVisibilidadCeldaCopiarTipoMermaEmpresa(Boolean isVisibilidadCeldaCopiarTipoMermaEmpresa) {
		this.isVisibilidadCeldaCopiarTipoMermaEmpresa = isVisibilidadCeldaCopiarTipoMermaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoMermaEmpresa() {
		return isVisibilidadCeldaVerFormTipoMermaEmpresa;
	}

	public void setIsVisibilidadCeldaVerFormTipoMermaEmpresa(Boolean isVisibilidadCeldaVerFormTipoMermaEmpresa) {
		this.isVisibilidadCeldaVerFormTipoMermaEmpresa = isVisibilidadCeldaVerFormTipoMermaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoMermaEmpresa() {
		return isVisibilidadCeldaOrdenTipoMermaEmpresa;
	}

	public void setIsVisibilidadCeldaOrdenTipoMermaEmpresa(Boolean isVisibilidadCeldaOrdenTipoMermaEmpresa) {
		this.isVisibilidadCeldaOrdenTipoMermaEmpresa = isVisibilidadCeldaOrdenTipoMermaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa() {
		return isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa(Boolean isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa) {
		this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa = isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoMermaEmpresa() {
		return isVisibilidadCeldaModificarTipoMermaEmpresa;
	}

	public void setIsVisibilidadCeldaModificarTipoMermaEmpresa(Boolean isVisibilidadCeldaModificarTipoMermaEmpresa) {
		this.isVisibilidadCeldaModificarTipoMermaEmpresa = isVisibilidadCeldaModificarTipoMermaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoMermaEmpresa() {
		return isVisibilidadCeldaActualizarTipoMermaEmpresa;
	}

	public void setIsVisibilidadCeldaActualizarTipoMermaEmpresa(Boolean isVisibilidadCeldaActualizarTipoMermaEmpresa) {
		this.isVisibilidadCeldaActualizarTipoMermaEmpresa = isVisibilidadCeldaActualizarTipoMermaEmpresa;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoMermaEmpresa() {
		return isVisibilidadCeldaEliminarTipoMermaEmpresa;
	}

	public void setIsVisibilidadCeldaEliminarTipoMermaEmpresa(Boolean isVisibilidadCeldaEliminarTipoMermaEmpresa) {
		this.isVisibilidadCeldaEliminarTipoMermaEmpresa = isVisibilidadCeldaEliminarTipoMermaEmpresa;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoMermaEmpresa() {
		return isVisibilidadCeldaCancelarTipoMermaEmpresa;
	}

	public void setIsVisibilidadCeldaCancelarTipoMermaEmpresa(Boolean isVisibilidadCeldaCancelarTipoMermaEmpresa) {
		this.isVisibilidadCeldaCancelarTipoMermaEmpresa = isVisibilidadCeldaCancelarTipoMermaEmpresa;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoMermaEmpresa() {
		return isVisibilidadCeldaGuardarTipoMermaEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarTipoMermaEmpresa(Boolean isVisibilidadCeldaGuardarTipoMermaEmpresa) {
		this.isVisibilidadCeldaGuardarTipoMermaEmpresa = isVisibilidadCeldaGuardarTipoMermaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoMermaEmpresa() {
		return isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoMermaEmpresa(Boolean isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa) {
		this.isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa = isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa;
	}
		
	public TipoMermaEmpresaSessionBean gettipomermaempresaSessionBean() {
		return this.tipomermaempresaSessionBean;
	}
	
	public void settipomermaempresaSessionBean(TipoMermaEmpresaSessionBean tipomermaempresaSessionBean) {
		this.tipomermaempresaSessionBean=tipomermaempresaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipomermaempresa,null);
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
	
	public void bugActualizarReferenciaActual(TipoMermaEmpresa tipomermaempresa,TipoMermaEmpresa tipomermaempresaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoMermaEmpresa(tipomermaempresa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipomermaempresaAux.setId(tipomermaempresa.getId());
		tipomermaempresaAux.setVersionRow(tipomermaempresa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoMermaEmpresa();
		
			int intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoMermaEmpresa(this.tipomermaempresa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(this.tipomermaempresa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipomermaempresaValidator.getInvalidValues(this.tipomermaempresa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipomermaempresaLogic.setDatosCliente(datosCliente);
			tipomermaempresaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipomermaempresaAux=new  TipoMermaEmpresa();
				
				tipomermaempresaAux.setIsNew(true);
				tipomermaempresaAux.setIsChanged(true);
				
				tipomermaempresaAux.setTipoMermaEmpresaOriginal(this.tipomermaempresa);
				
				tipomermaempresaAux.setId(this.tipomermaempresa.getId());	
				tipomermaempresaAux.setVersionRow(this.tipomermaempresa.getVersionRow());	
				tipomermaempresaAux.setid_empresa(this.tipomermaempresa.getid_empresa());	
				tipomermaempresaAux.setnombre(this.tipomermaempresa.getnombre());	
				tipomermaempresaAux.setdescripcion(this.tipomermaempresa.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomermaempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomermaempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipomermaempresaAux,tipomermaempresaLogic.getTipoMermaEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomermaempresaAux,tipomermaempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipomermaempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomermaempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomermaempresaLogic.saveTipoMermaEmpresas();//WithConnection
						//tipomermaempresaLogic.getSetVersionRowTipoMermaEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomermaempresa,tipomermaempresaAux);
					
					this.refrescarForeignKeysDescripcionesTipoMermaEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomermaempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomermaempresaLogic.saveTipoMermaEmpresaRelaciones(tipomermaempresaAux);//WithConnection
								//tipomermaempresaLogic.getSetVersionRowTipoMermaEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipomermaempresa,tipomermaempresaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipomermaempresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipomermaempresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipomermaempresaAux,tipomermaempresaLogic.getTipoMermaEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipomermaempresaAux,tipomermaempresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipomermaempresa,tipomermaempresaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipomermaempresaAux=new  TipoMermaEmpresa();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipomermaempresaSessionBean.getEsGuardarRelacionado() && this.tipomermaempresa.getId()>=0)) {
						
					tipomermaempresaAux.setIsNew(false);
				}
				
				tipomermaempresaAux.setIsDeleted(false);
			
				tipomermaempresaAux.setId(this.tipomermaempresa.getId());	
				tipomermaempresaAux.setVersionRow(this.tipomermaempresa.getVersionRow());	
				tipomermaempresaAux.setid_empresa(this.tipomermaempresa.getid_empresa());	
				tipomermaempresaAux.setnombre(this.tipomermaempresa.getnombre());	
				tipomermaempresaAux.setdescripcion(this.tipomermaempresa.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomermaempresaAux,tipomermaempresaLogic.getTipoMermaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomermaempresaAux,tipomermaempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipomermaempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomermaempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomermaempresaLogic.saveTipoMermaEmpresas();//WithConnection
						//tipomermaempresaLogic.getSetVersionRowTipoMermaEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomermaempresa,tipomermaempresaAux);
					
					this.refrescarForeignKeysDescripcionesTipoMermaEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomermaempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomermaempresaLogic.saveTipoMermaEmpresaRelaciones(tipomermaempresaAux);//WithConnection
								//tipomermaempresaLogic.getSetVersionRowTipoMermaEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipomermaempresa,tipomermaempresaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipomermaempresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipomermaempresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipomermaempresaAux,tipomermaempresaLogic.getTipoMermaEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipomermaempresaAux,tipomermaempresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipomermaempresa,tipomermaempresaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipomermaempresaAux=new  TipoMermaEmpresa();
				
				tipomermaempresaAux.setIsNew(false);
				tipomermaempresaAux.setIsChanged(false);
				
				tipomermaempresaAux.setIsDeleted(true);
				
				tipomermaempresaAux.setId(this.tipomermaempresa.getId());	
				tipomermaempresaAux.setVersionRow(this.tipomermaempresa.getVersionRow());	
				tipomermaempresaAux.setid_empresa(this.tipomermaempresa.getid_empresa());	
				tipomermaempresaAux.setnombre(this.tipomermaempresa.getnombre());	
				tipomermaempresaAux.setdescripcion(this.tipomermaempresa.getdescripcion());	
				
				if(this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipomermaempresaAux.getId()>=0) {	
						this.tipomermaempresasEliminados.add(tipomermaempresaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipomermaempresaAux,tipomermaempresaLogic.getTipoMermaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomermaempresaAux,tipomermaempresas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipomermaempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomermaempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomermaempresaLogic.saveTipoMermaEmpresas();//WithConnection
						//tipomermaempresaLogic.getSetVersionRowTipoMermaEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomermaempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomermaempresaLogic.saveTipoMermaEmpresaRelaciones(tipomermaempresaAux);//WithConnection
								//tipomermaempresaLogic.getSetVersionRowTipoMermaEmpresas();//WithConnection
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
							if(this.tipomermaempresaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipomermaempresaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipomermaempresaAux,tipomermaempresaLogic.getTipoMermaEmpresas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipomermaempresaAux,tipomermaempresas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaLogic.getTipoMermaEmpresas().addAll(this.tipomermaempresasEliminados);
					
					tipomermaempresaLogic.saveTipoMermaEmpresas();//WithConnection
					//tipomermaempresaLogic.getSetVersionRowTipoMermaEmpresas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoMermaEmpresa();
				
				this.tipomermaempresasEliminados= new ArrayList<TipoMermaEmpresa>();		
			}
			
			if(this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Merma Empresa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Merma Empresa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipomermaempresa=tipomermaempresaAux;
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
      		//this.finishProcessTipoMermaEmpresa();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoMermaEmpresa tipomermaempresaLocal) throws Exception {
		
		if(this.tipomermaempresaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoMermaEmpresa tipomermaempresaLocal) throws Exception {	
		if(this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipomermaempresaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoMermaEmpresaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipomermaempresaValidator.getInvalidValues(this.tipomermaempresa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoMermaEmpresa tipomermaempresa,List<TipoMermaEmpresa> tipomermaempresas) throws Exception {
		try	{		
			TipoMermaEmpresaConstantesFunciones.actualizarLista(tipomermaempresa,tipomermaempresas,this.tipomermaempresaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoMermaEmpresa tipomermaempresa,List<TipoMermaEmpresa> tipomermaempresas) throws Exception {
		try	{			
			TipoMermaEmpresaConstantesFunciones.actualizarSelectedLista(tipomermaempresa,tipomermaempresas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoMermaEmpresa> tipomermaempresasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipomermaempresasLocal=this.tipomermaempresaLogic.getTipoMermaEmpresas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipomermaempresasLocal=this.tipomermaempresas;
			}
			//ARCHITECTURE
		
			for(TipoMermaEmpresa tipomermaempresaLocal:tipomermaempresasLocal) {
				if(this.permiteMantenimiento(tipomermaempresaLocal) && tipomermaempresaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoMermaEmpresaConstantesFunciones.getTipoMermaEmpresaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoMermaEmpresaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabelid_empresaTipoMermaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMermaEmpresaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabelnombreTipoMermaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMermaEmpresaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabeldescripcionTipoMermaEmpresa,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabelid_empresaTipoMermaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabelnombreTipoMermaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabeldescripcionTipoMermaEmpresa,"");
		
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
		this.iIdNuevoTipoMermaEmpresa--;	
		
		
		this.tipomermaempresaAux=new TipoMermaEmpresa();
		
		this.tipomermaempresaAux.setId(this.iIdNuevoTipoMermaEmpresa);
		this.tipomermaempresaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomermaempresaLogic.getTipoMermaEmpresas().add(this.tipomermaempresaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipomermaempresas.add(this.tipomermaempresaAux);
		}
		//ARCHITECTURE
		
		this.tipomermaempresa=this.tipomermaempresaAux;
		
		if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoMermaEmpresa(this.tipomermaempresa);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMermaEmpresa(this.tipomermaempresa);
		}
				
		//this.setDefaultControlesTipoMermaEmpresa();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoMermaEmpresa();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoMermaEmpresa();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMermaEmpresa();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMermaEmpresa(this.tipomermaempresaBean,this.tipomermaempresa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(this.tipomermaempresa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipomermaempresaSessionBean.getConGuardarRelaciones()) {
			classes=TipoMermaEmpresaConstantesFunciones.getClassesRelationshipsOfTipoMermaEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipomermaempresaReturnGeneral=tipomermaempresaLogic.procesarEventosTipoMermaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomermaempresaLogic.getTipoMermaEmpresas(),this.tipomermaempresa,this.tipomermaempresaParameterGeneral,this.isEsNuevoTipoMermaEmpresa,classes);//this.tipomermaempresaLogic.getTipoMermaEmpresa()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoMermaEmpresa(this.tipomermaempresaReturnGeneral,this.tipomermaempresaBean,false);
		
		if(this.tipomermaempresaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMermaEmpresa(this.tipomermaempresaReturnGeneral.getTipoMermaEmpresa());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoMermaEmpresa(this.tipomermaempresaReturnGeneral.getTipoMermaEmpresa());
		}
		
		if(this.tipomermaempresaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoMermaEmpresa(this.tipomermaempresaReturnGeneral.getTipoMermaEmpresa(),classes);//this.tipomermaempresaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoMermaEmpresa(this.tipomermaempresa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoMermaEmpresa();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoMermaEmpresa();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.RecargarFormTipoMermaEmpresa(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoMermaEmpresa(false);
						
			if(tipomermaempresaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMermaEmpresa();
			}
			
			this.actualizarVisualTableDatosTipoMermaEmpresa();
			
			this.jTableDatosTipoMermaEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoMermaEmpresa(), this.getIndiceNuevoTipoMermaEmpresa());
			
			this.seleccionarFilaTablaTipoMermaEmpresaActual();
						
			this.actualizarEstadoCeldasBotonesTipoMermaEmpresa("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoMermaEmpresa(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jTextAreanombreTipoMermaEmpresa.setEnabled(isHabilitar && this.tipomermaempresaConstantesFunciones.activarnombreTipoMermaEmpresa);
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jTextAreadescripcionTipoMermaEmpresa.setEnabled(isHabilitar && this.tipomermaempresaConstantesFunciones.activardescripcionTipoMermaEmpresa);	
		//
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxid_empresaTipoMermaEmpresa.setEnabled(isHabilitar && this.tipomermaempresaConstantesFunciones.activarid_empresaTipoMermaEmpresa);
	};
	
	public void setDefaultControlesTipoMermaEmpresa() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoMermaEmpresa(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipomermaempresaSessionBean.setConGuardarRelaciones(true);			
			this.tipomermaempresaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jTabbedPaneRelacionesTipoMermaEmpresa.setVisible(true);
			
					
		} else {
			//this.tipomermaempresaSessionBean.setConGuardarRelaciones(false);			
			this.tipomermaempresaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jTabbedPaneRelacionesTipoMermaEmpresa.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoMermaEmpresa() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMermaEmpresa tipomermaempresaAux:this.tipomermaempresaLogic.getTipoMermaEmpresas()) {
				if(tipomermaempresaAux.getId().equals(this.iIdNuevoTipoMermaEmpresa)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMermaEmpresa tipomermaempresaAux:this.tipomermaempresas) {
				if(tipomermaempresaAux.getId().equals(this.iIdNuevoTipoMermaEmpresa)) {
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
	
	public int getIndiceActualTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMermaEmpresa tipomermaempresaAux:this.tipomermaempresaLogic.getTipoMermaEmpresas()) {
				if(tipomermaempresaAux.getId().equals(tipomermaempresa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMermaEmpresa tipomermaempresaAux:this.tipomermaempresas) {
				if(tipomermaempresaAux.getId().equals(tipomermaempresa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMermaEmpresa tipomermaempresaAux:this.tipomermaempresaLogic.getTipoMermaEmpresas()) {
				if(tipomermaempresaAux.getTipoMermaEmpresaOriginal().getId().equals(tipomermaempresaOriginal.getId())) {
					existe=true;
					tipomermaempresaOriginal.setId(tipomermaempresaAux.getId());
					tipomermaempresaOriginal.setVersionRow(tipomermaempresaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMermaEmpresa tipomermaempresaAux:this.tipomermaempresas) {
				if(tipomermaempresaAux.getTipoMermaEmpresaOriginal().getId().equals(tipomermaempresaOriginal.getId())) {
					existe=true;
					tipomermaempresaOriginal.setId(tipomermaempresaAux.getId());
					tipomermaempresaOriginal.setVersionRow(tipomermaempresaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoMermaEmpresa(Boolean esParaCancelar) throws Exception {
		tipomermaempresasAux=new ArrayList<TipoMermaEmpresa>();
		tipomermaempresaAux=new TipoMermaEmpresa();
		
		if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMermaEmpresa tipomermaempresaAux:this.tipomermaempresaLogic.getTipoMermaEmpresas()) {
					if(tipomermaempresaAux.getId()<0) {
						tipomermaempresasAux.add(tipomermaempresaAux);
					}		
				}
				this.iIdNuevoTipoMermaEmpresa=0L;
				this.tipomermaempresaLogic.getTipoMermaEmpresas().removeAll(tipomermaempresasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMermaEmpresa tipomermaempresaAux:this.tipomermaempresas) {
					if(tipomermaempresaAux.getId()<0) {
						tipomermaempresasAux.add(tipomermaempresaAux);
					}		
				}
				this.iIdNuevoTipoMermaEmpresa=0L;
				this.tipomermaempresas.removeAll(tipomermaempresasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoMermaEmpresa 
					&& this.tipomermaempresaLogic.getTipoMermaEmpresas().size()>0
					) {
					tipomermaempresaAux=this.tipomermaempresaLogic.getTipoMermaEmpresas().get(this.tipomermaempresaLogic.getTipoMermaEmpresas().size() - 1);
				
					if(tipomermaempresaAux.getId()<0) {
						this.tipomermaempresaLogic.getTipoMermaEmpresas().remove(tipomermaempresaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoMermaEmpresa && this.tipomermaempresas.size()>0) {
					tipomermaempresaAux=this.tipomermaempresas.get(this.tipomermaempresas.size() - 1);
				
					if(tipomermaempresaAux.getId()<0) {
						this.tipomermaempresas.remove(tipomermaempresaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoMermaEmpresa(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipomermaempresa.getId()<0) {
				this.tipomermaempresaLogic.getTipoMermaEmpresas().remove(this.tipomermaempresa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipomermaempresa.getId()<0) {
				this.tipomermaempresas.remove(this.tipomermaempresa);
			}
		}			
	}
	
	public void setEstadosInicialesTipoMermaEmpresa(List<TipoMermaEmpresa> tipomermaempresasAux) throws Exception {
		TipoMermaEmpresaConstantesFunciones.setEstadosInicialesTipoMermaEmpresa(tipomermaempresasAux);
	}
	
	public void setEstadosInicialesTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresaAux) throws Exception {
		TipoMermaEmpresaConstantesFunciones.setEstadosInicialesTipoMermaEmpresa(tipomermaempresaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoMermaEmpresaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoMermaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoMermaEmpresaActual()) {
				if(!this.isEsNuevoTipoMermaEmpresa) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoMermaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoMermaEmpresa=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoMermaEmpresaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Merma Empresa ?", "MANTENIMIENTO DE Tipo Merma Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoMermaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoMermaEmpresa tipomermaempresa) throws Exception {
		TipoMermaEmpresaConstantesFunciones.seleccionarAsignar(this.tipomermaempresa,tipomermaempresa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoMermaEmpresa=this.isPermisoActualizarOriginalTipoMermaEmpresa;
			
			
			this.seleccionarAsignar(tipomermaempresa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoMermaEmpresaConstantesFunciones.quitarEspaciosTipoMermaEmpresa(this.tipomermaempresa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoMermaEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipomermaempresaSessionBean.setsFuncionBusquedaRapida(this.tipomermaempresaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoMermaEmpresa) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoMermaEmpresa(esParaCancelar);				
				this.cancelarNuevoTipoMermaEmpresa(esParaCancelar);								
			}
			
			this.tipomermaempresa=new TipoMermaEmpresa();
			
			this.inicializarTipoMermaEmpresa();
			
			this.actualizarEstadoCeldasBotonesTipoMermaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoMermaEmpresa() throws Exception {
		try {
			TipoMermaEmpresaConstantesFunciones.inicializarTipoMermaEmpresa(this.tipomermaempresa);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipomermaempresaLogic.getTipoMermaEmpresas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoMermaEmpresas(String sAccionBusqueda,List<TipoMermaEmpresa> tipomermaempresasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoMermaEmpresa"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoMermaEmpresaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoMermaEmpresaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoMermaEmpresa"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Merma Empresas");		
		parameters.put("busquedapor", TipoMermaEmpresaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoMermaEmpresa=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoMermaEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoMermaEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoMermaEmpresa=new JRBeanArrayDataSource(TipoMermaEmpresaJInternalFrame.TraerTipoMermaEmpresaBeans(tipomermaempresasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoMermaEmpresa);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoMermaEmpresaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoMermaEmpresaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoMermaEmpresaBean.TraerTipoMermaEmpresaBeans(tipomermaempresasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoMermaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomermaempresasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoMermaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomermaempresasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoMermaEmpresaActionPerformed(null);
					//this.generarExcelReporteTipoMermaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomermaempresasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoMermaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomermaempresasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoMermaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomermaempresasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoMermaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomermaempresasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoMermaEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMermaEmpresa> tipomermaempresasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomermaempresa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMermaEmpresas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMermaEmpresa("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoMermaEmpresa tipomermaempresa : tipomermaempresasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoMermaEmpresaConstantesFunciones.generarExcelReporteDataTipoMermaEmpresa("NORMAL",row,workbook,tipomermaempresa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Merma Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoMermaEmpresa(String sTipo,Row row,Workbook workbook) {
		
		TipoMermaEmpresaConstantesFunciones.generarExcelReporteHeaderTipoMermaEmpresa(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoMermaEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMermaEmpresa> tipomermaempresasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomermaempresa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMermaEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoMermaEmpresa tipomermaempresa : tipomermaempresasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoMermaEmpresaConstantesFunciones.getTipoMermaEmpresaDescripcion(tipomermaempresa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMermaEmpresaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMermaEmpresaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomermaempresa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomermaempresa.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomermaempresa.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Merma Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoMermaEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMermaEmpresa> tipomermaempresasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoMermaEmpresa> tipomermaempresasRespaldo=null;
		
		classes=TipoMermaEmpresaConstantesFunciones.getClassesRelationshipsOfTipoMermaEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipomermaempresaLogic.setDatosCliente(this.datosCliente);
		this.tipomermaempresaLogic.setDatosDeep(this.datosDeep);
		this.tipomermaempresaLogic.setIsConDeep(true);
		
		tipomermaempresasRespaldo=this.tipomermaempresaLogic.getTipoMermaEmpresas();
		
		this.tipomermaempresaLogic.setTipoMermaEmpresas(tipomermaempresasParaReportes);	
		this.tipomermaempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipomermaempresasParaReportes=this.tipomermaempresaLogic.getTipoMermaEmpresas();
		this.tipomermaempresaLogic.setTipoMermaEmpresas(tipomermaempresasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomermaempresa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMermaEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMermaEmpresa("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoMermaEmpresa tipomermaempresa : tipomermaempresasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoMermaEmpresa("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoMermaEmpresaConstantesFunciones.generarExcelReporteDataTipoMermaEmpresa("NORMAL",row,workbook,tipomermaempresa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoMermaEmpresaConstantesFunciones.getTipoMermaEmpresaDescripcion(tipomermaempresa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Merma Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoMermaEmpresa() throws Exception {		
		this.startProcessTipoMermaEmpresa(true);
	}
	
	public void startProcessTipoMermaEmpresa(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoMermaEmpresa ,this.jPanelParametrosReportesTipoMermaEmpresa, this.jScrollPanelDatosTipoMermaEmpresa,this.jPanelPaginacionTipoMermaEmpresa, this.jScrollPanelDatosEdicionTipoMermaEmpresa, this.jPanelAccionesTipoMermaEmpresa,this.jPanelAccionesFormularioTipoMermaEmpresa,this.jmenuBarTipoMermaEmpresa,this.jmenuBarDetalleTipoMermaEmpresa,this.jTtoolBarTipoMermaEmpresa,this.jTtoolBarDetalleTipoMermaEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMermaEmpresa=this.jTabbedPaneBusquedasTipoMermaEmpresa; 
		
		final JPanel jPanelParametrosReportesTipoMermaEmpresa=this.jPanelParametrosReportesTipoMermaEmpresa;
		//final JScrollPane jScrollPanelDatosTipoMermaEmpresa=this.jScrollPanelDatosTipoMermaEmpresa;
		final JTable jTableDatosTipoMermaEmpresa=this.jTableDatosTipoMermaEmpresa;		
		final JPanel jPanelPaginacionTipoMermaEmpresa=this.jPanelPaginacionTipoMermaEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoMermaEmpresa=this.jScrollPanelDatosEdicionTipoMermaEmpresa;
		final JPanel jPanelAccionesTipoMermaEmpresa=this.jPanelAccionesTipoMermaEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoMermaEmpresa=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoMermaEmpresa=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
			jPanelCamposAuxiliarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jPanelCamposTipoMermaEmpresa;
			jPanelAccionesFormularioAuxiliarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jPanelAccionesFormularioTipoMermaEmpresa;
		}
		
		final JPanel jPanelCamposTipoMermaEmpresa=jPanelCamposAuxiliarTipoMermaEmpresa;
		final JPanel jPanelAccionesFormularioTipoMermaEmpresa=jPanelAccionesFormularioAuxiliarTipoMermaEmpresa;
		
		
		final JMenuBar jmenuBarTipoMermaEmpresa=this.jmenuBarTipoMermaEmpresa;
		final JToolBar jTtoolBarTipoMermaEmpresa=this.jTtoolBarTipoMermaEmpresa;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoMermaEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMermaEmpresa=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jmenuBarDetalleTipoMermaEmpresa;
			jTtoolBarDetalleAuxiliarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jTtoolBarDetalleTipoMermaEmpresa;
		}
		
		final JMenuBar jmenuBarDetalleTipoMermaEmpresa=jmenuBarDetalleAuxiliarTipoMermaEmpresa;
		final JToolBar jTtoolBarDetalleTipoMermaEmpresa=jTtoolBarDetalleAuxiliarTipoMermaEmpresa;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMermaEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMermaEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoMermaEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoMermaEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMermaEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMermaEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMermaEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMermaEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMermaEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoMermaEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMermaEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoMermaEmpresa ,jPanelParametrosReportesTipoMermaEmpresa,jTableDatosTipoMermaEmpresa, /*jScrollPanelDatosTipoMermaEmpresa,*/jPanelCamposTipoMermaEmpresa,jPanelPaginacionTipoMermaEmpresa, /*jScrollPanelDatosEdicionTipoMermaEmpresa,*/ jPanelAccionesTipoMermaEmpresa,jPanelAccionesFormularioTipoMermaEmpresa,jmenuBarTipoMermaEmpresa,jmenuBarDetalleTipoMermaEmpresa,jTtoolBarTipoMermaEmpresa,jTtoolBarDetalleTipoMermaEmpresa);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoMermaEmpresa ,jPanelParametrosReportesTipoMermaEmpresa, jScrollPanelDatosTipoMermaEmpresa,jPanelPaginacionTipoMermaEmpresa, jScrollPanelDatosEdicionTipoMermaEmpresa, jPanelAccionesTipoMermaEmpresa,jPanelAccionesFormularioTipoMermaEmpresa,jmenuBarTipoMermaEmpresa,jmenuBarDetalleTipoMermaEmpresa,jTtoolBarTipoMermaEmpresa,jTtoolBarDetalleTipoMermaEmpresa);
						
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
	
	public void finishProcessTipoMermaEmpresa() {// throws Exception 
		this.finishProcessTipoMermaEmpresa(true);
	}
	
	public void finishProcessTipoMermaEmpresa(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoMermaEmpresa ,this.jPanelParametrosReportesTipoMermaEmpresa, this.jScrollPanelDatosTipoMermaEmpresa,this.jPanelPaginacionTipoMermaEmpresa, this.jScrollPanelDatosEdicionTipoMermaEmpresa, this.jPanelAccionesTipoMermaEmpresa,this.jPanelAccionesFormularioTipoMermaEmpresa,this.jmenuBarTipoMermaEmpresa,this.jmenuBarDetalleTipoMermaEmpresa,this.jTtoolBarTipoMermaEmpresa,this.jTtoolBarDetalleTipoMermaEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMermaEmpresa=this.jTabbedPaneBusquedasTipoMermaEmpresa; 
		
		final JPanel jPanelParametrosReportesTipoMermaEmpresa=this.jPanelParametrosReportesTipoMermaEmpresa;
		//final JScrollPane jScrollPanelDatosTipoMermaEmpresa=this.jScrollPanelDatosTipoMermaEmpresa;
		final JTable jTableDatosTipoMermaEmpresa=this.jTableDatosTipoMermaEmpresa;		
		final JPanel jPanelPaginacionTipoMermaEmpresa=this.jPanelPaginacionTipoMermaEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoMermaEmpresa=this.jScrollPanelDatosEdicionTipoMermaEmpresa;
		final JPanel jPanelAccionesTipoMermaEmpresa=this.jPanelAccionesTipoMermaEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoMermaEmpresa=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoMermaEmpresa=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
			jPanelCamposAuxiliarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jPanelCamposTipoMermaEmpresa;
			jPanelAccionesFormularioAuxiliarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jPanelAccionesFormularioTipoMermaEmpresa;
		}
		
		final JPanel jPanelCamposTipoMermaEmpresa=jPanelCamposAuxiliarTipoMermaEmpresa;
		final JPanel jPanelAccionesFormularioTipoMermaEmpresa=jPanelAccionesFormularioAuxiliarTipoMermaEmpresa;
		
		
		final JMenuBar jmenuBarTipoMermaEmpresa=this.jmenuBarTipoMermaEmpresa;		
		final JToolBar jTtoolBarTipoMermaEmpresa=this.jTtoolBarTipoMermaEmpresa;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoMermaEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMermaEmpresa=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jmenuBarDetalleTipoMermaEmpresa;
			jTtoolBarDetalleAuxiliarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jTtoolBarDetalleTipoMermaEmpresa;		
		}
		
		final JMenuBar jmenuBarDetalleTipoMermaEmpresa=jmenuBarDetalleAuxiliarTipoMermaEmpresa;
		final JToolBar jTtoolBarDetalleTipoMermaEmpresa=jTtoolBarDetalleAuxiliarTipoMermaEmpresa;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMermaEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMermaEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoMermaEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoMermaEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMermaEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMermaEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMermaEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMermaEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMermaEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoMermaEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMermaEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoMermaEmpresa ,jPanelParametrosReportesTipoMermaEmpresa, jTableDatosTipoMermaEmpresa,/*jScrollPanelDatosTipoMermaEmpresa,*/jPanelCamposTipoMermaEmpresa,jPanelPaginacionTipoMermaEmpresa, /*jScrollPanelDatosEdicionTipoMermaEmpresa,*/ jPanelAccionesTipoMermaEmpresa,jPanelAccionesFormularioTipoMermaEmpresa,jmenuBarTipoMermaEmpresa,jmenuBarDetalleTipoMermaEmpresa,jTtoolBarTipoMermaEmpresa,jTtoolBarDetalleTipoMermaEmpresa));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoMermaEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoMermaEmpresa(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoMermaEmpresa(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoMermaEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoMermaEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoMermaEmpresa,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoMermaEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoMermaEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoMermaEmpresa,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipomermaempresaConstantesFunciones.getsFinalQueryTipoMermaEmpresa();
		String  finalQueryPaginacionTodos=this.tipomermaempresaConstantesFunciones.getsFinalQueryTipoMermaEmpresa();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoMermaEmpresaConstantesFunciones.getArrayColumnasGlobalesNoTipoMermaEmpresa(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoMermaEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoMermaEmpresa(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoMermaEmpresaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipomermaempresasEliminados= new ArrayList<TipoMermaEmpresa>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoMermaEmpresa();
		
				///*TipoMermaEmpresaSessionBean*/this.tipomermaempresaSessionBean=new TipoMermaEmpresaSessionBean();
			
			if(this.tipomermaempresaSessionBean==null) {
				this.tipomermaempresaSessionBean=new TipoMermaEmpresaSessionBean();
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
					this.iNumeroPaginacion=TipoMermaEmpresaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoMermaEmpresaConstantesFunciones.getClassesForeignKeysOfTipoMermaEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipomermaempresa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipomermaempresasAux= new ArrayList<TipoMermaEmpresa>();
			
				
			tipomermaempresaLogic.setDatosCliente(this.datosCliente);
			tipomermaempresaLogic.setDatosDeep(this.datosDeep);
			tipomermaempresaLogic.setIsConDeep(true);
			
			
			tipomermaempresaLogic.getTipoMermaEmpresaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipomermaempresaLogic.getTodosTipoMermaEmpresas(finalQueryGlobal,pagination);
					
					//tipomermaempresaLogic.getTodosTipoMermaEmpresasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipomermaempresaLogic.getTipoMermaEmpresas()==null|| tipomermaempresaLogic.getTipoMermaEmpresas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomermaempresasAux= new ArrayList<TipoMermaEmpresa>();
							tipomermaempresasAux.addAll(tipomermaempresaLogic.getTipoMermaEmpresas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomermaempresasAux= new ArrayList<TipoMermaEmpresa>();
							tipomermaempresasAux.addAll(tipomermaempresas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomermaempresaLogic.getTodosTipoMermaEmpresas(finalQueryGlobal+"",this.pagination);												
							
							//tipomermaempresaLogic.getTodosTipoMermaEmpresasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoMermaEmpresas("Todos",tipomermaempresaLogic.getTipoMermaEmpresas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomermaempresaLogic.setTipoMermaEmpresas(new ArrayList<TipoMermaEmpresa>());					
							tipomermaempresaLogic.getTipoMermaEmpresas().addAll(tipomermaempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomermaempresas=new ArrayList<TipoMermaEmpresa>();
							tipomermaempresas.addAll(tipomermaempresasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoMermaEmpresa=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoMermaEmpresa=this.idActual;
				
				} else if(this.idTipoMermaEmpresaActual!=null && this.idTipoMermaEmpresaActual!=0L) {
					idTipoMermaEmpresa=idTipoMermaEmpresaActual;
				}
				
					
				this.sDetalleReporte=TipoMermaEmpresaConstantesFunciones.getDetalleIndicePorId(idTipoMermaEmpresa);
				
				this.tipomermaempresas=new ArrayList<TipoMermaEmpresa>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipomermaempresaLogic.getEntity(idTipoMermaEmpresa);
					
					//tipomermaempresaLogic.getEntityWithConnection(idTipoMermaEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomermaempresaLogic.setTipoMermaEmpresas(new ArrayList<TipoMermaEmpresa>());
					tipomermaempresaLogic.getTipoMermaEmpresas().add(tipomermaempresaLogic.getTipoMermaEmpresa());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomermaempresas=new ArrayList<TipoMermaEmpresa>();
					this.tipomermaempresas.add(tipomermaempresa);
				}
				
				if(tipomermaempresaLogic.getTipoMermaEmpresa()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoMermaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipomermaempresaLogic.getTipoMermaEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMermaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMermaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipomermaempresaLogic.getTipoMermaEmpresas()==null||tipomermaempresaLogic.getTipoMermaEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipomermaempresas==null|| tipomermaempresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomermaempresasAux=new ArrayList<TipoMermaEmpresa>();
						tipomermaempresasAux.addAll(tipomermaempresaLogic.getTipoMermaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomermaempresasAux=new ArrayList<TipoMermaEmpresa>();
							tipomermaempresasAux.addAll(tipomermaempresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipomermaempresaLogic.getTipoMermaEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMermaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMermaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoMermaEmpresas("FK_IdEmpresa",tipomermaempresaLogic.getTipoMermaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoMermaEmpresas("FK_IdEmpresa",tipomermaempresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomermaempresaLogic.setTipoMermaEmpresas(new ArrayList<TipoMermaEmpresa>());
						tipomermaempresaLogic.getTipoMermaEmpresas().addAll(tipomermaempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomermaempresas=new ArrayList<TipoMermaEmpresa>();
							tipomermaempresas.addAll(tipomermaempresasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoMermaEmpresa();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoMermaEmpresa();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomermaempresaLogic.getTipoMermaEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomermaempresas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomermaempresaLogic.getTipoMermaEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomermaempresas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoMermaEmpresa tipomermaempresa) {
		Boolean permite=true;
		
		if(this.tipomermaempresa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoMermaEmpresaConstantesFunciones.getOrderByListaTipoMermaEmpresa();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoMermaEmpresaConstantesFunciones.getOrderByListaTipoMermaEmpresa();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMermaEmpresa tipomermaempresa:tipomermaempresaLogic.getTipoMermaEmpresas()) {
				if(tipomermaempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipomermaempresaTotales=tipomermaempresa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMermaEmpresa tipomermaempresa:this.tipomermaempresas) {
				if(tipomermaempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipomermaempresaTotales=tipomermaempresa;
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
			this.tipomermaempresaAux=new TipoMermaEmpresa();
			this.tipomermaempresaAux.setsType(Constantes2.S_TOTALES);
			this.tipomermaempresaAux.setIsNew(false);
			this.tipomermaempresaAux.setIsChanged(false);
			this.tipomermaempresaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoMermaEmpresaConstantesFunciones.TotalizarValoresFilaTipoMermaEmpresa(this.tipomermaempresaLogic.getTipoMermaEmpresas(),this.tipomermaempresaAux);
				
				this.tipomermaempresaLogic.getTipoMermaEmpresas().add(this.tipomermaempresaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoMermaEmpresaConstantesFunciones.TotalizarValoresFilaTipoMermaEmpresa(this.tipomermaempresas,this.tipomermaempresaAux);
				
				this.tipomermaempresas.add(this.tipomermaempresaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipomermaempresaTotales=new TipoMermaEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomermaempresaLogic.getTipoMermaEmpresas().remove(tipomermaempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomermaempresas.remove(tipomermaempresaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipomermaempresaTotales=new TipoMermaEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMermaEmpresa tipomermaempresa:tipomermaempresaLogic.getTipoMermaEmpresas()) {
				if(tipomermaempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipomermaempresaTotales=tipomermaempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMermaEmpresaConstantesFunciones.TotalizarValoresFilaTipoMermaEmpresa(this.tipomermaempresaLogic.getTipoMermaEmpresas(),tipomermaempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMermaEmpresa tipomermaempresa:this.tipomermaempresas) {
				if(tipomermaempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipomermaempresaTotales=tipomermaempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMermaEmpresaConstantesFunciones.TotalizarValoresFilaTipoMermaEmpresa(this.tipomermaempresas,tipomermaempresaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoMermaEmpresasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoMermaEmpresasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomermaempresaLogic.getTipoMermaEmpresasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoMermaEmpresa() {
		this.isPermisoTodoTipoMermaEmpresa=false;
		this.isPermisoNuevoTipoMermaEmpresa=false;
		this.isPermisoActualizarTipoMermaEmpresa=false;
		this.isPermisoActualizarOriginalTipoMermaEmpresa=false;
		this.isPermisoEliminarTipoMermaEmpresa=false;
		this.isPermisoGuardarCambiosTipoMermaEmpresa=false;
		this.isPermisoConsultaTipoMermaEmpresa=false;
		this.isPermisoBusquedaTipoMermaEmpresa=false;
		this.isPermisoReporteTipoMermaEmpresa=false;		
		this.isPermisoOrdenTipoMermaEmpresa=false;		
		this.isPermisoPaginacionMedioTipoMermaEmpresa=false;		
		this.isPermisoPaginacionAltoTipoMermaEmpresa=false;
		this.isPermisoPaginacionTodoTipoMermaEmpresa=false;
		this.isPermisoCopiarTipoMermaEmpresa=false;		
		this.isPermisoVerFormTipoMermaEmpresa=false;		
		this.isPermisoDuplicarTipoMermaEmpresa=false;		
		this.isPermisoOrdenTipoMermaEmpresa=false;		
	}
	
	public void setPermisosUsuarioTipoMermaEmpresa(Boolean isPermiso) {
		this.isPermisoTodoTipoMermaEmpresa=isPermiso;
		this.isPermisoNuevoTipoMermaEmpresa=isPermiso;
		this.isPermisoActualizarTipoMermaEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoMermaEmpresa=isPermiso;
		this.isPermisoEliminarTipoMermaEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoMermaEmpresa=isPermiso;
		this.isPermisoConsultaTipoMermaEmpresa=isPermiso;
		this.isPermisoBusquedaTipoMermaEmpresa=isPermiso;
		this.isPermisoReporteTipoMermaEmpresa=isPermiso;
		this.isPermisoOrdenTipoMermaEmpresa=isPermiso;		
		this.isPermisoPaginacionMedioTipoMermaEmpresa=isPermiso;		
		this.isPermisoPaginacionAltoTipoMermaEmpresa=isPermiso;		
		this.isPermisoPaginacionTodoTipoMermaEmpresa=isPermiso;		
		this.isPermisoCopiarTipoMermaEmpresa=isPermiso;		
		this.isPermisoVerFormTipoMermaEmpresa=isPermiso;		
		this.isPermisoDuplicarTipoMermaEmpresa=isPermiso;
		this.isPermisoOrdenTipoMermaEmpresa=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoMermaEmpresa(Boolean isPermiso) {
		//this.isPermisoTodoTipoMermaEmpresa=isPermiso;
		this.isPermisoNuevoTipoMermaEmpresa=isPermiso;
		this.isPermisoActualizarTipoMermaEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoMermaEmpresa=isPermiso;
		this.isPermisoEliminarTipoMermaEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoMermaEmpresa=isPermiso;
		//this.isPermisoConsultaTipoMermaEmpresa=isPermiso;
		//this.isPermisoBusquedaTipoMermaEmpresa=isPermiso;
		//this.isPermisoReporteTipoMermaEmpresa=isPermiso;
		//this.isPermisoOrdenTipoMermaEmpresa=isPermiso;		
		//this.isPermisoPaginacionMedioTipoMermaEmpresa=isPermiso;		
		//this.isPermisoPaginacionAltoTipoMermaEmpresa=isPermiso;		
		//this.isPermisoPaginacionTodoTipoMermaEmpresa=isPermiso;		
		//this.isPermisoCopiarTipoMermaEmpresa=isPermiso;		
		//this.isPermisoDuplicarTipoMermaEmpresa=isPermiso;
		//this.isPermisoOrdenTipoMermaEmpresa=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoMermaEmpresaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoMermaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoMermaEmpresa(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoMermaEmpresaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoMermaEmpresaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoMermaEmpresaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoMermaEmpresaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoMermaEmpresa() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoMermaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoMermaEmpresaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoMermaEmpresa=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoMermaEmpresa=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoMermaEmpresa=this.isPermisoActualizarTipoMermaEmpresa;
			this.isPermisoEliminarTipoMermaEmpresa=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoMermaEmpresa=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoMermaEmpresa=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoMermaEmpresa=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoMermaEmpresa=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoMermaEmpresa=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMermaEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoMermaEmpresa=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoMermaEmpresa=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoMermaEmpresa=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoMermaEmpresa=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoMermaEmpresa=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoMermaEmpresa=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMermaEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoMermaEmpresa.setToolTipText(this.jTableDatosTipoMermaEmpresa.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoMermaEmpresa(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoMermaEmpresa(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoMermaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoMermaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoMermaEmpresa() throws Exception {
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
	public void inicializarCombosForeignKeyTipoMermaEmpresaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoMermaEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoMermaEmpresaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoMermaEmpresaListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoMermaEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoMermaEmpresaParameterReturnGeneral tipomermaempresaReturnGeneral=new TipoMermaEmpresaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipomermaempresaConstantesFunciones.cargarid_empresaTipoMermaEmpresa)
					 || (this.esRecargarFks && this.tipomermaempresaConstantesFunciones.cargarid_empresaTipoMermaEmpresa)) {

					if(!this.tipomermaempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipomermaempresaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipomermaempresaReturnGeneral=tipomermaempresaLogic.cargarCombosLoteForeignKeyTipoMermaEmpresa(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipomermaempresaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoMermaEmpresa()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipomermaempresaSessionBean==null) {
				this.tipomermaempresaSessionBean=new TipoMermaEmpresaSessionBean();
			}

			if(!this.tipomermaempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoMermaEmpresa()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoMermaEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoMermaEmpresa()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMermaEmpresa();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresa)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoMermaEmpresa()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMermaEmpresa()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoMermaEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoMermaEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoMermaEmpresa()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoMermaEmpresa()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoMermaEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoMermaEmpresa()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxid_empresaTipoMermaEmpresa!=null && this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxid_empresaTipoMermaEmpresa.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxid_empresaTipoMermaEmpresa.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoMermaEmpresaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoMermaEmpresaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoMermaEmpresaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipomermaempresaSessionBean=new TipoMermaEmpresaSessionBean(); 
		this.tipomermaempresaConstantesFunciones=new TipoMermaEmpresaConstantesFunciones(); 
		this.tipomermaempresaBean=new TipoMermaEmpresa();//(this.tipomermaempresaConstantesFunciones); 		
		this.tipomermaempresaReturnGeneral=new TipoMermaEmpresaParameterReturnGeneral(); 
		
		this.tipomermaempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomermaempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoMermaEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoMermaEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoMermaEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoMermaEmpresa(true);
			
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
			
			this.tipomermaempresaConstantesFunciones=new TipoMermaEmpresaConstantesFunciones(); 
			this.tipomermaempresaBean=new TipoMermaEmpresa();//this.tipomermaempresaConstantesFunciones); 			
			this.tipomermaempresaReturnGeneral=new TipoMermaEmpresaParameterReturnGeneral(); 
		
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Merma Empresa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipomermaempresa=new TipoMermaEmpresa();
			this.tipomermaempresas = new ArrayList<TipoMermaEmpresa>();
			this.tipomermaempresasAux = new ArrayList<TipoMermaEmpresa>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic=new TipoMermaEmpresaLogic();
				this.tipomermaempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipomermaempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipomermaempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoMermaEmpresa);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoMermaEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMermaEmpresa);	
					}
					
					if(this.jInternalFrameImportacionTipoMermaEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMermaEmpresa);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoMermaEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoMermaEmpresa);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMermaEmpresa);
				this.jInternalFrameDetalleFormTipoMermaEmpresa.setVisible(false);
				this.jInternalFrameDetalleFormTipoMermaEmpresa.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoMermaEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMermaEmpresa);
					this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoMermaEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoMermaEmpresa);
					this.jInternalFrameImportacionTipoMermaEmpresa.setVisible(false);
					this.jInternalFrameImportacionTipoMermaEmpresa.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoMermaEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoMermaEmpresa);
					this.jInternalFrameOrderByTipoMermaEmpresa.setVisible(false);
					this.jInternalFrameOrderByTipoMermaEmpresa.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoMermaEmpresaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoMermaEmpresaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipomermaempresaReturnGeneral=new TipoMermaEmpresaParameterReturnGeneral();
			
			this.tipomermaempresaParameterGeneral=new TipoMermaEmpresaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipomermaempresaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoMermaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMermaEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomermaempresaSessionBean.getEsGuardarRelacionado(),this.tipomermaempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMermaEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomermaempresaSessionBean.getEsGuardarRelacionado(),this.tipomermaempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoMermaEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoMermaEmpresa=true;
			this.isVisibilidadCeldaCopiarTipoMermaEmpresa=true;
			this.isVisibilidadCeldaVerFormTipoMermaEmpresa=true;
			this.isVisibilidadCeldaOrdenTipoMermaEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa=false;
			this.isVisibilidadCeldaModificarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaGuardarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoMermaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoMermaEmpresa();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoMermaEmpresa(false);
			
			this.setPermisosUsuarioTipoMermaEmpresa();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipomermaempresaSessionBean.getEsGuardarRelacionado() && this.tipomermaempresaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoMermaEmpresaClasesRelacionadas();
			}
			
			if(this.tipomermaempresaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoMermaEmpresaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoMermaEmpresa();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoMermaEmpresa();
			}
			
			if(!this.isPermisoBusquedaTipoMermaEmpresa) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoMermaEmpresa.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoMermaEmpresa,this.isPermisoPaginacionMedioTipoMermaEmpresa,this.isPermisoPaginacionTodoTipoMermaEmpresa);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoMermaEmpresaConstantesFunciones.getTiposSeleccionarTipoMermaEmpresa());
				
				this.tiposColumnasSelect=TipoMermaEmpresaConstantesFunciones.getTiposSeleccionarTipoMermaEmpresa(true);
				
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
			//if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoMermaEmpresa();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoMermaEmpresa(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoMermaEmpresa(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMermaEmpresa() ;
			
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
				tipomermaempresaImplementable= (TipoMermaEmpresaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMermaEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipomermaempresaImplementableHome= (TipoMermaEmpresaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMermaEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipomermaempresas= new ArrayList<TipoMermaEmpresa>();
			this.tipomermaempresasEliminados= new ArrayList<TipoMermaEmpresa>();
						
			this.isEsNuevoTipoMermaEmpresa=false;
			this.esParaAccionDesdeFormularioTipoMermaEmpresa=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoMermaEmpresa(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoMermaEmpresa();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoMermaEmpresaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoMermaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoMermaEmpresa(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoMermaEmpresa();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoMermaEmpresa();
			}
			
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoMermaEmpresa.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoMermaEmpresa.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoMermaEmpresa.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoMermaEmpresa(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoMermaEmpresa: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoMermaEmpresa() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoMermaEmpresa")) {
				iIndex=this.jInternalFrameDetalleFormTipoMermaEmpresa.jTabbedPaneRelacionesTipoMermaEmpresa.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoMermaEmpresa.jTabbedPaneRelacionesTipoMermaEmpresa.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoMermaEmpresa();	
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
	
	public void cargarCombosForeignKeyTipoMermaEmpresa(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoMermaEmpresa(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoMermaEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoMermaEmpresaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoMermaEmpresa();
		
		this.cargarCombosFrameForeignKeyTipoMermaEmpresa();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoMermaEmpresa();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoMermaEmpresa();
		}
	}
	
	
	
	public void jButtonNuevoTipoMermaEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipomermaempresaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
			
			
			if(jTableDatosTipoMermaEmpresa.getRowCount()>=1) {
				jTableDatosTipoMermaEmpresa.removeRowSelectionInterval(0, jTableDatosTipoMermaEmpresa.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoMermaEmpresa=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoMermaEmpresa(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoMermaEmpresa(true);			
			//this.tipomermaempresa=new TipoMermaEmpresa();
			//this.tipomermaempresa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMermaEmpresa(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMermaEmpresa() ;
			
			if(TipoMermaEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMermaEmpresa(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipomermaempresa);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipomermaempresa);				
			
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
			
			if(this.tipomermaempresaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoMermaEmpresa: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoMermaEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoMermaEmpresa> tipomermaempresasSeleccionados=new ArrayList<TipoMermaEmpresa>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoMermaEmpresa.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoMermaEmpresa.getSelectedRows().length;			
			}
			
			tipomermaempresasSeleccionados=this.getTipoMermaEmpresasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoMermaEmpresa--;			
				//TipoMermaEmpresa tipomermaempresaAux= new TipoMermaEmpresa();			
				//tipomermaempresaAux.setId(this.iIdNuevoTipoMermaEmpresa);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoMermaEmpresa tipomermaempresaOrigen=new TipoMermaEmpresa();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoMermaEmpresa tipomermaempresaOrigen : tipomermaempresasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipomermaempresaOrigen =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomermaempresaOrigen =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoMermaEmpresa();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipomermaempresa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoMermaEmpresa(tipomermaempresaOrigen,this.tipomermaempresa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(this.tipomermaempresa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomermaempresaLogic.getTipoMermaEmpresas().add(this.tipomermaempresaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomermaempresas.add(this.tipomermaempresaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoMermaEmpresa(false);
				
				this.jTableDatosTipoMermaEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoMermaEmpresa(), this.getIndiceNuevoTipoMermaEmpresa());
				
				int iLastRow =  this.jTableDatosTipoMermaEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMermaEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMermaEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMermaEmpresa(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoMermaEmpresa> tipomermaempresasSeleccionados=new ArrayList<TipoMermaEmpresa>();									
		
			TipoMermaEmpresa tipomermaempresaOrigen=new TipoMermaEmpresa();
			TipoMermaEmpresa tipomermaempresaDestino=new TipoMermaEmpresa();
				
			tipomermaempresasSeleccionados=this.getTipoMermaEmpresasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoMermaEmpresa.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipomermaempresasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoMermaEmpresa.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomermaempresaOrigen =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomermaempresaOrigen =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomermaempresaDestino =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomermaempresaDestino =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipomermaempresaOrigen =tipomermaempresasSeleccionados.get(0);
				tipomermaempresaDestino =tipomermaempresasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoMermaEmpresa(tipomermaempresaOrigen,tipomermaempresaDestino,true,false);
				
				tipomermaempresaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomermaempresaDestino,tipomermaempresaLogic.getTipoMermaEmpresas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomermaempresaDestino,tipomermaempresas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoMermaEmpresa(false);
				
				//this.jTableDatosTipoMermaEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoMermaEmpresa(), this.getIndiceNuevoTipoMermaEmpresa());
				
				int iLastRow =  this.jTableDatosTipoMermaEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMermaEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMermaEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMermaEmpresa(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoMermaEmpresa.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoMermaEmpresa.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoMermaEmpresa.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoMermaEmpresa.setVisible(!isVisible);
			this.jPanelPaginacionTipoMermaEmpresa.setVisible(!isVisible);
			this.jPanelAccionesTipoMermaEmpresa.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoMermaEmpresa();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoMermaEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoMermaEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoMermaEmpresa();
			
			this.abrirFrameOrderByTipoMermaEmpresa();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoMermaEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoMermaEmpresa(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMermaEmpresa);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoMermaEmpresa.isMaximum()) {
					this.jInternalFrameDetalleFormTipoMermaEmpresa.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoMermaEmpresa.setSize(this.jInternalFrameDetalleFormTipoMermaEmpresa.iWidthFormulario,this.jInternalFrameDetalleFormTipoMermaEmpresa.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoMermaEmpresa.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoMermaEmpresa.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoMermaEmpresa.isMaximum()) {
						this.jInternalFrameDetalleFormTipoMermaEmpresa.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoMermaEmpresa.jContentPaneDetalleTipoMermaEmpresa.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoMermaEmpresa.jTabbedPaneRelacionesTipoMermaEmpresa.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoMermaEmpresa.jContentPaneDetalleTipoMermaEmpresa.getWidth(),TipoMermaEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMermaEmpresa.jTabbedPaneRelacionesTipoMermaEmpresa.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoMermaEmpresa.jContentPaneDetalleTipoMermaEmpresa.getWidth(),TipoMermaEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMermaEmpresa.jTabbedPaneRelacionesTipoMermaEmpresa.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoMermaEmpresa.jContentPaneDetalleTipoMermaEmpresa.getWidth(),TipoMermaEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoMermaEmpresa.setVisible(true);
	        this.jInternalFrameDetalleFormTipoMermaEmpresa.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoMermaEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoMermaEmpresa==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoMermaEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMermaEmpresa,false,this);
				} else {
					this.jInternalFrameOrderByTipoMermaEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMermaEmpresa,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoMermaEmpresa);
				this.jInternalFrameOrderByTipoMermaEmpresa.setVisible(false);
				this.jInternalFrameOrderByTipoMermaEmpresa.setSelected(false);
				
				this.jInternalFrameOrderByTipoMermaEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMermaEmpresa"));
				
				this.inicializarActualizarBindingTablaOrderByTipoMermaEmpresa();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoMermaEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoMermaEmpresa==null) {
				
				this.jInternalFrameImportacionTipoMermaEmpresa=new ImportacionJInternalFrame(TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMermaEmpresa);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoMermaEmpresa);
				this.jInternalFrameImportacionTipoMermaEmpresa.setVisible(false);
				this.jInternalFrameImportacionTipoMermaEmpresa.setSelected(false);


				this.jInternalFrameImportacionTipoMermaEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMermaEmpresa"));
				this.jInternalFrameImportacionTipoMermaEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMermaEmpresa"));
				this.jInternalFrameImportacionTipoMermaEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMermaEmpresa"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoMermaEmpresa() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoMermaEmpresa==null) {
				this.jInternalFrameReporteDinamicoTipoMermaEmpresa=new ReporteDinamicoJInternalFrame(TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMermaEmpresa);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMermaEmpresa);
				this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMermaEmpresa"));
				this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMermaEmpresa"));
				this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMermaEmpresa"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMermaEmpresa();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoMermaEmpresa() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMermaEmpresa);
			
	       	this.jInternalFrameDetalleFormTipoMermaEmpresa.setVisible(false);
	        this.jInternalFrameDetalleFormTipoMermaEmpresa.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoMermaEmpresa.dispose();
			//this.jInternalFrameDetalleFormTipoMermaEmpresa=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoMermaEmpresa() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoMermaEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoMermaEmpresa.setVisible(true);
	        this.jInternalFrameImportacionTipoMermaEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoMermaEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoMermaEmpresa.setVisible(true);
	        this.jInternalFrameOrderByTipoMermaEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoMermaEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoMermaEmpresa.setVisible(false);
	        this.jInternalFrameOrderByTipoMermaEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoMermaEmpresa() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoMermaEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoMermaEmpresa.setVisible(false);
	        this.jInternalFrameImportacionTipoMermaEmpresa.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoMermaEmpresa(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoMermaEmpresa(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoMermaEmpresa(true);
			//this.isEsNuevoTipoMermaEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoMermaEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMermaEmpresa(false) ;
			
			if(tipomermaempresaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoMermaEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMermaEmpresa(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMermaEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoMermaEmpresaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoMermaEmpresa(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoMermaEmpresa(true);
			//this.isEsNuevoTipoMermaEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipomermaempresa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoMermaEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoMermaEmpresa(false) ;
			
			if(TipoMermaEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMermaEmpresa(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMermaEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoMermaEmpresa(false);
			
			//if(!this.isEsNuevoTipoMermaEmpresa) {								
				int intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoMermaEmpresa(this.tipomermaempresa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(this.tipomermaempresa);
				
			}
			
			if(this.permiteMantenimiento(this.tipomermaempresa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoMermaEmpresa=true;
					this.inicializarActualizarBindingTablaTipoMermaEmpresa(false);
					this.isEsNuevoTipoMermaEmpresa=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoMermaEmpresa=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoMermaEmpresa=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMermaEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMermaEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoMermaEmpresa(false);
			
												
				
				if(TipoMermaEmpresaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoMermaEmpresa();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoMermaEmpresaActionPerformed(evt,tipomermaempresaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoMermaEmpresa(this.tipomermaempresa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoMermaEmpresa.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipomermaempresaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipomermaempresa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoMermaEmpresa.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMermaEmpresa.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipomermaempresa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipomermaempresa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipomermaempresa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoMermaEmpresaModel) this.jTableDatosTipoMermaEmpresa.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoMermaEmpresa=true;
				this.inicializarActualizarBindingTablaTipoMermaEmpresa(false);
				this.isEsNuevoTipoMermaEmpresa=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMermaEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMermaEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoMermaEmpresa(false);
				
				
				
				if(TipoMermaEmpresaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoMermaEmpresa();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoMermaEmpresa.getRowCount()>=1) {
				jTableDatosTipoMermaEmpresa.removeRowSelectionInterval(0, jTableDatosTipoMermaEmpresa.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoMermaEmpresa(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoMermaEmpresa(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMermaEmpresa(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMermaEmpresa(false) ;
			
			this.isEsNuevoTipoMermaEmpresa=false;
			
			if(TipoMermaEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoMermaEmpresa();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoMermaEmpresa(false);
				
				//SI ES MANUAL
				if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoMermaEmpresa();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoMermaEmpresa--;			
			//TipoMermaEmpresa tipomermaempresaAux= new TipoMermaEmpresa();			
			//tipomermaempresaAux.setId(this.iIdNuevoTipoMermaEmpresa);
			
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoMermaEmpresa();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(this.tipomermaempresa);
			
			this.tipomermaempresa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipomermaempresaLogic.getTipoMermaEmpresas().add(this.tipomermaempresaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipomermaempresas.add(this.tipomermaempresaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoMermaEmpresa(false);
			
			this.jTableDatosTipoMermaEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoMermaEmpresa(), this.getIndiceNuevoTipoMermaEmpresa());
			
			int iLastRow =  this.jTableDatosTipoMermaEmpresa.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoMermaEmpresa.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoMermaEmpresa.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoMermaEmpresa(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoMermaEmpresa(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMermaEmpresa(false);
			
			//SI ES MANUAL
			if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMermaEmpresa();
			}
			
			//this.abrirFrameTreeTipoMermaEmpresa();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Merma EmpresaS ?", "MANTENIMIENTO DE Tipo Merma Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoMermaEmpresa.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoMermaEmpresa();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipomermaempresaReturnGeneral=tipomermaempresaLogic.procesarImportacionTipoMermaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipomermaempresaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoMermaEmpresaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoMermaEmpresa.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoMermaEmpresa.setFileImportacion(this.jInternalFrameImportacionTipoMermaEmpresa.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoMermaEmpresa.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoMermaEmpresa.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoMermaEmpresa.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoMermaEmpresa.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoMermaEmpresa> tipomermaempresasSeleccionados=new ArrayList<TipoMermaEmpresa>();		

		tipomermaempresasSeleccionados=this.getTipoMermaEmpresasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoMermaEmpresaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoMermaEmpresaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoMermaEmpresas("Todos",tipomermaempresasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Merma Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMermaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoMermaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoMermaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMermaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoMermaEmpresa> tipomermaempresasSeleccionados=new ArrayList<TipoMermaEmpresa>();		
		
		tipomermaempresasSeleccionados=this.getTipoMermaEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomermaempresa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoMermaEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoMermaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMermaEmpresaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoMermaEmpresa tipomermaempresa:tipomermaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomermaempresa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoMermaEmpresa tipomermaempresa:tipomermaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomermaempresa.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoMermaEmpresa tipomermaempresa:tipomermaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomermaempresa.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoMermaEmpresa(row);				
			//	iRow++;
			//}				
			
			//for(TipoMermaEmpresa tipomermaempresaAux:tipomermaempresasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoMermaEmpresa(tipomermaempresaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Merma Empresa",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipomermaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMermaEmpresa(false);
			
			//SI ES MANUAL
			if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMermaEmpresa();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMermaEmpresa(false);
			
			//SI ES MANUAL
			if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMermaEmpresa();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMermaEmpresa(false);
			
			//SI ES MANUAL
			if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMermaEmpresa();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoMermaEmpresa() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoMermaEmpresa.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoMermaEmpresa.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoMermaEmpresa.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoMermaEmpresa.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoMermaEmpresa.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoMermaEmpresa.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoMermaEmpresa.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoMermaEmpresa(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoMermaEmpresa(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoMermaEmpresa(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoMermaEmpresa(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoMermaEmpresa(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoMermaEmpresa(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMermaEmpresa(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoMermaEmpresa(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoMermaEmpresa() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoMermaEmpresa();
		
		this.inicializarActualizarBindingBotonesManualTipoMermaEmpresa(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMermaEmpresa();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMermaEmpresa() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMermaEmpresa(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMermaEmpresa(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoMermaEmpresa.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoMermaEmpresa.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoMermaEmpresa.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoMermaEmpresa.jCheckBoxPostAccionNuevoTipoMermaEmpresa.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoMermaEmpresa.jCheckBoxPostAccionSinCerrarTipoMermaEmpresa.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoMermaEmpresa.jCheckBoxPostAccionSinMensajeTipoMermaEmpresa.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoMermaEmpresa.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoMermaEmpresa.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoMermaEmpresa.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
				this.jInternalFrameDetalleFormTipoMermaEmpresa.jCheckBoxPostAccionNuevoTipoMermaEmpresa.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoMermaEmpresa.jCheckBoxPostAccionSinCerrarTipoMermaEmpresa.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoMermaEmpresa.jCheckBoxPostAccionSinMensajeTipoMermaEmpresa.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoMermaEmpresa.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoMermaEmpresa.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoMermaEmpresa.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoMermaEmpresa!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoMermaEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoMermaEmpresa.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoMermaEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoMermaEmpresa.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoMermaEmpresa!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoMermaEmpresa.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoMermaEmpresa.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoMermaEmpresa(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMermaEmpresa(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoMermaEmpresa() throws Exception {
		try	{
			if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMermaEmpresa();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMermaEmpresa() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMermaEmpresa() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoMermaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoMermaEmpresa.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoMermaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoMermaEmpresa.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoMermaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoMermaEmpresa.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoMermaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoMermaEmpresa.addItem(reporte);
			}
			
			
			if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoMermaEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoMermaEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoMermaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoMermaEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoMermaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoMermaEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoMermaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoMermaEmpresa.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoMermaEmpresa.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMermaEmpresa();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMermaEmpresa() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMermaEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMermaEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoMermaEmpresa!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoMermaEmpresa()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoMermaEmpresa(Boolean esInicializar) throws Exception {				
		if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMermaEmpresa();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoMermaEmpresa() throws Exception {
		this.inicializarActualizarBindingTablaTipoMermaEmpresa(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoMermaEmpresa() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoMermaEmpresa.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoMermaEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMermaEmpresa.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoMermaEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoMermaEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMermaEmpresa.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoMermaEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoMermaEmpresaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMermaEmpresaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoMermaEmpresaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoMermaEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMermaEmpresa.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoMermaEmpresaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoMermaEmpresa.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoMermaEmpresa(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipomermaempresaLogic.getTipoMermaEmpresas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipomermaempresas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoMermaEmpresa.setModel(new TipoMermaEmpresaModel(this.tipomermaempresaLogic.getTipoMermaEmpresas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoMermaEmpresa.setModel(new TipoMermaEmpresaModel(this.tipomermaempresas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoMermaEmpresa!=null && this.jInternalFrameOrderByTipoMermaEmpresa.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoMermaEmpresa();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoMermaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMermaEmpresa,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoMermaEmpresaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO,tipomermaempresaConstantesFunciones.resaltarSeleccionarTipoMermaEmpresa,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO,tipomermaempresaConstantesFunciones.resaltarSeleccionarTipoMermaEmpresa,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoMermaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMermaEmpresa,TipoMermaEmpresaConstantesFunciones.LABEL_ID));

		if(this.tipomermaempresaConstantesFunciones.mostraridTipoMermaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMermaEmpresaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipomermaempresaConstantesFunciones.resaltaridTipoMermaEmpresa,this.tipomermaempresaConstantesFunciones.activaridTipoMermaEmpresa,this,true,"idTipoMermaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomermaempresaConstantesFunciones.resaltaridTipoMermaEmpresa,this.tipomermaempresaConstantesFunciones.activaridTipoMermaEmpresa,this,true,"idTipoMermaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMermaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMermaEmpresa,TipoMermaEmpresaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipomermaempresaConstantesFunciones.mostrarid_empresaTipoMermaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMermaEmpresaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipomermaempresaConstantesFunciones.resaltarid_empresaTipoMermaEmpresa,this,this.tipomermaempresaConstantesFunciones.activarid_empresaTipoMermaEmpresa));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipomermaempresaConstantesFunciones.resaltarid_empresaTipoMermaEmpresa,this,this.tipomermaempresaConstantesFunciones.activarid_empresaTipoMermaEmpresa,false,"id_empresaTipoMermaEmpresa","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMermaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMermaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMermaEmpresa,TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipomermaempresaConstantesFunciones.mostrarnombreTipoMermaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomermaempresaConstantesFunciones.resaltarnombreTipoMermaEmpresa,this.tipomermaempresaConstantesFunciones.activarnombreTipoMermaEmpresa,this,true,"nombreTipoMermaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomermaempresaConstantesFunciones.resaltarnombreTipoMermaEmpresa,this.tipomermaempresaConstantesFunciones.activarnombreTipoMermaEmpresa,this,true,"nombreTipoMermaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMermaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMermaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMermaEmpresa,TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipomermaempresaConstantesFunciones.mostrardescripcionTipoMermaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomermaempresaConstantesFunciones.resaltardescripcionTipoMermaEmpresa,this.tipomermaempresaConstantesFunciones.activardescripcionTipoMermaEmpresa,this,true,"descripcionTipoMermaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomermaempresaConstantesFunciones.resaltardescripcionTipoMermaEmpresa,this.tipomermaempresaConstantesFunciones.activardescripcionTipoMermaEmpresa,this,true,"descripcionTipoMermaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMermaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomermaempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomermaempresaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMermaEmpresa.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomermaempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomermaempresaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMermaEmpresa.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoMermaEmpresa && this.isPermisoGuardarCambiosTipoMermaEmpresa) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipomermaempresaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipomermaempresaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoMermaEmpresa.addColumn(tableColumn);
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
			
			this.jTableDatosTipoMermaEmpresa.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMermaEmpresa && this.isPermisoGuardarCambiosTipoMermaEmpresa) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMermaEmpresa && this.isPermisoGuardarCambiosTipoMermaEmpresa) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoMermaEmpresa.moveColumn(this.jTableDatosTipoMermaEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoMermaEmpresa.moveColumn(this.jTableDatosTipoMermaEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoMermaEmpresa.moveColumn(this.jTableDatosTipoMermaEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoMermaEmpresa.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoMermaEmpresa.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoMermaEmpresa,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoMermaEmpresa.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoMermaEmpresa.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoMermaEmpresa.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoMermaEmpresa.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoMermaEmpresa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipomermaempresaLogic.getTipoMermaEmpresas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipomermaempresas.size()-1;
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
		//this.jTableDatosTipoMermaEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoMermaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoMermaEmpresa();
			
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
				
				//this.isEsNuevoTipoMermaEmpresa=false;
					
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
			
				if(this.tipomermaempresaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoMermaEmpresa==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMermaEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMermaEmpresa.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipomermaempresa.getsType().equals("DUPLICADO")
				   || this.tipomermaempresa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoMermaEmpresa=true;
				
				} else {
					this.isEsNuevoTipoMermaEmpresa=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipomermaempresa.getId()>=0 && !this.tipomermaempresa.getIsNew()) {						
						this.isEsNuevoTipoMermaEmpresa=false;
						
					} else {
						this.isEsNuevoTipoMermaEmpresa=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoMermaEmpresa(esRelaciones);						
				
				this.seleccionarTipoMermaEmpresa(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipomermaempresa.getId()<0) {
					this.isEsNuevoTipoMermaEmpresa=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoMermaEmpresa(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoMermaEmpresa(evt,rowIndex);
				}	
				
				if(this.tipomermaempresaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoMermaEmpresa: " + this.dDif); 
					}
				}								
				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoMermaEmpresa(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipomermaempresa)) {
					if(this.tipomermaempresa.getId()>0) {
						this.tipomermaempresa.setIsDeleted(true);
						
						this.tipomermaempresasEliminados.add(this.tipomermaempresa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomermaempresaLogic.getTipoMermaEmpresas().remove(this.tipomermaempresa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomermaempresas.remove(this.tipomermaempresa);				
					}
					
					
					((TipoMermaEmpresaModel) this.jTableDatosTipoMermaEmpresa.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMermaEmpresa(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoMermaEmpresa(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoMermaEmpresa) {
			
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMermaEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMermaEmpresa.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoMermaEmpresa(this.tipomermaempresa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipomermaempresaConstantesFunciones.cargarid_empresaTipoMermaEmpresa || this.tipomermaempresaConstantesFunciones.event_dependid_empresaTipoMermaEmpresa) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipomermaempresa.getid_empresa());
									//this.inicializarActualizarBindingTipoMermaEmpresa(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipomermaempresa.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipomermaempresa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipomermaempresa.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoMermaEmpresa("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoMermaEmpresa(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMermaEmpresa() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoMermaEmpresa(tipomermaempresa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoMermaEmpresa(tipomermaempresa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoMermaEmpresa(tipomermaempresa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoMermaEmpresa(tipomermaempresa);
	}
	
	public void setVariablesObjetoActualToFormularioTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabelidTipoMermaEmpresa.setText(tipomermaempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jTextAreanombreTipoMermaEmpresa.setText(tipomermaempresa.getnombre());
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jTextAreadescripcionTipoMermaEmpresa.setText(tipomermaempresa.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoMermaEmpresa tipomermaempresaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipomermaempresaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoMermaEmpresa tipomermaempresaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipomermaempresaLocal=this.tipomermaempresa;
			} else {
				tipomermaempresaLocal=this.tipomermaempresaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipomermaempresaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoMermaEmpresa(tipomermaempresaLocal,true);
					
					if(tipomermaempresaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipomermaempresaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipomermaempresaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMermaEmpresa(tipomermaempresa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(tipomermaempresa);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMermaEmpresa(tipomermaempresa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabelidTipoMermaEmpresa.getText()==null || this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabelidTipoMermaEmpresa.getText()=="" || this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabelidTipoMermaEmpresa.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabelidTipoMermaEmpresa.setText("0");
			}

			if(conColumnasBase) {tipomermaempresa.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabelidTipoMermaEmpresa.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMermaEmpresaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabelIdTipoMermaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomermaempresa.setnombre(this.jInternalFrameDetalleFormTipoMermaEmpresa.jTextAreanombreTipoMermaEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabelnombreTipoMermaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomermaempresa.setdescripcion(this.jInternalFrameDetalleFormTipoMermaEmpresa.jTextAreadescripcionTipoMermaEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabeldescripcionTipoMermaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresaBean,TipoMermaEmpresa tipomermaempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresaOrigen,TipoMermaEmpresa tipomermaempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomermaempresaOrigen.getId()!=null && !tipomermaempresaOrigen.getId().equals(0L))) {tipomermaempresa.setId(tipomermaempresaOrigen.getId());}}
			if(conDefault || (!conDefault && tipomermaempresaOrigen.getnombre()!=null && !tipomermaempresaOrigen.getnombre().equals(""))) {tipomermaempresa.setnombre(tipomermaempresaOrigen.getnombre());}
			if(conDefault || (!conDefault && tipomermaempresaOrigen.getdescripcion()!=null && !tipomermaempresaOrigen.getdescripcion().equals(""))) {tipomermaempresa.setdescripcion(tipomermaempresaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabelidTipoMermaEmpresa.setText(tipomermaempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jTextAreanombreTipoMermaEmpresa.setText(tipomermaempresa.getnombre());
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jTextAreadescripcionTipoMermaEmpresa.setText(tipomermaempresa.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMermaEmpresa(TipoMermaEmpresaBean tipomermaempresaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabelidTipoMermaEmpresa.setText(tipomermaempresaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jTextAreanombreTipoMermaEmpresa.setText(tipomermaempresaBean.getnombre());
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jTextAreadescripcionTipoMermaEmpresa.setText(tipomermaempresaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoMermaEmpresa(TipoMermaEmpresaParameterReturnGeneral tipomermaempresaReturnGeneral,TipoMermaEmpresaBean tipomermaempresaBean,Boolean conDefault) throws Exception { 
		try {
			TipoMermaEmpresa tipomermaempresaLocal=new TipoMermaEmpresa();
			
			tipomermaempresaLocal=tipomermaempresaReturnGeneral.getTipoMermaEmpresa();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomermaempresaLocal.getId()!=null && !tipomermaempresaLocal.getId().equals(0L))) {tipomermaempresaBean.setId(tipomermaempresaLocal.getId());}}
			if(conDefault || (!conDefault && tipomermaempresaLocal.getnombre()!=null && !tipomermaempresaLocal.getnombre().equals(""))) {tipomermaempresaBean.setnombre(tipomermaempresaLocal.getnombre());}
			if(conDefault || (!conDefault && tipomermaempresaLocal.getdescripcion()!=null && !tipomermaempresaLocal.getdescripcion().equals(""))) {tipomermaempresaBean.setdescripcion(tipomermaempresaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoMermaEmpresaGenerico(Long idTipoMermaEmpresaSeleccionado,JComboBox jComboBoxTipoMermaEmpresa,List<TipoMermaEmpresa> tipomermaempresasLocal)throws Exception {
		try {
			TipoMermaEmpresa  tipomermaempresaTemp=null;

			for(TipoMermaEmpresa tipomermaempresaAux:tipomermaempresasLocal) {
				if(tipomermaempresaAux.getId()!=null && tipomermaempresaAux.getId().equals(idTipoMermaEmpresaSeleccionado)) {
					tipomermaempresaTemp=tipomermaempresaAux;
					break;
				}
			}

			jComboBoxTipoMermaEmpresa.setSelectedItem(tipomermaempresaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoMermaEmpresaGenerico(JComboBox jComboBoxTipoMermaEmpresa,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoMermaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMermaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoMermaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMermaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMermaEmpresa.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoMermaEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMermaEmpresa.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoMermaEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoMermaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoMermaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomermaempresa=(TipoMermaEmpresa) tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomermaempresa =(TipoMermaEmpresa) tipomermaempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipomermaempresa.getIsNew() && !tipomermaempresa.getIsChanged() && !tipomermaempresa.getIsDeleted()) {
				sDescripcion=tipomermaempresa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipomermaempresa.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoMermaEmpresa tipomermaempresaRow=new TipoMermaEmpresa();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomermaempresaRow=(TipoMermaEmpresa) tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomermaempresaRow=(TipoMermaEmpresa) tipomermaempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoMermaEmpresa(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoMermaEmpresa && this.isPermisoNuevoTipoMermaEmpresa));			
			this.jButtonDuplicarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoMermaEmpresa && this.isPermisoDuplicarTipoMermaEmpresa));			
			this.jButtonCopiarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoMermaEmpresa && this.isPermisoCopiarTipoMermaEmpresa));
			this.jButtonVerFormTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoMermaEmpresa && this.isPermisoVerFormTipoMermaEmpresa));
			
			this.jButtonAbrirOrderByTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoMermaEmpresa && this.isPermisoOrdenTipoMermaEmpresa));			
			
			this.jButtonNuevoRelacionesTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa && this.isPermisoNuevoTipoMermaEmpresa));			
			this.jButtonNuevoGuardarCambiosTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoMermaEmpresa && this.isPermisoNuevoTipoMermaEmpresa && this.isPermisoGuardarCambiosTipoMermaEmpresa));
			
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonModificarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoMermaEmpresa && this.isPermisoActualizarTipoMermaEmpresa));	
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonActualizarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoMermaEmpresa && this.isPermisoActualizarTipoMermaEmpresa));	
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonEliminarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoMermaEmpresa && this.isPermisoEliminarTipoMermaEmpresa));
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonCancelarTipoMermaEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoMermaEmpresa);							
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonGuardarCambiosTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoMermaEmpresa && this.isPermisoGuardarCambiosTipoMermaEmpresa));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa && this.isPermisoGuardarCambiosTipoMermaEmpresa));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoMermaEmpresa && this.isPermisoNuevoTipoMermaEmpresa));						
			this.jButtonDuplicarToolBarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoMermaEmpresa && this.isPermisoDuplicarTipoMermaEmpresa));						
			this.jButtonCopiarToolBarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoMermaEmpresa && this.isPermisoCopiarTipoMermaEmpresa));			
			this.jButtonVerFormToolBarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoMermaEmpresa && this.isPermisoVerFormTipoMermaEmpresa));			
			this.jButtonAbrirOrderByToolBarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoMermaEmpresa && this.isPermisoOrdenTipoMermaEmpresa));
			this.jButtonNuevoRelacionesToolBarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa && this.isPermisoNuevoTipoMermaEmpresa));			
			this.jButtonNuevoGuardarCambiosToolBarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoMermaEmpresa && this.isPermisoNuevoTipoMermaEmpresa && this.isPermisoGuardarCambiosTipoMermaEmpresa));			
			
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonModificarToolBarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoMermaEmpresa && this.isPermisoActualizarTipoMermaEmpresa));	
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonActualizarToolBarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoMermaEmpresa  && this.isPermisoActualizarTipoMermaEmpresa));	
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonEliminarToolBarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoMermaEmpresa && this.isPermisoEliminarTipoMermaEmpresa));
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonCancelarToolBarTipoMermaEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoMermaEmpresa);				
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonGuardarCambiosToolBarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoMermaEmpresa && this.isPermisoGuardarCambiosTipoMermaEmpresa));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa && this.isPermisoGuardarCambiosTipoMermaEmpresa));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoMermaEmpresa && this.isPermisoNuevoTipoMermaEmpresa));			
			this.jMenuItemDuplicarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoMermaEmpresa && this.isPermisoDuplicarTipoMermaEmpresa));			
			this.jMenuItemCopiarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoMermaEmpresa && this.isPermisoCopiarTipoMermaEmpresa));			
			this.jMenuItemVerFormTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoMermaEmpresa && this.isPermisoVerFormTipoMermaEmpresa));			
			this.jMenuItemAbrirOrderByTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoMermaEmpresa && this.isPermisoOrdenTipoMermaEmpresa));			
			//this.jMenuItemMostrarOcultarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoMermaEmpresa && this.isPermisoOrdenTipoMermaEmpresa));
			this.jMenuItemDetalleAbrirOrderByTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoMermaEmpresa && this.isPermisoOrdenTipoMermaEmpresa));			
			//this.jMenuItemDetalleMostrarOcultarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoMermaEmpresa && this.isPermisoOrdenTipoMermaEmpresa));			
			this.jMenuItemNuevoRelacionesTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa && this.isPermisoNuevoTipoMermaEmpresa));			
			this.jMenuItemNuevoGuardarCambiosTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoMermaEmpresa && this.isPermisoNuevoTipoMermaEmpresa && this.isPermisoGuardarCambiosTipoMermaEmpresa));									
			
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemModificarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoMermaEmpresa && this.isPermisoActualizarTipoMermaEmpresa));	
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemActualizarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoMermaEmpresa && this.isPermisoActualizarTipoMermaEmpresa));	
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemEliminarTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoMermaEmpresa && this.isPermisoEliminarTipoMermaEmpresa));
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemCancelarTipoMermaEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoMermaEmpresa);				
			}
			
			this.jMenuItemGuardarCambiosTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoMermaEmpresa && this.isPermisoGuardarCambiosTipoMermaEmpresa));						
			this.jMenuItemGuardarCambiosTablaTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa && this.isPermisoGuardarCambiosTipoMermaEmpresa));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoMermaEmpresa=this.jButtonNuevoTipoMermaEmpresa.isVisible();
			this.isVisibilidadCeldaDuplicarTipoMermaEmpresa=this.jButtonDuplicarTipoMermaEmpresa.isVisible();
			this.isVisibilidadCeldaCopiarTipoMermaEmpresa=this.jButtonCopiarTipoMermaEmpresa.isVisible();
			this.isVisibilidadCeldaVerFormTipoMermaEmpresa=this.jButtonVerFormTipoMermaEmpresa.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoMermaEmpresa=this.jButtonAbrirOrderByTipoMermaEmpresa.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa=this.jButtonNuevoRelacionesTipoMermaEmpresa.isVisible();
			this.isVisibilidadCeldaModificarTipoMermaEmpresa=this.jButtonModificarTipoMermaEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
			this.isVisibilidadCeldaActualizarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonActualizarTipoMermaEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonEliminarTipoMermaEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonCancelarTipoMermaEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonGuardarCambiosTipoMermaEmpresa.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa=this.jButtonGuardarCambiosTablaTipoMermaEmpresa.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoMermaEmpresa=this.jButtonNuevoToolBarTipoMermaEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa=this.jButtonNuevoRelacionesToolBarTipoMermaEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonModificarToolBarTipoMermaEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonActualizarToolBarTipoMermaEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonEliminarToolBarTipoMermaEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonCancelarToolBarTipoMermaEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMermaEmpresa=this.jButtonGuardarCambiosToolBarTipoMermaEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa=this.jButtonGuardarCambiosTablaToolBarTipoMermaEmpresa.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoMermaEmpresa=this.jMenuItemNuevoTipoMermaEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa=this.jMenuItemNuevoRelacionesTipoMermaEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemModificarTipoMermaEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemActualizarTipoMermaEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemEliminarTipoMermaEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoMermaEmpresa=this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemCancelarTipoMermaEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMermaEmpresa=this.jMenuItemGuardarCambiosTipoMermaEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa=this.jMenuItemGuardarCambiosTablaTipoMermaEmpresa.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoMermaEmpresa(Boolean esInicializar) {
		if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipomermaempresaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMermaEmpresa();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoMermaEmpresa(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoMermaEmpresa() {
		this.jButtonNuevoTipoMermaEmpresa.setVisible(this.isPermisoNuevoTipoMermaEmpresa);			
		this.jButtonDuplicarTipoMermaEmpresa.setVisible(this.isPermisoDuplicarTipoMermaEmpresa);			
		this.jButtonCopiarTipoMermaEmpresa.setVisible(this.isPermisoCopiarTipoMermaEmpresa);			
		this.jButtonVerFormTipoMermaEmpresa.setVisible(this.isPermisoVerFormTipoMermaEmpresa);			
		
		this.jButtonAbrirOrderByTipoMermaEmpresa.setVisible(this.isPermisoOrdenTipoMermaEmpresa);					
		
		this.jButtonNuevoRelacionesTipoMermaEmpresa.setVisible(this.isPermisoNuevoTipoMermaEmpresa);			
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonModificarTipoMermaEmpresa.setVisible(this.isPermisoActualizarTipoMermaEmpresa);	
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonActualizarTipoMermaEmpresa.setVisible(this.isPermisoActualizarTipoMermaEmpresa);	
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonEliminarTipoMermaEmpresa.setVisible(this.isPermisoEliminarTipoMermaEmpresa);
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonCancelarTipoMermaEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoMermaEmpresa);						
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonGuardarCambiosTipoMermaEmpresa.setVisible(this.isPermisoGuardarCambiosTipoMermaEmpresa);							
		}
		
		this.jButtonGuardarCambiosTablaTipoMermaEmpresa.setVisible(this.isPermisoActualizarTipoMermaEmpresa);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMermaEmpresa() {
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonModificarTipoMermaEmpresa.setVisible(this.isPermisoActualizarTipoMermaEmpresa);	
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonActualizarTipoMermaEmpresa.setVisible(this.isPermisoActualizarTipoMermaEmpresa);	
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonEliminarTipoMermaEmpresa.setVisible(this.isPermisoEliminarTipoMermaEmpresa);
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonCancelarTipoMermaEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoMermaEmpresa);							
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonGuardarCambiosTipoMermaEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoMermaEmpresa && this.isPermisoGuardarCambiosTipoMermaEmpresa));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoMermaEmpresa() {
		if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoMermaEmpresa();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoMermaEmpresa() {
	}
	
	public void jTableDatosTipoMermaEmpresaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoMermaEmpresa(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoMermaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMermaEmpresa(this.gettipomermaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(this.tipomermaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomermaempresa==null) {
						this.tipomermaempresa = new TipoMermaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoMermaEmpresa(this.tipomermaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(this.tipomermaempresa);
				}

				if(this.tipomermaempresa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipomermaempresa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMermaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoMermaEmpresaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoMermaEmpresa(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoMermaEmpresa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoMermaEmpresa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoMermaEmpresa(this.gettipomermaempresa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(this.tipomermaempresa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipomermaempresaLogic.getConnexion());

				if(this.tipomermaempresa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipomermaempresa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoMermaEmpresa=(TitledBorder)this.jScrollPanelDatosTipoMermaEmpresa.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoMermaEmpresa.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoMermaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMermaEmpresa(this.gettipomermaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(this.tipomermaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomermaempresa==null) {
						this.tipomermaempresa = new TipoMermaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoMermaEmpresa(this.tipomermaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(this.tipomermaempresa);
				}

				if(this.tipomermaempresa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipomermaempresa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMermaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoMermaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMermaEmpresa(this.gettipomermaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(this.tipomermaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomermaempresa==null) {
						this.tipomermaempresa = new TipoMermaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoMermaEmpresa(this.tipomermaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(this.tipomermaempresa);
				}

				if(this.tipomermaempresa.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipomermaempresa.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMermaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoMermaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMermaEmpresa(this.gettipomermaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(this.tipomermaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomermaempresa==null) {
						this.tipomermaempresa = new TipoMermaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoMermaEmpresa(this.tipomermaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(this.tipomermaempresa);
				}

				if(this.tipomermaempresa.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipomermaempresa.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMermaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoMermaEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoMermaEmpresa(false,false);

			this.getTipoMermaEmpresasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoMermaEmpresa(false);

			//if(TipoMermaEmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoMermaEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoMermaEmpresa() {
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoMermaEmpresa.dispose();
			this.jInternalFrameDetalleFormTipoMermaEmpresa=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoMermaEmpresa!=null) {
			this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoMermaEmpresa.dispose();
			this.jInternalFrameReporteDinamicoTipoMermaEmpresa=null;
		}
		
		if(this.jInternalFrameImportacionTipoMermaEmpresa!=null) {
			this.jInternalFrameImportacionTipoMermaEmpresa.setVisible(false);	    			
			this.jInternalFrameImportacionTipoMermaEmpresa.dispose();
			this.jInternalFrameImportacionTipoMermaEmpresa=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoMermaEmpresa();
			
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoMermaEmpresa")) {
				jButtonNuevoTipoMermaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoMermaEmpresa")) {
				jButtonDuplicarTipoMermaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoMermaEmpresa")) {
				jButtonCopiarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoMermaEmpresa")) {
				jButtonVerFormTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoMermaEmpresa")) {
				jButtonNuevoTipoMermaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoMermaEmpresa")) {
				jButtonDuplicarTipoMermaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoMermaEmpresa")) {
				jButtonNuevoTipoMermaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoMermaEmpresa")) {
				jButtonDuplicarTipoMermaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoMermaEmpresa")) {
				jButtonNuevoTipoMermaEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoMermaEmpresa")) {
				jButtonNuevoTipoMermaEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoMermaEmpresa")) {
				jButtonNuevoTipoMermaEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoMermaEmpresa")) {
				jButtonModificarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoMermaEmpresa")) {
				jButtonModificarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoMermaEmpresa")) {
				jButtonModificarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoMermaEmpresa")) {
				jButtonActualizarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoMermaEmpresa")) {
				jButtonActualizarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoMermaEmpresa")) {
				jButtonActualizarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoMermaEmpresa")) {
				jButtonEliminarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoMermaEmpresa")) {
				jButtonEliminarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoMermaEmpresa")) {
				jButtonEliminarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoMermaEmpresa")) {
				jButtonCancelarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoMermaEmpresa")) {
				jButtonCancelarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoMermaEmpresa")) {
				jButtonCancelarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoMermaEmpresa")) {
				jButtonCerrarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoMermaEmpresa")) {
				jButtonCerrarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoMermaEmpresa")) {
				jButtonCerrarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoMermaEmpresa")) {
				jButtonMostrarOcultarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoMermaEmpresa")) {
				jButtonCancelarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoMermaEmpresa")) {
				jButtonGuardarCambiosTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoMermaEmpresa")) {
				jButtonGuardarCambiosTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoMermaEmpresa")) {
				jButtonCopiarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoMermaEmpresa")) {
				jButtonVerFormTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoMermaEmpresa")) {
				jButtonGuardarCambiosTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoMermaEmpresa")) {
				jButtonCopiarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoMermaEmpresa")) {
				jButtonVerFormTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoMermaEmpresa")) {
				jButtonGuardarCambiosTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoMermaEmpresa")) {
				jButtonGuardarCambiosTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoMermaEmpresa")) {
				jButtonGuardarCambiosTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoMermaEmpresa")) {
				jButtonRecargarInformacionTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoMermaEmpresa")) {
				jButtonRecargarInformacionTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoMermaEmpresa")) {
				jButtonRecargarInformacionTipoMermaEmpresaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoMermaEmpresa")) {
				jButtonAnterioresTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoMermaEmpresa")) {
				jButtonAnterioresTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoMermaEmpresa")) {
				jButtonAnterioresTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoMermaEmpresa")) {
				jButtonSiguientesTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoMermaEmpresa")) {
				jButtonSiguientesTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoMermaEmpresa")) {
				jButtonSiguientesTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoMermaEmpresa") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoMermaEmpresa")) {
				jButtonAbrirOrderByTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoMermaEmpresa") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoMermaEmpresa")) {
				jButtonMostrarOcultarTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMermaEmpresa")) {
				jButtonNuevoGuardarCambiosTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoMermaEmpresa")) {
				jButtonNuevoGuardarCambiosTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoMermaEmpresa")) {
				jButtonNuevoGuardarCambiosTipoMermaEmpresaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoMermaEmpresa")) {
				jButtonCerrarReporteDinamicoTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoMermaEmpresa")) {
				jButtonGenerarReporteDinamicoTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoMermaEmpresa")) {
				
				jButtonGenerarExcelReporteDinamicoTipoMermaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoMermaEmpresa")) {
				jButtonCerrarImportacionTipoMermaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoMermaEmpresa")) {
				
				jButtonGenerarImportacionTipoMermaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoMermaEmpresa")) {
				
				jButtonAbrirImportacionTipoMermaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoMermaEmpresa")) {
				jComboBoxTiposAccionesTipoMermaEmpresaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoMermaEmpresa")) {
				jComboBoxTiposRelacionesTipoMermaEmpresaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoMermaEmpresa")) {
				jComboBoxTiposAccionesTipoMermaEmpresaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoMermaEmpresa")) {
				
				jComboBoxTiposSeleccionarTipoMermaEmpresaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoMermaEmpresa")) {
				jTextFieldValorCampoGeneralTipoMermaEmpresaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoMermaEmpresa")) {
				jButtonAbrirOrderByTipoMermaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoMermaEmpresa")) {
				jButtonAbrirOrderByTipoMermaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoMermaEmpresa")) {
				jButtonCerrarOrderByTipoMermaEmpresaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMermaEmpresaBusqueda")) {
				this.jButtonidTipoMermaEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoMermaEmpresaUpdate")) {
				this.jButtonid_empresaTipoMermaEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoMermaEmpresaBusqueda")) {
				this.jButtonid_empresaTipoMermaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMermaEmpresaBusqueda")) {
				this.jButtonnombreTipoMermaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoMermaEmpresaBusqueda")) {
				this.jButtondescripcionTipoMermaEmpresaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoMermaEmpresa();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMermaEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomermaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomermaempresa);
				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
				
				


				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMermaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMermaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoMermaEmpresa tipomermaempresaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipomermaempresaLocal=this.tipomermaempresa;
			} else {
				tipomermaempresaLocal=this.tipomermaempresaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomermaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomermaempresa);
				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
							
				
				


				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMermaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMermaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMermaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaAnterior =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomermaempresaAnterior =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
			
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
			
			


			
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMermaEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomermaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomermaempresa);
				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
								
						
				


				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMermaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMermaEmpresa.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomermaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomermaempresa);
				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
								
				
				


				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMermaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMermaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMermaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaAnterior =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomermaempresaAnterior =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomermaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomermaempresa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMermaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaAnterior =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomermaempresaAnterior =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMermaEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomermaempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomermaempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomermaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomermaempresa);
				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
							
				
				


				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMermaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMermaEmpresa.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMermaEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomermaempresaAnterior =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomermaempresaAnterior =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
			
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
			
			


			
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMermaEmpresaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomermaempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomermaempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomermaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomermaempresa);
				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
								
				
				


				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMermaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMermaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMermaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaAnterior =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomermaempresaAnterior =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMermaEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomermaempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomermaempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMermaEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomermaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomermaempresa);
				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoMermaEmpresa")) {
					jCheckBoxSeleccionarTodosTipoMermaEmpresaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoMermaEmpresa")) {
					jCheckBoxSeleccionadosTipoMermaEmpresaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoMermaEmpresa")) {
					
				}
				
				


				
				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMermaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMermaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomermaempresa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipomermaempresa);
				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
												
				
				


				
				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMermaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMermaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMermaEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomermaempresaAnterior =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomermaempresaAnterior =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMermaEmpresaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomermaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomermaempresa);
				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
				
				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
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
			
			


			
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMermaEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomermaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomermaempresa);
				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMermaEmpresa.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMermaEmpresa.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomermaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomermaempresa);
				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
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
				
				


				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMermaEmpresa.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMermaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMermaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaempresaAnterior =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomermaempresaAnterior =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoMermaEmpresa")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoMermaEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoMermaEmpresa.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipomermaempresa =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipomermaempresa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoMermaEmpresa")) {
				
				}
				
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoMermaEmpresa")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoMermaEmpresa.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoMermaEmpresa")) {
			
			}
			
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoMermaEmpresa();
			
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoMermaEmpresa")) {
				jButtonNuevoTipoMermaEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoMermaEmpresa")) {
				jButtonDuplicarTipoMermaEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoMermaEmpresa")) {
				jButtonCopiarTipoMermaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoMermaEmpresa")) {
				jButtonVerFormTipoMermaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoMermaEmpresa")) {
				jButtonNuevoTipoMermaEmpresaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoMermaEmpresa")) {
				jButtonModificarTipoMermaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoMermaEmpresa")) {
				jButtonActualizarTipoMermaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoMermaEmpresa")) {
				jButtonEliminarTipoMermaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoMermaEmpresa")) {
				jButtonGuardarCambiosTipoMermaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoMermaEmpresa")) {
				jButtonCancelarTipoMermaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoMermaEmpresa")) {
				jButtonCerrarTipoMermaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoMermaEmpresa")) {
				jButtonGuardarCambiosTipoMermaEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMermaEmpresa")) {
				jButtonNuevoGuardarCambiosTipoMermaEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoMermaEmpresa")) {
				jButtonAbrirOrderByTipoMermaEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoMermaEmpresa")) {
				jButtonRecargarInformacionTipoMermaEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoMermaEmpresa")) {
				jButtonAnterioresTipoMermaEmpresaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoMermaEmpresa")) {
				jButtonSiguientesTipoMermaEmpresaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMermaEmpresaBusqueda")) {
				this.jButtonidTipoMermaEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoMermaEmpresaUpdate")) {
				this.jButtonid_empresaTipoMermaEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoMermaEmpresaBusqueda")) {
				this.jButtonid_empresaTipoMermaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMermaEmpresaBusqueda")) {
				this.jButtonnombreTipoMermaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoMermaEmpresaBusqueda")) {
				this.jButtondescripcionTipoMermaEmpresaBusquedaActionPerformed(evt);
			}
			
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoMermaEmpresa();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoMermaEmpresa")) {
				closingInternalFrameTipoMermaEmpresa();
				
			} else if(sTipo.equals("jButtonCancelarTipoMermaEmpresa")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoMermaEmpresa = (JInternalFrameBase)evt.getSource();
	            	
	            TipoMermaEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoMermaEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMermaEmpresa.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoMermaEmpresaActionPerformed(null);
			}
			
			TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomermaempresa,new Object(),this.tipomermaempresaParameterGeneral,this.tipomermaempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoMermaEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoMermaEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoMermaEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipomermaempresa)) {
			if(!esControlTabla) {
				if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoMermaEmpresa(this.tipomermaempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(this.tipomermaempresa);			
				}
				
				if(this.tipomermaempresaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoMermaEmpresa(this.tipomermaempresa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomermaempresaReturnGeneral=tipomermaempresaLogic.procesarEventosTipoMermaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomermaempresaLogic.getTipoMermaEmpresas(),this.tipomermaempresa,this.tipomermaempresaParameterGeneral,this.isEsNuevoTipoMermaEmpresa,classes);//this.tipomermaempresaLogic.getTipoMermaEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoMermaEmpresa(this.tipomermaempresaReturnGeneral,this.tipomermaempresaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipomermaempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoMermaEmpresa(classes,this.tipomermaempresaReturnGeneral,this.tipomermaempresaBean,false);
					}
						
					if(this.tipomermaempresaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoMermaEmpresa(this.tipomermaempresaReturnGeneral.getTipoMermaEmpresa());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoMermaEmpresa(this.tipomermaempresaReturnGeneral.getTipoMermaEmpresa());	
					}
						
					if(this.tipomermaempresaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoMermaEmpresa(this.tipomermaempresaReturnGeneral.getTipoMermaEmpresa(),classes);//this.tipomermaempresaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoMermaEmpresa(this.tipomermaempresa,classes);//this.tipomermaempresaBean);									
				}
			
				if(TipoMermaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoMermaEmpresa(this.tipomermaempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMermaEmpresa(this.tipomermaempresa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipomermaempresaAnterior!=null) {
						this.tipomermaempresa=this.tipomermaempresaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomermaempresaReturnGeneral=tipomermaempresaLogic.procesarEventosTipoMermaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomermaempresaLogic.getTipoMermaEmpresas(),this.tipomermaempresa,this.tipomermaempresaParameterGeneral,this.isEsNuevoTipoMermaEmpresa,classes);//this.tipomermaempresaLogic.getTipoMermaEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomermaempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomermaempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipomermaempresaReturnGeneral.getTipoMermaEmpresa(),tipomermaempresaLogic.getTipoMermaEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipomermaempresaReturnGeneral.getTipoMermaEmpresa(),this.tipomermaempresas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoMermaEmpresa.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoMermaEmpresa.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoMermaEmpresa();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoMermaEmpresa() throws Exception {
		
		TipoMermaEmpresaModel tipomermaempresaModel=(TipoMermaEmpresaModel)this.jTableDatosTipoMermaEmpresa.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomermaempresaModel.tipomermaempresas=this.tipomermaempresaLogic.getTipoMermaEmpresas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipomermaempresaModel.tipomermaempresas=this.tipomermaempresas;
		}
		
		
		((TipoMermaEmpresaModel) this.jTableDatosTipoMermaEmpresa.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoMermaEmpresa() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipomermaempresaAnterior(),this.tipomermaempresaLogic.getTipoMermaEmpresas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipomermaempresaAnterior(),this.tipomermaempresas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoMermaEmpresa();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
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
										
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomermaempresa,new Object(),generalEntityParameterGeneral,this.tipomermaempresaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipomermaempresaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoMermaEmpresaConstantesFunciones.getClassesRelationshipsOfTipoMermaEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoMermaEmpresaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoMermaEmpresa(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoMermaEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoMermaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomermaempresa,new Object(),generalEntityParameterGeneral,this.tipomermaempresaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoMermaEmpresa(TipoMermaEmpresaBean tipomermaempresaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoMermaEmpresa(ArrayList<Classe> classes,TipoMermaEmpresaReturnGeneral tipomermaempresaReturnGeneral,TipoMermaEmpresaBean tipomermaempresaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipomermaempresa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa = new TipoMermaEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipomermaempresaSessionBean.getConGuardarRelaciones(),this.tipomermaempresaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMermaEmpresa);
		this.jInternalFrameDetalleFormTipoMermaEmpresa.setVisible(false);
		this.jInternalFrameDetalleFormTipoMermaEmpresa.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.tipomermaempresaLogic=this.tipomermaempresaLogic;
		
		this.cargarCombosFrameForeignKeyTipoMermaEmpresa("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMermaEmpresa();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMermaEmpresa();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoMermaEmpresa("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoMermaEmpresa();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMermaEmpresa"));
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonModificarTipoMermaEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoMermaEmpresa"));

		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonModificarToolBarTipoMermaEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMermaEmpresa"));
					
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemModificarTipoMermaEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMermaEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonActualizarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoMermaEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonActualizarToolBarTipoMermaEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMermaEmpresa"));
						
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemActualizarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMermaEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonEliminarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoMermaEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonEliminarToolBarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMermaEmpresa"));
								
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemEliminarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMermaEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonCancelarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoMermaEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonCancelarToolBarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMermaEmpresa"));
					
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemCancelarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMermaEmpresa"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemDetalleCerrarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMermaEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonGuardarCambiosToolBarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMermaEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonGuardarCambiosToolBarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMermaEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMermaEmpresa"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonidTipoMermaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMermaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonid_empresaTipoMermaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoMermaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonid_empresaTipoMermaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoMermaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonnombreTipoMermaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMermaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtondescripcionTipoMermaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoMermaEmpresaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jTabbedPaneRelacionesTipoMermaEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMermaEmpresa"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoMermaEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMermaEmpresa"));
		}
		
		this.jTableDatosTipoMermaEmpresa.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoMermaEmpresa"));
		
		this.jTableDatosTipoMermaEmpresa.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoMermaEmpresa"));
		
		this.jButtonNuevoTipoMermaEmpresa.addActionListener(new ButtonActionListener(this,"NuevoTipoMermaEmpresa"));
		
		this.jButtonDuplicarTipoMermaEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarTipoMermaEmpresa"));
		
		this.jButtonCopiarTipoMermaEmpresa.addActionListener(new ButtonActionListener(this,"CopiarTipoMermaEmpresa"));
		
		this.jButtonVerFormTipoMermaEmpresa.addActionListener(new ButtonActionListener(this,"VerFormTipoMermaEmpresa"));
		
		
		this.jButtonNuevoToolBarTipoMermaEmpresa.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoMermaEmpresa"));
			
		this.jButtonDuplicarToolBarTipoMermaEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoMermaEmpresa"));
			
		this.jMenuItemNuevoTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoMermaEmpresa"));
			
		this.jMenuItemDuplicarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoMermaEmpresa"));		
		
		
		this.jButtonNuevoRelacionesTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoMermaEmpresa"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoMermaEmpresa.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoMermaEmpresa"));
			
		this.jMenuItemNuevoRelacionesTipoMermaEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoMermaEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonModificarTipoMermaEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoMermaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonModificarToolBarTipoMermaEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMermaEmpresa"));
			
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemModificarTipoMermaEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMermaEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonActualizarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoMermaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonActualizarToolBarTipoMermaEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMermaEmpresa"));
				
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemActualizarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMermaEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonEliminarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoMermaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonEliminarToolBarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMermaEmpresa"));
						
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemEliminarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMermaEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonCancelarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoMermaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonCancelarToolBarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMermaEmpresa"));
			
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemCancelarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMermaEmpresa"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoMermaEmpresa"));		
		
		
		this.jButtonCerrarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"CerrarTipoMermaEmpresa"));
		
		
		this.jButtonCerrarToolBarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoMermaEmpresa"));
			
		this.jMenuItemCerrarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoMermaEmpresa"));
			
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jMenuItemDetalleCerrarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMermaEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonGuardarCambiosTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoMermaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonGuardarCambiosToolBarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMermaEmpresa"));
		}
		
		this.jButtonCopiarToolBarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoMermaEmpresa"));
			
		this.jButtonVerFormToolBarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoMermaEmpresa"));
		
		this.jMenuItemGuardarCambiosTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoMermaEmpresa"));
			
		this.jMenuItemCopiarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoMermaEmpresa"));		
		
		this.jMenuItemVerFormTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoMermaEmpresa"));		
		
		
		this.jButtonGuardarCambiosTablaTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMermaEmpresa"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoMermaEmpresa"));
			
		this.jMenuItemGuardarCambiosTablaTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMermaEmpresa"));		
		
		
		
		this.jButtonRecargarInformacionTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoMermaEmpresa"));
					
		this.jButtonRecargarInformacionToolBarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoMermaEmpresa"));
		
		this.jMenuItemRecargarInformacionTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoMermaEmpresa"));		
		
		
		
		this.jButtonAnterioresTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresTipoMermaEmpresa"));
		
		
		this.jButtonAnterioresToolBarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoMermaEmpresa"));
		
		this.jMenuItemAnterioresTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoMermaEmpresa"));		
		
		
		this.jButtonSiguientesTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesTipoMermaEmpresa"));
		
		
		this.jButtonSiguientesToolBarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoMermaEmpresa"));
			
		this.jMenuItemSiguientesTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoMermaEmpresa"));
			
		this.jMenuItemAbrirOrderByTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoMermaEmpresa"));
			
		this.jMenuItemMostrarOcultarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoMermaEmpresa"));
			
		this.jMenuItemDetalleAbrirOrderByTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoMermaEmpresa"));
			
		this.jMenuItemDetalleMostarOcultarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoMermaEmpresa"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoMermaEmpresa"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoMermaEmpresa"));
			
		this.jMenuItemNuevoGuardarCambiosTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoMermaEmpresa"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoMermaEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoMermaEmpresa"));

		this.jCheckBoxSeleccionadosTipoMermaEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoMermaEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMermaEmpresa"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoMermaEmpresa"));
			
		this.jComboBoxTiposAccionesTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoMermaEmpresa"));
					
		this.jComboBoxTiposSeleccionarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoMermaEmpresa"));
			
		this.jTextFieldValorCampoGeneralTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoMermaEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonidTipoMermaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMermaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonid_empresaTipoMermaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoMermaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonid_empresaTipoMermaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoMermaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonnombreTipoMermaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMermaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtondescripcionTipoMermaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoMermaEmpresaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoMermaEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMermaEmpresa"));
				this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMermaEmpresa"));
				this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMermaEmpresa"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMermaEmpresa"));				
			//this.jButtonGenerarReporteDinamicoTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMermaEmpresa"));
			//this.jButtonGenerarExcelReporteDinamicoTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMermaEmpresa"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoMermaEmpresa!=null) {
				this.jInternalFrameImportacionTipoMermaEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMermaEmpresa"));
				this.jInternalFrameImportacionTipoMermaEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMermaEmpresa"));
				this.jInternalFrameImportacionTipoMermaEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMermaEmpresa"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoMermaEmpresa"));
			
			this.jButtonAbrirOrderByToolBarTipoMermaEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoMermaEmpresa"));			
			
			if(this.jInternalFrameOrderByTipoMermaEmpresa!=null) {
				this.jInternalFrameOrderByTipoMermaEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMermaEmpresa"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMermaEmpresa.jTabbedPaneRelacionesTipoMermaEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMermaEmpresa"));
		
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
            		closingInternalFrameTipoMermaEmpresa();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoMermaEmpresa = (JInternalFrameBase)event.getSource();
	            	
	            TipoMermaEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoMermaEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMermaEmpresa.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoMermaEmpresaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoMermaEmpresa.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoMermaEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoMermaEmpresa.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoMermaEmpresa.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMermaEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMermaEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMermaEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoMermaEmpresa";
		inputMap = this.jButtonNuevoTipoMermaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoMermaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMermaEmpresaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMermaEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMermaEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMermaEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoMermaEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoMermaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoMermaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMermaEmpresaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoMermaEmpresa";
		inputMap = this.jButtonModificarTipoMermaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoMermaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoMermaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoMermaEmpresa";
		inputMap = this.jButtonActualizarTipoMermaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoMermaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoMermaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoMermaEmpresa";
		inputMap = this.jButtonEliminarTipoMermaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoMermaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoMermaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoMermaEmpresa";
		inputMap = this.jButtonCancelarTipoMermaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoMermaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoMermaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoMermaEmpresa";
		inputMap = this.jButtonCerrarTipoMermaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoMermaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoMermaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonGuardarCambiosTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoMermaEmpresa";
		inputMap = this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonGuardarCambiosTipoMermaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonGuardarCambiosTipoMermaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoMermaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoMermaEmpresa.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoMermaEmpresaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoMermaEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoMermaEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoMermaEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoMermaEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoMermaEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoMermaEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonidTipoMermaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMermaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonid_empresaTipoMermaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoMermaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonid_empresaTipoMermaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoMermaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtonnombreTipoMermaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMermaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jButtondescripcionTipoMermaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoMermaEmpresaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoMermaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoMermaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoMermaEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoMermaEmpresa.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoMermaEmpresa(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoMermaEmpresa tipomermaempresaAux:this.tipomermaempresaLogic.getTipoMermaEmpresas()) {
					tipomermaempresaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMermaEmpresa tipomermaempresaAux:tipomermaempresas) {
					tipomermaempresaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoMermaEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMermaEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMermaEmpresa tipomermaempresaAux:this.tipomermaempresaLogic.getTipoMermaEmpresas()) {
						tipomermaempresaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMermaEmpresa tipomermaempresaAux:tipomermaempresas) {
						tipomermaempresaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoMermaEmpresa tipomermaempresaAux:this.tipomermaempresaLogic.getTipoMermaEmpresas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMermaEmpresa tipomermaempresaAux:tipomermaempresas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMermaEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMermaEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMermaEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMermaEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoMermaEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMermaEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoMermaEmpresa.getSelectedRows();
			
			TipoMermaEmpresa tipomermaempresaLocal=new TipoMermaEmpresa();
			
			//this.seleccionarTodosTipoMermaEmpresa(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomermaempresaLocal =(TipoMermaEmpresa) this.tipomermaempresaLogic.getTipoMermaEmpresas().toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipomermaempresaLocal =(TipoMermaEmpresa) this.tipomermaempresas.toArray()[this.jTableDatosTipoMermaEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipomermaempresaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMermaEmpresa tipomermaempresaAux:this.tipomermaempresaLogic.getTipoMermaEmpresas()) {
						tipomermaempresaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMermaEmpresa tipomermaempresaAux:tipomermaempresas) {
						tipomermaempresaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoMermaEmpresa(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMermaEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMermaEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMermaEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoMermaEmpresaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoMermaEmpresaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoMermaEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoMermaEmpresa(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoMermaEmpresa.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMermaEmpresa tipomermaempresaAux:this.tipomermaempresaLogic.getTipoMermaEmpresas()) {
				
						if(sTipoSeleccionar.equals(TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomermaempresaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipomermaempresaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMermaEmpresa tipomermaempresaAux:tipomermaempresas) {
					
						if(sTipoSeleccionar.equals(TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomermaempresaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipomermaempresaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMermaEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoMermaEmpresaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoMermaEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoMermaEmpresa=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoMermaEmpresa.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoMermaEmpresa) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoMermaEmpresa(conSplash);
				
					this.generarReporteTipoMermaEmpresasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMermaEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoMermaEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoMermaEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMermaEmpresasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoMermaEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMermaEmpresasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoMermaEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMermaEmpresa();
				
				this.exportarTipoMermaEmpresasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMermaEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoMermaEmpresas();
				//this.importarTipoMermaEmpresas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMermaEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMermaEmpresa();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoMermaEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoMermaEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Merma Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoMermaEmpresa();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoMermaEmpresa)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoMermaEmpresa(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Merma Empresa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMermaEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoMermaEmpresaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoMermaEmpresa) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoMermaEmpresa(conSplash);
					
						//this.actualizarParametrosGeneralTipoMermaEmpresa();
						
						this.generarReporteProcesoAccionTipoMermaEmpresasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoMermaEmpresa.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoMermaEmpresaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Merma EmpresaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Merma Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoMermaEmpresa();
				
						this.actualizarParametrosGeneralTipoMermaEmpresa();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipomermaempresaReturnGeneral=tipomermaempresaLogic.procesarAccionTipoMermaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipomermaempresaLogic.getTipoMermaEmpresas(),this.tipomermaempresaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoMermaEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoMermaEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoMermaEmpresa();
					
					TipoMermaEmpresaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoMermaEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoMermaEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoMermaEmpresa(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoMermaEmpresaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoMermaEmpresa();
			
			if(this.jInternalFrameDetalleFormTipoMermaEmpresa==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoMermaEmpresa> tipomermaempresasSeleccionados=new ArrayList<TipoMermaEmpresa>();		
			TipoMermaEmpresa tipomermaempresa=new TipoMermaEmpresa();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoMermaEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoMermaEmpresa.getSelectedItem();
			
			
			
			
			tipomermaempresasSeleccionados=this.getTipoMermaEmpresasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipomermaempresasSeleccionados.size()==1) {
				for(TipoMermaEmpresa tipomermaempresaAux:tipomermaempresasSeleccionados) {
					tipomermaempresa=tipomermaempresaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoMermaEmpresa();
			
      		//this.finishProcessTipoMermaEmpresa(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoMermaEmpresaReturnGeneral() throws Exception {
		if(this.tipomermaempresaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipomermaempresaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipomermaempresaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipomermaempresaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipomermaempresaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipomermaempresaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoMermaEmpresa(false);
		}
		
		if(this.tipomermaempresaReturnGeneral.getConRetornoLista() || this.tipomermaempresaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipomermaempresaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomermaempresaLogic.setTipoMermaEmpresas(this.tipomermaempresaReturnGeneral.getTipoMermaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipomermaempresaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomermaempresaLogic.setTipoMermaEmpresa(this.tipomermaempresaReturnGeneral.getTipoMermaEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoMermaEmpresa(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoMermaEmpresa() throws Exception {
		
		
	}
	
	public ArrayList<TipoMermaEmpresa> getTipoMermaEmpresasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoMermaEmpresa> tipomermaempresasSeleccionados=new ArrayList<TipoMermaEmpresa>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoMermaEmpresa) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoMermaEmpresa tipomermaempresaAux:tipomermaempresaLogic.getTipoMermaEmpresas()) {
					if(tipomermaempresaAux.getIsSelected()) {
						tipomermaempresasSeleccionados.add(tipomermaempresaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMermaEmpresa tipomermaempresaAux:this.tipomermaempresas) {
					if(tipomermaempresaAux.getIsSelected()) {
						tipomermaempresasSeleccionados.add(tipomermaempresaAux);				
					}
				}
			}
			
			if(tipomermaempresasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipomermaempresasSeleccionados.addAll(this.tipomermaempresaLogic.getTipoMermaEmpresas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipomermaempresasSeleccionados.addAll(this.tipomermaempresas);				
					}
				}
			}
		} else {
			tipomermaempresasSeleccionados.add(this.tipomermaempresa);
		}
		
		return tipomermaempresasSeleccionados;
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
	
	public void generarReporteTipoMermaEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoMermaEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoMermaEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMermaEmpresasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMermaEmpresasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Merma Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoMermaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoMermaEmpresa> tipomermaempresasSeleccionados=new ArrayList<TipoMermaEmpresa>();		
		
		tipomermaempresasSeleccionados=this.getTipoMermaEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoMermaEmpresas("Todos",tipomermaempresasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoMermaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoMermaEmpresa> tipomermaempresasSeleccionados=new ArrayList<TipoMermaEmpresa>();		
		
		tipomermaempresasSeleccionados=this.getTipoMermaEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoMermaEmpresas("Todos",tipomermaempresasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoMermaEmpresasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoMermaEmpresa> tipomermaempresasSeleccionados=new ArrayList<TipoMermaEmpresa>();
		
		tipomermaempresasSeleccionados=this.getTipoMermaEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoMermaEmpresas("Todos",tipomermaempresasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoMermaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoMermaEmpresa> tipomermaempresasSeleccionados=new ArrayList<TipoMermaEmpresa>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoMermaEmpresa();
		
		
		tipomermaempresasSeleccionados=this.getTipoMermaEmpresasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoMermaEmpresa();
		
		
		//this.generarReporteTipoMermaEmpresas("Todos",tipomermaempresasSeleccionados ,tipomermaempresaImplementable,tipomermaempresaImplementableHome);
	}
	
	public void mostrarImportacionTipoMermaEmpresas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoMermaEmpresa();
		
		this.abrirFrameImportacionTipoMermaEmpresa();		
		
			
		//this.generarReporteTipoMermaEmpresas("Todos",tipomermaempresasSeleccionados ,tipomermaempresaImplementable,tipomermaempresaImplementableHome);
	}
	
	public void importarTipoMermaEmpresas() throws Exception {		
	
	}
	
	public void exportarTipoMermaEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoMermaEmpresasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoMermaEmpresasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoMermaEmpresasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Merma Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoMermaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoMermaEmpresa> tipomermaempresasSeleccionados=new ArrayList<TipoMermaEmpresa>();		
		
		tipomermaempresasSeleccionados=this.getTipoMermaEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomermaempresa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoMermaEmpresa(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoMermaEmpresa tipomermaempresaAux:tipomermaempresasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoMermaEmpresa(tipomermaempresaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipomermaempresaAux.setsDetalleGeneralEntityReporte(tipomermaempresaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Merma Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoMermaEmpresa(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoMermaEmpresaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMermaEmpresaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMermaEmpresaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipomermaempresa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomermaempresa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomermaempresa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomermaempresa.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomermaempresa.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoMermaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoMermaEmpresa> tipomermaempresasSeleccionados=new ArrayList<TipoMermaEmpresa>();		
		
		tipomermaempresasSeleccionados=this.getTipoMermaEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomermaempresa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoMermaEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoMermaEmpresa(row);				
				iRow++;
			}				
			
			for(TipoMermaEmpresa tipomermaempresaAux:tipomermaempresasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoMermaEmpresa(tipomermaempresaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Merma Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoMermaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoMermaEmpresa> tipomermaempresasSeleccionados=new ArrayList<TipoMermaEmpresa>();		
		
		tipomermaempresasSeleccionados=this.getTipoMermaEmpresasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomermaempresa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipomermaempresas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipomermaempresa");
			//elementRoot.appendChild(element);
		
			for(TipoMermaEmpresa tipomermaempresaAux:tipomermaempresasSeleccionados) {
				element = document.createElement("tipomermaempresa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoMermaEmpresa(tipomermaempresaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Merma Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoMermaEmpresa(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMermaEmpresaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMermaEmpresaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoMermaEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipomermaempresa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomermaempresa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomermaempresa.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomermaempresa.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoMermaEmpresa(TipoMermaEmpresa tipomermaempresa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoMermaEmpresaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipomermaempresa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoMermaEmpresaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipomermaempresa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoMermaEmpresaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipomermaempresa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(TipoMermaEmpresaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipomermaempresa.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoMermaEmpresaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipomermaempresa.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoMermaEmpresasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoMermaEmpresa> tipomermaempresasSeleccionados=new ArrayList<TipoMermaEmpresa>();
		
		tipomermaempresasSeleccionados=this.getTipoMermaEmpresasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoMermaEmpresa(tipomermaempresasSeleccionados);
		
		this.generarReporteTipoMermaEmpresas("Todos",tipomermaempresasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoMermaEmpresa(ArrayList<TipoMermaEmpresa> tipomermaempresasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoMermaEmpresa tipomermaempresaAux:tipomermaempresasSeleccionados) {
				tipomermaempresaAux.setsDetalleGeneralEntityReporte(tipomermaempresaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoMermaEmpresaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipomermaempresaAux.setsDescripcionGeneralEntityReporte1(tipomermaempresaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipomermaempresaAux.setsDescripcionGeneralEntityReporte1(tipomermaempresaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipomermaempresaAux.setsDescripcionGeneralEntityReporte1(tipomermaempresaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoMermaEmpresa(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoMermaEmpresa=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa=true;
				this.isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa=true;
			}
			
			this.isVisibilidadCeldaModificarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoMermaEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMermaEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMermaEmpresa=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoMermaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa=false;
			this.isVisibilidadCeldaModificarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoMermaEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoMermaEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMermaEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMermaEmpresa=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoMermaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa=false;
			this.isVisibilidadCeldaModificarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoMermaEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoMermaEmpresa=true;
			this.isVisibilidadCeldaCancelarTipoMermaEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMermaEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMermaEmpresa=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoMermaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa=false;
			this.isVisibilidadCeldaModificarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoMermaEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoMermaEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMermaEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMermaEmpresa=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoMermaEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa=true;
			this.isVisibilidadCeldaModificarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoMermaEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMermaEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMermaEmpresa=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoMermaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoMermaEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMermaEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMermaEmpresa=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoMermaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa=false;
			this.isVisibilidadCeldaModificarTipoMermaEmpresa=true;
			this.isVisibilidadCeldaActualizarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoMermaEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMermaEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMermaEmpresa=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoMermaEmpresaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoMermaEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa=true;
		} else {
			this.actualizarEstadoPanelsTipoMermaEmpresa(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoMermaEmpresa=false;
			//this.isVisibilidadCeldaVerFormTipoMermaEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoMermaEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipomermaempresaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoMermaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMermaEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
			if(!tipomermaempresaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa=false;												
			}
			
			this.jButtonCerrarTipoMermaEmpresa.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMermaEmpresa=false;
		}
		
		if(!this.permiteMantenimiento(this.tipomermaempresa)) {
			this.isVisibilidadCeldaActualizarTipoMermaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoMermaEmpresa=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMermaEmpresa() {
	}
	
	public void actualizarEstadoPanelsTipoMermaEmpresa(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoMermaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoMermaEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMermaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoMermaEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMermaEmpresa!=null) {
				this.jScrollPanelDatosTipoMermaEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMermaEmpresa!=null) {
				this.jPanelPaginacionTipoMermaEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMermaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMermaEmpresa.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoMermaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoMermaEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMermaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoMermaEmpresa.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoMermaEmpresa!=null) {
				this.jScrollPanelDatosTipoMermaEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMermaEmpresa!=null) {
				this.jPanelPaginacionTipoMermaEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMermaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMermaEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoMermaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoMermaEmpresa.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMermaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoMermaEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMermaEmpresa!=null) {
				this.jScrollPanelDatosTipoMermaEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMermaEmpresa!=null) {
				this.jPanelPaginacionTipoMermaEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMermaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMermaEmpresa.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoMermaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoMermaEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMermaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoMermaEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMermaEmpresa!=null) {
				this.jScrollPanelDatosTipoMermaEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMermaEmpresa!=null) {
				this.jPanelPaginacionTipoMermaEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMermaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMermaEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoMermaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoMermaEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMermaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoMermaEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMermaEmpresa!=null) {
				this.jScrollPanelDatosTipoMermaEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMermaEmpresa!=null) {
				this.jPanelPaginacionTipoMermaEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMermaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMermaEmpresa.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoMermaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoMermaEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMermaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoMermaEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMermaEmpresa!=null) {
				this.jScrollPanelDatosTipoMermaEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMermaEmpresa!=null) {
				this.jPanelPaginacionTipoMermaEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMermaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMermaEmpresa.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoMermaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoMermaEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMermaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoMermaEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMermaEmpresa!=null) {
				this.jScrollPanelDatosTipoMermaEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMermaEmpresa!=null) {
				this.jPanelPaginacionTipoMermaEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMermaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMermaEmpresa.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoMermaEmpresa!=null) {
					this.jTabbedPaneBusquedasTipoMermaEmpresa.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoMermaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMermaEmpresa.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMermaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoMermaEmpresa.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoMermaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMermaEmpresa.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoMermaEmpresaSessionBean tipomermaempresaSessionBean=new TipoMermaEmpresaSessionBean();
		
		if(this.tipomermaempresaSessionBean==null) {
			this.tipomermaempresaSessionBean=new TipoMermaEmpresaSessionBean();
		}
		
		this.tipomermaempresaSessionBean.setsUltimaBusquedaTipoMermaEmpresa(this.getsAccionBusqueda());
		this.tipomermaempresaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipomermaempresaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipomermaempresaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoMermaEmpresaSessionBean tipomermaempresaSessionBean=new TipoMermaEmpresaSessionBean();
		
		if(this.tipomermaempresaSessionBean==null) {
			this.tipomermaempresaSessionBean=new TipoMermaEmpresaSessionBean();
		}
		
		if(this.tipomermaempresaSessionBean.getsUltimaBusquedaTipoMermaEmpresa()!=null&&!this.tipomermaempresaSessionBean.getsUltimaBusquedaTipoMermaEmpresa().equals("")) {
			this.setsAccionBusqueda(tipomermaempresaSessionBean.getsUltimaBusquedaTipoMermaEmpresa());
			this.setiNumeroPaginacion(tipomermaempresaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipomermaempresaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipomermaempresaSessionBean.getid_empresa());
				tipomermaempresaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipomermaempresaSessionBean.setsUltimaBusquedaTipoMermaEmpresa("");
		this.tipomermaempresaSessionBean.setiNumeroPaginacion(TipoMermaEmpresaConstantesFunciones.INUMEROPAGINACION);
		this.tipomermaempresaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoMermaEmpresa(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoMermaEmpresa() {
		this.updateBorderResaltarBusquedasFormularioTipoMermaEmpresa();
		this.updateVisibilidadBusquedasFormularioTipoMermaEmpresa();
		this.updateHabilitarBusquedasFormularioTipoMermaEmpresa();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoMermaEmpresa() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoMermaEmpresa.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoMermaEmpresa() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoMermaEmpresa.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoMermaEmpresa() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoMermaEmpresa.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoMermaEmpresa(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoMermaEmpresa.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoMermaEmpresa() throws Exception {

		if(this.jInternalFrameDetalleFormTipoMermaEmpresa==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoMermaEmpresa();
		this.updateVisibilidadResaltarControlesFormularioTipoMermaEmpresa();
		this.updateHabilitarResaltarControlesFormularioTipoMermaEmpresa();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoMermaEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipomermaempresaConstantesFunciones.resaltaridTipoMermaEmpresa!=null && this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabelidTipoMermaEmpresa.setBorder(this.tipomermaempresaConstantesFunciones.resaltaridTipoMermaEmpresa);}
		if(this.tipomermaempresaConstantesFunciones.resaltarid_empresaTipoMermaEmpresa!=null && this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxid_empresaTipoMermaEmpresa.setBorder(this.tipomermaempresaConstantesFunciones.resaltarid_empresaTipoMermaEmpresa);}
		if(this.tipomermaempresaConstantesFunciones.resaltarnombreTipoMermaEmpresa!=null && this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {this.jInternalFrameDetalleFormTipoMermaEmpresa.jTextAreanombreTipoMermaEmpresa.setBorder(this.tipomermaempresaConstantesFunciones.resaltarnombreTipoMermaEmpresa);}
		if(this.tipomermaempresaConstantesFunciones.resaltardescripcionTipoMermaEmpresa!=null && this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {this.jInternalFrameDetalleFormTipoMermaEmpresa.jTextAreadescripcionTipoMermaEmpresa.setBorder(this.tipomermaempresaConstantesFunciones.resaltardescripcionTipoMermaEmpresa);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoMermaEmpresa() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
	
		//this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabelidTipoMermaEmpresa.setVisible(this.tipomermaempresaConstantesFunciones.mostraridTipoMermaEmpresa);
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jPanelidTipoMermaEmpresa.setVisible(this.tipomermaempresaConstantesFunciones.mostraridTipoMermaEmpresa);
		//this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxid_empresaTipoMermaEmpresa.setVisible(this.tipomermaempresaConstantesFunciones.mostrarid_empresaTipoMermaEmpresa);
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jPanelid_empresaTipoMermaEmpresa.setVisible(this.tipomermaempresaConstantesFunciones.mostrarid_empresaTipoMermaEmpresa);
		//this.jInternalFrameDetalleFormTipoMermaEmpresa.jTextAreanombreTipoMermaEmpresa.setVisible(this.tipomermaempresaConstantesFunciones.mostrarnombreTipoMermaEmpresa);
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jPanelnombreTipoMermaEmpresa.setVisible(this.tipomermaempresaConstantesFunciones.mostrarnombreTipoMermaEmpresa);
		//this.jInternalFrameDetalleFormTipoMermaEmpresa.jTextAreadescripcionTipoMermaEmpresa.setVisible(this.tipomermaempresaConstantesFunciones.mostrardescripcionTipoMermaEmpresa);
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jPaneldescripcionTipoMermaEmpresa.setVisible(this.tipomermaempresaConstantesFunciones.mostrardescripcionTipoMermaEmpresa);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoMermaEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMermaEmpresa!=null) {
	
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jLabelidTipoMermaEmpresa.setEnabled(this.tipomermaempresaConstantesFunciones.activaridTipoMermaEmpresa);
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jComboBoxid_empresaTipoMermaEmpresa.setEnabled(this.tipomermaempresaConstantesFunciones.activarid_empresaTipoMermaEmpresa);
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jTextAreanombreTipoMermaEmpresa.setEnabled(this.tipomermaempresaConstantesFunciones.activarnombreTipoMermaEmpresa);
		this.jInternalFrameDetalleFormTipoMermaEmpresa.jTextAreadescripcionTipoMermaEmpresa.setEnabled(this.tipomermaempresaConstantesFunciones.activardescripcionTipoMermaEmpresa);
		}
	}
	
		
}