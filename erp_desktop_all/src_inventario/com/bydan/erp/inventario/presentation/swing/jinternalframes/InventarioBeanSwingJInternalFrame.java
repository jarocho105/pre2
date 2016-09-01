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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.InventarioConstantesFunciones;
import com.bydan.erp.inventario.util.InventarioParameterReturnGeneral;
//import com.bydan.erp.inventario.util.InventarioParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.InventarioBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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




@SuppressWarnings("unused")
public class InventarioBeanSwingJInternalFrame extends InventarioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(InventarioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Inventario> inventarioValidator = new ClassValidator<Inventario>(Inventario.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Inventario inventario;	
	public Inventario inventarioAux;
	public Inventario inventarioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Inventario inventarioTotales;
	public Long idInventarioActual;
	public Long iIdNuevoInventario=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoInventario;
	public Boolean isPermisoNuevoInventario;
	public Boolean isPermisoActualizarInventario;
	public Boolean isPermisoActualizarOriginalInventario;
	public Boolean isPermisoEliminarInventario;
	public Boolean isPermisoGuardarCambiosInventario;
	public Boolean isPermisoConsultaInventario;
	public Boolean isPermisoBusquedaInventario;
	public Boolean isPermisoReporteInventario;
	public Boolean isPermisoPaginacionMedioInventario;
	public Boolean isPermisoPaginacionAltoInventario;
	public Boolean isPermisoPaginacionTodoInventario;
	public Boolean isPermisoCopiarInventario;
	public Boolean isPermisoVerFormInventario;
	public Boolean isPermisoDuplicarInventario;
	public Boolean isPermisoOrdenInventario;
	
	
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
	
	public InventarioParameterReturnGeneral inventarioReturnGeneral;
	public InventarioParameterReturnGeneral inventarioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoInventario=false;
	public Boolean esParaAccionDesdeFormularioInventario=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected InventarioSessionBeanAdditional inventarioSessionBeanAdditional=null;
	
	public InventarioSessionBeanAdditional getInventarioSessionBeanAdditional() {
		return this.inventarioSessionBeanAdditional;
	}
	
	public void setInventarioSessionBeanAdditional(InventarioSessionBeanAdditional inventarioSessionBeanAdditional) {
		try {
			this.inventarioSessionBeanAdditional=inventarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected InventarioBeanSwingJInternalFrameAdditional inventarioBeanSwingJInternalFrameAdditional=null;
	//public class InventarioBeanSwingJInternalFrame
	
	public InventarioBeanSwingJInternalFrameAdditional getInventarioBeanSwingJInternalFrameAdditional() {
		return this.inventarioBeanSwingJInternalFrameAdditional;
	}
	
	public void setInventarioBeanSwingJInternalFrameAdditional(InventarioBeanSwingJInternalFrameAdditional inventarioBeanSwingJInternalFrameAdditional) {
		try {
			this.inventarioBeanSwingJInternalFrameAdditional=inventarioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public InventarioLogic inventarioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Inventario inventarioBean;
	public InventarioConstantesFunciones inventarioConstantesFunciones;
	//public InventarioParameterReturnGeneral inventarioReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Inventario> inventarios;	
	//public List<Inventario> inventariosEliminados;
	//public List<Inventario> inventariosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoInventario=false;
	public Boolean isVisibilidadCeldaDuplicarInventario=true;
	public Boolean isVisibilidadCeldaCopiarInventario=true;
	public Boolean isVisibilidadCeldaVerFormInventario=true;
	public Boolean isVisibilidadCeldaOrdenInventario=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesInventario=false;
	public Boolean isVisibilidadCeldaModificarInventario=false;
	public Boolean isVisibilidadCeldaActualizarInventario=false;
	public Boolean isVisibilidadCeldaEliminarInventario=false;
	public Boolean isVisibilidadCeldaCancelarInventario=false;
	public Boolean isVisibilidadCeldaGuardarInventario=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosInventario=false;	
	
	
	
	public Long getiIdNuevoInventario() {
		return this.iIdNuevoInventario;
	}

	public void setiIdNuevoInventario(Long iIdNuevoInventario) {
		this.iIdNuevoInventario = iIdNuevoInventario;
	}
	
	public Long getidInventarioActual() {
		return this.idInventarioActual;
	}

	public void setidInventarioActual(Long idInventarioActual) {
		this.idInventarioActual = idInventarioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Inventario getinventario() {
		return this.inventario;
	}

	public void setinventario(Inventario inventario) {
		this.inventario = inventario;
	}
	
	public Inventario getinventarioAux() {
		return this.inventarioAux;
	}

	public void setinventarioAux(Inventario inventarioAux) {
		this.inventarioAux = inventarioAux;
	}				
	
	public Inventario getinventarioAnterior() {
		return this.inventarioAnterior;
	}

	public void setinventarioAnterior(Inventario inventarioAnterior) {
		this.inventarioAnterior = inventarioAnterior;
	}	
	
	public Inventario getinventarioTotales() {
		return this.inventarioTotales;
	}

	public void setinventarioTotales(Inventario inventarioTotales) {
		this.inventarioTotales = inventarioTotales;
	}	
	
	public Inventario getinventarioBean() {
		return this.inventarioBean;
	}

	public void setinventarioBean(Inventario inventarioBean) {
		this.inventarioBean = inventarioBean;
	}	
	
	public InventarioParameterReturnGeneral getinventarioReturnGeneral() {
		return this.inventarioReturnGeneral;
	}

	public void setinventarioReturnGeneral(InventarioParameterReturnGeneral inventarioReturnGeneral) {
		this.inventarioReturnGeneral = inventarioReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public InventarioLogic getInventarioLogic()	{		
		return inventarioLogic;
	}

	public void setInventarioLogic(InventarioLogic inventarioLogic) {
		this.inventarioLogic = inventarioLogic;
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
	
	public Boolean getIsEsNuevoInventario() {
		return isEsNuevoInventario;
	}

	public void setIsEsNuevoInventario(Boolean isEsNuevoInventario) {
		this.isEsNuevoInventario = isEsNuevoInventario;
	}

	public Boolean getEsParaAccionDesdeFormularioInventario() {
		return esParaAccionDesdeFormularioInventario;
	}
	
	public void setEsParaAccionDesdeFormularioInventario(Boolean esParaAccionDesdeFormularioInventario) {
		this.esParaAccionDesdeFormularioInventario = esParaAccionDesdeFormularioInventario;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesInventario() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			InventarioConstantesFunciones.refrescarForeignKeysDescripcionesInventario(this.inventarioLogic.getInventarios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			InventarioConstantesFunciones.refrescarForeignKeysDescripcionesInventario(this.inventarios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//inventarioLogic.setInventarios(this.inventarios);
			inventarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public InventarioParameterReturnGeneral getInventarioParameterGeneral() {
		return this.inventarioParameterGeneral;
	}
	
	public void setInventarioParameterGeneral(InventarioParameterReturnGeneral inventarioParameterGeneral) {
		this.inventarioParameterGeneral = inventarioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoInventario() {
		return isPermisoTodoInventario;
	}

	public void setIsPermisoTodoInventario(Boolean isPermisoTodoInventario) {
		this.isPermisoTodoInventario = isPermisoTodoInventario;
	}

	public Boolean getIsPermisoNuevoInventario() {
		return isPermisoNuevoInventario;
	}

	public void setIsPermisoNuevoInventario(Boolean isPermisoNuevoInventario) {
		this.isPermisoNuevoInventario = isPermisoNuevoInventario;
	}

	public Boolean getIsPermisoActualizarInventario() {
		return isPermisoActualizarInventario;
	}

	public void setIsPermisoActualizarInventario(Boolean isPermisoActualizarInventario) {
		this.isPermisoActualizarInventario = isPermisoActualizarInventario;
	}

	public Boolean getIsPermisoEliminarInventario() {
		return isPermisoEliminarInventario;
	}

	public void setIsPermisoEliminarInventario(Boolean isPermisoEliminarInventario) {
		this.isPermisoEliminarInventario = isPermisoEliminarInventario;
	}

	public Boolean getIsPermisoGuardarCambiosInventario() {
		return isPermisoGuardarCambiosInventario;
	}

	public void setIsPermisoGuardarCambiosInventario(Boolean isPermisoGuardarCambiosInventario) {
		this.isPermisoGuardarCambiosInventario = isPermisoGuardarCambiosInventario;
	}
	
	public Boolean getIsPermisoConsultaInventario() {
		return isPermisoConsultaInventario;
	}

	public void setIsPermisoConsultaInventario(Boolean isPermisoConsultaInventario) {
		this.isPermisoConsultaInventario = isPermisoConsultaInventario;
	}

	public Boolean getIsPermisoBusquedaInventario() {
		return isPermisoBusquedaInventario;
	}

	public void setIsPermisoBusquedaInventario(Boolean isPermisoBusquedaInventario) {
		this.isPermisoBusquedaInventario = isPermisoBusquedaInventario;
	}

	public Boolean getIsPermisoReporteInventario() {
		return isPermisoReporteInventario;
	}

	public void setIsPermisoReporteInventario(Boolean isPermisoReporteInventario) {
		this.isPermisoReporteInventario = isPermisoReporteInventario;
	}
	
	public Boolean getIsPermisoPaginacionMedioInventario() {
		return isPermisoPaginacionMedioInventario;
	}

	public void setIsPermisoPaginacionMedioInventario(Boolean isPermisoPaginacionMedioInventario) {
		this.isPermisoPaginacionMedioInventario = isPermisoPaginacionMedioInventario;
	}
	
	public Boolean getIsPermisoPaginacionTodoInventario() {
		return isPermisoPaginacionTodoInventario;
	}

	public void setIsPermisoPaginacionTodoInventario(Boolean isPermisoPaginacionTodoInventario) {
		this.isPermisoPaginacionTodoInventario = isPermisoPaginacionTodoInventario;
	}
	
	public Boolean getIsPermisoPaginacionAltoInventario() {
		return isPermisoPaginacionAltoInventario;
	}

	public void setIsPermisoPaginacionAltoInventario(Boolean isPermisoPaginacionAltoInventario) {
		this.isPermisoPaginacionAltoInventario = isPermisoPaginacionAltoInventario;
	}
	
	public Boolean getIsPermisoCopiarInventario() {
		return isPermisoCopiarInventario;
	}

	public void setIsPermisoCopiarInventario(Boolean isPermisoCopiarInventario) {
		this.isPermisoCopiarInventario = isPermisoCopiarInventario;
	}
	
	public Boolean getIsPermisoVerFormInventario() {
		return isPermisoVerFormInventario;
	}

	public void setIsPermisoVerFormInventario(Boolean isPermisoVerFormInventario) {
		this.isPermisoVerFormInventario = isPermisoVerFormInventario;
	}
	
	public Boolean getIsPermisoDuplicarInventario() {
		return isPermisoDuplicarInventario;
	}

	public void setIsPermisoDuplicarInventario(Boolean isPermisoDuplicarInventario) {
		this.isPermisoDuplicarInventario = isPermisoDuplicarInventario;
	}
	
	public Boolean getIsPermisoOrdenInventario() {
		return isPermisoOrdenInventario;
	}

	public void setIsPermisoOrdenInventario(Boolean isPermisoOrdenInventario) {
		this.isPermisoOrdenInventario = isPermisoOrdenInventario;
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
	
	public Boolean getIsVisibilidadCeldaNuevoInventario() {
		return isVisibilidadCeldaNuevoInventario;
	}

	public void setIsVisibilidadCeldaNuevoInventario(Boolean isVisibilidadCeldaNuevoInventario) {
		this.isVisibilidadCeldaNuevoInventario = isVisibilidadCeldaNuevoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarInventario() {
		return isVisibilidadCeldaDuplicarInventario;
	}

	public void setIsVisibilidadCeldaDuplicarInventario(Boolean isVisibilidadCeldaDuplicarInventario) {
		this.isVisibilidadCeldaDuplicarInventario = isVisibilidadCeldaDuplicarInventario;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarInventario() {
		return isVisibilidadCeldaCopiarInventario;
	}

	public void setIsVisibilidadCeldaCopiarInventario(Boolean isVisibilidadCeldaCopiarInventario) {
		this.isVisibilidadCeldaCopiarInventario = isVisibilidadCeldaCopiarInventario;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormInventario() {
		return isVisibilidadCeldaVerFormInventario;
	}

	public void setIsVisibilidadCeldaVerFormInventario(Boolean isVisibilidadCeldaVerFormInventario) {
		this.isVisibilidadCeldaVerFormInventario = isVisibilidadCeldaVerFormInventario;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenInventario() {
		return isVisibilidadCeldaOrdenInventario;
	}

	public void setIsVisibilidadCeldaOrdenInventario(Boolean isVisibilidadCeldaOrdenInventario) {
		this.isVisibilidadCeldaOrdenInventario = isVisibilidadCeldaOrdenInventario;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesInventario() {
		return isVisibilidadCeldaNuevoRelacionesInventario;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesInventario(Boolean isVisibilidadCeldaNuevoRelacionesInventario) {
		this.isVisibilidadCeldaNuevoRelacionesInventario = isVisibilidadCeldaNuevoRelacionesInventario;
	}
	
	public Boolean getIsVisibilidadCeldaModificarInventario() {
		return isVisibilidadCeldaModificarInventario;
	}

	public void setIsVisibilidadCeldaModificarInventario(Boolean isVisibilidadCeldaModificarInventario) {
		this.isVisibilidadCeldaModificarInventario = isVisibilidadCeldaModificarInventario;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarInventario() {
		return isVisibilidadCeldaActualizarInventario;
	}

	public void setIsVisibilidadCeldaActualizarInventario(Boolean isVisibilidadCeldaActualizarInventario) {
		this.isVisibilidadCeldaActualizarInventario = isVisibilidadCeldaActualizarInventario;
	}

	public Boolean getIsVisibilidadCeldaEliminarInventario() {
		return isVisibilidadCeldaEliminarInventario;
	}

	public void setIsVisibilidadCeldaEliminarInventario(Boolean isVisibilidadCeldaEliminarInventario) {
		this.isVisibilidadCeldaEliminarInventario = isVisibilidadCeldaEliminarInventario;
	}

	public Boolean getIsVisibilidadCeldaCancelarInventario() {
		return isVisibilidadCeldaCancelarInventario;
	}

	public void setIsVisibilidadCeldaCancelarInventario(Boolean isVisibilidadCeldaCancelarInventario) {
		this.isVisibilidadCeldaCancelarInventario = isVisibilidadCeldaCancelarInventario;
	}

	public Boolean getIsVisibilidadCeldaGuardarInventario() {
		return isVisibilidadCeldaGuardarInventario;
	}

	public void setIsVisibilidadCeldaGuardarInventario(Boolean isVisibilidadCeldaGuardarInventario) {
		this.isVisibilidadCeldaGuardarInventario = isVisibilidadCeldaGuardarInventario;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosInventario() {
		return isVisibilidadCeldaGuardarCambiosInventario;
	}

	public void setIsVisibilidadCeldaGuardarCambiosInventario(Boolean isVisibilidadCeldaGuardarCambiosInventario) {
		this.isVisibilidadCeldaGuardarCambiosInventario = isVisibilidadCeldaGuardarCambiosInventario;
	}
		
	public InventarioSessionBean getinventarioSessionBean() {
		return this.inventarioSessionBean;
	}
	
	public void setinventarioSessionBean(InventarioSessionBean inventarioSessionBean) {
		this.inventarioSessionBean=inventarioSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysInventario(Inventario inventario)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(Inventario inventario,Inventario inventarioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalInventario(inventario);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		inventarioAux.setId(inventario.getId());
		inventarioAux.setVersionRow(inventario.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessInventario();
		
			int intSelectedRow = this.jTableDatosInventario.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventario =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.inventario =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(InventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualInventario(this.inventario,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysInventario(this.inventario);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = inventarioValidator.getInvalidValues(this.inventario);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			inventarioLogic.setDatosCliente(datosCliente);
			inventarioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				inventarioAux=new  Inventario();
				
				inventarioAux.setIsNew(true);
				inventarioAux.setIsChanged(true);
				
				inventarioAux.setInventarioOriginal(this.inventario);
				
				inventarioAux.setId(this.inventario.getId());	
				inventarioAux.setVersionRow(this.inventario.getVersionRow());	
				inventarioAux.setcodigo(this.inventario.getcodigo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.inventarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.inventarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(inventarioAux,inventarioLogic.getInventarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(inventarioAux,inventarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.inventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.inventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						inventarioLogic.saveInventarios();//WithConnection
						//inventarioLogic.getSetVersionRowInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.inventario,inventarioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.inventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								inventarioLogic.saveInventarioRelaciones(inventarioAux);//WithConnection
								//inventarioLogic.getSetVersionRowInventarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.inventario,inventarioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.inventarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.inventarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(inventarioAux,inventarioLogic.getInventarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(inventarioAux,inventarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.inventario,inventarioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				inventarioAux=new  Inventario();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.inventarioSessionBean.getEsGuardarRelacionado() 
					|| (this.inventarioSessionBean.getEsGuardarRelacionado() && this.inventario.getId()>=0)) {
						
					inventarioAux.setIsNew(false);
				}
				
				inventarioAux.setIsDeleted(false);
			
				inventarioAux.setId(this.inventario.getId());	
				inventarioAux.setVersionRow(this.inventario.getVersionRow());	
				inventarioAux.setcodigo(this.inventario.getcodigo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(inventarioAux,inventarioLogic.getInventarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(inventarioAux,inventarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.inventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.inventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						inventarioLogic.saveInventarios();//WithConnection
						//inventarioLogic.getSetVersionRowInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.inventario,inventarioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.inventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								inventarioLogic.saveInventarioRelaciones(inventarioAux);//WithConnection
								//inventarioLogic.getSetVersionRowInventarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.inventario,inventarioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.inventarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.inventarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(inventarioAux,inventarioLogic.getInventarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(inventarioAux,inventarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.inventario,inventarioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				inventarioAux=new  Inventario();
				
				inventarioAux.setIsNew(false);
				inventarioAux.setIsChanged(false);
				
				inventarioAux.setIsDeleted(true);
				
				inventarioAux.setId(this.inventario.getId());	
				inventarioAux.setVersionRow(this.inventario.getVersionRow());	
				inventarioAux.setcodigo(this.inventario.getcodigo());	
				
				if(this.inventarioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.inventarioAux.getId()>=0) {	
						this.inventariosEliminados.add(inventarioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(inventarioAux,inventarioLogic.getInventarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(inventarioAux,inventarios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.inventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.inventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						inventarioLogic.saveInventarios();//WithConnection
						//inventarioLogic.getSetVersionRowInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.inventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								inventarioLogic.saveInventarioRelaciones(inventarioAux);//WithConnection
								//inventarioLogic.getSetVersionRowInventarios();//WithConnection
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
							if(this.inventarioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.inventarioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(inventarioAux,inventarioLogic.getInventarios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(inventarioAux,inventarios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventarioLogic.getInventarios().addAll(this.inventariosEliminados);
					
					inventarioLogic.saveInventarios();//WithConnection
					//inventarioLogic.getSetVersionRowInventarios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.inventariosEliminados= new ArrayList<Inventario>();		
			}
			
			if(this.inventarioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.inventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Inventario GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Inventario",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.inventario=inventarioAux;
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
      		//this.finishProcessInventario();
      	}
		
	}	
	
	public void actualizarRelaciones(Inventario inventarioLocal) throws Exception {
		
		if(this.inventarioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Inventario inventarioLocal) throws Exception {	
		if(this.inventarioSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarInventarioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosInventario.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.inventario =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.inventario =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = inventarioValidator.getInvalidValues(this.inventario);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Inventario inventario,List<Inventario> inventarios) throws Exception {
		try	{		
			InventarioConstantesFunciones.actualizarLista(inventario,inventarios,this.inventarioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Inventario inventario,List<Inventario> inventarios) throws Exception {
		try	{			
			InventarioConstantesFunciones.actualizarSelectedLista(inventario,inventarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Inventario> inventariosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				inventariosLocal=this.inventarioLogic.getInventarios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				inventariosLocal=this.inventarios;
			}
			//ARCHITECTURE
		
			for(Inventario inventarioLocal:inventariosLocal) {
				if(this.permiteMantenimiento(inventarioLocal) && inventarioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+InventarioConstantesFunciones.getInventarioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(InventarioConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInventario.jLabelcodigoInventario,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormInventario!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInventario.jLabelcodigoInventario,"");
		
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
		this.iIdNuevoInventario--;	
		
		
		this.inventarioAux=new Inventario();
		
		this.inventarioAux.setId(this.iIdNuevoInventario);
		this.inventarioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.inventarioLogic.getInventarios().add(this.inventarioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.inventarios.add(this.inventarioAux);
		}
		//ARCHITECTURE
		
		this.inventario=this.inventarioAux;
		
		if(InventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioInventario(this.inventario);
			this.setVariablesObjetoActualToFormularioForeignKeyInventario(this.inventario);
		}
				
		//this.setDefaultControlesInventario();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyInventario();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyInventario();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyInventario();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualInventario(this.inventarioBean,this.inventario,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysInventario(this.inventario);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanInventario(this.inventarioReturnGeneral,this.inventarioBean,false);
		
		if(this.inventarioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyInventario(this.inventarioReturnGeneral.getInventario());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioInventario(this.inventarioReturnGeneral.getInventario());
		}
		
		if(this.inventarioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioInventario(this.inventarioReturnGeneral.getInventario(),classes);//this.inventarioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualInventario(this.inventario,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyInventario();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyInventario();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			InventarioBeanSwingJInternalFrameAdditional.RecargarFormInventario(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingInventario(false);
						
			if(inventarioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(InventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualInventario();
			}
			
			this.actualizarVisualTableDatosInventario();
			
			this.jTableDatosInventario.setRowSelectionInterval(this.getIndiceNuevoInventario(), this.getIndiceNuevoInventario());
			
			this.seleccionarFilaTablaInventarioActual();
						
			this.actualizarEstadoCeldasBotonesInventario("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesInventario(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormInventario.jTextFieldcodigoInventario.setEnabled(isHabilitar && this.inventarioConstantesFunciones.activarcodigoInventario);	
		
	};
	
	public void setDefaultControlesInventario() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoInventario(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.inventarioSessionBean.setConGuardarRelaciones(true);			
			this.inventarioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormInventario.jTabbedPaneRelacionesInventario.setVisible(true);
			
					
		} else {
			//this.inventarioSessionBean.setConGuardarRelaciones(false);			
			this.inventarioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormInventario.jTabbedPaneRelacionesInventario.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoInventario() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Inventario inventarioAux:this.inventarioLogic.getInventarios()) {
				if(inventarioAux.getId().equals(this.iIdNuevoInventario)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Inventario inventarioAux:this.inventarios) {
				if(inventarioAux.getId().equals(this.iIdNuevoInventario)) {
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
	
	public int getIndiceActualInventario(Inventario inventario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Inventario inventarioAux:this.inventarioLogic.getInventarios()) {
				if(inventarioAux.getId().equals(inventario.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Inventario inventarioAux:this.inventarios) {
				if(inventarioAux.getId().equals(inventario.getId())) {
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
	
	public void setCamposBaseDesdeOriginalInventario(Inventario inventarioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Inventario inventarioAux:this.inventarioLogic.getInventarios()) {
				if(inventarioAux.getInventarioOriginal().getId().equals(inventarioOriginal.getId())) {
					existe=true;
					inventarioOriginal.setId(inventarioAux.getId());
					inventarioOriginal.setVersionRow(inventarioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Inventario inventarioAux:this.inventarios) {
				if(inventarioAux.getInventarioOriginal().getId().equals(inventarioOriginal.getId())) {
					existe=true;
					inventarioOriginal.setId(inventarioAux.getId());
					inventarioOriginal.setVersionRow(inventarioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosInventario(Boolean esParaCancelar) throws Exception {
		inventariosAux=new ArrayList<Inventario>();
		inventarioAux=new Inventario();
		
		if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Inventario inventarioAux:this.inventarioLogic.getInventarios()) {
					if(inventarioAux.getId()<0) {
						inventariosAux.add(inventarioAux);
					}		
				}
				this.iIdNuevoInventario=0L;
				this.inventarioLogic.getInventarios().removeAll(inventariosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Inventario inventarioAux:this.inventarios) {
					if(inventarioAux.getId()<0) {
						inventariosAux.add(inventarioAux);
					}		
				}
				this.iIdNuevoInventario=0L;
				this.inventarios.removeAll(inventariosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoInventario 
					&& this.inventarioLogic.getInventarios().size()>0
					) {
					inventarioAux=this.inventarioLogic.getInventarios().get(this.inventarioLogic.getInventarios().size() - 1);
				
					if(inventarioAux.getId()<0) {
						this.inventarioLogic.getInventarios().remove(inventarioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoInventario && this.inventarios.size()>0) {
					inventarioAux=this.inventarios.get(this.inventarios.size() - 1);
				
					if(inventarioAux.getId()<0) {
						this.inventarios.remove(inventarioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoInventario(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(inventario.getId()<0) {
				this.inventarioLogic.getInventarios().remove(this.inventario);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(inventario.getId()<0) {
				this.inventarios.remove(this.inventario);
			}
		}			
	}
	
	public void setEstadosInicialesInventario(List<Inventario> inventariosAux) throws Exception {
		InventarioConstantesFunciones.setEstadosInicialesInventario(inventariosAux);
	}
	
	public void setEstadosInicialesInventario(Inventario inventarioAux) throws Exception {
		InventarioConstantesFunciones.setEstadosInicialesInventario(inventarioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarInventarioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarInventarioActual()) {
				if(!this.isEsNuevoInventario) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoInventario=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarInventarioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Inventario ?", "MANTENIMIENTO DE Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Inventario inventario) throws Exception {
		InventarioConstantesFunciones.seleccionarAsignar(this.inventario,inventario);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarInventario=this.isPermisoActualizarOriginalInventario;
			
			
			this.seleccionarAsignar(inventario);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			InventarioConstantesFunciones.quitarEspaciosInventario(this.inventario,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.inventarioSessionBean.setsFuncionBusquedaRapida(this.inventarioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoInventario) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosInventario(esParaCancelar);				
				this.cancelarNuevoInventario(esParaCancelar);								
			}
			
			this.inventario=new Inventario();
			
			this.inicializarInventario();
			
			this.actualizarEstadoCeldasBotonesInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarInventario() throws Exception {
		try {
			InventarioConstantesFunciones.inicializarInventario(this.inventario);
			
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
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.inventarioLogic.getInventarios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteInventarios(String sAccionBusqueda,List<Inventario> inventariosParaReportes) throws Exception {
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
					sPathReporteFinal="Inventario"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="InventarioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("InventarioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Inventario"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Inventarios");		
		parameters.put("busquedapor", InventarioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceInventario=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			InventarioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			InventarioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceInventario=new JRBeanArrayDataSource(InventarioJInternalFrame.TraerInventarioBeans(inventariosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceInventario);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+InventarioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+InventarioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(InventarioBean.TraerInventarioBeans(inventariosParaReportes).toArray()));
							
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
				this.generarExcelReporteInventarios(sAccionBusqueda,sTipoArchivoReporte,inventariosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalInventarios(sAccionBusqueda,sTipoArchivoReporte,inventariosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoInventarioActionPerformed(null);
					//this.generarExcelReporteInventarios(sAccionBusqueda,sTipoArchivoReporte,inventariosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalInventarios(sAccionBusqueda,sTipoArchivoReporte,inventariosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesInventarios(sAccionBusqueda,sTipoArchivoReporte,inventariosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesInventarios(sAccionBusqueda,sTipoArchivoReporte,inventariosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<Inventario> inventariosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"inventario";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Inventarios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderInventario("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Inventario inventario : inventariosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			InventarioConstantesFunciones.generarExcelReporteDataInventario("NORMAL",row,workbook,inventario,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.inventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderInventario(String sTipo,Row row,Workbook workbook) {
		
		InventarioConstantesFunciones.generarExcelReporteHeaderInventario(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<Inventario> inventariosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"inventario_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Inventarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Inventario inventario : inventariosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(InventarioConstantesFunciones.getInventarioDescripcion(inventario));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InventarioConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InventarioConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(inventario.getcodigo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.inventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<Inventario> inventariosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Inventario> inventariosRespaldo=null;
		
		classes=InventarioConstantesFunciones.getClassesRelationshipsOfInventario(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.inventarioLogic.setDatosCliente(this.datosCliente);
		this.inventarioLogic.setDatosDeep(this.datosDeep);
		this.inventarioLogic.setIsConDeep(true);
		
		inventariosRespaldo=this.inventarioLogic.getInventarios();
		
		this.inventarioLogic.setInventarios(inventariosParaReportes);	
		this.inventarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		inventariosParaReportes=this.inventarioLogic.getInventarios();
		this.inventarioLogic.setInventarios(inventariosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"inventario_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Inventarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderInventario("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Inventario inventario : inventariosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderInventario("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			InventarioConstantesFunciones.generarExcelReporteDataInventario("NORMAL",row,workbook,inventario,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(InventarioConstantesFunciones.getInventarioDescripcion(inventario));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.inventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoInventario.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInventario.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessInventario() throws Exception {		
		this.startProcessInventario(true);
	}
	
	public void startProcessInventario(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesInventario, this.jScrollPanelDatosInventario,this.jPanelPaginacionInventario, this.jScrollPanelDatosEdicionInventario, this.jPanelAccionesInventario,this.jPanelAccionesFormularioInventario,this.jmenuBarInventario,this.jmenuBarDetalleInventario,this.jTtoolBarInventario,this.jTtoolBarDetalleInventario);		
		
		final JTabbedPane jTabbedPaneBusquedasInventario=null; 
		
		final JPanel jPanelParametrosReportesInventario=this.jPanelParametrosReportesInventario;
		//final JScrollPane jScrollPanelDatosInventario=this.jScrollPanelDatosInventario;
		final JTable jTableDatosInventario=this.jTableDatosInventario;		
		final JPanel jPanelPaginacionInventario=this.jPanelPaginacionInventario;
		//final JScrollPane jScrollPanelDatosEdicionInventario=this.jScrollPanelDatosEdicionInventario;
		final JPanel jPanelAccionesInventario=this.jPanelAccionesInventario;
		
		JPanel jPanelCamposAuxiliarInventario=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarInventario=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormInventario!=null) {
			jPanelCamposAuxiliarInventario=this.jInternalFrameDetalleFormInventario.jPanelCamposInventario;
			jPanelAccionesFormularioAuxiliarInventario=this.jInternalFrameDetalleFormInventario.jPanelAccionesFormularioInventario;
		}
		
		final JPanel jPanelCamposInventario=jPanelCamposAuxiliarInventario;
		final JPanel jPanelAccionesFormularioInventario=jPanelAccionesFormularioAuxiliarInventario;
		
		
		final JMenuBar jmenuBarInventario=this.jmenuBarInventario;
		final JToolBar jTtoolBarInventario=this.jTtoolBarInventario;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarInventario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarInventario=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormInventario!=null) {
			jmenuBarDetalleAuxiliarInventario=this.jInternalFrameDetalleFormInventario.jmenuBarDetalleInventario;
			jTtoolBarDetalleAuxiliarInventario=this.jInternalFrameDetalleFormInventario.jTtoolBarDetalleInventario;
		}
		
		final JMenuBar jmenuBarDetalleInventario=jmenuBarDetalleAuxiliarInventario;
		final JToolBar jTtoolBarDetalleInventario=jTtoolBarDetalleAuxiliarInventario;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasInventario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesInventario;
			processRunnable.jTableDatos=jTableDatosInventario;
			processRunnable.jPanelCampos=jPanelCamposInventario;
			processRunnable.jPanelPaginacion=jPanelPaginacionInventario;
			processRunnable.jPanelAcciones=jPanelAccionesInventario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioInventario;
			
			
			processRunnable.jmenuBar=jmenuBarInventario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleInventario;
			processRunnable.jTtoolBar=jTtoolBarInventario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleInventario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasInventario ,jPanelParametrosReportesInventario,jTableDatosInventario, /*jScrollPanelDatosInventario,*/jPanelCamposInventario,jPanelPaginacionInventario, /*jScrollPanelDatosEdicionInventario,*/ jPanelAccionesInventario,jPanelAccionesFormularioInventario,jmenuBarInventario,jmenuBarDetalleInventario,jTtoolBarInventario,jTtoolBarDetalleInventario);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesInventario, jScrollPanelDatosInventario,jPanelPaginacionInventario, jScrollPanelDatosEdicionInventario, jPanelAccionesInventario,jPanelAccionesFormularioInventario,jmenuBarInventario,jmenuBarDetalleInventario,jTtoolBarInventario,jTtoolBarDetalleInventario);
						
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
	
	public void finishProcessInventario() {// throws Exception 
		this.finishProcessInventario(true);
	}
	
	public void finishProcessInventario(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesInventario, this.jScrollPanelDatosInventario,this.jPanelPaginacionInventario, this.jScrollPanelDatosEdicionInventario, this.jPanelAccionesInventario,this.jPanelAccionesFormularioInventario,this.jmenuBarInventario,this.jmenuBarDetalleInventario,this.jTtoolBarInventario,this.jTtoolBarDetalleInventario);		
		
		final JTabbedPane jTabbedPaneBusquedasInventario=null; 
		
		final JPanel jPanelParametrosReportesInventario=this.jPanelParametrosReportesInventario;
		//final JScrollPane jScrollPanelDatosInventario=this.jScrollPanelDatosInventario;
		final JTable jTableDatosInventario=this.jTableDatosInventario;		
		final JPanel jPanelPaginacionInventario=this.jPanelPaginacionInventario;
		//final JScrollPane jScrollPanelDatosEdicionInventario=this.jScrollPanelDatosEdicionInventario;
		final JPanel jPanelAccionesInventario=this.jPanelAccionesInventario;
		
		JPanel jPanelCamposAuxiliarInventario=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarInventario=new JPanel();
		
		if(this.jInternalFrameDetalleFormInventario!=null) {
			jPanelCamposAuxiliarInventario=this.jInternalFrameDetalleFormInventario.jPanelCamposInventario;
			jPanelAccionesFormularioAuxiliarInventario=this.jInternalFrameDetalleFormInventario.jPanelAccionesFormularioInventario;
		}
		
		final JPanel jPanelCamposInventario=jPanelCamposAuxiliarInventario;
		final JPanel jPanelAccionesFormularioInventario=jPanelAccionesFormularioAuxiliarInventario;
		
		
		final JMenuBar jmenuBarInventario=this.jmenuBarInventario;		
		final JToolBar jTtoolBarInventario=this.jTtoolBarInventario;
				
		JMenuBar jmenuBarDetalleAuxiliarInventario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarInventario=new JToolBar();
		
		if(this.jInternalFrameDetalleFormInventario!=null) {
			jmenuBarDetalleAuxiliarInventario=this.jInternalFrameDetalleFormInventario.jmenuBarDetalleInventario;
			jTtoolBarDetalleAuxiliarInventario=this.jInternalFrameDetalleFormInventario.jTtoolBarDetalleInventario;		
		}
		
		final JMenuBar jmenuBarDetalleInventario=jmenuBarDetalleAuxiliarInventario;
		final JToolBar jTtoolBarDetalleInventario=jTtoolBarDetalleAuxiliarInventario;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasInventario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesInventario;
			processRunnable.jTableDatos=jTableDatosInventario;
			processRunnable.jPanelCampos=jPanelCamposInventario;
			processRunnable.jPanelPaginacion=jPanelPaginacionInventario;
			processRunnable.jPanelAcciones=jPanelAccionesInventario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioInventario;
			
			
			processRunnable.jmenuBar=jmenuBarInventario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleInventario;
			processRunnable.jTtoolBar=jTtoolBarInventario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleInventario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasInventario ,jPanelParametrosReportesInventario, jTableDatosInventario,/*jScrollPanelDatosInventario,*/jPanelCamposInventario,jPanelPaginacionInventario, /*jScrollPanelDatosEdicionInventario,*/ jPanelAccionesInventario,jPanelAccionesFormularioInventario,jmenuBarInventario,jmenuBarDetalleInventario,jTtoolBarInventario,jTtoolBarDetalleInventario));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesInventario(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarInventario(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuInventario(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarInventario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarInventario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleInventario,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuInventario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarInventario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleInventario,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.inventarioConstantesFunciones.getsFinalQueryInventario();
		String  finalQueryPaginacionTodos=this.inventarioConstantesFunciones.getsFinalQueryInventario();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=InventarioConstantesFunciones.getArrayColumnasGlobalesNoInventario(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=InventarioConstantesFunciones.getArrayColumnasGlobalesInventario(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,InventarioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.inventariosEliminados= new ArrayList<Inventario>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessInventario();
		
				///*InventarioSessionBean*/this.inventarioSessionBean=new InventarioSessionBean();
			
			if(this.inventarioSessionBean==null) {
				this.inventarioSessionBean=new InventarioSessionBean();
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
					this.iNumeroPaginacion=InventarioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=InventarioConstantesFunciones.getClassesForeignKeysOfInventario(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/inventario."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			inventariosAux= new ArrayList<Inventario>();
			
				
			inventarioLogic.setDatosCliente(this.datosCliente);
			inventarioLogic.setDatosDeep(this.datosDeep);
			inventarioLogic.setIsConDeep(true);
			
			
			inventarioLogic.getInventarioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					inventarioLogic.getTodosInventarios(finalQueryGlobal,pagination);
					
					//inventarioLogic.getTodosInventariosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(inventarioLogic.getInventarios()==null|| inventarioLogic.getInventarios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							inventariosAux= new ArrayList<Inventario>();
							inventariosAux.addAll(inventarioLogic.getInventarios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							inventariosAux= new ArrayList<Inventario>();
							inventariosAux.addAll(inventarios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							inventarioLogic.getTodosInventarios(finalQueryGlobal+"",this.pagination);												
							
							//inventarioLogic.getTodosInventariosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteInventarios("Todos",inventarioLogic.getInventarios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							inventarioLogic.setInventarios(new ArrayList<Inventario>());					
							inventarioLogic.getInventarios().addAll(inventariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							inventarios=new ArrayList<Inventario>();
							inventarios.addAll(inventariosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idInventario=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idInventario=this.idActual;
				
				} else if(this.idInventarioActual!=null && this.idInventarioActual!=0L) {
					idInventario=idInventarioActual;
				}
				
					
				this.sDetalleReporte=InventarioConstantesFunciones.getDetalleIndicePorId(idInventario);
				
				this.inventarios=new ArrayList<Inventario>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					inventarioLogic.getEntity(idInventario);
					
					//inventarioLogic.getEntityWithConnection(idInventario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					inventarioLogic.setInventarios(new ArrayList<Inventario>());
					inventarioLogic.getInventarios().add(inventarioLogic.getInventario());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.inventarios=new ArrayList<Inventario>();
					this.inventarios.add(inventario);
				}
				
				if(inventarioLogic.getInventario()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesInventario();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessInventario();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=inventarioLogic.getInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=inventarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=inventarioLogic.getInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=inventarios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Inventario inventario) {
		Boolean permite=true;
		
		if(this.inventario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=InventarioConstantesFunciones.getOrderByListaInventario();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=InventarioConstantesFunciones.getOrderByListaInventario();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Inventario inventario:inventarioLogic.getInventarios()) {
				if(inventario.getsType().equals(Constantes2.S_TOTALES)) {
					inventarioTotales=inventario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Inventario inventario:this.inventarios) {
				if(inventario.getsType().equals(Constantes2.S_TOTALES)) {
					inventarioTotales=inventario;
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
			this.inventarioAux=new Inventario();
			this.inventarioAux.setsType(Constantes2.S_TOTALES);
			this.inventarioAux.setIsNew(false);
			this.inventarioAux.setIsChanged(false);
			this.inventarioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				InventarioConstantesFunciones.TotalizarValoresFilaInventario(this.inventarioLogic.getInventarios(),this.inventarioAux);
				
				this.inventarioLogic.getInventarios().add(this.inventarioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				InventarioConstantesFunciones.TotalizarValoresFilaInventario(this.inventarios,this.inventarioAux);
				
				this.inventarios.add(this.inventarioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		inventarioTotales=new Inventario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.inventarioLogic.getInventarios().remove(inventarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.inventarios.remove(inventarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		inventarioTotales=new Inventario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Inventario inventario:inventarioLogic.getInventarios()) {
				if(inventario.getsType().equals(Constantes2.S_TOTALES)) {
					inventarioTotales=inventario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				InventarioConstantesFunciones.TotalizarValoresFilaInventario(this.inventarioLogic.getInventarios(),inventarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Inventario inventario:this.inventarios) {
				if(inventario.getsType().equals(Constantes2.S_TOTALES)) {
					inventarioTotales=inventario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				InventarioConstantesFunciones.TotalizarValoresFilaInventario(this.inventarios,inventarioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosInventario() {
		this.isPermisoTodoInventario=false;
		this.isPermisoNuevoInventario=false;
		this.isPermisoActualizarInventario=false;
		this.isPermisoActualizarOriginalInventario=false;
		this.isPermisoEliminarInventario=false;
		this.isPermisoGuardarCambiosInventario=false;
		this.isPermisoConsultaInventario=false;
		this.isPermisoBusquedaInventario=false;
		this.isPermisoReporteInventario=false;		
		this.isPermisoOrdenInventario=false;		
		this.isPermisoPaginacionMedioInventario=false;		
		this.isPermisoPaginacionAltoInventario=false;
		this.isPermisoPaginacionTodoInventario=false;
		this.isPermisoCopiarInventario=false;		
		this.isPermisoVerFormInventario=false;		
		this.isPermisoDuplicarInventario=false;		
		this.isPermisoOrdenInventario=false;		
	}
	
	public void setPermisosUsuarioInventario(Boolean isPermiso) {
		this.isPermisoTodoInventario=isPermiso;
		this.isPermisoNuevoInventario=isPermiso;
		this.isPermisoActualizarInventario=isPermiso;
		this.isPermisoActualizarOriginalInventario=isPermiso;
		this.isPermisoEliminarInventario=isPermiso;
		this.isPermisoGuardarCambiosInventario=isPermiso;
		this.isPermisoConsultaInventario=isPermiso;
		this.isPermisoBusquedaInventario=isPermiso;
		this.isPermisoReporteInventario=isPermiso;
		this.isPermisoOrdenInventario=isPermiso;		
		this.isPermisoPaginacionMedioInventario=isPermiso;		
		this.isPermisoPaginacionAltoInventario=isPermiso;		
		this.isPermisoPaginacionTodoInventario=isPermiso;		
		this.isPermisoCopiarInventario=isPermiso;		
		this.isPermisoVerFormInventario=isPermiso;		
		this.isPermisoDuplicarInventario=isPermiso;
		this.isPermisoOrdenInventario=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioInventario(Boolean isPermiso) {
		//this.isPermisoTodoInventario=isPermiso;
		this.isPermisoNuevoInventario=isPermiso;
		this.isPermisoActualizarInventario=isPermiso;
		this.isPermisoActualizarOriginalInventario=isPermiso;
		this.isPermisoEliminarInventario=isPermiso;
		this.isPermisoGuardarCambiosInventario=isPermiso;
		//this.isPermisoConsultaInventario=isPermiso;
		//this.isPermisoBusquedaInventario=isPermiso;
		//this.isPermisoReporteInventario=isPermiso;
		//this.isPermisoOrdenInventario=isPermiso;		
		//this.isPermisoPaginacionMedioInventario=isPermiso;		
		//this.isPermisoPaginacionAltoInventario=isPermiso;		
		//this.isPermisoPaginacionTodoInventario=isPermiso;		
		//this.isPermisoCopiarInventario=isPermiso;		
		//this.isPermisoDuplicarInventario=isPermiso;
		//this.isPermisoOrdenInventario=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioInventarioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(InventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebInventario(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioInventarioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioInventarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionInventarioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioInventarioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioInventario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(InventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.inventarioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, InventarioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoInventario=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarInventario=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalInventario=this.isPermisoActualizarInventario;
			this.isPermisoEliminarInventario=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosInventario=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaInventario=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaInventario=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoInventario=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteInventario=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenInventario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioInventario=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoInventario=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoInventario=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarInventario=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormInventario=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarInventario=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenInventario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.inventarioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosInventario.setToolTipText(this.jTableDatosInventario.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioInventario(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioInventario(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(InventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(InventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioInventario() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyInventarioListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyInventarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(InventarioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyInventarioListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyInventarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyInventario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyInventario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyInventario(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyInventario()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyInventario();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyInventario(Inventario inventario)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyInventario(Inventario inventario,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyInventario()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyInventario()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyInventario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyInventario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroInventario()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyInventario()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyInventario(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyInventario()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public InventarioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public InventarioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public InventarioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.inventarioSessionBean=new InventarioSessionBean(); 
		this.inventarioConstantesFunciones=new InventarioConstantesFunciones(); 
		this.inventarioBean=new Inventario();//(this.inventarioConstantesFunciones); 		
		this.inventarioReturnGeneral=new InventarioParameterReturnGeneral(); 
		
		this.inventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.inventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public InventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public InventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public InventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessInventario(true);
			
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
			
			this.inventarioConstantesFunciones=new InventarioConstantesFunciones(); 
			this.inventarioBean=new Inventario();//this.inventarioConstantesFunciones); 			
			this.inventarioReturnGeneral=new InventarioParameterReturnGeneral(); 
		
			InventarioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Inventario Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.inventario=new Inventario();
			this.inventarios = new ArrayList<Inventario>();
			this.inventariosAux = new ArrayList<Inventario>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic=new InventarioLogic();
				this.inventarioLogic.getNewConnexionToDeep("");
			}
			
			//this.inventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.inventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormInventario);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoInventario);	
					}
					
					if(this.jInternalFrameImportacionInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionInventario);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByInventario);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormInventario!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormInventario);
				this.jInternalFrameDetalleFormInventario.setVisible(false);
				this.jInternalFrameDetalleFormInventario.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoInventario);
					this.jInternalFrameReporteDinamicoInventario.setVisible(false);
					this.jInternalFrameReporteDinamicoInventario.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionInventario);
					this.jInternalFrameImportacionInventario.setVisible(false);
					this.jInternalFrameImportacionInventario.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByInventario);
					this.jInternalFrameOrderByInventario.setVisible(false);
					this.jInternalFrameOrderByInventario.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idInventarioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=InventarioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.inventarioReturnGeneral=new InventarioParameterReturnGeneral();
			
			this.inventarioParameterGeneral=new InventarioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.inventarioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(InventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.inventarioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,InventarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.inventarioSessionBean.getEsGuardarRelacionado(),this.inventarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,InventarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.inventarioSessionBean.getEsGuardarRelacionado(),this.inventarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoInventario=false;
			this.isVisibilidadCeldaDuplicarInventario=true;
			this.isVisibilidadCeldaCopiarInventario=true;
			this.isVisibilidadCeldaVerFormInventario=true;
			this.isVisibilidadCeldaOrdenInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesInventario=false;
			this.isVisibilidadCeldaModificarInventario=false;
			this.isVisibilidadCeldaActualizarInventario=false;
			this.isVisibilidadCeldaEliminarInventario=false;
			this.isVisibilidadCeldaCancelarInventario=false;
			this.isVisibilidadCeldaGuardarInventario=false;
			this.isVisibilidadCeldaGuardarCambiosInventario=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosInventario();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioInventario(false);
			
			this.setPermisosUsuarioInventario();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.inventarioSessionBean.getEsGuardarRelacionado() 
				|| (this.inventarioSessionBean.getEsGuardarRelacionado() && this.inventarioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioInventarioClasesRelacionadas();
			}
			
			if(this.inventarioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioInventarioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!InventarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosInventario();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualInventario();
			}
			
			if(!this.isPermisoBusquedaInventario) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioInventario,this.isPermisoPaginacionMedioInventario,this.isPermisoPaginacionTodoInventario);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(InventarioConstantesFunciones.getTiposSeleccionarInventario());
				
				this.tiposColumnasSelect=InventarioConstantesFunciones.getTiposSeleccionarInventario(true);
				
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
			//if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioInventario();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioInventario(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioInventario(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesInventario() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				inventarioImplementable= (InventarioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+InventarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				inventarioImplementableHome= (InventarioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+InventarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.inventarios= new ArrayList<Inventario>();
			this.inventariosEliminados= new ArrayList<Inventario>();
						
			this.isEsNuevoInventario=false;
			this.esParaAccionDesdeFormularioInventario=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyInventario(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroInventario();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			InventarioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=InventarioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingInventario(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormInventario!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioInventario();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioInventario();
			}
			
			InventarioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessInventario(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Inventario: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectInventario() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesInventario")) {
				iIndex=this.jInternalFrameDetalleFormInventario.jTabbedPaneRelacionesInventario.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormInventario.jTabbedPaneRelacionesInventario.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosInventario.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessInventario();	
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
	
	public void cargarCombosForeignKeyInventario(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyInventario(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyInventario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyInventarioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyInventario();
		
		this.cargarCombosFrameForeignKeyInventario();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyInventario();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyInventario();
		}
	}
	
	
	
	public void jButtonNuevoInventarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.inventarioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
			
			
			if(jTableDatosInventario.getRowCount()>=1) {
				jTableDatosInventario.removeRowSelectionInterval(0, jTableDatosInventario.getRowCount()-1);						
			}
			
			this.isEsNuevoInventario=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoInventario(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesInventario(true);			
			//this.inventario=new Inventario();
			//this.inventario.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesInventario(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInventario() ;
			
			if(InventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleInventario(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.inventario);	
			this.actualizarInformacion("INFO_PADRE",false,this.inventario);				
			
			InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
			
			if(this.inventarioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Inventario: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarInventarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Inventario> inventariosSeleccionados=new ArrayList<Inventario>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosInventario.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosInventario.getSelectedRows().length;			
			}
			
			inventariosSeleccionados=this.getInventariosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoInventario--;			
				//Inventario inventarioAux= new Inventario();			
				//inventarioAux.setId(this.iIdNuevoInventario);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Inventario inventarioOrigen=new Inventario();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Inventario inventarioOrigen : inventariosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosInventario.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							inventarioOrigen =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							inventarioOrigen =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaInventario();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.inventario.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosInventario(inventarioOrigen,this.inventario,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysInventario(this.inventario);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.inventarioLogic.getInventarios().add(this.inventarioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.inventarios.add(this.inventarioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaInventario(false);
				
				this.jTableDatosInventario.setRowSelectionInterval(this.getIndiceNuevoInventario(), this.getIndiceNuevoInventario());
				
				int iLastRow =  this.jTableDatosInventario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosInventario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosInventario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaInventario(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Inventario> inventariosSeleccionados=new ArrayList<Inventario>();									
		
			Inventario inventarioOrigen=new Inventario();
			Inventario inventarioDestino=new Inventario();
				
			inventariosSeleccionados=this.getInventariosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosInventario.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || inventariosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosInventario.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						inventarioOrigen =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						inventarioOrigen =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						inventarioDestino =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						inventarioDestino =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				inventarioOrigen =inventariosSeleccionados.get(0);
				inventarioDestino =inventariosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosInventario(inventarioOrigen,inventarioDestino,true,false);
				
				inventarioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(inventarioDestino,inventarioLogic.getInventarios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(inventarioDestino,inventarios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaInventario(false);
				
				//this.jTableDatosInventario.setRowSelectionInterval(this.getIndiceNuevoInventario(), this.getIndiceNuevoInventario());
				
				int iLastRow =  this.jTableDatosInventario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosInventario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosInventario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaInventario(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormInventario.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesInventario.isVisible();
			
			
			this.jPanelParametrosReportesInventario.setVisible(!isVisible);
			this.jPanelPaginacionInventario.setVisible(!isVisible);
			this.jPanelAccionesInventario.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameInventario();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByInventario();
			
			this.abrirFrameOrderByInventario();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleInventario(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormInventario);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormInventario.isMaximum()) {
					this.jInternalFrameDetalleFormInventario.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormInventario.setSize(this.jInternalFrameDetalleFormInventario.iWidthFormulario,this.jInternalFrameDetalleFormInventario.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormInventario.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormInventario.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormInventario.isMaximum()) {
						this.jInternalFrameDetalleFormInventario.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormInventario.jContentPaneDetalleInventario.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormInventario.jTabbedPaneRelacionesInventario.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormInventario.jContentPaneDetalleInventario.getWidth(),InventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormInventario.jTabbedPaneRelacionesInventario.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormInventario.jContentPaneDetalleInventario.getWidth(),InventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormInventario.jTabbedPaneRelacionesInventario.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormInventario.jContentPaneDetalleInventario.getWidth(),InventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormInventario.setVisible(true);
	        this.jInternalFrameDetalleFormInventario.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByInventario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByInventario==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInventario,false,this);
				} else {
					this.jInternalFrameOrderByInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInventario,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByInventario);
				this.jInternalFrameOrderByInventario.setVisible(false);
				this.jInternalFrameOrderByInventario.setSelected(false);
				
				this.jInternalFrameOrderByInventario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByInventario"));
				
				this.inicializarActualizarBindingTablaOrderByInventario();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionInventario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionInventario==null) {
				
				this.jInternalFrameImportacionInventario=new ImportacionJInternalFrame(InventarioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionInventario);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionInventario);
				this.jInternalFrameImportacionInventario.setVisible(false);
				this.jInternalFrameImportacionInventario.setSelected(false);


				this.jInternalFrameImportacionInventario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionInventario"));
				this.jInternalFrameImportacionInventario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionInventario"));
				this.jInternalFrameImportacionInventario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionInventario"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoInventario() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoInventario==null) {
				this.jInternalFrameReporteDinamicoInventario=new ReporteDinamicoJInternalFrame(InventarioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoInventario);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoInventario);
				this.jInternalFrameReporteDinamicoInventario.setVisible(false);
				this.jInternalFrameReporteDinamicoInventario.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoInventario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoInventario"));
				this.jInternalFrameReporteDinamicoInventario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoInventario"));
				this.jInternalFrameReporteDinamicoInventario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoInventario"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualInventario();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleInventario() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormInventario);
			
	       	this.jInternalFrameDetalleFormInventario.setVisible(false);
	        this.jInternalFrameDetalleFormInventario.setSelected(false);
			
			//this.jInternalFrameDetalleFormInventario.dispose();
			//this.jInternalFrameDetalleFormInventario=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoInventario() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoInventario.setVisible(true);
	        this.jInternalFrameReporteDinamicoInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionInventario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionInventario.setVisible(true);
	        this.jInternalFrameImportacionInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByInventario() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByInventario.setVisible(true);
	        this.jInternalFrameOrderByInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByInventario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByInventario.setVisible(false);
	        this.jInternalFrameOrderByInventario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoInventario() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoInventario.setVisible(false);
	        this.jInternalFrameReporteDinamicoInventario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionInventario() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionInventario.setVisible(false);
	        this.jInternalFrameImportacionInventario.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarInventario(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarInventario(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosInventario.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesInventario(true);
			//this.isEsNuevoInventario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventario =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.inventario =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesInventario(false) ;
			
			if(inventarioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(InventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleInventario(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInventario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaInventarioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventario =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.inventario =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarInventario(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosInventario.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesInventario(true);
			//this.isEsNuevoInventario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventario =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.inventario =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.inventario.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesInventario(false) ;
			
			if(InventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleInventario(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInventario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesInventario(false);
			
			//if(!this.isEsNuevoInventario) {								
				int intSelectedRow = this.jTableDatosInventario.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventario =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.inventario =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(InventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualInventario(this.inventario,true);
				this.setVariablesFormularioToObjetoActualForeignKeysInventario(this.inventario);
				
			}
			
			if(this.permiteMantenimiento(this.inventario)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.inventarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoInventario=true;
					this.inicializarActualizarBindingTablaInventario(false);
					this.isEsNuevoInventario=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoInventario=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoInventario=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesInventario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualInventario(false);
				
				this.habilitarDeshabilitarControlesInventario(false);
			
												
				
				if(InventarioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleInventario();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoInventarioActionPerformed(evt,inventarioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualInventario(this.inventario,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosInventario.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,inventarioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.inventario.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Inventario.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Inventario.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosInventario.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventario =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				this.inventario.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.inventario =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				this.inventario.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.inventario)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.inventarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((InventarioModel) this.jTableDatosInventario.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoInventario=true;
				this.inicializarActualizarBindingTablaInventario(false);
				this.isEsNuevoInventario=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesInventario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualInventario(false);
				
				this.habilitarDeshabilitarControlesInventario(false);
				
				
				
				if(InventarioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleInventario();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarInventarioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosInventario.getRowCount()>=1) {
				jTableDatosInventario.removeRowSelectionInterval(0, jTableDatosInventario.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesInventario(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaInventario(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesInventario(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInventario(false) ;
			
			this.isEsNuevoInventario=false;
			
			if(InventarioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleInventario();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingInventario(false);
				
				//SI ES MANUAL
				if(InventarioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualInventario();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoInventario--;			
			//Inventario inventarioAux= new Inventario();			
			//inventarioAux.setId(this.iIdNuevoInventario);
			
			if(this.jInternalFrameDetalleFormInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaInventario();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysInventario(this.inventario);
			
			this.inventario.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.inventarioLogic.getInventarios().add(this.inventarioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.inventarios.add(this.inventarioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaInventario(false);
			
			this.jTableDatosInventario.setRowSelectionInterval(this.getIndiceNuevoInventario(), this.getIndiceNuevoInventario());
			
			int iLastRow =  this.jTableDatosInventario.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosInventario.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosInventario.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaInventario(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingInventario(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInventario(false);
			
			//SI ES MANUAL
			if(InventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualInventario();
			}
			
			//this.abrirFrameTreeInventario();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionInventarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE InventarioS ?", "MANTENIMIENTO DE Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionInventario.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralInventario();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.inventarioReturnGeneral=inventarioLogic.procesarImportacionInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.inventarioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarInventarioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionInventarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionInventario.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionInventario.setFileImportacion(this.jInternalFrameImportacionInventario.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionInventario.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionInventario.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionInventario.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionInventario.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Inventario> inventariosSeleccionados=new ArrayList<Inventario>();		

		inventariosSeleccionados=this.getInventariosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInventario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInventario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("InventarioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"InventarioBaseDesign.jrxml";
			
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
			
			this.generarReporteInventarios("Todos",inventariosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.inventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case InventarioConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoInventario.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoInventario.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoInventario.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case InventarioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoInventario.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case InventarioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoInventario.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInventario.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case InventarioConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
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
	
	public void jButtonGenerarExcelReporteDinamicoInventarioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Inventario> inventariosSeleccionados=new ArrayList<Inventario>();		
		
		inventariosSeleccionados=this.getInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"inventario";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Inventarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case InventarioConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InventarioConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Inventario inventario:inventariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(inventario.getcodigo());
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
			//	this.getFilaCabeceraExportarExcelInventario(row);				
			//	iRow++;
			//}				
			
			//for(Inventario inventarioAux:inventariosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelInventario(inventarioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.inventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Inventario",JOptionPane.INFORMATION_MESSAGE);
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
				this.inventarioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInventario(false);
			
			//SI ES MANUAL
			if(InventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualInventario();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInventario(false);
			
			//SI ES MANUAL
			if(InventarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualInventario();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInventario(false);
			
			//SI ES MANUAL
			if(InventarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualInventario();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.inventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaInventario() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosInventario.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosInventario.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosInventario.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosInventario.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosInventario.setMinimumSize(dimensionMinimum);
		this.jTableDatosInventario.setMaximumSize(dimensionMaximum);
		this.jTableDatosInventario.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingInventario(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingInventario(esInicializar,true);
	}
	
	public void inicializarActualizarBindingInventario(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaInventario(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesInventario(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasInventario(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesInventario(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesInventario(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !InventarioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!InventarioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualInventario() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaInventario();
		
		this.inicializarActualizarBindingBotonesManualInventario(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualInventario();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesInventario() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualInventario(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualInventario(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosInventario.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosInventario.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteInventario.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormInventario!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormInventario.jCheckBoxPostAccionNuevoInventario.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormInventario.jCheckBoxPostAccionSinCerrarInventario.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormInventario.jCheckBoxPostAccionSinMensajeInventario.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosInventario.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosInventario.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteInventario.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormInventario!=null) {
				this.jInternalFrameDetalleFormInventario.jCheckBoxPostAccionNuevoInventario.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormInventario.jCheckBoxPostAccionSinCerrarInventario.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormInventario.jCheckBoxPostAccionSinMensajeInventario.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionInventario.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionInventario.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormInventario!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormInventario.jComboBoxTiposAccionesFormularioInventario.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesInventario.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoInventario!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInventario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesInventario.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesInventario.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarInventario.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesInventario.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoInventario!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInventario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesInventario.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralInventario.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesInventario(Boolean esInicializar) throws Exception {
		try	{	
			if(InventarioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualInventario(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesInventario() throws Exception {
		try	{
			if(InventarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualInventario();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleInventario() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormInventario.jComboBoxTiposAccionesFormularioInventario.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormInventario.jComboBoxTiposAccionesFormularioInventario.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualInventario() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesInventario.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesInventario.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesInventario.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionInventario.addItem(reporte);
			}
			
			
			if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionInventario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionInventario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesInventario.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesInventario.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormInventario.jComboBoxTiposAccionesFormularioInventario.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormInventario.jComboBoxTiposAccionesFormularioInventario.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarInventario.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarInventario.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualInventario();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualInventario() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoInventario!=null) {
				this.jInternalFrameReporteDinamicoInventario.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoInventario.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoInventario!=null) {
				this.jInternalFrameReporteDinamicoInventario.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoInventario.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoInventario!=null) {
				
				if(this.jInternalFrameReporteDinamicoInventario.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoInventario.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoInventario.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoInventario.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoInventario.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoInventario.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualInventario()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasInventario(Boolean esInicializar) throws Exception {				
		if(InventarioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualInventario();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaInventario() throws Exception {
		this.inicializarActualizarBindingTablaInventario(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByInventario() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByInventario.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByInventario.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new InventarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByInventario.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new InventarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosInventarioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInventarioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new InventarioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByInventario.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new InventarioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByInventario.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaInventario(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=inventarioLogic.getInventarios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=inventarios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(InventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosInventario.setModel(new InventarioModel(this.inventarioLogic.getInventarios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosInventario.setModel(new InventarioModel(this.inventarios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByInventario!=null && this.jInternalFrameOrderByInventario.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByInventario();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInventario,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new InventarioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+InventarioConstantesFunciones.SCLASSWEBTITULO,inventarioConstantesFunciones.resaltarSeleccionarInventario,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+InventarioConstantesFunciones.SCLASSWEBTITULO,inventarioConstantesFunciones.resaltarSeleccionarInventario,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInventario,InventarioConstantesFunciones.LABEL_ID));

		if(this.inventarioConstantesFunciones.mostraridInventario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InventarioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.inventarioConstantesFunciones.resaltaridInventario,this.inventarioConstantesFunciones.activaridInventario,this,true,"idInventario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.inventarioConstantesFunciones.resaltaridInventario,this.inventarioConstantesFunciones.activaridInventario,this,true,"idInventario","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInventario,InventarioConstantesFunciones.LABEL_CODIGO));

		if(this.inventarioConstantesFunciones.mostrarcodigoInventario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InventarioConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.inventarioConstantesFunciones.resaltarcodigoInventario,this.inventarioConstantesFunciones.activarcodigoInventario,this,true,"codigoInventario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.inventarioConstantesFunciones.resaltarcodigoInventario,this.inventarioConstantesFunciones.activarcodigoInventario,this,true,"codigoInventario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InventarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.inventarioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.inventarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.inventarioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosInventario.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.inventarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.inventarioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosInventario.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarInventario && this.isPermisoGuardarCambiosInventario) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.inventarioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.inventarioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosInventario.addColumn(tableColumn);
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
			
			this.jTableDatosInventario.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarInventario && this.isPermisoGuardarCambiosInventario) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarInventario && this.isPermisoGuardarCambiosInventario) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosInventario.moveColumn(this.jTableDatosInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosInventario.moveColumn(this.jTableDatosInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosInventario.moveColumn(this.jTableDatosInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosInventario.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosInventario.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosInventario,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!InventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosInventario.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosInventario.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!InventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!InventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosInventario.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosInventario.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosInventario.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=inventarioLogic.getInventarios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=inventarios.size()-1;
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
		//this.jTableDatosInventario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosInventario();
			
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
				
				//this.isEsNuevoInventario=false;
					
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
			
				if(this.inventarioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormInventario==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosInventario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosInventario.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventario =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.inventario =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.inventario.getsType().equals("DUPLICADO")
				   || this.inventario.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoInventario=true;
				
				} else {
					this.isEsNuevoInventario=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {
					if(this.inventario.getId()>=0 && !this.inventario.getIsNew()) {						
						this.isEsNuevoInventario=false;
						
					} else {
						this.isEsNuevoInventario=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoInventario(esRelaciones);						
				
				this.seleccionarInventario(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.inventario.getId()<0) {
					this.isEsNuevoInventario=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarInventario(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarInventario(evt,rowIndex);
				}	
				
				if(this.inventarioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Inventario: " + this.dDif); 
					}
				}								
				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarInventario(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.inventario)) {
					if(this.inventario.getId()>0) {
						this.inventario.setIsDeleted(true);
						
						this.inventariosEliminados.add(this.inventario);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.inventarioLogic.getInventarios().remove(this.inventario);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.inventarios.remove(this.inventario);				
					}
					
					
					((InventarioModel) this.jTableDatosInventario.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaInventario(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarInventario(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoInventario) {
			
			if(this.jInternalFrameDetalleFormInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosInventario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosInventario.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventario =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.inventario =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(InventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioInventario(this.inventario);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesInventario("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesInventario(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualInventario() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoInventario(Inventario inventario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoInventario(inventario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoInventario(Inventario inventario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioInventario(inventario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyInventario(inventario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyInventario(inventario);
	}
	
	public void setVariablesObjetoActualToFormularioInventario(Inventario inventario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormInventario.jLabelidInventario.setText(inventario.getId().toString());
			this.jInternalFrameDetalleFormInventario.jTextFieldcodigoInventario.setText(inventario.getcodigo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Inventario inventarioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,inventarioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Inventario inventarioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				inventarioLocal=this.inventario;
			} else {
				inventarioLocal=this.inventarioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(inventarioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoInventario(inventarioLocal,true);
					
					if(inventarioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(inventarioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.inventarioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(inventarioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoInventario(Inventario inventario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualInventario(inventario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysInventario(inventario);
	}
	
	public void setVariablesFormularioToObjetoActualInventario(Inventario inventario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualInventario(inventario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualInventario(Inventario inventario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormInventario.jLabelidInventario.getText()==null || this.jInternalFrameDetalleFormInventario.jLabelidInventario.getText()=="" || this.jInternalFrameDetalleFormInventario.jLabelidInventario.getText()=="Id") {
				this.jInternalFrameDetalleFormInventario.jLabelidInventario.setText("0");
			}

			if(conColumnasBase) {inventario.setId(Long.parseLong(this.jInternalFrameDetalleFormInventario.jLabelidInventario.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InventarioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInventario.jLabelIdInventario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			inventario.setcodigo(this.jInternalFrameDetalleFormInventario.jTextFieldcodigoInventario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InventarioConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInventario.jLabelcodigoInventario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualInventario(Inventario inventarioBean,Inventario inventario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosInventario(Inventario inventarioOrigen,Inventario inventario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && inventarioOrigen.getId()!=null && !inventarioOrigen.getId().equals(0L))) {inventario.setId(inventarioOrigen.getId());}}
			if(conDefault || (!conDefault && inventarioOrigen.getcodigo()!=null && !inventarioOrigen.getcodigo().equals(""))) {inventario.setcodigo(inventarioOrigen.getcodigo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioInventario(Inventario inventario) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormInventario.jLabelidInventario.setText(inventario.getId().toString());
			this.jInternalFrameDetalleFormInventario.jTextFieldcodigoInventario.setText(inventario.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioInventario(InventarioBean inventarioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormInventario.jLabelidInventario.setText(inventarioBean.getId().toString());
			this.jInternalFrameDetalleFormInventario.jTextFieldcodigoInventario.setText(inventarioBean.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanInventario(InventarioParameterReturnGeneral inventarioReturnGeneral,InventarioBean inventarioBean,Boolean conDefault) throws Exception { 
		try {
			Inventario inventarioLocal=new Inventario();
			
			inventarioLocal=inventarioReturnGeneral.getInventario();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && inventarioLocal.getId()!=null && !inventarioLocal.getId().equals(0L))) {inventarioBean.setId(inventarioLocal.getId());}}
			if(conDefault || (!conDefault && inventarioLocal.getcodigo()!=null && !inventarioLocal.getcodigo().equals(""))) {inventarioBean.setcodigo(inventarioLocal.getcodigo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxInventarioGenerico(Long idInventarioSeleccionado,JComboBox jComboBoxInventario,List<Inventario> inventariosLocal)throws Exception {
		try {
			Inventario  inventarioTemp=null;

			for(Inventario inventarioAux:inventariosLocal) {
				if(inventarioAux.getId()!=null && inventarioAux.getId().equals(idInventarioSeleccionado)) {
					inventarioTemp=inventarioAux;
					break;
				}
			}

			jComboBoxInventario.setSelectedItem(inventarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxInventarioGenerico(JComboBox jComboBoxInventario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxInventario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxInventario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxInventario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxInventario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			inventario=(Inventario) inventarioLogic.getInventarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			inventario =(Inventario) inventarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Inventario inventarioRow=new Inventario();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			inventarioRow=(Inventario) inventarioLogic.getInventarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			inventarioRow=(Inventario) inventarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualInventario(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoInventario.setVisible((this.isVisibilidadCeldaNuevoInventario && this.isPermisoNuevoInventario));			
			this.jButtonDuplicarInventario.setVisible((this.isVisibilidadCeldaDuplicarInventario && this.isPermisoDuplicarInventario));			
			this.jButtonCopiarInventario.setVisible((this.isVisibilidadCeldaCopiarInventario && this.isPermisoCopiarInventario));
			this.jButtonVerFormInventario.setVisible((this.isVisibilidadCeldaVerFormInventario && this.isPermisoVerFormInventario));
			
			this.jButtonAbrirOrderByInventario.setVisible((this.isVisibilidadCeldaOrdenInventario && this.isPermisoOrdenInventario));			
			
			this.jButtonNuevoRelacionesInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesInventario && this.isPermisoNuevoInventario));			
			this.jButtonNuevoGuardarCambiosInventario.setVisible((this.isVisibilidadCeldaNuevoInventario && this.isPermisoNuevoInventario && this.isPermisoGuardarCambiosInventario));
			
			if(this.jInternalFrameDetalleFormInventario!=null) {
			this.jInternalFrameDetalleFormInventario.jButtonModificarInventario.setVisible((this.isVisibilidadCeldaModificarInventario && this.isPermisoActualizarInventario));	
			this.jInternalFrameDetalleFormInventario.jButtonActualizarInventario.setVisible((this.isVisibilidadCeldaActualizarInventario && this.isPermisoActualizarInventario));	
			this.jInternalFrameDetalleFormInventario.jButtonEliminarInventario.setVisible((this.isVisibilidadCeldaEliminarInventario && this.isPermisoEliminarInventario));
			this.jInternalFrameDetalleFormInventario.jButtonCancelarInventario.setVisible(this.isVisibilidadCeldaCancelarInventario);							
			this.jInternalFrameDetalleFormInventario.jButtonGuardarCambiosInventario.setVisible((this.isVisibilidadCeldaGuardarInventario && this.isPermisoGuardarCambiosInventario));			
			
			}
						
			this.jButtonGuardarCambiosTablaInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosInventario && this.isPermisoGuardarCambiosInventario));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarInventario.setVisible((this.isVisibilidadCeldaNuevoInventario && this.isPermisoNuevoInventario));						
			this.jButtonDuplicarToolBarInventario.setVisible((this.isVisibilidadCeldaDuplicarInventario && this.isPermisoDuplicarInventario));						
			this.jButtonCopiarToolBarInventario.setVisible((this.isVisibilidadCeldaCopiarInventario && this.isPermisoCopiarInventario));			
			this.jButtonVerFormToolBarInventario.setVisible((this.isVisibilidadCeldaVerFormInventario && this.isPermisoVerFormInventario));			
			this.jButtonAbrirOrderByToolBarInventario.setVisible((this.isVisibilidadCeldaOrdenInventario && this.isPermisoOrdenInventario));
			this.jButtonNuevoRelacionesToolBarInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesInventario && this.isPermisoNuevoInventario));			
			this.jButtonNuevoGuardarCambiosToolBarInventario.setVisible((this.isVisibilidadCeldaNuevoInventario && this.isPermisoNuevoInventario && this.isPermisoGuardarCambiosInventario));			
			
			if(this.jInternalFrameDetalleFormInventario!=null) {
			this.jInternalFrameDetalleFormInventario.jButtonModificarToolBarInventario.setVisible((this.isVisibilidadCeldaModificarInventario && this.isPermisoActualizarInventario));	
			this.jInternalFrameDetalleFormInventario.jButtonActualizarToolBarInventario.setVisible((this.isVisibilidadCeldaActualizarInventario  && this.isPermisoActualizarInventario));	
			this.jInternalFrameDetalleFormInventario.jButtonEliminarToolBarInventario.setVisible((this.isVisibilidadCeldaEliminarInventario && this.isPermisoEliminarInventario));
			this.jInternalFrameDetalleFormInventario.jButtonCancelarToolBarInventario.setVisible(this.isVisibilidadCeldaCancelarInventario);				
			this.jInternalFrameDetalleFormInventario.jButtonGuardarCambiosToolBarInventario.setVisible((this.isVisibilidadCeldaGuardarInventario && this.isPermisoGuardarCambiosInventario));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosInventario && this.isPermisoGuardarCambiosInventario));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoInventario.setVisible((this.isVisibilidadCeldaNuevoInventario && this.isPermisoNuevoInventario));			
			this.jMenuItemDuplicarInventario.setVisible((this.isVisibilidadCeldaDuplicarInventario && this.isPermisoDuplicarInventario));			
			this.jMenuItemCopiarInventario.setVisible((this.isVisibilidadCeldaCopiarInventario && this.isPermisoCopiarInventario));			
			this.jMenuItemVerFormInventario.setVisible((this.isVisibilidadCeldaVerFormInventario && this.isPermisoVerFormInventario));			
			this.jMenuItemAbrirOrderByInventario.setVisible((this.isVisibilidadCeldaOrdenInventario && this.isPermisoOrdenInventario));			
			//this.jMenuItemMostrarOcultarInventario.setVisible((this.isVisibilidadCeldaOrdenInventario && this.isPermisoOrdenInventario));
			this.jMenuItemDetalleAbrirOrderByInventario.setVisible((this.isVisibilidadCeldaOrdenInventario && this.isPermisoOrdenInventario));			
			//this.jMenuItemDetalleMostrarOcultarInventario.setVisible((this.isVisibilidadCeldaOrdenInventario && this.isPermisoOrdenInventario));			
			this.jMenuItemNuevoRelacionesInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesInventario && this.isPermisoNuevoInventario));			
			this.jMenuItemNuevoGuardarCambiosInventario.setVisible((this.isVisibilidadCeldaNuevoInventario && this.isPermisoNuevoInventario && this.isPermisoGuardarCambiosInventario));									
			
			if(this.jInternalFrameDetalleFormInventario!=null) {
			this.jInternalFrameDetalleFormInventario.jMenuItemModificarInventario.setVisible((this.isVisibilidadCeldaModificarInventario && this.isPermisoActualizarInventario));	
			this.jInternalFrameDetalleFormInventario.jMenuItemActualizarInventario.setVisible((this.isVisibilidadCeldaActualizarInventario && this.isPermisoActualizarInventario));	
			this.jInternalFrameDetalleFormInventario.jMenuItemEliminarInventario.setVisible((this.isVisibilidadCeldaEliminarInventario && this.isPermisoEliminarInventario));
			this.jInternalFrameDetalleFormInventario.jMenuItemCancelarInventario.setVisible(this.isVisibilidadCeldaCancelarInventario);				
			}
			
			this.jMenuItemGuardarCambiosInventario.setVisible((this.isVisibilidadCeldaGuardarInventario && this.isPermisoGuardarCambiosInventario));						
			this.jMenuItemGuardarCambiosTablaInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosInventario && this.isPermisoGuardarCambiosInventario));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoInventario=this.jButtonNuevoInventario.isVisible();
			this.isVisibilidadCeldaDuplicarInventario=this.jButtonDuplicarInventario.isVisible();
			this.isVisibilidadCeldaCopiarInventario=this.jButtonCopiarInventario.isVisible();
			this.isVisibilidadCeldaVerFormInventario=this.jButtonVerFormInventario.isVisible();
			
			this.isVisibilidadCeldaOrdenInventario=this.jButtonAbrirOrderByInventario.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesInventario=this.jButtonNuevoRelacionesInventario.isVisible();
			this.isVisibilidadCeldaModificarInventario=this.jButtonModificarInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormInventario!=null) {
			this.isVisibilidadCeldaActualizarInventario=this.jInternalFrameDetalleFormInventario.jButtonActualizarInventario.isVisible();
			this.isVisibilidadCeldaEliminarInventario=this.jInternalFrameDetalleFormInventario.jButtonEliminarInventario.isVisible();
			this.isVisibilidadCeldaCancelarInventario=this.jInternalFrameDetalleFormInventario.jButtonCancelarInventario.isVisible();
			this.isVisibilidadCeldaGuardarInventario=this.jInternalFrameDetalleFormInventario.jButtonGuardarCambiosInventario.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosInventario=this.jButtonGuardarCambiosTablaInventario.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoInventario=this.jButtonNuevoToolBarInventario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesInventario=this.jButtonNuevoRelacionesToolBarInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormInventario!=null) {
			this.isVisibilidadCeldaModificarInventario=this.jInternalFrameDetalleFormInventario.jButtonModificarToolBarInventario.isVisible();
			this.isVisibilidadCeldaActualizarInventario=this.jInternalFrameDetalleFormInventario.jButtonActualizarToolBarInventario.isVisible();
			this.isVisibilidadCeldaEliminarInventario=this.jInternalFrameDetalleFormInventario.jButtonEliminarToolBarInventario.isVisible();
			this.isVisibilidadCeldaCancelarInventario=this.jInternalFrameDetalleFormInventario.jButtonCancelarToolBarInventario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarInventario=this.jButtonGuardarCambiosToolBarInventario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosInventario=this.jButtonGuardarCambiosTablaToolBarInventario.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoInventario=this.jMenuItemNuevoInventario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesInventario=this.jMenuItemNuevoRelacionesInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormInventario!=null) {
			this.isVisibilidadCeldaModificarInventario=this.jInternalFrameDetalleFormInventario.jMenuItemModificarInventario.isVisible();
			this.isVisibilidadCeldaActualizarInventario=this.jInternalFrameDetalleFormInventario.jMenuItemActualizarInventario.isVisible();
			this.isVisibilidadCeldaEliminarInventario=this.jInternalFrameDetalleFormInventario.jMenuItemEliminarInventario.isVisible();
			this.isVisibilidadCeldaCancelarInventario=this.jInternalFrameDetalleFormInventario.jMenuItemCancelarInventario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarInventario=this.jMenuItemGuardarCambiosInventario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosInventario=this.jMenuItemGuardarCambiosTablaInventario.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesInventario(Boolean esInicializar) {
		if(InventarioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.inventarioSessionBean.getConGuardarRelaciones()) {
				//if(this.inventarioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesInventario();
			}
			
			this.inicializarActualizarBindingBotonesManualInventario(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualInventario() {
		this.jButtonNuevoInventario.setVisible(this.isPermisoNuevoInventario);			
		this.jButtonDuplicarInventario.setVisible(this.isPermisoDuplicarInventario);			
		this.jButtonCopiarInventario.setVisible(this.isPermisoCopiarInventario);			
		this.jButtonVerFormInventario.setVisible(this.isPermisoVerFormInventario);			
		
		this.jButtonAbrirOrderByInventario.setVisible(this.isPermisoOrdenInventario);					
		
		this.jButtonNuevoRelacionesInventario.setVisible(this.isPermisoNuevoInventario);			
		
		if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInventario.jButtonModificarInventario.setVisible(this.isPermisoActualizarInventario);	
			this.jInternalFrameDetalleFormInventario.jButtonActualizarInventario.setVisible(this.isPermisoActualizarInventario);	
			this.jInternalFrameDetalleFormInventario.jButtonEliminarInventario.setVisible(this.isPermisoEliminarInventario);
			this.jInternalFrameDetalleFormInventario.jButtonCancelarInventario.setVisible(this.isVisibilidadCeldaCancelarInventario);						
			this.jInternalFrameDetalleFormInventario.jButtonGuardarCambiosInventario.setVisible(this.isPermisoGuardarCambiosInventario);							
		}
		
		this.jButtonGuardarCambiosTablaInventario.setVisible(this.isPermisoActualizarInventario);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleInventario() {
		this.jInternalFrameDetalleFormInventario.jButtonModificarInventario.setVisible(this.isPermisoActualizarInventario);	
		this.jInternalFrameDetalleFormInventario.jButtonActualizarInventario.setVisible(this.isPermisoActualizarInventario);	
		this.jInternalFrameDetalleFormInventario.jButtonEliminarInventario.setVisible(this.isPermisoEliminarInventario);
		this.jInternalFrameDetalleFormInventario.jButtonCancelarInventario.setVisible(this.isVisibilidadCeldaCancelarInventario);							
		this.jInternalFrameDetalleFormInventario.jButtonGuardarCambiosInventario.setVisible((this.isVisibilidadCeldaGuardarInventario && this.isPermisoGuardarCambiosInventario));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosInventario() {
		if(InventarioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualInventario();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesInventario() {
	}
	
	public void jTableDatosInventarioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarInventario(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidInventarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInventario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInventario(this.getinventario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInventario(this.inventario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.inventario =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.inventario =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.inventario==null) {
						this.inventario = new Inventario();
					}

					this.setVariablesFormularioToObjetoActualInventario(this.inventario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInventario(this.inventario);
				}

				if(this.inventario.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.inventario.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInventario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoInventarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInventario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInventario(this.getinventario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInventario(this.inventario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.inventario =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.inventario =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.inventario==null) {
						this.inventario = new Inventario();
					}

					this.setVariablesFormularioToObjetoActualInventario(this.inventario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInventario(this.inventario);
				}

				if(this.inventario.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.inventario.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInventario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameInventario() {
		if(this.jInternalFrameDetalleFormInventario!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormInventario!=null) {
			this.jInternalFrameDetalleFormInventario.setVisible(false);	    			
			this.jInternalFrameDetalleFormInventario.dispose();
			this.jInternalFrameDetalleFormInventario=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoInventario!=null) {
			this.jInternalFrameReporteDinamicoInventario.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoInventario.dispose();
			this.jInternalFrameReporteDinamicoInventario=null;
		}
		
		if(this.jInternalFrameImportacionInventario!=null) {
			this.jInternalFrameImportacionInventario.setVisible(false);	    			
			this.jInternalFrameImportacionInventario.dispose();
			this.jInternalFrameImportacionInventario=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessInventario();
			
			InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
			
			
			if(sTipo.equals("NuevoInventario")) {
				jButtonNuevoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarInventario")) {
				jButtonDuplicarInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarInventario")) {
				jButtonCopiarInventarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormInventario")) {
				jButtonVerFormInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarInventario")) {
				jButtonNuevoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarInventario")) {
				jButtonDuplicarInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoInventario")) {
				jButtonNuevoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarInventario")) {
				jButtonDuplicarInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesInventario")) {
				jButtonNuevoInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarInventario")) {
				jButtonNuevoInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesInventario")) {
				jButtonNuevoInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarInventario")) {
				jButtonModificarInventarioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarInventario")) {
				jButtonModificarInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarInventario")) {
				jButtonModificarInventarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarInventario")) {
				jButtonActualizarInventarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarInventario")) {
				jButtonActualizarInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarInventario")) {
				jButtonActualizarInventarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarInventario")) {
				jButtonEliminarInventarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarInventario")) {
				jButtonEliminarInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarInventario")) {
				jButtonEliminarInventarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarInventario")) {
				jButtonCancelarInventarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarInventario")) {
				jButtonCancelarInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarInventario")) {
				jButtonCancelarInventarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarInventario")) {
				jButtonCerrarInventarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarInventario")) {
				jButtonCerrarInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarInventario")) {
				jButtonCerrarInventarioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarInventario")) {
				jButtonMostrarOcultarInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarInventario")) {
				jButtonCancelarInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosInventario")) {
				jButtonGuardarCambiosInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarInventario")) {
				jButtonGuardarCambiosInventarioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarInventario")) {
				jButtonCopiarInventarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarInventario")) {
				jButtonVerFormInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosInventario")) {
				jButtonGuardarCambiosInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarInventario")) {
				jButtonCopiarInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormInventario")) {
				jButtonVerFormInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaInventario")) {
				jButtonGuardarCambiosInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarInventario")) {
				jButtonGuardarCambiosInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaInventario")) {
				jButtonGuardarCambiosInventarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionInventario")) {
				jButtonRecargarInformacionInventarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarInventario")) {
				jButtonRecargarInformacionInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionInventario")) {
				jButtonRecargarInformacionInventarioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresInventario")) {
				jButtonAnterioresInventarioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarInventario")) {
				jButtonAnterioresInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreInventario")) {
				jButtonAnterioresInventarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesInventario")) {
				jButtonSiguientesInventarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarInventario")) {
				jButtonSiguientesInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesInventario")) {
				jButtonSiguientesInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByInventario") || sTipo.equals("MenuItemDetalleAbrirOrderByInventario")) {
				jButtonAbrirOrderByInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarInventario") || sTipo.equals("MenuItemDetalleMostrarOcultarInventario")) {
				jButtonMostrarOcultarInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosInventario")) {
				jButtonNuevoGuardarCambiosInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarInventario")) {
				jButtonNuevoGuardarCambiosInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosInventario")) {
				jButtonNuevoGuardarCambiosInventarioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoInventario")) {
				jButtonCerrarReporteDinamicoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoInventario")) {
				jButtonGenerarReporteDinamicoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoInventario")) {
				
				jButtonGenerarExcelReporteDinamicoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionInventario")) {
				jButtonCerrarImportacionInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionInventario")) {
				
				jButtonGenerarImportacionInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionInventario")) {
				
				jButtonAbrirImportacionInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesInventario")) {
				jComboBoxTiposAccionesInventarioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesInventario")) {
				jComboBoxTiposRelacionesInventarioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioInventario")) {
				jComboBoxTiposAccionesInventarioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarInventario")) {
				
				jComboBoxTiposSeleccionarInventarioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralInventario")) {
				jTextFieldValorCampoGeneralInventarioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByInventario")) {
				jButtonAbrirOrderByInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarInventario")) {
				jButtonAbrirOrderByInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByInventario")) {
				jButtonCerrarOrderByInventarioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idInventarioBusqueda")) {
				this.jButtonidInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoInventarioBusqueda")) {
				this.jButtoncodigoInventarioBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessInventario();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInventarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.inventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.inventario);
				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
				
				


				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Inventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Inventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Inventario inventarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				inventarioLocal=this.inventario;
			} else {
				inventarioLocal=this.inventarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.inventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.inventario);
				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
							
				
				


				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Inventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Inventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventarioAnterior =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.inventarioAnterior =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
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
			
			InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
			
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
			
			


			
			InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInventarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.inventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.inventario);
				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
								
						
				


				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Inventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Inventario.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.inventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.inventario);
				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
								
				
				


				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Inventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Inventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventarioAnterior =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.inventarioAnterior =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.inventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.inventario);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventarioAnterior =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.inventarioAnterior =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInventarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.inventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.inventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.inventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.inventario);
				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
							
				
				


				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Inventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Inventario.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInventarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosInventario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.inventarioAnterior =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.inventarioAnterior =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
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
			
			InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
			
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
			
			


			
			InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInventarioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.inventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.inventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.inventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.inventario);
				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
								
				
				


				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Inventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Inventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventarioAnterior =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.inventarioAnterior =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInventarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.inventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.inventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInventarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.inventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.inventario);
				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosInventario")) {
					jCheckBoxSeleccionarTodosInventarioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosInventario")) {
					jCheckBoxSeleccionadosInventarioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarInventario")) {
					
				}
				
				


				
				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Inventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Inventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.inventario);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.inventario);
				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
												
				
				


				
				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Inventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Inventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInventarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosInventario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.inventarioAnterior =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.inventarioAnterior =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInventarioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.inventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.inventario);
				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
				
				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
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
			
			InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
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
			
			


			
			InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInventarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.inventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.inventario);
				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Inventario.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Inventario.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.inventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.inventario);
				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
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
				
				


				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Inventario.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Inventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.inventarioAnterior =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.inventarioAnterior =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarInventario")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosInventarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosInventario.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.inventario =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.inventario =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.inventario);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarInventario")) {
				
				}
				
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarInventario")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosInventario.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarInventario")) {
			
			}
			
			InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessInventario();
			
			InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
			
			if(sTipo.equals("NuevoInventario")) {
				jButtonNuevoInventarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarInventario")) {
				jButtonDuplicarInventarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarInventario")) {
				jButtonCopiarInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormInventario")) {
				jButtonVerFormInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesInventario")) {
				jButtonNuevoInventarioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarInventario")) {
				jButtonModificarInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarInventario")) {
				jButtonActualizarInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarInventario")) {
				jButtonEliminarInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaInventario")) {
				jButtonGuardarCambiosInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarInventario")) {
				jButtonCancelarInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarInventario")) {
				jButtonCerrarInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosInventario")) {
				jButtonGuardarCambiosInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosInventario")) {
				jButtonNuevoGuardarCambiosInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByInventario")) {
				jButtonAbrirOrderByInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionInventario")) {
				jButtonRecargarInformacionInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresInventario")) {
				jButtonAnterioresInventarioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesInventario")) {
				jButtonSiguientesInventarioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idInventarioBusqueda")) {
				this.jButtonidInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoInventarioBusqueda")) {
				this.jButtoncodigoInventarioBusquedaActionPerformed(evt);
			}
			
			InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessInventario();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameInventario")) {
				closingInternalFrameInventario();
				
			} else if(sTipo.equals("jButtonCancelarInventario")) {
				JInternalFrameBase jInternalFrameDetalleFormInventario = (JInternalFrameBase)evt.getSource();
	            	
	            InventarioBeanSwingJInternalFrame jInternalFrameParent=(InventarioBeanSwingJInternalFrame)jInternalFrameDetalleFormInventario.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarInventarioActionPerformed(null);
			}
			
			InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.inventario,new Object(),this.inventarioParameterGeneral,this.inventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormInventario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormInventario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormInventario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.inventario)) {
			if(!esControlTabla) {
				if(InventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualInventario(this.inventario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysInventario(this.inventario);			
				}
				
				if(this.inventarioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualInventario(this.inventario,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanInventario(this.inventarioReturnGeneral,this.inventarioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.inventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanInventario(classes,this.inventarioReturnGeneral,this.inventarioBean,false);
					}
						
					if(this.inventarioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyInventario(this.inventarioReturnGeneral.getInventario());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioInventario(this.inventarioReturnGeneral.getInventario());	
					}
						
					if(this.inventarioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioInventario(this.inventarioReturnGeneral.getInventario(),classes);//this.inventarioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioInventario(this.inventario,classes);//this.inventarioBean);									
				}
			
				if(InventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualInventario(this.inventario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysInventario(this.inventario);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.inventarioAnterior!=null) {
						this.inventario=this.inventarioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.inventarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.inventarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.inventarioReturnGeneral.getInventario(),inventarioLogic.getInventarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.inventarioReturnGeneral.getInventario(),this.inventarios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosInventario.repaint();
				
				//((AbstractTableModel) this.jTableDatosInventario.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosInventario();
			}
		}
	}
	
	public void actualizarVisualTableDatosInventario() throws Exception {
		
		InventarioModel inventarioModel=(InventarioModel)this.jTableDatosInventario.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			inventarioModel.inventarios=this.inventarioLogic.getInventarios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			inventarioModel.inventarios=this.inventarios;
		}
		
		
		((InventarioModel) this.jTableDatosInventario.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaInventario() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getinventarioAnterior(),this.inventarioLogic.getInventarios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getinventarioAnterior(),this.inventarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosInventario();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioInventario(Inventario inventario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
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
										
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.inventario,new Object(),generalEntityParameterGeneral,this.inventarioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.inventarioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=InventarioConstantesFunciones.getClassesRelationshipsOfInventario(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=InventarioConstantesFunciones.getClassesRelationshipsFromStringsOfInventario(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormInventario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				InventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.inventario,new Object(),generalEntityParameterGeneral,this.inventarioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioInventario(InventarioBean inventarioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanInventario(ArrayList<Classe> classes,InventarioReturnGeneral inventarioReturnGeneral,InventarioBean inventarioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualInventario(Inventario inventario,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.inventario)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormInventario = new InventarioDetalleFormJInternalFrame(jDesktopPane,this.inventarioSessionBean.getConGuardarRelaciones(),this.inventarioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormInventario);
		this.jInternalFrameDetalleFormInventario.setVisible(false);
		this.jInternalFrameDetalleFormInventario.setSelected(false);						
		
		this.jInternalFrameDetalleFormInventario.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormInventario.inventarioLogic=this.inventarioLogic;
		
		this.cargarCombosFrameForeignKeyInventario("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleInventario();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleInventario();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyInventario("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyInventario();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormInventario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarInventario"));
		
		this.jInternalFrameDetalleFormInventario.jButtonModificarInventario.addActionListener(new ButtonActionListener(this,"ModificarInventario"));

		
		this.jInternalFrameDetalleFormInventario.jButtonModificarToolBarInventario.addActionListener(new ButtonActionListener(this,"ModificarToolBarInventario"));
					
		this.jInternalFrameDetalleFormInventario.jMenuItemModificarInventario.addActionListener(new ButtonActionListener(this,"MenuItemModificarInventario"));		
		
		
		
		this.jInternalFrameDetalleFormInventario.jButtonActualizarInventario.addActionListener (new ButtonActionListener(this,"ActualizarInventario"));
		
		
		this.jInternalFrameDetalleFormInventario.jButtonActualizarToolBarInventario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarInventario"));
						
		this.jInternalFrameDetalleFormInventario.jMenuItemActualizarInventario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarInventario"));		
		
		
		
		this.jInternalFrameDetalleFormInventario.jButtonEliminarInventario.addActionListener (new ButtonActionListener(this,"EliminarInventario"));
		
		
		this.jInternalFrameDetalleFormInventario.jButtonEliminarToolBarInventario.addActionListener (new ButtonActionListener(this,"EliminarToolBarInventario"));
								
		this.jInternalFrameDetalleFormInventario.jMenuItemEliminarInventario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarInventario"));		
		
		
		
		this.jInternalFrameDetalleFormInventario.jButtonCancelarInventario.addActionListener (new ButtonActionListener(this,"CancelarInventario"));
		
		
		this.jInternalFrameDetalleFormInventario.jButtonCancelarToolBarInventario.addActionListener (new ButtonActionListener(this,"CancelarToolBarInventario"));
					
		this.jInternalFrameDetalleFormInventario.jMenuItemCancelarInventario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarInventario"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormInventario.jMenuItemDetalleCerrarInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarInventario"));		
		
		
		
		this.jInternalFrameDetalleFormInventario.jButtonGuardarCambiosToolBarInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarInventario"));
		
		
		
		this.jInternalFrameDetalleFormInventario.jButtonGuardarCambiosToolBarInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarInventario"));
		
		
		
		this.jInternalFrameDetalleFormInventario.jComboBoxTiposAccionesFormularioInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioInventario"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInventario.jButtonidInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInventario.jButtoncodigoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoInventarioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormInventario.jTabbedPaneRelacionesInventario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesInventario"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameInventario"));
		
		if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInventario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarInventario"));
		}
		
		this.jTableDatosInventario.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarInventario"));
		
		this.jTableDatosInventario.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarInventario"));
		
		this.jButtonNuevoInventario.addActionListener(new ButtonActionListener(this,"NuevoInventario"));
		
		this.jButtonDuplicarInventario.addActionListener(new ButtonActionListener(this,"DuplicarInventario"));
		
		this.jButtonCopiarInventario.addActionListener(new ButtonActionListener(this,"CopiarInventario"));
		
		this.jButtonVerFormInventario.addActionListener(new ButtonActionListener(this,"VerFormInventario"));
		
		
		this.jButtonNuevoToolBarInventario.addActionListener(new ButtonActionListener(this,"NuevoToolBarInventario"));
			
		this.jButtonDuplicarToolBarInventario.addActionListener(new ButtonActionListener(this,"DuplicarToolBarInventario"));
			
		this.jMenuItemNuevoInventario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoInventario"));
			
		this.jMenuItemDuplicarInventario.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarInventario"));		
		
		
		this.jButtonNuevoRelacionesInventario.addActionListener (new ButtonActionListener(this,"NuevoRelacionesInventario"));
		
		
		this.jButtonNuevoRelacionesToolBarInventario.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarInventario"));
			
		this.jMenuItemNuevoRelacionesInventario.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesInventario"));		
		
		
		if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInventario.jButtonModificarInventario.addActionListener(new ButtonActionListener(this,"ModificarInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInventario.jButtonModificarToolBarInventario.addActionListener(new ButtonActionListener(this,"ModificarToolBarInventario"));
			
			this.jInternalFrameDetalleFormInventario.jMenuItemModificarInventario.addActionListener(new ButtonActionListener(this,"MenuItemModificarInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormInventario.jButtonActualizarInventario.addActionListener (new ButtonActionListener(this,"ActualizarInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInventario.jButtonActualizarToolBarInventario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarInventario"));
				
			this.jInternalFrameDetalleFormInventario.jMenuItemActualizarInventario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInventario.jButtonEliminarInventario.addActionListener (new ButtonActionListener(this,"EliminarInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInventario.jButtonEliminarToolBarInventario.addActionListener (new ButtonActionListener(this,"EliminarToolBarInventario"));
						
			this.jInternalFrameDetalleFormInventario.jMenuItemEliminarInventario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInventario.jButtonCancelarInventario.addActionListener (new ButtonActionListener(this,"CancelarInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInventario.jButtonCancelarToolBarInventario.addActionListener (new ButtonActionListener(this,"CancelarToolBarInventario"));
			
			this.jInternalFrameDetalleFormInventario.jMenuItemCancelarInventario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarInventario"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarInventario.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarInventario"));		
		
		
		this.jButtonCerrarInventario.addActionListener (new ButtonActionListener(this,"CerrarInventario"));
		
		
		this.jButtonCerrarToolBarInventario.addActionListener (new ButtonActionListener(this,"CerrarToolBarInventario"));
			
		this.jMenuItemCerrarInventario.addActionListener (new ButtonActionListener(this,"MenuItemCerrarInventario"));
			
		if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInventario.jMenuItemDetalleCerrarInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInventario.jButtonGuardarCambiosInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInventario.jButtonGuardarCambiosToolBarInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarInventario"));
		}
		
		this.jButtonCopiarToolBarInventario.addActionListener (new ButtonActionListener(this,"CopiarToolBarInventario"));
			
		this.jButtonVerFormToolBarInventario.addActionListener (new ButtonActionListener(this,"VerFormToolBarInventario"));
		
		this.jMenuItemGuardarCambiosInventario.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosInventario"));
			
		this.jMenuItemCopiarInventario.addActionListener (new ButtonActionListener(this,"MenuItemCopiarInventario"));		
		
		this.jMenuItemVerFormInventario.addActionListener (new ButtonActionListener(this,"MenuItemVerFormInventario"));		
		
		
		this.jButtonGuardarCambiosTablaInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaInventario"));
		
		
		this.jButtonGuardarCambiosTablaToolBarInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarInventario"));
			
		this.jMenuItemGuardarCambiosTablaInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaInventario"));		
		
		
		
		this.jButtonRecargarInformacionInventario.addActionListener (new ButtonActionListener(this,"RecargarInformacionInventario"));
					
		this.jButtonRecargarInformacionToolBarInventario.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarInventario"));
		
		this.jMenuItemRecargarInformacionInventario.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionInventario"));		
		
		
		
		this.jButtonAnterioresInventario.addActionListener (new ButtonActionListener(this,"AnterioresInventario"));
		
		
		this.jButtonAnterioresToolBarInventario.addActionListener (new ButtonActionListener(this,"AnterioresToolBarInventario"));
		
		this.jMenuItemAnterioresInventario.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresInventario"));		
		
		
		this.jButtonSiguientesInventario.addActionListener (new ButtonActionListener(this,"SiguientesInventario"));
		
		
		this.jButtonSiguientesToolBarInventario.addActionListener (new ButtonActionListener(this,"SiguientesToolBarInventario"));
			
		this.jMenuItemSiguientesInventario.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesInventario"));
			
		this.jMenuItemAbrirOrderByInventario.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByInventario"));
			
		this.jMenuItemMostrarOcultarInventario.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarInventario"));
			
		this.jMenuItemDetalleAbrirOrderByInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByInventario"));
			
		this.jMenuItemDetalleMostarOcultarInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarInventario"));		
		
		
		this.jButtonNuevoGuardarCambiosInventario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosInventario"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarInventario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarInventario"));
			
		this.jMenuItemNuevoGuardarCambiosInventario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosInventario"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosInventario.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosInventario"));

		this.jCheckBoxSeleccionadosInventario.addItemListener(new CheckBoxItemListener(this,"SeleccionadosInventario"));
		
		if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInventario.jComboBoxTiposAccionesFormularioInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioInventario"));
		}
		
		
		this.jComboBoxTiposRelacionesInventario.addActionListener (new ButtonActionListener(this,"TiposRelacionesInventario"));
			
		this.jComboBoxTiposAccionesInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesInventario"));
					
		this.jComboBoxTiposSeleccionarInventario.addActionListener (new ButtonActionListener(this,"TiposSeleccionarInventario"));
			
		this.jTextFieldValorCampoGeneralInventario.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralInventario"));		
		
		
		if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInventario.jButtonidInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInventario.jButtoncodigoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoInventarioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoInventario!=null) {
				this.jInternalFrameReporteDinamicoInventario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoInventario"));
				this.jInternalFrameReporteDinamicoInventario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoInventario"));
				this.jInternalFrameReporteDinamicoInventario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoInventario"));
			}
			
			//this.jButtonCerrarReporteDinamicoInventario.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoInventario"));				
			//this.jButtonGenerarReporteDinamicoInventario.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoInventario"));
			//this.jButtonGenerarExcelReporteDinamicoInventario.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoInventario"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionInventario!=null) {
				this.jInternalFrameImportacionInventario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionInventario"));
				this.jInternalFrameImportacionInventario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionInventario"));
				this.jInternalFrameImportacionInventario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionInventario"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByInventario.addActionListener (new ButtonActionListener(this,"AbrirOrderByInventario"));
			
			this.jButtonAbrirOrderByToolBarInventario.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarInventario"));			
			
			if(this.jInternalFrameOrderByInventario!=null) {
				this.jInternalFrameOrderByInventario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByInventario"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInventario.jTabbedPaneRelacionesInventario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesInventario"));
		
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
            		closingInternalFrameInventario();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormInventario.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormInventario = (JInternalFrameBase)event.getSource();
	            	
	            InventarioBeanSwingJInternalFrame jInternalFrameParent=(InventarioBeanSwingJInternalFrame)jInternalFrameDetalleFormInventario.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarInventarioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosInventario.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosInventarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosInventario.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosInventario.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoInventario";
		inputMap = this.jButtonNuevoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoInventarioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesInventario";
		inputMap = this.jButtonNuevoRelacionesInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoInventarioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarInventario";
		inputMap = this.jButtonModificarInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarInventario";
		inputMap = this.jButtonActualizarInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarInventario";
		inputMap = this.jButtonEliminarInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarInventario";
		inputMap = this.jButtonCancelarInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarInventario";
		inputMap = this.jButtonCerrarInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormInventario.jButtonGuardarCambiosInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosInventario";
		inputMap = this.jInternalFrameDetalleFormInventario.jButtonGuardarCambiosInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormInventario.jButtonGuardarCambiosInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosInventario.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosInventarioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInventario.jButtonidInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInventario.jButtoncodigoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoInventarioBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarInventarioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarInventario.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosInventario(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Inventario inventarioAux:this.inventarioLogic.getInventarios()) {
					inventarioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Inventario inventarioAux:inventarios) {
					inventarioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosInventarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingInventario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Inventario inventarioAux:this.inventarioLogic.getInventarios()) {
						inventarioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Inventario inventarioAux:inventarios) {
						inventarioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Inventario inventarioAux:this.inventarioLogic.getInventarios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Inventario inventarioAux:inventarios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaInventario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosInventario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosInventario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosInventario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosInventarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingInventario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosInventario.getSelectedRows();
			
			Inventario inventarioLocal=new Inventario();
			
			//this.seleccionarTodosInventario(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					inventarioLocal =(Inventario) this.inventarioLogic.getInventarios().toArray()[this.jTableDatosInventario.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					inventarioLocal =(Inventario) this.inventarios.toArray()[this.jTableDatosInventario.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				inventarioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Inventario inventarioAux:this.inventarioLogic.getInventarios()) {
						inventarioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Inventario inventarioAux:inventarios) {
						inventarioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaInventario(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosInventario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosInventario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosInventario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualInventarioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarInventarioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralInventarioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingInventario(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralInventario.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Inventario inventarioAux:this.inventarioLogic.getInventarios()) {
				
						if(sTipoSeleccionar.equals(InventarioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							inventarioAux.setcodigo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Inventario inventarioAux:inventarios) {
					
						if(sTipoSeleccionar.equals(InventarioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							inventarioAux.setcodigo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaInventario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesInventarioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingInventario(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioInventario=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesInventario.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormInventario.jComboBoxTiposAccionesFormularioInventario.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteInventario) {				
					conSplash=true;//false;										
					
					//this.startProcessInventario(conSplash);
				
					this.generarReporteInventariosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInventario.jComboBoxTiposAccionesFormularioInventario.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoInventariosSeleccionados();
				//this.jComboBoxTiposAccionesInventario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoInventariosSeleccionados(false);
				//this.jComboBoxTiposAccionesInventario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoInventariosSeleccionados(true);
				//this.jComboBoxTiposAccionesInventario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessInventario();
				
				this.exportarInventariosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInventario.jComboBoxTiposAccionesFormularioInventario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionInventarios();
				//this.importarInventarios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInventario.jComboBoxTiposAccionesFormularioInventario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessInventario();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelInventariosSeleccionados();
				//this.jComboBoxTiposAccionesInventario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessInventario();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoInventario)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyInventario(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Inventario",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInventario.jComboBoxTiposAccionesFormularioInventario.setSelectedIndex(0);					
				}	
			} 			
			else if(InventarioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteInventario) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessInventario(conSplash);
					
						//this.actualizarParametrosGeneralInventario();
						
						this.generarReporteProcesoAccionInventariosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesInventario.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormInventario.jComboBoxTiposAccionesFormularioInventario.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(InventarioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO InventarioS SELECCIONADOS?", "MANTENIMIENTO DE Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessInventario();
				
						this.actualizarParametrosGeneralInventario();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.inventarioReturnGeneral=inventarioLogic.procesarAccionInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.inventarioLogic.getInventarios(),this.inventarioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarInventarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesInventario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormInventario.jComboBoxTiposAccionesFormularioInventario.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralInventario();
					
					InventarioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarInventarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesInventario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormInventario.jComboBoxTiposAccionesFormularioInventario.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessInventario(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesInventarioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessInventario();
			
			if(this.jInternalFrameDetalleFormInventario==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Inventario> inventariosSeleccionados=new ArrayList<Inventario>();		
			Inventario inventario=new Inventario();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingInventario(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesInventario.getSelectedItem();
			
			
			
			
			inventariosSeleccionados=this.getInventariosSeleccionados(true);
			//this.sTipoAccion;
			
			if(inventariosSeleccionados.size()==1) {
				for(Inventario inventarioAux:inventariosSeleccionados) {
					inventario=inventarioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessInventario();
			
      		//this.finishProcessInventario(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarInventarioReturnGeneral() throws Exception {
		if(this.inventarioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.inventarioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.inventarioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.inventarioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.inventarioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.inventarioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingInventario(false);
		}
		
		if(this.inventarioReturnGeneral.getConRetornoLista() || this.inventarioReturnGeneral.getConRetornoObjeto()) {
			if(this.inventarioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.inventarioLogic.setInventarios(this.inventarioReturnGeneral.getInventarios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.inventarioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.inventarioLogic.setInventario(this.inventarioReturnGeneral.getInventario());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingInventario(false);
		}
	}
	
	public void actualizarParametrosGeneralInventario() throws Exception {
		
		
	}
	
	public ArrayList<Inventario> getInventariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Inventario> inventariosSeleccionados=new ArrayList<Inventario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioInventario) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Inventario inventarioAux:inventarioLogic.getInventarios()) {
					if(inventarioAux.getIsSelected()) {
						inventariosSeleccionados.add(inventarioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Inventario inventarioAux:this.inventarios) {
					if(inventarioAux.getIsSelected()) {
						inventariosSeleccionados.add(inventarioAux);				
					}
				}
			}
			
			if(inventariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						inventariosSeleccionados.addAll(this.inventarioLogic.getInventarios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						inventariosSeleccionados.addAll(this.inventarios);				
					}
				}
			}
		} else {
			inventariosSeleccionados.add(this.inventario);
		}
		
		return inventariosSeleccionados;
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
	
	public void generarReporteInventariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalInventariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoInventariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoInventariosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoInventariosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Inventario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesInventariosSeleccionados() throws Exception {
		ArrayList<Inventario> inventariosSeleccionados=new ArrayList<Inventario>();		
		
		inventariosSeleccionados=this.getInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteInventarios("Todos",inventariosSeleccionados);
		
	}	
	
	public void generarReporteNormalInventariosSeleccionados() throws Exception {
		ArrayList<Inventario> inventariosSeleccionados=new ArrayList<Inventario>();		
		
		inventariosSeleccionados=this.getInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteInventarios("Todos",inventariosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionInventariosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Inventario> inventariosSeleccionados=new ArrayList<Inventario>();
		
		inventariosSeleccionados=this.getInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteInventarios("Todos",inventariosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoInventariosSeleccionados() throws Exception {
		ArrayList<Inventario> inventariosSeleccionados=new ArrayList<Inventario>();		
		
		
		this.abrirInicializarFrameReporteDinamicoInventario();
		
		
		inventariosSeleccionados=this.getInventariosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoInventario();
		
		
		//this.generarReporteInventarios("Todos",inventariosSeleccionados ,inventarioImplementable,inventarioImplementableHome);
	}
	
	public void mostrarImportacionInventarios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionInventario();
		
		this.abrirFrameImportacionInventario();		
		
			
		//this.generarReporteInventarios("Todos",inventariosSeleccionados ,inventarioImplementable,inventarioImplementableHome);
	}
	
	public void importarInventarios() throws Exception {		
	
	}
	
	public void exportarInventariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelInventariosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoInventariosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlInventariosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Inventario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoInventariosSeleccionados() throws Exception {
		ArrayList<Inventario> inventariosSeleccionados=new ArrayList<Inventario>();		
		
		inventariosSeleccionados=this.getInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"inventario."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarInventario(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Inventario inventarioAux:inventariosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarInventario(inventarioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//inventarioAux.setsDetalleGeneralEntityReporte(inventarioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.inventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarInventario(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=InventarioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InventarioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InventarioConstantesFunciones.LABEL_CODIGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarInventario(Inventario inventario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=inventario.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=inventario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=inventario.getcodigo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelInventariosSeleccionados() throws Exception {
		ArrayList<Inventario> inventariosSeleccionados=new ArrayList<Inventario>();		
		
		inventariosSeleccionados=this.getInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"inventario.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Inventarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelInventario(row);				
				iRow++;
			}				
			
			for(Inventario inventarioAux:inventariosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelInventario(inventarioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.inventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlInventariosSeleccionados() throws Exception {
		ArrayList<Inventario> inventariosSeleccionados=new ArrayList<Inventario>();		
		
		inventariosSeleccionados=this.getInventariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"inventario.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("inventarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("inventario");
			//elementRoot.appendChild(element);
		
			for(Inventario inventarioAux:inventariosSeleccionados) {
				element = document.createElement("inventario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlInventario(inventarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.inventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelInventario(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(InventarioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(InventarioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(InventarioConstantesFunciones.LABEL_CODIGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelInventario(Inventario inventario,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(inventario.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(inventario.getcodigo());				
	}
	
	public void setFilaDatosExportarXmlInventario(Inventario inventario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(InventarioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(inventario.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(InventarioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(inventario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(InventarioConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(inventario.getcodigo().trim()));
		element.appendChild(elementcodigo);
	}
	
	public void generarReporteGroupGenericoInventariosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Inventario> inventariosSeleccionados=new ArrayList<Inventario>();
		
		inventariosSeleccionados=this.getInventariosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoInventario(inventariosSeleccionados);
		
		this.generarReporteInventarios("Todos",inventariosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoInventario(ArrayList<Inventario> inventariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Inventario inventarioAux:inventariosSeleccionados) {
				inventarioAux.setsDetalleGeneralEntityReporte(inventarioAux.toString());
			
				if(sTipoSeleccionar.equals(InventarioConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					inventarioAux.setsDescripcionGeneralEntityReporte1(inventarioAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesInventario(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoInventario=true;
				this.isVisibilidadCeldaNuevoRelacionesInventario=true;
				this.isVisibilidadCeldaGuardarCambiosInventario=true;
			}
			
			this.isVisibilidadCeldaModificarInventario=false;
			this.isVisibilidadCeldaActualizarInventario=false;
			this.isVisibilidadCeldaEliminarInventario=false;
			this.isVisibilidadCeldaCancelarInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarInventario=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesInventario=false;
			this.isVisibilidadCeldaGuardarCambiosInventario=false;
			this.isVisibilidadCeldaModificarInventario=false;
			this.isVisibilidadCeldaActualizarInventario=true;
			this.isVisibilidadCeldaEliminarInventario=false;
			this.isVisibilidadCeldaCancelarInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarInventario=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesInventario=false;
			this.isVisibilidadCeldaGuardarCambiosInventario=false;
			this.isVisibilidadCeldaModificarInventario=false;
			this.isVisibilidadCeldaActualizarInventario=true;
			this.isVisibilidadCeldaEliminarInventario=true;
			this.isVisibilidadCeldaCancelarInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarInventario=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesInventario=false;
			this.isVisibilidadCeldaGuardarCambiosInventario=false;
			this.isVisibilidadCeldaModificarInventario=false;
			this.isVisibilidadCeldaActualizarInventario=true;
			this.isVisibilidadCeldaEliminarInventario=false;
			this.isVisibilidadCeldaCancelarInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarInventario=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesInventario=true;
			this.isVisibilidadCeldaGuardarCambiosInventario=true;
			this.isVisibilidadCeldaModificarInventario=false;
			this.isVisibilidadCeldaActualizarInventario=false;
			this.isVisibilidadCeldaEliminarInventario=false;
			this.isVisibilidadCeldaCancelarInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarInventario=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesInventario=false;
			this.isVisibilidadCeldaGuardarCambiosInventario=false;
			this.isVisibilidadCeldaActualizarInventario=false;
			this.isVisibilidadCeldaEliminarInventario=false;
			this.isVisibilidadCeldaCancelarInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarInventario=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesInventario=false;
			this.isVisibilidadCeldaGuardarCambiosInventario=false;
			this.isVisibilidadCeldaModificarInventario=true;
			this.isVisibilidadCeldaActualizarInventario=false;
			this.isVisibilidadCeldaEliminarInventario=false;
			this.isVisibilidadCeldaCancelarInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarInventario=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(InventarioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesInventario=true;
			this.isVisibilidadCeldaGuardarCambiosInventario=true;
		} else {
			this.actualizarEstadoPanelsInventario(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarInventario=false;
			//this.isVisibilidadCeldaVerFormInventario=false;
			this.isVisibilidadCeldaDuplicarInventario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!inventarioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesInventario=false;
		} else {
			this.isVisibilidadCeldaNuevoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosInventario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(inventarioSessionBean.getEsGuardarRelacionado()) {
			if(!inventarioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesInventario=false;												
			}
			
			this.jButtonCerrarInventario.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesInventario=false;
		}
		
		if(!this.permiteMantenimiento(this.inventario)) {
			this.isVisibilidadCeldaActualizarInventario=false;
			this.isVisibilidadCeldaEliminarInventario=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesInventario() {
	}
	
	public void actualizarEstadoPanelsInventario(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionInventario!=null) {
				this.jScrollPanelDatosEdicionInventario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosInventario!=null) {
				this.jScrollPanelDatosInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionInventario!=null) {
				this.jPanelPaginacionInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInventario!=null) {
				this.jPanelParametrosReportesInventario.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionInventario!=null) {
				this.jScrollPanelDatosEdicionInventario.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosInventario!=null) {
				this.jScrollPanelDatosInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionInventario!=null) {
				this.jPanelPaginacionInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesInventario!=null) {
				this.jPanelParametrosReportesInventario.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionInventario!=null) {
				this.jScrollPanelDatosEdicionInventario.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosInventario!=null) {
				this.jScrollPanelDatosInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionInventario!=null) {
				this.jPanelPaginacionInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesInventario!=null) {
				this.jPanelParametrosReportesInventario.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionInventario!=null) {
				this.jScrollPanelDatosEdicionInventario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosInventario!=null) {
				this.jScrollPanelDatosInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionInventario!=null) {
				this.jPanelPaginacionInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesInventario!=null) {
				this.jPanelParametrosReportesInventario.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionInventario!=null) {
				this.jScrollPanelDatosEdicionInventario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosInventario!=null) {
				this.jScrollPanelDatosInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionInventario!=null) {
				this.jPanelPaginacionInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInventario!=null) {
				this.jPanelParametrosReportesInventario.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionInventario!=null) {
				this.jScrollPanelDatosEdicionInventario.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosInventario!=null) {
				this.jScrollPanelDatosInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionInventario!=null) {
				this.jPanelPaginacionInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInventario!=null) {
				this.jPanelParametrosReportesInventario.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionInventario!=null) {
				this.jScrollPanelDatosEdicionInventario.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosInventario!=null) {
				this.jScrollPanelDatosInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionInventario!=null) {
				this.jPanelPaginacionInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInventario!=null) {
				this.jPanelParametrosReportesInventario.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.inventarioSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.inventarioSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//InventarioSessionBean inventarioSessionBean=new InventarioSessionBean();
		
		if(this.inventarioSessionBean==null) {
			this.inventarioSessionBean=new InventarioSessionBean();
		}
		
		this.inventarioSessionBean.setsUltimaBusquedaInventario(this.getsAccionBusqueda());
		this.inventarioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.inventarioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//InventarioSessionBean inventarioSessionBean=new InventarioSessionBean();
		
		if(this.inventarioSessionBean==null) {
			this.inventarioSessionBean=new InventarioSessionBean();
		}
		
		if(this.inventarioSessionBean.getsUltimaBusquedaInventario()!=null&&!this.inventarioSessionBean.getsUltimaBusquedaInventario().equals("")) {
			this.setsAccionBusqueda(inventarioSessionBean.getsUltimaBusquedaInventario());
			this.setiNumeroPaginacion(inventarioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(inventarioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.inventarioSessionBean.setsUltimaBusquedaInventario("");
		this.inventarioSessionBean.setiNumeroPaginacion(InventarioConstantesFunciones.INUMEROPAGINACION);
		this.inventarioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaInventario(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioInventario() {
		this.updateBorderResaltarBusquedasFormularioInventario();
		this.updateVisibilidadBusquedasFormularioInventario();
		this.updateHabilitarBusquedasFormularioInventario();
	}
	
	public void updateBorderResaltarBusquedasFormularioInventario() {					
	}
	
	public void updateVisibilidadBusquedasFormularioInventario() {
	}
	
	public void updateHabilitarBusquedasFormularioInventario() {
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
	
	public void updateControlesFormularioInventario() throws Exception {

		if(this.jInternalFrameDetalleFormInventario==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioInventario();
		this.updateVisibilidadResaltarControlesFormularioInventario();
		this.updateHabilitarResaltarControlesFormularioInventario();
		
	}
	
	public void updateBorderResaltarControlesFormularioInventario() throws Exception {
		if(this.jInternalFrameDetalleFormInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.inventarioConstantesFunciones.resaltaridInventario!=null && this.jInternalFrameDetalleFormInventario!=null) {this.jInternalFrameDetalleFormInventario.jLabelidInventario.setBorder(this.inventarioConstantesFunciones.resaltaridInventario);}
		if(this.inventarioConstantesFunciones.resaltarcodigoInventario!=null && this.jInternalFrameDetalleFormInventario!=null) {this.jInternalFrameDetalleFormInventario.jTextFieldcodigoInventario.setBorder(this.inventarioConstantesFunciones.resaltarcodigoInventario);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioInventario() throws Exception {		
		if(this.jInternalFrameDetalleFormInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormInventario!=null) {
	
		//this.jInternalFrameDetalleFormInventario.jLabelidInventario.setVisible(this.inventarioConstantesFunciones.mostraridInventario);
		this.jInternalFrameDetalleFormInventario.jPanelidInventario.setVisible(this.inventarioConstantesFunciones.mostraridInventario);
		//this.jInternalFrameDetalleFormInventario.jTextFieldcodigoInventario.setVisible(this.inventarioConstantesFunciones.mostrarcodigoInventario);
		this.jInternalFrameDetalleFormInventario.jPanelcodigoInventario.setVisible(this.inventarioConstantesFunciones.mostrarcodigoInventario);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioInventario() throws Exception {
		if(this.jInternalFrameDetalleFormInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormInventario!=null) {
	
		this.jInternalFrameDetalleFormInventario.jLabelidInventario.setEnabled(this.inventarioConstantesFunciones.activaridInventario);
		this.jInternalFrameDetalleFormInventario.jTextFieldcodigoInventario.setEnabled(this.inventarioConstantesFunciones.activarcodigoInventario);
		}
	}
	
		
}