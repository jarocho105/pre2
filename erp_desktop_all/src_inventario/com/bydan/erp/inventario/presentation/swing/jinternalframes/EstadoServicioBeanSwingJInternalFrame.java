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

import com.bydan.erp.inventario.util.EstadoServicioConstantesFunciones;
import com.bydan.erp.inventario.util.EstadoServicioParameterReturnGeneral;
//import com.bydan.erp.inventario.util.EstadoServicioParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.EstadoServicioBean;
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

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
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
public class EstadoServicioBeanSwingJInternalFrame extends EstadoServicioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoServicioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoServicio> estadoservicioValidator = new ClassValidator<EstadoServicio>(EstadoServicio.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoServicio estadoservicio;	
	public EstadoServicio estadoservicioAux;
	public EstadoServicio estadoservicioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoServicio estadoservicioTotales;
	public Long idEstadoServicioActual;
	public Long iIdNuevoEstadoServicio=0L;
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
	
	public Boolean isPermisoTodoEstadoServicio;
	public Boolean isPermisoNuevoEstadoServicio;
	public Boolean isPermisoActualizarEstadoServicio;
	public Boolean isPermisoActualizarOriginalEstadoServicio;
	public Boolean isPermisoEliminarEstadoServicio;
	public Boolean isPermisoGuardarCambiosEstadoServicio;
	public Boolean isPermisoConsultaEstadoServicio;
	public Boolean isPermisoBusquedaEstadoServicio;
	public Boolean isPermisoReporteEstadoServicio;
	public Boolean isPermisoPaginacionMedioEstadoServicio;
	public Boolean isPermisoPaginacionAltoEstadoServicio;
	public Boolean isPermisoPaginacionTodoEstadoServicio;
	public Boolean isPermisoCopiarEstadoServicio;
	public Boolean isPermisoVerFormEstadoServicio;
	public Boolean isPermisoDuplicarEstadoServicio;
	public Boolean isPermisoOrdenEstadoServicio;
	
	
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
	
	public EstadoServicioParameterReturnGeneral estadoservicioReturnGeneral;
	public EstadoServicioParameterReturnGeneral estadoservicioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoServicio=false;
	public Boolean esParaAccionDesdeFormularioEstadoServicio=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoServicioLogic estadoservicioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoServicio estadoservicioBean;
	public EstadoServicioConstantesFunciones estadoservicioConstantesFunciones;
	//public EstadoServicioParameterReturnGeneral estadoservicioReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoServicio> estadoservicios;	
	//public List<EstadoServicio> estadoserviciosEliminados;
	//public List<EstadoServicio> estadoserviciosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoServicio=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoServicio=true;
	public Boolean isVisibilidadCeldaCopiarEstadoServicio=true;
	public Boolean isVisibilidadCeldaVerFormEstadoServicio=true;
	public Boolean isVisibilidadCeldaOrdenEstadoServicio=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoServicio=false;
	public Boolean isVisibilidadCeldaModificarEstadoServicio=false;
	public Boolean isVisibilidadCeldaActualizarEstadoServicio=false;
	public Boolean isVisibilidadCeldaEliminarEstadoServicio=false;
	public Boolean isVisibilidadCeldaCancelarEstadoServicio=false;
	public Boolean isVisibilidadCeldaGuardarEstadoServicio=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoServicio=false;	
	
	
	
	public Long getiIdNuevoEstadoServicio() {
		return this.iIdNuevoEstadoServicio;
	}

	public void setiIdNuevoEstadoServicio(Long iIdNuevoEstadoServicio) {
		this.iIdNuevoEstadoServicio = iIdNuevoEstadoServicio;
	}
	
	public Long getidEstadoServicioActual() {
		return this.idEstadoServicioActual;
	}

	public void setidEstadoServicioActual(Long idEstadoServicioActual) {
		this.idEstadoServicioActual = idEstadoServicioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoServicio getestadoservicio() {
		return this.estadoservicio;
	}

	public void setestadoservicio(EstadoServicio estadoservicio) {
		this.estadoservicio = estadoservicio;
	}
	
	public EstadoServicio getestadoservicioAux() {
		return this.estadoservicioAux;
	}

	public void setestadoservicioAux(EstadoServicio estadoservicioAux) {
		this.estadoservicioAux = estadoservicioAux;
	}				
	
	public EstadoServicio getestadoservicioAnterior() {
		return this.estadoservicioAnterior;
	}

	public void setestadoservicioAnterior(EstadoServicio estadoservicioAnterior) {
		this.estadoservicioAnterior = estadoservicioAnterior;
	}	
	
	public EstadoServicio getestadoservicioTotales() {
		return this.estadoservicioTotales;
	}

	public void setestadoservicioTotales(EstadoServicio estadoservicioTotales) {
		this.estadoservicioTotales = estadoservicioTotales;
	}	
	
	public EstadoServicio getestadoservicioBean() {
		return this.estadoservicioBean;
	}

	public void setestadoservicioBean(EstadoServicio estadoservicioBean) {
		this.estadoservicioBean = estadoservicioBean;
	}	
	
	public EstadoServicioParameterReturnGeneral getestadoservicioReturnGeneral() {
		return this.estadoservicioReturnGeneral;
	}

	public void setestadoservicioReturnGeneral(EstadoServicioParameterReturnGeneral estadoservicioReturnGeneral) {
		this.estadoservicioReturnGeneral = estadoservicioReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoServicioLogic getEstadoServicioLogic()	{		
		return estadoservicioLogic;
	}

	public void setEstadoServicioLogic(EstadoServicioLogic estadoservicioLogic) {
		this.estadoservicioLogic = estadoservicioLogic;
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
	
	public Boolean getIsEsNuevoEstadoServicio() {
		return isEsNuevoEstadoServicio;
	}

	public void setIsEsNuevoEstadoServicio(Boolean isEsNuevoEstadoServicio) {
		this.isEsNuevoEstadoServicio = isEsNuevoEstadoServicio;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoServicio() {
		return esParaAccionDesdeFormularioEstadoServicio;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoServicio(Boolean esParaAccionDesdeFormularioEstadoServicio) {
		this.esParaAccionDesdeFormularioEstadoServicio = esParaAccionDesdeFormularioEstadoServicio;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoServicio() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoServicioConstantesFunciones.refrescarForeignKeysDescripcionesEstadoServicio(this.estadoservicioLogic.getEstadoServicios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoServicioConstantesFunciones.refrescarForeignKeysDescripcionesEstadoServicio(this.estadoservicios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadoservicioLogic.setEstadoServicios(this.estadoservicios);
			estadoservicioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoServicioParameterReturnGeneral getEstadoServicioParameterGeneral() {
		return this.estadoservicioParameterGeneral;
	}
	
	public void setEstadoServicioParameterGeneral(EstadoServicioParameterReturnGeneral estadoservicioParameterGeneral) {
		this.estadoservicioParameterGeneral = estadoservicioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoServicio() {
		return isPermisoTodoEstadoServicio;
	}

	public void setIsPermisoTodoEstadoServicio(Boolean isPermisoTodoEstadoServicio) {
		this.isPermisoTodoEstadoServicio = isPermisoTodoEstadoServicio;
	}

	public Boolean getIsPermisoNuevoEstadoServicio() {
		return isPermisoNuevoEstadoServicio;
	}

	public void setIsPermisoNuevoEstadoServicio(Boolean isPermisoNuevoEstadoServicio) {
		this.isPermisoNuevoEstadoServicio = isPermisoNuevoEstadoServicio;
	}

	public Boolean getIsPermisoActualizarEstadoServicio() {
		return isPermisoActualizarEstadoServicio;
	}

	public void setIsPermisoActualizarEstadoServicio(Boolean isPermisoActualizarEstadoServicio) {
		this.isPermisoActualizarEstadoServicio = isPermisoActualizarEstadoServicio;
	}

	public Boolean getIsPermisoEliminarEstadoServicio() {
		return isPermisoEliminarEstadoServicio;
	}

	public void setIsPermisoEliminarEstadoServicio(Boolean isPermisoEliminarEstadoServicio) {
		this.isPermisoEliminarEstadoServicio = isPermisoEliminarEstadoServicio;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoServicio() {
		return isPermisoGuardarCambiosEstadoServicio;
	}

	public void setIsPermisoGuardarCambiosEstadoServicio(Boolean isPermisoGuardarCambiosEstadoServicio) {
		this.isPermisoGuardarCambiosEstadoServicio = isPermisoGuardarCambiosEstadoServicio;
	}
	
	public Boolean getIsPermisoConsultaEstadoServicio() {
		return isPermisoConsultaEstadoServicio;
	}

	public void setIsPermisoConsultaEstadoServicio(Boolean isPermisoConsultaEstadoServicio) {
		this.isPermisoConsultaEstadoServicio = isPermisoConsultaEstadoServicio;
	}

	public Boolean getIsPermisoBusquedaEstadoServicio() {
		return isPermisoBusquedaEstadoServicio;
	}

	public void setIsPermisoBusquedaEstadoServicio(Boolean isPermisoBusquedaEstadoServicio) {
		this.isPermisoBusquedaEstadoServicio = isPermisoBusquedaEstadoServicio;
	}

	public Boolean getIsPermisoReporteEstadoServicio() {
		return isPermisoReporteEstadoServicio;
	}

	public void setIsPermisoReporteEstadoServicio(Boolean isPermisoReporteEstadoServicio) {
		this.isPermisoReporteEstadoServicio = isPermisoReporteEstadoServicio;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoServicio() {
		return isPermisoPaginacionMedioEstadoServicio;
	}

	public void setIsPermisoPaginacionMedioEstadoServicio(Boolean isPermisoPaginacionMedioEstadoServicio) {
		this.isPermisoPaginacionMedioEstadoServicio = isPermisoPaginacionMedioEstadoServicio;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoServicio() {
		return isPermisoPaginacionTodoEstadoServicio;
	}

	public void setIsPermisoPaginacionTodoEstadoServicio(Boolean isPermisoPaginacionTodoEstadoServicio) {
		this.isPermisoPaginacionTodoEstadoServicio = isPermisoPaginacionTodoEstadoServicio;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoServicio() {
		return isPermisoPaginacionAltoEstadoServicio;
	}

	public void setIsPermisoPaginacionAltoEstadoServicio(Boolean isPermisoPaginacionAltoEstadoServicio) {
		this.isPermisoPaginacionAltoEstadoServicio = isPermisoPaginacionAltoEstadoServicio;
	}
	
	public Boolean getIsPermisoCopiarEstadoServicio() {
		return isPermisoCopiarEstadoServicio;
	}

	public void setIsPermisoCopiarEstadoServicio(Boolean isPermisoCopiarEstadoServicio) {
		this.isPermisoCopiarEstadoServicio = isPermisoCopiarEstadoServicio;
	}
	
	public Boolean getIsPermisoVerFormEstadoServicio() {
		return isPermisoVerFormEstadoServicio;
	}

	public void setIsPermisoVerFormEstadoServicio(Boolean isPermisoVerFormEstadoServicio) {
		this.isPermisoVerFormEstadoServicio = isPermisoVerFormEstadoServicio;
	}
	
	public Boolean getIsPermisoDuplicarEstadoServicio() {
		return isPermisoDuplicarEstadoServicio;
	}

	public void setIsPermisoDuplicarEstadoServicio(Boolean isPermisoDuplicarEstadoServicio) {
		this.isPermisoDuplicarEstadoServicio = isPermisoDuplicarEstadoServicio;
	}
	
	public Boolean getIsPermisoOrdenEstadoServicio() {
		return isPermisoOrdenEstadoServicio;
	}

	public void setIsPermisoOrdenEstadoServicio(Boolean isPermisoOrdenEstadoServicio) {
		this.isPermisoOrdenEstadoServicio = isPermisoOrdenEstadoServicio;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoServicio() {
		return isVisibilidadCeldaNuevoEstadoServicio;
	}

	public void setIsVisibilidadCeldaNuevoEstadoServicio(Boolean isVisibilidadCeldaNuevoEstadoServicio) {
		this.isVisibilidadCeldaNuevoEstadoServicio = isVisibilidadCeldaNuevoEstadoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoServicio() {
		return isVisibilidadCeldaDuplicarEstadoServicio;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoServicio(Boolean isVisibilidadCeldaDuplicarEstadoServicio) {
		this.isVisibilidadCeldaDuplicarEstadoServicio = isVisibilidadCeldaDuplicarEstadoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoServicio() {
		return isVisibilidadCeldaCopiarEstadoServicio;
	}

	public void setIsVisibilidadCeldaCopiarEstadoServicio(Boolean isVisibilidadCeldaCopiarEstadoServicio) {
		this.isVisibilidadCeldaCopiarEstadoServicio = isVisibilidadCeldaCopiarEstadoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoServicio() {
		return isVisibilidadCeldaVerFormEstadoServicio;
	}

	public void setIsVisibilidadCeldaVerFormEstadoServicio(Boolean isVisibilidadCeldaVerFormEstadoServicio) {
		this.isVisibilidadCeldaVerFormEstadoServicio = isVisibilidadCeldaVerFormEstadoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoServicio() {
		return isVisibilidadCeldaOrdenEstadoServicio;
	}

	public void setIsVisibilidadCeldaOrdenEstadoServicio(Boolean isVisibilidadCeldaOrdenEstadoServicio) {
		this.isVisibilidadCeldaOrdenEstadoServicio = isVisibilidadCeldaOrdenEstadoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoServicio() {
		return isVisibilidadCeldaNuevoRelacionesEstadoServicio;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoServicio(Boolean isVisibilidadCeldaNuevoRelacionesEstadoServicio) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoServicio = isVisibilidadCeldaNuevoRelacionesEstadoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoServicio() {
		return isVisibilidadCeldaModificarEstadoServicio;
	}

	public void setIsVisibilidadCeldaModificarEstadoServicio(Boolean isVisibilidadCeldaModificarEstadoServicio) {
		this.isVisibilidadCeldaModificarEstadoServicio = isVisibilidadCeldaModificarEstadoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoServicio() {
		return isVisibilidadCeldaActualizarEstadoServicio;
	}

	public void setIsVisibilidadCeldaActualizarEstadoServicio(Boolean isVisibilidadCeldaActualizarEstadoServicio) {
		this.isVisibilidadCeldaActualizarEstadoServicio = isVisibilidadCeldaActualizarEstadoServicio;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoServicio() {
		return isVisibilidadCeldaEliminarEstadoServicio;
	}

	public void setIsVisibilidadCeldaEliminarEstadoServicio(Boolean isVisibilidadCeldaEliminarEstadoServicio) {
		this.isVisibilidadCeldaEliminarEstadoServicio = isVisibilidadCeldaEliminarEstadoServicio;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoServicio() {
		return isVisibilidadCeldaCancelarEstadoServicio;
	}

	public void setIsVisibilidadCeldaCancelarEstadoServicio(Boolean isVisibilidadCeldaCancelarEstadoServicio) {
		this.isVisibilidadCeldaCancelarEstadoServicio = isVisibilidadCeldaCancelarEstadoServicio;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoServicio() {
		return isVisibilidadCeldaGuardarEstadoServicio;
	}

	public void setIsVisibilidadCeldaGuardarEstadoServicio(Boolean isVisibilidadCeldaGuardarEstadoServicio) {
		this.isVisibilidadCeldaGuardarEstadoServicio = isVisibilidadCeldaGuardarEstadoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoServicio() {
		return isVisibilidadCeldaGuardarCambiosEstadoServicio;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoServicio(Boolean isVisibilidadCeldaGuardarCambiosEstadoServicio) {
		this.isVisibilidadCeldaGuardarCambiosEstadoServicio = isVisibilidadCeldaGuardarCambiosEstadoServicio;
	}
		
	public EstadoServicioSessionBean getestadoservicioSessionBean() {
		return this.estadoservicioSessionBean;
	}
	
	public void setestadoservicioSessionBean(EstadoServicioSessionBean estadoservicioSessionBean) {
		this.estadoservicioSessionBean=estadoservicioSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoServicio(EstadoServicio estadoservicio)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoServicio estadoservicio,EstadoServicio estadoservicioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoServicio(estadoservicio);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadoservicioAux.setId(estadoservicio.getId());
		estadoservicioAux.setVersionRow(estadoservicio.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoServicio();
		
			int intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicio =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadoservicio =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoServicio(this.estadoservicio,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoServicio(this.estadoservicio);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadoservicioValidator.getInvalidValues(this.estadoservicio);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadoservicioLogic.setDatosCliente(datosCliente);
			estadoservicioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadoservicioAux=new  EstadoServicio();
				
				estadoservicioAux.setIsNew(true);
				estadoservicioAux.setIsChanged(true);
				
				estadoservicioAux.setEstadoServicioOriginal(this.estadoservicio);
				
				estadoservicioAux.setId(this.estadoservicio.getId());	
				estadoservicioAux.setVersionRow(this.estadoservicio.getVersionRow());	
				estadoservicioAux.setcodigo(this.estadoservicio.getcodigo());	
				estadoservicioAux.setnombre(this.estadoservicio.getnombre());	
				estadoservicioAux.setes_defecto(this.estadoservicio.getes_defecto());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoservicioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoservicioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadoservicioAux,estadoservicioLogic.getEstadoServicios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoservicioAux,estadoservicios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadoservicioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoservicioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoservicioLogic.saveEstadoServicios();//WithConnection
						//estadoservicioLogic.getSetVersionRowEstadoServicios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoservicio,estadoservicioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoservicioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadoservicioAux=new  EstadoServicio();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadoservicioSessionBean.getEsGuardarRelacionado() 
					|| (this.estadoservicioSessionBean.getEsGuardarRelacionado() && this.estadoservicio.getId()>=0)) {
						
					estadoservicioAux.setIsNew(false);
				}
				
				estadoservicioAux.setIsDeleted(false);
			
				estadoservicioAux.setId(this.estadoservicio.getId());	
				estadoservicioAux.setVersionRow(this.estadoservicio.getVersionRow());	
				estadoservicioAux.setcodigo(this.estadoservicio.getcodigo());	
				estadoservicioAux.setnombre(this.estadoservicio.getnombre());	
				estadoservicioAux.setes_defecto(this.estadoservicio.getes_defecto());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoservicioAux,estadoservicioLogic.getEstadoServicios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoservicioAux,estadoservicios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadoservicioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoservicioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoservicioLogic.saveEstadoServicios();//WithConnection
						//estadoservicioLogic.getSetVersionRowEstadoServicios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoservicio,estadoservicioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoservicioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadoservicioAux=new  EstadoServicio();
				
				estadoservicioAux.setIsNew(false);
				estadoservicioAux.setIsChanged(false);
				
				estadoservicioAux.setIsDeleted(true);
				
				estadoservicioAux.setId(this.estadoservicio.getId());	
				estadoservicioAux.setVersionRow(this.estadoservicio.getVersionRow());	
				estadoservicioAux.setcodigo(this.estadoservicio.getcodigo());	
				estadoservicioAux.setnombre(this.estadoservicio.getnombre());	
				estadoservicioAux.setes_defecto(this.estadoservicio.getes_defecto());	
				
				if(this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadoservicioAux.getId()>=0) {	
						this.estadoserviciosEliminados.add(estadoservicioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadoservicioAux,estadoservicioLogic.getEstadoServicios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoservicioAux,estadoservicios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadoservicioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoservicioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoservicioLogic.saveEstadoServicios();//WithConnection
						//estadoservicioLogic.getSetVersionRowEstadoServicios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoservicioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadoservicioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadoservicioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadoservicioAux,estadoservicioLogic.getEstadoServicios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadoservicioAux,estadoservicios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioLogic.getEstadoServicios().addAll(this.estadoserviciosEliminados);
					
					estadoservicioLogic.saveEstadoServicios();//WithConnection
					//estadoservicioLogic.getSetVersionRowEstadoServicios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadoserviciosEliminados= new ArrayList<EstadoServicio>();		
			}
			
			if(this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Servicio GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Servicio",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadoservicio=estadoservicioAux;
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
      		//this.finishProcessEstadoServicio();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoServicio estadoservicioLocal) throws Exception {
		
		if(this.estadoservicioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoServicio estadoservicioLocal) throws Exception {	
		if(this.estadoservicioSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoServicioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoservicio =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadoservicio =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadoservicioValidator.getInvalidValues(this.estadoservicio);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoServicio estadoservicio,List<EstadoServicio> estadoservicios) throws Exception {
		try	{		
			EstadoServicioConstantesFunciones.actualizarLista(estadoservicio,estadoservicios,this.estadoservicioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoServicio estadoservicio,List<EstadoServicio> estadoservicios) throws Exception {
		try	{			
			EstadoServicioConstantesFunciones.actualizarSelectedLista(estadoservicio,estadoservicios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoServicio> estadoserviciosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadoserviciosLocal=this.estadoservicioLogic.getEstadoServicios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadoserviciosLocal=this.estadoservicios;
			}
			//ARCHITECTURE
		
			for(EstadoServicio estadoservicioLocal:estadoserviciosLocal) {
				if(this.permiteMantenimiento(estadoservicioLocal) && estadoservicioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoServicioConstantesFunciones.getEstadoServicioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoServicioConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoServicio.jLabelcodigoEstadoServicio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoServicioConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoServicio.jLabelnombreEstadoServicio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoServicioConstantesFunciones.ESDEFECTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoServicio.jLabeles_defectoEstadoServicio,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoServicio.jLabelcodigoEstadoServicio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoServicio.jLabelnombreEstadoServicio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoServicio.jLabeles_defectoEstadoServicio,"");
		
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
		this.iIdNuevoEstadoServicio--;	
		
		
		this.estadoservicioAux=new EstadoServicio();
		
		this.estadoservicioAux.setId(this.iIdNuevoEstadoServicio);
		this.estadoservicioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoservicioLogic.getEstadoServicios().add(this.estadoservicioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadoservicios.add(this.estadoservicioAux);
		}
		//ARCHITECTURE
		
		this.estadoservicio=this.estadoservicioAux;
		
		if(EstadoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoServicio(this.estadoservicio);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoServicio(this.estadoservicio);
		}
				
		//this.setDefaultControlesEstadoServicio();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoServicio();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoServicio();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoServicio();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoServicio(this.estadoservicioBean,this.estadoservicio,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoServicio(this.estadoservicio);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoServicioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadoservicioSessionBean.getConGuardarRelaciones()) {
			classes=EstadoServicioConstantesFunciones.getClassesRelationshipsOfEstadoServicio(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadoservicioReturnGeneral=estadoservicioLogic.procesarEventosEstadoServiciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoservicioLogic.getEstadoServicios(),this.estadoservicio,this.estadoservicioParameterGeneral,this.isEsNuevoEstadoServicio,classes);//this.estadoservicioLogic.getEstadoServicio()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoServicio(this.estadoservicioReturnGeneral,this.estadoservicioBean,false);
		
		if(this.estadoservicioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoServicio(this.estadoservicioReturnGeneral.getEstadoServicio());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoServicio(this.estadoservicioReturnGeneral.getEstadoServicio());
		}
		
		if(this.estadoservicioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoServicio(this.estadoservicioReturnGeneral.getEstadoServicio(),classes);//this.estadoservicioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoServicio(this.estadoservicio,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoServicio();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoServicio();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoServicio(false);
						
			if(estadoservicioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EstadoServicioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoServicio();
			}
			
			this.actualizarVisualTableDatosEstadoServicio();
			
			this.jTableDatosEstadoServicio.setRowSelectionInterval(this.getIndiceNuevoEstadoServicio(), this.getIndiceNuevoEstadoServicio());
			
			this.seleccionarFilaTablaEstadoServicioActual();
						
			this.actualizarEstadoCeldasBotonesEstadoServicio("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoServicio(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoServicio.jTextFieldcodigoEstadoServicio.setEnabled(isHabilitar && this.estadoservicioConstantesFunciones.activarcodigoEstadoServicio);
		this.jInternalFrameDetalleFormEstadoServicio.jTextFieldnombreEstadoServicio.setEnabled(isHabilitar && this.estadoservicioConstantesFunciones.activarnombreEstadoServicio);
		this.jInternalFrameDetalleFormEstadoServicio.jCheckBoxes_defectoEstadoServicio.setEnabled(isHabilitar && this.estadoservicioConstantesFunciones.activares_defectoEstadoServicio);	
		
	};
	
	public void setDefaultControlesEstadoServicio() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoServicio(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadoservicioSessionBean.setConGuardarRelaciones(true);			
			this.estadoservicioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoServicio.jTabbedPaneRelacionesEstadoServicio.setVisible(true);
			
					
		} else {
			//this.estadoservicioSessionBean.setConGuardarRelaciones(false);			
			this.estadoservicioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoServicio.jTabbedPaneRelacionesEstadoServicio.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEstadoServicio() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoServicio estadoservicioAux:this.estadoservicioLogic.getEstadoServicios()) {
				if(estadoservicioAux.getId().equals(this.iIdNuevoEstadoServicio)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoServicio estadoservicioAux:this.estadoservicios) {
				if(estadoservicioAux.getId().equals(this.iIdNuevoEstadoServicio)) {
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
	
	public int getIndiceActualEstadoServicio(EstadoServicio estadoservicio,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoServicio estadoservicioAux:this.estadoservicioLogic.getEstadoServicios()) {
				if(estadoservicioAux.getId().equals(estadoservicio.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoServicio estadoservicioAux:this.estadoservicios) {
				if(estadoservicioAux.getId().equals(estadoservicio.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoServicio(EstadoServicio estadoservicioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoServicio estadoservicioAux:this.estadoservicioLogic.getEstadoServicios()) {
				if(estadoservicioAux.getEstadoServicioOriginal().getId().equals(estadoservicioOriginal.getId())) {
					existe=true;
					estadoservicioOriginal.setId(estadoservicioAux.getId());
					estadoservicioOriginal.setVersionRow(estadoservicioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoServicio estadoservicioAux:this.estadoservicios) {
				if(estadoservicioAux.getEstadoServicioOriginal().getId().equals(estadoservicioOriginal.getId())) {
					existe=true;
					estadoservicioOriginal.setId(estadoservicioAux.getId());
					estadoservicioOriginal.setVersionRow(estadoservicioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoServicio(Boolean esParaCancelar) throws Exception {
		estadoserviciosAux=new ArrayList<EstadoServicio>();
		estadoservicioAux=new EstadoServicio();
		
		if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoServicio estadoservicioAux:this.estadoservicioLogic.getEstadoServicios()) {
					if(estadoservicioAux.getId()<0) {
						estadoserviciosAux.add(estadoservicioAux);
					}		
				}
				this.iIdNuevoEstadoServicio=0L;
				this.estadoservicioLogic.getEstadoServicios().removeAll(estadoserviciosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoServicio estadoservicioAux:this.estadoservicios) {
					if(estadoservicioAux.getId()<0) {
						estadoserviciosAux.add(estadoservicioAux);
					}		
				}
				this.iIdNuevoEstadoServicio=0L;
				this.estadoservicios.removeAll(estadoserviciosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoServicio 
					&& this.estadoservicioLogic.getEstadoServicios().size()>0
					) {
					estadoservicioAux=this.estadoservicioLogic.getEstadoServicios().get(this.estadoservicioLogic.getEstadoServicios().size() - 1);
				
					if(estadoservicioAux.getId()<0) {
						this.estadoservicioLogic.getEstadoServicios().remove(estadoservicioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoServicio && this.estadoservicios.size()>0) {
					estadoservicioAux=this.estadoservicios.get(this.estadoservicios.size() - 1);
				
					if(estadoservicioAux.getId()<0) {
						this.estadoservicios.remove(estadoservicioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoServicio(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadoservicio.getId()<0) {
				this.estadoservicioLogic.getEstadoServicios().remove(this.estadoservicio);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadoservicio.getId()<0) {
				this.estadoservicios.remove(this.estadoservicio);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoServicio(List<EstadoServicio> estadoserviciosAux) throws Exception {
		EstadoServicioConstantesFunciones.setEstadosInicialesEstadoServicio(estadoserviciosAux);
	}
	
	public void setEstadosInicialesEstadoServicio(EstadoServicio estadoservicioAux) throws Exception {
		EstadoServicioConstantesFunciones.setEstadosInicialesEstadoServicio(estadoservicioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoServicioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoServicioActual()) {
				if(!this.isEsNuevoEstadoServicio) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoServicio=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoServicioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Servicio ?", "MANTENIMIENTO DE Estado Servicio", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoServicio estadoservicio) throws Exception {
		EstadoServicioConstantesFunciones.seleccionarAsignar(this.estadoservicio,estadoservicio);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoServicio=this.isPermisoActualizarOriginalEstadoServicio;
			
			
			this.seleccionarAsignar(estadoservicio);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoServicioConstantesFunciones.quitarEspaciosEstadoServicio(this.estadoservicio,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoServicio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadoservicioSessionBean.setsFuncionBusquedaRapida(this.estadoservicioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoServicio) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoServicio(esParaCancelar);				
				this.cancelarNuevoEstadoServicio(esParaCancelar);								
			}
			
			this.estadoservicio=new EstadoServicio();
			
			this.inicializarEstadoServicio();
			
			this.actualizarEstadoCeldasBotonesEstadoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoServicio() throws Exception {
		try {
			EstadoServicioConstantesFunciones.inicializarEstadoServicio(this.estadoservicio);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadoservicioLogic.getEstadoServicios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoServicios(String sAccionBusqueda,List<EstadoServicio> estadoserviciosParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoServicio"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoServicioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoServicioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoServicio"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Servicioes");		
		parameters.put("busquedapor", EstadoServicioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoServicio=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoServicioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoServicioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoServicio=new JRBeanArrayDataSource(EstadoServicioJInternalFrame.TraerEstadoServicioBeans(estadoserviciosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoServicio);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoServicioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoServicioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoServicioBean.TraerEstadoServicioBeans(estadoserviciosParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoServicios(sAccionBusqueda,sTipoArchivoReporte,estadoserviciosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoServicios(sAccionBusqueda,sTipoArchivoReporte,estadoserviciosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoServicioActionPerformed(null);
					//this.generarExcelReporteEstadoServicios(sAccionBusqueda,sTipoArchivoReporte,estadoserviciosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoServicios(sAccionBusqueda,sTipoArchivoReporte,estadoserviciosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoServicios(sAccionBusqueda,sTipoArchivoReporte,estadoserviciosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoServicios(sAccionBusqueda,sTipoArchivoReporte,estadoserviciosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoServicios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoServicio> estadoserviciosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoservicio";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoServicios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoServicio("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoServicio estadoservicio : estadoserviciosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoServicioConstantesFunciones.generarExcelReporteDataEstadoServicio("NORMAL",row,workbook,estadoservicio,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Servicio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoServicio(String sTipo,Row row,Workbook workbook) {
		
		EstadoServicioConstantesFunciones.generarExcelReporteHeaderEstadoServicio(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoServicios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoServicio> estadoserviciosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoservicio_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoServicios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoServicio estadoservicio : estadoserviciosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoServicioConstantesFunciones.getEstadoServicioDescripcion(estadoservicio));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoServicioConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoServicioConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoservicio.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoServicioConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoServicioConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoservicio.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoServicioConstantesFunciones.LABEL_ESDEFECTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoServicioConstantesFunciones.LABEL_ESDEFECTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(estadoservicio.getes_defecto()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Servicio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoServicios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoServicio> estadoserviciosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoServicio> estadoserviciosRespaldo=null;
		
		classes=EstadoServicioConstantesFunciones.getClassesRelationshipsOfEstadoServicio(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadoservicioLogic.setDatosCliente(this.datosCliente);
		this.estadoservicioLogic.setDatosDeep(this.datosDeep);
		this.estadoservicioLogic.setIsConDeep(true);
		
		estadoserviciosRespaldo=this.estadoservicioLogic.getEstadoServicios();
		
		this.estadoservicioLogic.setEstadoServicios(estadoserviciosParaReportes);	
		this.estadoservicioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadoserviciosParaReportes=this.estadoservicioLogic.getEstadoServicios();
		this.estadoservicioLogic.setEstadoServicios(estadoserviciosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoservicio_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoServicios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoServicio("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoServicio estadoservicio : estadoserviciosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoServicio("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoServicioConstantesFunciones.generarExcelReporteDataEstadoServicio("NORMAL",row,workbook,estadoservicio,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoServicioConstantesFunciones.getEstadoServicioDescripcion(estadoservicio));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Servicio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoServicio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoServicio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoServicio.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoServicio.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoServicio() throws Exception {		
		this.startProcessEstadoServicio(true);
	}
	
	public void startProcessEstadoServicio(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoServicio, this.jScrollPanelDatosEstadoServicio,this.jPanelPaginacionEstadoServicio, this.jScrollPanelDatosEdicionEstadoServicio, this.jPanelAccionesEstadoServicio,this.jPanelAccionesFormularioEstadoServicio,this.jmenuBarEstadoServicio,this.jmenuBarDetalleEstadoServicio,this.jTtoolBarEstadoServicio,this.jTtoolBarDetalleEstadoServicio);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoServicio=null; 
		
		final JPanel jPanelParametrosReportesEstadoServicio=this.jPanelParametrosReportesEstadoServicio;
		//final JScrollPane jScrollPanelDatosEstadoServicio=this.jScrollPanelDatosEstadoServicio;
		final JTable jTableDatosEstadoServicio=this.jTableDatosEstadoServicio;		
		final JPanel jPanelPaginacionEstadoServicio=this.jPanelPaginacionEstadoServicio;
		//final JScrollPane jScrollPanelDatosEdicionEstadoServicio=this.jScrollPanelDatosEdicionEstadoServicio;
		final JPanel jPanelAccionesEstadoServicio=this.jPanelAccionesEstadoServicio;
		
		JPanel jPanelCamposAuxiliarEstadoServicio=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoServicio=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
			jPanelCamposAuxiliarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jPanelCamposEstadoServicio;
			jPanelAccionesFormularioAuxiliarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jPanelAccionesFormularioEstadoServicio;
		}
		
		final JPanel jPanelCamposEstadoServicio=jPanelCamposAuxiliarEstadoServicio;
		final JPanel jPanelAccionesFormularioEstadoServicio=jPanelAccionesFormularioAuxiliarEstadoServicio;
		
		
		final JMenuBar jmenuBarEstadoServicio=this.jmenuBarEstadoServicio;
		final JToolBar jTtoolBarEstadoServicio=this.jTtoolBarEstadoServicio;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoServicio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoServicio=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
			jmenuBarDetalleAuxiliarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jmenuBarDetalleEstadoServicio;
			jTtoolBarDetalleAuxiliarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jTtoolBarDetalleEstadoServicio;
		}
		
		final JMenuBar jmenuBarDetalleEstadoServicio=jmenuBarDetalleAuxiliarEstadoServicio;
		final JToolBar jTtoolBarDetalleEstadoServicio=jTtoolBarDetalleAuxiliarEstadoServicio;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoServicio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoServicio;
			processRunnable.jTableDatos=jTableDatosEstadoServicio;
			processRunnable.jPanelCampos=jPanelCamposEstadoServicio;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoServicio;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoServicio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoServicio;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoServicio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoServicio;
			processRunnable.jTtoolBar=jTtoolBarEstadoServicio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoServicio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoServicio ,jPanelParametrosReportesEstadoServicio,jTableDatosEstadoServicio, /*jScrollPanelDatosEstadoServicio,*/jPanelCamposEstadoServicio,jPanelPaginacionEstadoServicio, /*jScrollPanelDatosEdicionEstadoServicio,*/ jPanelAccionesEstadoServicio,jPanelAccionesFormularioEstadoServicio,jmenuBarEstadoServicio,jmenuBarDetalleEstadoServicio,jTtoolBarEstadoServicio,jTtoolBarDetalleEstadoServicio);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoServicio, jScrollPanelDatosEstadoServicio,jPanelPaginacionEstadoServicio, jScrollPanelDatosEdicionEstadoServicio, jPanelAccionesEstadoServicio,jPanelAccionesFormularioEstadoServicio,jmenuBarEstadoServicio,jmenuBarDetalleEstadoServicio,jTtoolBarEstadoServicio,jTtoolBarDetalleEstadoServicio);
						
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
	
	public void finishProcessEstadoServicio() {// throws Exception 
		this.finishProcessEstadoServicio(true);
	}
	
	public void finishProcessEstadoServicio(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoServicio, this.jScrollPanelDatosEstadoServicio,this.jPanelPaginacionEstadoServicio, this.jScrollPanelDatosEdicionEstadoServicio, this.jPanelAccionesEstadoServicio,this.jPanelAccionesFormularioEstadoServicio,this.jmenuBarEstadoServicio,this.jmenuBarDetalleEstadoServicio,this.jTtoolBarEstadoServicio,this.jTtoolBarDetalleEstadoServicio);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoServicio=null; 
		
		final JPanel jPanelParametrosReportesEstadoServicio=this.jPanelParametrosReportesEstadoServicio;
		//final JScrollPane jScrollPanelDatosEstadoServicio=this.jScrollPanelDatosEstadoServicio;
		final JTable jTableDatosEstadoServicio=this.jTableDatosEstadoServicio;		
		final JPanel jPanelPaginacionEstadoServicio=this.jPanelPaginacionEstadoServicio;
		//final JScrollPane jScrollPanelDatosEdicionEstadoServicio=this.jScrollPanelDatosEdicionEstadoServicio;
		final JPanel jPanelAccionesEstadoServicio=this.jPanelAccionesEstadoServicio;
		
		JPanel jPanelCamposAuxiliarEstadoServicio=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoServicio=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
			jPanelCamposAuxiliarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jPanelCamposEstadoServicio;
			jPanelAccionesFormularioAuxiliarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jPanelAccionesFormularioEstadoServicio;
		}
		
		final JPanel jPanelCamposEstadoServicio=jPanelCamposAuxiliarEstadoServicio;
		final JPanel jPanelAccionesFormularioEstadoServicio=jPanelAccionesFormularioAuxiliarEstadoServicio;
		
		
		final JMenuBar jmenuBarEstadoServicio=this.jmenuBarEstadoServicio;		
		final JToolBar jTtoolBarEstadoServicio=this.jTtoolBarEstadoServicio;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoServicio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoServicio=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
			jmenuBarDetalleAuxiliarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jmenuBarDetalleEstadoServicio;
			jTtoolBarDetalleAuxiliarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jTtoolBarDetalleEstadoServicio;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoServicio=jmenuBarDetalleAuxiliarEstadoServicio;
		final JToolBar jTtoolBarDetalleEstadoServicio=jTtoolBarDetalleAuxiliarEstadoServicio;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoServicio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoServicio;
			processRunnable.jTableDatos=jTableDatosEstadoServicio;
			processRunnable.jPanelCampos=jPanelCamposEstadoServicio;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoServicio;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoServicio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoServicio;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoServicio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoServicio;
			processRunnable.jTtoolBar=jTtoolBarEstadoServicio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoServicio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoServicio ,jPanelParametrosReportesEstadoServicio, jTableDatosEstadoServicio,/*jScrollPanelDatosEstadoServicio,*/jPanelCamposEstadoServicio,jPanelPaginacionEstadoServicio, /*jScrollPanelDatosEdicionEstadoServicio,*/ jPanelAccionesEstadoServicio,jPanelAccionesFormularioEstadoServicio,jmenuBarEstadoServicio,jmenuBarDetalleEstadoServicio,jTtoolBarEstadoServicio,jTtoolBarDetalleEstadoServicio));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoServicio(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoServicio(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoServicio(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoServicio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoServicio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoServicio,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoServicio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoServicio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoServicio,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadoservicioConstantesFunciones.getsFinalQueryEstadoServicio();
		String  finalQueryPaginacionTodos=this.estadoservicioConstantesFunciones.getsFinalQueryEstadoServicio();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoServicioConstantesFunciones.getArrayColumnasGlobalesNoEstadoServicio(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoServicioConstantesFunciones.getArrayColumnasGlobalesEstadoServicio(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoServicioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadoserviciosEliminados= new ArrayList<EstadoServicio>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoServicio();
		
				///*EstadoServicioSessionBean*/this.estadoservicioSessionBean=new EstadoServicioSessionBean();
			
			if(this.estadoservicioSessionBean==null) {
				this.estadoservicioSessionBean=new EstadoServicioSessionBean();
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
					this.iNumeroPaginacion=EstadoServicioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoServicioConstantesFunciones.getClassesForeignKeysOfEstadoServicio(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadoservicio."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadoserviciosAux= new ArrayList<EstadoServicio>();
			
				
			estadoservicioLogic.setDatosCliente(this.datosCliente);
			estadoservicioLogic.setDatosDeep(this.datosDeep);
			estadoservicioLogic.setIsConDeep(true);
			
			
			estadoservicioLogic.getEstadoServicioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadoservicioLogic.getTodosEstadoServicios(finalQueryGlobal,pagination);
					
					//estadoservicioLogic.getTodosEstadoServiciosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadoservicioLogic.getEstadoServicios()==null|| estadoservicioLogic.getEstadoServicios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoserviciosAux= new ArrayList<EstadoServicio>();
							estadoserviciosAux.addAll(estadoservicioLogic.getEstadoServicios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoserviciosAux= new ArrayList<EstadoServicio>();
							estadoserviciosAux.addAll(estadoservicios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoservicioLogic.getTodosEstadoServicios(finalQueryGlobal+"",this.pagination);												
							
							//estadoservicioLogic.getTodosEstadoServiciosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoServicios("Todos",estadoservicioLogic.getEstadoServicios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoservicioLogic.setEstadoServicios(new ArrayList<EstadoServicio>());					
							estadoservicioLogic.getEstadoServicios().addAll(estadoserviciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoservicios=new ArrayList<EstadoServicio>();
							estadoservicios.addAll(estadoserviciosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoServicio=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoServicio=this.idActual;
				
				} else if(this.idEstadoServicioActual!=null && this.idEstadoServicioActual!=0L) {
					idEstadoServicio=idEstadoServicioActual;
				}
				
					
				this.sDetalleReporte=EstadoServicioConstantesFunciones.getDetalleIndicePorId(idEstadoServicio);
				
				this.estadoservicios=new ArrayList<EstadoServicio>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadoservicioLogic.getEntity(idEstadoServicio);
					
					//estadoservicioLogic.getEntityWithConnection(idEstadoServicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoservicioLogic.setEstadoServicios(new ArrayList<EstadoServicio>());
					estadoservicioLogic.getEstadoServicios().add(estadoservicioLogic.getEstadoServicio());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoservicios=new ArrayList<EstadoServicio>();
					this.estadoservicios.add(estadoservicio);
				}
				
				if(estadoservicioLogic.getEstadoServicio()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoServicio();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoServicio();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoservicioLogic.getEstadoServicios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoservicios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoservicioLogic.getEstadoServicios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoservicios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoServicio estadoservicio) {
		Boolean permite=true;
		
		if(this.estadoservicio.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoServicioConstantesFunciones.getOrderByListaEstadoServicio();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoServicioConstantesFunciones.getOrderByListaEstadoServicio();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoServicio estadoservicio:estadoservicioLogic.getEstadoServicios()) {
				if(estadoservicio.getsType().equals(Constantes2.S_TOTALES)) {
					estadoservicioTotales=estadoservicio;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoServicio estadoservicio:this.estadoservicios) {
				if(estadoservicio.getsType().equals(Constantes2.S_TOTALES)) {
					estadoservicioTotales=estadoservicio;
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
			this.estadoservicioAux=new EstadoServicio();
			this.estadoservicioAux.setsType(Constantes2.S_TOTALES);
			this.estadoservicioAux.setIsNew(false);
			this.estadoservicioAux.setIsChanged(false);
			this.estadoservicioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoServicioConstantesFunciones.TotalizarValoresFilaEstadoServicio(this.estadoservicioLogic.getEstadoServicios(),this.estadoservicioAux);
				
				this.estadoservicioLogic.getEstadoServicios().add(this.estadoservicioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoServicioConstantesFunciones.TotalizarValoresFilaEstadoServicio(this.estadoservicios,this.estadoservicioAux);
				
				this.estadoservicios.add(this.estadoservicioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadoservicioTotales=new EstadoServicio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoservicioLogic.getEstadoServicios().remove(estadoservicioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoservicios.remove(estadoservicioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadoservicioTotales=new EstadoServicio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoServicio estadoservicio:estadoservicioLogic.getEstadoServicios()) {
				if(estadoservicio.getsType().equals(Constantes2.S_TOTALES)) {
					estadoservicioTotales=estadoservicio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoServicioConstantesFunciones.TotalizarValoresFilaEstadoServicio(this.estadoservicioLogic.getEstadoServicios(),estadoservicioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoServicio estadoservicio:this.estadoservicios) {
				if(estadoservicio.getsType().equals(Constantes2.S_TOTALES)) {
					estadoservicioTotales=estadoservicio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoServicioConstantesFunciones.TotalizarValoresFilaEstadoServicio(this.estadoservicios,estadoservicioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoServicio() {
		this.isPermisoTodoEstadoServicio=false;
		this.isPermisoNuevoEstadoServicio=false;
		this.isPermisoActualizarEstadoServicio=false;
		this.isPermisoActualizarOriginalEstadoServicio=false;
		this.isPermisoEliminarEstadoServicio=false;
		this.isPermisoGuardarCambiosEstadoServicio=false;
		this.isPermisoConsultaEstadoServicio=false;
		this.isPermisoBusquedaEstadoServicio=false;
		this.isPermisoReporteEstadoServicio=false;		
		this.isPermisoOrdenEstadoServicio=false;		
		this.isPermisoPaginacionMedioEstadoServicio=false;		
		this.isPermisoPaginacionAltoEstadoServicio=false;
		this.isPermisoPaginacionTodoEstadoServicio=false;
		this.isPermisoCopiarEstadoServicio=false;		
		this.isPermisoVerFormEstadoServicio=false;		
		this.isPermisoDuplicarEstadoServicio=false;		
		this.isPermisoOrdenEstadoServicio=false;		
	}
	
	public void setPermisosUsuarioEstadoServicio(Boolean isPermiso) {
		this.isPermisoTodoEstadoServicio=isPermiso;
		this.isPermisoNuevoEstadoServicio=isPermiso;
		this.isPermisoActualizarEstadoServicio=isPermiso;
		this.isPermisoActualizarOriginalEstadoServicio=isPermiso;
		this.isPermisoEliminarEstadoServicio=isPermiso;
		this.isPermisoGuardarCambiosEstadoServicio=isPermiso;
		this.isPermisoConsultaEstadoServicio=isPermiso;
		this.isPermisoBusquedaEstadoServicio=isPermiso;
		this.isPermisoReporteEstadoServicio=isPermiso;
		this.isPermisoOrdenEstadoServicio=isPermiso;		
		this.isPermisoPaginacionMedioEstadoServicio=isPermiso;		
		this.isPermisoPaginacionAltoEstadoServicio=isPermiso;		
		this.isPermisoPaginacionTodoEstadoServicio=isPermiso;		
		this.isPermisoCopiarEstadoServicio=isPermiso;		
		this.isPermisoVerFormEstadoServicio=isPermiso;		
		this.isPermisoDuplicarEstadoServicio=isPermiso;
		this.isPermisoOrdenEstadoServicio=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoServicio(Boolean isPermiso) {
		//this.isPermisoTodoEstadoServicio=isPermiso;
		this.isPermisoNuevoEstadoServicio=isPermiso;
		this.isPermisoActualizarEstadoServicio=isPermiso;
		this.isPermisoActualizarOriginalEstadoServicio=isPermiso;
		this.isPermisoEliminarEstadoServicio=isPermiso;
		this.isPermisoGuardarCambiosEstadoServicio=isPermiso;
		//this.isPermisoConsultaEstadoServicio=isPermiso;
		//this.isPermisoBusquedaEstadoServicio=isPermiso;
		//this.isPermisoReporteEstadoServicio=isPermiso;
		//this.isPermisoOrdenEstadoServicio=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoServicio=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoServicio=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoServicio=isPermiso;		
		//this.isPermisoCopiarEstadoServicio=isPermiso;		
		//this.isPermisoDuplicarEstadoServicio=isPermiso;
		//this.isPermisoOrdenEstadoServicio=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoServicioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EstadoServicioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoServicio(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoServicioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoServicioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoServicioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoServicioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEstadoServicio() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoServicioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoServicioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoServicio=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoServicio=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoServicio=this.isPermisoActualizarEstadoServicio;
			this.isPermisoEliminarEstadoServicio=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoServicio=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoServicio=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoServicio=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoServicio=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoServicio=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoServicio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoServicio=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoServicio=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoServicio=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoServicio=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoServicio=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoServicio=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoServicio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoServicio.setToolTipText(this.jTableDatosEstadoServicio.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoServicio(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoServicio(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoServicioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoServicioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoServicio() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyEstadoServicioListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoServicioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoServicioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoServicioListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoServicioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoServicio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoServicio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoServicio(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoServicio()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoServicio();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoServicio(EstadoServicio estadoservicio)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoServicio(EstadoServicio estadoservicio,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoServicio()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoServicio()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoServicio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoServicio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoServicio()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoServicio()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoServicio(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoServicio()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoServicioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoServicioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoServicioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadoservicioSessionBean=new EstadoServicioSessionBean(); 
		this.estadoservicioConstantesFunciones=new EstadoServicioConstantesFunciones(); 
		this.estadoservicioBean=new EstadoServicio();//(this.estadoservicioConstantesFunciones); 		
		this.estadoservicioReturnGeneral=new EstadoServicioParameterReturnGeneral(); 
		
		this.estadoservicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoservicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoServicioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoServicioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoServicioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoServicio(true);
			
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
			
			this.estadoservicioConstantesFunciones=new EstadoServicioConstantesFunciones(); 
			this.estadoservicioBean=new EstadoServicio();//this.estadoservicioConstantesFunciones); 			
			this.estadoservicioReturnGeneral=new EstadoServicioParameterReturnGeneral(); 
		
			EstadoServicioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Servicio Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadoservicio=new EstadoServicio();
			this.estadoservicios = new ArrayList<EstadoServicio>();
			this.estadoserviciosAux = new ArrayList<EstadoServicio>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic=new EstadoServicioLogic();
				this.estadoservicioLogic.getNewConnexionToDeep("");
			}
			
			//this.estadoservicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadoservicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoServicio);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoServicio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoServicio);	
					}
					
					if(this.jInternalFrameImportacionEstadoServicio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoServicio);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoServicio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoServicio);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoServicio);
				this.jInternalFrameDetalleFormEstadoServicio.setVisible(false);
				this.jInternalFrameDetalleFormEstadoServicio.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoServicio!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoServicio);
					this.jInternalFrameReporteDinamicoEstadoServicio.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoServicio.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoServicio!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoServicio);
					this.jInternalFrameImportacionEstadoServicio.setVisible(false);
					this.jInternalFrameImportacionEstadoServicio.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoServicio!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoServicio);
					this.jInternalFrameOrderByEstadoServicio.setVisible(false);
					this.jInternalFrameOrderByEstadoServicio.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoServicioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoServicioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadoservicioReturnGeneral=new EstadoServicioParameterReturnGeneral();
			
			this.estadoservicioParameterGeneral=new EstadoServicioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadoservicioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoServicioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoServicioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoservicioSessionBean.getEsGuardarRelacionado(),this.estadoservicioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoServicioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoservicioSessionBean.getEsGuardarRelacionado(),this.estadoservicioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoServicio=false;
			this.isVisibilidadCeldaDuplicarEstadoServicio=true;
			this.isVisibilidadCeldaCopiarEstadoServicio=true;
			this.isVisibilidadCeldaVerFormEstadoServicio=true;
			this.isVisibilidadCeldaOrdenEstadoServicio=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoServicio=false;
			this.isVisibilidadCeldaModificarEstadoServicio=false;
			this.isVisibilidadCeldaActualizarEstadoServicio=false;
			this.isVisibilidadCeldaEliminarEstadoServicio=false;
			this.isVisibilidadCeldaCancelarEstadoServicio=false;
			this.isVisibilidadCeldaGuardarEstadoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoServicio=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoServicio();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoServicio(false);
			
			this.setPermisosUsuarioEstadoServicio();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoservicioSessionBean.getEsGuardarRelacionado() 
				|| (this.estadoservicioSessionBean.getEsGuardarRelacionado() && this.estadoservicioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoServicioClasesRelacionadas();
			}
			
			if(this.estadoservicioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoServicioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoServicioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoServicio();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoServicio();
			}
			
			if(!this.isPermisoBusquedaEstadoServicio) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoServicio,this.isPermisoPaginacionMedioEstadoServicio,this.isPermisoPaginacionTodoEstadoServicio);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoServicioConstantesFunciones.getTiposSeleccionarEstadoServicio());
				
				this.tiposColumnasSelect=EstadoServicioConstantesFunciones.getTiposSeleccionarEstadoServicio(true);
				
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
			//if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoServicio();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoServicio(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoServicio(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoServicio() ;
			
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
				estadoservicioImplementable= (EstadoServicioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoServicioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadoservicioImplementableHome= (EstadoServicioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoServicioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadoservicios= new ArrayList<EstadoServicio>();
			this.estadoserviciosEliminados= new ArrayList<EstadoServicio>();
						
			this.isEsNuevoEstadoServicio=false;
			this.esParaAccionDesdeFormularioEstadoServicio=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoServicio(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoServicio();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoServicioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoServicio(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoServicio!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoServicio();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoServicio();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoServicio(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoServicio: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoServicio() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoServicio")) {
				iIndex=this.jInternalFrameDetalleFormEstadoServicio.jTabbedPaneRelacionesEstadoServicio.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoServicio.jTabbedPaneRelacionesEstadoServicio.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoServicio();	
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
	
	public void cargarCombosForeignKeyEstadoServicio(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoServicio(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoServicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoServicioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoServicio();
		
		this.cargarCombosFrameForeignKeyEstadoServicio();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoServicio();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoServicio();
		}
	}
	
	
	
	public void jButtonNuevoEstadoServicioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadoservicioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
			
			
			if(jTableDatosEstadoServicio.getRowCount()>=1) {
				jTableDatosEstadoServicio.removeRowSelectionInterval(0, jTableDatosEstadoServicio.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoServicio=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoServicio(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoServicio(true);			
			//this.estadoservicio=new EstadoServicio();
			//this.estadoservicio.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoServicio(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoServicio() ;
			
			if(EstadoServicioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoServicio(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadoservicio);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadoservicio);				
			
			EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
			
			if(this.estadoservicioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoServicio: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoServicioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoServicio> estadoserviciosSeleccionados=new ArrayList<EstadoServicio>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoServicio.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoServicio.getSelectedRows().length;			
			}
			
			estadoserviciosSeleccionados=this.getEstadoServiciosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoServicio--;			
				//EstadoServicio estadoservicioAux= new EstadoServicio();			
				//estadoservicioAux.setId(this.iIdNuevoEstadoServicio);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoServicio estadoservicioOrigen=new EstadoServicio();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoServicio estadoservicioOrigen : estadoserviciosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadoservicioOrigen =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoservicioOrigen =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoServicio();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadoservicio.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoServicio(estadoservicioOrigen,this.estadoservicio,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoServicio(this.estadoservicio);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoservicioLogic.getEstadoServicios().add(this.estadoservicioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoservicios.add(this.estadoservicioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoServicio(false);
				
				this.jTableDatosEstadoServicio.setRowSelectionInterval(this.getIndiceNuevoEstadoServicio(), this.getIndiceNuevoEstadoServicio());
				
				int iLastRow =  this.jTableDatosEstadoServicio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoServicio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoServicio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoServicio(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoServicio> estadoserviciosSeleccionados=new ArrayList<EstadoServicio>();									
		
			EstadoServicio estadoservicioOrigen=new EstadoServicio();
			EstadoServicio estadoservicioDestino=new EstadoServicio();
				
			estadoserviciosSeleccionados=this.getEstadoServiciosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoServicio.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadoserviciosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoServicio.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoservicioOrigen =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoservicioOrigen =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoservicioDestino =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoservicioDestino =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadoservicioOrigen =estadoserviciosSeleccionados.get(0);
				estadoservicioDestino =estadoserviciosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoServicio(estadoservicioOrigen,estadoservicioDestino,true,false);
				
				estadoservicioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoservicioDestino,estadoservicioLogic.getEstadoServicios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoservicioDestino,estadoservicios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoServicio(false);
				
				//this.jTableDatosEstadoServicio.setRowSelectionInterval(this.getIndiceNuevoEstadoServicio(), this.getIndiceNuevoEstadoServicio());
				
				int iLastRow =  this.jTableDatosEstadoServicio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoServicio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoServicio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoServicio(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoServicio.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoServicio.isVisible();
			
			
			this.jPanelParametrosReportesEstadoServicio.setVisible(!isVisible);
			this.jPanelPaginacionEstadoServicio.setVisible(!isVisible);
			this.jPanelAccionesEstadoServicio.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoServicio();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoServicio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoServicio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoServicio();
			
			this.abrirFrameOrderByEstadoServicio();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoServicio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoServicio(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoServicio);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoServicio.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoServicio.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoServicio.setSize(this.jInternalFrameDetalleFormEstadoServicio.iWidthFormulario,this.jInternalFrameDetalleFormEstadoServicio.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoServicio.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoServicio.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoServicio.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoServicio.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoServicio.jContentPaneDetalleEstadoServicio.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoServicio.jTabbedPaneRelacionesEstadoServicio.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoServicio.jContentPaneDetalleEstadoServicio.getWidth(),EstadoServicioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoServicio.jTabbedPaneRelacionesEstadoServicio.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoServicio.jContentPaneDetalleEstadoServicio.getWidth(),EstadoServicioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoServicio.jTabbedPaneRelacionesEstadoServicio.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoServicio.jContentPaneDetalleEstadoServicio.getWidth(),EstadoServicioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoServicio.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoServicio.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoServicio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoServicio==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoServicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoServicio,false,this);
				} else {
					this.jInternalFrameOrderByEstadoServicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoServicio,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoServicio);
				this.jInternalFrameOrderByEstadoServicio.setVisible(false);
				this.jInternalFrameOrderByEstadoServicio.setSelected(false);
				
				this.jInternalFrameOrderByEstadoServicio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoServicio"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoServicio();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoServicio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoServicio==null) {
				
				this.jInternalFrameImportacionEstadoServicio=new ImportacionJInternalFrame(EstadoServicioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoServicio);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoServicio);
				this.jInternalFrameImportacionEstadoServicio.setVisible(false);
				this.jInternalFrameImportacionEstadoServicio.setSelected(false);


				this.jInternalFrameImportacionEstadoServicio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoServicio"));
				this.jInternalFrameImportacionEstadoServicio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoServicio"));
				this.jInternalFrameImportacionEstadoServicio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoServicio"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoServicio() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoServicio==null) {
				this.jInternalFrameReporteDinamicoEstadoServicio=new ReporteDinamicoJInternalFrame(EstadoServicioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoServicio);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoServicio);
				this.jInternalFrameReporteDinamicoEstadoServicio.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoServicio.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoServicio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoServicio"));
				this.jInternalFrameReporteDinamicoEstadoServicio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoServicio"));
				this.jInternalFrameReporteDinamicoEstadoServicio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoServicio"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoServicio();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEstadoServicio() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoServicio);
			
	       	this.jInternalFrameDetalleFormEstadoServicio.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoServicio.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoServicio.dispose();
			//this.jInternalFrameDetalleFormEstadoServicio=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoServicio() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoServicio.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoServicio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoServicio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoServicio.setVisible(true);
	        this.jInternalFrameImportacionEstadoServicio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoServicio() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoServicio.setVisible(true);
	        this.jInternalFrameOrderByEstadoServicio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoServicio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoServicio.setVisible(false);
	        this.jInternalFrameOrderByEstadoServicio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoServicio() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoServicio.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoServicio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoServicio() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoServicio.setVisible(false);
	        this.jInternalFrameImportacionEstadoServicio.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoServicio(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoServicio(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoServicio(true);
			//this.isEsNuevoEstadoServicio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicio =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoservicio =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoServicio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoServicio(false) ;
			
			if(estadoservicioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EstadoServicioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoServicio(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoServicio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoServicioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicio =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoservicio =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoServicio(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoServicio(true);
			//this.isEsNuevoEstadoServicio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicio =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoservicio =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadoservicio.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoServicio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoServicio(false) ;
			
			if(EstadoServicioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoServicio(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoServicio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoServicio(false);
			
			//if(!this.isEsNuevoEstadoServicio) {								
				int intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicio =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoservicio =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoServicio(this.estadoservicio,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoServicio(this.estadoservicio);
				
			}
			
			if(this.permiteMantenimiento(this.estadoservicio)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoServicio=true;
					this.inicializarActualizarBindingTablaEstadoServicio(false);
					this.isEsNuevoEstadoServicio=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoServicio=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoServicio=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoServicio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoServicio(false);
				
				this.habilitarDeshabilitarControlesEstadoServicio(false);
			
												
				
				if(EstadoServicioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoServicio();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoServicioActionPerformed(evt,estadoservicioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoServicio(this.estadoservicio,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoServicio.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadoservicioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadoservicio.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoServicio.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoServicio.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicio =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				this.estadoservicio.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoservicio =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				this.estadoservicio.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadoservicio)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoServicioModel) this.jTableDatosEstadoServicio.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoServicio=true;
				this.inicializarActualizarBindingTablaEstadoServicio(false);
				this.isEsNuevoEstadoServicio=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoServicio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoServicio(false);
				
				this.habilitarDeshabilitarControlesEstadoServicio(false);
				
				
				
				if(EstadoServicioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoServicio();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoServicioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoServicio.getRowCount()>=1) {
				jTableDatosEstadoServicio.removeRowSelectionInterval(0, jTableDatosEstadoServicio.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoServicio(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoServicio(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoServicio(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoServicio(false) ;
			
			this.isEsNuevoEstadoServicio=false;
			
			if(EstadoServicioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoServicio();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoServicio(false);
				
				//SI ES MANUAL
				if(EstadoServicioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoServicio();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoServicio--;			
			//EstadoServicio estadoservicioAux= new EstadoServicio();			
			//estadoservicioAux.setId(this.iIdNuevoEstadoServicio);
			
			if(this.jInternalFrameDetalleFormEstadoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoServicio();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoServicio(this.estadoservicio);
			
			this.estadoservicio.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadoservicioLogic.getEstadoServicios().add(this.estadoservicioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadoservicios.add(this.estadoservicioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoServicio(false);
			
			this.jTableDatosEstadoServicio.setRowSelectionInterval(this.getIndiceNuevoEstadoServicio(), this.getIndiceNuevoEstadoServicio());
			
			int iLastRow =  this.jTableDatosEstadoServicio.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoServicio.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoServicio.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoServicio(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoServicio(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoServicio(false);
			
			//SI ES MANUAL
			if(EstadoServicioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoServicio();
			}
			
			//this.abrirFrameTreeEstadoServicio();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoServicioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado ServicioES ?", "MANTENIMIENTO DE Estado Servicio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoServicio.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoServicio();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadoservicioReturnGeneral=estadoservicioLogic.procesarImportacionEstadoServiciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadoservicioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoServicioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoServicioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoServicio.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoServicio.setFileImportacion(this.jInternalFrameImportacionEstadoServicio.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoServicio.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoServicio.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoServicio.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoServicio.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoServicio> estadoserviciosSeleccionados=new ArrayList<EstadoServicio>();		

		estadoserviciosSeleccionados=this.getEstadoServiciosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoServicio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoServicio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoServicioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoServicioBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoServicios("Todos",estadoserviciosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Servicio",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoServicio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoServicio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoServicioConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoServicioConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoServicioConstantesFunciones.LABEL_ESDEFECTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Defecto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Defecto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Defecto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Defecto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEstadoServicio.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoServicio.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoServicio.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoServicioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoServicioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case EstadoServicioConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoria="es_defecto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoServicio.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoServicioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoServicioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case EstadoServicioConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoriaValor="es_defecto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoServicio.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoServicio.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoServicioConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoServicioConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case EstadoServicioConstantesFunciones.LABEL_ESDEFECTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Defecto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_defecto");
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoServicioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoServicio> estadoserviciosSeleccionados=new ArrayList<EstadoServicio>();		
		
		estadoserviciosSeleccionados=this.getEstadoServiciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoservicio";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoServicios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoServicio.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoServicio.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoServicioConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoServicioConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoServicio estadoservicio:estadoserviciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoservicio.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoServicioConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoServicioConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoServicio estadoservicio:estadoserviciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoservicio.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoServicioConstantesFunciones.LABEL_ESDEFECTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoServicioConstantesFunciones.LABEL_ESDEFECTO);
					iRow++;

					for(EstadoServicio estadoservicio:estadoserviciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoservicio.getes_defecto());
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
			//	this.getFilaCabeceraExportarExcelEstadoServicio(row);				
			//	iRow++;
			//}				
			
			//for(EstadoServicio estadoservicioAux:estadoserviciosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoServicio(estadoservicioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Servicio",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadoservicioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoServicio(false);
			
			//SI ES MANUAL
			if(EstadoServicioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoServicio();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoServicio(false);
			
			//SI ES MANUAL
			if(EstadoServicioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoServicio();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoServicio(false);
			
			//SI ES MANUAL
			if(EstadoServicioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoServicio();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoservicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoServicio() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoServicio.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoServicio.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoServicio.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoServicio.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoServicio.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoServicio.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoServicio.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoServicio(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoServicio(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoServicio(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoServicio(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoServicio(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoServicio(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoServicio(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoServicio(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoServicioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoServicioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoServicio() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoServicio();
		
		this.inicializarActualizarBindingBotonesManualEstadoServicio(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoServicio();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoServicio() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoServicio(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoServicio(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoServicio.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoServicio.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoServicio.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoServicio.jCheckBoxPostAccionNuevoEstadoServicio.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoServicio.jCheckBoxPostAccionSinCerrarEstadoServicio.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoServicio.jCheckBoxPostAccionSinMensajeEstadoServicio.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoServicio.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoServicio.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoServicio.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
				this.jInternalFrameDetalleFormEstadoServicio.jCheckBoxPostAccionNuevoEstadoServicio.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoServicio.jCheckBoxPostAccionSinCerrarEstadoServicio.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoServicio.jCheckBoxPostAccionSinMensajeEstadoServicio.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoServicio.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoServicio.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoServicio.jComboBoxTiposAccionesFormularioEstadoServicio.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoServicio.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoServicio!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoServicio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoServicio.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoServicio.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoServicio.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoServicio.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoServicio!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoServicio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoServicio.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoServicio.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoServicio(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoServicioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoServicio(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoServicio() throws Exception {
		try	{
			if(EstadoServicioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoServicio();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoServicio() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoServicio.jComboBoxTiposAccionesFormularioEstadoServicio.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoServicio.jComboBoxTiposAccionesFormularioEstadoServicio.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoServicio() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoServicio.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoServicio.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoServicio.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoServicio.addItem(reporte);
			}
			
			
			if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoServicio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoServicio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoServicio.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoServicio.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoServicio.jComboBoxTiposAccionesFormularioEstadoServicio.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoServicio.jComboBoxTiposAccionesFormularioEstadoServicio.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoServicio.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoServicio.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoServicio();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoServicio() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoServicio!=null) {
				this.jInternalFrameReporteDinamicoEstadoServicio.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoServicio.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoServicio!=null) {
				this.jInternalFrameReporteDinamicoEstadoServicio.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoServicio.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoServicio!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoServicio.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoServicio.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoServicio.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoServicio.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoServicio.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoServicio.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoServicio()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoServicio(Boolean esInicializar) throws Exception {				
		if(EstadoServicioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoServicio();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoServicio() throws Exception {
		this.inicializarActualizarBindingTablaEstadoServicio(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoServicio() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoServicio.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoServicio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoServicio.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoServicioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoServicio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoServicio.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoServicioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoServicioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoServicioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoServicioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoServicio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoServicio.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoServicioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoServicio.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoServicio(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadoservicioLogic.getEstadoServicios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadoservicios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoServicio.setModel(new EstadoServicioModel(this.estadoservicioLogic.getEstadoServicios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoServicio.setModel(new EstadoServicioModel(this.estadoservicios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoServicio!=null && this.jInternalFrameOrderByEstadoServicio.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoServicio();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoServicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoServicio,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoServicioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO,estadoservicioConstantesFunciones.resaltarSeleccionarEstadoServicio,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO,estadoservicioConstantesFunciones.resaltarSeleccionarEstadoServicio,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoServicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoServicio,EstadoServicioConstantesFunciones.LABEL_ID));

		if(this.estadoservicioConstantesFunciones.mostraridEstadoServicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoServicioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadoservicioConstantesFunciones.resaltaridEstadoServicio,this.estadoservicioConstantesFunciones.activaridEstadoServicio,this,true,"idEstadoServicio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoservicioConstantesFunciones.resaltaridEstadoServicio,this.estadoservicioConstantesFunciones.activaridEstadoServicio,this,true,"idEstadoServicio","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoServicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoServicio,EstadoServicioConstantesFunciones.LABEL_CODIGO));

		if(this.estadoservicioConstantesFunciones.mostrarcodigoEstadoServicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoServicioConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoservicioConstantesFunciones.resaltarcodigoEstadoServicio,this.estadoservicioConstantesFunciones.activarcodigoEstadoServicio,this,true,"codigoEstadoServicio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoservicioConstantesFunciones.resaltarcodigoEstadoServicio,this.estadoservicioConstantesFunciones.activarcodigoEstadoServicio,this,true,"codigoEstadoServicio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoServicioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoServicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoServicio,EstadoServicioConstantesFunciones.LABEL_NOMBRE));

		if(this.estadoservicioConstantesFunciones.mostrarnombreEstadoServicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoServicioConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoservicioConstantesFunciones.resaltarnombreEstadoServicio,this.estadoservicioConstantesFunciones.activarnombreEstadoServicio,this,true,"nombreEstadoServicio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoservicioConstantesFunciones.resaltarnombreEstadoServicio,this.estadoservicioConstantesFunciones.activarnombreEstadoServicio,this,true,"nombreEstadoServicio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoServicioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoServicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoServicio,EstadoServicioConstantesFunciones.LABEL_ESDEFECTO));

		if(this.estadoservicioConstantesFunciones.mostrares_defectoEstadoServicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoServicioConstantesFunciones.LABEL_ESDEFECTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.estadoservicioConstantesFunciones.resaltares_defectoEstadoServicio,this.estadoservicioConstantesFunciones.activares_defectoEstadoServicio));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.estadoservicioConstantesFunciones.resaltares_defectoEstadoServicio,this.estadoservicioConstantesFunciones.activares_defectoEstadoServicio,this,true,"es_defectoEstadoServicio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EstadoServicioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoservicioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoservicioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoServicio.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoservicioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoservicioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoServicio.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoServicio && this.isPermisoGuardarCambiosEstadoServicio) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadoservicioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadoservicioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoServicio.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoServicio.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoServicio && this.isPermisoGuardarCambiosEstadoServicio) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoServicio && this.isPermisoGuardarCambiosEstadoServicio) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoServicio.moveColumn(this.jTableDatosEstadoServicio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoServicio.moveColumn(this.jTableDatosEstadoServicio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoServicio.moveColumn(this.jTableDatosEstadoServicio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoServicio.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoServicio.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoServicio,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoServicio.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoServicio.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoServicio.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoServicio.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoServicio.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadoservicioLogic.getEstadoServicios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadoservicios.size()-1;
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
		//this.jTableDatosEstadoServicio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoServicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoServicio();
			
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
				
				//this.isEsNuevoEstadoServicio=false;
					
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
			
				if(this.estadoservicioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoServicio==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoServicio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoServicio.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicio =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoservicio =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadoservicio.getsType().equals("DUPLICADO")
				   || this.estadoservicio.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoServicio=true;
				
				} else {
					this.isEsNuevoEstadoServicio=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
					if(this.estadoservicio.getId()>=0 && !this.estadoservicio.getIsNew()) {						
						this.isEsNuevoEstadoServicio=false;
						
					} else {
						this.isEsNuevoEstadoServicio=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoServicio(esRelaciones);						
				
				this.seleccionarEstadoServicio(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadoservicio.getId()<0) {
					this.isEsNuevoEstadoServicio=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoServicio(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoServicio(evt,rowIndex);
				}	
				
				if(this.estadoservicioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoServicio: " + this.dDif); 
					}
				}								
				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoServicio(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadoservicio)) {
					if(this.estadoservicio.getId()>0) {
						this.estadoservicio.setIsDeleted(true);
						
						this.estadoserviciosEliminados.add(this.estadoservicio);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoservicioLogic.getEstadoServicios().remove(this.estadoservicio);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoservicios.remove(this.estadoservicio);				
					}
					
					
					((EstadoServicioModel) this.jTableDatosEstadoServicio.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoServicio(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoServicio(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoServicio) {
			
			if(this.jInternalFrameDetalleFormEstadoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoServicio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoServicio.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicio =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoservicio =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoServicio(this.estadoservicio);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoServicio("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoServicio(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoServicio() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoServicio(EstadoServicio estadoservicio) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoServicio(estadoservicio,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoServicio(EstadoServicio estadoservicio,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoServicio(estadoservicio);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoServicio(estadoservicio,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoServicio(estadoservicio);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoServicio(EstadoServicio estadoservicio) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoServicio.jTextFieldidEstadoServicio.setText(estadoservicio.getId().toString());
			this.jInternalFrameDetalleFormEstadoServicio.jTextFieldcodigoEstadoServicio.setText(estadoservicio.getcodigo());
			this.jInternalFrameDetalleFormEstadoServicio.jTextFieldnombreEstadoServicio.setText(estadoservicio.getnombre());
			this.jInternalFrameDetalleFormEstadoServicio.jCheckBoxes_defectoEstadoServicio.setSelected(estadoservicio.getes_defecto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoServicio estadoservicioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadoservicioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoServicio estadoservicioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadoservicioLocal=this.estadoservicio;
			} else {
				estadoservicioLocal=this.estadoservicioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadoservicioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoServicio(estadoservicioLocal,true);
					
					if(estadoservicioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadoservicioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadoservicioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoServicio(EstadoServicio estadoservicio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoServicio(estadoservicio,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoServicio(estadoservicio);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoServicio(EstadoServicio estadoservicio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoServicio(estadoservicio,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoServicio(EstadoServicio estadoservicio,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoServicio.jTextFieldidEstadoServicio.getText()==null || this.jInternalFrameDetalleFormEstadoServicio.jTextFieldidEstadoServicio.getText()=="" || this.jInternalFrameDetalleFormEstadoServicio.jTextFieldidEstadoServicio.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoServicio.jTextFieldidEstadoServicio.setText("0");
			}

			if(conColumnasBase) {estadoservicio.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoServicio.jTextFieldidEstadoServicio.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoServicioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoServicio.jLabelIdEstadoServicio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoservicio.setcodigo(this.jInternalFrameDetalleFormEstadoServicio.jTextFieldcodigoEstadoServicio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoServicioConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoServicio.jLabelcodigoEstadoServicio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoservicio.setnombre(this.jInternalFrameDetalleFormEstadoServicio.jTextFieldnombreEstadoServicio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoServicioConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoServicio.jLabelnombreEstadoServicio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoservicio.setes_defecto(this.jInternalFrameDetalleFormEstadoServicio.jCheckBoxes_defectoEstadoServicio.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoServicioConstantesFunciones.LABEL_ESDEFECTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoServicio.jLabeles_defectoEstadoServicio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoServicio(EstadoServicio estadoservicioBean,EstadoServicio estadoservicio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoServicio(EstadoServicio estadoservicioOrigen,EstadoServicio estadoservicio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoservicioOrigen.getId()!=null && !estadoservicioOrigen.getId().equals(0L))) {estadoservicio.setId(estadoservicioOrigen.getId());}}
			if(conDefault || (!conDefault && estadoservicioOrigen.getcodigo()!=null && !estadoservicioOrigen.getcodigo().equals(""))) {estadoservicio.setcodigo(estadoservicioOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadoservicioOrigen.getnombre()!=null && !estadoservicioOrigen.getnombre().equals(""))) {estadoservicio.setnombre(estadoservicioOrigen.getnombre());}
			if(conDefault || (!conDefault && estadoservicioOrigen.getes_defecto()!=null && !estadoservicioOrigen.getes_defecto().equals(false))) {estadoservicio.setes_defecto(estadoservicioOrigen.getes_defecto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoServicio(EstadoServicio estadoservicio) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoServicio.jTextFieldidEstadoServicio.setText(estadoservicio.getId().toString());
			this.jInternalFrameDetalleFormEstadoServicio.jTextFieldcodigoEstadoServicio.setText(estadoservicio.getcodigo());
			this.jInternalFrameDetalleFormEstadoServicio.jTextFieldnombreEstadoServicio.setText(estadoservicio.getnombre());
			this.jInternalFrameDetalleFormEstadoServicio.jCheckBoxes_defectoEstadoServicio.setSelected(estadoservicio.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoServicio(EstadoServicioBean estadoservicioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoServicio.jTextFieldidEstadoServicio.setText(estadoservicioBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoServicio.jTextFieldcodigoEstadoServicio.setText(estadoservicioBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoServicio.jTextFieldnombreEstadoServicio.setText(estadoservicioBean.getnombre());
			this.jInternalFrameDetalleFormEstadoServicio.jCheckBoxes_defectoEstadoServicio.setSelected(estadoservicioBean.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoServicio(EstadoServicioParameterReturnGeneral estadoservicioReturnGeneral,EstadoServicioBean estadoservicioBean,Boolean conDefault) throws Exception { 
		try {
			EstadoServicio estadoservicioLocal=new EstadoServicio();
			
			estadoservicioLocal=estadoservicioReturnGeneral.getEstadoServicio();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoservicioLocal.getId()!=null && !estadoservicioLocal.getId().equals(0L))) {estadoservicioBean.setId(estadoservicioLocal.getId());}}
			if(conDefault || (!conDefault && estadoservicioLocal.getcodigo()!=null && !estadoservicioLocal.getcodigo().equals(""))) {estadoservicioBean.setcodigo(estadoservicioLocal.getcodigo());}
			if(conDefault || (!conDefault && estadoservicioLocal.getnombre()!=null && !estadoservicioLocal.getnombre().equals(""))) {estadoservicioBean.setnombre(estadoservicioLocal.getnombre());}
			if(conDefault || (!conDefault && estadoservicioLocal.getes_defecto()!=null && !estadoservicioLocal.getes_defecto().equals(false))) {estadoservicioBean.setes_defecto(estadoservicioLocal.getes_defecto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoServicioGenerico(Long idEstadoServicioSeleccionado,JComboBox jComboBoxEstadoServicio,List<EstadoServicio> estadoserviciosLocal)throws Exception {
		try {
			EstadoServicio  estadoservicioTemp=null;

			for(EstadoServicio estadoservicioAux:estadoserviciosLocal) {
				if(estadoservicioAux.getId()!=null && estadoservicioAux.getId().equals(idEstadoServicioSeleccionado)) {
					estadoservicioTemp=estadoservicioAux;
					break;
				}
			}

			jComboBoxEstadoServicio.setSelectedItem(estadoservicioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoServicioGenerico(JComboBox jComboBoxEstadoServicio,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoServicio.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoServicio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoServicio.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoServicio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoservicio=(EstadoServicio) estadoservicioLogic.getEstadoServicios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoservicio =(EstadoServicio) estadoservicios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoServicio estadoservicioRow=new EstadoServicio();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoservicioRow=(EstadoServicio) estadoservicioLogic.getEstadoServicios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoservicioRow=(EstadoServicio) estadoservicios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoServicio(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoServicio.setVisible((this.isVisibilidadCeldaNuevoEstadoServicio && this.isPermisoNuevoEstadoServicio));			
			this.jButtonDuplicarEstadoServicio.setVisible((this.isVisibilidadCeldaDuplicarEstadoServicio && this.isPermisoDuplicarEstadoServicio));			
			this.jButtonCopiarEstadoServicio.setVisible((this.isVisibilidadCeldaCopiarEstadoServicio && this.isPermisoCopiarEstadoServicio));
			this.jButtonVerFormEstadoServicio.setVisible((this.isVisibilidadCeldaVerFormEstadoServicio && this.isPermisoVerFormEstadoServicio));
			
			this.jButtonAbrirOrderByEstadoServicio.setVisible((this.isVisibilidadCeldaOrdenEstadoServicio && this.isPermisoOrdenEstadoServicio));			
			
			this.jButtonNuevoRelacionesEstadoServicio.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoServicio && this.isPermisoNuevoEstadoServicio));			
			this.jButtonNuevoGuardarCambiosEstadoServicio.setVisible((this.isVisibilidadCeldaNuevoEstadoServicio && this.isPermisoNuevoEstadoServicio && this.isPermisoGuardarCambiosEstadoServicio));
			
			if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
			this.jInternalFrameDetalleFormEstadoServicio.jButtonModificarEstadoServicio.setVisible((this.isVisibilidadCeldaModificarEstadoServicio && this.isPermisoActualizarEstadoServicio));	
			this.jInternalFrameDetalleFormEstadoServicio.jButtonActualizarEstadoServicio.setVisible((this.isVisibilidadCeldaActualizarEstadoServicio && this.isPermisoActualizarEstadoServicio));	
			this.jInternalFrameDetalleFormEstadoServicio.jButtonEliminarEstadoServicio.setVisible((this.isVisibilidadCeldaEliminarEstadoServicio && this.isPermisoEliminarEstadoServicio));
			this.jInternalFrameDetalleFormEstadoServicio.jButtonCancelarEstadoServicio.setVisible(this.isVisibilidadCeldaCancelarEstadoServicio);							
			this.jInternalFrameDetalleFormEstadoServicio.jButtonGuardarCambiosEstadoServicio.setVisible((this.isVisibilidadCeldaGuardarEstadoServicio && this.isPermisoGuardarCambiosEstadoServicio));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoServicio.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoServicio && this.isPermisoGuardarCambiosEstadoServicio));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoServicio.setVisible((this.isVisibilidadCeldaNuevoEstadoServicio && this.isPermisoNuevoEstadoServicio));						
			this.jButtonDuplicarToolBarEstadoServicio.setVisible((this.isVisibilidadCeldaDuplicarEstadoServicio && this.isPermisoDuplicarEstadoServicio));						
			this.jButtonCopiarToolBarEstadoServicio.setVisible((this.isVisibilidadCeldaCopiarEstadoServicio && this.isPermisoCopiarEstadoServicio));			
			this.jButtonVerFormToolBarEstadoServicio.setVisible((this.isVisibilidadCeldaVerFormEstadoServicio && this.isPermisoVerFormEstadoServicio));			
			this.jButtonAbrirOrderByToolBarEstadoServicio.setVisible((this.isVisibilidadCeldaOrdenEstadoServicio && this.isPermisoOrdenEstadoServicio));
			this.jButtonNuevoRelacionesToolBarEstadoServicio.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoServicio && this.isPermisoNuevoEstadoServicio));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoServicio.setVisible((this.isVisibilidadCeldaNuevoEstadoServicio && this.isPermisoNuevoEstadoServicio && this.isPermisoGuardarCambiosEstadoServicio));			
			
			if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
			this.jInternalFrameDetalleFormEstadoServicio.jButtonModificarToolBarEstadoServicio.setVisible((this.isVisibilidadCeldaModificarEstadoServicio && this.isPermisoActualizarEstadoServicio));	
			this.jInternalFrameDetalleFormEstadoServicio.jButtonActualizarToolBarEstadoServicio.setVisible((this.isVisibilidadCeldaActualizarEstadoServicio  && this.isPermisoActualizarEstadoServicio));	
			this.jInternalFrameDetalleFormEstadoServicio.jButtonEliminarToolBarEstadoServicio.setVisible((this.isVisibilidadCeldaEliminarEstadoServicio && this.isPermisoEliminarEstadoServicio));
			this.jInternalFrameDetalleFormEstadoServicio.jButtonCancelarToolBarEstadoServicio.setVisible(this.isVisibilidadCeldaCancelarEstadoServicio);				
			this.jInternalFrameDetalleFormEstadoServicio.jButtonGuardarCambiosToolBarEstadoServicio.setVisible((this.isVisibilidadCeldaGuardarEstadoServicio && this.isPermisoGuardarCambiosEstadoServicio));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoServicio.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoServicio && this.isPermisoGuardarCambiosEstadoServicio));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoServicio.setVisible((this.isVisibilidadCeldaNuevoEstadoServicio && this.isPermisoNuevoEstadoServicio));			
			this.jMenuItemDuplicarEstadoServicio.setVisible((this.isVisibilidadCeldaDuplicarEstadoServicio && this.isPermisoDuplicarEstadoServicio));			
			this.jMenuItemCopiarEstadoServicio.setVisible((this.isVisibilidadCeldaCopiarEstadoServicio && this.isPermisoCopiarEstadoServicio));			
			this.jMenuItemVerFormEstadoServicio.setVisible((this.isVisibilidadCeldaVerFormEstadoServicio && this.isPermisoVerFormEstadoServicio));			
			this.jMenuItemAbrirOrderByEstadoServicio.setVisible((this.isVisibilidadCeldaOrdenEstadoServicio && this.isPermisoOrdenEstadoServicio));			
			//this.jMenuItemMostrarOcultarEstadoServicio.setVisible((this.isVisibilidadCeldaOrdenEstadoServicio && this.isPermisoOrdenEstadoServicio));
			this.jMenuItemDetalleAbrirOrderByEstadoServicio.setVisible((this.isVisibilidadCeldaOrdenEstadoServicio && this.isPermisoOrdenEstadoServicio));			
			//this.jMenuItemDetalleMostrarOcultarEstadoServicio.setVisible((this.isVisibilidadCeldaOrdenEstadoServicio && this.isPermisoOrdenEstadoServicio));			
			this.jMenuItemNuevoRelacionesEstadoServicio.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoServicio && this.isPermisoNuevoEstadoServicio));			
			this.jMenuItemNuevoGuardarCambiosEstadoServicio.setVisible((this.isVisibilidadCeldaNuevoEstadoServicio && this.isPermisoNuevoEstadoServicio && this.isPermisoGuardarCambiosEstadoServicio));									
			
			if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
			this.jInternalFrameDetalleFormEstadoServicio.jMenuItemModificarEstadoServicio.setVisible((this.isVisibilidadCeldaModificarEstadoServicio && this.isPermisoActualizarEstadoServicio));	
			this.jInternalFrameDetalleFormEstadoServicio.jMenuItemActualizarEstadoServicio.setVisible((this.isVisibilidadCeldaActualizarEstadoServicio && this.isPermisoActualizarEstadoServicio));	
			this.jInternalFrameDetalleFormEstadoServicio.jMenuItemEliminarEstadoServicio.setVisible((this.isVisibilidadCeldaEliminarEstadoServicio && this.isPermisoEliminarEstadoServicio));
			this.jInternalFrameDetalleFormEstadoServicio.jMenuItemCancelarEstadoServicio.setVisible(this.isVisibilidadCeldaCancelarEstadoServicio);				
			}
			
			this.jMenuItemGuardarCambiosEstadoServicio.setVisible((this.isVisibilidadCeldaGuardarEstadoServicio && this.isPermisoGuardarCambiosEstadoServicio));						
			this.jMenuItemGuardarCambiosTablaEstadoServicio.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoServicio && this.isPermisoGuardarCambiosEstadoServicio));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoServicio=this.jButtonNuevoEstadoServicio.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoServicio=this.jButtonDuplicarEstadoServicio.isVisible();
			this.isVisibilidadCeldaCopiarEstadoServicio=this.jButtonCopiarEstadoServicio.isVisible();
			this.isVisibilidadCeldaVerFormEstadoServicio=this.jButtonVerFormEstadoServicio.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoServicio=this.jButtonAbrirOrderByEstadoServicio.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoServicio=this.jButtonNuevoRelacionesEstadoServicio.isVisible();
			this.isVisibilidadCeldaModificarEstadoServicio=this.jButtonModificarEstadoServicio.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
			this.isVisibilidadCeldaActualizarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jButtonActualizarEstadoServicio.isVisible();
			this.isVisibilidadCeldaEliminarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jButtonEliminarEstadoServicio.isVisible();
			this.isVisibilidadCeldaCancelarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jButtonCancelarEstadoServicio.isVisible();
			this.isVisibilidadCeldaGuardarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jButtonGuardarCambiosEstadoServicio.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoServicio=this.jButtonGuardarCambiosTablaEstadoServicio.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoServicio=this.jButtonNuevoToolBarEstadoServicio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoServicio=this.jButtonNuevoRelacionesToolBarEstadoServicio.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
			this.isVisibilidadCeldaModificarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jButtonModificarToolBarEstadoServicio.isVisible();
			this.isVisibilidadCeldaActualizarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jButtonActualizarToolBarEstadoServicio.isVisible();
			this.isVisibilidadCeldaEliminarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jButtonEliminarToolBarEstadoServicio.isVisible();
			this.isVisibilidadCeldaCancelarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jButtonCancelarToolBarEstadoServicio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoServicio=this.jButtonGuardarCambiosToolBarEstadoServicio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoServicio=this.jButtonGuardarCambiosTablaToolBarEstadoServicio.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoServicio=this.jMenuItemNuevoEstadoServicio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoServicio=this.jMenuItemNuevoRelacionesEstadoServicio.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
			this.isVisibilidadCeldaModificarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jMenuItemModificarEstadoServicio.isVisible();
			this.isVisibilidadCeldaActualizarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jMenuItemActualizarEstadoServicio.isVisible();
			this.isVisibilidadCeldaEliminarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jMenuItemEliminarEstadoServicio.isVisible();
			this.isVisibilidadCeldaCancelarEstadoServicio=this.jInternalFrameDetalleFormEstadoServicio.jMenuItemCancelarEstadoServicio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoServicio=this.jMenuItemGuardarCambiosEstadoServicio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoServicio=this.jMenuItemGuardarCambiosTablaEstadoServicio.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoServicio(Boolean esInicializar) {
		if(EstadoServicioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadoservicioSessionBean.getConGuardarRelaciones()) {
				//if(this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoServicio();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoServicio(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoServicio() {
		this.jButtonNuevoEstadoServicio.setVisible(this.isPermisoNuevoEstadoServicio);			
		this.jButtonDuplicarEstadoServicio.setVisible(this.isPermisoDuplicarEstadoServicio);			
		this.jButtonCopiarEstadoServicio.setVisible(this.isPermisoCopiarEstadoServicio);			
		this.jButtonVerFormEstadoServicio.setVisible(this.isPermisoVerFormEstadoServicio);			
		
		this.jButtonAbrirOrderByEstadoServicio.setVisible(this.isPermisoOrdenEstadoServicio);					
		
		this.jButtonNuevoRelacionesEstadoServicio.setVisible(this.isPermisoNuevoEstadoServicio);			
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoServicio.jButtonModificarEstadoServicio.setVisible(this.isPermisoActualizarEstadoServicio);	
			this.jInternalFrameDetalleFormEstadoServicio.jButtonActualizarEstadoServicio.setVisible(this.isPermisoActualizarEstadoServicio);	
			this.jInternalFrameDetalleFormEstadoServicio.jButtonEliminarEstadoServicio.setVisible(this.isPermisoEliminarEstadoServicio);
			this.jInternalFrameDetalleFormEstadoServicio.jButtonCancelarEstadoServicio.setVisible(this.isVisibilidadCeldaCancelarEstadoServicio);						
			this.jInternalFrameDetalleFormEstadoServicio.jButtonGuardarCambiosEstadoServicio.setVisible(this.isPermisoGuardarCambiosEstadoServicio);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoServicio.setVisible(this.isPermisoActualizarEstadoServicio);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoServicio() {
		this.jInternalFrameDetalleFormEstadoServicio.jButtonModificarEstadoServicio.setVisible(this.isPermisoActualizarEstadoServicio);	
		this.jInternalFrameDetalleFormEstadoServicio.jButtonActualizarEstadoServicio.setVisible(this.isPermisoActualizarEstadoServicio);	
		this.jInternalFrameDetalleFormEstadoServicio.jButtonEliminarEstadoServicio.setVisible(this.isPermisoEliminarEstadoServicio);
		this.jInternalFrameDetalleFormEstadoServicio.jButtonCancelarEstadoServicio.setVisible(this.isVisibilidadCeldaCancelarEstadoServicio);							
		this.jInternalFrameDetalleFormEstadoServicio.jButtonGuardarCambiosEstadoServicio.setVisible((this.isVisibilidadCeldaGuardarEstadoServicio && this.isPermisoGuardarCambiosEstadoServicio));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoServicio() {
		if(EstadoServicioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoServicio();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoServicio() {
	}
	
	public void jTableDatosEstadoServicioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoServicio(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoServicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoServicio(this.getestadoservicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoServicio(this.estadoservicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoservicio =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoservicio =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoservicio==null) {
						this.estadoservicio = new EstadoServicio();
					}

					this.setVariablesFormularioToObjetoActualEstadoServicio(this.estadoservicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoServicio(this.estadoservicio);
				}

				if(this.estadoservicio.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadoservicio.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoServicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoServicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoServicio(this.getestadoservicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoServicio(this.estadoservicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoservicio =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoservicio =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoservicio==null) {
						this.estadoservicio = new EstadoServicio();
					}

					this.setVariablesFormularioToObjetoActualEstadoServicio(this.estadoservicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoServicio(this.estadoservicio);
				}

				if(this.estadoservicio.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadoservicio.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoServicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoServicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoServicio(this.getestadoservicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoServicio(this.estadoservicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoservicio =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoservicio =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoservicio==null) {
						this.estadoservicio = new EstadoServicio();
					}

					this.setVariablesFormularioToObjetoActualEstadoServicio(this.estadoservicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoServicio(this.estadoservicio);
				}

				if(this.estadoservicio.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadoservicio.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoServicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_defectoEstadoServicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoServicio(this.getestadoservicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoServicio(this.estadoservicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoservicio =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoservicio =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoservicio==null) {
						this.estadoservicio = new EstadoServicio();
					}

					this.setVariablesFormularioToObjetoActualEstadoServicio(this.estadoservicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoServicio(this.estadoservicio);
				}

				if(this.estadoservicio.getes_defecto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_defecto = "+this.estadoservicio.getes_defecto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoServicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoServicio() {
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
			this.jInternalFrameDetalleFormEstadoServicio.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoServicio.dispose();
			this.jInternalFrameDetalleFormEstadoServicio=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoServicio!=null) {
			this.jInternalFrameReporteDinamicoEstadoServicio.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoServicio.dispose();
			this.jInternalFrameReporteDinamicoEstadoServicio=null;
		}
		
		if(this.jInternalFrameImportacionEstadoServicio!=null) {
			this.jInternalFrameImportacionEstadoServicio.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoServicio.dispose();
			this.jInternalFrameImportacionEstadoServicio=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoServicio();
			
			EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoServicio")) {
				jButtonNuevoEstadoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoServicio")) {
				jButtonDuplicarEstadoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoServicio")) {
				jButtonCopiarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoServicio")) {
				jButtonVerFormEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoServicio")) {
				jButtonNuevoEstadoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoServicio")) {
				jButtonDuplicarEstadoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoServicio")) {
				jButtonNuevoEstadoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoServicio")) {
				jButtonDuplicarEstadoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoServicio")) {
				jButtonNuevoEstadoServicioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoServicio")) {
				jButtonNuevoEstadoServicioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoServicio")) {
				jButtonNuevoEstadoServicioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoServicio")) {
				jButtonModificarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoServicio")) {
				jButtonModificarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoServicio")) {
				jButtonModificarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoServicio")) {
				jButtonActualizarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoServicio")) {
				jButtonActualizarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoServicio")) {
				jButtonActualizarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoServicio")) {
				jButtonEliminarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoServicio")) {
				jButtonEliminarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoServicio")) {
				jButtonEliminarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoServicio")) {
				jButtonCancelarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoServicio")) {
				jButtonCancelarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoServicio")) {
				jButtonCancelarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoServicio")) {
				jButtonCerrarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoServicio")) {
				jButtonCerrarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoServicio")) {
				jButtonCerrarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoServicio")) {
				jButtonMostrarOcultarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoServicio")) {
				jButtonCancelarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoServicio")) {
				jButtonGuardarCambiosEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoServicio")) {
				jButtonGuardarCambiosEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoServicio")) {
				jButtonCopiarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoServicio")) {
				jButtonVerFormEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoServicio")) {
				jButtonGuardarCambiosEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoServicio")) {
				jButtonCopiarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoServicio")) {
				jButtonVerFormEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoServicio")) {
				jButtonGuardarCambiosEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoServicio")) {
				jButtonGuardarCambiosEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoServicio")) {
				jButtonGuardarCambiosEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoServicio")) {
				jButtonRecargarInformacionEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoServicio")) {
				jButtonRecargarInformacionEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoServicio")) {
				jButtonRecargarInformacionEstadoServicioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoServicio")) {
				jButtonAnterioresEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoServicio")) {
				jButtonAnterioresEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoServicio")) {
				jButtonAnterioresEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoServicio")) {
				jButtonSiguientesEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoServicio")) {
				jButtonSiguientesEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoServicio")) {
				jButtonSiguientesEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoServicio") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoServicio")) {
				jButtonAbrirOrderByEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoServicio") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoServicio")) {
				jButtonMostrarOcultarEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoServicio")) {
				jButtonNuevoGuardarCambiosEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoServicio")) {
				jButtonNuevoGuardarCambiosEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoServicio")) {
				jButtonNuevoGuardarCambiosEstadoServicioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoServicio")) {
				jButtonCerrarReporteDinamicoEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoServicio")) {
				jButtonGenerarReporteDinamicoEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoServicio")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoServicio")) {
				jButtonCerrarImportacionEstadoServicioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoServicio")) {
				
				jButtonGenerarImportacionEstadoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoServicio")) {
				
				jButtonAbrirImportacionEstadoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoServicio")) {
				jComboBoxTiposAccionesEstadoServicioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoServicio")) {
				jComboBoxTiposRelacionesEstadoServicioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoServicio")) {
				jComboBoxTiposAccionesEstadoServicioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoServicio")) {
				
				jComboBoxTiposSeleccionarEstadoServicioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoServicio")) {
				jTextFieldValorCampoGeneralEstadoServicioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoServicio")) {
				jButtonAbrirOrderByEstadoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoServicio")) {
				jButtonAbrirOrderByEstadoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoServicio")) {
				jButtonCerrarOrderByEstadoServicioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoServicioBusqueda")) {
				this.jButtonidEstadoServicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoServicioBusqueda")) {
				this.jButtoncodigoEstadoServicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoServicioBusqueda")) {
				this.jButtonnombreEstadoServicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoEstadoServicioBusqueda")) {
				this.jButtones_defectoEstadoServicioBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoServicio();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoServicioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoservicio);
				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
				
				


				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoServicio estadoservicioLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadoservicioLocal=this.estadoservicio;
			} else {
				estadoservicioLocal=this.estadoservicioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoservicio);
				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
							
				
				


				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoServicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioAnterior =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoservicioAnterior =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
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
			
			EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
			
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
			
			


			
			EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoServicioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoservicio);
				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
								
						
				


				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoServicio.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoservicio);
				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
								
				
				


				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoServicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioAnterior =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoservicioAnterior =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoservicio);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoServicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioAnterior =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoservicioAnterior =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoServicioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoservicio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoservicio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoservicio);
				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
							
				
				


				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoServicio.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoServicioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoservicioAnterior =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoservicioAnterior =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
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
			
			EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
			
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
			
			


			
			EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoServicioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoservicio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoservicio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoservicio);
				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
								
				
				


				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoServicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioAnterior =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoservicioAnterior =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoServicioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoservicio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoservicio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoServicioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoservicio);
				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoServicio")) {
					jCheckBoxSeleccionarTodosEstadoServicioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoServicio")) {
					jCheckBoxSeleccionadosEstadoServicioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoServicio")) {
					
				}
				
				


				
				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoservicio);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadoservicio);
				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
												
				
				


				
				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoServicioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoservicioAnterior =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoservicioAnterior =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoServicioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoservicio);
				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
				
				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
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
			
			EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
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
			
			


			
			EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoServicioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoservicio);
				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoServicio.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoServicio.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoservicio);
				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
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
				
				


				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoServicio.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoServicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoservicioAnterior =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoservicioAnterior =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoServicio")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoServicioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoServicio.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadoservicio =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadoservicio =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadoservicio);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoServicio")) {
				
				}
				
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoServicio")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoServicio.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoServicio")) {
			
			}
			
			EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoServicio();
			
			EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoServicio")) {
				jButtonNuevoEstadoServicioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoServicio")) {
				jButtonDuplicarEstadoServicioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoServicio")) {
				jButtonCopiarEstadoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoServicio")) {
				jButtonVerFormEstadoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoServicio")) {
				jButtonNuevoEstadoServicioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoServicio")) {
				jButtonModificarEstadoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoServicio")) {
				jButtonActualizarEstadoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoServicio")) {
				jButtonEliminarEstadoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoServicio")) {
				jButtonGuardarCambiosEstadoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoServicio")) {
				jButtonCancelarEstadoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoServicio")) {
				jButtonCerrarEstadoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoServicio")) {
				jButtonGuardarCambiosEstadoServicioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoServicio")) {
				jButtonNuevoGuardarCambiosEstadoServicioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoServicio")) {
				jButtonAbrirOrderByEstadoServicioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoServicio")) {
				jButtonRecargarInformacionEstadoServicioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoServicio")) {
				jButtonAnterioresEstadoServicioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoServicio")) {
				jButtonSiguientesEstadoServicioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoServicioBusqueda")) {
				this.jButtonidEstadoServicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoServicioBusqueda")) {
				this.jButtoncodigoEstadoServicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoServicioBusqueda")) {
				this.jButtonnombreEstadoServicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoEstadoServicioBusqueda")) {
				this.jButtones_defectoEstadoServicioBusquedaActionPerformed(evt);
			}
			
			EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoServicio();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoServicio")) {
				closingInternalFrameEstadoServicio();
				
			} else if(sTipo.equals("jButtonCancelarEstadoServicio")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoServicio = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoServicioBeanSwingJInternalFrame jInternalFrameParent=(EstadoServicioBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoServicio.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoServicioActionPerformed(null);
			}
			
			EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoservicio,new Object(),this.estadoservicioParameterGeneral,this.estadoservicioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoServicio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoServicio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoServicio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadoservicio)) {
			if(!esControlTabla) {
				if(EstadoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoServicio(this.estadoservicio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoServicio(this.estadoservicio);			
				}
				
				if(this.estadoservicioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoServicio(this.estadoservicio,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoservicioReturnGeneral=estadoservicioLogic.procesarEventosEstadoServiciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoservicioLogic.getEstadoServicios(),this.estadoservicio,this.estadoservicioParameterGeneral,this.isEsNuevoEstadoServicio,classes);//this.estadoservicioLogic.getEstadoServicio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoServicio(this.estadoservicioReturnGeneral,this.estadoservicioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadoservicioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoServicio(classes,this.estadoservicioReturnGeneral,this.estadoservicioBean,false);
					}
						
					if(this.estadoservicioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoServicio(this.estadoservicioReturnGeneral.getEstadoServicio());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoServicio(this.estadoservicioReturnGeneral.getEstadoServicio());	
					}
						
					if(this.estadoservicioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoServicio(this.estadoservicioReturnGeneral.getEstadoServicio(),classes);//this.estadoservicioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoServicio(this.estadoservicio,classes);//this.estadoservicioBean);									
				}
			
				if(EstadoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoServicio(this.estadoservicio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoServicio(this.estadoservicio);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadoservicioAnterior!=null) {
						this.estadoservicio=this.estadoservicioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoservicioReturnGeneral=estadoservicioLogic.procesarEventosEstadoServiciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoservicioLogic.getEstadoServicios(),this.estadoservicio,this.estadoservicioParameterGeneral,this.isEsNuevoEstadoServicio,classes);//this.estadoservicioLogic.getEstadoServicio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoservicioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoservicioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadoservicioReturnGeneral.getEstadoServicio(),estadoservicioLogic.getEstadoServicios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadoservicioReturnGeneral.getEstadoServicio(),this.estadoservicios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoServicio.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoServicio.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoServicio();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoServicio() throws Exception {
		
		EstadoServicioModel estadoservicioModel=(EstadoServicioModel)this.jTableDatosEstadoServicio.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoservicioModel.estadoservicios=this.estadoservicioLogic.getEstadoServicios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadoservicioModel.estadoservicios=this.estadoservicios;
		}
		
		
		((EstadoServicioModel) this.jTableDatosEstadoServicio.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoServicio() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadoservicioAnterior(),this.estadoservicioLogic.getEstadoServicios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadoservicioAnterior(),this.estadoservicios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoServicio();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoServicio(EstadoServicio estadoservicio,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
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
										
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoservicio,new Object(),generalEntityParameterGeneral,this.estadoservicioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadoservicioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoServicioConstantesFunciones.getClassesRelationshipsOfEstadoServicio(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoServicioConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoServicio(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoServicio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoservicio,new Object(),generalEntityParameterGeneral,this.estadoservicioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoServicio(EstadoServicioBean estadoservicioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoServicio(ArrayList<Classe> classes,EstadoServicioReturnGeneral estadoservicioReturnGeneral,EstadoServicioBean estadoservicioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoServicio(EstadoServicio estadoservicio,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadoservicio)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoServicio = new EstadoServicioDetalleFormJInternalFrame(jDesktopPane,this.estadoservicioSessionBean.getConGuardarRelaciones(),this.estadoservicioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoServicio);
		this.jInternalFrameDetalleFormEstadoServicio.setVisible(false);
		this.jInternalFrameDetalleFormEstadoServicio.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoServicio.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoServicio.estadoservicioLogic=this.estadoservicioLogic;
		
		this.cargarCombosFrameForeignKeyEstadoServicio("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoServicio();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoServicio();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoServicio("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoServicio();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoServicio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoServicio"));
		
		this.jInternalFrameDetalleFormEstadoServicio.jButtonModificarEstadoServicio.addActionListener(new ButtonActionListener(this,"ModificarEstadoServicio"));

		
		this.jInternalFrameDetalleFormEstadoServicio.jButtonModificarToolBarEstadoServicio.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoServicio"));
					
		this.jInternalFrameDetalleFormEstadoServicio.jMenuItemModificarEstadoServicio.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoServicio"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoServicio.jButtonActualizarEstadoServicio.addActionListener (new ButtonActionListener(this,"ActualizarEstadoServicio"));
		
		
		this.jInternalFrameDetalleFormEstadoServicio.jButtonActualizarToolBarEstadoServicio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoServicio"));
						
		this.jInternalFrameDetalleFormEstadoServicio.jMenuItemActualizarEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoServicio"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoServicio.jButtonEliminarEstadoServicio.addActionListener (new ButtonActionListener(this,"EliminarEstadoServicio"));
		
		
		this.jInternalFrameDetalleFormEstadoServicio.jButtonEliminarToolBarEstadoServicio.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoServicio"));
								
		this.jInternalFrameDetalleFormEstadoServicio.jMenuItemEliminarEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoServicio"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoServicio.jButtonCancelarEstadoServicio.addActionListener (new ButtonActionListener(this,"CancelarEstadoServicio"));
		
		
		this.jInternalFrameDetalleFormEstadoServicio.jButtonCancelarToolBarEstadoServicio.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoServicio"));
					
		this.jInternalFrameDetalleFormEstadoServicio.jMenuItemCancelarEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoServicio"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoServicio.jMenuItemDetalleCerrarEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoServicio"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoServicio.jButtonGuardarCambiosToolBarEstadoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoServicio"));
		
		
		
		this.jInternalFrameDetalleFormEstadoServicio.jButtonGuardarCambiosToolBarEstadoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoServicio"));
		
		
		
		this.jInternalFrameDetalleFormEstadoServicio.jComboBoxTiposAccionesFormularioEstadoServicio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoServicio"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoServicio.jButtonidEstadoServicioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoServicio.jButtoncodigoEstadoServicioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoServicio.jButtonnombreEstadoServicioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoServicio.jButtones_defectoEstadoServicioBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoEstadoServicioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoServicio.jTabbedPaneRelacionesEstadoServicio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoServicio"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoServicio"));
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoServicio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoServicio"));
		}
		
		this.jTableDatosEstadoServicio.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoServicio"));
		
		this.jTableDatosEstadoServicio.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoServicio"));
		
		this.jButtonNuevoEstadoServicio.addActionListener(new ButtonActionListener(this,"NuevoEstadoServicio"));
		
		this.jButtonDuplicarEstadoServicio.addActionListener(new ButtonActionListener(this,"DuplicarEstadoServicio"));
		
		this.jButtonCopiarEstadoServicio.addActionListener(new ButtonActionListener(this,"CopiarEstadoServicio"));
		
		this.jButtonVerFormEstadoServicio.addActionListener(new ButtonActionListener(this,"VerFormEstadoServicio"));
		
		
		this.jButtonNuevoToolBarEstadoServicio.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoServicio"));
			
		this.jButtonDuplicarToolBarEstadoServicio.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoServicio"));
			
		this.jMenuItemNuevoEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoServicio"));
			
		this.jMenuItemDuplicarEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoServicio"));		
		
		
		this.jButtonNuevoRelacionesEstadoServicio.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoServicio"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoServicio.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoServicio"));
			
		this.jMenuItemNuevoRelacionesEstadoServicio.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoServicio"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoServicio.jButtonModificarEstadoServicio.addActionListener(new ButtonActionListener(this,"ModificarEstadoServicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoServicio.jButtonModificarToolBarEstadoServicio.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoServicio"));
			
			this.jInternalFrameDetalleFormEstadoServicio.jMenuItemModificarEstadoServicio.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoServicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoServicio.jButtonActualizarEstadoServicio.addActionListener (new ButtonActionListener(this,"ActualizarEstadoServicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoServicio.jButtonActualizarToolBarEstadoServicio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoServicio"));
				
			this.jInternalFrameDetalleFormEstadoServicio.jMenuItemActualizarEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoServicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoServicio.jButtonEliminarEstadoServicio.addActionListener (new ButtonActionListener(this,"EliminarEstadoServicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoServicio.jButtonEliminarToolBarEstadoServicio.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoServicio"));
						
			this.jInternalFrameDetalleFormEstadoServicio.jMenuItemEliminarEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoServicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoServicio.jButtonCancelarEstadoServicio.addActionListener (new ButtonActionListener(this,"CancelarEstadoServicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoServicio.jButtonCancelarToolBarEstadoServicio.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoServicio"));
			
			this.jInternalFrameDetalleFormEstadoServicio.jMenuItemCancelarEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoServicio"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoServicio.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoServicio"));		
		
		
		this.jButtonCerrarEstadoServicio.addActionListener (new ButtonActionListener(this,"CerrarEstadoServicio"));
		
		
		this.jButtonCerrarToolBarEstadoServicio.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoServicio"));
			
		this.jMenuItemCerrarEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoServicio"));
			
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoServicio.jMenuItemDetalleCerrarEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoServicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoServicio.jButtonGuardarCambiosEstadoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoServicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoServicio.jButtonGuardarCambiosToolBarEstadoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoServicio"));
		}
		
		this.jButtonCopiarToolBarEstadoServicio.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoServicio"));
			
		this.jButtonVerFormToolBarEstadoServicio.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoServicio"));
		
		this.jMenuItemGuardarCambiosEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoServicio"));
			
		this.jMenuItemCopiarEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoServicio"));		
		
		this.jMenuItemVerFormEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoServicio"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoServicio"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoServicio"));
			
		this.jMenuItemGuardarCambiosTablaEstadoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoServicio"));		
		
		
		
		this.jButtonRecargarInformacionEstadoServicio.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoServicio"));
					
		this.jButtonRecargarInformacionToolBarEstadoServicio.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoServicio"));
		
		this.jMenuItemRecargarInformacionEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoServicio"));		
		
		
		
		this.jButtonAnterioresEstadoServicio.addActionListener (new ButtonActionListener(this,"AnterioresEstadoServicio"));
		
		
		this.jButtonAnterioresToolBarEstadoServicio.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoServicio"));
		
		this.jMenuItemAnterioresEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoServicio"));		
		
		
		this.jButtonSiguientesEstadoServicio.addActionListener (new ButtonActionListener(this,"SiguientesEstadoServicio"));
		
		
		this.jButtonSiguientesToolBarEstadoServicio.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoServicio"));
			
		this.jMenuItemSiguientesEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoServicio"));
			
		this.jMenuItemAbrirOrderByEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoServicio"));
			
		this.jMenuItemMostrarOcultarEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoServicio"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoServicio"));
			
		this.jMenuItemDetalleMostarOcultarEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoServicio"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoServicio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoServicio"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoServicio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoServicio"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoServicio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoServicio"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoServicio.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoServicio"));

		this.jCheckBoxSeleccionadosEstadoServicio.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoServicio"));
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoServicio.jComboBoxTiposAccionesFormularioEstadoServicio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoServicio"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoServicio.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoServicio"));
			
		this.jComboBoxTiposAccionesEstadoServicio.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoServicio"));
					
		this.jComboBoxTiposSeleccionarEstadoServicio.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoServicio"));
			
		this.jTextFieldValorCampoGeneralEstadoServicio.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoServicio"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoServicio.jButtonidEstadoServicioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoServicio.jButtoncodigoEstadoServicioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoServicio.jButtonnombreEstadoServicioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoServicio.jButtones_defectoEstadoServicioBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoEstadoServicioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoServicio!=null) {
				this.jInternalFrameReporteDinamicoEstadoServicio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoServicio"));
				this.jInternalFrameReporteDinamicoEstadoServicio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoServicio"));
				this.jInternalFrameReporteDinamicoEstadoServicio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoServicio"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoServicio.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoServicio"));				
			//this.jButtonGenerarReporteDinamicoEstadoServicio.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoServicio"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoServicio.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoServicio"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoServicio!=null) {
				this.jInternalFrameImportacionEstadoServicio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoServicio"));
				this.jInternalFrameImportacionEstadoServicio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoServicio"));
				this.jInternalFrameImportacionEstadoServicio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoServicio"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoServicio.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoServicio"));
			
			this.jButtonAbrirOrderByToolBarEstadoServicio.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoServicio"));			
			
			if(this.jInternalFrameOrderByEstadoServicio!=null) {
				this.jInternalFrameOrderByEstadoServicio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoServicio"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoServicio.jTabbedPaneRelacionesEstadoServicio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoServicio"));
		
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
            		closingInternalFrameEstadoServicio();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoServicio.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoServicio = (JInternalFrameBase)event.getSource();
	            	
	            EstadoServicioBeanSwingJInternalFrame jInternalFrameParent=(EstadoServicioBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoServicio.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoServicioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoServicio.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoServicioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoServicio.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoServicio.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoServicioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoServicioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoServicioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoServicio";
		inputMap = this.jButtonNuevoEstadoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoServicioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoServicioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoServicioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoServicioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoServicio";
		inputMap = this.jButtonNuevoRelacionesEstadoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoServicioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoServicio";
		inputMap = this.jButtonModificarEstadoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoServicio";
		inputMap = this.jButtonActualizarEstadoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoServicio";
		inputMap = this.jButtonEliminarEstadoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoServicio";
		inputMap = this.jButtonCancelarEstadoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoServicio";
		inputMap = this.jButtonCerrarEstadoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoServicio.jButtonGuardarCambiosEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoServicio";
		inputMap = this.jInternalFrameDetalleFormEstadoServicio.jButtonGuardarCambiosEstadoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoServicio.jButtonGuardarCambiosEstadoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoServicio.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoServicioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoServicio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoServicioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoServicio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoServicioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoServicio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoServicioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoServicio.jButtonidEstadoServicioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoServicio.jButtoncodigoEstadoServicioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoServicio.jButtonnombreEstadoServicioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoServicio.jButtones_defectoEstadoServicioBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoEstadoServicioBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoServicioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoServicio.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoServicio(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoServicio estadoservicioAux:this.estadoservicioLogic.getEstadoServicios()) {
					estadoservicioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoServicio estadoservicioAux:estadoservicios) {
					estadoservicioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoServicioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoServicio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoServicio estadoservicioAux:this.estadoservicioLogic.getEstadoServicios()) {
						estadoservicioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoServicio estadoservicioAux:estadoservicios) {
						estadoservicioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoServicio estadoservicioAux:this.estadoservicioLogic.getEstadoServicios()) {
					
						if(sTipoSeleccionar.equals(EstadoServicioConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							estadoservicioAux.setes_defecto(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoServicio estadoservicioAux:estadoservicios) {
						
						if(sTipoSeleccionar.equals(EstadoServicioConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							estadoservicioAux.setes_defecto(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoServicio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoServicio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoServicio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoServicio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoServicioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoServicio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoServicio.getSelectedRows();
			
			EstadoServicio estadoservicioLocal=new EstadoServicio();
			
			//this.seleccionarTodosEstadoServicio(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoservicioLocal =(EstadoServicio) this.estadoservicioLogic.getEstadoServicios().toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadoservicioLocal =(EstadoServicio) this.estadoservicios.toArray()[this.jTableDatosEstadoServicio.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadoservicioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoServicio estadoservicioAux:this.estadoservicioLogic.getEstadoServicios()) {
						estadoservicioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoServicio estadoservicioAux:estadoservicios) {
						estadoservicioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoServicio(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoServicio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoServicio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoServicio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoServicioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoServicioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoServicioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoServicio(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoServicio.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoServicio estadoservicioAux:this.estadoservicioLogic.getEstadoServicios()) {
				
						if(sTipoSeleccionar.equals(EstadoServicioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoservicioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoServicioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoservicioAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoServicio estadoservicioAux:estadoservicios) {
					
						if(sTipoSeleccionar.equals(EstadoServicioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoservicioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoServicioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoservicioAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoServicio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoServicioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoServicio(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoServicio=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoServicio.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoServicio.jComboBoxTiposAccionesFormularioEstadoServicio.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoServicio) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoServicio(conSplash);
				
					this.generarReporteEstadoServiciosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoServicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoServicio.jComboBoxTiposAccionesFormularioEstadoServicio.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoServiciosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoServicio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoServiciosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoServicio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoServiciosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoServicio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoServicio();
				
				this.exportarEstadoServiciosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoServicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoServicio.jComboBoxTiposAccionesFormularioEstadoServicio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoServicios();
				//this.importarEstadoServicios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoServicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoServicio.jComboBoxTiposAccionesFormularioEstadoServicio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoServicio();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoServiciosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoServicio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Servicio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoServicio();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoServicio)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoServicio(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Servicio",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoServicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoServicio.jComboBoxTiposAccionesFormularioEstadoServicio.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoServicio();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoServicio(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoServicioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoServicio();
			
			if(this.jInternalFrameDetalleFormEstadoServicio==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoServicio> estadoserviciosSeleccionados=new ArrayList<EstadoServicio>();		
			EstadoServicio estadoservicio=new EstadoServicio();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoServicio(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoServicio.getSelectedItem();
			
			
			
			
			estadoserviciosSeleccionados=this.getEstadoServiciosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadoserviciosSeleccionados.size()==1) {
				for(EstadoServicio estadoservicioAux:estadoserviciosSeleccionados) {
					estadoservicio=estadoservicioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoServicio();
			
      		//this.finishProcessEstadoServicio(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoServicioReturnGeneral() throws Exception {
		if(this.estadoservicioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadoservicioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadoservicioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadoservicioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadoservicioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadoservicioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoServicio(false);
		}
		
		if(this.estadoservicioReturnGeneral.getConRetornoLista() || this.estadoservicioReturnGeneral.getConRetornoObjeto()) {
			if(this.estadoservicioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoservicioLogic.setEstadoServicios(this.estadoservicioReturnGeneral.getEstadoServicios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadoservicioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoservicioLogic.setEstadoServicio(this.estadoservicioReturnGeneral.getEstadoServicio());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoServicio(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoServicio() throws Exception {
		
		
	}
	
	public ArrayList<EstadoServicio> getEstadoServiciosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoServicio> estadoserviciosSeleccionados=new ArrayList<EstadoServicio>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoServicio) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoServicio estadoservicioAux:estadoservicioLogic.getEstadoServicios()) {
					if(estadoservicioAux.getIsSelected()) {
						estadoserviciosSeleccionados.add(estadoservicioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoServicio estadoservicioAux:this.estadoservicios) {
					if(estadoservicioAux.getIsSelected()) {
						estadoserviciosSeleccionados.add(estadoservicioAux);				
					}
				}
			}
			
			if(estadoserviciosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadoserviciosSeleccionados.addAll(this.estadoservicioLogic.getEstadoServicios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadoserviciosSeleccionados.addAll(this.estadoservicios);				
					}
				}
			}
		} else {
			estadoserviciosSeleccionados.add(this.estadoservicio);
		}
		
		return estadoserviciosSeleccionados;
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
	
	public void generarReporteEstadoServiciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoServiciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoServiciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoServiciosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoServiciosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Servicio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoServiciosSeleccionados() throws Exception {
		ArrayList<EstadoServicio> estadoserviciosSeleccionados=new ArrayList<EstadoServicio>();		
		
		estadoserviciosSeleccionados=this.getEstadoServiciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoServicios("Todos",estadoserviciosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoServiciosSeleccionados() throws Exception {
		ArrayList<EstadoServicio> estadoserviciosSeleccionados=new ArrayList<EstadoServicio>();		
		
		estadoserviciosSeleccionados=this.getEstadoServiciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoServicios("Todos",estadoserviciosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoServiciosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoServicio> estadoserviciosSeleccionados=new ArrayList<EstadoServicio>();
		
		estadoserviciosSeleccionados=this.getEstadoServiciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoServicios("Todos",estadoserviciosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoServiciosSeleccionados() throws Exception {
		ArrayList<EstadoServicio> estadoserviciosSeleccionados=new ArrayList<EstadoServicio>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoServicio();
		
		
		estadoserviciosSeleccionados=this.getEstadoServiciosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoServicio();
		
		
		//this.generarReporteEstadoServicios("Todos",estadoserviciosSeleccionados ,estadoservicioImplementable,estadoservicioImplementableHome);
	}
	
	public void mostrarImportacionEstadoServicios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoServicio();
		
		this.abrirFrameImportacionEstadoServicio();		
		
			
		//this.generarReporteEstadoServicios("Todos",estadoserviciosSeleccionados ,estadoservicioImplementable,estadoservicioImplementableHome);
	}
	
	public void importarEstadoServicios() throws Exception {		
	
	}
	
	public void exportarEstadoServiciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoServiciosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoServiciosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoServiciosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Servicio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoServiciosSeleccionados() throws Exception {
		ArrayList<EstadoServicio> estadoserviciosSeleccionados=new ArrayList<EstadoServicio>();		
		
		estadoserviciosSeleccionados=this.getEstadoServiciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoservicio."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoServicio(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoServicio estadoservicioAux:estadoserviciosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoServicio(estadoservicioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadoservicioAux.setsDetalleGeneralEntityReporte(estadoservicioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Servicio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoServicio(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoServicioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoServicioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoServicioConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoServicioConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoServicioConstantesFunciones.LABEL_ESDEFECTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoServicio(EstadoServicio estadoservicio,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadoservicio.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoservicio.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoservicio.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoservicio.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoservicio.getes_defecto().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoServiciosSeleccionados() throws Exception {
		ArrayList<EstadoServicio> estadoserviciosSeleccionados=new ArrayList<EstadoServicio>();		
		
		estadoserviciosSeleccionados=this.getEstadoServiciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoservicio.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoServicios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoServicio(row);				
				iRow++;
			}				
			
			for(EstadoServicio estadoservicioAux:estadoserviciosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoServicio(estadoservicioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Servicio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoServiciosSeleccionados() throws Exception {
		ArrayList<EstadoServicio> estadoserviciosSeleccionados=new ArrayList<EstadoServicio>();		
		
		estadoserviciosSeleccionados=this.getEstadoServiciosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoservicio.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadoservicios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadoservicio");
			//elementRoot.appendChild(element);
		
			for(EstadoServicio estadoservicioAux:estadoserviciosSeleccionados) {
				element = document.createElement("estadoservicio");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoServicio(estadoservicioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Servicio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoServicio(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoServicioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoServicioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoServicioConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoServicioConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoServicioConstantesFunciones.LABEL_ESDEFECTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoServicio(EstadoServicio estadoservicio,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadoservicio.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoservicio.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoservicio.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoservicio.getes_defecto());				
	}
	
	public void setFilaDatosExportarXmlEstadoServicio(EstadoServicio estadoservicio,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoServicioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadoservicio.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoServicioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadoservicio.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoServicioConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadoservicio.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoServicioConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadoservicio.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementes_defecto = document.createElement(EstadoServicioConstantesFunciones.ESDEFECTO);
		elementes_defecto.appendChild(document.createTextNode(estadoservicio.getes_defecto().toString().trim()));
		element.appendChild(elementes_defecto);
	}
	
	public void generarReporteGroupGenericoEstadoServiciosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoServicio> estadoserviciosSeleccionados=new ArrayList<EstadoServicio>();
		
		estadoserviciosSeleccionados=this.getEstadoServiciosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoServicio(estadoserviciosSeleccionados);
		
		this.generarReporteEstadoServicios("Todos",estadoserviciosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoServicio(ArrayList<EstadoServicio> estadoserviciosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoServicio estadoservicioAux:estadoserviciosSeleccionados) {
				estadoservicioAux.setsDetalleGeneralEntityReporte(estadoservicioAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoServicioConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadoservicioAux.setsDescripcionGeneralEntityReporte1(estadoservicioAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoServicioConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadoservicioAux.setsDescripcionGeneralEntityReporte1(estadoservicioAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(EstadoServicioConstantesFunciones.LABEL_ESDEFECTO)) {
					existe=true;
					estadoservicioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(estadoservicioAux.getes_defecto()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoServicio(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoServicio=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoServicio=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoServicio=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoServicio=false;
			this.isVisibilidadCeldaActualizarEstadoServicio=false;
			this.isVisibilidadCeldaEliminarEstadoServicio=false;
			this.isVisibilidadCeldaCancelarEstadoServicio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoServicio=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoServicio=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoServicio=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoServicio=false;
			this.isVisibilidadCeldaModificarEstadoServicio=false;
			this.isVisibilidadCeldaActualizarEstadoServicio=true;
			this.isVisibilidadCeldaEliminarEstadoServicio=false;
			this.isVisibilidadCeldaCancelarEstadoServicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoServicio=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoServicio=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoServicio=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoServicio=false;
			this.isVisibilidadCeldaModificarEstadoServicio=false;
			this.isVisibilidadCeldaActualizarEstadoServicio=true;
			this.isVisibilidadCeldaEliminarEstadoServicio=true;
			this.isVisibilidadCeldaCancelarEstadoServicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoServicio=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoServicio=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoServicio=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoServicio=false;
			this.isVisibilidadCeldaModificarEstadoServicio=false;
			this.isVisibilidadCeldaActualizarEstadoServicio=true;
			this.isVisibilidadCeldaEliminarEstadoServicio=false;
			this.isVisibilidadCeldaCancelarEstadoServicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoServicio=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoServicio=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoServicio=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoServicio=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoServicio=true;
			this.isVisibilidadCeldaModificarEstadoServicio=false;
			this.isVisibilidadCeldaActualizarEstadoServicio=false;
			this.isVisibilidadCeldaEliminarEstadoServicio=false;
			this.isVisibilidadCeldaCancelarEstadoServicio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoServicio=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoServicio=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoServicio=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoServicio=false;
			this.isVisibilidadCeldaActualizarEstadoServicio=false;
			this.isVisibilidadCeldaEliminarEstadoServicio=false;
			this.isVisibilidadCeldaCancelarEstadoServicio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoServicio=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoServicio=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoServicio=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoServicio=false;
			this.isVisibilidadCeldaModificarEstadoServicio=true;
			this.isVisibilidadCeldaActualizarEstadoServicio=false;
			this.isVisibilidadCeldaEliminarEstadoServicio=false;
			this.isVisibilidadCeldaCancelarEstadoServicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoServicio=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoServicio=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoServicioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoServicio=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoServicio=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoServicio=true;
		} else {
			this.actualizarEstadoPanelsEstadoServicio(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoServicio=false;
			//this.isVisibilidadCeldaVerFormEstadoServicio=false;
			this.isVisibilidadCeldaDuplicarEstadoServicio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadoservicioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoServicio=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoServicio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadoservicioSessionBean.getEsGuardarRelacionado()) {
			if(!estadoservicioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoServicio=false;												
			}
			
			this.jButtonCerrarEstadoServicio.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoServicio=false;
		}
		
		if(!this.permiteMantenimiento(this.estadoservicio)) {
			this.isVisibilidadCeldaActualizarEstadoServicio=false;
			this.isVisibilidadCeldaEliminarEstadoServicio=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoServicio() {
	}
	
	public void actualizarEstadoPanelsEstadoServicio(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoServicio!=null) {
				this.jScrollPanelDatosEdicionEstadoServicio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoServicio!=null) {
				this.jScrollPanelDatosEstadoServicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoServicio!=null) {
				this.jPanelPaginacionEstadoServicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoServicio!=null) {
				this.jPanelParametrosReportesEstadoServicio.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoServicio!=null) {
				this.jScrollPanelDatosEdicionEstadoServicio.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoServicio!=null) {
				this.jScrollPanelDatosEstadoServicio.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoServicio!=null) {
				this.jPanelPaginacionEstadoServicio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoServicio!=null) {
				this.jPanelParametrosReportesEstadoServicio.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoServicio!=null) {
				this.jScrollPanelDatosEdicionEstadoServicio.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoServicio!=null) {
				this.jScrollPanelDatosEstadoServicio.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoServicio!=null) {
				this.jPanelPaginacionEstadoServicio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoServicio!=null) {
				this.jPanelParametrosReportesEstadoServicio.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoServicio!=null) {
				this.jScrollPanelDatosEdicionEstadoServicio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoServicio!=null) {
				this.jScrollPanelDatosEstadoServicio.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoServicio!=null) {
				this.jPanelPaginacionEstadoServicio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoServicio!=null) {
				this.jPanelParametrosReportesEstadoServicio.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoServicio!=null) {
				this.jScrollPanelDatosEdicionEstadoServicio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoServicio!=null) {
				this.jScrollPanelDatosEstadoServicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoServicio!=null) {
				this.jPanelPaginacionEstadoServicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoServicio!=null) {
				this.jPanelParametrosReportesEstadoServicio.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoServicio!=null) {
				this.jScrollPanelDatosEdicionEstadoServicio.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoServicio!=null) {
				this.jScrollPanelDatosEstadoServicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoServicio!=null) {
				this.jPanelPaginacionEstadoServicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoServicio!=null) {
				this.jPanelParametrosReportesEstadoServicio.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoServicio!=null) {
				this.jScrollPanelDatosEdicionEstadoServicio.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoServicio!=null) {
				this.jScrollPanelDatosEstadoServicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoServicio!=null) {
				this.jPanelPaginacionEstadoServicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoServicio!=null) {
				this.jPanelParametrosReportesEstadoServicio.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoServicioSessionBean estadoservicioSessionBean=new EstadoServicioSessionBean();
		
		if(this.estadoservicioSessionBean==null) {
			this.estadoservicioSessionBean=new EstadoServicioSessionBean();
		}
		
		this.estadoservicioSessionBean.setsUltimaBusquedaEstadoServicio(this.getsAccionBusqueda());
		this.estadoservicioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadoservicioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoServicioSessionBean estadoservicioSessionBean=new EstadoServicioSessionBean();
		
		if(this.estadoservicioSessionBean==null) {
			this.estadoservicioSessionBean=new EstadoServicioSessionBean();
		}
		
		if(this.estadoservicioSessionBean.getsUltimaBusquedaEstadoServicio()!=null&&!this.estadoservicioSessionBean.getsUltimaBusquedaEstadoServicio().equals("")) {
			this.setsAccionBusqueda(estadoservicioSessionBean.getsUltimaBusquedaEstadoServicio());
			this.setiNumeroPaginacion(estadoservicioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadoservicioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadoservicioSessionBean.setsUltimaBusquedaEstadoServicio("");
		this.estadoservicioSessionBean.setiNumeroPaginacion(EstadoServicioConstantesFunciones.INUMEROPAGINACION);
		this.estadoservicioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoServicio(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoServicio() {
		this.updateBorderResaltarBusquedasFormularioEstadoServicio();
		this.updateVisibilidadBusquedasFormularioEstadoServicio();
		this.updateHabilitarBusquedasFormularioEstadoServicio();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoServicio() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoServicio() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoServicio() {
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
	
	public void updateControlesFormularioEstadoServicio() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoServicio==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoServicio();
		this.updateVisibilidadResaltarControlesFormularioEstadoServicio();
		this.updateHabilitarResaltarControlesFormularioEstadoServicio();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoServicio() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoServicio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadoservicioConstantesFunciones.resaltaridEstadoServicio!=null && this.jInternalFrameDetalleFormEstadoServicio!=null) {this.jInternalFrameDetalleFormEstadoServicio.jTextFieldidEstadoServicio.setBorder(this.estadoservicioConstantesFunciones.resaltaridEstadoServicio);}
		if(this.estadoservicioConstantesFunciones.resaltarcodigoEstadoServicio!=null && this.jInternalFrameDetalleFormEstadoServicio!=null) {this.jInternalFrameDetalleFormEstadoServicio.jTextFieldcodigoEstadoServicio.setBorder(this.estadoservicioConstantesFunciones.resaltarcodigoEstadoServicio);}
		if(this.estadoservicioConstantesFunciones.resaltarnombreEstadoServicio!=null && this.jInternalFrameDetalleFormEstadoServicio!=null) {this.jInternalFrameDetalleFormEstadoServicio.jTextFieldnombreEstadoServicio.setBorder(this.estadoservicioConstantesFunciones.resaltarnombreEstadoServicio);}
		if(this.estadoservicioConstantesFunciones.resaltares_defectoEstadoServicio!=null && this.jInternalFrameDetalleFormEstadoServicio!=null) {this.jInternalFrameDetalleFormEstadoServicio.jCheckBoxes_defectoEstadoServicio.setBorderPainted(true);this.jInternalFrameDetalleFormEstadoServicio.jCheckBoxes_defectoEstadoServicio.setBorder(this.estadoservicioConstantesFunciones.resaltares_defectoEstadoServicio);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoServicio() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoServicio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
	
		//this.jInternalFrameDetalleFormEstadoServicio.jTextFieldidEstadoServicio.setVisible(this.estadoservicioConstantesFunciones.mostraridEstadoServicio);
		this.jInternalFrameDetalleFormEstadoServicio.jPanelidEstadoServicio.setVisible(this.estadoservicioConstantesFunciones.mostraridEstadoServicio);
		//this.jInternalFrameDetalleFormEstadoServicio.jTextFieldcodigoEstadoServicio.setVisible(this.estadoservicioConstantesFunciones.mostrarcodigoEstadoServicio);
		this.jInternalFrameDetalleFormEstadoServicio.jPanelcodigoEstadoServicio.setVisible(this.estadoservicioConstantesFunciones.mostrarcodigoEstadoServicio);
		//this.jInternalFrameDetalleFormEstadoServicio.jTextFieldnombreEstadoServicio.setVisible(this.estadoservicioConstantesFunciones.mostrarnombreEstadoServicio);
		this.jInternalFrameDetalleFormEstadoServicio.jPanelnombreEstadoServicio.setVisible(this.estadoservicioConstantesFunciones.mostrarnombreEstadoServicio);
		//this.jInternalFrameDetalleFormEstadoServicio.jCheckBoxes_defectoEstadoServicio.setVisible(this.estadoservicioConstantesFunciones.mostrares_defectoEstadoServicio);
		this.jInternalFrameDetalleFormEstadoServicio.jPaneles_defectoEstadoServicio.setVisible(this.estadoservicioConstantesFunciones.mostrares_defectoEstadoServicio);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoServicio() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoServicio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoServicio!=null) {
	
		this.jInternalFrameDetalleFormEstadoServicio.jTextFieldidEstadoServicio.setEnabled(this.estadoservicioConstantesFunciones.activaridEstadoServicio);
		this.jInternalFrameDetalleFormEstadoServicio.jTextFieldcodigoEstadoServicio.setEnabled(this.estadoservicioConstantesFunciones.activarcodigoEstadoServicio);
		this.jInternalFrameDetalleFormEstadoServicio.jTextFieldnombreEstadoServicio.setEnabled(this.estadoservicioConstantesFunciones.activarnombreEstadoServicio);
		this.jInternalFrameDetalleFormEstadoServicio.jCheckBoxes_defectoEstadoServicio.setEnabled(this.estadoservicioConstantesFunciones.activares_defectoEstadoServicio);
		}
	}
	
		
}